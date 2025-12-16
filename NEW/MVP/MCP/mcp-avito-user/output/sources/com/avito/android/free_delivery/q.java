package com.avito.android.free_delivery;

import UE.a;
import UE.b;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import com.akita.compose.component.bottom_sheet.I;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreeDeliveryBottomSheetRedesign.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_free-delivery_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q {

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<UE.a, G0> f158824l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super UE.a, G0> lVar) {
            super(0);
            this.f158824l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f158824l.invoke(a.b.f16304a);
            return G0.f406611a;
        }
    }

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UE.c f158825l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.tooltip.t f158826m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ FreeDeliveryDetails f158827n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<UE.a, G0> f158828o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(UE.c cVar, com.akita.compose.component.tooltip.t tVar, FreeDeliveryDetails freeDeliveryDetails, Y41.l<? super UE.a, G0> lVar) {
            super(3);
            this.f158825l = cVar;
            this.f158826m = tVar;
            this.f158827n = freeDeliveryDetails;
            this.f158828o = lVar;
        }

        @Override // Y41.q
        public final G0 invoke(J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.free_delivery.ui.re23.j.a(this.f158825l, this.f158826m, this.f158827n, this.f158828o, a13, 520);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UE.c f158829l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<UE.a, G0> f158830m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f158831n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<UE.b> f158832o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ FreeDeliveryDetails f158833p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(UE.c cVar, Y41.l<? super UE.a, G0> lVar, Y41.a<G0> aVar, InterfaceC43160i<? extends UE.b> interfaceC43160i, FreeDeliveryDetails freeDeliveryDetails, int i12) {
            super(2);
            this.f158829l = cVar;
            this.f158830m = lVar;
            this.f158831n = aVar;
            this.f158832o = interfaceC43160i;
            this.f158833p = freeDeliveryDetails;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(36873);
            Y41.a<G0> aVar = this.f158831n;
            q.a(this.f158829l, this.f158830m, aVar, this.f158832o, this.f158833p, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.free_delivery.FreeDeliveryBottomSheetRedesignKt$HandleEvents$1", f = "FreeDeliveryBottomSheetRedesign.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158834q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<UE.b> f158835r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f158836s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f158837t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I f158838u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.tooltip.t f158839v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f158840w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f158841x;

        /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUE/b;", "event", "Lkotlin/G0;", "emit", "(LUE/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f158842b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f158843c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ I f158844d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.tooltip.t f158845e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f158846f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f158847g;

            public a(T t12, Y41.a<G0> aVar, I i12, com.akita.compose.component.tooltip.t tVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12) {
                this.f158842b = t12;
                this.f158843c = aVar;
                this.f158844d = i12;
                this.f158845e = tVar;
                this.f158846f = uVar;
                this.f158847g = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                UE.b bVar = (UE.b) obj;
                boolean z12 = bVar instanceof b.a;
                T t12 = this.f158842b;
                if (z12) {
                    C43259k.d(t12, null, null, new r(this.f158844d, null), 3);
                    ((C30710c) this.f158843c).invoke();
                } else if (bVar instanceof b.c) {
                    C43259k.d(t12, null, null, new s(this.f158845e, null), 3);
                } else if (bVar instanceof b.C1113b) {
                    C43259k.d(t12, null, null, new t(this.f158846f, this.f158847g, bVar, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC43160i<? extends UE.b> interfaceC43160i, T t12, Y41.a<G0> aVar, I i12, com.akita.compose.component.tooltip.t tVar, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f158835r = interfaceC43160i;
            this.f158836s = t12;
            this.f158837t = aVar;
            this.f158838u = i12;
            this.f158839v = tVar;
            this.f158840w = uVar;
            this.f158841x = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f158835r, this.f158836s, this.f158837t, this.f158838u, this.f158839v, this.f158840w, this.f158841x, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f158834q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f158836s, this.f158837t, this.f158838u, this.f158839v, this.f158840w, this.f158841x);
                this.f158834q = 1;
                if (this.f158835r.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<UE.b> f158848l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.tooltip.t f158849m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f158850n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I f158851o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f158852p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f158853q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC43160i<? extends UE.b> interfaceC43160i, com.akita.compose.component.tooltip.t tVar, com.akita.compose.component.toast_bar.u uVar, I i12, Y41.a<G0> aVar, int i13) {
            super(2);
            this.f158848l = interfaceC43160i;
            this.f158849m = tVar;
            this.f158850n = uVar;
            this.f158851o = i12;
            this.f158852p = aVar;
            this.f158853q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f158853q | 1);
            I i12 = this.f158851o;
            Y41.a<G0> aVar = this.f158852p;
            q.b(this.f158848l, this.f158849m, this.f158850n, i12, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k UE.c r20, @Y61.k Y41.l<? super UE.a, kotlin.G0> r21, @Y61.k Y41.a<kotlin.G0> r22, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends UE.b> r23, @Y61.k com.avito.android.free_delivery.FreeDeliveryDetails r24, @Y61.l androidx.compose.runtime.A r25, int r26) {
        /*
            r2 = r21
            r0 = 1545878998(0x5c243dd6, float:1.8491954E17)
            r1 = r25
            androidx.compose.runtime.B r0 = r1.E(r0)
            r1 = 0
            r3 = 1
            r4 = 6
            com.akita.compose.component.bottom_sheet.I r1 = com.akita.compose.component.bottom_sheet.N.a(r3, r1, r0, r4, r4)
            com.akita.compose.component.tooltip.t r10 = com.akita.compose.component.tooltip.v.a(r0)
            com.akita.compose.component.toast_bar.u r16 = com.akita.compose.component.toast_bar.w.a(r0)
            r9 = 8
            r3 = r23
            r4 = r10
            r5 = r16
            r6 = r1
            r7 = r22
            r8 = r0
            b(r3, r4, r5, r6, r7, r8, r9)
            r3 = -1046137893(0xffffffffc1a533db, float:-20.65032)
            r0.C(r3)
            boolean r3 = r0.B(r2)
            r4 = 0
            java.lang.Object r5 = r0.t()
            if (r3 != 0) goto L42
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L4a
        L42:
            com.avito.android.free_delivery.q$a r5 = new com.avito.android.free_delivery.q$a
            r5.<init>(r2)
            r0.H(r5)
        L4a:
            r3 = r5
            Y41.a r3 = (Y41.a) r3
            r0.X(r4)
            com.avito.android.free_delivery.q$b r4 = new com.avito.android.free_delivery.q$b
            r6 = r20
            r5 = r24
            r4.<init>(r6, r10, r5, r2)
            r7 = -1231886602(0xffffffffb692e6f6, float:-4.3780265E-6)
            androidx.compose.runtime.internal.n r15 = androidx.compose.runtime.internal.r.c(r7, r4, r0)
            r14 = 0
            r17 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = 384(0x180, float:5.38E-43)
            r19 = 4082(0xff2, float:5.72E-42)
            r5 = r1
            r6 = r16
            r16 = r0
            com.akita.compose.component.bottom_sheet.H.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.compose.runtime.c2 r7 = r0.Z()
            if (r7 == 0) goto L91
            com.avito.android.free_delivery.q$c r8 = new com.avito.android.free_delivery.q$c
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f38184d = r8
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.free_delivery.q.a(UE.c, Y41.l, Y41.a, kotlinx.coroutines.flow.i, com.avito.android.free_delivery.FreeDeliveryDetails, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    public static final void b(InterfaceC43160i<? extends UE.b> interfaceC43160i, com.akita.compose.component.tooltip.t tVar, com.akita.compose.component.toast_bar.u uVar, I i12, Y41.a<G0> aVar, androidx.compose.runtime.A a12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-1953551780);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        C22187u0.d(new d(interfaceC43160i, (T) objT, aVar, i12, tVar, uVar, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), null), bE2, interfaceC43160i);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(interfaceC43160i, tVar, uVar, i12, aVar, i13);
        }
    }
}
