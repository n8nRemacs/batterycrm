package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwj implements zzwq {

    /* renamed from: a, reason: collision with root package name */
    public final zzwq[] f354081a;

    public zzwj(zzwq... zzwqVarArr) {
        this.f354081a = zzwqVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwq
    public final zzwp zzb(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            zzwq zzwqVar = this.f354081a[i12];
            if (zzwqVar.zzc(cls)) {
                return zzwqVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwq
    public final boolean zzc(Class cls) {
        for (int i12 = 0; i12 < 2; i12++) {
            if (this.f354081a[i12].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
