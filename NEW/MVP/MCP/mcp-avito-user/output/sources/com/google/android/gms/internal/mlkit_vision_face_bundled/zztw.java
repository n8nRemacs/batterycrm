package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
abstract class zztw extends AbstractList implements zzvs {

    /* renamed from: b, reason: collision with root package name */
    public boolean f354021b;

    public zztw(boolean z12) {
        this.f354021b = z12;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i12, Object obj) {
        b();
        super.add(i12, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i12, Collection collection) {
        b();
        return super.addAll(i12, collection);
    }

    public final void b() {
        if (!this.f354021b) {
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

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i12) {
        b();
        return super.remove(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i12, Object obj) {
        b();
        return super.set(i12, obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final void zzb() {
        if (this.f354021b) {
            this.f354021b = false;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvs
    public final boolean zzc() {
        return this.f354021b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
