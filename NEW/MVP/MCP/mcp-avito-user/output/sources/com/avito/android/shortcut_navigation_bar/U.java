package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.util.A6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class U extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding f283182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C34999p c34999p, NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283181l = c34999p;
        this.f283182m = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C34999p c34999p = this.f283181l;
        View view = c34999p.f283497n;
        if (view != null) {
            m0 m0Var = m0.f283432a;
            OnboardingType onboardingType = OnboardingType.f209409b;
            T t12 = new T(view, this.f283182m, c34999p);
            m0Var.getClass();
            if (view.hasWindowFocus()) {
                t12.invoke();
            } else {
                A6.a(view.getViewTreeObserver(), new o0(t12, view));
            }
        }
        return G0.f406611a;
    }
}
