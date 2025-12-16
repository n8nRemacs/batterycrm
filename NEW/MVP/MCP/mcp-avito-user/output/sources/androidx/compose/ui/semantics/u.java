package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.T0;
import androidx.compose.ui.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: SemanticsNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/u;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v.d f41794a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41795b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f41796c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f41797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41798e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public u f41799f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41800g;

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/ui/semantics/u$a", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends v.d implements T0 {

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f41801p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super F, G0> lVar) {
            this.f41801p = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.compose.ui.node.T0
        public final void O(F f12) {
            this.f41801p.invoke(f12);
        }
    }

    public u(@Y61.k v.d dVar, boolean z12, @Y61.k LayoutNode layoutNode, @Y61.k l lVar) {
        this.f41794a = dVar;
        this.f41795b = z12;
        this.f41796c = layoutNode;
        this.f41797d = lVar;
        this.f41800g = layoutNode.f40627c;
    }

    public static /* synthetic */ List h(int i12, u uVar) {
        return uVar.g((i12 & 1) != 0 ? !uVar.f41795b : false, (i12 & 2) == 0);
    }

    public final u a(i iVar, Y41.l<? super F, G0> lVar) {
        l lVar2 = new l();
        lVar2.f41788d = false;
        lVar2.f41789e = false;
        lVar.invoke(lVar2);
        u uVar = new u(new a(lVar), false, new LayoutNode(true, this.f41800g + (iVar != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000)), lVar2);
        uVar.f41798e = true;
        uVar.f41799f = this;
        return uVar;
    }

    public final void b(LayoutNode layoutNode, ArrayList arrayList) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarN = layoutNode.N();
        LayoutNode[] layoutNodeArr = eVarN.f38260b;
        int i12 = eVarN.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (layoutNode2.m() && !layoutNode2.f40625S) {
                if (layoutNode2.f40615I.d(8)) {
                    arrayList.add(v.a(layoutNode2, this.f41795b));
                } else {
                    b(layoutNode2, arrayList);
                }
            }
        }
    }

    @Y61.l
    public final AbstractC22443w0 c() {
        if (this.f41798e) {
            u uVarJ = j();
            if (uVarJ != null) {
                return uVarJ.c();
            }
            return null;
        }
        InterfaceC22419k interfaceC22419kB = v.b(this.f41796c);
        if (interfaceC22419kB == null) {
            interfaceC22419kB = this.f41794a;
        }
        return C22421l.e(interfaceC22419kB, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            u uVar = (u) arrayList.get(size2);
            if (uVar.l()) {
                arrayList2.add(uVar);
            } else if (!uVar.f41797d.f41789e) {
                uVar.d(arrayList, arrayList2);
            }
        }
    }

    @Y61.k
    public final l0.j e() {
        l0.j jVarP;
        AbstractC22443w0 abstractC22443w0C = c();
        if (abstractC22443w0C != null) {
            if (!abstractC22443w0C.j1().f42893o) {
                abstractC22443w0C = null;
            }
            if (abstractC22443w0C != null && (jVarP = androidx.compose.ui.layout.B.c(abstractC22443w0C).P(abstractC22443w0C, true)) != null) {
                return jVarP;
            }
        }
        l0.j.f413388e.getClass();
        return l0.j.f413389f;
    }

    @Y61.k
    public final l0.j f() {
        l0.j jVarB;
        AbstractC22443w0 abstractC22443w0C = c();
        if (abstractC22443w0C != null) {
            if (!abstractC22443w0C.j1().f42893o) {
                abstractC22443w0C = null;
            }
            if (abstractC22443w0C != null && (jVarB = androidx.compose.ui.layout.B.b(abstractC22443w0C)) != null) {
                return jVarB;
            }
        }
        l0.j.f413388e.getClass();
        return l0.j.f413389f;
    }

    @Y61.k
    public final List g(boolean z12, boolean z13) {
        if (!z12 && this.f41797d.f41789e) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z13);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    @Y61.k
    public final l i() {
        boolean zL2 = l();
        l lVar = this.f41797d;
        if (!zL2) {
            return lVar;
        }
        l lVarB = lVar.b();
        n(new ArrayList(), lVarB);
        return lVarB;
    }

    @Y61.l
    public final u j() {
        LayoutNode layoutNodeK;
        u uVar = this.f41799f;
        if (uVar != null) {
            return uVar;
        }
        LayoutNode layoutNode = this.f41796c;
        boolean z12 = this.f41795b;
        if (z12) {
            layoutNodeK = layoutNode.K();
            while (layoutNodeK != null) {
                l lVarQ = layoutNodeK.Q();
                if (lVarQ != null && lVarQ.f41788d) {
                    break;
                }
                layoutNodeK = layoutNodeK.K();
            }
            layoutNodeK = null;
        } else {
            layoutNodeK = null;
        }
        if (layoutNodeK == null) {
            LayoutNode layoutNodeK2 = layoutNode.K();
            while (true) {
                if (layoutNodeK2 == null) {
                    layoutNodeK = null;
                    break;
                }
                if (layoutNodeK2.f40615I.d(8)) {
                    layoutNodeK = layoutNodeK2;
                    break;
                }
                layoutNodeK2 = layoutNodeK2.K();
            }
        }
        if (layoutNodeK == null) {
            return null;
        }
        return v.a(layoutNodeK, z12);
    }

    public final long k() {
        AbstractC22443w0 abstractC22443w0C = c();
        if (abstractC22443w0C != null) {
            if (!abstractC22443w0C.j1().f42893o) {
                abstractC22443w0C = null;
            }
            if (abstractC22443w0C != null) {
                return androidx.compose.ui.layout.B.e(abstractC22443w0C);
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    public final boolean l() {
        return this.f41795b && this.f41797d.f41788d;
    }

    public final boolean m() {
        if (!this.f41798e && h(4, this).isEmpty()) {
            LayoutNode layoutNodeK = this.f41796c.K();
            while (true) {
                if (layoutNodeK == null) {
                    layoutNodeK = null;
                    break;
                }
                l lVarQ = layoutNodeK.Q();
                if (lVarQ != null && lVarQ.f41788d) {
                    break;
                }
                layoutNodeK = layoutNodeK.K();
            }
            if (layoutNodeK == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(ArrayList arrayList, l lVar) {
        if (this.f41797d.f41789e) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            u uVar = (u) arrayList.get(size2);
            if (!uVar.l()) {
                lVar.g(uVar.f41797d);
                uVar.n(arrayList, lVar);
            }
        }
    }

    @Y61.k
    public final List o(@Y61.k ArrayList arrayList, boolean z12) {
        if (this.f41798e) {
            return C42784z0.f406748b;
        }
        b(this.f41796c, arrayList);
        if (z12) {
            y.f41820a.getClass();
            E<i> e12 = y.f41843x;
            l lVar = this.f41797d;
            i iVar = (i) m.a(lVar, e12);
            if (iVar != null && lVar.f41788d && !arrayList.isEmpty()) {
                arrayList.add(a(iVar, new s(iVar)));
            }
            E<List<String>> e13 = y.f41821b;
            if (lVar.f41786b.c(e13) && !arrayList.isEmpty() && lVar.f41788d) {
                List list = (List) m.a(lVar, e13);
                String str = list != null ? (String) C42745f0.G(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new t(str)));
                }
            }
        }
        return arrayList;
    }
}
