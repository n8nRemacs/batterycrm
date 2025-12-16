package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhr {

    /* renamed from: a, reason: collision with root package name */
    public final byte f350423a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f350424b;

    public zzhr(int i12) {
        this.f350423a = (byte) (i12 & 224);
        this.f350424b = (byte) (i12 & 31);
    }

    public final byte zza() {
        return this.f350424b;
    }

    public final byte zzb() {
        return this.f350423a;
    }

    public final int zzc() {
        return (this.f350423a >> 5) & 7;
    }
}
