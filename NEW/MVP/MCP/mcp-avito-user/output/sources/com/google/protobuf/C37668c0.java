package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37668c0 extends AbstractC37667c<Integer> implements C37670d0.g, RandomAccess, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C37668c0 f362853e = new C37668c0(0, new int[0], false);

    /* renamed from: c, reason: collision with root package name */
    public int[] f362854c;

    /* renamed from: d, reason: collision with root package name */
    public int f362855d;

    public C37668c0() {
        this(0, new int[10], true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f362855d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362855d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int[] iArr = this.f362854c;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i12, iArr, i12 + 1, i13 - i12);
        } else {
            int[] iArr2 = new int[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            System.arraycopy(this.f362854c, i12, iArr2, i12 + 1, this.f362855d - i12);
            this.f362854c = iArr2;
        }
        this.f362854c[i12] = iIntValue;
        this.f362855d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = C37670d0.f362857a;
        collection.getClass();
        if (!(collection instanceof C37668c0)) {
            return super.addAll(collection);
        }
        C37668c0 c37668c0 = (C37668c0) collection;
        int i12 = c37668c0.f362855d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f362855d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        int[] iArr = this.f362854c;
        if (i14 > iArr.length) {
            this.f362854c = Arrays.copyOf(iArr, i14);
        }
        System.arraycopy(c37668c0.f362854c, 0, this.f362854c, this.f362855d, c37668c0.f362855d);
        this.f362855d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i12) {
        b();
        int i13 = this.f362855d;
        int[] iArr = this.f362854c;
        if (i13 == iArr.length) {
            int[] iArr2 = new int[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.f362854c = iArr2;
        }
        int[] iArr3 = this.f362854c;
        int i14 = this.f362855d;
        this.f362855d = i14 + 1;
        iArr3[i14] = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362855d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362855d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37668c0)) {
            return super.equals(obj);
        }
        C37668c0 c37668c0 = (C37668c0) obj;
        if (this.f362855d != c37668c0.f362855d) {
            return false;
        }
        int[] iArr = c37668c0.f362854c;
        for (int i12 = 0; i12 < this.f362855d; i12++) {
            if (this.f362854c[i12] != iArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        return Integer.valueOf(getInt(i12));
    }

    public final int getInt(int i12) {
        d(i12);
        return this.f362854c[i12];
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f362855d; i13++) {
            i12 = (i12 * 31) + this.f362854c[i13];
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i12 = this.f362855d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f362854c[i13] == iIntValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        int[] iArr = this.f362854c;
        int i13 = iArr[i12];
        if (i12 < this.f362855d - 1) {
            System.arraycopy(iArr, i12 + 1, iArr, i12, (r2 - i12) - 1);
        }
        this.f362855d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f362854c;
        System.arraycopy(iArr, i13, iArr, i12, this.f362855d - i13);
        this.f362855d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        d(i12);
        int[] iArr = this.f362854c;
        int i13 = iArr[i12];
        iArr[i12] = iIntValue;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362855d;
    }

    public C37668c0(int i12, int[] iArr, boolean z12) {
        super(z12);
        this.f362854c = iArr;
        this.f362855d = i12;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k<Integer> mutableCopyWithCapacity2(int i12) {
        if (i12 < this.f362855d) {
            throw new IllegalArgumentException();
        }
        return new C37668c0(this.f362855d, Arrays.copyOf(this.f362854c, i12), true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
