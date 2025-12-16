package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.v;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: DelegatableNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22421l {
    public static final void a(androidx.compose.runtime.collection.e eVar, v.d dVar) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = g(dVar).O();
        int i12 = eVarO.f38262d - 1;
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        if (i12 < layoutNodeArr.length) {
            while (i12 >= 0) {
                eVar.b(layoutNodeArr[i12].f40615I.f40878e);
                i12--;
            }
        }
    }

    public static final v.d b(androidx.compose.runtime.collection.e eVar) {
        int i12;
        if (eVar == null || (i12 = eVar.f38262d) == 0) {
            return null;
        }
        return (v.d) eVar.k(i12 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final K c(@Y61.k v.d dVar) {
        if ((dVar.f42882d & 2) != 0) {
            if (dVar instanceof K) {
                return (K) dVar;
            }
            if (dVar instanceof AbstractC22425n) {
                v.d dVar2 = ((AbstractC22425n) dVar).f40861q;
                while (dVar2 != 0) {
                    if (dVar2 instanceof K) {
                        return (K) dVar2;
                    }
                    dVar2 = (!(dVar2 instanceof AbstractC22425n) || (dVar2.f42882d & 2) == 0) ? dVar2.f42885g : ((AbstractC22425n) dVar2).f40861q;
                }
            }
        }
        return null;
    }

    public static final void d(@Y61.k InterfaceC22419k interfaceC22419k) {
        androidx.compose.ui.autofill.e eVar;
        LayoutNode layoutNodeG = g(interfaceC22419k);
        if (layoutNodeG.f40647w) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) S.a(layoutNodeG);
        if (!androidx.compose.ui.l.f40322c || (eVar = androidComposeView._autofillManager) == null) {
            return;
        }
        eVar.c(layoutNodeG);
    }

    @Y61.k
    public static final AbstractC22443w0 e(@Y61.k InterfaceC22419k interfaceC22419k, int i12) {
        AbstractC22443w0 abstractC22443w0 = interfaceC22419k.getF42880b().f42887i;
        return (abstractC22443w0.j1() == interfaceC22419k && A0.g(i12)) ? abstractC22443w0.f40912q : abstractC22443w0;
    }

    @Y61.k
    public static final AbstractC22443w0 f(@Y61.k InterfaceC22419k interfaceC22419k) {
        if (!interfaceC22419k.getF42880b().f42893o) {
            C47949a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC22443w0 abstractC22443w0E = e(interfaceC22419k, 2);
        if (!abstractC22443w0E.j1().f42893o) {
            C47949a.b("LayoutCoordinates is not attached.");
        }
        return abstractC22443w0E;
    }

    @Y61.k
    public static final LayoutNode g(@Y61.k InterfaceC22419k interfaceC22419k) {
        AbstractC22443w0 abstractC22443w0 = interfaceC22419k.getF42880b().f42887i;
        if (abstractC22443w0 != null) {
            return abstractC22443w0.f40909n;
        }
        throw androidx.compose.foundation.H.s("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    @Y61.k
    public static final J0 h(@Y61.k InterfaceC22419k interfaceC22419k) {
        AndroidComposeView androidComposeView = g(interfaceC22419k).f40641q;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw androidx.compose.foundation.H.s("This node does not have an owner.");
    }
}
