package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzam extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f352955b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f352956c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public final zzao f352957d;

    /* renamed from: e, reason: collision with root package name */
    @a
    public final Collection f352958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzap f352959f;

    public zzam(zzap zzapVar, Object obj, @a List list, zzao zzaoVar) {
        this.f352959f = zzapVar;
        this.f352955b = obj;
        this.f352956c = list;
        this.f352957d = zzaoVar;
        this.f352958e = zzaoVar == null ? null : zzaoVar.f352956c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f352956c.isEmpty();
        boolean zAdd = this.f352956c.add(obj);
        if (zAdd) {
            this.f352959f.f352963e++;
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
        boolean zAddAll = this.f352956c.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f352959f.f352963e += this.f352956c.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    public final void b() {
        zzao zzaoVar = this.f352957d;
        if (zzaoVar != null) {
            zzaoVar.b();
        } else {
            this.f352959f.f352962d.put(this.f352955b, this.f352956c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f352956c.clear();
        this.f352959f.f352963e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        zzb();
        return this.f352956c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f352956c.containsAll(collection);
    }

    public final void d() {
        zzao zzaoVar = this.f352957d;
        if (zzaoVar != null) {
            zzaoVar.d();
        } else if (this.f352956c.isEmpty()) {
            this.f352959f.f352962d.remove(this.f352955b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f352956c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f352956c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzal(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@a Object obj) {
        zzb();
        boolean zRemove = this.f352956c.remove(obj);
        if (zRemove) {
            zzap zzapVar = this.f352959f;
            zzapVar.f352963e--;
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
        boolean zRemoveAll = this.f352956c.removeAll(collection);
        if (zRemoveAll) {
            this.f352959f.f352963e += this.f352956c.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f352956c.retainAll(collection);
        if (zRetainAll) {
            this.f352959f.f352963e += this.f352956c.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f352956c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f352956c.toString();
    }

    public final void zzb() {
        Collection collection;
        zzao zzaoVar = this.f352957d;
        if (zzaoVar != null) {
            zzaoVar.zzb();
            if (zzaoVar.f352956c != this.f352958e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f352956c.isEmpty() || (collection = (Collection) this.f352959f.f352962d.get(this.f352955b)) == null) {
                return;
            }
            this.f352956c = collection;
        }
    }
}
