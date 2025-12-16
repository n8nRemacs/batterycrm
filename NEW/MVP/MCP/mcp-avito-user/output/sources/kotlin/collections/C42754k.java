package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ArrayDeque.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/collections/k;", "E", "Lkotlin/collections/f;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.collections.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42754k<E> extends AbstractC42744f<E> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Object[] f406738e;

    /* renamed from: b, reason: collision with root package name */
    public int f406739b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object[] f406740c;

    /* renamed from: d, reason: collision with root package name */
    public int f406741d;

    /* compiled from: ArrayDeque.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/k$a;", "", "<init>", "()V", "", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.k$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f406738e = new Object[0];
    }

    public C42754k(int i12) {
        Object[] objArr;
        if (i12 == 0) {
            objArr = f406738e;
        } else {
            if (i12 <= 0) {
                throw new IllegalArgumentException(AK.c.g(i12, "Illegal Capacity: "));
            }
            objArr = new Object[i12];
        }
        this.f406740c = objArr;
    }

    @Override // kotlin.collections.AbstractC42744f
    public final E a(int i12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        if (i12 == getF406668c() - 1) {
            return removeLast();
        }
        if (i12 == 0) {
            return removeFirst();
        }
        t();
        int iS2 = s(this.f406739b + i12);
        Object[] objArr = this.f406740c;
        E e12 = (E) objArr[iS2];
        if (i12 < (this.f406741d >> 1)) {
            int i14 = this.f406739b;
            if (iS2 >= i14) {
                C42756l.o(objArr, i14 + 1, objArr, i14, iS2);
            } else {
                C42756l.o(objArr, 1, objArr, 0, iS2);
                Object[] objArr2 = this.f406740c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i15 = this.f406739b;
                C42756l.o(objArr2, i15 + 1, objArr2, i15, objArr2.length - 1);
            }
            Object[] objArr3 = this.f406740c;
            int i16 = this.f406739b;
            objArr3[i16] = null;
            this.f406739b = g(i16);
        } else {
            int iS3 = s((getF406668c() - 1) + this.f406739b);
            if (iS2 <= iS3) {
                Object[] objArr4 = this.f406740c;
                C42756l.o(objArr4, iS2, objArr4, iS2 + 1, iS3 + 1);
            } else {
                Object[] objArr5 = this.f406740c;
                C42756l.o(objArr5, iS2, objArr5, iS2 + 1, objArr5.length);
                Object[] objArr6 = this.f406740c;
                objArr6[objArr6.length - 1] = objArr6[0];
                C42756l.o(objArr6, 0, objArr6, 1, iS3 + 1);
            }
            this.f406740c[iS3] = null;
        }
        this.f406741d--;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        addLast(e12);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@Y61.k Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        t();
        d(collection.size() + getF406668c());
        b(s(getF406668c() + this.f406739b), collection);
        return true;
    }

    public final void addFirst(E e12) {
        t();
        d(this.f406741d + 1);
        int length = this.f406739b;
        if (length == 0) {
            length = this.f406740c.length;
        }
        int i12 = length - 1;
        this.f406739b = i12;
        this.f406740c[i12] = e12;
        this.f406741d++;
    }

    public final void addLast(E e12) {
        t();
        d(getF406668c() + 1);
        this.f406740c[s(getF406668c() + this.f406739b)] = e12;
        this.f406741d = getF406668c() + 1;
    }

    public final void b(int i12, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f406740c.length;
        while (i12 < length && it.hasNext()) {
            this.f406740c[i12] = it.next();
            i12++;
        }
        int i13 = this.f406739b;
        for (int i14 = 0; i14 < i13 && it.hasNext(); i14++) {
            this.f406740c[i14] = it.next();
        }
        this.f406741d = collection.size() + this.f406741d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            t();
            r(this.f406739b, s(getF406668c() + this.f406739b));
        }
        this.f406739b = 0;
        this.f406741d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i12) {
        if (i12 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f406740c;
        if (i12 <= objArr.length) {
            return;
        }
        if (objArr == f406738e) {
            if (i12 < 10) {
                i12 = 10;
            }
            this.f406740c = new Object[i12];
            return;
        }
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[AbstractC42738c.a.d(length, i12)];
        Object[] objArr3 = this.f406740c;
        C42756l.o(objArr3, 0, objArr2, this.f406739b, objArr3.length);
        Object[] objArr4 = this.f406740c;
        int length2 = objArr4.length;
        int i13 = this.f406739b;
        C42756l.o(objArr4, length2 - i13, objArr2, 0, i13);
        this.f406739b = 0;
        this.f406740c = objArr2;
    }

    @Y61.l
    public final E e() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f406740c[this.f406739b];
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f406740c[this.f406739b];
    }

    public final int g(int i12) {
        if (i12 == this.f406740c.length - 1) {
            return 0;
        }
        return i12 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        return (E) this.f406740c[s(this.f406739b + i12)];
    }

    @Override // kotlin.collections.AbstractC42744f
    /* renamed from: getSize, reason: from getter */
    public final int getF406668c() {
        return this.f406741d;
    }

    @Y61.l
    public final E h() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f406740c[s((size() - 1) + this.f406739b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i12;
        int iS2 = s(getF406668c() + this.f406739b);
        int length = this.f406739b;
        if (length < iS2) {
            while (length < iS2) {
                if (kotlin.jvm.internal.L.f(obj, this.f406740c[length])) {
                    i12 = this.f406739b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iS2) {
            return -1;
        }
        int length2 = this.f406740c.length;
        while (true) {
            if (length >= length2) {
                for (int i13 = 0; i13 < iS2; i13++) {
                    if (kotlin.jvm.internal.L.f(obj, this.f406740c[i13])) {
                        length = i13 + this.f406740c.length;
                        i12 = this.f406739b;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.L.f(obj, this.f406740c[length])) {
                i12 = this.f406739b;
                break;
            }
            length++;
        }
        return length - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getF406668c() == 0;
    }

    public final int l(int i12) {
        return i12 < 0 ? i12 + this.f406740c.length : i12;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f406740c[s((size() - 1) + this.f406739b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i12;
        int iS2 = s(getF406668c() + this.f406739b);
        int i13 = this.f406739b;
        if (i13 < iS2) {
            length = iS2 - 1;
            if (i13 <= length) {
                while (!kotlin.jvm.internal.L.f(obj, this.f406740c[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i12 = this.f406739b;
                return length - i12;
            }
            return -1;
        }
        if (i13 > iS2) {
            int i14 = iS2 - 1;
            while (true) {
                if (-1 >= i14) {
                    length = this.f406740c.length - 1;
                    int i15 = this.f406739b;
                    if (i15 <= length) {
                        while (!kotlin.jvm.internal.L.f(obj, this.f406740c[length])) {
                            if (length != i15) {
                                length--;
                            }
                        }
                        i12 = this.f406739b;
                    }
                } else {
                    if (kotlin.jvm.internal.L.f(obj, this.f406740c[i14])) {
                        length = i14 + this.f406740c.length;
                        i12 = this.f406739b;
                        break;
                    }
                    i14--;
                }
            }
        }
        return -1;
    }

    public final void r(int i12, int i13) {
        if (i12 < i13) {
            Arrays.fill(this.f406740c, i12, i13, (Object) null);
            return;
        }
        Object[] objArr = this.f406740c;
        Arrays.fill(objArr, i12, objArr.length, (Object) null);
        Arrays.fill(this.f406740c, 0, i13, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        int iS2;
        boolean z12 = false;
        z12 = false;
        z12 = false;
        if (!isEmpty() && this.f406740c.length != 0) {
            int iS3 = s(getF406668c() + this.f406739b);
            int i12 = this.f406739b;
            if (i12 < iS3) {
                iS2 = i12;
                while (i12 < iS3) {
                    Object obj = this.f406740c[i12];
                    if (collection.contains(obj)) {
                        z12 = true;
                    } else {
                        this.f406740c[iS2] = obj;
                        iS2++;
                    }
                    i12++;
                }
                Arrays.fill(this.f406740c, iS2, iS3, (Object) null);
            } else {
                int length = this.f406740c.length;
                boolean z13 = false;
                int i13 = i12;
                while (i12 < length) {
                    Object[] objArr = this.f406740c;
                    Object obj2 = objArr[i12];
                    objArr[i12] = null;
                    if (collection.contains(obj2)) {
                        z13 = true;
                    } else {
                        this.f406740c[i13] = obj2;
                        i13++;
                    }
                    i12++;
                }
                iS2 = s(i13);
                for (int i14 = 0; i14 < iS3; i14++) {
                    Object[] objArr2 = this.f406740c;
                    Object obj3 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj3)) {
                        z13 = true;
                    } else {
                        this.f406740c[iS2] = obj3;
                        iS2 = g(iS2);
                    }
                }
                z12 = z13;
            }
            if (z12) {
                t();
                this.f406741d = l(iS2 - this.f406739b);
            }
        }
        return z12;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.f406740c;
        int i12 = this.f406739b;
        E e12 = (E) objArr[i12];
        objArr[i12] = null;
        this.f406739b = g(i12);
        this.f406741d = getF406668c() - 1;
        return e12;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int iS2 = s((size() - 1) + this.f406739b);
        Object[] objArr = this.f406740c;
        E e12 = (E) objArr[iS2];
        objArr[iS2] = null;
        this.f406741d = getF406668c() - 1;
        return e12;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i12, int i13) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i14 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.c(i12, i13, i14);
        int i15 = i13 - i12;
        if (i15 == 0) {
            return;
        }
        if (i15 == this.f406741d) {
            clear();
            return;
        }
        if (i15 == 1) {
            a(i12);
            return;
        }
        t();
        if (i12 < this.f406741d - i13) {
            int iS2 = s((i12 - 1) + this.f406739b);
            int iS3 = s((i13 - 1) + this.f406739b);
            while (i12 > 0) {
                int i16 = iS2 + 1;
                int iMin = Math.min(i12, Math.min(i16, iS3 + 1));
                Object[] objArr = this.f406740c;
                int i17 = iS3 - iMin;
                int i18 = iS2 - iMin;
                C42756l.o(objArr, i17 + 1, objArr, i18 + 1, i16);
                iS2 = l(i18);
                iS3 = l(i17);
                i12 -= iMin;
            }
            int iS4 = s(this.f406739b + i15);
            r(this.f406739b, iS4);
            this.f406739b = iS4;
        } else {
            int iS5 = s(this.f406739b + i13);
            int iS6 = s(this.f406739b + i12);
            int i19 = this.f406741d;
            while (true) {
                i19 -= i13;
                if (i19 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f406740c;
                i13 = Math.min(i19, Math.min(objArr2.length - iS5, objArr2.length - iS6));
                Object[] objArr3 = this.f406740c;
                int i22 = iS5 + i13;
                C42756l.o(objArr3, iS6, objArr3, iS5, i22);
                iS5 = s(i22);
                iS6 = s(iS6 + i13);
            }
            int iS7 = s(this.f406741d + this.f406739b);
            r(l(iS7 - i15), iS7);
        }
        this.f406741d -= i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        int iS2;
        boolean z12 = false;
        z12 = false;
        z12 = false;
        if (!isEmpty() && this.f406740c.length != 0) {
            int iS3 = s(getF406668c() + this.f406739b);
            int i12 = this.f406739b;
            if (i12 < iS3) {
                iS2 = i12;
                while (i12 < iS3) {
                    Object obj = this.f406740c[i12];
                    if (collection.contains(obj)) {
                        this.f406740c[iS2] = obj;
                        iS2++;
                    } else {
                        z12 = true;
                    }
                    i12++;
                }
                Arrays.fill(this.f406740c, iS2, iS3, (Object) null);
            } else {
                int length = this.f406740c.length;
                boolean z13 = false;
                int i13 = i12;
                while (i12 < length) {
                    Object[] objArr = this.f406740c;
                    Object obj2 = objArr[i12];
                    objArr[i12] = null;
                    if (collection.contains(obj2)) {
                        this.f406740c[i13] = obj2;
                        i13++;
                    } else {
                        z13 = true;
                    }
                    i12++;
                }
                iS2 = s(i13);
                for (int i14 = 0; i14 < iS3; i14++) {
                    Object[] objArr2 = this.f406740c;
                    Object obj3 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj3)) {
                        this.f406740c[iS2] = obj3;
                        iS2 = g(iS2);
                    } else {
                        z13 = true;
                    }
                }
                z12 = z13;
            }
            if (z12) {
                t();
                this.f406741d = l(iS2 - this.f406739b);
            }
        }
        return z12;
    }

    public final int s(int i12) {
        Object[] objArr = this.f406740c;
        return i12 >= objArr.length ? i12 - objArr.length : i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        int iS2 = s(this.f406739b + i12);
        Object[] objArr = this.f406740c;
        E e13 = (E) objArr[iS2];
        objArr[iS2] = e12;
        return e13;
    }

    public final void t() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Y61.k
    public final Object[] toArray() {
        return toArray(new Object[getF406668c()]);
    }

    @Y61.l
    public final E v() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.b(i12, i13);
        if (i12 == this.f406741d) {
            addLast(e12);
            return;
        }
        if (i12 == 0) {
            addFirst(e12);
            return;
        }
        t();
        d(this.f406741d + 1);
        int iS2 = s(this.f406739b + i12);
        int i14 = this.f406741d;
        if (i12 < ((i14 + 1) >> 1)) {
            int length = iS2 == 0 ? this.f406740c.length - 1 : iS2 - 1;
            int i15 = this.f406739b;
            int length2 = i15 == 0 ? this.f406740c.length - 1 : i15 - 1;
            if (length >= i15) {
                Object[] objArr = this.f406740c;
                objArr[length2] = objArr[i15];
                C42756l.o(objArr, i15, objArr, i15 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f406740c;
                C42756l.o(objArr2, i15 - 1, objArr2, i15, objArr2.length);
                Object[] objArr3 = this.f406740c;
                objArr3[objArr3.length - 1] = objArr3[0];
                C42756l.o(objArr3, 0, objArr3, 1, length + 1);
            }
            this.f406740c[length] = e12;
            this.f406739b = length2;
        } else {
            int iS3 = s(i14 + this.f406739b);
            if (iS2 < iS3) {
                Object[] objArr4 = this.f406740c;
                C42756l.o(objArr4, iS2 + 1, objArr4, iS2, iS3);
            } else {
                Object[] objArr5 = this.f406740c;
                C42756l.o(objArr5, 1, objArr5, 0, iS3);
                Object[] objArr6 = this.f406740c;
                objArr6[0] = objArr6[objArr6.length - 1];
                C42756l.o(objArr6, iS2 + 1, objArr6, iS2, objArr6.length - 1);
            }
            this.f406740c[iS2] = e12;
        }
        this.f406741d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Y61.k
    public final <T> T[] toArray(@Y61.k T[] tArr) {
        int length = tArr.length;
        int i12 = this.f406741d;
        if (length < i12) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i12));
        }
        int iS2 = s(this.f406741d + this.f406739b);
        int i13 = this.f406739b;
        if (i13 < iS2) {
            C42756l.s(this.f406740c, i13, tArr, iS2, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f406740c;
            C42756l.o(objArr, 0, tArr, this.f406739b, objArr.length);
            Object[] objArr2 = this.f406740c;
            C42756l.o(objArr2, objArr2.length - this.f406739b, tArr, 0, iS2);
        }
        int i14 = this.f406741d;
        if (i14 < tArr.length) {
            tArr[i14] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, @Y61.k Collection<? extends E> collection) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406741d;
        aVar.getClass();
        AbstractC42738c.a.b(i12, i13);
        if (collection.isEmpty()) {
            return false;
        }
        if (i12 == this.f406741d) {
            return addAll(collection);
        }
        t();
        d(collection.size() + this.f406741d);
        int iS2 = s(this.f406741d + this.f406739b);
        int iS3 = s(this.f406739b + i12);
        int size = collection.size();
        if (i12 < ((this.f406741d + 1) >> 1)) {
            int i14 = this.f406739b;
            int length = i14 - size;
            if (iS3 < i14) {
                Object[] objArr = this.f406740c;
                C42756l.o(objArr, length, objArr, i14, objArr.length);
                if (size >= iS3) {
                    Object[] objArr2 = this.f406740c;
                    C42756l.o(objArr2, objArr2.length - size, objArr2, 0, iS3);
                } else {
                    Object[] objArr3 = this.f406740c;
                    C42756l.o(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f406740c;
                    C42756l.o(objArr4, 0, objArr4, size, iS3);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f406740c;
                C42756l.o(objArr5, length, objArr5, i14, iS3);
            } else {
                Object[] objArr6 = this.f406740c;
                length += objArr6.length;
                int i15 = iS3 - i14;
                int length2 = objArr6.length - length;
                if (length2 >= i15) {
                    C42756l.o(objArr6, length, objArr6, i14, iS3);
                } else {
                    C42756l.o(objArr6, length, objArr6, i14, i14 + length2);
                    Object[] objArr7 = this.f406740c;
                    C42756l.o(objArr7, 0, objArr7, this.f406739b + length2, iS3);
                }
            }
            this.f406739b = length;
            b(l(iS3 - size), collection);
        } else {
            int i16 = iS3 + size;
            if (iS3 < iS2) {
                int i17 = size + iS2;
                Object[] objArr8 = this.f406740c;
                if (i17 <= objArr8.length) {
                    C42756l.o(objArr8, i16, objArr8, iS3, iS2);
                } else if (i16 >= objArr8.length) {
                    C42756l.o(objArr8, i16 - objArr8.length, objArr8, iS3, iS2);
                } else {
                    int length3 = iS2 - (i17 - objArr8.length);
                    C42756l.o(objArr8, 0, objArr8, length3, iS2);
                    Object[] objArr9 = this.f406740c;
                    C42756l.o(objArr9, i16, objArr9, iS3, length3);
                }
            } else {
                Object[] objArr10 = this.f406740c;
                C42756l.o(objArr10, size, objArr10, 0, iS2);
                Object[] objArr11 = this.f406740c;
                if (i16 >= objArr11.length) {
                    C42756l.o(objArr11, i16 - objArr11.length, objArr11, iS3, objArr11.length);
                } else {
                    C42756l.o(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f406740c;
                    C42756l.o(objArr12, i16, objArr12, iS3, objArr12.length - size);
                }
            }
            b(iS3, collection);
        }
        return true;
    }

    public C42754k() {
        this.f406740c = f406738e;
    }
}
