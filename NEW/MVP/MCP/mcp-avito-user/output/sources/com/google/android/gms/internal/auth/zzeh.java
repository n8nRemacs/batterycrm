package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzeh extends zzej {

    /* renamed from: a, reason: collision with root package name */
    public int f350088a;

    /* renamed from: b, reason: collision with root package name */
    public int f350089b;

    /* renamed from: c, reason: collision with root package name */
    public int f350090c;

    public /* synthetic */ zzeh(byte[] bArr, int i12, int i13, boolean z12, zzeg zzegVar) {
        super(null);
        this.f350090c = Integer.MAX_VALUE;
        this.f350088a = 0;
    }

    public final int zza(int i12) {
        int i13 = this.f350090c;
        this.f350090c = 0;
        int i14 = this.f350088a + this.f350089b;
        this.f350088a = i14;
        if (i14 > 0) {
            this.f350089b = i14;
            this.f350088a = 0;
        } else {
            this.f350089b = 0;
        }
        return i13;
    }
}
