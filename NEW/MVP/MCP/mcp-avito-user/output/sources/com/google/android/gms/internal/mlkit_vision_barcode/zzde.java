package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzde implements zzdj {

    /* renamed from: A, reason: collision with root package name */
    public final int f351839A;

    /* renamed from: B, reason: collision with root package name */
    public final zzdi f351840B;

    public zzde(int i12, zzdi zzdiVar) {
        this.f351839A = i12;
        this.f351840B = zzdiVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzdj.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdjVar = (zzdj) obj;
        return this.f351839A == zzdjVar.zza() && this.f351840B.equals(zzdjVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f351839A ^ 14552422) + (this.f351840B.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f351839A + "intEncoding=" + this.f351840B + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final int zza() {
        return this.f351839A;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final zzdi zzb() {
        return this.f351840B;
    }
}
