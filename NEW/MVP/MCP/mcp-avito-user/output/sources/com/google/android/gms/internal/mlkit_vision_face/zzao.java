package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
class zzao extends zzam implements List {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzap f352961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, Object obj, @a List list, zzao zzaoVar) {
        super(zzapVar, obj, list, zzaoVar);
        this.f352961g = zzapVar;
    }

    @Override // java.util.List
    public final void add(int i12, Object obj) {
        zzb();
        boolean zIsEmpty = this.f352956c.isEmpty();
        ((List) this.f352956c).add(i12, obj);
        this.f352961g.f352963e++;
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f352956c).addAll(i12, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f352961g.f352963e += this.f352956c.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzb();
        return ((List) this.f352956c).get(i12);
    }

    @Override // java.util.List
    public final int indexOf(@a Object obj) {
        zzb();
        return ((List) this.f352956c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@a Object obj) {
        zzb();
        return ((List) this.f352956c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzan(this);
    }

    @Override // java.util.List
    public final Object remove(int i12) {
        zzb();
        Object objRemove = ((List) this.f352956c).remove(i12);
        zzap zzapVar = this.f352961g;
        zzapVar.f352963e--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i12, Object obj) {
        zzb();
        return ((List) this.f352956c).set(i12, obj);
    }

    @Override // java.util.List
    public final List subList(int i12, int i13) {
        zzb();
        List listSubList = ((List) this.f352956c).subList(i12, i13);
        zzao zzaoVar = this.f352957d;
        if (zzaoVar == null) {
            zzaoVar = this;
        }
        zzap zzapVar = this.f352961g;
        zzapVar.getClass();
        boolean z12 = listSubList instanceof RandomAccess;
        Object obj = this.f352955b;
        return z12 ? new zzak(zzapVar, obj, listSubList, zzaoVar) : new zzao(zzapVar, obj, listSubList, zzaoVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i12) {
        zzb();
        return new zzan(this, i12);
    }
}
