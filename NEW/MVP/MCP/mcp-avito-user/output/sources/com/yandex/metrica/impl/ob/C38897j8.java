package com.yandex.metrica.impl.ob;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.C39078qf;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.X7;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.j8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38897j8 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f380847a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b, reason: collision with root package name */
    private static final N7 f380848b;

    /* renamed from: c, reason: collision with root package name */
    private static final P7 f380849c;

    /* renamed from: d, reason: collision with root package name */
    private static final M7 f380850d;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f380851a = A2.a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$a, reason: collision with other inner class name */
        public interface InterfaceC10959a {

            /* renamed from: a, reason: collision with root package name */
            public static final String f380852a;

            /* renamed from: b, reason: collision with root package name */
            public static final String f380853b;

            static {
                Locale locale = Locale.US;
                f380852a = "CREATE TABLE IF NOT EXISTS lbs_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                f380853b = "DROP TABLE IF EXISTS lbs_dat";
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.j8$a$b */
        public interface b {

            /* renamed from: a, reason: collision with root package name */
            public static final String f380854a;

            /* renamed from: b, reason: collision with root package name */
            public static final String f380855b;

            static {
                Locale locale = Locale.US;
                f380854a = "CREATE TABLE IF NOT EXISTS l_dat (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)";
                f380855b = "DROP TABLE IF EXISTS l_dat";
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f380856a = A2.a("data_key", "value");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$c */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f380857a = A2.a("key", "value", "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f380858a = A2.a("id", "number", "global_number", "number_of_type", "name", "value", "type", CrashHianalyticsData.TIME, "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", SearchParamsConverterKt.SOURCE, "attribution_id_changed", "open_id", "extras");

        /* renamed from: b, reason: collision with root package name */
        public static final String f380859b;

        static {
            StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
            sb2.append(EnumC38796f6.FOREGROUND.a());
            sb2.append(",app_environment TEXT DEFAULT '{}',app_environment_revision INTEGER DEFAULT 0,truncated INTEGER DEFAULT 0,connection_type INTEGER DEFAULT 2,cellular_connection_type TEXT,custom_type INTEGER DEFAULT 0, wifi_access_point TEXT, encrypting_mode INTEGER DEFAULT ");
            sb2.append(Em.NONE.a());
            sb2.append(", profile_id TEXT, first_occurrence_status INTEGER DEFAULT 0, battery_charge_type INTEGER DEFAULT ");
            sb2.append(E.b.a.UNKNOWN.a());
            sb2.append(", collection_mode TEXT, has_omitted_data INTEGER DEFAULT -1, call_state INTEGER DEFAULT 0, source INTEGER DEFAULT 0, attribution_id_changed INTEGER DEFAULT 0, open_id INTEGER DEFAULT ");
            f380859b = AK.c.j(new C39078qf.d.a().f381555w, ", extras BLOB )", sb2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j8$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f380860a = A2.a("id", "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b, reason: collision with root package name */
        public static final String f380861b = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT " + EnumC38796f6.FOREGROUND.a() + ",obtained_before_first_sync INTEGER DEFAULT 0 )";

        /* renamed from: c, reason: collision with root package name */
        public static final String f380862c = String.format(Locale.US, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "reports", "session_id", "session_type");

        /* renamed from: d, reason: collision with root package name */
        public static final String f380863d = "(select count(reports.id) from reports where reports.session_id = sessions.id) = 0 and cast(id as integer) < ?";
    }

    static {
        N7 n72 = new N7();
        f380848b = n72;
        P7 p72 = new P7();
        f380849c = p72;
        f380850d = new M7(n72, p72, new X7.b());
    }

    public static M7 a() {
        return f380850d;
    }
}
