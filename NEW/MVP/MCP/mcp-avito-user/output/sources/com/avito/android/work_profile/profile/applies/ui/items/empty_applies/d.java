package com.avito.android.work_profile.profile.applies.ui.items.empty_applies;

import android.view.View;
import android.view.ViewGroup;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliesToVacancyEmptyPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/empty_applies/d;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/applies/ui/items/empty_applies/f;", "Lcom/avito/android/work_profile/profile/applies/ui/items/empty_applies/AppliesToVacancyEmptyItem;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<f, AppliesToVacancyEmptyItem> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        boolean z12 = ((AppliesToVacancyEmptyItem) aVar).f330996c;
        View view = fVar.f331001b;
        if (!z12) {
            view.post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(fVar, 6));
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }
}
