package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcp implements zzcu {

    /* renamed from: A, reason: collision with root package name */
    public final int f353025A;

    /* renamed from: B, reason: collision with root package name */
    public final zzct f353026B;

    public zzcp(int i12, zzct zzctVar) {
        this.f353025A = i12;
        this.f353026B = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcu)) {
            return false;
        }
        zzcu zzcuVar = (zzcu) obj;
        return this.f353025A == zzcuVar.zza() && this.f353026B.equals(zzcuVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f353025A ^ 14552422) + (this.f353026B.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f353025A + "intEncoding=" + this.f353026B + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.f353025A;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.f353026B;
    }
}
