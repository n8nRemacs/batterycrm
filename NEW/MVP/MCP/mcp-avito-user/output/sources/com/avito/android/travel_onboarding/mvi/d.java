package com.avito.android.travel_onboarding.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.travel_onboarding.mvi.entity.TravelOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TravelOnboardingBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.b<TravelOnboardingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f302296a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f302297b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_onboarding.domain.interactors.c f302298c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_onboarding.domain.interactors.a f302299d;

    /* compiled from: TravelOnboardingBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_onboarding.mvi.TravelOnboardingBootstrap$produce$1", f = "TravelOnboardingBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<TravelOnboardingInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f302300q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f302300q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(TravelOnboardingInternalAction travelOnboardingInternalAction, Continuation<? super G0> continuation) {
            return ((a) create(travelOnboardingInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TravelOnboardingInternalAction travelOnboardingInternalAction = (TravelOnboardingInternalAction) this.f302300q;
            if (travelOnboardingInternalAction instanceof TravelOnboardingInternalAction.LoadingComplete) {
                com.avito.android.travel_onboarding.domain.interactors.a aVar = d.this.f302299d;
                YE0.a aVar2 = ((TravelOnboardingInternalAction.LoadingComplete) travelOnboardingInternalAction).f302309b.f19391e;
                aVar.f302252a.c(new VE0.b(aVar.f302253b.a(), aVar2.f19386b, aVar2.f19385a));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@TE0.b @Y61.k String str, @TE0.a @Y61.k DeepLink deepLink, @Y61.k com.avito.android.travel_onboarding.domain.interactors.c cVar, @Y61.k com.avito.android.travel_onboarding.domain.interactors.a aVar) {
        this.f302296a = str;
        this.f302297b = deepLink;
        this.f302298c = cVar;
        this.f302299d = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TravelOnboardingInternalAction> a() {
        String str = this.f302296a;
        DeepLink deepLink = this.f302297b;
        return new C43197r1(new a(null), C43175k.N(new C43210w(new TravelOnboardingInternalAction.Init(str, deepLink)), this.f302298c.a(deepLink, str)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
