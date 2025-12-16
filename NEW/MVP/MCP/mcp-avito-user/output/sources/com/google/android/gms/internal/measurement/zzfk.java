package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public enum zzfk implements zzjk {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* renamed from: b, reason: collision with root package name */
    public final int f350764b;

    static {
        new zzjj<zzfk>() { // from class: com.google.android.gms.internal.measurement.zzfj
        };
    }

    zzfk(int i12) {
        this.f350764b = i12;
    }

    public static zzjm zzb() {
        return zzfl.f350765a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f350764b + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int zza() {
        return this.f350764b;
    }

    public static zzfk zza(int i12) {
        if (i12 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i12 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i12 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i12 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i12 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i12 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }
}
