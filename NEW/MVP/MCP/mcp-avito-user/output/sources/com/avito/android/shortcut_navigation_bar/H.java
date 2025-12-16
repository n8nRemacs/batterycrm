package com.avito.android.shortcut_navigation_bar;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283102m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f283103n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283104o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C34999p c34999p, Filter.Onboarding onboarding, String str, Y41.a aVar) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283101l = c34999p;
        this.f283102m = onboarding;
        this.f283103n = str;
        this.f283104o = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Filter.Onboarding onboarding = this.f283102m;
        String str = this.f283103n;
        Y41.a<G0> aVar = this.f283104o;
        C34999p c34999p = this.f283101l;
        c34999p.j("inline_filters_geo_onboarding_id", OnboardingType.f209409b, new G(c34999p, onboarding, str, aVar));
        return G0.f406611a;
    }
}
