package f0;

import Y61.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentHashSet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lf0/a;", "E", "Lkotlin/collections/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40187a<E> extends AbstractC42750i<E> implements i<E> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40191e<E> f395502c;

    /* renamed from: d, reason: collision with root package name */
    public final int f395503d;

    /* compiled from: PersistentHashSet.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf0/a$a;", "", "<init>", "()V", "Lf0/a;", "", "EMPTY", "Lf0/a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.a$a, reason: collision with other inner class name */
    public static final class C11118a {
        public /* synthetic */ C11118a(C42822w c42822w) {
            this();
        }

        public C11118a() {
        }
    }

    static {
        new C11118a(null);
        C40191e.f395516d.getClass();
        new C40187a(0, C40191e.f395517e);
    }

    public C40187a(int i12, @k C40191e c40191e) {
        this.f395502c = c40191e;
        this.f395503d = i12;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> add(E e12) {
        int iHashCode = e12 != null ? e12.hashCode() : 0;
        C40191e<E> c40191e = this.f395502c;
        C40191e<E> c40191eA = c40191e.a(iHashCode, 0, e12);
        return c40191e == c40191eA ? this : new C40187a(getF395503d() + 1, c40191eA);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> addAll(@k Collection<? extends E> collection) {
        C40188b c40188b = (C40188b) builder();
        c40188b.addAll(collection);
        return c40188b.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i.a<E> builder() {
        C40188b c40188b = new C40188b();
        c40188b.f395504b = this;
        c40188b.f395505c = new i0.f();
        C40187a<E> c40187a = c40188b.f395504b;
        c40188b.f395506d = c40187a.f395502c;
        c40188b.f395508f = c40187a.f395503d;
        return c40188b;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f395502c.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        boolean z12 = collection instanceof C40187a;
        C40191e<E> c40191e = this.f395502c;
        return z12 ? c40191e.d(0, ((C40187a) collection).f395502c) : collection instanceof C40188b ? c40191e.d(0, ((C40188b) collection).f395506d) : super.containsAll(collection);
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize, reason: from getter */
    public final int getF395503d() {
        return this.f395503d;
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        return new C40189c(this.f395502c);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> remove(E e12) {
        int iHashCode = e12 != null ? e12.hashCode() : 0;
        C40191e<E> c40191e = this.f395502c;
        C40191e<E> c40191eP = c40191e.p(iHashCode, 0, e12);
        return c40191e == c40191eP ? this : new C40187a(getF395503d() - 1, c40191eP);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> removeAll(@k Collection<? extends E> collection) {
        C40188b c40188b = (C40188b) builder();
        c40188b.removeAll(collection);
        return c40188b.build();
    }
}
