package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.es3;
import defpackage.h79;
import defpackage.ho7;
import defpackage.l4;
import defpackage.mpd;
import defpackage.syi;
import defpackage.wci;
import java.util.Arrays;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class Status extends l4 implements mpd, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final es3 d;
    public static final Status o = new Status(0, null, null, null);
    public static final Status X = new Status(14, null, null, null);
    public static final Status Y = new Status(8, null, null, null);
    public static final Status Z = new Status(15, null, null, null);
    public static final Status s0 = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new wci(17);

    public Status(int i, String str, PendingIntent pendingIntent, es3 es3Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = es3Var;
    }

    @Override // defpackage.mpd
    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && syi.c(this.b, status.b) && syi.c(this.c, status.c) && syi.c(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        String strF = this.b;
        if (strF == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    strF = "SUCCESS_CACHE";
                    break;
                case 0:
                    strF = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                default:
                    strF = ho7.f(i, "unknown status code: ");
                    break;
                case 2:
                    strF = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strF = "SERVICE_DISABLED";
                    break;
                case 4:
                    strF = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strF = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strF = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strF = "NETWORK_ERROR";
                    break;
                case 8:
                    strF = "INTERNAL_ERROR";
                    break;
                case 10:
                    strF = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strF = "ERROR";
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    strF = "INTERRUPTED";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    strF = "TIMEOUT";
                    break;
                case 16:
                    strF = "CANCELED";
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    strF = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strF = "DEAD_CLIENT";
                    break;
                case 19:
                    strF = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strF = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strF = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strF = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        h79Var.t(strF, "statusCode");
        h79Var.t(this.c, "resolution");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 2, this.b);
        a9j.f(parcel, 3, this.c, i);
        a9j.f(parcel, 4, this.d, i);
        a9j.l(parcel, iK);
    }
}
