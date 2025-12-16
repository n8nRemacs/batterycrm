package com.avito.android.extended_profile_serp.adapter.job_list_item;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.rich_snippets.job.m;
import com.avito.android.serp.adapter.rich_snippets.job.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobAdvertListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/job_list_item/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<m, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.a f152593a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<n> f152594b = new g.a<>(R.layout.advert_item_rich_job, C4458a.f152595l);

    /* compiled from: JobAdvertListItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/job/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_serp.adapter.job_list_item.a$a, reason: collision with other inner class name */
    public static final class C4458a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4458a f152595l = new C4458a();

        public C4458a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, 0, false, null, 14, null);
        }
    }

    @Inject
    public a(@k com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.a aVar) {
        this.f152593a = aVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f152593a;
    }

    @Override // TV0.b
    @k
    public final g.a<n> b() {
        return this.f152594b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AdvertItem) && ((AdvertItem) aVar).f268378F == SerpDisplayType.List;
    }
}
