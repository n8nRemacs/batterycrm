package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzgu extends AbstractList implements RandomAccess, zzev {

    /* renamed from: b, reason: collision with root package name */
    public final zzev f352541b;

    public zzgu(zzev zzevVar) {
        this.f352541b = zzevVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        return ((zzeu) this.f352541b).get(i12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgt(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i12) {
        return new zzgs(this, i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352541b.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final Object zzf(int i12) {
        return this.f352541b.zzf(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final List zzh() {
        return this.f352541b.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev
    public final zzev zze() {
        return this;
    }
}
