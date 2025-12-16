package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.Tab;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class X extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f283193m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Tab.Onboarding f283194n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283195o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283196p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283197q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C34999p c34999p, int i12, Tab.Onboarding onboarding, Y41.a aVar, Y41.a aVar2, Y41.a aVar3) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283192l = c34999p;
        this.f283193m = i12;
        this.f283194n = onboarding;
        this.f283195o = aVar;
        this.f283196p = aVar2;
        this.f283197q = aVar3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C34999p c34999p = this.f283192l;
        d.c cVarJ = c34999p.f283452G.j(this.f283193m);
        if (cVarJ != null) {
            View childAt = c34999p.f283452G.getChildAt(0);
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            View childAt2 = viewGroup != null ? viewGroup.getChildAt(cVarJ.f180792b) : null;
            if (childAt2 != null) {
                Tab.Onboarding onboarding = this.f283194n;
                Y41.a<G0> aVar = this.f283195o;
                Y41.a<G0> aVar2 = this.f283196p;
                Y41.a<G0> aVar3 = this.f283197q;
                C34999p c34999p2 = this.f283192l;
                c34999p2.j("tab_onboarding", OnboardingType.f209409b, new W(childAt2, onboarding, aVar, aVar2, aVar3, c34999p2));
            }
        }
        return G0.f406611a;
    }
}
