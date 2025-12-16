package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.P1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateList.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/D;", "T", "Landroidx/compose/runtime/snapshots/V;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@F3
/* loaded from: classes.dex */
public final class D<T> implements V, List<T>, RandomAccess, Z41.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public a f38612b;

    /* compiled from: SnapshotStateList.kt */
    @androidx.compose.runtime.internal.P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/D$a;", "T", "Landroidx/compose/runtime/snapshots/X;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends X {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> f38613c;

        /* renamed from: d, reason: collision with root package name */
        public int f38614d;

        /* renamed from: e, reason: collision with root package name */
        public int f38615e;

        public a(long j12, @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
            super(j12);
            this.f38613c = gVar;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k X x12) {
            synchronized (E.f38619a) {
                this.f38613c = ((a) x12).f38613c;
                this.f38614d = ((a) x12).f38614d;
                this.f38615e = ((a) x12).f38615e;
                G0 g02 = G0.f406611a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X b() {
            return c(C22176v.j().getF38722b());
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X c(long j12) {
            return new a(j12, this.f38613c);
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<T>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f38616l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f38617m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, Collection<? extends T> collection) {
            super(1);
            this.f38616l = i12;
            this.f38617m = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f38616l, this.f38617m));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<List<T>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f38618l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Collection<? extends T> collection) {
            super(1);
            this.f38618l = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f38618l));
        }
    }

    public D() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.k.f38317d.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.k kVar = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.k.f38318e;
        AbstractC22167l abstractC22167lJ = C22176v.j();
        a aVar = new a(abstractC22167lJ.getF38722b(), kVar);
        if (!(abstractC22167lJ instanceof C22158c)) {
            aVar.f38675b = new a(1, kVar);
        }
        this.f38612b = aVar;
    }

    public static boolean b(a aVar, int i12, androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, boolean z12) {
        boolean z13;
        synchronized (E.f38619a) {
            try {
                int i13 = aVar.f38614d;
                if (i13 == i12) {
                    aVar.f38613c = gVar;
                    z13 = true;
                    if (z12) {
                        aVar.f38615e++;
                    }
                    aVar.f38614d = i13 + 1;
                } else {
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t12) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarAdd = gVar.add((androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>) t12);
            if (gVarAdd.equals(gVar)) {
                return false;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, gVarAdd, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i12, @Y61.k Collection<? extends T> collection) {
        return h(new b(i12, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC22167l abstractC22167lJ;
        a aVar = this.f38612b;
        synchronized (C22176v.f38750c) {
            AbstractC22167l.f38720e.getClass();
            abstractC22167lJ = C22176v.j();
            a aVar2 = (a) C22176v.v(aVar, this, abstractC22167lJ);
            synchronized (E.f38619a) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.k.f38317d.getClass();
                aVar2.f38613c = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.k.f38318e;
                aVar2.f38614d++;
                aVar2.f38615e++;
            }
        }
        C22176v.m(abstractC22167lJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return e().f38613c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return e().f38613c.containsAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final X d() {
        return this.f38612b;
    }

    @Y61.k
    public final a<T> e() {
        return (a) C22176v.s(this.f38612b, this);
    }

    public final int g() {
        return ((a) C22176v.h(this.f38612b)).f38615e;
    }

    @Override // java.util.List
    public final T get(int i12) {
        return e().f38613c.get(i12);
    }

    public final boolean h(Y41.l<? super List<T>, Boolean> lVar) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        Boolean boolInvoke;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarBuilder = gVar.builder();
            boolInvoke = lVar.invoke(gVarBuilder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVarB = gVarBuilder.b();
            if (kotlin.jvm.internal.L.f(gVarB, gVar)) {
                break;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, gVarB, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return e().f38613c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return e().f38613c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k X x12) {
        x12.f38675b = this.f38612b;
        this.f38612b = (a) x12;
    }

    public final void l(int i12, int i13) {
        int i14;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i14 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarBuilder = gVar.builder();
            gVarBuilder.subList(i12, i13).clear();
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVarB = gVarBuilder.b();
            if (kotlin.jvm.internal.L.f(gVarB, gVar)) {
                return;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i14, gVarB, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return e().f38613c.lastIndexOf(obj);
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator() {
        return new O(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i12) {
        int i13;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        T t12 = get(i12);
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i13 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarX4 = gVar.X4(i12);
            if (kotlin.jvm.internal.L.f(gVarX4, gVar)) {
                break;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i13, gVarX4, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return t12;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarRemoveAll = gVar.removeAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.L.f(gVarRemoveAll, gVar)) {
                return false;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, gVarRemoveAll, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        return h(new c(collection));
    }

    @Override // java.util.List
    public final T set(int i12, T t12) {
        int i13;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        T t13 = get(i12);
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i13 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar2 = gVar.set(i12, (int) t12);
            if (gVar2.equals(gVar)) {
                break;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i13, gVar2, false);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return t13;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return e().f38613c.size();
    }

    @Override // java.util.List
    @Y61.k
    public final List<T> subList(int i12, int i13) {
        if (!(i12 >= 0 && i12 <= i13 && i13 <= size())) {
            P1.a("fromIndex or toIndex are out of bounds");
        }
        return new Z(this, i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        return "SnapshotStateList(value=" + ((a) C22176v.h(this.f38612b)).f38613c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@Y61.k Collection<? extends T> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarAddAll = gVar.addAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.L.f(gVarAddAll, gVar)) {
                return false;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, gVarAddAll, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<T> listIterator(int i12) {
        return new O(this, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i12, T t12) {
        int i13;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i13 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarAdd = gVar.add(i12, (int) t12);
            if (gVarAdd.equals(gVar)) {
                return;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i13, gVarAdd, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (E.f38619a) {
                a aVar = (a) C22176v.h(this.f38612b);
                i12 = aVar.f38614d;
                gVar = aVar.f38613c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarRemove = gVar.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>) obj);
            if (kotlin.jvm.internal.L.f(gVarRemove, gVar)) {
                return false;
            }
            a aVar2 = this.f38612b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, gVarRemove, true);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }
}
