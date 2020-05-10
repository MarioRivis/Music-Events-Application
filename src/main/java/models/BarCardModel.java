package models;

import services.ServiceProvider;
import services.UserService;

public class BarCardModel implements FilterableModel {
    private final String barName;
    private final BarModel barModel;

    public BarCardModel(BarModel barModel) {
        this.barModel = barModel;
        UserService userService = ServiceProvider.getUserService();
        barName = userService.getUser(this.barModel.getUser_id()).getName();
    }

    public String getBarName() {
        return barName;
    }

    public BarModel getBarModel() {
        return barModel;
    }

    public boolean containsFilter(String filter) {
        return getBarName().contains(filter);
    }
}
