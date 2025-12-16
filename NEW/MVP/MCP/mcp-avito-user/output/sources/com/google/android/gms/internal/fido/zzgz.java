package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzgz extends zzhb {

    /* renamed from: a, reason: collision with root package name */
    public int f350410a;

    /* renamed from: b, reason: collision with root package name */
    public int f350411b;

    /* renamed from: c, reason: collision with root package name */
    public int f350412c;

    public /* synthetic */ zzgz(byte[] bArr, int i12, int i13, boolean z12, zzgy zzgyVar) {
        super(null);
        this.f350412c = Integer.MAX_VALUE;
        this.f350410a = 0;
    }

    public final int zza(int i12) {
        int i13 = this.f350412c;
        this.f350412c = 0;
        int i14 = this.f350410a + this.f350411b;
        this.f350410a = i14;
        if (i14 > 0) {
            this.f350411b = i14;
            this.f350410a = 0;
        } else {
            this.f350411b = 0;
        }
        return i13;
    }
}
