package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxd implements zzwp {

    /* renamed from: a, reason: collision with root package name */
    public final zzws f354113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f354114b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f354115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f354116d;

    public zzxd(zzws zzwsVar, String str, Object[] objArr) {
        this.f354113a = zzwsVar;
        this.f354114b = str;
        this.f354115c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f354116d = cCharAt;
            return;
        }
        int i12 = cCharAt & 8191;
        int i13 = 13;
        int i14 = 1;
        while (true) {
            int i15 = i14 + 1;
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 55296) {
                this.f354116d = i12 | (cCharAt2 << i13);
                return;
            } else {
                i12 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i14 = i15;
            }
        }
    }

    public final String a() {
        return this.f354114b;
    }

    public final Object[] b() {
        return this.f354115c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwp
    public final zzws zza() {
        return this.f354113a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwp
    public final boolean zzb() {
        return (this.f354116d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwp
    public final int zzc() {
        int i12 = this.f354116d;
        if ((i12 & 1) != 0) {
            return 1;
        }
        return (i12 & 4) == 4 ? 3 : 2;
    }
}
