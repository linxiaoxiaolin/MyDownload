package com.mydownload.main;

import android.provider.BaseColumns;

final class DLCons {
    private DLCons() {
    }

    static boolean DEBUG = true;

    static final class Base {
        static final int DEFAULT_TIMEOUT = 20000;
        static final int MAX_REDIRECTS = 5;
        static final int LENGTH_PER_THREAD = 10485760;
    }

    static final class Code {
        static final int HTTP_CONTINUE = 100;
        static final int HTTP_SWITCHING_PROTOCOLS = 101;
        static final int HTTP_PROCESSING = 102;

        static final int HTTP_OK = 200;
        static final int HTTP_CREATED = 201;
        static final int HTTP_ACCEPTED = 202;
        static final int HTTP_NOT_AUTHORITATIVE = 203;
        static final int HTTP_NO_CONTENT = 204;
        static final int HTTP_RESET = 205;
        static final int HTTP_PARTIAL = 206;
        static final int HTTP_MULTI_STATUS = 207;

        static final int HTTP_MULT_CHOICE = 300;
        static final int HTTP_MOVED_PERM = 301;
        static final int HTTP_MOVED_TEMP = 302;
        static final int HTTP_SEE_OTHER = 303;
        static final int HTTP_NOT_MODIFIED = 304;
        static final int HTTP_USE_PROXY = 305;
        static final int HTTP_TEMP_REDIRECT = 307;

        static final int HTTP_BAD_REQUEST = 400;
        static final int HTTP_UNAUTHORIZED = 401;
        static final int HTTP_PAYMENT_REQUIRED = 402;
        static final int HTTP_FORBIDDEN = 403;
        static final int HTTP_NOT_FOUND = 404;
        static final int HTTP_BAD_METHOD = 405;
        static final int HTTP_NOT_ACCEPTABLE = 406;
        static final int HTTP_PROXY_AUTH = 407;
        static final int HTTP_CLIENT_TIMEOUT = 408;
        static final int HTTP_CONFLICT = 409;
        static final int HTTP_GONE = 410;
        static final int HTTP_LENGTH_REQUIRED = 411;
        static final int HTTP_PRECON_FAILED = 412;
        static final int HTTP_ENTITY_TOO_LARGE = 413;
        static final int HTTP_REQ_TOO_LONG = 414;
        static final int HTTP_UNSUPPORTED_TYPE = 415;
        static final int HTTP_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
        static final int HTTP_EXPECTATION_FAILED = 417;
        static final int HTTP_UNPROCESSABLE_ENTITY = 422;
        static final int HTTP_LOCKED = 423;
        static final int HTTP_FAILED_DEPENDENCY = 424;

        static final int HTTP_INTERNAL_ERROR = 500;
        static final int HTTP_NOT_IMPLEMENTED = 501;
        static final int HTTP_BAD_GATEWAY = 502;
        static final int HTTP_UNAVAILABLE = 503;
        static final int HTTP_GATEWAY_TIMEOUT = 504;
        static final int HTTP_VERSION = 505;
        static final int HTTP_INSUFFICIENT_STORAGE = 507;
    }

    static final class DBCons {
        public static final String TB_TASK = "task_info";
        public static final String TB_TASK_URL_BASE = "base_url";
        public static final String TB_TASK_URL_REAL = "real_url";
        public static final String TB_TASK_DIR_PATH = "file_path";
        public static final String TB_TASK_CURRENT_BYTES = "currentBytes";
        public  static final String TB_TASK_TOTAL_BYTES = "totalBytes";
        public static final String TB_TASK_FILE_NAME = "file_name";
        public static final String TB_TASK_MIME_TYPE = "mime_type";
        public static final String TB_TASK_ETAG = "e_tag";
        public static final String TB_TASK_DISPOSITION = "disposition";
        public static final String TB_TASK_LOCATION = "location";
        public static final String TB_TASK_Last_Modified = "last_modified";
        public static final String TB_TASK_STATUS= "status";
        public static final String TB_TASK_NOTIFY= "notify";
        public static final String TB_TASK_KEY= "key";
        public static final String TB_TASK_ERROR= "error";
        public static final String TB_TASK_ERROR_TIME= "error_time";

        public static final String TB_THREAD = "thread_info";
        public static final String TB_THREAD_URL_REAL = "real_url";
        public static final String TB_THREAD_START = "start";
        public static final String TB_THREAD_END = "end";
        public static final String TB_THREAD_ID = "id";

        public static final String TB_TASK_SQL_CREATE = "CREATE TABLE " +
                DBCons.TB_TASK + "(" +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DBCons.TB_TASK_FILE_NAME + " CHAR, " +
                DBCons.TB_TASK_KEY + " CHAR, " +
                DBCons.TB_TASK_URL_BASE + " CHAR, " +
                DBCons.TB_TASK_URL_REAL + " CHAR, " +
                DBCons.TB_TASK_DIR_PATH + " CHAR, " +
                DBCons.TB_TASK_MIME_TYPE + " CHAR, " +
                DBCons.TB_TASK_ETAG + " CHAR, " +
                DBCons.TB_TASK_DISPOSITION + " CHAR, " +
                DBCons.TB_TASK_LOCATION + " CHAR, " +
                DBCons.TB_TASK_Last_Modified +" CHAR, "+
                DBCons.TB_TASK_STATUS + " INTEGER, " +
                DBCons.TB_TASK_CURRENT_BYTES + " INTEGER, " +
                DBCons.TB_TASK_TOTAL_BYTES + " INTEGER,"+
                DBCons.TB_TASK_ERROR + " INTEGER, " +
                DBCons.TB_TASK_ERROR_TIME + " INTEGER, " +
                DBCons.TB_TASK_NOTIFY +" INTEGER)";
        public static final String TB_THREAD_SQL_CREATE = "CREATE TABLE " +
                DBCons.TB_THREAD + "(" +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DBCons.TB_THREAD_URL_REAL + " CHAR, " +
                DBCons.TB_THREAD_START + " INTEGER, " +
                DBCons.TB_THREAD_END + " INTEGER, " +
                DBCons.TB_THREAD_ID + " CHAR)";

        public static final String TB_TASK_SQL_UPGRADE = "DROP TABLE IF EXISTS " +
                DBCons.TB_TASK;
        public static final String TB_THREAD_SQL_UPGRADE = "DROP TABLE IF EXISTS " +
                DBCons.TB_THREAD;
    }
}