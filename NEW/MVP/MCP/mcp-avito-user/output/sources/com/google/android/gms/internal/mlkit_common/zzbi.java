package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzbi implements zzbn {

    /* renamed from: A, reason: collision with root package name */
    public final int f351215A;

    /* renamed from: B, reason: collision with root package name */
    public final zzbm f351216B;

    public zzbi(int i12, zzbm zzbmVar) {
        this.f351215A = i12;
        this.f351216B = zzbmVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbn.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbnVar = (zzbn) obj;
        return this.f351215A == zzbnVar.zza() && this.f351216B.equals(zzbnVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f351215A ^ 14552422) + (this.f351216B.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f351215A + "intEncoding=" + this.f351216B + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbn
    public final int zza() {
        return this.f351215A;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbn
    public final zzbm zzb() {
        return this.f351216B;
    }
}
