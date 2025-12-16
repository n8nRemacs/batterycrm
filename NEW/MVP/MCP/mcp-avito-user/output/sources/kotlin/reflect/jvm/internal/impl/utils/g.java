package kotlin.reflect.jvm.internal.impl.utils;

import X41.n;
import Y61.k;
import Y61.l;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C42756l;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: SmartSet.kt */
@s0
/* loaded from: classes8.dex */
public final class g<T> extends AbstractSet<T> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f410367d = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public Object f410368b;

    /* renamed from: c, reason: collision with root package name */
    public int f410369c;

    /* compiled from: SmartSet.kt */
    public static final class a<T> implements Iterator<T>, Z41.d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Iterator<T> f410370b;

        public a(@k T[] tArr) {
            this.f410370b = C42809i.a(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410370b.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.f410370b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmartSet.kt */
    @s0
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static g a() {
            return new g(null);
        }

        public b() {
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class c<T> implements Iterator<T>, Z41.d {

        /* renamed from: b, reason: collision with root package name */
        public final T f410371b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f410372c = true;

        public c(T t12) {
            this.f410371b = t12;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410372c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f410372c) {
                throw new NoSuchElementException();
            }
            this.f410372c = false;
            return this.f410371b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t12) {
        Object[] objArr;
        int i12 = this.f410369c;
        if (i12 == 0) {
            this.f410368b = t12;
        } else if (i12 == 1) {
            if (L.f(this.f410368b, t12)) {
                return false;
            }
            this.f410368b = new Object[]{this.f410368b, t12};
        } else if (i12 < 5) {
            Object[] objArr2 = (Object[]) this.f410368b;
            if (C42756l.H(t12, objArr2) >= 0) {
                return false;
            }
            int i13 = this.f410369c;
            if (i13 == 4) {
                ?? D12 = b1.d(Arrays.copyOf(objArr2, objArr2.length));
                D12.add(t12);
                objArr = D12;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, i13 + 1);
                objArrCopyOf[objArrCopyOf.length - 1] = t12;
                objArr = objArrCopyOf;
            }
            this.f410368b = objArr;
        } else if (!v0.d(this.f410368b).add(t12)) {
            return false;
        }
        this.f410369c++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f410368b = null;
        this.f410369c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i12 = this.f410369c;
        if (i12 == 0) {
            return false;
        }
        return i12 == 1 ? L.f(this.f410368b, obj) : i12 < 5 ? C42756l.H(obj, (Object[]) this.f410368b) >= 0 : ((Set) this.f410368b).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<T> iterator() {
        int i12 = this.f410369c;
        return i12 == 0 ? Collections.emptySet().iterator() : i12 == 1 ? new c(this.f410368b) : i12 < 5 ? new a((Object[]) this.f410368b) : v0.d(this.f410368b).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f410369c;
    }

    public g() {
    }
}
