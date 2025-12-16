package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzbb extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f351769b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f351770c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public final zzbd f351771d;

    /* renamed from: e, reason: collision with root package name */
    @a
    public final Collection f351772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzbe f351773f;

    public zzbb(zzbe zzbeVar, Object obj, @a List list, zzbd zzbdVar) {
        this.f351773f = zzbeVar;
        this.f351769b = obj;
        this.f351770c = list;
        this.f351771d = zzbdVar;
        this.f351772e = zzbdVar == null ? null : zzbdVar.f351770c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f351770c.isEmpty();
        boolean zAdd = this.f351770c.add(obj);
        if (zAdd) {
            this.f351773f.f351777e++;
            if (zIsEmpty) {
                b();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f351770c.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f351773f.f351777e += this.f351770c.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    public final void b() {
        zzbd zzbdVar = this.f351771d;
        if (zzbdVar != null) {
            zzbdVar.b();
        } else {
            this.f351773f.f351776d.put(this.f351769b, this.f351770c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f351770c.clear();
        this.f351773f.f351777e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        zzb();
        return this.f351770c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f351770c.containsAll(collection);
    }

    public final void d() {
        zzbd zzbdVar = this.f351771d;
        if (zzbdVar != null) {
            zzbdVar.d();
        } else if (this.f351770c.isEmpty()) {
            this.f351773f.f351776d.remove(this.f351769b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f351770c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f351770c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzba(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@a Object obj) {
        zzb();
        boolean zRemove = this.f351770c.remove(obj);
        if (zRemove) {
            zzbe zzbeVar = this.f351773f;
            zzbeVar.f351777e--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f351770c.removeAll(collection);
        if (zRemoveAll) {
            this.f351773f.f351777e += this.f351770c.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f351770c.retainAll(collection);
        if (zRetainAll) {
            this.f351773f.f351777e += this.f351770c.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f351770c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f351770c.toString();
    }

    public final void zzb() {
        Collection collection;
        zzbd zzbdVar = this.f351771d;
        if (zzbdVar != null) {
            zzbdVar.zzb();
            if (zzbdVar.f351770c != this.f351772e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f351770c.isEmpty() || (collection = (Collection) this.f351773f.f351776d.get(this.f351769b)) == null) {
                return;
            }
            this.f351770c = collection;
        }
    }
}
