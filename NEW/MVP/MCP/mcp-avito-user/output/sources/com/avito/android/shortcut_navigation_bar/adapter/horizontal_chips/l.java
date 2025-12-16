package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.TooltipInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalChipsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f283310l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f283311m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TooltipInfo f283312n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t tVar, TooltipInfo tooltipInfo) {
        super(0);
        this.f283310l = mVar;
        this.f283311m = tVar;
        this.f283312n = tooltipInfo;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.onboarding_manager.e eVar;
        m mVar = this.f283310l;
        TooltipInfo tooltipInfo = this.f283312n;
        Boolean isShowed = tooltipInfo.getIsShowed();
        Boolean bool = Boolean.TRUE;
        if (!L.f(isShowed, bool) && (eVar = mVar.f283315d) != null && eVar.b("inline_filters_tooltip", OnboardingType.f209409b)) {
            this.f283311m.Cc(tooltipInfo.getText());
            tooltipInfo.setShowed(bool);
            eVar.a("inline_filters_tooltip", false);
            String onceShowId = tooltipInfo.getOnceShowId();
            if (onceShowId != null) {
                mVar.f283316e.e(onceShowId);
                com.avito.android.onboarding_manager.a aVar = mVar.f283314c;
                if (aVar != null) {
                    aVar.f209413a.e(onceShowId);
                }
            }
        }
        return G0.f406611a;
    }
}
