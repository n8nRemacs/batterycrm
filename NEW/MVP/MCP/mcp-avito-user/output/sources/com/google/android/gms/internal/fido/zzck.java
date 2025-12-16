package com.google.android.gms.internal.fido;

import I41.a;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public abstract class zzck extends zzcf implements NavigableSet, zzda {

    /* renamed from: d, reason: collision with root package name */
    public final transient Comparator f350295d;

    /* renamed from: e, reason: collision with root package name */
    @a
    public transient zzck f350296e;

    public zzck(Comparator comparator) {
        this.f350295d = comparator;
    }

    public static zzcv w(Comparator comparator) {
        if (zzcq.f350299b.equals(comparator)) {
            return zzcv.f350310g;
        }
        zzdd zzddVar = zzcc.f350284c;
        return new zzcv(zzct.f350300f, comparator);
    }

    @a
    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @a
    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @a
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzcl.zza(v(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzda
    public final Comparator comparator() {
        return this.f350295d;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @a
    public Object floor(Object obj) {
        obj.getClass();
        return zzcn.zza(s(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return s(obj, false);
    }

    @Override // java.util.NavigableSet
    @a
    public Object higher(Object obj) {
        obj.getClass();
        return zzcl.zza(v(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @a
    public Object lower(Object obj) {
        obj.getClass();
        return zzcn.zza(s(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @a
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @a
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract zzck r();

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public abstract zzck s(Object obj, boolean z12);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract zzck t(Object obj, boolean z12, Object obj2, boolean z13);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return v(obj, true);
    }

    public abstract zzck v(Object obj, boolean z12);

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdc iterator();

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.f350296e;
        if (zzckVar != null) {
            return zzckVar;
        }
        zzck zzckVarR = r();
        this.f350296e = zzckVarR;
        zzckVarR.f350296e = this;
        return zzckVarR;
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzck subSet(Object obj, boolean z12, Object obj2, boolean z13) {
        obj.getClass();
        obj2.getClass();
        zzbm.zzc(this.f350295d.compare(obj, obj2) <= 0);
        return t(obj, z12, obj2, z13);
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzdc descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z12) {
        obj.getClass();
        return s(obj, z12);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z12) {
        obj.getClass();
        return v(obj, z12);
    }
}
