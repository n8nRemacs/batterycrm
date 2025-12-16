package com.avito.android.shortcut_navigation_bar;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.shortcut_navigation_bar.ShortcutNavigationBarImpl$showReplaceMainScreenOnboarding$1$1", f = "ShortcutNavigationBar.kt", i = {}, l = {1574}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class M extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f283147q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentBusiness360.ReplaceMain.Onboarding f283148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34999p f283149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283150t;

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C34999p f283151l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BxContentBusiness360.ReplaceMain.Onboarding f283152m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283153n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34999p c34999p, BxContentBusiness360.ReplaceMain.Onboarding onboarding, Y41.a<G0> aVar) {
            super(0);
            this.f283151l = c34999p;
            this.f283152m = onboarding;
            this.f283153n = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f283151l.k("replace_main_onboarding_id", this.f283152m.getShowId());
            this.f283153n.invoke();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(BxContentBusiness360.ReplaceMain.Onboarding onboarding, C34999p c34999p, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283148r = onboarding;
        this.f283149s = c34999p;
        this.f283150t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        return new M(this.f283148r, this.f283149s, this.f283150t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((M) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f283147q;
        BxContentBusiness360.ReplaceMain.Onboarding onboarding = this.f283148r;
        if (i12 == 0) {
            C42729a0.b(obj);
            long showDelayMs = onboarding.getShowDelayMs();
            this.f283147q = 1;
            if (C43131e0.b(showDelayMs, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Y41.a<G0> aVar = this.f283150t;
        C34999p c34999p = this.f283149s;
        c34999p.j("replace_main_onboarding_id", OnboardingType.f209409b, new a(c34999p, onboarding, aVar));
        return G0.f406611a;
    }
}
