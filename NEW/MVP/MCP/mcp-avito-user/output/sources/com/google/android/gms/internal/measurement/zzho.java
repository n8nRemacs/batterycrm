package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
abstract class zzho<E> extends AbstractList<E> implements zzjn<E> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f350833b;

    public zzho() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i12, E e12) {
        b();
        super.add(i12, e12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    public final void b() {
        if (!this.f350833b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < size; i12++) {
            if (!get(i12).equals(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode = (iHashCode * 31) + get(i12).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final void i_() {
        if (this.f350833b) {
            this.f350833b = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i12) {
        b();
        return (E) super.remove(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i12, E e12) {
        b();
        return (E) super.set(i12, e12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public boolean zzc() {
        return this.f350833b;
    }

    public zzho(boolean z12) {
        this.f350833b = z12;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e12) {
        b();
        return super.add(e12);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i12, Collection<? extends E> collection) {
        b();
        return super.addAll(i12, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
