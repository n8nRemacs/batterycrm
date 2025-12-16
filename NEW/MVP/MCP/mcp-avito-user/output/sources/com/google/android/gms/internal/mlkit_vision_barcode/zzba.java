package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzba implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f351766b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f351767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbb f351768d;

    public zzba(zzbd zzbdVar, ListIterator listIterator) {
        this.f351768d = zzbdVar;
        this.f351767c = zzbdVar.f351770c;
        this.f351766b = listIterator;
    }

    public final void a() {
        zzbb zzbbVar = this.f351768d;
        zzbbVar.zzb();
        if (zzbbVar.f351770c != this.f351767c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f351766b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f351766b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f351766b.remove();
        zzbb zzbbVar = this.f351768d;
        zzbe zzbeVar = zzbbVar.f351773f;
        zzbeVar.f351777e--;
        zzbbVar.d();
    }

    public zzba(zzbb zzbbVar) {
        this.f351768d = zzbbVar;
        Collection collection = zzbbVar.f351770c;
        this.f351767c = collection;
        this.f351766b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
