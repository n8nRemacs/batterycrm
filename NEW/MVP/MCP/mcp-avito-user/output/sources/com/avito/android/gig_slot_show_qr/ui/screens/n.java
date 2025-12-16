package com.avito.android.gig_slot_show_qr.ui.screens;

import Y41.p;
import android.util.Base64;
import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.C20805p0;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.C20833q0;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20620t;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material.C21116b5;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
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
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import coil.compose.C27242f;
import coil.compose.w;
import com.avito.android.gig_slot_show_qr.mvi.o;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: GigSlotShowQrScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-show-qr_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o.a f160977l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f160978m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f160979n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f160980o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, int i12) {
            super(2);
            this.f160977l = aVar;
            this.f160978m = (N) aVar2;
            this.f160979n = (N) aVar3;
            this.f160980o = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f160980o | 1);
            ?? r02 = this.f160978m;
            ?? r12 = this.f160979n;
            n.a(this.f160977l, r02, r12, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f160981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, AttributedText attributedText) {
            super(2);
            this.f160981l = attributedText;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(9);
            n.b(this.f160981l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f160982l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AttributedText f160983m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f160984n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, int i13, AttributedText attributedText) {
            super(2);
            this.f160982l = i12;
            this.f160983m = attributedText;
            this.f160984n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f160984n | 1);
            n.c(this.f160982l, this.f160983m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_slot_show_qr.ui.screens.GigSlotShowQrScreenKt$QrImageItem$1$1", f = "GigSlotShowQrScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f160985q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<byte[]> f160986r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC22204y1<byte[]> interfaceC22204y1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f160985q = str;
            this.f160986r = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f160985q, this.f160986r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f160986r.setValue(Base64.decode(this.f160985q, 0));
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotShowQrScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f160987l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i12) {
            super(2);
            this.f160987l = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            n.d(this.f160987l, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k o.a aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.l A a12, int i12) {
        int i13;
        o.a aVar4 = aVar;
        B bE2 = a12.E(864950834);
        int i14 = (bE2.B(aVar4) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(aVar2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar3) ? 256 : 128;
        }
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar5 = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar6 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(lVar, aVar6, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, aVar5);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar7 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar7);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            com.avito.android.gig_slot_show_qr.ui.common.d.a(aVar2, aVar3, bE2, (i14 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            v vVarB = a2.b(aVar5, a2.a(bE2), true, true);
            float f12 = 20;
            h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 16;
            v vVarK = R1.k(f13, 0.0f, 2, R1.m(vVarB, 0.0f, f12, 0.0f, f12, 5));
            I iA3 = H.a(lVar, aVar6, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar7);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            v vVarM = R1.m(aVar5, 0.0f, 0.0f, 0.0f, f13, 7);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            aVar4 = aVar;
            com.akita.compose.foundation.ui.p.b(aVar4.f160911a, com.akita.compose.theme.re23.b.f63988f.f65232c, vVarM, false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            List<AttributedText> list = aVar4.f160913c;
            AttributedText attributedText = (AttributedText) C42745f0.G(list);
            bE2.C(-386242426);
            if (attributedText == null) {
                i13 = 1;
            } else {
                i13 = 1;
                c(1, attributedText, bE2, 70);
            }
            bE2.X(false);
            d(aVar4.f160912b, bE2, 0);
            bE2.C(-386236826);
            int i17 = 0;
            for (Object obj : C42745f0.w(list, i13)) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                c(i17 + 2, (AttributedText) obj, bE2, 64);
                i17 = i18;
            }
            bE2.X(false);
            bE2.C(-386232223);
            AttributedText attributedText2 = aVar4.f160914d;
            if (attributedText2 != null) {
                b(attributedText2, bE2, 8);
            }
            androidx.compose.foundation.H.A(bE2, false, true, true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(aVar4, aVar2, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(AttributedText attributedText, A a12, int i12) {
        B bE2 = a12.E(-502550993);
        v.a aVar = v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarM = R1.m(aVar, 0.0f, 20, 0.0f, 0.0f, 13);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        float f12 = 16;
        v vVarI = R1.i(androidx.compose.foundation.A.b(vVarM, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), androidx.compose.foundation.shape.o.a(f12)), f12);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        com.akita.compose.theme.re23.b.f63985c.getClass();
        C21116b5.a(56, 12, 0L, bE2, null, u0.e.a(com.akita.compose.theme.re23.e.f64138I5, 0, bE2), "");
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, R1.k(8, 0.0f, 2, aVar), 0, null, null, 0, bE2, 56, 60);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, attributedText);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(int i12, AttributedText attributedText, A a12, int i13) {
        B bE2 = a12.E(877946221);
        v.a aVar = v.f42878y1;
        float f12 = 12;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        v vVarK = R1.k(0.0f, f12, 1, aVar);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
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
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
        v vVarO = C20588k2.o(aVar, 44);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        v vVarB = androidx.compose.foundation.A.b(vVarO, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), androidx.compose.foundation.shape.o.a(f12));
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB);
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
        R3.b(pVar, bE2, interfaceC22365i0D);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20644z c20644z = C20644z.f28804a;
        com.akita.compose.foundation.ui.p.b(String.valueOf(i12), com.akita.compose.theme.re23.b.f63988f.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        bE2.X(true);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, c20576h2.c(R1.m(aVar, 13, 0.0f, 0.0f, 0.0f, 14), InterfaceC22215f.a.f39086l), 0, null, null, 0, bE2, 8, 60);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, i13, attributedText);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(String str, A a12, int i12) {
        B bE2 = a12.E(-966655197);
        int i13 = (bE2.B(str) ? 4 : 2) | i12;
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(200136928);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(null);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.C(200139229);
            boolean z12 = (i13 & 14) == 4;
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                objT2 = new d(str, interfaceC22204y1, null);
                bE2.H(objT2);
            }
            bE2.X(false);
            C22187u0.d((p) objT2, bE2, str);
            if (interfaceC22204y1.getF42167b() != 0) {
                v.a aVar = v.f42878y1;
                v vVarD = C20588k2.d(aVar, 1.0f);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                v vVarK = R1.k(0.0f, 12, 1, vVarD);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                C20805p0 c20805p0A = C20833q0.a(com.akita.compose.theme.re23.b.f63984b.f63842E1.c(bE2), 2);
                v vVarB = C20529i0.b(vVarK, c20805p0A.f29789a, c20805p0A.f29790b, androidx.compose.foundation.shape.o.a(28));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i14 = bE2.f37888Q;
                O1 o1S = bE2.S();
                v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
                p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                    AK.c.y(i14, bE2, i14, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                C20644z c20644z = C20644z.f28804a;
                C27242f c27242fA = w.a(interfaceC22204y1.getF42167b(), null, bE2, 8, 62);
                InterfaceC22374n.f40491a.getClass();
                C20806p1.a(c27242fA, "", C20620t.a(C20588k2.d(aVar, 1.0f), 1.0f, false), null, InterfaceC22374n.a.f40496e, 0.0f, null, bE2, 25008, 104);
                bE2.X(true);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(str, i12);
        }
    }
}
