package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.job.JobSnippetContactButtonType;

/* compiled from: CarouselVacancyViewedXlItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_vacancy_viewed/j;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements TV0.b<com.avito.android.serp.adapter.rich_snippets.job.m, AdvertXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f269204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.serp.adapter.rich_snippets.job.n> f269205b = new g.a<>(R.layout.carousel_vacancy_viewed, a.f269206l);

    /* compiled from: CarouselVacancyViewedXlItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.serp.adapter.rich_snippets.job.n> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f269206l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.serp.adapter.rich_snippets.job.n invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.serp.adapter.rich_snippets.job.n(view, R.attr.textS10, false, JobSnippetContactButtonType.f430454f);
        }
    }

    @Inject
    public j(@Y61.k q qVar) {
        this.f269204a = qVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f269204a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.serp.adapter.rich_snippets.job.n> b() {
        return this.f269205b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof AdvertXlItem) && ((AdvertXlItem) aVar).f268789i.isCarouselVacancy();
    }
}
