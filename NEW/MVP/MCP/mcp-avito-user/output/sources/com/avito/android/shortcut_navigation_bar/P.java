package com.avito.android.shortcut_navigation_bar;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.BxContentBusiness360;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283164l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BxContentBusiness360.ReplaceMain.ToastReplaceMain f283165m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283166n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C34999p c34999p, BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, Y41.a aVar) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283164l = c34999p;
        this.f283165m = toastReplaceMain;
        this.f283166n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C34999p c34999p = this.f283164l;
        C43238h c43238h = c34999p.f283474b0;
        OnboardingType onboardingType = OnboardingType.f209409b;
        C43259k.d(c43238h, null, null, new O(this.f283165m, c34999p, this.f283166n, null), 3);
        return G0.f406611a;
    }
}
