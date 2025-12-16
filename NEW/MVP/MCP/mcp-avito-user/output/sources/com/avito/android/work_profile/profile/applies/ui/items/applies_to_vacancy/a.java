package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliesToVacancyBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/a;", "LTV0/b;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/j;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/ApplyToVacancyItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<j, ApplyToVacancyItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f330965a;

    /* compiled from: AppliesToVacancyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.a$a, reason: collision with other inner class name */
    public static final class C10283a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10283a f330966l = new C10283a();

        public C10283a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f330965a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f330965a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.applies_to_vacancy_item, C10283a.f330966l);
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ApplyToVacancyItem;
    }
}
