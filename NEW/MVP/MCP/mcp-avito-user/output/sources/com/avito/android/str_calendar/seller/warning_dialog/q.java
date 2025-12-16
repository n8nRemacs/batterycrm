package com.avito.android.str_calendar.seller.warning_dialog;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogActions;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogCondition;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarWarningDialogScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q {

    /* compiled from: StrCalendarWarningDialogScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WarningDialogData f288100l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f288101m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(WarningDialogData warningDialogData, Y41.l<? super DeepLink, G0> lVar) {
            super(1);
            this.f288100l = warningDialogData;
            this.f288101m = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            List<WarningDialogCondition> list = this.f288100l.f288093c;
            m mVar = m.f288087l;
            m0Var2.a(list.size(), mVar != null ? new n(mVar, list) : null, new o(list), new C22096n(-1091073711, new p(this.f288101m, list), true));
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarWarningDialogScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WarningDialogData f288102l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f288103m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(WarningDialogData warningDialogData, Y41.l<? super String, G0> lVar) {
            super(0);
            this.f288102l = warningDialogData;
            this.f288103m = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            Map<String, String> mapC;
            ButtonAction action = this.f288102l.f288094d.f288089c.getAction();
            this.f288103m.invoke((action == null || (mapC = action.c()) == null) ? null : mapC.get("scrollToId"));
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarWarningDialogScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WarningDialogData f288104l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f288105m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f288106n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f288107o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f288108p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(WarningDialogData warningDialogData, Y41.l<? super String, G0> lVar, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f288104l = warningDialogData;
            this.f288105m = (N) lVar;
            this.f288106n = (N) aVar;
            this.f288107o = (N) lVar2;
            this.f288108p = i12;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f288108p | 1);
            ?? r22 = this.f288106n;
            ?? r32 = this.f288107o;
            ?? r12 = this.f288105m;
            q.a(this.f288104l, r12, r22, r32, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k WarningDialogData warningDialogData, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1421600845);
        v.a aVar2 = v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar3 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
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
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        K k12 = K.f28344a;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        float f12 = 16;
        v vVarM = R1.m(aVar2, f12, 28, f12, 0.0f, 8);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(warningDialogData.f288092b, com.akita.compose.theme.re23.b.f63988f.f65233d, vVarM, false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
        C20650b.a(androidx.compose.ui.input.nestedscroll.e.a(aVar2, J1.e(bE2), null), null, null, false, null, null, null, false, null, new a(warningDialogData, lVar2), bE2, 0, 510);
        float f13 = 10;
        v vVarL = R1.l(C20588k2.d(aVar2, 1.0f), f13, 23, f13, f12);
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarL);
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
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        v vVarA = c20576h2.a(aVar2, 1.0f, true);
        WarningDialogActions warningDialogActions = warningDialogData.f288094d;
        com.avito.android.str_calendar.seller.warning_dialog.composable.c.a(warningDialogActions.f288089c, new b(warningDialogData, lVar), vVarA, bE2, 8);
        C20608p2.a(bE2, C20588k2.o(aVar2, 8));
        com.avito.android.str_calendar.seller.warning_dialog.composable.c.a(warningDialogActions.f288088b, aVar, c20576h2.a(aVar2, 1.0f, true), bE2, ((i12 >> 3) & 112) | 8);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new c(warningDialogData, lVar, aVar, lVar2, i12);
        }
    }
}
