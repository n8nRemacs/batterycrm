package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcv extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f351832d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f351833e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f351834f;

    public zzcv(Object[] objArr, int i12, int i13) {
        this.f351832d = objArr;
        this.f351833e = i12;
        this.f351834f = i13;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzaq.zza(i12, this.f351834f, "index");
        Object obj = this.f351832d[i12 + i12 + this.f351833e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f351834f;
    }
}
