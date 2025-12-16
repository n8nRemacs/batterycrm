package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotStateSet.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/J;", "T", "Landroidx/compose/runtime/snapshots/V;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@F3
/* loaded from: classes.dex */
public final class J<T> implements V, Set<T>, RandomAccess, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public a f38653b;

    /* compiled from: SnapshotStateSet.kt */
    @androidx.compose.runtime.internal.P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/J$a;", "T", "Landroidx/compose/runtime/snapshots/X;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends X {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> f38654c;

        /* renamed from: d, reason: collision with root package name */
        public int f38655d;

        public a(long j12, @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar) {
            super(j12);
            this.f38654c = iVar;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k X x12) {
            synchronized (K.f38657a) {
                this.f38654c = ((a) x12).f38654c;
                this.f38655d = ((a) x12).f38655d;
                G0 g02 = G0.f406611a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X b() {
            return new a(C22176v.j().getF38722b(), this.f38654c);
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final X c(long j12) {
            return new a(j12, this.f38654c);
        }
    }

    /* compiled from: SnapshotStateSet.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Set<T>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f38656l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends T> collection) {
            super(1);
            this.f38656l = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((Set) obj).retainAll(C42745f0.P0(this.f38656l)));
        }
    }

    public J() {
        h0.b.f396955f.getClass();
        h0.b bVar = h0.b.f396956g;
        a aVar = new a(C22176v.j().getF38722b(), bVar);
        AbstractC22167l.f38720e.getClass();
        if (C22176v.f38749b.a() != null) {
            aVar.f38675b = new a(1, bVar);
        }
        this.f38653b = aVar;
    }

    public static boolean b(a aVar, int i12, androidx.compose.runtime.external.kotlinx.collections.immutable.i iVar) {
        boolean z12;
        synchronized (K.f38657a) {
            int i13 = aVar.f38655d;
            if (i13 == i12) {
                aVar.f38654c = iVar;
                z12 = true;
                aVar.f38655d = i13 + 1;
            } else {
                z12 = false;
            }
        }
        return z12;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t12) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (K.f38657a) {
                a aVar = (a) C22176v.h(this.f38653b);
                i12 = aVar.f38655d;
                iVar = aVar.f38654c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarAdd = iVar.add((androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T>) t12);
            if (iVarAdd.equals(iVar)) {
                return false;
            }
            a aVar2 = this.f38653b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, iVarAdd);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(@Y61.k Collection<? extends T> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (K.f38657a) {
                a aVar = (a) C22176v.h(this.f38653b);
                i12 = aVar.f38655d;
                iVar = aVar.f38654c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarAddAll = iVar.addAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.L.f(iVarAddAll, iVar)) {
                return false;
            }
            a aVar2 = this.f38653b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, iVarAddAll);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC22167l abstractC22167lJ;
        a aVar = this.f38653b;
        synchronized (C22176v.f38750c) {
            AbstractC22167l.f38720e.getClass();
            abstractC22167lJ = C22176v.j();
            a aVar2 = (a) C22176v.v(aVar, this, abstractC22167lJ);
            synchronized (K.f38657a) {
                h0.b.f396955f.getClass();
                aVar2.f38654c = h0.b.f396956g;
                aVar2.f38655d++;
            }
        }
        C22176v.m(abstractC22167lJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((a) C22176v.s(this.f38653b, this)).f38654c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return ((a) C22176v.s(this.f38653b, this)).f38654c.containsAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final X d() {
        return this.f38653b;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((a) C22176v.s(this.f38653b, this)).f38654c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return new Y(this, ((a) C22176v.s(this.f38653b, this)).f38654c.iterator());
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k X x12) {
        x12.f38675b = this.f38653b;
        this.f38653b = (a) x12;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (K.f38657a) {
                a aVar = (a) C22176v.h(this.f38653b);
                i12 = aVar.f38655d;
                iVar = aVar.f38654c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarRemove = iVar.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T>) obj);
            if (iVarRemove.equals(iVar)) {
                return false;
            }
            a aVar2 = this.f38653b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, iVarRemove);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        do {
            synchronized (K.f38657a) {
                a aVar = (a) C22176v.h(this.f38653b);
                i12 = aVar.f38655d;
                iVar = aVar.f38654c;
                G0 g02 = G0.f406611a;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarRemoveAll = iVar.removeAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.L.f(iVarRemoveAll, iVar)) {
                return false;
            }
            a aVar2 = this.f38653b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, iVarRemoveAll);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        int i12;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar;
        Object objInvoke;
        AbstractC22167l abstractC22167lJ;
        boolean zB2;
        b bVar = new b(collection);
        do {
            synchronized (K.f38657a) {
                a aVar = (a) C22176v.h(this.f38653b);
                i12 = aVar.f38655d;
                iVar = aVar.f38654c;
                G0 g02 = G0.f406611a;
            }
            if (iVar == null) {
                throw new IllegalStateException("No set to mutate");
            }
            i.a<? extends T> aVarBuilder = iVar.builder();
            objInvoke = bVar.invoke(aVarBuilder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.L.f(iVarBuild, iVar)) {
                break;
            }
            a aVar2 = this.f38653b;
            synchronized (C22176v.f38750c) {
                AbstractC22167l.f38720e.getClass();
                abstractC22167lJ = C22176v.j();
                zB2 = b((a) C22176v.v(aVar2, this, abstractC22167lJ), i12, iVarBuild);
            }
            C22176v.m(abstractC22167lJ, this);
        } while (!zB2);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((a) C22176v.s(this.f38653b, this)).f38654c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        return "SnapshotStateSet(value=" + ((a) C22176v.h(this.f38653b)).f38654c + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
