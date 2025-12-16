package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f283179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding f283180n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(View view, NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding, C34999p c34999p) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283178l = c34999p;
        this.f283179m = view;
        this.f283180n = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        View view = this.f283179m;
        NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding = this.f283180n;
        C34999p c34999p = this.f283178l;
        c34999p.j("search_with_action_title_onboarding", OnboardingType.f209409b, new S(view, onboarding, c34999p));
        return G0.f406611a;
    }
}
