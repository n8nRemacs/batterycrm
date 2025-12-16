package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.EntryPoint;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283087l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f283088m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ EntryPoint.Onboarding f283089n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283090o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283091p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Y41.a aVar, Y41.a aVar2, View view, EntryPoint.Onboarding onboarding, C34999p c34999p) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283087l = c34999p;
        this.f283088m = view;
        this.f283089n = onboarding;
        this.f283090o = aVar;
        this.f283091p = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        View view = this.f283088m;
        EntryPoint.Onboarding onboarding = this.f283089n;
        Y41.a<G0> aVar = this.f283090o;
        Y41.a<G0> aVar2 = this.f283091p;
        C34999p c34999p = this.f283087l;
        c34999p.j("entry_point_onboarding", OnboardingType.f209409b, new C(aVar, aVar2, view, onboarding, c34999p));
        return G0.f406611a;
    }
}
