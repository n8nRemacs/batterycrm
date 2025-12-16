package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class es3 extends l4 {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public static final es3 o = new es3(0);
    public static final Parcelable.Creator<es3> CREATOR = new wci(16);

    public es3(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return "TIMEOUT";
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case LangUtils.HASH_SEED /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return wy1.e(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof es3)) {
            return false;
        }
        es3 es3Var = (es3) obj;
        return this.b == es3Var.b && syi.c(this.c, es3Var.c) && syi.c(this.d, es3Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(b(this.b), "statusCode");
        h79Var.t(this.c, "resolution");
        h79Var.t(this.d, "message");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.f(parcel, 3, this.c, i);
        a9j.g(parcel, 4, this.d);
        a9j.l(parcel, iK);
    }

    public es3(int i) {
        this(1, i, null, null);
    }

    public es3(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
