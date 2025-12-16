package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SemanticsUtils.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22481h2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l0.j f41466a = new l0.j(0.0f, 0.0f, 10.0f, 10.0f);

    @Y61.l
    public static final C22469e2 a(int i12, @Y61.k ArrayList arrayList) {
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C22469e2) arrayList.get(i13)).f41436b == i12) {
                return (C22469e2) arrayList.get(i13);
            }
        }
        return null;
    }

    @Y61.k
    public static final androidx.collection.A0 b(@Y61.k androidx.compose.ui.semantics.w wVar) {
        androidx.compose.ui.semantics.u uVarA = wVar.a();
        LayoutNode layoutNode = uVarA.f41796c;
        if (!layoutNode.r() || !layoutNode.m()) {
            return androidx.collection.K.f25558a;
        }
        androidx.collection.A0 a02 = new androidx.collection.A0(48);
        l0.j jVarE = uVarA.e();
        c(new Region(Math.round(jVarE.f413390a), Math.round(jVarE.f413391b), Math.round(jVarE.f413392c), Math.round(jVarE.f413393d)), uVarA, a02, uVarA, new Region());
        return a02;
    }

    public static final void c(Region region, androidx.compose.ui.semantics.u uVar, androidx.collection.A0<C22477g2> a02, androidx.compose.ui.semantics.u uVar2, Region region2) {
        l0.j jVar;
        LayoutNode layoutNode;
        InterfaceC22419k interfaceC22419kB;
        boolean zR2 = uVar2.f41796c.r();
        LayoutNode layoutNode2 = uVar2.f41796c;
        boolean z12 = (zR2 && layoutNode2.m()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i12 = uVar.f41800g;
        int i13 = uVar2.f41800g;
        if (!zIsEmpty || i13 == i12) {
            if (!z12 || uVar2.f41798e) {
                androidx.compose.ui.semantics.l lVar = uVar2.f41797d;
                boolean z13 = lVar.f41788d;
                InterfaceC22419k interfaceC22419k = uVar2.f41794a;
                if (z13 && (interfaceC22419kB = androidx.compose.ui.semantics.v.b(layoutNode2)) != null) {
                    interfaceC22419k = interfaceC22419kB;
                }
                v.d f42880b = interfaceC22419k.getF42880b();
                androidx.compose.ui.semantics.k.f41760a.getClass();
                boolean z14 = androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.k.f41762c) != null;
                if (!f42880b.f42880b.f42893o) {
                    l0.j.f413388e.getClass();
                    jVar = l0.j.f413389f;
                } else if (z14) {
                    AbstractC22443w0 abstractC22443w0E = C22421l.e(f42880b, 8);
                    if (abstractC22443w0E.j1().f42893o) {
                        androidx.compose.ui.layout.A aC2 = androidx.compose.ui.layout.B.c(abstractC22443w0E);
                        l0.e eVar = abstractC22443w0E.f40900C;
                        if (eVar == null) {
                            eVar = new l0.e();
                            abstractC22443w0E.f40900C = eVar;
                        }
                        long jR02 = abstractC22443w0E.R0(abstractC22443w0E.h1());
                        int i14 = (int) (jR02 >> 32);
                        eVar.f413380a = -Float.intBitsToFloat(i14);
                        int i15 = (int) (jR02 & 4294967295L);
                        eVar.f413381b = -Float.intBitsToFloat(i15);
                        eVar.f413382c = Float.intBitsToFloat(i14) + abstractC22443w0E.g0();
                        eVar.f413383d = Float.intBitsToFloat(i15) + abstractC22443w0E.f0();
                        while (true) {
                            if (abstractC22443w0E == aC2) {
                                jVar = new l0.j(eVar.f413380a, eVar.f413381b, eVar.f413382c, eVar.f413383d);
                                break;
                            }
                            abstractC22443w0E.W1(eVar, false, true);
                            if (eVar.b()) {
                                l0.j.f413388e.getClass();
                                jVar = l0.j.f413389f;
                                break;
                            }
                            abstractC22443w0E = abstractC22443w0E.f40913r;
                        }
                    } else {
                        l0.j.f413388e.getClass();
                        jVar = l0.j.f413389f;
                    }
                } else {
                    AbstractC22443w0 abstractC22443w0E2 = C22421l.e(f42880b, 8);
                    jVar = androidx.compose.ui.layout.B.c(abstractC22443w0E2).P(abstractC22443w0E2, true);
                }
                int iRound = Math.round(jVar.f413390a);
                int iRound2 = Math.round(jVar.f413391b);
                int iRound3 = Math.round(jVar.f413392c);
                int iRound4 = Math.round(jVar.f413393d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i13 == i12) {
                    i13 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (uVar2.f41798e) {
                        androidx.compose.ui.semantics.u uVarJ = uVar2.j();
                        l0.j jVarE = (uVarJ == null || (layoutNode = uVarJ.f41796c) == null || !layoutNode.r()) ? f41466a : uVarJ.e();
                        a02.h(i13, new C22477g2(uVar2, new Rect(Math.round(jVarE.f413390a), Math.round(jVarE.f413391b), Math.round(jVarE.f413392c), Math.round(jVarE.f413393d))));
                        return;
                    } else {
                        if (i13 == -1) {
                            a02.h(i13, new C22477g2(uVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                a02.h(i13, new C22477g2(uVar2, region2.getBounds()));
                List listH = androidx.compose.ui.semantics.u.h(4, uVar2);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    androidx.compose.ui.semantics.l lVarI = ((androidx.compose.ui.semantics.u) listH.get(size)).i();
                    androidx.compose.ui.semantics.y.f41820a.getClass();
                    if (!lVarI.f41786b.c(androidx.compose.ui.semantics.y.f41845z)) {
                        c(region, uVar, a02, (androidx.compose.ui.semantics.u) listH.get(size), region2);
                    }
                }
                if (f(uVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @Y61.l
    public static final androidx.compose.ui.text.o0 d(@Y61.k androidx.compose.ui.semantics.l lVar) {
        Y41.l lVar2;
        ArrayList arrayList = new ArrayList();
        androidx.compose.ui.semantics.k.f41760a.getClass();
        C22553a c22553a = (C22553a) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.k.f41761b);
        if (c22553a == null || (lVar2 = (Y41.l) c22553a.f41728b) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.o0) arrayList.get(0);
    }

    public static final boolean e(@Y61.k androidx.compose.ui.semantics.u uVar) {
        AbstractC22443w0 abstractC22443w0C = uVar.c();
        if (!(abstractC22443w0C != null ? abstractC22443w0C.D1() : false)) {
            androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
            yVar.getClass();
            androidx.compose.ui.semantics.E<kotlin.G0> e12 = androidx.compose.ui.semantics.y.f41835p;
            androidx.compose.ui.semantics.l lVar = uVar.f41797d;
            if (!lVar.f41786b.c(e12)) {
                yVar.getClass();
                if (!lVar.f41786b.c(androidx.compose.ui.semantics.y.f41834o)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean f(@Y61.k androidx.compose.ui.semantics.u uVar) {
        if (e(uVar)) {
            return false;
        }
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        if (!lVar.f41788d) {
            androidx.collection.R0<androidx.compose.ui.semantics.E<?>, Object> r02 = lVar.f41786b;
            Object[] objArr = r02.f25722b;
            Object[] objArr2 = r02.f25723c;
            long[] jArr = r02.f25721a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i12 = 0;
            loop0: while (true) {
                long j12 = jArr[i12];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j12) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            Object obj2 = objArr2[i15];
                            if (((androidx.compose.ui.semantics.E) obj).f41724c) {
                                break loop0;
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i13 != 8) {
                        return false;
                    }
                }
                if (i12 == length) {
                    return false;
                }
                i12++;
            }
        }
        return true;
    }

    @Y61.l
    public static final androidx.compose.ui.viewinterop.a g(@Y61.k C22511p0 c22511p0, int i12) {
        Object next;
        Iterator<T> it = c22511p0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LayoutNode) ((Map.Entry) next).getKey()).f40627c == i12) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.a) entry.getValue();
        }
        return null;
    }

    @Y61.l
    public static final String h(int i12) {
        i.a aVar = androidx.compose.ui.semantics.i.f41744b;
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, 0)) {
            return "android.widget.Button";
        }
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, androidx.compose.ui.semantics.i.f41745c)) {
            return "android.widget.CheckBox";
        }
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, androidx.compose.ui.semantics.i.f41747e)) {
            return "android.widget.RadioButton";
        }
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, androidx.compose.ui.semantics.i.f41749g)) {
            return "android.widget.ImageView";
        }
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, androidx.compose.ui.semantics.i.f41750h)) {
            return "android.widget.Spinner";
        }
        aVar.getClass();
        if (androidx.compose.ui.semantics.i.b(i12, androidx.compose.ui.semantics.i.f41751i)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
