package com.avito.android.services_onboarding.domain.booking_onboarding;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProcessStepChangeUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/domain/booking_onboarding/e;", "LYu0/c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements Yu0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_persistence.f f279890a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServicesOnboardingTarget f279891b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f279892c;

    /* compiled from: ProcessStepChangeUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$VisiblePositionChanged;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_onboarding.domain.booking_onboarding.ProcessStepChangeUseCaseImpl$processStepChange$1", f = "ProcessStepChangeUseCaseImpl.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServicesOnboardingInternalAction.VisiblePositionChanged>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279893q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279894r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f279896t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f279897u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f279896t = i12;
            this.f279897u = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f279896t, this.f279897u, continuation);
            aVar.f279894r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServicesOnboardingInternalAction.VisiblePositionChanged> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279893q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279894r;
                e eVar = e.this;
                String str = ((ServicesOnboardingTarget.Stepped) eVar.f279891b).f279806b;
                com.avito.android.service_booking_persistence.f fVar = eVar.f279890a;
                int i13 = this.f279896t;
                fVar.c(i13, this.f279897u, str);
                ServicesOnboardingInternalAction.VisiblePositionChanged visiblePositionChanged = new ServicesOnboardingInternalAction.VisiblePositionChanged(i13);
                this.f279893q = 1;
                if (interfaceC43172j.emit(visiblePositionChanged, this) == coroutine_suspended) {
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

    @Inject
    public e(@k com.avito.android.service_booking_persistence.f fVar, @k ServicesOnboardingTarget servicesOnboardingTarget, @k R0 r02) {
        this.f279890a = fVar;
        this.f279891b = servicesOnboardingTarget;
        this.f279892c = r02;
    }

    @Override // Yu0.c
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> b(int i12, int i13) {
        return C43175k.I(this.f279892c.a(), C43175k.G(new a(i12, i13, null)));
    }
}
