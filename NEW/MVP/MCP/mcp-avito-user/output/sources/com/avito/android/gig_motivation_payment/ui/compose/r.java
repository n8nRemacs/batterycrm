package com.avito.android.gig_motivation_payment.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vH.InterfaceC49212b;

/* compiled from: MotivationPaymentScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.compose.MotivationPaymentScreenKt$MotivationPaymentScreen$1", f = "MotivationPaymentScreen.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160161q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC49212b> f160162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f160163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f160164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f160165u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f160166v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f160167w;

    /* compiled from: MotivationPaymentScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvH/b;", "event", "Lkotlin/G0;", "emit", "(LvH/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f160168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f160169c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f160170d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J f160171e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f160172f;

        /* compiled from: MotivationPaymentScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.compose.MotivationPaymentScreenKt$MotivationPaymentScreen$1$1", f = "MotivationPaymentScreen.kt", i = {0, 0}, l = {92, 97}, m = "emit", n = {"this", "event"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.gig_motivation_payment.ui.compose.r$a$a, reason: collision with other inner class name */
        public static final class C4680a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f160173q;

            /* renamed from: r, reason: collision with root package name */
            public InterfaceC49212b f160174r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f160175s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a<T> f160176t;

            /* renamed from: u, reason: collision with root package name */
            public int f160177u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4680a(a<? super T> aVar, Continuation<? super C4680a> continuation) {
                super(continuation);
                this.f160176t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f160175s = obj;
                this.f160177u |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f160176t.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a aVar, String str, com.akita.compose.component.toast_bar.u uVar, J j12, InterfaceC22204y1 interfaceC22204y1) {
            this.f160168b = (N) aVar;
            this.f160169c = str;
            this.f160170d = uVar;
            this.f160171e = j12;
            this.f160172f = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v3, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k vH.InterfaceC49212b r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.gig_motivation_payment.ui.compose.r.a.C4680a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.gig_motivation_payment.ui.compose.r$a$a r0 = (com.avito.android.gig_motivation_payment.ui.compose.r.a.C4680a) r0
                int r1 = r0.f160177u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f160177u = r1
                goto L18
            L13:
                com.avito.android.gig_motivation_payment.ui.compose.r$a$a r0 = new com.avito.android.gig_motivation_payment.ui.compose.r$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f160175s
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f160177u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r8)
                goto L98
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                vH.b r7 = r0.f160174r
                java.lang.Object r0 = r0.f160173q
                com.avito.android.gig_motivation_payment.ui.compose.r$a r0 = (com.avito.android.gig_motivation_payment.ui.compose.r.a) r0
                kotlin.C42729a0.b(r8)
                goto L66
            L3e:
                kotlin.C42729a0.b(r8)
                boolean r8 = r7 instanceof vH.InterfaceC49212b.a
                if (r8 == 0) goto L4b
                kotlin.jvm.internal.N r7 = r6.f160168b
                r7.invoke()
                goto L9b
            L4b:
                boolean r8 = r7 instanceof vH.InterfaceC49212b.c
                com.akita.compose.component.toast_bar.J r2 = r6.f160171e
                com.akita.compose.component.toast_bar.u r5 = r6.f160170d
                if (r8 == 0) goto L89
                r8 = r7
                vH.b$c r8 = (vH.InterfaceC49212b.c) r8
                r0.f160173q = r6
                r0.f160174r = r7
                r0.f160177u = r4
                java.lang.String r3 = r6.f160169c
                java.lang.Object r8 = com.avito.android.gig_motivation_payment.ui.compose.F.e(r8, r3, r5, r2, r0)
                if (r8 != r1) goto L65
                return r1
            L65:
                r0 = r6
            L66:
                com.akita.compose.component.toast_bar.I r8 = (com.akita.compose.component.toast_bar.I) r8
                vH.b$c r7 = (vH.InterfaceC49212b.c) r7
                androidx.compose.runtime.y1 r0 = r0.f160172f
                java.lang.Object r0 = r0.getF42167b()
                Y41.l r0 = (Y41.l) r0
                com.akita.compose.component.toast_bar.I$d r1 = com.akita.compose.component.toast_bar.I.d.f63214a
                boolean r8 = kotlin.jvm.internal.L.f(r8, r1)
                if (r8 == 0) goto L9b
                sH.j r7 = r7.f440637a
                com.avito.android.deep_linking.links.DeepLink r7 = r7.f437593b
                if (r7 == 0) goto L9b
                vH.a$h r8 = new vH.a$h
                r8.<init>(r7)
                r0.invoke(r8)
                goto L9b
            L89:
                boolean r8 = r7 instanceof vH.InterfaceC49212b.C12759b
                if (r8 == 0) goto L9b
                vH.b$b r7 = (vH.InterfaceC49212b.C12759b) r7
                r0.f160177u = r3
                java.lang.Object r7 = com.avito.android.gig_motivation_payment.ui.compose.F.d(r7, r5, r2, r0)
                if (r7 != r1) goto L98
                return r1
            L98:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9b:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivation_payment.ui.compose.r.a.emit(vH.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC43160i interfaceC43160i, Y41.a aVar, String str, com.akita.compose.component.toast_bar.u uVar, J j12, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f160162r = interfaceC43160i;
        this.f160163s = (N) aVar;
        this.f160164t = str;
        this.f160165u = uVar;
        this.f160166v = j12;
        this.f160167w = interfaceC22204y1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f160167w;
        return new r(this.f160162r, this.f160163s, this.f160164t, this.f160165u, this.f160166v, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160161q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f160163s, this.f160164t, this.f160165u, this.f160166v, this.f160167w);
            this.f160161q = 1;
            if (this.f160162r.collect(aVar, this) == coroutine_suspended) {
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
