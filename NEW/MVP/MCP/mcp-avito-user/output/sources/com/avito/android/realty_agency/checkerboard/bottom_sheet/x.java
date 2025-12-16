package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import androidx.compose.foundation.O0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;

/* compiled from: LotItemPreviewBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x {

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC19559a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251068l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC19559a interfaceC19559a) {
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<G0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f251069b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f251070c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251071d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC19559a, G0> lVar) {
            super(0, L.a.class, "hideBottomSheet", "LotItemPreviewBottomSheet$hideBottomSheet(Lkotlinx/coroutines/CoroutineScope;Lcom/akita/compose/component/bottom_sheet/BottomSheetState;Lkotlin/jvm/functions/Function1;)V", 0);
            this.f251069b = t12;
            this.f251070c = i12;
            this.f251071d = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((V0) C43259k.d(this.f251069b, null, null, new E(this.f251070c, null), 3)).k(new F(this.f251071d));
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I f251072l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f251073m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f251074n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251075o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar, com.akita.compose.component.bottom_sheet.I i12, I i13, kotlinx.coroutines.T t12) {
            super(3);
            this.f251072l = i13;
            this.f251073m = t12;
            this.f251074n = i12;
            this.f251075o = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Throwable] */
        @Override // Y41.q
        public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            int i12;
            boolean z12;
            androidx.compose.ui.v vVar;
            long jC2;
            com.akita.compose.theme.re23.i iVar;
            I i13;
            long jC3;
            I i14;
            int i15;
            long jC4;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                a13.C(2015306457);
                I i16 = this.f251072l;
                Image image = i16.f250953b;
                boolean z13 = i16.f250954c;
                if (image != null) {
                    v.a aVar = androidx.compose.ui.v.f42878y1;
                    androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                    float f12 = 278;
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    androidx.compose.ui.v vVarK = R1.k(10, 0.0f, 2, C20588k2.f(vVarD, f12));
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarK);
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
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    C20644z c20644z = C20644z.f28804a;
                    float f13 = 1000;
                    float f14 = 16;
                    androidx.compose.ui.v vVarA = androidx.compose.ui.draw.a.a(androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(aVar, 1.0f), f12), androidx.compose.foundation.shape.o.a(f14)), z13 ? 0.5f : 1.0f);
                    InterfaceC22374n.f40491a.getClass();
                    z12 = z13;
                    vVar = null;
                    com.avito.android.mnz_common.compose.i.a(i16.f250953b, f13, f13, "LotPreviewImage", vVarA, null, null, null, InterfaceC22374n.a.f40494c, a13, 100666808, 224);
                    a13.C(1347089781);
                    if (O0.a(a13)) {
                        i12 = 0;
                    } else {
                        androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(c20644z.b(aVar), androidx.compose.foundation.shape.o.a(f14));
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        i12 = 0;
                        C20632w.a(androidx.compose.foundation.A.b(vVarA2, com.akita.compose.theme.re23.b.f63984b.f63938l.a(0.04f).c(a13), Y0.f39346a), a13, 0);
                    }
                    a13.h();
                    a13.z();
                } else {
                    i12 = 0;
                    z12 = z13;
                    vVar = null;
                }
                a13.h();
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                float f15 = 16;
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarK2 = R1.k(f15, 0.0f, 2, aVar4);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, a13, i12);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarK2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    ?? r15 = vVar;
                    C22190v.b();
                    throw r15;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar6);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
                R3.b(pVar2, a13, iA2);
                Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
                R3.b(pVar3, a13, o1Y2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar4);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar5 = InterfaceC22413h.a.f40793d;
                R3.b(pVar5, a13, vVarC2);
                androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
                com.akita.compose.foundation.ui.g.a(f15, vVar, a13, 6);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar2 = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.ui.p.b(i16.f250955d, iVar2.f65234e, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                com.akita.compose.foundation.ui.g.a(2, null, a13, 6);
                a13.C(1347111896);
                String str = i16.f250956e;
                if (str == null) {
                    i13 = i16;
                    iVar = iVar2;
                } else {
                    if (z12) {
                        a13.C(-736970984);
                        com.akita.compose.theme.re23.b.f63987e.getClass();
                        com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                        jC2 = X2.h.f18557e.c(a13);
                        a13.h();
                    } else {
                        a13.C(-736874822);
                        com.akita.compose.theme.re23.b.f63987e.getClass();
                        com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                        jC2 = X2.h.f18556d.c(a13);
                        a13.h();
                    }
                    iVar = iVar2;
                    i13 = i16;
                    com.akita.compose.foundation.ui.p.b(str, iVar2.f65241l, null, false, jC2, null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                    G0 g02 = G0.f406611a;
                }
                a13.h();
                if (z12) {
                    a13.C(-1188622529);
                    com.akita.compose.theme.re23.b.f63987e.getClass();
                    com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                    jC3 = X2.h.f18557e.c(a13);
                    a13.h();
                } else {
                    a13.C(-1188534303);
                    com.akita.compose.theme.re23.b.f63987e.getClass();
                    com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                    jC3 = X2.h.f18556d.c(a13);
                    a13.h();
                }
                I i17 = i13;
                com.akita.compose.theme.re23.i iVar3 = iVar;
                com.akita.compose.foundation.ui.p.b(i17.f250957f, iVar.f65241l, null, false, jC3, null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                a13.C(1347137454);
                C22602e c22602e = i17.f250958g;
                if (c22602e == null || C43066x.K(c22602e)) {
                    i14 = i17;
                    i15 = 6;
                } else {
                    com.akita.compose.foundation.ui.g.a(4, null, a13, 6);
                    if (z12) {
                        a13.C(-1188136201);
                        com.akita.compose.theme.re23.b.f63987e.getClass();
                        com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                        jC4 = X2.h.f18557e.c(a13);
                        a13.h();
                    } else {
                        a13.C(-1188040039);
                        com.akita.compose.theme.re23.b.f63987e.getClass();
                        com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                        jC4 = X2.h.f18556d.c(a13);
                        a13.h();
                    }
                    i14 = i17;
                    i15 = 6;
                    com.akita.compose.foundation.ui.p.a(c22602e, iVar3.f65241l, null, false, jC4, null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                }
                a13.h();
                com.akita.compose.foundation.ui.g.a(f15, null, a13, i15);
                a13.C(1347156363);
                I i18 = i14;
                if (i18.f250959h) {
                    C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, a13, 0);
                    int f37888q3 = a13.getF37888Q();
                    O1 o1Y3 = a13.y();
                    androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, aVar4);
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar6);
                    } else {
                        a13.d();
                    }
                    R3.b(pVar2, a13, c20568f2A);
                    R3.b(pVar3, a13, o1Y3);
                    if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                        androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar4);
                    }
                    R3.b(pVar5, a13, vVarC3);
                    C20576h2 c20576h2 = C20576h2.f28641a;
                    String strC = u0.i.c(a13, R.string.checkerboard_lot_preview_open_card_button);
                    com.akita.compose.component.button.t tVarM = com.akita.compose.theme.re23.b.c(a13).M();
                    androidx.compose.ui.v vVarA3 = c20576h2.a(aVar4, 1.0f, true);
                    kotlinx.coroutines.T t12 = this.f251073m;
                    com.akita.compose.component.bottom_sheet.I i19 = this.f251074n;
                    Y41.l<InterfaceC19559a, G0> lVar2 = this.f251075o;
                    com.akita.compose.component.button.m.c(strC, new A(lVar2, i19, i18, t12), tVarM, vVarA3, null, null, null, false, false, null, a13, 512, 1008);
                    com.akita.compose.foundation.ui.g.b(6, null, a13, 6, 2);
                    com.akita.compose.component.button.m.c(u0.i.c(a13, R.string.checkerboard_lot_preview_open_booking_form_button), new D(lVar2, i19, i18, t12), com.akita.compose.theme.re23.b.c(a13).f2(), c20576h2.a(aVar4, 1.0f, true), null, null, null, false, false, null, a13, 512, 1008);
                    a13.z();
                    com.akita.compose.foundation.ui.g.a(f15, null, a13, 6);
                }
                a13.h();
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LotItemPreviewBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I f251076l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251077m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f251078n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(I i12, Y41.l<? super InterfaceC19559a, G0> lVar, int i13, int i14) {
            super(2);
            this.f251076l = i12;
            this.f251077m = lVar;
            this.f251078n = i14;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            Y41.l<InterfaceC19559a, G0> lVar = this.f251077m;
            int i12 = this.f251078n;
            x.a(this.f251076l, lVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k I i12, @Y61.l Y41.l<? super InterfaceC19559a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i13, int i14) {
        androidx.compose.runtime.B bE2 = a12.E(-719856907);
        Y41.l<? super InterfaceC19559a, G0> lVar2 = (i14 & 2) != 0 ? a.f251068l : lVar;
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
        com.akita.compose.component.bottom_sheet.I iA2 = com.akita.compose.component.bottom_sheet.N.a(false, 0.0f, bE2, 0, 7);
        Y41.l<? super InterfaceC19559a, G0> lVar3 = lVar2;
        com.akita.compose.component.bottom_sheet.H.a(new b(t12, iA2, lVar2), null, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(794711061, new c(lVar2, iA2, i12, t12), bE2), bE2, 0, 384, 4090);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, lVar3, i13, i14);
        }
    }
}
