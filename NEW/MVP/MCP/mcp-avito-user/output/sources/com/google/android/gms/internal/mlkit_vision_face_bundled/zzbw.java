package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbw implements zzcb {

    /* renamed from: A, reason: collision with root package name */
    public final int f353519A;

    /* renamed from: B, reason: collision with root package name */
    public final zzca f353520B;

    public zzbw(int i12, zzca zzcaVar) {
        this.f353519A = i12;
        this.f353520B = zzcaVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcb.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return false;
        }
        zzcb zzcbVar = (zzcb) obj;
        return this.f353519A == zzcbVar.zza() && this.f353520B.equals(zzcbVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f353519A ^ 14552422) + (this.f353520B.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f353519A + "intEncoding=" + this.f353520B + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzcb
    public final int zza() {
        return this.f353519A;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzcb
    public final zzca zzb() {
        return this.f353520B;
    }
}
