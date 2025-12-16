package com.avito.android.advert_core.advert_badge_bar;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertBadgeBarBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert_badge_bar/a;", "LTV0/b;", "Lcom/avito/android/advert_core/advert_badge_bar/c;", "Lcom/avito/android/advert_core/advert_badge_bar/AdvertBadgeBarItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<c, AdvertBadgeBarItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f82717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<d> f82718b = new g.a<>(R.layout.advert_details_badge_bar_item, C2452a.f82719l);

    /* compiled from: AdvertBadgeBarBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/advert_badge_bar/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/advert_badge_bar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.advert_badge_bar.a$a, reason: collision with other inner class name */
    public static final class C2452a extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2452a f82719l = new C2452a();

        public C2452a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    @Inject
    public a(@Y61.k e eVar) {
        this.f82717a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f82717a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<d> b() {
        return this.f82718b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertBadgeBarItem;
    }
}
