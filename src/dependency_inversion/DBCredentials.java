package dependency_inversion;

/**
 * @author mferrufino
 */
public abstract class DBCredentials extends Credentials {
    private String internalHost;
    private String remoteHost;

    public void setInternalHost(String internalHost) {
        this.internalHost = internalHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getInternalHost() {
        return internalHost;
    }

    public String getRemoteHost() {
        return remoteHost;
    }
}