package com.avito.android.services_onboarding.domain.booking_onboarding;

import Y41.p;
import Y61.k;
import Y61.l;
import Yu0.InterfaceC18329b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: MoveToNextStepUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/domain/booking_onboarding/c;", "LYu0/b;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC18329b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_persistence.f f279878a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServicesOnboardingTarget f279879b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f279880c;

    /* compiled from: MoveToNextStepUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_onboarding.domain.booking_onboarding.MoveToNextStepUseCaseImpl$moveToNextStep$1", f = "MoveToNextStepUseCaseImpl.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30}, m = "invokeSuspend", n = {"storageKey"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServicesOnboardingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279881q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279882r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ DeepLink f279884t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f279885u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f279886v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink, int i12, int i13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f279884t = deepLink;
            this.f279885u = i12;
            this.f279886v = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f279884t, this.f279885u, this.f279886v, continuation);
            aVar.f279882r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServicesOnboardingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279881q;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279882r;
                ServicesOnboardingTarget.Stepped stepped = (ServicesOnboardingTarget.Stepped) cVar.f279879b;
                DeepLink deepLink = this.f279884t;
                if (deepLink != null) {
                    ServicesOnboardingInternalAction.OpenDeeplink openDeeplink = new ServicesOnboardingInternalAction.OpenDeeplink(deepLink);
                    String str2 = stepped.f279806b;
                    this.f279882r = str2;
                    this.f279881q = 1;
                    if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    cVar.f279878a.c(this.f279885u + 1, this.f279886v, str);
                } else {
                    ServicesOnboardingInternalAction.SwipeToNextPage swipeToNextPage = ServicesOnboardingInternalAction.SwipeToNextPage.f279948b;
                    this.f279881q = 2;
                    if (interfaceC43172j.emit(swipeToNextPage, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i12 == 1) {
                str = (String) this.f279882r;
                C42729a0.b(obj);
                cVar.f279878a.c(this.f279885u + 1, this.f279886v, str);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k com.avito.android.service_booking_persistence.f fVar, @k ServicesOnboardingTarget servicesOnboardingTarget, @k R0 r02) {
        this.f279878a = fVar;
        this.f279879b = servicesOnboardingTarget;
        this.f279880c = r02;
    }

    @Override // Yu0.InterfaceC18329b
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> a(@l DeepLink deepLink, int i12, int i13) {
        return C43175k.I(this.f279880c.a(), C43175k.G(new a(deepLink, i12, i13, null)));
    }
}
