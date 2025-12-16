package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.paranja.f;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.util.y6;
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
@DebugMetadata(c = "com.avito.android.shortcut_navigation_bar.ShortcutNavigationBarImpl$showNavBarLeftIconOnboarding$1$1", f = "ShortcutNavigationBar.kt", i = {}, l = {1546}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class J extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f283130q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34999p f283131r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f283132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f283133t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283134u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283135v;

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f283136l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f283137m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283138n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283139o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C34999p f283140p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2, C34999p c34999p) {
            super(0);
            this.f283136l = view;
            this.f283137m = navigationIconOnboarding;
            this.f283138n = aVar;
            this.f283139o = aVar2;
            this.f283140p = c34999p;
        }

        @Override // Y41.a
        public final G0 invoke() {
            m0 m0Var = m0.f283432a;
            Y41.a<G0> aVar = this.f283139o;
            C34999p c34999p = this.f283140p;
            NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding = this.f283137m;
            I i12 = new I(aVar, c34999p, navigationIconOnboarding);
            m0Var.getClass();
            m0.b bVar = new m0.b(navigationIconOnboarding.getTitle(), navigationIconOnboarding.getText(), navigationIconOnboarding.getButtonTitle());
            int iB2 = y6.b(8);
            f.a aVar2 = new f.a(iB2, iB2, iB2, iB2);
            m0.a(m0Var, this.f283136l, bVar, i12, u0.f283577l, this.f283138n, y6.b(14), null, aVar2, 384);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C34999p c34999p, View view, NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, Y41.a aVar, Y41.a aVar2, Continuation continuation) {
        super(2, continuation);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283131r = c34999p;
        this.f283132s = view;
        this.f283133t = navigationIconOnboarding;
        this.f283134u = aVar;
        this.f283135v = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Y41.a<G0> aVar = this.f283134u;
        Y41.a<G0> aVar2 = this.f283135v;
        OnboardingType onboardingType = OnboardingType.f209409b;
        return new J(this.f283131r, this.f283132s, this.f283133t, aVar, aVar2, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((J) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f283130q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f283130q = 1;
            if (C43131e0.b(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Y41.a<G0> aVar = this.f283134u;
        Y41.a<G0> aVar2 = this.f283135v;
        View view = this.f283132s;
        NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding = this.f283133t;
        C34999p c34999p = this.f283131r;
        c34999p.j("nav_bar_left_icon_onboarding", OnboardingType.f209409b, new a(view, navigationIconOnboarding, aVar, aVar2, c34999p));
        return G0.f406611a;
    }
}
