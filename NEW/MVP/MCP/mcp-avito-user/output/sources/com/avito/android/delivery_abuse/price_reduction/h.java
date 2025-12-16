package com.avito.android.delivery_abuse.price_reduction;

import Bv.InterfaceC13188a;
import Bv.b;
import androidx.compose.foundation.layout.A3;
import androidx.compose.foundation.layout.C20581j;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.u;
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

/* compiled from: PriceReductionBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_delivery-abuse_price-reduction_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* compiled from: PriceReductionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_abuse.price_reduction.PriceReductionBottomSheetKt$HandleEvents$1", f = "PriceReductionBottomSheet.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f134846q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bv.b> f134847r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f134848s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f134849t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I f134850u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f134851v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ J f134852w;

        /* compiled from: PriceReductionBottomSheet.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBv/b;", "event", "Lkotlin/G0;", "emit", "(LBv/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.delivery_abuse.price_reduction.h$a$a, reason: collision with other inner class name */
        public static final class C4074a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f134853b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.a<G0> f134854c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ I f134855d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u f134856e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ J f134857f;

            public C4074a(T t12, Y41.a<G0> aVar, I i12, u uVar, J j12) {
                this.f134853b = t12;
                this.f134854c = aVar;
                this.f134855d = i12;
                this.f134856e = uVar;
                this.f134857f = j12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Bv.b bVar = (Bv.b) obj;
                boolean z12 = bVar instanceof b.a;
                T t12 = this.f134853b;
                if (z12) {
                    C43259k.d(t12, null, null, new com.avito.android.delivery_abuse.price_reduction.f(this.f134854c, this.f134855d, null), 3);
                } else if (bVar instanceof b.C0079b) {
                    C43259k.d(t12, null, null, new g(this.f134856e, this.f134857f, bVar, null), 3);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends Bv.b> interfaceC43160i, T t12, Y41.a<G0> aVar, I i12, u uVar, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f134847r = interfaceC43160i;
            this.f134848s = t12;
            this.f134849t = aVar;
            this.f134850u = i12;
            this.f134851v = uVar;
            this.f134852w = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f134847r, this.f134848s, this.f134849t, this.f134850u, this.f134851v, this.f134852w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f134846q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C4074a c4074a = new C4074a(this.f134848s, this.f134849t, this.f134850u, this.f134851v, this.f134852w);
                this.f134846q = 1;
                if (this.f134847r.collect(c4074a, this) == coroutine_suspended) {
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

    /* compiled from: PriceReductionBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bv.b> f134858l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I f134859m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ u f134860n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f134861o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f134862p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<? extends Bv.b> interfaceC43160i, I i12, u uVar, Y41.a<G0> aVar, int i13) {
            super(2);
            this.f134858l = interfaceC43160i;
            this.f134859m = i12;
            this.f134860n = uVar;
            this.f134861o = aVar;
            this.f134862p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f134862p | 1);
            u uVar = this.f134860n;
            Y41.a<G0> aVar = this.f134861o;
            h.a(this.f134858l, this.f134859m, uVar, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: PriceReductionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13188a, G0> f134863l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super InterfaceC13188a, G0> lVar) {
            super(0);
            this.f134863l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f134863l.invoke(InterfaceC13188a.b.f1782a);
            return G0.f406611a;
        }
    }

    /* compiled from: PriceReductionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/layout/x2;", "invoke", "(Landroidx/compose/runtime/A;I)Landroidx/compose/foundation/layout/x2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<A, Integer, InterfaceC20639x2> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f134864l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final InterfaceC20639x2 invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(158681935);
            int i12 = InterfaceC20639x2.f28800a;
            C20581j c20581jA = A3.a(a13);
            a13.h();
            return c20581jA;
        }
    }

    /* compiled from: PriceReductionBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.q<androidx.compose.foundation.layout.J, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bv.c f134865l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13188a, G0> f134866m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Bv.c cVar, Y41.l<? super InterfaceC13188a, G0> lVar) {
            super(3);
            this.f134865l = cVar;
            this.f134866m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x03d7  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r43, androidx.compose.runtime.A r44, java.lang.Integer r45) {
            /*
                Method dump skipped, instructions count: 1062
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_abuse.price_reduction.h.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PriceReductionBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bv.c f134867l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC13188a, G0> f134868m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f134869n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Bv.b> f134870o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Bv.c cVar, Y41.l<? super InterfaceC13188a, G0> lVar, Y41.a<G0> aVar, InterfaceC43160i<? extends Bv.b> interfaceC43160i, int i12) {
            super(2);
            this.f134867l = cVar;
            this.f134868m = lVar;
            this.f134869n = aVar;
            this.f134870o = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(4097);
            Y41.a<G0> aVar = this.f134869n;
            h.b(this.f134867l, this.f134868m, aVar, this.f134870o, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(InterfaceC43160i<? extends Bv.b> interfaceC43160i, I i12, u uVar, Y41.a<G0> aVar, A a12, int i13) {
        B bE2 = a12.E(1313300326);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT);
        }
        C22187u0.d(new a(interfaceC43160i, (T) objT, aVar, i12, uVar, com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2), null), bE2, interfaceC43160i);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(interfaceC43160i, i12, uVar, aVar, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k Bv.c r20, @Y61.k Y41.l<? super Bv.InterfaceC13188a, kotlin.G0> r21, @Y61.k Y41.a<kotlin.G0> r22, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends Bv.b> r23, @Y61.l androidx.compose.runtime.A r24, int r25) {
        /*
            r2 = r21
            r0 = 1999553325(0x772ec32d, float:3.5446027E33)
            r1 = r24
            androidx.compose.runtime.B r0 = r1.E(r0)
            r1 = 0
            r3 = 1
            r4 = 6
            com.akita.compose.component.bottom_sheet.I r1 = com.akita.compose.component.bottom_sheet.N.a(r3, r1, r0, r4, r4)
            com.akita.compose.component.toast_bar.u r16 = com.akita.compose.component.toast_bar.w.a(r0)
            r8 = 8
            r3 = r23
            r4 = r1
            r5 = r16
            r6 = r22
            r7 = r0
            a(r3, r4, r5, r6, r7, r8)
            r3 = -883008159(0xffffffffcb5e5d61, float:-1.4572897E7)
            r0.C(r3)
            boolean r3 = r0.B(r2)
            r4 = 0
            java.lang.Object r5 = r0.t()
            if (r3 != 0) goto L3d
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L45
        L3d:
            com.avito.android.delivery_abuse.price_reduction.h$c r5 = new com.avito.android.delivery_abuse.price_reduction.h$c
            r5.<init>(r2)
            r0.H(r5)
        L45:
            r3 = r5
            Y41.a r3 = (Y41.a) r3
            r0.X(r4)
            com.avito.android.delivery_abuse.price_reduction.h$d r12 = com.avito.android.delivery_abuse.price_reduction.h.d.f134864l
            com.avito.android.delivery_abuse.price_reduction.h$e r4 = new com.avito.android.delivery_abuse.price_reduction.h$e
            r6 = r20
            r4.<init>(r6, r2)
            r5 = -1937521139(0xffffffff8c83c60d, float:-2.0302943E-31)
            androidx.compose.runtime.internal.n r15 = androidx.compose.runtime.internal.r.c(r5, r4, r0)
            r14 = 0
            r17 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r18 = 384(0x180, float:5.38E-43)
            r19 = 3570(0xdf2, float:5.003E-42)
            r5 = r1
            r6 = r16
            r16 = r0
            com.akita.compose.component.bottom_sheet.H.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.compose.runtime.c2 r6 = r0.Z()
            if (r6 == 0) goto L89
            com.avito.android.delivery_abuse.price_reduction.h$f r7 = new com.avito.android.delivery_abuse.price_reduction.h$f
            r0 = r7
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f38184d = r7
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_abuse.price_reduction.h.b(Bv.c, Y41.l, Y41.a, kotlinx.coroutines.flow.i, androidx.compose.runtime.A, int):void");
    }

    public static final void c(int i12, int i13, int i14, A a12) {
        int i15;
        B bE2 = a12.E(-1448288723);
        if ((i14 & 14) == 0) {
            i15 = (bE2.m(i12) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= bE2.m(i13) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            String strC = u0.i.c(bE2, i12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.list_item.s f66431b = com.akita.compose.theme.re23.b.m(bE2).getF66431b();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.list_item.m.d(strC, com.akita.compose.component.list_item.s.a(f66431b, R1.c(0.0f, 8, 1), com.akita.compose.theme.re23.b.f63988f.f65240k, null, 506), null, null, androidx.compose.runtime.internal.r.c(-1407794677, new l(i13), bE2), null, bE2, 24576, 44);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(i12, i13, i14);
        }
    }

    public static final void d(int i12, com.akita.compose.foundation.r rVar, A a12, int i13) {
        int i14;
        B b12;
        B bE2 = a12.E(1738336335);
        if ((i13 & 14) == 0) {
            i14 = i13 | (bE2.m(i12) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.B(rVar) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, i12), rVar, null, false, 0L, null, 0, 0, false, null, bE2, i14 & 112, 1020);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(i12, i13, rVar);
        }
    }
}
