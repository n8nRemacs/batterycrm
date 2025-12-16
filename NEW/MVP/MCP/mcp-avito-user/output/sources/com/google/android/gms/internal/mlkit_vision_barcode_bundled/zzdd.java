package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdd extends zzde {

    /* renamed from: a, reason: collision with root package name */
    public int f352405a;

    /* renamed from: b, reason: collision with root package name */
    public int f352406b;

    /* renamed from: c, reason: collision with root package name */
    public int f352407c;

    public /* synthetic */ zzdd(byte[] bArr, int i12, int i13, boolean z12, zzdc zzdcVar) {
        super(null);
        this.f352407c = Integer.MAX_VALUE;
        this.f352405a = 0;
    }

    public final int zza(int i12) {
        int i13 = this.f352407c;
        this.f352407c = 0;
        int i14 = this.f352405a + this.f352406b;
        this.f352405a = i14;
        if (i14 > 0) {
            this.f352406b = i14;
            this.f352405a = 0;
        } else {
            this.f352406b = 0;
        }
        return i13;
    }
}
