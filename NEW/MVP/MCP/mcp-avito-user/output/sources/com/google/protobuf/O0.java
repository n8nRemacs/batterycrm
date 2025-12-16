package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes7.dex */
final class O0<E> extends AbstractC37667c<E> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final O0<Object> f362725e = new O0<>(new Object[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public E[] f362726c;

    /* renamed from: d, reason: collision with root package name */
    public int f362727d;

    public O0() {
        this(new Object[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        b();
        int i12 = this.f362727d;
        E[] eArr = this.f362726c;
        if (i12 == eArr.length) {
            this.f362726c = (E[]) Arrays.copyOf(eArr, ((i12 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f362726c;
        int i13 = this.f362727d;
        this.f362727d = i13 + 1;
        eArr2[i13] = e12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362727d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362727d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        d(i12);
        return this.f362726c[i12];
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.f362727d) {
            return new O0(Arrays.copyOf(this.f362726c, i12), this.f362727d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final E remove(int i12) {
        b();
        d(i12);
        E[] eArr = this.f362726c;
        E e12 = eArr[i12];
        if (i12 < this.f362727d - 1) {
            System.arraycopy(eArr, i12 + 1, eArr, i12, (r2 - i12) - 1);
        }
        this.f362727d--;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        b();
        d(i12);
        E[] eArr = this.f362726c;
        E e13 = eArr[i12];
        eArr[i12] = e12;
        ((AbstractList) this).modCount++;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362727d;
    }

    public O0(E[] eArr, int i12, boolean z12) {
        super(z12);
        this.f362726c = eArr;
        this.f362727d = i12;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        int i13;
        b();
        if (i12 >= 0 && i12 <= (i13 = this.f362727d)) {
            E[] eArr = this.f362726c;
            if (i13 < eArr.length) {
                System.arraycopy(eArr, i12, eArr, i12 + 1, i13 - i12);
            } else {
                E[] eArr2 = (E[]) new Object[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i12);
                System.arraycopy(this.f362726c, i12, eArr2, i12 + 1, this.f362727d - i12);
                this.f362726c = eArr2;
            }
            this.f362726c[i12] = e12;
            this.f362727d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
        sbJ.append(this.f362727d);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
