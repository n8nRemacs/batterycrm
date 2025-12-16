package androidx.compose.ui.focus;

import androidx.compose.ui.layout.C22370l;
import androidx.compose.ui.layout.InterfaceC22368k;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: BeyondBoundsLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22216a {
    @Y61.l
    public static final <T> T a(@Y61.k FocusTargetNode focusTargetNode, int i12, @Y61.k Y41.l<? super InterfaceC22368k.a, ? extends T> lVar) {
        v.d dVarB;
        int i13;
        C22437t0 c22437t0;
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = focusTargetNode.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeG == null) {
                dVarB = null;
                break;
            }
            if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 1024) != 0) {
                        dVarB = dVar;
                        androidx.compose.runtime.collection.e eVar = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i14 = 0;
                                for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                    if ((dVar2.f42882d & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            dVarB = dVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar.b(dVar2);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar);
                        }
                    }
                    dVar = dVar.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarB;
        if (focusTargetNode2 != null) {
            androidx.compose.ui.modifier.s<InterfaceC22368k> sVar = C22370l.f40480a;
            if (kotlin.jvm.internal.L.f((InterfaceC22368k) focusTargetNode2.G(sVar), (InterfaceC22368k) focusTargetNode.G(sVar))) {
                return null;
            }
        }
        InterfaceC22368k interfaceC22368k = (InterfaceC22368k) focusTargetNode.G(C22370l.f40480a);
        if (interfaceC22368k == null) {
            return null;
        }
        C22220e.f39163b.getClass();
        if (C22220e.b(i12, C22220e.f39168g)) {
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40477g;
        } else if (C22220e.b(i12, C22220e.f39169h)) {
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40478h;
        } else if (C22220e.b(i12, C22220e.f39166e)) {
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40475e;
        } else if (C22220e.b(i12, C22220e.f39167f)) {
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40476f;
        } else if (C22220e.b(i12, C22220e.f39164c)) {
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40474d;
        } else {
            if (!C22220e.b(i12, C22220e.f39165d)) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            InterfaceC22368k.b.f40472b.getClass();
            i13 = InterfaceC22368k.b.f40473c;
        }
        return (T) interfaceC22368k.O1(i13, lVar);
    }
}
