package com.avito.android.comfortable_deal.common.view.client;

import android.text.method.LinkMovementMethod;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.B;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SmallBadge.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showTooltip", "Landroidx/compose/ui/unit/u;", "parentSizeForTooltip", "Ll0/g;", "parentPositionForTooltip", "_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w {

    /* compiled from: SmallBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f120703l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f120704m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f120705n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.graphics.painter.e eVar, com.akita.compose.foundation.p pVar, String str, int i12) {
            super(2);
            this.f120703l = eVar;
            this.f120704m = pVar;
            this.f120705n = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            String str = this.f120705n;
            w.a(this.f120703l, this.f120704m, str, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f120706l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            aVar.setMovementMethod(LinkMovementMethod.getInstance());
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f120707l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f120708l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f120709m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AttributedText f120710n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.graphics.painter.e eVar, com.akita.compose.foundation.p pVar, AttributedText attributedText, int i12) {
            super(2);
            this.f120708l = eVar;
            this.f120709m = pVar;
            this.f120710n = attributedText;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(521);
            AttributedText attributedText = this.f120710n;
            w.b(this.f120708l, this.f120709m, attributedText, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<androidx.compose.ui.layout.A, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f120711l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<l0.g> f120712m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1, InterfaceC22204y1<l0.g> interfaceC22204y12) {
            super(1);
            this.f120711l = interfaceC22204y1;
            this.f120712m = interfaceC22204y12;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.layout.A a12) {
            androidx.compose.ui.layout.A a13 = a12;
            this.f120711l.setValue(androidx.compose.ui.unit.u.a(a13.a()));
            this.f120712m.setValue(l0.g.a(B.e(a13)));
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f120713l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f120713l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f120713l;
            if (!interfaceC22204y1.getF42167b().booleanValue()) {
                interfaceC22204y1.setValue(Boolean.TRUE);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f120714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f120714l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f120714l.setValue(bool2);
            return G0.f406611a;
        }
    }

    /* compiled from: SmallBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f120715l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f120716m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AttributedText f120717n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f120718o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f120719p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.compose.ui.graphics.painter.e eVar, com.akita.compose.foundation.p pVar, AttributedText attributedText, String str, String str2, int i12) {
            super(2);
            this.f120715l = eVar;
            this.f120716m = pVar;
            this.f120717n = attributedText;
            this.f120718o = str;
            this.f120719p = str2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(521);
            com.akita.compose.foundation.p pVar = this.f120716m;
            AttributedText attributedText = this.f120717n;
            w.c(this.f120715l, pVar, attributedText, this.f120718o, this.f120719p, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k com.akita.compose.foundation.p pVar, @Y61.k String str, @Y61.l A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1617028017);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar2);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.foundation.ui.e.a(eVar, null, null, pVar, bE2, 56, 4);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.p.b(str, rVar, R1.m(C22501m2.a(aVar, "SmallBadgeTextTag"), 4, 0.0f, 0.0f, 0.0f, 14), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(eVar, pVar, str, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k com.akita.compose.foundation.p pVar, @Y61.k AttributedText attributedText, @Y61.l A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(249068880);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar2);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.foundation.ui.e.a(eVar, null, null, pVar, bE2, 56, 4);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.m(aVar, 4, 0.0f, 0.0f, 0.0f, 14), R.attr.textM20, b.f120706l, c.f120707l, 0, bE2, 27704, 32);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(eVar, pVar, attributedText, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k androidx.compose.ui.graphics.painter.e eVar, @Y61.k com.akita.compose.foundation.p pVar, @Y61.k AttributedText attributedText, @Y61.k String str, @Y61.k String str2, @Y61.l A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-804187842);
        bE2.C(-1464827900);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        Object objI = com.akita.compose.component.accordion.s.i(-1464825749, bE2, false);
        if (objI == c1651a) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            objI = C22126m3.g(androidx.compose.ui.unit.u.a(0L));
            bE2.H(objI);
        }
        InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objI;
        Object objI2 = com.akita.compose.component.accordion.s.i(-1464823254, bE2, false);
        if (objI2 == c1651a) {
            l0.g.f413384b.getClass();
            objI2 = C22126m3.g(l0.g.a(0L));
            bE2.H(objI2);
        }
        InterfaceC22204y1 interfaceC22204y13 = (InterfaceC22204y1) objI2;
        bE2.X(false);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
        R3.b(pVar2, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
        R3.b(pVar3, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar4);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar5 = InterfaceC22413h.a.f40793d;
        R3.b(pVar5, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.v vVarY = C20588k2.y(aVar, null, 3);
        bE2.C(-2089022881);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new e(interfaceC22204y12, interfaceC22204y13);
            bE2.H(objT2);
        }
        bE2.X(false);
        androidx.compose.ui.v vVarA = C22392w0.a(vVarY, (Y41.l) objT2);
        bE2.C(-2089016536);
        Object objT3 = bE2.t();
        if (objT3 == c1651a) {
            objT3 = androidx.compose.foundation.interaction.l.a();
            bE2.H(objT3);
        }
        androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT3;
        Object objI3 = com.akita.compose.component.accordion.s.i(-2089014227, bE2, false);
        if (objI3 == c1651a) {
            objI3 = new f(interfaceC22204y1);
            bE2.H(objI3);
        }
        bE2.X(false);
        androidx.compose.ui.v vVarB = C21086w0.b(vVarA, mVar, null, false, null, (Y41.a) objI3, 28);
        C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(pVar2, bE2, c20568f2A2);
        R3.b(pVar3, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar4);
        }
        R3.b(pVar5, bE2, vVarC2);
        com.akita.compose.foundation.ui.e.a(eVar, null, null, pVar, bE2, 56, 4);
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.m(aVar, 4, 0.0f, 0.0f, 0.0f, 14), R.attr.textM20, null, null, 0, bE2, 56, 56);
        bE2.C(917385001);
        if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
            long j12 = ((androidx.compose.ui.unit.u) interfaceC22204y12.getF42167b()).f42872a;
            long j13 = ((l0.g) interfaceC22204y13.getF42167b()).f413387a;
            bE2.C(917390040);
            Object objT4 = bE2.t();
            if (objT4 == c1651a) {
                objT4 = new g(interfaceC22204y1);
                bE2.H(objT4);
            }
            bE2.X(false);
            com.avito.android.comfortable_deal.common.view.B.b(str, str2, j12, j13, (Y41.l) objT4, bE2, 24576);
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(eVar, pVar, attributedText, str, str2, i12);
        }
    }
}
