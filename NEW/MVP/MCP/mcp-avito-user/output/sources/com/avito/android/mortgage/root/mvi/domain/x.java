package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.MortgageVerificationFlow;
import com.avito.android.mortgage.deeplink.util.MortgageVerificationFlowLink;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import com.avito.android.screen_flow.link.ScreenFlowLink;
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

/* compiled from: InitialLoadingSideEffectUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/x;", "Lcom/avito/android/mortgage/root/mvi/domain/w;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x implements w {

    /* compiled from: InitialLoadingSideEffectUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.InitialLoadingSideEffectUseCaseImpl$handleSideEffects$1", f = "InitialLoadingSideEffectUseCase.kt", i = {}, l = {31, 36, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203147q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203148r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f203149s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MortgageVerificationFlow f203150t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f203151u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink, MortgageVerificationFlow mortgageVerificationFlow, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203149s = deepLink;
            this.f203150t = mortgageVerificationFlow;
            this.f203151u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f203149s, this.f203150t, this.f203151u, continuation);
            aVar.f203148r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203147q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203148r;
            String str = this.f203151u;
            DeepLink deepLink = this.f203149s;
            MortgageVerificationFlow mortgageVerificationFlow = this.f203150t;
            if (deepLink != null && mortgageVerificationFlow != null) {
                MortgageRootInternalAction.HandleDeeplink handleDeeplink = new MortgageRootInternalAction.HandleDeeplink(new ScreenFlowLink(deepLink, new MortgageVerificationFlowLink(new VerificationFlowArguments(str, mortgageVerificationFlow))));
                this.f203147q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
            if (deepLink != null) {
                MortgageRootInternalAction.HandleDeeplink handleDeeplink2 = new MortgageRootInternalAction.HandleDeeplink(deepLink);
                this.f203147q = 2;
                if (interfaceC43172j.emit(handleDeeplink2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
            if (mortgageVerificationFlow != null) {
                MortgageRootInternalAction.HandleDeeplink handleDeeplink3 = new MortgageRootInternalAction.HandleDeeplink(new MortgageVerificationFlowLink(new VerificationFlowArguments(str, mortgageVerificationFlow)));
                this.f203147q = 3;
                if (interfaceC43172j.emit(handleDeeplink3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public x() {
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.w
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, @Y61.l MortgageVerificationFlow mortgageVerificationFlow, @Y61.l DeepLink deepLink) {
        return C43175k.G(new a(deepLink, mortgageVerificationFlow, str, null));
    }
}
