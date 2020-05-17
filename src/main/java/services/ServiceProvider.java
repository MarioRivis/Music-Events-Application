package services;

import services.implementation.*;

public final class ServiceProvider {
    private static final FileSystemManager fileSystemManager = new FileSystemManager(new JSONStoreStrategy());
    private static final UserService userService = new UserServiceImpl();
    private static final BarService barService = new BarServiceImpl();
    private static final ArtistService artistService = new ArtistServiceImpl();
    private static final EventService eventService = new EventServiceImpl();
    private static final ReservationService reservationService = new ReservationServiceImpl();

//    private static final UserService userService = new UserServiceImpl();
//    private static final BarService barService = new BarServiceImpl();
//    private static final ArtistService artistService = new ArtistServiceImpl();
//    private static final EventService eventService = new EventServiceImpl();
//    private static final ReservationService reservationService = new ReservationServiceImpl();

    private ServiceProvider() {
    }

    public static FileSystemManager getFileSystemManager() {
        return fileSystemManager;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static BarService getBarService() {
        return barService;
    }

    public static ArtistService getArtistService() {
        return artistService;
    }

    public static EventService getEventService() {
        return eventService;
    }

    public static ReservationService getReservationService() {
        return reservationService;
    }

    public static void setUsingMockupFileSystem(boolean usingMockupFileSystem) {
        if (usingMockupFileSystem) {
            fileSystemManager.setStoreStrategy(new MockupStoreStrategy());
        } else {
            fileSystemManager.setStoreStrategy(new JSONStoreStrategy());
        }
    }
}
