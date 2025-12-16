package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import iQ0.InterfaceC41333a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliesToVacancyPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/h;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41333a> f330974b;

    @Inject
    public h(@Y61.k h31.e<InterfaceC41333a> eVar) {
        this.f330974b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ApplyToVacancyItem applyToVacancyItem = (ApplyToVacancyItem) aVar;
        jVar.cm(applyToVacancyItem.f330957f, new d(this, applyToVacancyItem), applyToVacancyItem.f330958g, new e(this, applyToVacancyItem));
        jVar.aF(applyToVacancyItem.f330954c);
        jVar.jF(applyToVacancyItem.f330955d, new f(this));
        jVar.NI(applyToVacancyItem.f330956e, new g(this));
    }
}
