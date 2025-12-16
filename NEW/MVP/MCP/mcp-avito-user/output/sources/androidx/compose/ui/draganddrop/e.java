package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.Z0;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: DragAndDropNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/d;", "Landroidx/compose/ui/draganddrop/m;", "Landroidx/compose/ui/draganddrop/p;", "Landroidx/compose/ui/draganddrop/o;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends v.d implements TraversableNode, d, m, p, o {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f39000v = 0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Y41.p<? super n, ? super l0.g, G0> f39001p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Y41.l<androidx.compose.ui.draganddrop.b, o> f39002q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Object f39003r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public e f39004s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public o f39005t;

    /* renamed from: u, reason: collision with root package name */
    public long f39006u;

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draganddrop/e$a;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DragAndDropNode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e$a$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.draganddrop.e$a$a, reason: collision with other inner class name */
        public static final class C1656a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1656a f39007a = new C1656a();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "currentNode", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/draganddrop/e;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<e, TraversableNode.Companion.TraverseDescendantsAction> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.draganddrop.b f39008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f39008l = bVar;
        }

        @Override // Y41.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(e eVar) {
            e eVar2 = eVar;
            if (!eVar2.f42880b.f42893o) {
                return TraversableNode.Companion.TraverseDescendantsAction.f40696c;
            }
            o oVar = eVar2.f39005t;
            if (oVar != null) {
                oVar.m0(this.f39008l);
            }
            eVar2.f39005t = null;
            eVar2.f39004s = null;
            return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "T", "child", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "androidx/compose/ui/draganddrop/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<e, TraversableNode.Companion.TraverseDescendantsAction> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h f39009l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f39010m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.draganddrop.b f39011n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l0.h hVar, e eVar, androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f39009l = hVar;
            this.f39010m = eVar;
            this.f39011n = bVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.ui.node.TraversableNode] */
        @Override // Y41.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(e eVar) {
            e eVar2 = eVar;
            e eVar3 = eVar2;
            int i12 = e.f39000v;
            if (!C22421l.h(this.f39010m).getDragAndDropManager().b(eVar3) || !l.b(eVar3, r.a(this.f39011n))) {
                return TraversableNode.Companion.TraverseDescendantsAction.f40695b;
            }
            this.f39009l.f406842b = eVar2;
            return TraversableNode.Companion.TraverseDescendantsAction.f40697d;
        }
    }

    static {
        new a(null);
    }

    public e() {
        this(null, null, 3, null);
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void D1(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        TraversableNode traversableNode;
        e eVar;
        e eVar2 = this.f39004s;
        if (eVar2 == null || !l.b(eVar2, r.a(bVar))) {
            if (this.f42880b.f42893o) {
                l0.h hVar = new l0.h();
                Z0.c(this, new c(hVar, this, bVar));
                traversableNode = (TraversableNode) hVar.f406842b;
            } else {
                traversableNode = null;
            }
            eVar = (e) traversableNode;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.w0(bVar);
            eVar.D1(bVar);
            o oVar = this.f39005t;
            if (oVar != null) {
                oVar.T(bVar);
            }
        } else if (eVar == null && eVar2 != null) {
            o oVar2 = this.f39005t;
            if (oVar2 != null) {
                oVar2.w0(bVar);
                oVar2.D1(bVar);
            }
            eVar2.T(bVar);
        } else if (!L.f(eVar, eVar2)) {
            if (eVar != null) {
                eVar.w0(bVar);
                eVar.D1(bVar);
            }
            if (eVar2 != null) {
                eVar2.T(bVar);
            }
        } else if (eVar != null) {
            eVar.D1(bVar);
        } else {
            o oVar3 = this.f39005t;
            if (oVar3 != null) {
                oVar3.D1(bVar);
            }
        }
        this.f39004s = eVar;
    }

    @Override // androidx.compose.ui.draganddrop.m
    public final void F(long j12) {
        if (this.f39001p == null) {
            C47949a.b("Check failed.");
        }
        C22421l.h(this).getDragAndDropManager().a(this, j12);
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        this.f39006u = j12;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void R(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        o oVar = this.f39005t;
        if (oVar != null) {
            oVar.R(bVar);
            return;
        }
        e eVar = this.f39004s;
        if (eVar != null) {
            eVar.R(bVar);
        }
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void T(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        o oVar = this.f39005t;
        if (oVar != null) {
            oVar.T(bVar);
        }
        e eVar = this.f39004s;
        if (eVar != null) {
            eVar.T(bVar);
        }
        this.f39004s = null;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final boolean a0(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        e eVar = this.f39004s;
        if (eVar != null) {
            return eVar.a0(bVar);
        }
        o oVar = this.f39005t;
        if (oVar != null) {
            return oVar.a0(bVar);
        }
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f39005t = null;
        this.f39004s = null;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void m0(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        b bVar2 = new b(bVar);
        if (bVar2.invoke(this) != TraversableNode.Companion.TraverseDescendantsAction.f40695b) {
            return;
        }
        Z0.c(this, bVar2);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @Y61.k
    /* renamed from: o0, reason: from getter */
    public final Object getF39003r() {
        return this.f39003r;
    }

    @Override // androidx.compose.ui.draganddrop.m
    public final boolean v0() {
        C22421l.h(this).getDragAndDropManager().getClass();
        return true;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void w0(@Y61.k androidx.compose.ui.draganddrop.b bVar) {
        o oVar = this.f39005t;
        if (oVar != null) {
            oVar.w0(bVar);
            return;
        }
        e eVar = this.f39004s;
        if (eVar != null) {
            eVar.w0(bVar);
        }
    }

    public e(Y41.p pVar, Y41.l lVar, int i12, C42822w c42822w) {
        pVar = (i12 & 1) != 0 ? null : pVar;
        lVar = (i12 & 2) != 0 ? null : lVar;
        this.f39001p = pVar;
        this.f39002q = lVar;
        this.f39003r = a.C1656a.f39007a;
        u.f42871b.getClass();
        this.f39006u = 0L;
    }
}
