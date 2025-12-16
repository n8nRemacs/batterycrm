package kotlin.reflect.jvm.internal.impl.utils;

import Y61.k;
import androidx.camera.camera2.internal.G;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList.java */
/* loaded from: classes8.dex */
public class f<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public int f410361b;

    /* renamed from: c, reason: collision with root package name */
    public Object f410362c;

    /* compiled from: SmartList.java */
    public static class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f410363b = new b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    public class c extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        public final int f410364c;

        public c() {
            super();
            this.f410364c = ((AbstractList) f.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.f.d
        public final void a() {
            f fVar = f.this;
            int i12 = ((AbstractList) fVar).modCount;
            int i13 = this.f410364c;
            if (i12 == i13) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i13);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.f.d
        public final E b() {
            return (E) f.this.f410362c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            f.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    public static abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public boolean f410366b;

        public d() {
        }

        public abstract void a();

        public abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f410366b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f410366b) {
                throw new NoSuchElementException();
            }
            this.f410366b = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 7) ? 2 : 3];
        switch (i12) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i12 == 2 || i12 == 3) {
            objArr[1] = "iterator";
        } else if (i12 == 5 || i12 == 6 || i12 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i12) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 2 && i12 != 3 && i12 != 5 && i12 != 6 && i12 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        int i12 = this.f410361b;
        if (i12 == 0) {
            this.f410362c = e12;
        } else if (i12 == 1) {
            this.f410362c = new Object[]{this.f410362c, e12};
        } else {
            Object[] objArr = (Object[]) this.f410362c;
            int length = objArr.length;
            if (i12 >= length) {
                int iE2 = androidx.compose.ui.graphics.colorspace.e.e(length, 3, 2, 1);
                int i13 = i12 + 1;
                if (iE2 < i13) {
                    iE2 = i13;
                }
                Object[] objArr2 = new Object[iE2];
                this.f410362c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f410361b] = e12;
        }
        this.f410361b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f410362c = null;
        this.f410361b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        int i13;
        if (i12 >= 0 && i12 < (i13 = this.f410361b)) {
            return i13 == 1 ? (E) this.f410362c : (E) ((Object[]) this.f410362c)[i12];
        }
        StringBuilder sbJ = G.j(i12, "Index: ", ", Size: ");
        sbJ.append(this.f410361b);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @k
    public final Iterator<E> iterator() {
        int i12 = this.f410361b;
        if (i12 == 0) {
            b bVar = b.f410363b;
            if (bVar != null) {
                return bVar;
            }
            a(2);
            throw null;
        }
        if (i12 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i12) {
        int i13;
        E e12;
        if (i12 < 0 || i12 >= (i13 = this.f410361b)) {
            StringBuilder sbJ = G.j(i12, "Index: ", ", Size: ");
            sbJ.append(this.f410361b);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 == 1) {
            e12 = (E) this.f410362c;
            this.f410362c = null;
        } else {
            Object[] objArr = (Object[]) this.f410362c;
            Object obj = objArr[i12];
            if (i13 == 2) {
                this.f410362c = objArr[1 - i12];
            } else {
                int i14 = (i13 - i12) - 1;
                if (i14 > 0) {
                    System.arraycopy(objArr, i12 + 1, objArr, i12, i14);
                }
                objArr[this.f410361b - 1] = null;
            }
            e12 = (E) obj;
        }
        this.f410361b--;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        int i13;
        if (i12 < 0 || i12 >= (i13 = this.f410361b)) {
            StringBuilder sbJ = G.j(i12, "Index: ", ", Size: ");
            sbJ.append(this.f410361b);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 == 1) {
            E e13 = (E) this.f410362c;
            this.f410362c = e12;
            return e13;
        }
        Object[] objArr = (Object[]) this.f410362c;
        E e14 = (E) objArr[i12];
        objArr[i12] = e12;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f410361b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i12 = this.f410361b;
        if (i12 >= 2) {
            Arrays.sort((Object[]) this.f410362c, 0, i12, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @k
    public final <T> T[] toArray(@k T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i12 = this.f410361b;
        if (i12 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f410362c;
                return tArr2;
            }
            tArr[0] = this.f410362c;
        } else {
            if (length < i12) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f410362c, i12, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i12 != 0) {
                System.arraycopy(this.f410362c, 0, tArr, 0, i12);
            }
        }
        int i13 = this.f410361b;
        if (length > i13) {
            tArr[i13] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        int i13;
        if (i12 >= 0 && i12 <= (i13 = this.f410361b)) {
            if (i13 == 0) {
                this.f410362c = e12;
            } else if (i13 == 1 && i12 == 0) {
                this.f410362c = new Object[]{e12, this.f410362c};
            } else {
                Object[] objArr = new Object[i13 + 1];
                if (i13 == 1) {
                    objArr[0] = this.f410362c;
                } else {
                    Object[] objArr2 = (Object[]) this.f410362c;
                    System.arraycopy(objArr2, 0, objArr, 0, i12);
                    System.arraycopy(objArr2, i12, objArr, i12 + 1, this.f410361b - i12);
                }
                objArr[i12] = e12;
                this.f410362c = objArr;
            }
            this.f410361b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = G.j(i12, "Index: ", ", Size: ");
        sbJ.append(this.f410361b);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
