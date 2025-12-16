package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f283142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283143n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283144o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C34999p c34999p, NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, Y41.a aVar, Y41.a aVar2) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283141l = c34999p;
        this.f283142m = navigationIconOnboarding;
        this.f283143n = aVar;
        this.f283144o = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        View viewInvoke;
        C34999p c34999p = this.f283141l;
        Y41.a<View> aVar = c34999p.f283495m;
        if (aVar != null && (viewInvoke = aVar.invoke()) != null) {
            Y41.a<G0> aVar2 = this.f283143n;
            OnboardingType onboardingType = OnboardingType.f209409b;
            C43259k.d(c34999p.f283474b0, null, null, new J(c34999p, viewInvoke, this.f283142m, aVar2, this.f283144o, null), 3);
        }
        return G0.f406611a;
    }
}
