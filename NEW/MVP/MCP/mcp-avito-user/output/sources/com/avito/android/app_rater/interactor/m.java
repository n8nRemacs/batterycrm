package com.avito.android.app_rater.interactor;

import com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink;
import com.avito.android.deeplink_handler.handler.b;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: InAppReviewInteractorGetApps.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.interactor.InAppReviewInteractorGetApps$start$1", f = "InAppReviewInteractorGetApps.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class m extends SuspendLambda implements Y41.p<I0<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91822q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f91824s;

    /* compiled from: InAppReviewInteractorGetApps.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f91825l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar) {
            super(0);
            this.f91825l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f91825l.f91819b.b(LocalDateTime.now(ZoneOffset.UTC));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f91824s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f91824s, continuation);
        mVar.f91823r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
        return ((m) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91822q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f91823r;
            BeduinV2OnboardingDeepLink beduinV2OnboardingDeepLink = new BeduinV2OnboardingDeepLink("1859", null, "fit", null);
            k kVar = this.f91824s;
            b.a.a(kVar.f91818a, beduinV2OnboardingDeepLink, null, null, 6);
            a aVar = new a(kVar);
            this.f91822q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
