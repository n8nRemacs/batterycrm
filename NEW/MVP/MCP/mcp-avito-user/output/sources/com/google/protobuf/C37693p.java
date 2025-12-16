package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37693p extends AbstractC37667c<Boolean> implements C37670d0.a, RandomAccess, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C37693p f362930e = new C37693p(new boolean[0], 0, false);

    /* renamed from: c, reason: collision with root package name */
    public boolean[] f362931c;

    /* renamed from: d, reason: collision with root package name */
    public int f362932d;

    public C37693p() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final void add(int i12, Object obj) {
        int i13;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i12 < 0 || i12 > (i13 = this.f362932d)) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362932d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        boolean[] zArr = this.f362931c;
        if (i13 < zArr.length) {
            System.arraycopy(zArr, i12, zArr, i12 + 1, i13 - i12);
        } else {
            boolean[] zArr2 = new boolean[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            System.arraycopy(this.f362931c, i12, zArr2, i12 + 1, this.f362932d - i12);
            this.f362931c = zArr2;
        }
        this.f362931c[i12] = zBooleanValue;
        this.f362932d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = C37670d0.f362857a;
        collection.getClass();
        if (!(collection instanceof C37693p)) {
            return super.addAll(collection);
        }
        C37693p c37693p = (C37693p) collection;
        int i12 = c37693p.f362932d;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f362932d;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        boolean[] zArr = this.f362931c;
        if (i14 > zArr.length) {
            this.f362931c = Arrays.copyOf(zArr, i14);
        }
        System.arraycopy(c37693p.f362931c, 0, this.f362931c, this.f362932d, c37693p.f362932d);
        this.f362932d = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z12) {
        b();
        int i12 = this.f362932d;
        boolean[] zArr = this.f362931c;
        if (i12 == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.compose.ui.graphics.colorspace.e.e(i12, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i12);
            this.f362931c = zArr2;
        }
        boolean[] zArr3 = this.f362931c;
        int i13 = this.f362932d;
        this.f362932d = i13 + 1;
        zArr3[i13] = z12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f362932d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f362932d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37693p)) {
            return super.equals(obj);
        }
        C37693p c37693p = (C37693p) obj;
        if (this.f362932d != c37693p.f362932d) {
            return false;
        }
        boolean[] zArr = c37693p.f362931c;
        for (int i12 = 0; i12 < this.f362932d; i12++) {
            if (this.f362931c[i12] != zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i12) {
        d(i12);
        return Boolean.valueOf(this.f362931c[i12]);
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i12 = 1;
        for (int i13 = 0; i13 < this.f362932d; i13++) {
            int i14 = i12 * 31;
            boolean z12 = this.f362931c[i13];
            Charset charset = C37670d0.f362857a;
            i12 = i14 + (z12 ? 1231 : 1237);
        }
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i12 = this.f362932d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f362931c[i13] == zBooleanValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object remove(int i12) {
        b();
        d(i12);
        boolean[] zArr = this.f362931c;
        boolean z12 = zArr[i12];
        if (i12 < this.f362932d - 1) {
            System.arraycopy(zArr, i12 + 1, zArr, i12, (r2 - i12) - 1);
        }
        this.f362932d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        b();
        if (i13 < i12) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f362931c;
        System.arraycopy(zArr, i13, zArr, i12, this.f362932d - i13);
        this.f362932d -= i13 - i12;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.List
    public final Object set(int i12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i12);
        boolean[] zArr = this.f362931c;
        boolean z12 = zArr[i12];
        zArr[i12] = zBooleanValue;
        return Boolean.valueOf(z12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f362932d;
    }

    public C37693p(boolean[] zArr, int i12, boolean z12) {
        super(z12);
        this.f362931c = zArr;
        this.f362932d = i12;
    }

    @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
    /* renamed from: mutableCopyWithCapacity */
    public final C37670d0.k<Boolean> mutableCopyWithCapacity2(int i12) {
        if (i12 >= this.f362932d) {
            return new C37693p(Arrays.copyOf(this.f362931c, i12), this.f362932d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC37667c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
