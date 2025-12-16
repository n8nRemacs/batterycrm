package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.l2;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MessageFromAvito.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v;", "bubbleModifier", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o extends N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f192417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1.c f192419n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192420o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f192421p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f192422q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z12, String str, T1.c cVar, Y41.a aVar, Y41.p pVar, C22096n c22096n) {
        super(3);
        this.f192417l = z12;
        this.f192418m = str;
        this.f192419n = cVar;
        this.f192420o = aVar;
        this.f192421p = pVar;
        this.f192422q = c22096n;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        long jC2;
        long jC3;
        com.avito.android.messenger.conversation.mvi.messages.utils.h hVar;
        androidx.compose.ui.v vVar2 = vVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(vVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            if (this.f192417l) {
                a13.C(22877807);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.a aVar = com.akita.compose.theme.re23.b.f63984b;
                jC2 = aVar.f63973w1.c(a13);
                com.akita.compose.foundation.p pVar = aVar.f63955q1;
                jC3 = pVar.c(a13);
                hVar = new com.avito.android.messenger.conversation.mvi.messages.utils.h(aVar.f63973w1, pVar);
                a13.h();
            } else {
                a13.C(23134487);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.a aVar2 = com.akita.compose.theme.re23.b.f63984b;
                jC2 = aVar2.f63960s0.c(a13);
                com.akita.compose.foundation.p pVar2 = aVar2.f63951p0;
                jC3 = pVar2.c(a13);
                hVar = new com.avito.android.messenger.conversation.mvi.messages.utils.h(aVar2.f63960s0, pVar2);
                a13.h();
            }
            com.avito.android.messenger.conversation.mvi.messages.utils.h hVar2 = hVar;
            long j12 = jC2;
            long j13 = jC3;
            a13.C(1386228056);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = l2.a(j12);
                a13.H(objT);
            }
            C20268c c20268c = (C20268c) objT;
            a13.h();
            com.avito.android.messenger.conversation.mvi.messages.composables.other.g.a(this.f192418m, j13, j12, c20268c, a13, 4096);
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192340a.getClass();
            androidx.compose.ui.v vVarB = androidx.compose.ui.draw.o.b(androidx.compose.ui.draw.k.a(vVar2, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.a(this.f192419n, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192343d, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192344e, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192346g)), new m(c20268c));
            a13.C(1386247485);
            Object objT2 = a13.t();
            if (objT2 == obj) {
                objT2 = androidx.compose.foundation.interaction.l.a();
                a13.H(objT2);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT2;
            a13.h();
            a13.C(1386249867);
            Y41.a<G0> aVar3 = this.f192420o;
            boolean zB2 = a13.B(aVar3);
            Object objT3 = a13.t();
            if (zB2 || objT3 == obj) {
                objT3 = new n(aVar3);
                a13.H(objT3);
            }
            a13.h();
            androidx.compose.ui.v vVarA = com.akita.compose.foundation.semantics.a.a(C22501m2.a(C21086w0.b(vVarB, mVar, null, false, null, (Y41.a) objT3, 28), "MessageBubble"), hVar2);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39088n;
            C20585k.f28659a.getClass();
            I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar4, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar5);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            a13.C(752120669);
            Y41.p<androidx.compose.runtime.A, Integer, G0> pVar4 = this.f192421p;
            if (pVar4 != null) {
                pVar4.invoke(a13, 0);
            }
            a13.h();
            this.f192422q.invoke(a13, 0);
            a13.z();
        }
        return G0.f406611a;
    }
}
