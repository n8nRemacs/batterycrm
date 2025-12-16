package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22879a1<E> extends AbstractC22883c<E> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final C22879a1<Object> f45801e;

    /* renamed from: c, reason: collision with root package name */
    public E[] f45802c;

    /* renamed from: d, reason: collision with root package name */
    public int f45803d;

    static {
        C22879a1<Object> c22879a1 = new C22879a1<>(new Object[0], 0);
        f45801e = c22879a1;
        c22879a1.f45804b = false;
    }

    public C22879a1() {
        this(new Object[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        b();
        int i12 = this.f45803d;
        E[] eArr = this.f45802c;
        if (i12 == eArr.length) {
            this.f45802c = (E[]) Arrays.copyOf(eArr, ((i12 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f45802c;
        int i13 = this.f45803d;
        this.f45803d = i13 + 1;
        eArr2[i13] = e12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i12) {
        if (i12 < 0 || i12 >= this.f45803d) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
            sbJ.append(this.f45803d);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        d(i12);
        return this.f45802c[i12];
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.k
    public final C22914m0.k mutableCopyWithCapacity(int i12) {
        if (i12 >= this.f45803d) {
            return new C22879a1(Arrays.copyOf(this.f45802c, i12), this.f45803d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final E remove(int i12) {
        b();
        d(i12);
        E[] eArr = this.f45802c;
        E e12 = eArr[i12];
        if (i12 < this.f45803d - 1) {
            System.arraycopy(eArr, i12 + 1, eArr, i12, (r2 - i12) - 1);
        }
        this.f45803d--;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        b();
        d(i12);
        E[] eArr = this.f45802c;
        E e13 = eArr[i12];
        eArr[i12] = e12;
        ((AbstractList) this).modCount++;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45803d;
    }

    public C22879a1(E[] eArr, int i12) {
        this.f45802c = eArr;
        this.f45803d = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22883c, java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        int i13;
        b();
        if (i12 >= 0 && i12 <= (i13 = this.f45803d)) {
            E[] eArr = this.f45802c;
            if (i13 < eArr.length) {
                System.arraycopy(eArr, i12, eArr, i12 + 1, i13 - i12);
            } else {
                E[] eArr2 = (E[]) new Object[androidx.compose.ui.graphics.colorspace.e.e(i13, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i12);
                System.arraycopy(this.f45802c, i12, eArr2, i12 + 1, this.f45803d - i12);
                this.f45802c = eArr2;
            }
            this.f45802c[i12] = e12;
            this.f45803d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index:", ", Size:");
        sbJ.append(this.f45803d);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
