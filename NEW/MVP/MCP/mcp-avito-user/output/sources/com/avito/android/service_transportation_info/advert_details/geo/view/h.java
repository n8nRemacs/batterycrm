package com.avito.android.service_transportation_info.advert_details.geo.view;

import Y41.l;
import Y41.r;
import Y61.k;
import androidx.compose.animation.C20389u;
import androidx.compose.animation.C20396w0;
import androidx.compose.animation.H0;
import androidx.compose.animation.InterfaceC20395w;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.o;
import com.akita.compose.foundation.ui.p;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationGeoRoutes.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showAll", "_avito_service-transportation-info_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: ServicesTransportationGeoRoutes.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/y;", "", "Landroidx/compose/animation/w0;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<InterfaceC20401y<Boolean>, C20396w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f279760l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final C20396w0 invoke(InterfaceC20401y<Boolean> interfaceC20401y) {
            return C20389u.e(H0.d(null, 3), H0.e(null, 3));
        }
    }

    /* compiled from: ServicesTransportationGeoRoutes.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/w;", "", "expand", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/w;ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements r<InterfaceC20395w, Boolean, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<TransportationGeo.Routes.Route> f279761l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f279762m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f279763n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<TransportationGeo.Routes.Route> list, String str, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(4);
            this.f279761l = list;
            this.f279762m = str;
            this.f279763n = interfaceC22204y1;
        }

        @Override // Y41.r
        public final G0 invoke(InterfaceC20395w interfaceC20395w, Boolean bool, A a12, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            A a13 = a12;
            num.intValue();
            if (zBooleanValue) {
                a13.C(1224129352);
                h.a(this.f279761l, a13, 8);
                a13.h();
            } else if (this.f279762m != null) {
                a13.C(1224235620);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                v.a aVar = v.f42878y1;
                a13.C(-1623069970);
                Object objT = a13.t();
                A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new i(this.f279763n);
                    a13.H(objT);
                }
                a13.h();
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                p.b(this.f279762m, rVar, R1.m(C21086w0.c(aVar, false, null, null, (Y41.a) objT, 7), 0.0f, 4, 0.0f, 0.0f, 13), false, com.akita.compose.theme.re23.b.f63984b.f63837D.c(a13), null, 0, 0, false, null, a13, 0, 1000);
                a13.h();
            } else {
                a13.C(1224610410);
                a13.h();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesTransportationGeoRoutes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TransportationGeo.Routes f279764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TransportationGeo.Routes routes, int i12) {
            super(2);
            this.f279764l = routes;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            h.b(this.f279764l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(List list, A a12, int i12) {
        B bE2 = a12.E(1484922473);
        v.a aVar = v.f42878y1;
        v vVarD = C20588k2.d(aVar, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarD);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(27062932);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E.a(C20588k2.d(v.f42878y1, 1.0f), null, false, androidx.compose.runtime.internal.r.c(442946791, new f((TransportationGeo.Routes.Route) it.next()), bE2), bE2, 3078, 6);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new g(list, aVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@k TransportationGeo.Routes routes, @Y61.l A a12, int i12) {
        B bE2 = a12.E(611705005);
        bE2.C(1856951580);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        String expandTitle = routes.getExpandTitle();
        Integer collapsedLimit = routes.getCollapsedLimit();
        int iIntValue = collapsedLimit != null ? collapsedLimit.intValue() : routes.getItems().size();
        List<TransportationGeo.Routes.Route> listSubList = routes.getItems().subList(0, iIntValue);
        List<TransportationGeo.Routes.Route> listSubList2 = routes.getItems().subList(iIntValue, routes.getItems().size());
        v.a aVar = v.f42878y1;
        v vVarD = C20588k2.d(aVar, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarD);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        String title = routes.getTitle();
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65232c;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        p.b(title, rVar, R1.m(aVar, 0.0f, 0.0f, 0.0f, 8, 7), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        a(listSubList, bE2, 8);
        bE2.C(-1361698031);
        if (!listSubList2.isEmpty()) {
            Boolean bool = (Boolean) interfaceC22204y1.getF42167b();
            bool.getClass();
            C20389u.b(bool, null, a.f279760l, null, null, null, androidx.compose.runtime.internal.r.c(2020193153, new b(listSubList2, expandTitle, interfaceC22204y1), bE2), bE2, 1573248, 58);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new c(routes, i12);
        }
    }

    public static final void c(boolean z12, A a12, int i12) {
        int i13;
        B bE2 = a12.E(205218216);
        if ((i12 & 14) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            v.a aVar = v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarT = C20588k2.t(aVar, 20);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarT);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            if (z12) {
                bE2.C(-1559001188);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64399Xc, 0, bE2), null, C20588k2.f(aVar, 16), com.akita.compose.theme.re23.b.f63984b.f63938l, bE2, 440, 0);
                bE2.X(false);
            } else {
                bE2.C(-1558714128);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63986d.getClass();
                o.a(com.akita.compose.theme.re23.g.f64946I5, com.akita.compose.theme.re23.b.f63988f.f65244o, androidx.compose.ui.draw.v.a(aVar, 1.2f), com.akita.compose.theme.re23.b.f63984b.f63938l, bE2, 384, 0);
                bE2.X(false);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(z12, i12);
        }
    }
}
