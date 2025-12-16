package com.google.android.gms.internal.common;

import I41.a;
import aZ0.InterfaceC19845a;
import aZ0.e;
import aZ0.f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
@f
/* loaded from: classes6.dex */
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f350225b = new Object[0];

    @InterfaceC19845a
    public void a(Object[] objArr) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @e
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @e
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int d() {
        throw null;
    }

    public abstract boolean e();

    @a
    public Object[] g() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @e
    @Deprecated
    public final boolean remove(@a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @e
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    @e
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f350225b);
    }

    public zzag zzd() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract zzaj iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return Arrays.copyOfRange(objArrG, d(), b(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr);
        return objArr;
    }
}
