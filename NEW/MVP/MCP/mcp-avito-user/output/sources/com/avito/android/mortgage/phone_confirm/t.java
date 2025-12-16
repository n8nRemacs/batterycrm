package com.avito.android.mortgage.phone_confirm;

import J00.b;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.input.InputState;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhoneConfirmScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t {

    /* compiled from: PhoneConfirmScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.phone_confirm.PhoneConfirmScreenKt$PhoneConfirmScreen$1", f = "PhoneConfirmScreen.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201665q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<J00.b> f201666r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ApiError, G0> f201667s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f201668t;

        /* compiled from: PhoneConfirmScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJ00/b;", "it", "Lkotlin/G0;", "emit", "(LJ00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.phone_confirm.t$a$a, reason: collision with other inner class name */
        public static final class C5977a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<ApiError, G0> f201669b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f201670c;

            public C5977a(Y41.a aVar, Y41.l lVar) {
                this.f201669b = lVar;
                this.f201670c = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                J00.b bVar = (J00.b) obj;
                if (bVar instanceof b.C0501b) {
                    this.f201669b.invoke(((b.C0501b) bVar).f8698a);
                } else if (bVar instanceof b.a) {
                    this.f201670c.invoke();
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
            super(2, continuation);
            this.f201666r = interfaceC43160i;
            this.f201667s = lVar;
            this.f201668t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f201668t, this.f201667s, continuation, this.f201666r);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201665q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C5977a c5977a = new C5977a(this.f201668t, this.f201667s);
                this.f201665q = 1;
                if (this.f201666r.collect(c5977a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneConfirmScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J00.c f201671l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<J00.b> f201672m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f201673n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ApiError, G0> f201674o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f201675p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f201676q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f201677r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(J00.c cVar, InterfaceC43160i<? extends J00.b> interfaceC43160i, Y41.a<G0> aVar, Y41.l<? super ApiError, G0> lVar, Y41.l<? super String, G0> lVar2, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f201671l = cVar;
            this.f201672m = interfaceC43160i;
            this.f201673n = aVar;
            this.f201674o = lVar;
            this.f201675p = lVar2;
            this.f201676q = aVar2;
            this.f201677r = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f201677r | 1);
            Y41.a<G0> aVar = this.f201673n;
            Y41.l<ApiError, G0> lVar = this.f201674o;
            t.a(this.f201671l, this.f201672m, aVar, lVar, this.f201675p, this.f201676q, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ContentDrawTracking.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "com/avito/android/analytics/screens/compose/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f201678l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.analytics.screens.compose.a f201679m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.analytics.screens.mvi.r rVar, com.avito.android.analytics.screens.compose.a aVar) {
            super(1);
            this.f201678l = rVar;
            this.f201679m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
            dVar.y1();
            com.avito.android.analytics.screens.compose.a aVar = this.f201679m;
            com.avito.android.analytics.screens.mvi.r rVar = this.f201678l;
            if (rVar != null) {
                aVar.n(rVar.f90666a, rVar.f90667b, null);
            }
            aVar.f();
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k J00.c cVar, @Y61.k InterfaceC43160i<? extends J00.b> interfaceC43160i, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super ApiError, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.a<G0> aVar2, @Y61.l A a12, int i12) {
        String strJ;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        String strB;
        B bE2 = a12.E(-575527037);
        C22187u0.e(lVar, aVar, new a(aVar, lVar, null, interfaceC43160i), bE2);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarA = C20646z1.a(aVar3, IntrinsicSize.f28333b);
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
        bE2.C(-976608008);
        bE2.C(2063036140);
        boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
        int i15 = cVar.f8711l;
        boolean z15 = cVar.f8713n;
        boolean z16 = cVar.f8712m;
        String str = cVar.f8709j;
        if (zBooleanValue) {
            bE2.C(421109671);
            androidx.compose.ui.v vVarD = C20588k2.d(aVar3, 1.0f);
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(16, 0.0f, 2, vVarD);
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            float f12 = 8;
            C20608p2.a(bE2, C20588k2.f(aVar3, f12));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar2 = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(cVar.f8706g, iVar2.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            C20608p2.a(bE2, C20588k2.f(aVar3, 20));
            com.avito.android.mortgage.widgets.i.a(cVar.f8707h, cVar.f8708i, lVar2, null, !z16, str == null ? InputState.f61668b : InputState.f61669c, null, null, bE2, (i12 >> 6) & 896, 200);
            bE2.C(-1416652149);
            if (str != null) {
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(iVar2.f65244o, com.akita.compose.theme.re23.b.f63984b.f63880R0, 0L, 0L, null, 0L, 0L, 1022), R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
                G0 g02 = G0.f406611a;
            }
            bE2.X(false);
            C20608p2.a(bE2, C20588k2.f(aVar3, 24));
            if (i15 == 0) {
                strJ = com.avito.android.bxcontent.mvi.entity.f.j(bE2, -966135542, R.string.sms_code_button_active, bE2, false);
            } else {
                bE2.C(-966042139);
                String strB2 = u0.i.b(R.string.sms_code_button_timer, new Object[]{Integer.valueOf(i15 / 60), Integer.valueOf(i15 % 60)}, bE2);
                bE2.X(false);
                strJ = strB2;
            }
            com.akita.compose.component.button.t tVarX1 = com.akita.compose.theme.re23.b.c(bE2).X1();
            if (i15 != 0 || z15) {
                i13 = 172;
                z12 = false;
            } else {
                i13 = 172;
                z12 = true;
            }
            com.akita.compose.component.button.m.c(strJ, aVar2, tVarX1, C20588k2.v(i13, 0.0f, 2, aVar3), null, null, null, cVar.f8713n, z12, null, bE2, ((i12 >> 12) & 112) | 3584, 624);
            C20608p2.a(bE2, C20588k2.f(aVar3, 32));
            z13 = true;
            bE2.X(true);
            z14 = false;
            bE2.X(false);
        } else {
            bE2.C(420357239);
            com.avito.android.analytics.screens.compose.a aVar6 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
            if (perfTrackerParams != null) {
                aVar6.m(perfTrackerParams.f90666a);
            }
            aVar6.l();
            androidx.compose.ui.v vVarD2 = androidx.compose.ui.draw.o.d(aVar3, new c(perfTrackerParams, aVar6));
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int i17 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarD2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0D2);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            androidx.compose.ui.v vVarD3 = C20588k2.d(aVar3, 1.0f);
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK2 = R1.k(16, 0.0f, 2, vVarD3);
            C20585k.f28659a.getClass();
            I iA3 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, vVarK2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S4);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            R3.b(pVar4, bE2, vVarC4);
            K k13 = K.f28344a;
            float f13 = 8;
            C20608p2.a(bE2, C20588k2.f(aVar3, f13));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar3 = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(cVar.f8706g, iVar3.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            C20608p2.a(bE2, C20588k2.f(aVar3, 20));
            com.avito.android.mortgage.widgets.i.a(cVar.f8707h, cVar.f8708i, lVar2, null, !z16, str == null ? InputState.f61668b : InputState.f61669c, null, null, bE2, (i12 >> 6) & 896, 200);
            bE2.C(-1416652149);
            if (str != null) {
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(iVar3.f65244o, com.akita.compose.theme.re23.b.f63984b.f63880R0, 0L, 0L, null, 0L, 0L, 1022), R1.m(aVar3, 0.0f, f13, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
                G0 g03 = G0.f406611a;
            }
            z14 = false;
            bE2.X(false);
            C20608p2.a(bE2, C20588k2.f(aVar3, 24));
            if (i15 == 0) {
                strB = com.avito.android.bxcontent.mvi.entity.f.j(bE2, -966135542, R.string.sms_code_button_active, bE2, false);
            } else {
                bE2.C(-966042139);
                strB = u0.i.b(R.string.sms_code_button_timer, new Object[]{Integer.valueOf(i15 / 60), Integer.valueOf(i15 % 60)}, bE2);
                bE2.X(false);
            }
            com.akita.compose.component.button.m.c(strB, aVar2, com.akita.compose.theme.re23.b.c(bE2).X1(), C20588k2.v(172, 0.0f, 2, aVar3), null, null, null, cVar.f8713n, i15 == 0 && !z15, null, bE2, ((i12 >> 12) & 112) | 3584, 624);
            C20608p2.a(bE2, C20588k2.f(aVar3, 32));
            bE2.X(true);
            bE2.X(true);
            bE2.X(false);
            z13 = true;
        }
        bE2.X(z14);
        bE2.X(z14);
        bE2.X(z13);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(cVar, interfaceC43160i, aVar, lVar, lVar2, aVar2, i12);
        }
    }
}
