package dependency_inversion;

import utils.JSONUtils;

/**
 * @author mferrufino
 */
class MysqlCredentials extends DBCredentials{
    private String mysqlUrl;
    private boolean sshEnabled;

    MysqlCredentials(JSONUtils envReader) {
//        def mysqlCredentials = envReader.getJsonObjectMain().get(UtilConstants.MYSQL_CREDENTIALS)
//        initFields(mysqlCredentials);
    }

//    private void initFields(def mysqlCredentials) {
    private void initFields() {
//        setMysqlUrl(mysqlCredentials[UtilConstants.MYSQL_URL].toString())
//        setInternalHost(mysqlCredentials[UtilConstants.MYSQL_HOST].toString())
//        setRemoteHost(mysqlCredentials[UtilConstants.MYSQL_SSH_REMOTE_HOST].toString())
//        setUserName(mysqlCredentials[UtilConstants.MYSQL_USER_NAME].toString())
//        setPassword(mysqlCredentials[UtilConstants.MYSQL_PASSWORD].toString())
//        setSshEnabled((boolean) mysqlCredentials[UtilConstants.MYSQL_SSH])
    }

    boolean isSSHEnabled() {
        return sshEnabled;
    }
}