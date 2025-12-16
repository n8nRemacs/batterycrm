package defpackage;

import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class utb {
    public static final boolean a(int i) {
        return i == 4 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(wy1.e(i, "unknown value ", " for PhoneType"));
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "HUAWEI";
        }
        if (i == 2) {
            return "GCM";
        }
        if (i == 3) {
            return "RUSTORE";
        }
        throw null;
    }

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return 11;
            case 13:
                return 12;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return 13;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 14;
            case 16:
                return 15;
            case LangUtils.HASH_SEED /* 17 */:
                return 16;
            case 18:
                return 256;
            case 19:
                return 17;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "context_menu";
        }
        if (i == 2) {
            return "reactions_bubble";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static float i(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int j(float f, float f2, int i, int i2) {
        return kti.d(f * f2) + i + i2;
    }

    public static int k(int i, int i2, int i3) {
        return (az1.v(i) + i2) * i3;
    }

    public static String l(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void n(StringBuilder sb, long j, String str, int i) {
        sb.append(j);
        sb.append(str);
        sb.append(i);
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PHONE_CONFIRM" : "PHONE_REBINDING" : "PHONE_BINDING" : "UNKNOWN";
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INVALID" : "VALID" : "UNKNOWN";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? "null" : HTTP.SERVER_HEADER : "Client";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "INTERNAL_ERROR";
            case 3:
                return "CONNECTION_REFUSED";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "STREAM_LIMIT_ERROR";
            case 6:
                return "STREAM_STATE_ERROR";
            case 7:
                return "FINAL_SIZE_ERROR";
            case 8:
                return "FRAME_ENCODING_ERROR";
            case 9:
                return "TRANSPORT_PARAMETER_ERROR";
            case 10:
                return "CONNECTION_ID_LIMIT_ERROR";
            case 11:
                return "PROTOCOL_VIOLATION";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "INVALID_TOKEN";
            case 13:
                return "APPLICATION_ERROR";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "CRYPTO_BUFFER_EXCEEDED";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "KEY_UPDATE_ERROR";
            case 16:
                return "AEAD_LIMIT_REACHED";
            case LangUtils.HASH_SEED /* 17 */:
                return "NO_VIABLE_PATH";
            case 18:
                return "CRYPTO_ERROR";
            case 19:
                return "VERSION_NEGOTIATION_ERROR";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNKNOWN")) {
            return 1;
        }
        if (str.equals("PHONE_BINDING")) {
            return 2;
        }
        if (str.equals("PHONE_REBINDING")) {
            return 3;
        }
        if (str.equals("PHONE_CONFIRM")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.base.PhoneBindTokenType.".concat(str));
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("CRASH")) {
            return 1;
        }
        if (str.equals("NON_FATAL")) {
            return 2;
        }
        if (str.equals("FATAL")) {
            return 3;
        }
        if (str.equals("ERROR")) {
            return 4;
        }
        if (str.equals("WARNING")) {
            return 5;
        }
        if (str.equals("NOTICE")) {
            return 6;
        }
        if (str.equals("INFO")) {
            return 7;
        }
        if (str.equals("DEBUG")) {
            return 8;
        }
        if (str.equals("MINIDUMP")) {
            return 9;
        }
        if (str.equals("ANR")) {
            return 10;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tracer.crash.report.ReportType.".concat(str));
    }
}
