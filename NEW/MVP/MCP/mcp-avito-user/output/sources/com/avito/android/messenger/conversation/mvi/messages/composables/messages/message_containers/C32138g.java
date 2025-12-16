package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.l2;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IncomingMessage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32138g {

    /* compiled from: IncomingMessage.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v;", "bubbleModifier", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.g$a */
    public static final class a extends N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f192386l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.c f192387m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192388n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192389o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f192390p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f192391q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, T1.c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar2) {
            super(3);
            this.f192386l = str;
            this.f192387m = cVar;
            this.f192388n = aVar;
            this.f192389o = aVar2;
            this.f192390p = pVar;
            this.f192391q = pVar2;
        }

        @Override // Y41.q
        public final G0 invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.ui.v vVar2 = vVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(vVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.a aVar = com.akita.compose.theme.re23.b.f63984b;
                long jC2 = aVar.f63973w1.c(a13);
                a13.C(-826569655);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                Object obj = A.a.f37868b;
                if (objT == obj) {
                    objT = l2.a(jC2);
                    a13.H(objT);
                }
                C20268c c20268c = (C20268c) objT;
                a13.h();
                com.avito.android.messenger.conversation.mvi.messages.composables.other.g.a(this.f192386l, aVar.f63955q1.c(a13), jC2, c20268c, a13, 4096);
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192340a.getClass();
                androidx.compose.ui.v vVarB = androidx.compose.ui.draw.o.b(androidx.compose.ui.draw.k.a(vVar2, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.a(this.f192387m, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192343d, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192344e, com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.a.f192346g)), new C32135d(c20268c));
                a13.C(-826549394);
                Object objT2 = a13.t();
                if (objT2 == obj) {
                    objT2 = androidx.compose.foundation.interaction.l.a();
                    a13.H(objT2);
                }
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT2;
                a13.h();
                a13.C(-826545056);
                Y41.a<G0> aVar2 = this.f192388n;
                boolean zB2 = a13.B(aVar2);
                Object objT3 = a13.t();
                if (zB2 || objT3 == obj) {
                    objT3 = new C32136e(aVar2);
                    a13.H(objT3);
                }
                Y41.a aVar3 = (Y41.a) objT3;
                a13.h();
                a13.C(-826547012);
                Y41.a<G0> aVar4 = this.f192389o;
                boolean zB3 = a13.B(aVar4);
                Object objT4 = a13.t();
                if (zB3 || objT4 == obj) {
                    objT4 = new C32137f(aVar4);
                    a13.H(objT4);
                }
                a13.h();
                androidx.compose.ui.v vVarA = C22501m2.a(C21086w0.e(vVarB, mVar, null, aVar3, (Y41.a) objT4, 444), "MessageBubble");
                InterfaceC22215f.f39074a.getClass();
                i.a aVar5 = InterfaceC22215f.a.f39088n;
                C20585k.f28659a.getClass();
                I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar5, a13, 54);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarA);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
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
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                a13.C(-1042056402);
                Y41.p<androidx.compose.runtime.A, Integer, G0> pVar2 = this.f192390p;
                if (pVar2 != null) {
                    pVar2.invoke(a13, 0);
                }
                a13.h();
                this.f192391q.invoke(a13, 0);
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IncomingMessage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.g$b */
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ int f192392A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f192393B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f192394C;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Image f192395l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f192396m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f192397n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ T1.c f192398o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f192399p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f192400q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f192401r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f192402s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f192403t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ T1.d.a f192404u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192405v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192406w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f192407x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f192408y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f192409z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Image image, String str, String str2, T1.c cVar, androidx.compose.ui.v vVar, String str3, String str4, String str5, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, T1.d.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar2, int i12, int i13, int i14) {
            super(2);
            this.f192395l = image;
            this.f192396m = str;
            this.f192397n = str2;
            this.f192398o = cVar;
            this.f192399p = vVar;
            this.f192400q = str3;
            this.f192401r = str4;
            this.f192402s = str5;
            this.f192403t = kVar;
            this.f192404u = aVar;
            this.f192405v = aVar2;
            this.f192406w = aVar3;
            this.f192407x = aVar4;
            this.f192408y = pVar;
            this.f192409z = pVar2;
            this.f192392A = i12;
            this.f192393B = i13;
            this.f192394C = i14;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192392A | 1);
            int iA3 = C22066f2.a(this.f192393B);
            androidx.compose.ui.v vVar = this.f192399p;
            Y41.a<G0> aVar = this.f192407x;
            int i12 = this.f192394C;
            C32138g.a(this.f192395l, this.f192396m, this.f192397n, this.f192398o, vVar, this.f192400q, this.f192401r, this.f192402s, this.f192403t, this.f192404u, this.f192405v, this.f192406w, aVar, this.f192408y, this.f192409z, a12, iA2, iA3, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l Image image, @Y61.l String str, @Y61.l String str2, @Y61.l T1.c cVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, @Y61.l T1.d.a aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar2, @Y61.l androidx.compose.runtime.A a12, int i12, int i13, int i14) {
        androidx.compose.runtime.B bE2 = a12.E(-1350882814);
        String str6 = (i14 & 32) != 0 ? null : str3;
        String str7 = (i14 & 64) != 0 ? null : str4;
        String str8 = (i14 & 128) != 0 ? null : str5;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar2 = (i14 & 256) != 0 ? null : kVar;
        T1.d.a aVar5 = (i14 & 512) != 0 ? null : aVar;
        Y41.a<G0> aVar6 = (i14 & 1024) != 0 ? null : aVar2;
        Y41.a<G0> aVar7 = (i14 & 2048) != 0 ? null : aVar3;
        Y41.a<G0> aVar8 = (i14 & 4096) != 0 ? null : aVar4;
        Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar3 = (i14 & 8192) != 0 ? null : pVar;
        int i15 = i12 >> 3;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.m.a(image, str, str2, cVar, C22501m2.a(vVar, "IncomingMessage"), str7, str8, kVar2, aVar5, aVar6, androidx.compose.runtime.internal.r.c(694294937, new a(str6, cVar, aVar8, aVar7, pVar3, pVar2), bE2), bE2, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(image, str, str2, cVar, vVar, str6, str7, str8, kVar2, aVar5, aVar6, aVar7, aVar8, pVar3, pVar2, i12, i13, i14);
        }
    }
}
