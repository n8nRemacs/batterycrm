package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/s;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35001s extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f283548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.f f283549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C34999p f283550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OnboardingType f283552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283555i;

    public C35001s(kotlin.ranges.l lVar, l0.f fVar, C34999p c34999p, Filter.Onboarding onboarding, OnboardingType onboardingType, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
        this.f283548b = lVar;
        this.f283549c = fVar;
        this.f283550d = c34999p;
        this.f283551e = onboarding;
        this.f283552f = onboardingType;
        this.f283553g = aVar;
        this.f283554h = aVar2;
        this.f283555i = aVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        View viewZ;
        if (i12 == 0) {
            kotlin.ranges.l lVar = this.f283548b;
            l0.f fVar = this.f283549c;
            boolean zH2 = lVar.h(fVar.f406840b);
            C34999p c34999p = this.f283550d;
            if (!zH2) {
                c34999p.f283447B.A0(fVar.f406840b);
            }
            int i13 = fVar.f406840b;
            Filter.Onboarding onboarding = this.f283551e;
            OnboardingType onboardingType = this.f283552f;
            Y41.a<G0> aVar = this.f283553g;
            Y41.a<G0> aVar2 = this.f283554h;
            Y41.a<G0> aVar3 = this.f283555i;
            RecyclerView.m layoutManager = c34999p.f283447B.getLayoutManager();
            if (layoutManager != null && (viewZ = layoutManager.Z(i13)) != null) {
                c34999p.j("inline_filters_target_tap_onboarding", onboardingType, new C35004v(viewZ, onboarding, aVar2, aVar, aVar3));
            }
            c34999p.f283447B.v0(this);
        }
    }
}
