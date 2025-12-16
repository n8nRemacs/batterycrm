package com.avito.android.tariff_cpt.configure.landing.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TariffCptConfigureLandingUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/domain/b;", "Lcom/avito/android/tariff_cpt/configure/landing/domain/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff_cpt.configure.landing.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f297757a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f297758b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final JC0.a f297759c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f297760d;

    /* compiled from: TariffCptConfigureLandingUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_cpt.configure.landing.domain.TariffCptConfigureLandingUseCaseImpl$invoke$1", f = "TariffCptConfigureLandingUseCase.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 30, 36, 37, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TariffCptConfigureLandingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f297761q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f297762r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f297762r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TariffCptConfigureLandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f297761q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                kotlin.C42729a0.b(r8)
                goto Lbd
            L25:
                java.lang.Object r1 = r7.f297762r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L60
            L2d:
                java.lang.Object r1 = r7.f297762r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4d
            L35:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f297762r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Loading r1 = new com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Loading
                r1.<init>()
                r7.f297762r = r8
                r7.f297761q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r8
            L4d:
                com.avito.android.tariff_cpt.configure.landing.domain.b r8 = com.avito.android.tariff_cpt.configure.landing.domain.b.this
                JC0.a r6 = r8.f297759c
                r7.f297762r = r1
                r7.f297761q = r5
                java.lang.String r5 = r8.f297757a
                java.lang.String r8 = r8.f297758b
                java.lang.Object r8 = r6.b(r5, r8, r7)
                if (r8 != r0) goto L60
                return r0
            L60:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L9b
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                KC0.d r8 = (KC0.d) r8
                boolean r2 = r8 instanceof KC0.d.b
                if (r2 == 0) goto L85
                com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Content r2 = new com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Content
                KC0.d$b r8 = (KC0.d.b) r8
                r2.<init>(r8)
                r7.f297762r = r6
                r7.f297761q = r4
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lbd
                return r0
            L85:
                boolean r2 = r8 instanceof KC0.d.a
                if (r2 == 0) goto Lbd
                com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Redirect r2 = new com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Redirect
                KC0.d$a r8 = (KC0.d.a) r8
                r2.<init>(r8)
                r7.f297762r = r6
                r7.f297761q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lbd
                return r0
            L9b:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc0
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r3 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
                com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Error r3 = new com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction$Error
                r3.<init>(r8)
                r7.f297762r = r6
                r7.f297761q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto Lbd
                return r0
            Lbd:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lc0:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_cpt.configure.landing.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@com.avito.android.tariff_cpt.common.di.a @l String str, @l @com.avito.android.tariff_cpt.common.di.c String str2, @k JC0.a aVar, @k R0 r02) {
        this.f297757a = str;
        this.f297758b = str2;
        this.f297759c = aVar;
        this.f297760d = r02;
    }

    @Override // com.avito.android.tariff_cpt.configure.landing.domain.a
    @k
    public final InterfaceC43160i<TariffCptConfigureLandingInternalAction> invoke() {
        return C43175k.I(this.f297760d.a(), C43175k.G(new a(null)));
    }
}
