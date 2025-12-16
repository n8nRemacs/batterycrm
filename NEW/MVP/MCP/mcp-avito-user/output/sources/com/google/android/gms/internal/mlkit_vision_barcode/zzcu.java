package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzcu extends zzcf {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzce f351830d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzcc f351831e;

    public zzcu(zzce zzceVar, zzcc zzccVar) {
        this.f351830d = zzceVar;
        this.f351831e = zzccVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int a(int i12, Object[] objArr) {
        return this.f351831e.a(i12, objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f351830d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f351831e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f351830d.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    /* renamed from: zzd */
    public final zzda iterator() {
        return this.f351831e.listIterator(0);
    }
}
