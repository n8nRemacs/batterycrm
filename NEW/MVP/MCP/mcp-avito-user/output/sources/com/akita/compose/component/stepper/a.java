package com.akita.compose.component.stepper;

import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.l2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ColorValues.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/stepper/a;", "", "stepper_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62833a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.akita.compose.foundation.p f62834b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.akita.compose.foundation.p f62835c;

    public a(com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.p pVar3, int i12, C42822w c42822w) {
        pVar2 = (i12 & 2) != 0 ? null : pVar2;
        pVar3 = (i12 & 4) != 0 ? null : pVar3;
        this.f62833a = pVar;
        this.f62834b = pVar2;
        this.f62835c = pVar3;
    }

    @InterfaceC22132o
    @Y61.k
    public final I3 a(@Y61.k StepperState stepperState, @Y61.l A a12) {
        long jC2;
        com.akita.compose.foundation.p pVar;
        com.akita.compose.foundation.p pVar2;
        a12.C(628718802);
        if (stepperState == StepperState.f62829c && (pVar2 = this.f62834b) != null && pVar2.f63641d) {
            a12.C(1126243148);
            jC2 = pVar2.c(a12);
            a12.h();
        } else if (stepperState == StepperState.f62830d && (pVar = this.f62835c) != null && pVar.f63641d) {
            a12.C(1126246220);
            jC2 = pVar.c(a12);
            a12.h();
        } else {
            a12.C(1126247149);
            jC2 = this.f62833a.c(a12);
            a12.h();
        }
        I3 i3B = l2.b(jC2, C20310q.e(0, 0, null, 7), a12, 48, 12);
        a12.h();
        return i3B;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f62833a, aVar.f62833a) && L.f(this.f62834b, aVar.f62834b) && L.f(this.f62835c, aVar.f62835c);
    }

    public final int hashCode() {
        int iHashCode = this.f62833a.hashCode() * 31;
        com.akita.compose.foundation.p pVar = this.f62834b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        com.akita.compose.foundation.p pVar2 = this.f62835c;
        return iHashCode2 + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ColorValues(default=" + this.f62833a + ", disabled=" + this.f62834b + ", error=" + this.f62835c + ')';
    }
}
