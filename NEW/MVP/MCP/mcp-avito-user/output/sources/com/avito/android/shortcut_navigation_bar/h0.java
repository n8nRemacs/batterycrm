package com.avito.android.shortcut_navigation_bar;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.TopWidget;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283408l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TopWidget.Onboarding f283409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283411o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(C34999p c34999p, TopWidget.Onboarding onboarding, Y41.a aVar, Y41.a aVar2) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283408l = c34999p;
        this.f283409m = onboarding;
        this.f283410n = aVar;
        this.f283411o = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TopWidget.Onboarding onboarding = this.f283409m;
        Y41.a<G0> aVar = this.f283410n;
        Y41.a<G0> aVar2 = this.f283411o;
        C34999p c34999p = this.f283408l;
        c34999p.j("top_widget_onboarding", OnboardingType.f209409b, new g0(c34999p, onboarding, aVar, aVar2));
        return G0.f406611a;
    }
}
