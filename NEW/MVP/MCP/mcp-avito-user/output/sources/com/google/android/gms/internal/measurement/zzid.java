package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzid {

    /* renamed from: a, reason: collision with root package name */
    public final zzio f350845a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f350846b;

    public zzid(int i12, zzic zzicVar) {
        byte[] bArr = new byte[i12];
        this.f350846b = bArr;
        this.f350845a = zzio.zzb(bArr);
    }

    public final zzhu zza() {
        this.f350845a.zzb();
        return new zzie(this.f350846b);
    }

    public final zzio zzb() {
        return this.f350845a;
    }
}
