package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC22222g;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.focus.InterfaceC22235u;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22390v0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.node.C22407e;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import java.util.HashSet;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: BackwardsCompatNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/modifier/q;", "Landroidx/compose/ui/node/M0;", "Landroidx/compose/ui/node/F;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/focus/N;", "Landroidx/compose/ui/focus/X;", "Landroidx/compose/ui/node/K0;", "Landroidx/compose/ui/draw/e;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22403c extends v.d implements K, InterfaceC22438u, T0, P0, androidx.compose.ui.modifier.k, androidx.compose.ui.modifier.q, M0, F, InterfaceC22442w, InterfaceC22224i, androidx.compose.ui.focus.N, androidx.compose.ui.focus.X, K0, androidx.compose.ui.draw.e {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public v.c f40737p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40738q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.modifier.a f40739r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public HashSet<androidx.compose.ui.modifier.c<?>> f40740s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f40741t;

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22403c.this.m2();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/c$b", "Landroidx/compose/ui/node/J0$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c$b */
    public static final class b implements J0.b {
        public b() {
        }

        @Override // androidx.compose.ui.node.J0.b
        public final void g() {
            C22403c c22403c = C22403c.this;
            if (c22403c.f40741t == null) {
                c22403c.D(C22421l.e(c22403c, 128));
            }
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.c$c, reason: collision with other inner class name */
    public static final class C1670c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public C1670c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22403c c22403c = C22403c.this;
            ((androidx.compose.ui.modifier.d) c22403c.f40737p).Q1(c22403c);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return ((androidx.compose.ui.layout.N) this.f40737p).A(x12, interfaceC22391w, i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k, androidx.compose.ui.node.P0
    public final void B() {
        if (this.f40737p instanceof androidx.compose.ui.input.pointer.J) {
            p1();
        }
    }

    @Override // androidx.compose.ui.node.F
    public final void D(@Y61.k androidx.compose.ui.layout.A a12) {
        this.f40741t = a12;
        v.c cVar = this.f40737p;
        if (cVar instanceof androidx.compose.ui.layout.A0) {
            ((androidx.compose.ui.layout.A0) cVar).D(a12);
        }
    }

    @Override // androidx.compose.ui.focus.N
    public final void E0(@Y61.k androidx.compose.ui.focus.J j12) {
        v.c cVar = this.f40737p;
        if (!(cVar instanceof InterfaceC22235u)) {
            C47949a.b("applyFocusProperties called on wrong node");
        }
        ((InterfaceC22235u) cVar).X1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.k, androidx.compose.ui.modifier.q
    public final Object G(@Y61.k androidx.compose.ui.modifier.s sVar) {
        C22437t0 c22437t0;
        this.f40740s.add(sVar);
        if (!this.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = this.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(this);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 32) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 32) != 0) {
                        AbstractC22425n abstractC22425nB = dVar;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof androidx.compose.ui.modifier.k) {
                                androidx.compose.ui.modifier.k kVar = (androidx.compose.ui.modifier.k) abstractC22425nB;
                                if (kVar.c1().a(sVar)) {
                                    return kVar.c1().b(sVar);
                                }
                            } else if ((abstractC22425nB.f42882d & 32) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar2 = abstractC22425nB.f40861q;
                                int i12 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar = eVar;
                                while (dVar2 != null) {
                                    if ((dVar2.f42882d & 32) != 0) {
                                        i12++;
                                        eVar = eVar;
                                        if (i12 == 1) {
                                            abstractC22425nB = dVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar);
                        }
                    }
                    dVar = dVar.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        return sVar.f40530a.invoke();
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        v.c cVar = this.f40737p;
        if (cVar instanceof androidx.compose.ui.layout.D0) {
            ((androidx.compose.ui.layout.D0) cVar).M(j12);
        }
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        int i12;
        androidx.compose.ui.semantics.l lVarQ = ((androidx.compose.ui.semantics.q) this.f40737p).Q();
        androidx.compose.ui.semantics.l lVar = (androidx.compose.ui.semantics.l) f12;
        if (lVarQ.f41788d) {
            lVar.f41788d = true;
        }
        if (lVarQ.f41789e) {
            lVar.f41789e = true;
        }
        androidx.collection.R0<androidx.compose.ui.semantics.E<?>, Object> r02 = lVarQ.f41786b;
        Object[] objArr = r02.f25722b;
        Object[] objArr2 = r02.f25723c;
        long[] jArr = r02.f25721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr[i13];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j12) < 128) {
                        int i17 = (i13 << 3) + i16;
                        Object obj = objArr[i17];
                        Object obj2 = objArr2[i17];
                        androidx.compose.ui.semantics.E<?> e12 = (androidx.compose.ui.semantics.E) obj;
                        androidx.collection.R0<androidx.compose.ui.semantics.E<?>, Object> r03 = lVar.f41786b;
                        if (!r03.b(e12)) {
                            r03.m(e12, obj2);
                        } else if (obj2 instanceof C22553a) {
                            C22553a c22553a = (C22553a) r03.e(e12);
                            String str = c22553a.f41727a;
                            if (str == null) {
                                str = ((C22553a) obj2).f41727a;
                            }
                            InterfaceC43072x interfaceC43072x = c22553a.f41728b;
                            if (interfaceC43072x == null) {
                                interfaceC43072x = ((C22553a) obj2).f41728b;
                            }
                            r03.m(e12, new C22553a(str, interfaceC43072x));
                        }
                        i12 = 8;
                    } else {
                        i12 = i14;
                    }
                    j12 >>= i12;
                    i16++;
                    i14 = i12;
                }
                if (i15 != i14) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((InterfaceC22390v0) this.f40737p).P(abstractC22443w0);
    }

    @Override // androidx.compose.ui.node.P0
    public final void V() {
        ((androidx.compose.ui.input.pointer.J) this.f40737p).getF40158e().getClass();
    }

    @Override // androidx.compose.ui.node.P0
    public final boolean W1() {
        ((androidx.compose.ui.input.pointer.J) this.f40737p).getF40158e().getClass();
        return true;
    }

    @Override // androidx.compose.ui.modifier.k
    @Y61.k
    public final androidx.compose.ui.modifier.j c1() {
        androidx.compose.ui.modifier.a aVar = this.f40739r;
        return aVar != null ? aVar : androidx.compose.ui.modifier.b.f40529a;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        k2(true);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        l2();
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        return ((androidx.compose.ui.layout.N) this.f40737p).f(interfaceC22369k0, interfaceC22363h0, j12);
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final androidx.compose.ui.unit.d getDensity() {
        return C22421l.g(this).f40608B;
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final LayoutDirection getLayoutDirection() {
        return C22421l.g(this).f40609C;
    }

    @Override // androidx.compose.ui.draw.e
    public final long i() {
        return androidx.compose.ui.unit.v.c(C22421l.e(this, 128).f40347d);
    }

    public final void k2(boolean z12) {
        if (!this.f42893o) {
            C47949a.b("initializeModifier called on unattached node");
        }
        v.c cVar = this.f40737p;
        if ((this.f42882d & 32) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                ((AndroidComposeView) C22421l.h(this)).I(new a());
            }
            if (cVar instanceof androidx.compose.ui.modifier.m) {
                androidx.compose.ui.modifier.m<?> mVar = (androidx.compose.ui.modifier.m) cVar;
                androidx.compose.ui.modifier.a aVar = this.f40739r;
                if (aVar == null || !aVar.a(mVar.getKey())) {
                    androidx.compose.ui.modifier.a aVar2 = new androidx.compose.ui.modifier.a(null);
                    aVar2.f40528a = mVar;
                    this.f40739r = aVar2;
                    C22407e.a aVar3 = C22407e.f40775a;
                    if (C22421l.g(this).f40615I.f40877d.f40701p) {
                        androidx.compose.ui.modifier.i modifierLocalManager = C22421l.h(this).getModifierLocalManager();
                        androidx.compose.ui.modifier.s<?> key = mVar.getKey();
                        modifierLocalManager.f40532b.b(this);
                        modifierLocalManager.f40533c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f40528a = mVar;
                    androidx.compose.ui.modifier.i modifierLocalManager2 = C22421l.h(this).getModifierLocalManager();
                    androidx.compose.ui.modifier.s<?> key2 = mVar.getKey();
                    modifierLocalManager2.f40532b.b(this);
                    modifierLocalManager2.f40533c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f42882d & 4) != 0) {
            if (cVar instanceof androidx.compose.ui.draw.m) {
                this.f40738q = true;
            }
            if (!z12) {
                C22421l.e(this, 2).C1();
            }
        }
        if ((this.f42882d & 2) != 0) {
            C22407e.a aVar4 = C22407e.f40775a;
            if (C22421l.g(this).f40615I.f40877d.f40701p) {
                AbstractC22443w0 abstractC22443w0 = this.f42887i;
                ((L) abstractC22443w0).f2(this);
                I0 i02 = abstractC22443w0.f40907J;
                if (i02 != null) {
                    i02.invalidate();
                }
            }
            if (!z12) {
                C22421l.e(this, 2).C1();
                C22421l.g(this).Y();
            }
        }
        if (cVar instanceof androidx.compose.ui.layout.O0) {
            ((androidx.compose.ui.layout.O0) cVar).X(C22421l.g(this));
        }
        if ((this.f42882d & 128) != 0) {
            if (cVar instanceof androidx.compose.ui.layout.D0) {
                C22407e.a aVar5 = C22407e.f40775a;
                if (C22421l.g(this).f40615I.f40877d.f40701p) {
                    C22421l.g(this).Y();
                }
            }
            if (cVar instanceof androidx.compose.ui.layout.A0) {
                this.f40741t = null;
                C22407e.a aVar6 = C22407e.f40775a;
                if (C22421l.g(this).f40615I.f40877d.f40701p) {
                    J0 j0H = C22421l.h(this);
                    AndroidComposeView androidComposeView = (AndroidComposeView) j0H;
                    androidComposeView.f40988P.f40813f.b(new b());
                    androidComposeView.L(null);
                }
            }
        }
        if ((this.f42882d & 256) != 0 && (cVar instanceof InterfaceC22390v0)) {
            C22407e.a aVar7 = C22407e.f40775a;
            if (C22421l.g(this).f40615I.f40877d.f40701p) {
                C22421l.g(this).Y();
            }
        }
        if (cVar instanceof androidx.compose.ui.focus.V) {
            ((androidx.compose.ui.focus.V) cVar).b1().f39152a.b(this);
        }
        if ((this.f42882d & 16) != 0 && (cVar instanceof androidx.compose.ui.input.pointer.J)) {
            ((androidx.compose.ui.input.pointer.J) cVar).getF40158e().f40154a = this.f42887i;
        }
        if ((this.f42882d & 8) != 0) {
            ((AndroidComposeView) C22421l.h(this)).E();
        }
    }

    public final void l2() {
        if (!this.f42893o) {
            C47949a.b("unInitializeModifier called on unattached node");
        }
        v.c cVar = this.f40737p;
        if ((this.f42882d & 32) != 0) {
            if (cVar instanceof androidx.compose.ui.modifier.m) {
                androidx.compose.ui.modifier.i modifierLocalManager = C22421l.h(this).getModifierLocalManager();
                androidx.compose.ui.modifier.s key = ((androidx.compose.ui.modifier.m) cVar).getKey();
                modifierLocalManager.f40534d.b(C22421l.g(this));
                modifierLocalManager.f40535e.b(key);
                modifierLocalManager.a();
            }
            if (cVar instanceof androidx.compose.ui.modifier.d) {
                ((androidx.compose.ui.modifier.d) cVar).Q1(C22407e.f40775a);
            }
        }
        if ((this.f42882d & 8) != 0) {
            ((AndroidComposeView) C22421l.h(this)).E();
        }
        if (cVar instanceof androidx.compose.ui.focus.V) {
            ((androidx.compose.ui.focus.V) cVar).b1().f39152a.j(this);
        }
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return ((androidx.compose.ui.layout.N) this.f40737p).m(x12, interfaceC22391w, i12);
    }

    public final void m2() {
        if (this.f42893o) {
            this.f40740s.clear();
            C22421l.h(this).getSnapshotObserver().b(this, C22407e.f40777c, new C1670c());
        }
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return this.f42893o;
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        ((androidx.compose.ui.input.pointer.J) this.f40737p).getF40158e().b();
    }

    @Override // androidx.compose.ui.node.M0
    @Y61.l
    public final Object r(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.l Object obj) {
        return ((androidx.compose.ui.layout.H0) this.f40737p).r(dVar, obj);
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        ((androidx.compose.ui.input.pointer.J) this.f40737p).getF40158e().c(c22340s, pointerEventPass);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void r1() {
        this.f40738q = true;
        C22440v.a(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k P p12) {
        v.c cVar = this.f40737p;
        androidx.compose.ui.draw.n nVar = (androidx.compose.ui.draw.n) cVar;
        if (this.f40738q && (cVar instanceof androidx.compose.ui.draw.m)) {
            if (cVar instanceof androidx.compose.ui.draw.m) {
                C22421l.h(this).getSnapshotObserver().b(this, C22407e.f40776b, new C22405d(cVar, this));
            }
            this.f40738q = false;
        }
        nVar.t(p12);
    }

    @Y61.k
    public final String toString() {
        return this.f40737p.toString();
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@Y61.k FocusStateImpl focusStateImpl) {
        v.c cVar = this.f40737p;
        if (!(cVar instanceof InterfaceC22222g)) {
            C47949a.b("onFocusEvent called on wrong node");
        }
        ((InterfaceC22222g) cVar).u(focusStateImpl);
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return ((androidx.compose.ui.layout.N) this.f40737p).x(x12, interfaceC22391w, i12);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return ((androidx.compose.ui.layout.N) this.f40737p).z(x12, interfaceC22391w, i12);
    }
}
