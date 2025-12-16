package com.avito.android.work_profile.profile.gig.ui.list.motivations_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.promo_snippet.PromoSnippetListState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigMotivationsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/b;", "LTV0/b;", "Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/a;", "Lcom/avito/android/promo_snippet/PromoSnippetListState;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a, PromoSnippetListState> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f331227a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a> f331228b = new g.a<>(R.layout.gig_motivation_item, a.f331229l);

    /* compiled from: GigMotivationsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/a;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/work_profile/profile/gig/ui/list/motivations_item/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f331229l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f331227a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f331227a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.work_profile.profile.gig.ui.list.motivations_item.a> b() {
        return this.f331228b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PromoSnippetListState;
    }
}
