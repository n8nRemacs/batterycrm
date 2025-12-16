package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC22222g;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.focus.InterfaceC22235u;
import androidx.compose.ui.layout.InterfaceC22358f;
import androidx.compose.ui.layout.InterfaceC22390v0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import s0.C47949a;

/* compiled from: NodeKind.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.collection.M0<Object> f40544a = androidx.collection.Y0.a();

    public static final void a(@Y61.k v.d dVar, int i12, int i13) {
        if (!(dVar instanceof AbstractC22425n)) {
            b(dVar, i12 & dVar.f42882d, i13);
            return;
        }
        AbstractC22425n abstractC22425n = (AbstractC22425n) dVar;
        b(dVar, abstractC22425n.f40860p & i12, i13);
        int i14 = (~abstractC22425n.f40860p) & i12;
        for (v.d dVar2 = abstractC22425n.f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
            a(dVar2, i14, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(v.d dVar, int i12, int i13) {
        if (i13 != 0 || dVar.getF40330q()) {
            if ((i12 & 2) != 0 && (dVar instanceof K)) {
                C22421l.g((K) dVar).Y();
                if (i13 == 2) {
                    AbstractC22443w0 abstractC22443w0E = C22421l.e(dVar, 2);
                    abstractC22443w0E.f40914s = true;
                    ((AbstractC22443w0.i) abstractC22443w0E.f40905H).invoke();
                    if (abstractC22443w0E.f40907J != null) {
                        if (abstractC22443w0E.f40908K != null) {
                            abstractC22443w0E.f40908K = null;
                        }
                        abstractC22443w0E.b2(null, false);
                        abstractC22443w0E.f40909n.n0(false);
                    }
                }
            }
            if ((i12 & 128) != 0 && (dVar instanceof F) && i13 != 2) {
                C22421l.g(dVar).Y();
            }
            if ((i12 & 256) != 0 && (dVar instanceof InterfaceC22442w) && i13 != 2) {
                LayoutNode layoutNodeG = C22421l.g(dVar);
                if (!layoutNodeG.F() && !layoutNodeG.G() && !layoutNodeG.f40624R) {
                    ((AndroidComposeView) S.a(layoutNodeG)).K(layoutNodeG);
                }
            }
            if ((i12 & 4) != 0 && (dVar instanceof InterfaceC22438u)) {
                C22440v.a((InterfaceC22438u) dVar);
            }
            if ((i12 & 8) != 0 && (dVar instanceof T0)) {
                C22421l.g(dVar).f40645u = true;
            }
            if ((i12 & 64) != 0 && (dVar instanceof M0)) {
                T t12 = C22421l.g((M0) dVar).f40616J;
                t12.f40693p.f40846s = true;
                C22404c0 c22404c0 = t12.f40694q;
                if (c22404c0 != null) {
                    c22404c0.f40762x = true;
                }
            }
            if ((i12 & 2048) != 0 && (dVar instanceof androidx.compose.ui.focus.N)) {
                androidx.compose.ui.focus.N n12 = (androidx.compose.ui.focus.N) dVar;
                C22409f c22409f = C22409f.f40781a;
                c22409f.getClass();
                C22409f.f40782b = null;
                n12.E0(c22409f);
                if (C22409f.f40782b != null) {
                    if (androidx.compose.ui.l.f40323d || i13 == 2) {
                        h(n12);
                    } else {
                        C22421l.h(n12).getFocusOwner().j(n12);
                    }
                }
            }
            if ((i12 & 4096) == 0 || !(dVar instanceof InterfaceC22224i)) {
                return;
            }
            InterfaceC22224i interfaceC22224i = (InterfaceC22224i) dVar;
            C22421l.h(interfaceC22224i).getFocusOwner().o(interfaceC22224i);
        }
    }

    public static final void c(@Y61.k v.d dVar) {
        if (!dVar.f42893o) {
            C47949a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(dVar, -1, 0);
    }

    public static final int d(@Y61.k v.c cVar) {
        int i12 = cVar instanceof androidx.compose.ui.layout.N ? 3 : 1;
        if (cVar instanceof androidx.compose.ui.draw.n) {
            i12 |= 4;
        }
        if (cVar instanceof androidx.compose.ui.semantics.q) {
            i12 |= 8;
        }
        if (cVar instanceof androidx.compose.ui.input.pointer.J) {
            i12 |= 16;
        }
        if ((cVar instanceof androidx.compose.ui.modifier.d) || (cVar instanceof androidx.compose.ui.modifier.m)) {
            i12 |= 32;
        }
        if (cVar instanceof InterfaceC22222g) {
            i12 |= 4096;
        }
        if (cVar instanceof InterfaceC22235u) {
            i12 |= 2048;
        }
        if (cVar instanceof InterfaceC22390v0) {
            i12 |= 256;
        }
        if (cVar instanceof androidx.compose.ui.layout.H0) {
            i12 |= 64;
        }
        if ((cVar instanceof androidx.compose.ui.layout.A0) || (cVar instanceof androidx.compose.ui.layout.D0)) {
            i12 |= 128;
        }
        return cVar instanceof androidx.compose.ui.relocation.a ? i12 | 524288 : i12;
    }

    public static final int e(@Y61.k v.d dVar) {
        int i12 = dVar.f42882d;
        if (i12 != 0) {
            return i12;
        }
        Class<?> cls = dVar.getClass();
        androidx.collection.M0<Object> m02 = f40544a;
        int iA2 = m02.a(cls);
        if (iA2 >= 0) {
            return m02.f25649c[iA2];
        }
        int i13 = dVar instanceof K ? 3 : 1;
        if (dVar instanceof InterfaceC22438u) {
            i13 |= 4;
        }
        if (dVar instanceof T0) {
            i13 |= 8;
        }
        if (dVar instanceof P0) {
            i13 |= 16;
        }
        if (dVar instanceof androidx.compose.ui.modifier.k) {
            i13 |= 32;
        }
        if (dVar instanceof M0) {
            i13 |= 64;
        }
        if (dVar instanceof F) {
            i13 |= 128;
        }
        if (dVar instanceof InterfaceC22442w) {
            i13 |= 256;
        }
        if (dVar instanceof InterfaceC22358f) {
            i13 |= 512;
        }
        if (dVar instanceof FocusTargetNode) {
            i13 |= 1024;
        }
        if (dVar instanceof androidx.compose.ui.focus.N) {
            i13 |= 2048;
        }
        if (dVar instanceof InterfaceC22224i) {
            i13 |= 4096;
        }
        if (dVar instanceof androidx.compose.ui.input.key.g) {
            i13 |= 8192;
        }
        if (dVar instanceof androidx.compose.ui.input.rotary.b) {
            i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (dVar instanceof InterfaceC22415i) {
            i13 |= 32768;
        }
        if (dVar instanceof androidx.compose.ui.input.key.j) {
            i13 |= 131072;
        }
        if (dVar instanceof TraversableNode) {
            i13 |= 262144;
        }
        if (dVar instanceof androidx.compose.ui.relocation.a) {
            i13 |= 524288;
        }
        int i14 = dVar instanceof H0 ? 1048576 | i13 : i13;
        m02.h(i14, cls);
        return i14;
    }

    public static final int f(@Y61.k v.d dVar) {
        if (!(dVar instanceof AbstractC22425n)) {
            return e(dVar);
        }
        AbstractC22425n abstractC22425n = (AbstractC22425n) dVar;
        int iF2 = abstractC22425n.f40860p;
        for (v.d dVar2 = abstractC22425n.f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
            iF2 |= f(dVar2);
        }
        return iF2;
    }

    public static final boolean g(int i12) {
        return (i12 & 128) != 0;
    }

    public static final void h(androidx.compose.ui.focus.N n12) {
        if (!n12.getF42880b().f42893o) {
            C47949a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar = n12.getF42880b().f42885g;
        if (dVar == null) {
            C22421l.a(eVar, n12.getF42880b());
        } else {
            eVar.b(dVar);
        }
        while (true) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                return;
            }
            v.d dVarB = (v.d) eVar.k(i12 - 1);
            if ((dVarB.f42883e & 1024) == 0) {
                C22421l.a(eVar, dVarB);
            } else {
                while (true) {
                    if (dVarB == null) {
                        break;
                    }
                    if ((dVarB.f42882d & 1024) != 0) {
                        androidx.compose.runtime.collection.e eVar2 = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) dVarB;
                                C22421l.h(focusTargetNode).getFocusOwner().q(focusTargetNode);
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i13 = 0;
                                for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                    if ((dVar2.f42882d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            dVarB = dVar2;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar2.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar2.b(dVar2);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar2);
                        }
                    } else {
                        dVarB = dVarB.f42885g;
                    }
                }
            }
        }
    }
}
