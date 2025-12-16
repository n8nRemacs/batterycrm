package com.avito.android.competitor_analytics.ui;

import android.net.Uri;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: CompetitorAnalyticsSuggests.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "localSuggestsHeight", "_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class z0 {

    /* compiled from: CompetitorAnalyticsSuggests.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.A, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f124885l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f124886m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, kotlin.G0> lVar, InterfaceC22196w1 interfaceC22196w1) {
            super(1);
            this.f124885l = lVar;
            this.f124886m = interfaceC22196w1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.A a12) {
            int iA2 = (int) (a12.a() & 4294967295L);
            InterfaceC22196w1 interfaceC22196w1 = this.f124886m;
            if (iA2 > interfaceC22196w1.e()) {
                interfaceC22196w1.L3(iA2);
                this.f124885l.invoke(Integer.valueOf(interfaceC22196w1.e()));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsSuggests.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.j.a f124887l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f124888m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124889n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.banner.h f124890o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f124891p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124892q;

        /* compiled from: CompetitorAnalyticsSuggests.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[ActionButton.Style.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ActionButton.Style style = ActionButton.Style.f124318b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ActionButton.Style style2 = ActionButton.Style.f124318b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(b.j.a aVar, float f12, int i12, com.akita.compose.component.banner.h hVar, int i13, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
            super(2);
            this.f124887l = aVar;
            this.f124888m = f12;
            this.f124889n = i12;
            this.f124890o = hVar;
            this.f124891p = i13;
            this.f124892q = lVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            b.j.a aVar;
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar;
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2;
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar3;
            Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar4;
            com.akita.compose.component.button.t tVarT1;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar5 = InterfaceC22413h.a.f40796g;
                R3.b(pVar5, a13, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar6 = InterfaceC22413h.a.f40795f;
                R3.b(pVar6, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar7 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar7);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar8 = InterfaceC22413h.a.f40793d;
                R3.b(pVar8, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                b.j.a aVar4 = this.f124887l;
                a13.C(-303790040);
                UniversalImage universalImage = aVar4.f124540c;
                if (universalImage == null) {
                    aVar = aVar4;
                    pVar = pVar8;
                    pVar2 = pVar7;
                    pVar3 = pVar6;
                    pVar4 = pVar5;
                } else {
                    int i12 = this.f124889n;
                    float fB2 = com.avito.android.competitor_analytics.util.c.b(a13, i12);
                    a13.C(8045565);
                    Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, !((Boolean) a13.o(com.akita.compose.foundation.b.f63571a)).booleanValue()) : null;
                    Uri uriC = imageDependsOnThemeOrDefault == null ? null : com.avito.android.competitor_analytics.util.c.c(imageDependsOnThemeOrDefault, this.f124888m, fB2, a13, 8);
                    a13.h();
                    androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(aVar2, 1.0f), com.avito.android.competitor_analytics.util.c.b(a13, i12)), this.f124890o.f60464b), "suggests_banner_image");
                    InterfaceC22374n.f40491a.getClass();
                    aVar = aVar4;
                    pVar = pVar8;
                    pVar2 = pVar7;
                    pVar3 = pVar6;
                    pVar4 = pVar5;
                    coil.compose.v.b(uriC, null, vVarA, null, InterfaceC22374n.a.f40493b, null, a13, 1572920, 4024);
                }
                a13.h();
                FillElement fillElement = C20588k2.f28681b;
                aVar2.getClass();
                float f12 = 20;
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarL = R1.l(fillElement, f12, 16, f12, 18);
                C20585k.f28659a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarL);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar4, a13, iA2);
                R3.b(pVar3, a13, o1Y2);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar2);
                }
                R3.b(pVar, a13, vVarC2);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.r rVar = iVar.f65242m;
                StringBuilder sb2 = new StringBuilder("suggests_banner_title");
                int i13 = this.f124891p;
                sb2.append(i13);
                androidx.compose.ui.v vVarA2 = C22501m2.a(aVar2, sb2.toString());
                androidx.compose.ui.text.style.s.f42720b.getClass();
                int i14 = androidx.compose.ui.text.style.s.f42722d;
                b.j.a aVar6 = aVar;
                com.akita.compose.foundation.ui.p.b(aVar6.f124538a, rVar, vVarA2, false, 0L, null, 2, i14, false, null, a13, 14155776, 824);
                com.akita.compose.foundation.ui.p.b(aVar6.f124539b, iVar.f65245p, com.avito.android.bxcontent.mvi.entity.f.d(i13, R1.m(aVar2, 0.0f, 6, 0.0f, 12, 5), "suggests_banner_description"), false, 0L, null, 4, i14, false, null, a13, 14155776, 824);
                C20608p2.a(a13, k12.a(aVar2, 1.0f, true));
                ActionButton actionButton = aVar6.f124541d;
                A0 a02 = new A0(this.f124892q, aVar6);
                int iOrdinal = actionButton.f124317c.ordinal();
                if (iOrdinal == 0) {
                    a13.C(-732321462);
                    tVarT1 = com.akita.compose.theme.re23.b.c(a13).T1();
                    a13.h();
                } else if (iOrdinal == 1) {
                    a13.C(-732317748);
                    tVarT1 = com.akita.compose.theme.re23.b.c(a13).H0();
                    a13.h();
                } else {
                    if (iOrdinal != 2) {
                        a13.C(-732544263);
                        a13.h();
                        throw new NoWhenBranchMatchedException();
                    }
                    a13.C(-732314029);
                    tVarT1 = com.akita.compose.theme.re23.b.c(a13).F0();
                    a13.h();
                }
                com.akita.compose.component.button.m.c(actionButton.f124315a, a02, tVarT1, C22501m2.a(aVar2, "suggests_banner_button" + i13), null, null, null, false, false, null, a13, 512, 1008);
                a13.z();
                a13.z();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsSuggests.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.j f124893l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d2 f124894m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124895n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f124896o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124897p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f124898q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b.j jVar, d2 d2Var, int i12, Y41.l<? super Integer, kotlin.G0> lVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2, int i13) {
            super(2);
            this.f124893l = jVar;
            this.f124894m = d2Var;
            this.f124895n = i12;
            this.f124896o = lVar;
            this.f124897p = lVar2;
            this.f124898q = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124898q | 1);
            Y41.l<Integer, kotlin.G0> lVar = this.f124896o;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2 = this.f124897p;
            z0.a(this.f124893l, this.f124894m, this.f124895n, lVar, lVar2, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsSuggests.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.j f124899l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d2 f124900m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f124901n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f124902o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124903p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f124904q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(b.j jVar, d2 d2Var, int i12, Y41.l<? super Integer, kotlin.G0> lVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2, int i13) {
            super(2);
            this.f124899l = jVar;
            this.f124900m = d2Var;
            this.f124901n = i12;
            this.f124902o = lVar;
            this.f124903p = lVar2;
            this.f124904q = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124904q | 1);
            Y41.l<Integer, kotlin.G0> lVar = this.f124902o;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2 = this.f124903p;
            z0.a(this.f124899l, this.f124900m, this.f124901n, lVar, lVar2, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l b.j jVar, @Y61.k d2 d2Var, int i12, @Y61.k Y41.l<? super Integer, kotlin.G0> lVar, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar2, @Y61.l androidx.compose.runtime.A a12, int i13) {
        int i14;
        com.akita.compose.component.banner.h f66891b;
        androidx.compose.runtime.B bE2 = a12.E(-86821856);
        if (jVar == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new d(jVar, d2Var, i12, lVar, lVar2, i13);
                return;
            }
            return;
        }
        bE2.C(431607264);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        bE2.X(false);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarA = C22501m2.a(R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 32, 0.0f, 0.0f, 13), "suggests_container");
        C20585k.f28659a.getClass();
        C20585k.l lVar3 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, kotlin.G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, kotlin.G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, kotlin.G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        float f12 = 16;
        com.akita.compose.foundation.ui.p.b(jVar.f124536a, com.akita.compose.theme.re23.b.f63988f.f65236g, C22501m2.a(R1.k(f12, 0.0f, 2, aVar), "suggests_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        ArrayList arrayList = jVar.f124537b;
        boolean z12 = arrayList.size() == 1;
        bE2.C(127751143);
        float fB2 = z12 ? com.avito.android.competitor_analytics.util.c.b(bE2, (int) (DU.a.a(bE2) >> 32)) - 20 : 254;
        bE2.X(false);
        float f13 = 10;
        androidx.compose.ui.v vVarM = R1.m(a2.b(C20588k2.d(aVar, 1.0f), d2Var, false, true), f13, f12, f13, 0.0f, 8);
        C20568f2 c20568f2A = C20563e2.a(C20585k.g(8), InterfaceC22215f.a.f39085k, bE2, 6);
        int i16 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarM);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-1693871266);
        int i17 = 0;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                C42745f0.H0();
                throw null;
            }
            b.j.a aVar4 = (b.j.a) next;
            boolean z13 = aVar4.f124540c != null;
            bE2.C(-1425599523);
            if (z13) {
                bE2.C(-285854536);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                f66891b = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
                i14 = 0;
                bE2.X(false);
            } else {
                i14 = 0;
                bE2.C(-285800038);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                f66891b = com.akita.compose.theme.re23.b.b(bE2).getF66891b();
                bE2.X(false);
            }
            com.akita.compose.component.banner.h hVar = f66891b;
            float f14 = i14;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.banner.h hVarA = com.akita.compose.component.banner.h.a(hVar, R1.a(f14), null, null, null, 16382);
            bE2.X(false);
            androidx.compose.ui.v vVarF = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarT = C20588k2.t(vVarF, fB2);
            if (i12 > 0 && i12 >= interfaceC22196w1.e()) {
                bE2.C(-1561091680);
                vVarF = C20588k2.f(vVarF, com.avito.android.competitor_analytics.util.c.b(bE2, i12));
                bE2.X(false);
            } else if (interfaceC22196w1.e() > 0) {
                bE2.C(-1560955621);
                vVarF = C20588k2.f(vVarF, com.avito.android.competitor_analytics.util.c.b(bE2, interfaceC22196w1.e()));
                bE2.X(false);
            } else {
                bE2.C(-1560844610);
                bE2.X(false);
            }
            androidx.compose.ui.v vVarD0 = vVarT.d0(vVarF);
            bE2.C(-1990007569);
            boolean z14 = (((i13 & 7168) ^ 3072) > 2048 && bE2.B(lVar)) || (i13 & 3072) == 2048;
            Object objT2 = bE2.t();
            if (z14 || objT2 == A.a.f37868b) {
                objT2 = new a(lVar, interfaceC22196w1);
                bE2.H(objT2);
            }
            bE2.X(false);
            androidx.compose.ui.v vVarA2 = C22392w0.a(vVarD0, (Y41.l) objT2);
            float f15 = fB2;
            float f16 = fB2;
            androidx.compose.runtime.B b12 = bE2;
            com.akita.compose.component.banner.g.c(hVarA, vVarA2, null, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(1728657478, new b(aVar4, f15, i12, hVarA, i17, lVar2), b12), b12, com.akita.compose.component.banner.h.f60462o | 12582912, 124);
            bE2 = b12;
            fB2 = f16;
            i17 = i18;
            interfaceC22196w1 = interfaceC22196w1;
        }
        androidx.compose.runtime.B b13 = bE2;
        b13.X(false);
        b13.X(true);
        b13.X(true);
        C22039c2 c22039c2Z2 = b13.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new c(jVar, d2Var, i12, lVar, lVar2, i13);
        }
    }
}
