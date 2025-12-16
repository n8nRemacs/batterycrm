package com.akita.compose.component.time_line.internal;

import Y41.s;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.time_line.g;
import com.akita.compose.component.time_line.j;
import com.akita.compose.foundation.p;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLineScopeImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "index", "Lcom/akita/compose/component/time_line/j;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/akita/compose/component/time_line/g;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/time_line/j;Lcom/akita/compose/component/time_line/g;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements s<Integer, j, g, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f63148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f63149m;

    /* compiled from: TimeLineScopeImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TimeLineItemPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeLineItemPosition timeLineItemPosition = TimeLineItemPosition.f63131b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TimeLineItemPosition timeLineItemPosition2 = TimeLineItemPosition.f63131b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, C22096n c22096n) {
        super(5);
        this.f63148l = str;
        this.f63149m = c22096n;
    }

    @Override // Y41.s
    public final G0 invoke(Integer num, j jVar, g gVar, A a12, Integer num2) {
        TimeLineItemPosition timeLineItemPosition;
        i.a aVar;
        p pVar;
        p pVar2;
        int i12;
        int i13;
        int i14;
        TimeLineItemState timeLineItemState;
        int iIntValue = num.intValue();
        j jVar2 = jVar;
        g gVar2 = gVar;
        A a13 = a12;
        num2.intValue();
        if (iIntValue == 0) {
            gVar2.getClass();
            timeLineItemPosition = TimeLineItemPosition.f63131b;
        } else {
            timeLineItemPosition = iIntValue == gVar2.f63124c - 1 ? TimeLineItemPosition.f63133d : TimeLineItemPosition.f63132c;
        }
        InterfaceC22196w1 interfaceC22196w1 = gVar2.f63123b;
        C22061e3 c22061e3 = (C22061e3) interfaceC22196w1;
        TimeLineItemState timeLineItemState2 = iIntValue < c22061e3.e() ? TimeLineItemState.f63136b : iIntValue == c22061e3.e() ? TimeLineItemState.f63137c : TimeLineItemState.f63138d;
        int iOrdinal = (iIntValue == 0 ? TimeLineItemPosition.f63131b : iIntValue == gVar2.f63124c - 1 ? TimeLineItemPosition.f63133d : TimeLineItemPosition.f63132c).ordinal();
        if (iOrdinal == 0) {
            InterfaceC22215f.f39074a.getClass();
            aVar = InterfaceC22215f.a.f39088n;
        } else if (iOrdinal == 1) {
            InterfaceC22215f.f39074a.getClass();
            aVar = InterfaceC22215f.a.f39089o;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22215f.f39074a.getClass();
            aVar = InterfaceC22215f.a.f39090p;
        }
        v.a aVar2 = v.f42878y1;
        v vVarD = C20588k2.d(C.b(aVar2, TimeLineItemType.f63142c), 1.0f);
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28662d, aVar, a13, 0);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        v vVarC = n.c(a13, vVarD);
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
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
        R3.b(pVar3, a13, iA2);
        Y41.p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
        R3.b(pVar4, a13, o1Y);
        Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
            r.B(f37888q, a13, f37888q, pVar5);
        }
        Y41.p<InterfaceC22413h, v, G0> pVar6 = InterfaceC22413h.a.f40793d;
        R3.b(pVar6, a13, vVarC);
        K k12 = K.f28344a;
        v vVarF = C20588k2.f(C20588k2.d(aVar2, 1.0f), jVar2.f63156g);
        InterfaceC22215f.f39074a.getClass();
        TimeLineItemState timeLineItemState3 = timeLineItemState2;
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39086l, a13, 48);
        int f37888q2 = a13.getF37888Q();
        O1 o1Y2 = a13.y();
        v vVarC2 = n.c(a13, vVarF);
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
        R3.b(pVar3, a13, c20568f2A);
        R3.b(pVar4, a13, o1Y2);
        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
            r.B(f37888q2, a13, f37888q2, pVar5);
        }
        R3.b(pVar6, a13, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        C22061e3 c22061e32 = (C22061e3) interfaceC22196w1;
        TimeLineItemState timeLineItemState4 = iIntValue < c22061e32.e() ? TimeLineItemState.f63136b : iIntValue == c22061e32.e() ? TimeLineItemState.f63137c : TimeLineItemState.f63138d;
        TimeLineItemState timeLineItemState5 = TimeLineItemState.f63138d;
        p pVar7 = jVar2.f63151b;
        p pVar8 = jVar2.f63150a;
        p pVar9 = timeLineItemState4 != timeLineItemState5 ? pVar8 : pVar7;
        a13.C(-1299234631);
        TimeLineItemPosition timeLineItemPosition2 = TimeLineItemPosition.f63131b;
        float f12 = jVar2.f63155f;
        float f13 = jVar2.f63158i;
        float f14 = jVar2.f63154e;
        if (timeLineItemPosition != timeLineItemPosition2) {
            pVar = pVar7;
            pVar2 = pVar8;
            i12 = 0;
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(c20576h2.a(aVar2, 1.0f, true), f14), pVar9.c(a13), o.c(0.0f, f12, f12, 0.0f, 9)), a13, 0);
            com.akita.compose.foundation.ui.g.b(f13, null, a13, 0, 2);
        } else {
            pVar = pVar7;
            pVar2 = pVar8;
            i12 = 0;
        }
        a13.h();
        C22096n c22096n = this.f63149m;
        if (c22096n != null) {
            a13.C(-1620783843);
            c22096n.invoke(pVar9, a13, Integer.valueOf(i12));
            a13.h();
            i13 = 0;
        } else {
            a13.C(-1620696051);
            i13 = 0;
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.o(aVar2, jVar2.f63157h), pVar9.c(a13), o.f30153a), a13, 0);
            a13.h();
        }
        if (timeLineItemPosition != TimeLineItemPosition.f63133d) {
            com.akita.compose.foundation.ui.g.b(f13, null, a13, i13, 2);
            timeLineItemState = timeLineItemState3;
            i14 = 0;
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(c20576h2.a(aVar2, 1.0f, true), f14), (timeLineItemState == TimeLineItemState.f63136b ? pVar2 : pVar).c(a13), o.c(f12, 0.0f, 0.0f, f12, 6)), a13, 0);
        } else {
            i14 = i13;
            timeLineItemState = timeLineItemState3;
        }
        a13.z();
        com.akita.compose.foundation.ui.g.a(jVar2.f63159j, null, a13, i14);
        com.akita.compose.foundation.r rVar = timeLineItemState != timeLineItemState5 ? jVar2.f63152c : jVar2.f63153d;
        androidx.compose.ui.text.style.s.f42720b.getClass();
        com.akita.compose.foundation.ui.p.b(this.f63148l, rVar, null, false, 0L, null, 3, androidx.compose.ui.text.style.s.f42722d, false, null, a13, 14155776, 828);
        a13.z();
        return G0.f406611a;
    }
}
