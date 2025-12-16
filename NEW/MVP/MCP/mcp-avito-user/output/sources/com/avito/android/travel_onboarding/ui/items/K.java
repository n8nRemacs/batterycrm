package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.tooltip.TooltipTailPosition;
import com.akita.compose.component.tooltip.TooltipTailToAnchorPosition;
import com.akita.compose.component.tooltip.TooltipToAnchorPosition;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;

/* compiled from: ConditionsHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class K {

    /* compiled from: ConditionsHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f302380b;

        public a(Y41.l lVar) {
            this.f302380b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f302380b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f302380b;
        }

        public final int hashCode() {
            return this.f302380b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f302380b.invoke(deepLink);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar, @Y61.k AttributedText attributedText, @Y61.l String str) throws Throwable {
        androidx.compose.runtime.B bE2 = a12.E(-1090564661);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.component.tooltip.t tVarA = com.akita.compose.component.tooltip.v.a(bE2);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, R.attr.textH50, null, new D(lVar, attributedText), 0, bE2, 8, 42);
        bE2.C(2066726811);
        if (str != null && str.length() != 0) {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(bE2, C20588k2.o(androidx.compose.ui.v.f42878y1, 4));
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(764280696, new E(str), bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.tooltip.c.a(c22096nC, tVarA, com.akita.compose.theme.re23.b.x(bE2).getF66855a(), null, TooltipToAnchorPosition.f63461b, TooltipTailPosition.f63452b, TooltipTailToAnchorPosition.f63457c, 0L, false, androidx.compose.runtime.internal.r.c(-951951154, new H(t12, tVarA), bE2), bE2, (com.akita.compose.component.tooltip.w.f63552s << 6) | 807100422, 392);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new I(i12, lVar, vVar, attributedText, str);
        }
    }
}
