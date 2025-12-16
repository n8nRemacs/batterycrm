package androidx.compose.runtime.changelist;

import Y41.l;
import Y61.k;
import androidx.collection.R0;
import androidx.collection.i1;
import androidx.compose.runtime.A2;
import androidx.compose.runtime.C2;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22068g;
import androidx.compose.runtime.C22153s1;
import androidx.compose.runtime.C22183t1;
import androidx.compose.runtime.F1;
import androidx.compose.runtime.InterfaceC22053d0;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.L2;
import androidx.compose.runtime.M;
import androidx.compose.runtime.N2;
import androidx.compose.runtime.O2;
import androidx.compose.runtime.changelist.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: Operation.kt */
@P
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0082\u0001%()*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Landroidx/compose/runtime/changelist/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "Landroidx/compose/runtime/changelist/d$a;", "Landroidx/compose/runtime/changelist/d$b;", "Landroidx/compose/runtime/changelist/d$c;", "Landroidx/compose/runtime/changelist/d$d;", "Landroidx/compose/runtime/changelist/d$e;", "Landroidx/compose/runtime/changelist/d$f;", "Landroidx/compose/runtime/changelist/d$g;", "Landroidx/compose/runtime/changelist/d$h;", "Landroidx/compose/runtime/changelist/d$i;", "Landroidx/compose/runtime/changelist/d$j;", "Landroidx/compose/runtime/changelist/d$k;", "Landroidx/compose/runtime/changelist/d$l;", "Landroidx/compose/runtime/changelist/d$m;", "Landroidx/compose/runtime/changelist/d$n;", "Landroidx/compose/runtime/changelist/d$o;", "Landroidx/compose/runtime/changelist/d$p;", "Landroidx/compose/runtime/changelist/d$q;", "Landroidx/compose/runtime/changelist/d$r;", "Landroidx/compose/runtime/changelist/d$s;", "Landroidx/compose/runtime/changelist/d$u;", "Landroidx/compose/runtime/changelist/d$v;", "Landroidx/compose/runtime/changelist/d$w;", "Landroidx/compose/runtime/changelist/d$x;", "Landroidx/compose/runtime/changelist/d$y;", "Landroidx/compose/runtime/changelist/d$z;", "Landroidx/compose/runtime/changelist/d$A;", "Landroidx/compose/runtime/changelist/d$B;", "Landroidx/compose/runtime/changelist/d$C;", "Landroidx/compose/runtime/changelist/d$D;", "Landroidx/compose/runtime/changelist/d$E;", "Landroidx/compose/runtime/changelist/d$F;", "Landroidx/compose/runtime/changelist/d$G;", "Landroidx/compose/runtime/changelist/d$H;", "Landroidx/compose/runtime/changelist/d$I;", "Landroidx/compose/runtime/changelist/d$J;", "Landroidx/compose/runtime/changelist/d$K;", "Landroidx/compose/runtime/changelist/d$L;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f38205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38206b;

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$A;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class A extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final A f38207c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        public A() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            if (o22.f38081n != 0) {
                androidx.compose.runtime.G.c("Cannot reset when inserting");
            }
            o22.G();
            o22.f38087t = 0;
            o22.f38088u = o22.m() - o22.f38075h;
            o22.f38076i = 0;
            o22.f38077j = 0;
            o22.f38082o = 0;
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$B;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class B extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final B f38208c = new B();

        /* JADX WARN: Illegal instructions before constructor call */
        public B() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            l12.f38432e.b((Y41.a) aVar.b(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "effect" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$C;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C f38209c = new C();

        /* JADX WARN: Illegal instructions before constructor call */
        public C() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            o22.L();
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$D;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class D extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final D f38210c = new D();

        /* JADX WARN: Illegal instructions before constructor call */
        public D() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22039c2 c22039c2 = (C22039c2) aVar.b(0);
            R0<C22039c2, androidx.compose.runtime.internal.I> r02 = l12.f38434g;
            androidx.compose.runtime.internal.I iE2 = r02 != null ? r02.e(c22039c2) : null;
            if (iE2 != null) {
                ArrayList arrayList = l12.f38438k;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    l12.f38438k = arrayList;
                }
                arrayList.add(l12.f38430c);
                l12.f38430c = iE2.f38424c;
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "scope" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/d$E;", "Landroidx/compose/runtime/changelist/d;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class E extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Y41.q<InterfaceC22078i<?>, O2, A2, G0> f38211c;

        /* compiled from: Operation.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/i;", "<anonymous parameter 0>", "Landroidx/compose/runtime/O2;", "<anonymous parameter 1>", "Landroidx/compose/runtime/A2;", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/i;Landroidx/compose/runtime/O2;Landroidx/compose/runtime/A2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.q<InterfaceC22078i<?>, O2, A2, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f38212l = new a();

            public a() {
                super(3);
            }

            @Override // Y41.q
            public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC22078i<?> interfaceC22078i, O2 o22, A2 a22) {
                return G0.f406611a;
            }
        }

        @Y61.o
        public E() {
            this(0, 0, null, 7, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            this.f38211c.invoke(interfaceC22078i, o22, l12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String toString() {
            return "TestOperation(ints = " + this.f38205a + ", objects = " + this.f38206b + ")@" + System.identityHashCode(this);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public E(int i12, int i13, Y41.q qVar, int i14, C42822w c42822w) {
            i12 = (i14 & 1) != 0 ? 0 : i12;
            i13 = (i14 & 2) != 0 ? 0 : i13;
            qVar = (i14 & 4) != 0 ? a.f38212l : qVar;
            super(i12, i13, null);
            this.f38211c = qVar;
            ArrayList arrayList = new ArrayList(i12);
            for (int i15 = 0; i15 < i12; i15++) {
                arrayList.add(Integer.valueOf(i15));
            }
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i16 = 0; i16 < i13; i16++) {
                arrayList2.add(t.a(i16));
            }
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$F;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class F extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final F f38213c = new F();

        public F() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            int iC2;
            int iO2;
            int iA2 = aVar.a(0);
            int iO3 = o22.o();
            int i12 = o22.f38089v;
            int iM2 = o22.M(o22.q(i12), o22.f38069b);
            int iF2 = o22.f(o22.q(i12 + 1), o22.f38069b);
            for (int iMax = Math.max(iM2, iF2 - iA2); iMax < iF2; iMax++) {
                Object obj = o22.f38070c[o22.g(iMax)];
                if (obj instanceof C2) {
                    int i13 = iO3 - iMax;
                    C2 c22 = (C2) obj;
                    C22068g c22068g = c22.f37942b;
                    if (c22068g == null || !c22068g.a()) {
                        iC2 = -1;
                        iO2 = -1;
                    } else {
                        iC2 = o22.c(c22068g);
                        iO2 = o22.o() - o22.O(iC2);
                    }
                    l12.e(c22, i13, iC2, iO2);
                } else if (obj instanceof C22039c2) {
                    ((C22039c2) obj).c();
                }
            }
            if (!(iA2 > 0)) {
                androidx.compose.runtime.G.c("Check failed");
            }
            int i14 = o22.f38089v;
            int iM3 = o22.M(o22.q(i14), o22.f38069b);
            int iF3 = o22.f(o22.q(i14 + 1), o22.f38069b) - iA2;
            if (iF3 < iM3) {
                androidx.compose.runtime.G.c("Check failed");
            }
            o22.J(iF3, iA2, i14);
            int i15 = o22.f38076i;
            if (i15 >= iM3) {
                o22.f38076i = i15 - iA2;
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "count" : super.c(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$G;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class G extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final G f38214c = new G();

        public G() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            int iC2;
            int iO2;
            Object objB = aVar.b(0);
            C22068g c22068g = (C22068g) aVar.b(1);
            int iA2 = aVar.a(0);
            if (objB instanceof C2) {
                l12.f((C2) objB);
            }
            int iC3 = o22.c(c22068g);
            int iG2 = o22.g(o22.N(iC3, iA2));
            Object[] objArr = o22.f38070c;
            Object obj = objArr[iG2];
            objArr[iG2] = objB;
            if (!(obj instanceof C2)) {
                if (obj instanceof C22039c2) {
                    ((C22039c2) obj).c();
                    return;
                }
                return;
            }
            int iO3 = o22.o() - o22.N(iC3, iA2);
            C2 c22 = (C2) obj;
            C22068g c22068g2 = c22.f37942b;
            if (c22068g2 == null || !c22068g2.a()) {
                iC2 = -1;
                iO2 = -1;
            } else {
                iC2 = o22.c(c22068g2);
                iO2 = o22.o() - o22.O(iC2);
            }
            l12.e(c22, iO3, iC2, iO2);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "groupSlotIndex" : super.c(i12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "value" : t.b(i12, 1) ? "anchor" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$H;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class H extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final H f38215c = new H();

        /* JADX WARN: Illegal instructions before constructor call */
        public H() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            o22.V(aVar.b(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "data" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$I;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class I extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final I f38216c = new I();

        public I() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            interfaceC22078i.a(aVar.b(0), (Y41.p) aVar.b(1));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "value" : t.b(i12, 1) ? "block" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$J;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class J extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final J f38217c = new J();

        public J() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            Object objB = aVar.b(0);
            int iA2 = aVar.a(0);
            if (objB instanceof C2) {
                l12.f((C2) objB);
            }
            int iG2 = o22.g(o22.N(o22.f38087t, iA2));
            Object[] objArr = o22.f38070c;
            Object obj = objArr[iG2];
            objArr[iG2] = objB;
            if (obj instanceof C2) {
                l12.e((C2) obj, o22.o() - o22.N(o22.f38087t, iA2), -1, -1);
            } else if (obj instanceof C22039c2) {
                ((C22039c2) obj).c();
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "groupSlotIndex" : super.c(i12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "value" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$K;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class K extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final K f38218c = new K();

        public K() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            int iA2 = aVar.a(0);
            for (int i12 = 0; i12 < iA2; i12++) {
                interfaceC22078i.j();
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "count" : super.c(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$L;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class L extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final L f38219c = new L();

        /* JADX WARN: Illegal instructions before constructor call */
        public L() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            interfaceC22078i.c();
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$a;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$a, reason: case insensitive filesystem */
    public static final class C22041a extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22041a f38220c = new C22041a();

        public C22041a() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            o22.a(aVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "distance" : super.c(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$b;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$b, reason: case insensitive filesystem */
    public static final class C22042b extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22042b f38221c = new C22042b();

        public C22042b() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22068g c22068g = (C22068g) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof C2) {
                l12.f((C2) objB);
            }
            if (o22.f38081n != 0) {
                androidx.compose.runtime.G.c("Can only append a slot if not current inserting");
            }
            int i12 = o22.f38076i;
            int i13 = o22.f38077j;
            int iC2 = o22.c(c22068g);
            int iF2 = o22.f(o22.q(iC2 + 1), o22.f38069b);
            o22.f38076i = iF2;
            o22.f38077j = iF2;
            o22.v(1, iC2);
            if (i12 >= iF2) {
                i12++;
                i13++;
            }
            o22.f38070c[iF2] = objB;
            o22.f38076i = i12;
            o22.f38077j = i13;
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "anchor" : t.b(i12, 1) ? "value" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$c;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$c, reason: case insensitive filesystem */
    public static final class C22043c extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22043c f38222c = new C22043c();

        public C22043c() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            androidx.compose.runtime.internal.D d12 = (androidx.compose.runtime.internal.D) aVar.b(1);
            int i12 = d12 != null ? d12.f38422a : 0;
            a aVar2 = (a) aVar.b(0);
            if (i12 > 0) {
                interfaceC22078i = new F1(interfaceC22078i, i12);
            }
            aVar2.b(interfaceC22078i, o22, l12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "changes" : t.b(i12, 1) ? "effectiveNodeIndex" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$d;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$d, reason: collision with other inner class name */
    public static final class C1652d extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1652d f38223c = new C1652d();

        public C1652d() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            int i12 = ((androidx.compose.runtime.internal.D) aVar.b(0)).f38422a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = list.get(i13);
                int i14 = i12 + i13;
                interfaceC22078i.d(i14, obj);
                interfaceC22078i.h(i14, obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "effectiveNodeIndex" : t.b(i12, 1) ? "nodes" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$e;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$e, reason: case insensitive filesystem */
    public static final class C22044e extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22044e f38224c = new C22044e();

        public C22044e() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22183t1 c22183t1 = (C22183t1) aVar.b(2);
            C22183t1 c22183t12 = (C22183t1) aVar.b(3);
            androidx.compose.runtime.I i12 = (androidx.compose.runtime.I) aVar.b(1);
            C22153s1 c22153s1N = (C22153s1) aVar.b(0);
            if (c22153s1N == null && (c22153s1N = i12.n(c22183t1)) == null) {
                androidx.compose.runtime.G.d("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            if (o22.f38081n > 0 || o22.s(o22.f38087t + 1) != 1) {
                androidx.compose.runtime.G.c("Check failed");
            }
            int i13 = o22.f38087t;
            int i14 = o22.f38076i;
            int i15 = o22.f38077j;
            o22.a(1);
            o22.Q();
            o22.d();
            O2 o2E = c22153s1N.f38558a.e();
            try {
                O2.f38067y.getClass();
                List listA = O2.a.a(o2E, 2, o22, false, true, true);
                o2E.e(true);
                o22.j();
                o22.i();
                o22.f38087t = i13;
                o22.f38076i = i14;
                o22.f38077j = i15;
                C22039c2.a aVar2 = C22039c2.f38180h;
                M m12 = c22183t12.f38767c;
                aVar2.getClass();
                C22039c2.a.a(o22, listA, m12);
            } catch (Throwable th2) {
                o2E.e(false);
                throw th2;
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "resolvedState" : t.b(i12, 1) ? "resolvedCompositionContext" : t.b(i12, 2) ? InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME : t.b(i12, 3) ? InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$f;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$f, reason: case insensitive filesystem */
    public static final class C22045f extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22045f f38225c = new C22045f();

        /* JADX WARN: Illegal instructions before constructor call */
        public C22045f() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            androidx.compose.runtime.G.e(o22, l12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$g;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$g, reason: case insensitive filesystem */
    public static final class C22046g extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22046g f38226c = new C22046g();

        public C22046g() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            int i12;
            androidx.compose.runtime.internal.D d12 = (androidx.compose.runtime.internal.D) aVar.b(0);
            int iC2 = o22.c((C22068g) aVar.b(1));
            if (!(o22.f38087t < iC2)) {
                androidx.compose.runtime.G.c("Check failed");
            }
            f.a(o22, interfaceC22078i, iC2);
            int i13 = o22.f38087t;
            int iE2 = o22.f38089v;
            while (iE2 >= 0 && !o22.w(iE2)) {
                iE2 = o22.E(iE2, o22.f38069b);
            }
            int iS2 = iE2 + 1;
            int iK2 = 0;
            while (iS2 < i13) {
                if (o22.t(i13, iS2)) {
                    if (o22.w(iS2)) {
                        iK2 = 0;
                    }
                    iS2++;
                } else {
                    iK2 += o22.w(iS2) ? 1 : o22.D(iS2);
                    iS2 += o22.s(iS2);
                }
            }
            while (true) {
                i12 = o22.f38087t;
                if (i12 >= iC2) {
                    break;
                }
                if (o22.t(iC2, i12)) {
                    int i14 = o22.f38087t;
                    if (i14 < o22.f38088u && (o22.f38069b[(o22.q(i14) * 5) + 1] & 1073741824) != 0) {
                        interfaceC22078i.e(o22.C(o22.f38087t));
                        iK2 = 0;
                    }
                    o22.Q();
                } else {
                    iK2 += o22.K();
                }
            }
            if (i12 != iC2) {
                androidx.compose.runtime.G.c("Check failed");
            }
            d12.f38422a = iK2;
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "effectiveNodeIndexOut" : t.b(i12, 1) ? "anchor" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$h;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$h, reason: case insensitive filesystem */
    public static final class C22047h extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22047h f38227c = new C22047h();

        /* JADX WARN: Illegal instructions before constructor call */
        public C22047h() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            for (Object obj : (Object[]) aVar.b(0)) {
                interfaceC22078i.e(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "nodes" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$i;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$i, reason: case insensitive filesystem */
    public static final class C22048i extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22048i f38228c = new C22048i();

        public C22048i() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            ((l) aVar.b(0)).invoke((androidx.compose.runtime.H) aVar.b(1));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "anchor" : t.b(i12, 1) ? "composition" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$j;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$j, reason: case insensitive filesystem */
    public static final class C22049j extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22049j f38229c = new C22049j();

        /* JADX WARN: Illegal instructions before constructor call */
        public C22049j() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            o22.i();
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$k;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$k, reason: case insensitive filesystem */
    public static final class C22050k extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22050k f38230c = new C22050k();

        /* JADX WARN: Illegal instructions before constructor call */
        public C22050k() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            f.a(o22, interfaceC22078i, 0);
            o22.i();
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$l;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.changelist.d$l, reason: case insensitive filesystem */
    public static final class C22051l extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C22051l f38231c = new C22051l();

        /* JADX WARN: Illegal instructions before constructor call */
        public C22051l() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            androidx.compose.runtime.collection.e<C2> eVar;
            C22039c2 c22039c2 = (C22039c2) aVar.b(0);
            R0<C22039c2, androidx.compose.runtime.internal.I> r02 = l12.f38434g;
            if (r02 == null || r02.e(c22039c2) == null) {
                return;
            }
            ArrayList arrayList = l12.f38438k;
            if (arrayList != null && (eVar = (androidx.compose.runtime.collection.e) C22026a.b(1, arrayList)) != null) {
                l12.f38430c = eVar;
            }
            r02.k(c22039c2);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "scope" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$m;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final m f38232c = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        public m() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22068g c22068g = (C22068g) aVar.b(0);
            c22068g.getClass();
            o22.k(o22.c(c22068g));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "anchor" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$n;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final n f38233c = new n();

        /* JADX WARN: Illegal instructions before constructor call */
        public n() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            o22.k(0);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$o;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final o f38234c = new o();

        public o() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            Object objInvoke = ((Y41.a) aVar.b(0)).invoke();
            C22068g c22068g = (C22068g) aVar.b(1);
            int iA2 = aVar.a(0);
            c22068g.getClass();
            o22.X(o22.c(c22068g), objInvoke);
            interfaceC22078i.h(iA2, objInvoke);
            interfaceC22078i.e(objInvoke);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "insertIndex" : super.c(i12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "factory" : t.b(i12, 1) ? "groupAnchor" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$p;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final p f38235c = new p();

        public p() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            L2 l22 = (L2) aVar.b(1);
            C22068g c22068g = (C22068g) aVar.b(0);
            o22.d();
            c22068g.getClass();
            o22.y(l22, l22.a(c22068g));
            o22.j();
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "anchor" : t.b(i12, 1) ? InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$q;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final q f38236c = new q();

        public q() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            L2 l22 = (L2) aVar.b(1);
            C22068g c22068g = (C22068g) aVar.b(0);
            c cVar = (c) aVar.b(2);
            O2 o2E = l22.e();
            try {
                if (!cVar.f38204b.e()) {
                    androidx.compose.runtime.G.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                }
                cVar.f38203a.c(interfaceC22078i, o2E, l12);
                G0 g02 = G0.f406611a;
                o2E.e(true);
                o22.d();
                c22068g.getClass();
                o22.y(l22, l22.a(c22068g));
                o22.j();
            } catch (Throwable th2) {
                o2E.e(false);
                throw th2;
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "anchor" : t.b(i12, 1) ? InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME : t.b(i12, 2) ? "fixups" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$r;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final r f38237c = new r();

        public r() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22068g c22068g;
            int iC2;
            int iA2 = aVar.a(0);
            if (o22.f38081n != 0) {
                androidx.compose.runtime.G.c("Cannot move a group while inserting");
            }
            if (!(iA2 >= 0)) {
                androidx.compose.runtime.G.c("Parameter offset is out of bounds");
            }
            if (iA2 == 0) {
                return;
            }
            int i12 = o22.f38087t;
            int i13 = o22.f38089v;
            int i14 = o22.f38088u;
            int i15 = i12;
            while (iA2 > 0) {
                i15 += o22.f38069b[(o22.q(i15) * 5) + 3];
                if (i15 > i14) {
                    androidx.compose.runtime.G.c("Parameter offset is out of bounds");
                }
                iA2--;
            }
            int i16 = o22.f38069b[(o22.q(i15) * 5) + 3];
            int iF2 = o22.f(o22.q(o22.f38087t), o22.f38069b);
            int iF3 = o22.f(o22.q(i15), o22.f38069b);
            int i17 = i15 + i16;
            int iF4 = o22.f(o22.q(i17), o22.f38069b);
            int i18 = iF4 - iF3;
            o22.v(i18, Math.max(o22.f38087t - 1, 0));
            o22.u(i16);
            int[] iArr = o22.f38069b;
            int iQ2 = o22.q(i17) * 5;
            C42756l.k(o22.q(i12) * 5, iQ2, (i16 * 5) + iQ2, iArr, iArr);
            if (i18 > 0) {
                Object[] objArr = o22.f38070c;
                int iG2 = o22.g(iF3 + i18);
                System.arraycopy(objArr, iG2, objArr, iF2, o22.g(iF4 + i18) - iG2);
            }
            int i19 = iF3 + i18;
            int i22 = i19 - iF2;
            int i23 = o22.f38078k;
            int i24 = o22.f38079l;
            int length = o22.f38070c.length;
            int i25 = o22.f38080m;
            int i26 = i12 + i16;
            int i27 = i12;
            while (i27 < i26) {
                int iQ3 = o22.q(i27);
                int i28 = i23;
                int i29 = i22;
                iArr[(iQ3 * 5) + 4] = O2.h(O2.h(o22.f(iQ3, iArr) - i22, i25 < iQ3 ? 0 : i28, i24, length), o22.f38078k, o22.f38079l, o22.f38070c.length);
                i27++;
                i23 = i28;
                i22 = i29;
                i24 = i24;
                length = length;
            }
            int i32 = i17 + i16;
            int iN2 = o22.n();
            int iB2 = N2.b(o22.f38071d, i17, iN2);
            ArrayList arrayList = new ArrayList();
            if (iB2 >= 0) {
                while (iB2 < o22.f38071d.size() && (iC2 = o22.c((c22068g = o22.f38071d.get(iB2)))) >= i17 && iC2 < i32) {
                    arrayList.add(c22068g);
                    o22.f38071d.remove(iB2);
                }
            }
            int i33 = i12 - i17;
            int size = arrayList.size();
            for (int i34 = 0; i34 < size; i34++) {
                C22068g c22068g2 = (C22068g) arrayList.get(i34);
                int iC3 = o22.c(c22068g2) + i33;
                if (iC3 >= o22.f38074g) {
                    c22068g2.f38401a = -(iN2 - iC3);
                } else {
                    c22068g2.f38401a = iC3;
                }
                o22.f38071d.add(N2.b(o22.f38071d, iC3, iN2), c22068g2);
            }
            if (o22.I(i17, i16)) {
                androidx.compose.runtime.G.c("Unexpectedly removed anchors");
            }
            o22.l(i13, o22.f38088u, i12);
            if (i18 > 0) {
                o22.J(i19, i18, i17 - 1);
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "offset" : super.c(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$s;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final s f38238c = new s();

        public s() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            interfaceC22078i.g(aVar.a(0), aVar.a(1), aVar.a(2));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME : i12 == 1 ? InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME : i12 == 2 ? "count" : super.c(i12);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/d$t;", "T", "", "offset", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X41.g
    public static final class t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f38239a;

        private /* synthetic */ t(int i12) {
            this.f38239a = i12;
        }

        public static final /* synthetic */ t a(int i12) {
            return new t(i12);
        }

        public static final boolean b(int i12, int i13) {
            return i12 == i13;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof t) {
                return this.f38239a == ((t) obj).f38239a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f38239a);
        }

        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ObjectParameter(offset="), this.f38239a, ')');
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$u;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final u f38240c = new u();

        public u() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22068g c22068g = (C22068g) aVar.b(0);
            int iA2 = aVar.a(0);
            interfaceC22078i.j();
            c22068g.getClass();
            interfaceC22078i.d(iA2, o22.C(o22.c(c22068g)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "insertIndex" : super.c(i12);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "groupAnchor" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$v;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final v f38241c = new v();

        public v() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            InterfaceC22053d0 interfaceC22053d0 = (InterfaceC22053d0) aVar.b(0);
            C22183t1 c22183t1 = (C22183t1) aVar.b(2);
            ((androidx.compose.runtime.I) aVar.b(1)).m(c22183t1, androidx.compose.runtime.G.f(interfaceC22053d0, c22183t1, o22, null), interfaceC22078i);
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "composition" : t.b(i12, 1) ? "parentCompositionContext" : t.b(i12, 2) ? "reference" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$w;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final w f38242c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        public w() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            l12.f((C2) aVar.b(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "value" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$x;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x extends d {
        static {
            new x();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public x() {
            int i12 = 1;
            super(0, i12, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            C22039c2 c22039c2 = (C22039c2) aVar.b(0);
            androidx.compose.runtime.internal.I i12 = new androidx.compose.runtime.internal.I(l12.f38428a);
            R0<C22039c2, androidx.compose.runtime.internal.I> r0B = l12.f38434g;
            if (r0B == null) {
                r0B = i1.b();
                l12.f38434g = r0B;
            }
            r0B.m(c22039c2, i12);
            l12.f38430c.b(new C2(i12, null));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String d(int i12) {
            return t.b(i12, 0) ? "scope" : super.d(i12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$y;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final y f38243c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        public y() {
            int i12 = 0;
            super(i12, i12, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            androidx.compose.runtime.G.h(o22, l12);
        }
    }

    /* compiled from: Operation.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/d$z;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class z extends d {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final z f38244c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        public z() {
            int i12 = 2;
            super(i12, 0, i12, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        public final void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12) {
            interfaceC22078i.f(aVar.a(0), aVar.a(1));
        }

        @Override // androidx.compose.runtime.changelist.d
        @k
        public final String c(int i12) {
            return i12 == 0 ? "removeIndex" : i12 == 1 ? "count" : super.c(i12);
        }
    }

    public /* synthetic */ d(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13, null);
    }

    public abstract void a(@k g.a aVar, @k InterfaceC22078i interfaceC22078i, @k O2 o22, @k androidx.compose.runtime.internal.L l12);

    @k
    public final String b() {
        String strL0 = m0.f406844a.b(getClass()).l0();
        return strL0 == null ? "" : strL0;
    }

    @k
    public String c(int i12) {
        return androidx.appcompat.app.r.p("IntParameter(", i12, ')');
    }

    @k
    public String d(int i12) {
        return androidx.appcompat.app.r.p("ObjectParameter(", i12, ')');
    }

    @k
    public String toString() {
        return b();
    }

    public d(int i12, int i13, C42822w c42822w) {
        this.f38205a = i12;
        this.f38206b = i13;
    }
}
