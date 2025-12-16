package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzbd extends zzbb implements List {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzbe f351775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbe zzbeVar, Object obj, @a List list, zzbd zzbdVar) {
        super(zzbeVar, obj, list, zzbdVar);
        this.f351775g = zzbeVar;
    }

    @Override // java.util.List
    public final void add(int i12, Object obj) {
        zzb();
        boolean zIsEmpty = this.f351770c.isEmpty();
        ((List) this.f351770c).add(i12, obj);
        this.f351775g.f351777e++;
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
        boolean zAddAll = ((List) this.f351770c).addAll(i12, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f351775g.f351777e += this.f351770c.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzb();
        return ((List) this.f351770c).get(i12);
    }

    @Override // java.util.List
    public final int indexOf(@a Object obj) {
        zzb();
        return ((List) this.f351770c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@a Object obj) {
        zzb();
        return ((List) this.f351770c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbc(this);
    }

    @Override // java.util.List
    public final Object remove(int i12) {
        zzb();
        Object objRemove = ((List) this.f351770c).remove(i12);
        zzbe zzbeVar = this.f351775g;
        zzbeVar.f351777e--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i12, Object obj) {
        zzb();
        return ((List) this.f351770c).set(i12, obj);
    }

    @Override // java.util.List
    public final List subList(int i12, int i13) {
        zzb();
        List listSubList = ((List) this.f351770c).subList(i12, i13);
        zzbd zzbdVar = this.f351771d;
        if (zzbdVar == null) {
            zzbdVar = this;
        }
        zzbe zzbeVar = this.f351775g;
        zzbeVar.getClass();
        boolean z12 = listSubList instanceof RandomAccess;
        Object obj = this.f351769b;
        return z12 ? new zzaz(zzbeVar, obj, listSubList, zzbdVar) : new zzbd(zzbeVar, obj, listSubList, zzbdVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i12) {
        zzb();
        return new zzbc(this, i12);
    }
}
