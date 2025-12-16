package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public class zzvi extends zzvh implements zzwt {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvh
    public final void e() {
        super.e();
        if (((zzvj) this.f354059c).zzb != zzvd.zzd()) {
            zzvj zzvjVar = (zzvj) this.f354059c;
            zzvjVar.zzb = zzvjVar.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvh, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwr
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzvj zzp() {
        if (!((zzvj) this.f354059c).g()) {
            return (zzvj) this.f354059c;
        }
        ((zzvj) this.f354059c).zzb.zzh();
        return (zzvj) super.zzp();
    }
}
