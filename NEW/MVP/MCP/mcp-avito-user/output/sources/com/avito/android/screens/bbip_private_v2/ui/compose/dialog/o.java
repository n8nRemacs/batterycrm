package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.lazy.A0;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.E;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.accordion.s;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WheelPicker.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0005²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "firstItemIndex", "centerIndex", "", "currentValue", "_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k ArrayList arrayList, @Y61.k String str, @Y61.k Y41.l lVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1858873484);
        float f12 = JfifUtil.MARKER_RST0;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 52;
        ArrayList arrayList2 = new ArrayList(3);
        for (int i13 = 0; i13 < 3; i13++) {
            arrayList2.add("");
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(3);
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList3.add("");
        }
        ArrayList arrayListH02 = C42745f0.h0(arrayList3, arrayListH0);
        int iIndexOf = arrayList.indexOf(str);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        w0 w0VarA = A0.a(numValueOf != null ? numValueOf.intValue() : arrayList.size() / 2, 48, 0, bE2);
        bE2.C(-963247068);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            bE2.H(lVar);
            objT = lVar;
        }
        Y41.l lVar2 = (Y41.l) objT;
        bE2.X(false);
        InterfaceC20481m2 interfaceC20481m2B = androidx.compose.foundation.gestures.snapping.h.b(w0VarA, null, bE2, 0, 2);
        bE2.C(-963242646);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = C22126m3.d(new n(w0VarA));
            bE2.H(objT2);
        }
        I3 i32 = (I3) objT2;
        Object objI = s.i(-963239807, bE2, false);
        if (objI == c1651a) {
            objI = C22126m3.d(new l(3, i32));
            bE2.H(objI);
        }
        I3 i33 = (I3) objI;
        Object objI2 = s.i(-963237198, bE2, false);
        if (objI2 == c1651a) {
            objI2 = C22126m3.d(new m(arrayListH02, i33));
            bE2.H(objI2);
        }
        I3 i34 = (I3) objI2;
        bE2.X(false);
        String str2 = (String) i34.getF42167b();
        bE2.C(-963233676);
        boolean zB2 = bE2.B(str);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new f(str, lVar2, i34, null);
            bE2.H(objT3);
        }
        bE2.X(false);
        C22187u0.d((p) objT3, bE2, str2);
        v vVarF = C20588k2.f(C20588k2.d(vVar, 1.0f), f12);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
        int i15 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarF);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.foundation.shape.n nVarA = androidx.compose.foundation.shape.o.a(12);
        V1 v1E = R1.e(0.0f, 10, 0.0f, 16, 5);
        v vVarA = E.a(C20588k2.f(C20588k2.d(v.f42878y1, 1.0f), f13), 0.0f);
        e.f261183a.getClass();
        com.akita.compose.component.banner.g.c(f66889a, vVarA, v1E, nVarA, null, 0.0f, null, e.f261184b, bE2, com.akita.compose.component.banner.h.f60462o | 12583296, 112);
        C20585k.f28659a.getClass();
        C20650b.a(E.a(C20588k2.f28682c, 1.0f), w0VarA, null, false, C20585k.g(8), InterfaceC22215f.a.f39089o, interfaceC20481m2B, false, null, new j(arrayListH02, f13, i33), bE2, 221190, 396);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(arrayList, str, lVar, vVar, f12, f13, i12);
        }
    }
}
