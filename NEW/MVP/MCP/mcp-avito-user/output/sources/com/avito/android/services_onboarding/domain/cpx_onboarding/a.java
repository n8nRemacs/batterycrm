package com.avito.android.services_onboarding.domain.cpx_onboarding;

import Bs0.InterfaceC13182a;
import Y41.p;
import Y61.k;
import Y61.l;
import Yu0.InterfaceC18328a;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: LoadServicesCpxOnboardingUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/domain/cpx_onboarding/a;", "LYu0/a;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC18328a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13182a> f279907a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Yu0.d f279908b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f279909c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ServicesOnboardingTarget f279910d;

    /* compiled from: LoadServicesCpxOnboardingUseCaseImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_onboarding.domain.cpx_onboarding.LoadServicesCpxOnboardingUseCaseImpl$loadOnboarding$1", f = "LoadServicesCpxOnboardingUseCaseImpl.kt", i = {0, 1, 3}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 34, 36, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.services_onboarding.domain.cpx_onboarding.a$a, reason: collision with other inner class name */
    public static final class C8326a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f279911q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f279912r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f279914t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8326a(Integer num, Continuation<? super C8326a> continuation) {
            super(2, continuation);
            this.f279914t = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8326a c8326a = a.this.new C8326a(this.f279914t, continuation);
            c8326a.f279912r = obj;
            return c8326a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8326a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_onboarding.domain.cpx_onboarding.a.C8326a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k h31.e<InterfaceC13182a> eVar, @k Yu0.d dVar, @k R0 r02, @k ServicesOnboardingTarget servicesOnboardingTarget) {
        this.f279907a = eVar;
        this.f279908b = dVar;
        this.f279909c = r02;
        this.f279910d = servicesOnboardingTarget;
    }

    @Override // Yu0.InterfaceC18328a
    @k
    public final InterfaceC43160i<ServicesOnboardingInternalAction> c(@l Integer num) {
        return C43175k.I(this.f279909c.a(), C43175k.G(new C8326a(num, null)));
    }
}
