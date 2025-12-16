package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcb extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f351810d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcc f351812f;

    public zzcb(zzcc zzccVar, int i12, int i13) {
        this.f351812f = zzccVar;
        this.f351810d = i12;
        this.f351811e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int b() {
        return this.f351812f.d() + this.f351810d + this.f351811e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int d() {
        return this.f351812f.d() + this.f351810d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    @a
    public final Object[] e() {
        return this.f351812f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzaq.zza(i12, this.f351811e, "index");
        return this.f351812f.get(i12 + this.f351810d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351811e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcc, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i12, int i13) {
        zzaq.zzc(i12, i13, this.f351811e);
        int i14 = this.f351810d;
        return this.f351812f.subList(i12 + i14, i13 + i14);
    }
}
