package com.avito.android.onboarding.steps;

import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingStepsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/steps/m;", "Lcom/avito/android/onboarding/steps/l;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34389t0 f209310a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f209311b;

    /* compiled from: OnboardingStepsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.steps.OnboardingStepsInteractorImpl$getSteps$1", f = "OnboardingStepsInteractor.kt", i = {0, 1}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209312q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209313r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f209315t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f209315t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(this.f209315t, continuation);
            aVar.f209313r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
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
                int r1 = r7.f209312q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.C42729a0.b(r8)
                goto L94
            L23:
                java.lang.Object r1 = r7.f209313r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5c
            L2b:
                java.lang.Object r1 = r7.f209313r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4b
            L33:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f209313r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowLoading r1 = new com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowLoading
                r1.<init>(r6, r5, r6)
                r7.f209313r = r8
                r7.f209312q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r8
            L4b:
                com.avito.android.onboarding.steps.m r8 = com.avito.android.onboarding.steps.m.this
                com.avito.android.remote.t0 r8 = r8.f209310a
                r7.f209313r = r1
                r7.f209312q = r4
                java.lang.String r4 = r7.f209315t
                java.lang.Object r8 = r8.d(r4, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto L7a
                com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowLoadedPage r2 = new com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowLoadedPage
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.remote.model.OnboardingStepsResult r8 = (com.avito.android.remote.model.OnboardingStepsResult) r8
                r2.<init>(r8)
                r7.f209313r = r6
                r7.f209312q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L94
                return r0
            L7a:
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L94
                com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowError r3 = new com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$ShowError
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r8 = r8.getError()
                r3.<init>(r8)
                r7.f209313r = r6
                r7.f209312q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto L94
                return r0
            L94:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.steps.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public m(@Y61.k InterfaceC34389t0 interfaceC34389t0, @Y61.k R0 r02) {
        this.f209310a = interfaceC34389t0;
        this.f209311b = r02;
    }

    @Override // com.avito.android.onboarding.steps.l
    @Y61.k
    public final InterfaceC43160i<OnboardingStepsInternalAction> a(@Y61.k String str) {
        return C43175k.I(this.f209311b.a(), C43175k.G(new a(str, null)));
    }
}
