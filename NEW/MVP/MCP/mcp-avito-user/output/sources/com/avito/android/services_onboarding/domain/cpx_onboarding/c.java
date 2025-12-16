package com.avito.android.services_onboarding.domain.cpx_onboarding;

import Y41.p;
import Y61.k;
import Y61.l;
import Yu0.InterfaceC18329b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
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

/* compiled from: MoveToNextCpxStepUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_onboarding/domain/cpx_onboarding/c;", "LYu0/b;", "<init>", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC18329b {

    /* compiled from: MoveToNextCpxStepUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_onboarding.domain.cpx_onboarding.MoveToNextCpxStepUseCaseImpl$moveToNextStep$1", f = "MoveToNextCpxStepUseCaseImpl.kt", i = {}, l = {18, 20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ServicesOnboardingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279919q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279920r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f279921s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f279921s = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f279921s, continuation);
            aVar.f279920r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ServicesOnboardingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f279919q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f279920r;
                DeepLink deepLink = this.f279921s;
                if (deepLink != null) {
                    ServicesOnboardingInternalAction.OpenDeeplink openDeeplink = new ServicesOnboardingInternalAction.OpenDeeplink(deepLink);
                    this.f279919q = 1;
                    if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ServicesOnboardingInternalAction.SwipeToNextPage swipeToNextPage = ServicesOnboardingInternalAction.SwipeToNextPage.f279948b;
                    this.f279919q = 2;
                    if (interfaceC43172j.emit(swipeToNextPage, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c() {
    }

    @Override // Yu0.InterfaceC18329b
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> a(@l DeepLink deepLink, int i12, int i13) {
        return C43175k.G(new a(deepLink, null));
    }
}
