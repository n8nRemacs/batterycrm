package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes7.dex */
public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 1000;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 7;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 6;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new a();
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 9002;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 9000;
    public static final int RESOLUTION_REQUIRED = 9001;
    public static final int RESTRICTED_PROFILE = 9003;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UNSUPPORTED = 21;
    public static final int SERVICE_UPDATING = 9004;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 9005;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    /* renamed from: a, reason: collision with root package name */
    private int f363260a;

    /* renamed from: b, reason: collision with root package name */
    private PendingIntent f363261b;

    /* renamed from: c, reason: collision with root package name */
    private String f363262c;

    /* renamed from: d, reason: collision with root package name */
    private int f363263d;

    public static class a implements Parcelable.Creator<ConnectionResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult[] newArray(int i12) {
            return new ConnectionResult[i12];
        }
    }

    public /* synthetic */ ConnectionResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static String a(int i12) {
        if (i12 == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i12 == 0) {
            return "SUCCESS";
        }
        if (i12 == 1) {
            return "SERVICE_MISSING";
        }
        if (i12 == 2) {
            return "SERVICE_VERSION_UPDATE_REQUIRED";
        }
        if (i12 == 3) {
            return "SERVICE_DISABLED";
        }
        if (i12 == 13) {
            return "CANCELED";
        }
        if (i12 == 14) {
            return "TIMEOUT";
        }
        if (i12 == 19) {
            return "SERVICE_MISSING_PERMISSION";
        }
        if (i12 == 21) {
            return "API_VERSION_UPDATE_REQUIRED";
        }
        switch (i12) {
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
                return G.e(i12, "UNKNOWN_ERROR_CODE(", ")");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if ((obj instanceof ConnectionResult) && this.f363260a == ((ConnectionResult) obj).f363260a && this.f363263d == ((ConnectionResult) obj).f363263d && this.f363262c.equals(((ConnectionResult) obj).f363262c)) {
                if (this.f363261b.equals(((ConnectionResult) obj).f363261b)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public int getErrorCode() {
        return this.f363263d;
    }

    public final String getErrorMessage() {
        return this.f363262c;
    }

    public final PendingIntent getResolution() {
        return this.f363261b;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.f363263d, this.f363261b);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f363260a), Long.valueOf(getErrorCode()), getErrorMessage(), this.f363261b);
    }

    public final boolean isSuccess() {
        return this.f363263d == 0;
    }

    public final void startResolutionForResult(Activity activity, int i12) {
        if (hasResolution()) {
            HuaweiApiAvailability.getInstance().resolveError(activity, this.f363263d, i12, this.f363261b);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f363260a);
        parcel.writeInt(this.f363263d);
        parcel.writeString(this.f363262c);
        this.f363261b.writeToParcel(parcel, i12);
    }

    public ConnectionResult(int i12, int i13, PendingIntent pendingIntent, String str) {
        this.f363260a = i12;
        this.f363263d = i13;
        this.f363261b = pendingIntent;
        this.f363262c = str;
    }

    public ConnectionResult(int i12) {
        this(i12, (PendingIntent) null);
    }

    public ConnectionResult(int i12, PendingIntent pendingIntent) {
        this(i12, pendingIntent, null);
    }

    public ConnectionResult(int i12, PendingIntent pendingIntent, String str) {
        this(1, i12, pendingIntent, str);
    }

    private ConnectionResult(Parcel parcel) {
        this.f363260a = 1;
        this.f363261b = null;
        this.f363262c = null;
        this.f363260a = parcel.readInt();
        this.f363263d = parcel.readInt();
        this.f363262c = parcel.readString();
        Parcelable parcelable = (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel);
        if (parcelable != null) {
            this.f363261b = (PendingIntent) parcelable;
        }
    }
}
