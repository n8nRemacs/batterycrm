package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzal implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f352952b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f352953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzam f352954d;

    public zzal(zzao zzaoVar, ListIterator listIterator) {
        this.f352954d = zzaoVar;
        this.f352953c = zzaoVar.f352956c;
        this.f352952b = listIterator;
    }

    public final void a() {
        zzam zzamVar = this.f352954d;
        zzamVar.zzb();
        if (zzamVar.f352956c != this.f352953c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f352952b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f352952b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f352952b.remove();
        zzam zzamVar = this.f352954d;
        zzap zzapVar = zzamVar.f352959f;
        zzapVar.f352963e--;
        zzamVar.d();
    }

    public zzal(zzam zzamVar) {
        this.f352954d = zzamVar;
        Collection collection = zzamVar.f352956c;
        this.f352953c = collection;
        this.f352952b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
