package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int SUCCESS = 0;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348859b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348860c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final PendingIntent f348861d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f348862e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    @RX0.a
    @InterfaceC36733z
    public static final ConnectionResult f348858f = new ConnectionResult(0);

    @j.N
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new B();

    @SafeParcelable.b
    public ConnectionResult(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e @j.P PendingIntent pendingIntent, @SafeParcelable.e @j.P String str) {
        this.f348859b = i12;
        this.f348860c = i13;
        this.f348861d = pendingIntent;
        this.f348862e = str;
    }

    @j.N
    public static String j(int i12) {
        if (i12 == 99) {
            return "UNFINISHED";
        }
        if (i12 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i12) {
            case -1:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
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
                switch (i12) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
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
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return androidx.camera.camera2.internal.G.e(i12, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f348860c == connectionResult.f348860c && C36727t.a(this.f348861d, connectionResult.f348861d) && C36727t.a(this.f348862e, connectionResult.f348862e);
    }

    public final boolean h() {
        return (this.f348860c == 0 || this.f348861d == null) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f348860c), this.f348861d, this.f348862e});
    }

    public final boolean i() {
        return this.f348860c == 0;
    }

    @j.N
    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(j(this.f348860c), HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        aVarB.a(this.f348861d, CommonCode.MapKey.HAS_RESOLUTION);
        aVarB.a(this.f348862e, "message");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348859b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348860c);
        TX0.a.i(parcel, 3, this.f348861d, i12, false);
        TX0.a.j(parcel, 4, this.f348862e, false);
        TX0.a.p(parcel, iO2);
    }

    public ConnectionResult(int i12) {
        this(1, i12, null, null);
    }

    public ConnectionResult(int i12, @j.P PendingIntent pendingIntent) {
        this(1, i12, pendingIntent, null);
    }
}
