package com.avito.android.virtual_deal_room_client_creation.create;

import RN0.b;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.layout.W2;
import androidx.compose.foundation.lazy.C20650b;
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
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.remote.model.UniversalImage;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_virtual-deal-room-client-creation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {

    /* compiled from: CreateScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.create.CreateScreenKt$CreateScreen$1", f = "CreateScreen.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326821q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326822r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<RN0.b> f326823s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PN0.a, G0> f326824t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f326825u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f326826v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ J f326827w;

        /* compiled from: CreateScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRN0/b;", "event", "Lkotlin/G0;", "emit", "(LRN0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.j$a$a, reason: collision with other inner class name */
        public static final class C10113a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y41.l<PN0.a, G0> f326828b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T f326829c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Context f326830d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f326831e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ J f326832f;

            /* JADX WARN: Multi-variable type inference failed */
            public C10113a(Y41.l<? super PN0.a, G0> lVar, T t12, Context context, com.akita.compose.component.toast_bar.u uVar, J j12) {
                this.f326828b = lVar;
                this.f326829c = t12;
                this.f326830d = context;
                this.f326831e = uVar;
                this.f326832f = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                RN0.b bVar = (RN0.b) obj;
                if (bVar instanceof b.a) {
                    this.f326828b.invoke(((b.a) bVar).f14423a);
                } else if (bVar instanceof b.C0963b) {
                    C43259k.d(this.f326829c, null, null, new i(bVar, this.f326830d, this.f326831e, this.f326832f, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends RN0.b> interfaceC43160i, Y41.l<? super PN0.a, G0> lVar, Context context, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326823s = interfaceC43160i;
            this.f326824t = lVar;
            this.f326825u = context;
            this.f326826v = uVar;
            this.f326827w = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f326823s, this.f326824t, this.f326825u, this.f326826v, this.f326827w, continuation);
            aVar.f326822r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326821q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C10113a c10113a = new C10113a(this.f326824t, (T) this.f326822r, this.f326825u, this.f326826v, this.f326827w);
                this.f326821q = 1;
                if (this.f326823s.collect(c10113a, this) == coroutine_suspended) {
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

    /* compiled from: CreateScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<RN0.a, G0> f326833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super RN0.a, G0> lVar) {
            super(2);
            this.f326833l = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r28, java.lang.Integer r29) {
            /*
                Method dump skipped, instructions count: 419
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.create.j.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CreateScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RN0.c f326834l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<RN0.a, G0> f326835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(RN0.c cVar, Y41.l<? super RN0.a, G0> lVar) {
            super(2);
            this.f326834l = cVar;
            this.f326835m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.create.j.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CreateScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RN0.c f326836l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f326837m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<RN0.a, G0> f326838n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(RN0.c cVar, Context context, Y41.l<? super RN0.a, G0> lVar) {
            super(3);
            this.f326836l = cVar;
            this.f326837m = context;
            this.f326838n = lVar;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                RN0.c cVar = this.f326836l;
                com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
                a13.C(-976608008);
                a13.C(2063036140);
                boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
                RN0.d dVar = cVar.f14435j;
                Context context = this.f326837m;
                Y41.l<RN0.a, G0> lVar = this.f326838n;
                if (zBooleanValue) {
                    a13.C(421109671);
                    v.a aVar = androidx.compose.ui.v.f42878y1;
                    FillElement fillElement = C20588k2.f28682c;
                    aVar.getClass();
                    float f12 = dVar.f14436a ? 58 : 8;
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    C20650b.a(R1.k(14, 0.0f, 2, R1.m(fillElement, 0.0f, 0.0f, 0.0f, f12, 7)), null, null, false, null, null, null, false, null, new B(cVar, context, lVar), a13, 0, 510);
                    a13.h();
                } else {
                    a13.C(420357239);
                    com.avito.android.analytics.screens.compose.a aVar3 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                    if (perfTrackerParams != null) {
                        aVar3.m(perfTrackerParams.f90666a);
                    }
                    aVar3.l();
                    androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new C(perfTrackerParams, aVar3));
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar4);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    C20644z c20644z = C20644z.f28804a;
                    FillElement fillElement2 = C20588k2.f28682c;
                    float f13 = dVar.f14436a ? 58 : 8;
                    h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                    C20650b.a(R1.k(14, 0.0f, 2, R1.m(fillElement2, 0.0f, 0.0f, 0.0f, f13, 7)), null, null, false, null, null, null, false, null, new B(cVar, context, lVar), a13, 0, 510);
                    a13.z();
                    a13.h();
                }
                a13.h();
                a13.h();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreateScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RN0.c f326839l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<RN0.a, G0> f326840m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PN0.a, G0> f326841n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<RN0.b> f326842o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(RN0.c cVar, Y41.l<? super RN0.a, G0> lVar, Y41.l<? super PN0.a, G0> lVar2, InterfaceC43160i<? extends RN0.b> interfaceC43160i, int i12) {
            super(2);
            this.f326839l = cVar;
            this.f326840m = lVar;
            this.f326841n = lVar2;
            this.f326842o = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(4097);
            j.a(this.f326839l, this.f326840m, this.f326841n, this.f326842o, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k RN0.c cVar, @Y61.k Y41.l<? super RN0.a, G0> lVar, @Y61.k Y41.l<? super PN0.a, G0> lVar2, @Y61.k InterfaceC43160i<? extends RN0.b> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(951956870);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        C22187u0.e(interfaceC43160i, lVar2, new a(interfaceC43160i, lVar2, context, uVarA, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), null), bE2);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        com.akita.compose.component.scaffold.g.a(W2.a(fillElement), androidx.compose.runtime.internal.r.c(1640644418, new b(lVar), bE2), androidx.compose.runtime.internal.r.c(-1604453663, new c(cVar, lVar), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(-2146464999, new d(cVar, context, lVar), bE2), bE2, 12583344, 112);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(cVar, lVar, lVar2, interfaceC43160i, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k QN0.a r27, @Y61.k Y41.l r28, @Y61.k java.lang.String r29, @Y61.l androidx.compose.ui.v r30, @Y61.l com.akita.compose.component.input.transformation.k r31, @Y61.l java.lang.String r32, @Y61.l androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.create.j.b(QN0.a, Y41.l, java.lang.String, androidx.compose.ui.v, com.akita.compose.component.input.transformation.k, java.lang.String, androidx.compose.runtime.A, int, int):void");
    }

    public static final void c(PN0.a aVar, Y41.a aVar2, v.a aVar3, androidx.compose.runtime.A a12, int i12) {
        int i13;
        v.a aVar4;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(2018466163);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar4 = aVar3;
            b12 = bE2;
        } else {
            v.a aVar5 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar5, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar6 = InterfaceC22215f.a.f39088n;
            I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar6, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(0.0f, 10, 1, aVar5);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            float f12 = 46;
            androidx.compose.ui.v vVarO = C20588k2.o(aVar5, f12);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i17 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarO);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            C20644z c20644z = C20644z.f28804a;
            UniversalImage universalImage = aVar.f13058b;
            bE2.C(-1745747755);
            Uri uriA = universalImage == null ? null : com.avito.android.virtual_deal_room_client_creation.common.b.a(universalImage, f12, f12, bE2);
            bE2.X(false);
            coil.compose.v.b(uriA, null, androidx.compose.ui.draw.k.a(aVar5, androidx.compose.foundation.shape.o.f30153a), null, null, null, bE2, 56, 4088);
            bE2.X(true);
            float f13 = 12;
            com.akita.compose.foundation.ui.g.b(f13, null, bE2, 6, 2);
            I iA3 = androidx.compose.foundation.layout.H.a(lVar, aVar6, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, aVar5);
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
            R3.b(pVar2, bE2, o1S4);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            R3.b(pVar4, bE2, vVarC4);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65241l;
            androidx.compose.ui.v vVarD2 = C20588k2.d(aVar5, 1.0f);
            com.akita.compose.theme.re23.a aVar9 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.ui.p.b(aVar.f13059c, rVar, vVarD2, false, aVar9.f63938l.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
            com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
            String str = aVar.f13060d;
            if (str == null) {
                str = "";
            }
            androidx.compose.ui.v vVarD3 = C20588k2.d(aVar5, 1.0f);
            long jC2 = aVar9.f63918e0.c(bE2);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            com.akita.compose.foundation.ui.p.b(str, iVar.f65241l, vVarD3, false, jC2, null, 0, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, 12583296, 872);
            bE2.X(true);
            bE2.X(true);
            com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
            com.akita.compose.component.button.t tVarX1 = com.akita.compose.theme.re23.b.c(bE2).X1();
            androidx.compose.ui.v vVarD4 = C20588k2.d(aVar5, 1.0f);
            C36102a.f326740a.getClass();
            aVar4 = aVar5;
            b12 = bE2;
            com.akita.compose.component.button.m.b(aVar2, tVarX1, vVarD4, false, null, C36102a.f326749j, bE2, ((i14 >> 3) & 14) | 197056, 24);
            com.akita.compose.foundation.ui.g.a(24, null, b12, 6);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C36109h(aVar, aVar2, aVar4, i12);
        }
    }
}
