package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.TooltipInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: GlobalHorizontalChipsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f283285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f283286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TooltipInfo f283287n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t tVar, TooltipInfo tooltipInfo) {
        super(0);
        this.f283285l = dVar;
        this.f283286m = tVar;
        this.f283287n = tooltipInfo;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.onboarding_manager.e eVar;
        d dVar = this.f283285l;
        TooltipInfo tooltipInfo = this.f283287n;
        Boolean isShowed = tooltipInfo.getIsShowed();
        Boolean bool = Boolean.TRUE;
        if (!L.f(isShowed, bool) && (eVar = dVar.f283290d) != null && eVar.b("inline_filters_tooltip", OnboardingType.f209409b)) {
            this.f283286m.Cc(tooltipInfo.getText());
            tooltipInfo.setShowed(bool);
            eVar.a("inline_filters_tooltip", false);
            String onceShowId = tooltipInfo.getOnceShowId();
            if (onceShowId != null) {
                dVar.f283291e.e(onceShowId);
                com.avito.android.onboarding_manager.a aVar = dVar.f283289c;
                if (aVar != null) {
                    aVar.f209413a.e(onceShowId);
                }
            }
        }
        return G0.f406611a;
    }
}
