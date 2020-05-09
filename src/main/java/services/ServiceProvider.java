package services;

import services.implementation.ArtistServiceImpl;
import services.implementation.BarServiceImpl;
import services.implementation.EventServiceImpl;
import services.implementation.UserServiceImpl;

public final class ServiceProvider {
    private static final FileSystemManager fileSystemManager = new FileSystemManager();
    private static final UserService userService = new UserServiceImpl();
    private static final BarService barService = new BarServiceImpl();
    private static final ArtistService artistService = new ArtistServiceImpl();
    private static final EventService eventService = new EventServiceImpl();

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

    public static EventService getEventService() { return eventService; }
}
