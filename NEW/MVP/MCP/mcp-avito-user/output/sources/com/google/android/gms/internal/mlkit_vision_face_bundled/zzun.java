package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzun extends zzup {

    /* renamed from: a, reason: collision with root package name */
    public int f354030a;

    /* renamed from: b, reason: collision with root package name */
    public int f354031b;

    /* renamed from: c, reason: collision with root package name */
    public int f354032c;

    public /* synthetic */ zzun(byte[] bArr, int i12, int i13, boolean z12, zzum zzumVar) {
        super(null);
        this.f354032c = Integer.MAX_VALUE;
        this.f354030a = 0;
    }

    public final int zza(int i12) {
        int i13 = this.f354032c;
        this.f354032c = 0;
        int i14 = this.f354030a + this.f354031b;
        this.f354030a = i14;
        if (i14 > 0) {
            this.f354031b = i14;
            this.f354030a = 0;
        } else {
            this.f354031b = 0;
        }
        return i13;
    }
}
