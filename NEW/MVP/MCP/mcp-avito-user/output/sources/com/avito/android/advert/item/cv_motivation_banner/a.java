package com.avito.android.advert.item.cv_motivation_banner;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CvMotivationBannerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/cv_motivation_banner/a;", "LTV0/b;", "Lcom/avito/android/advert/item/cv_motivation_banner/h;", "Lcom/avito/android/advert/item/cv_motivation_banner/CvMotivationBannerItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<h, CvMotivationBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f75011a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f75013c = new g.a<>(R.layout.advert_cv_motivation_banner_layout, new C2227a());

    /* compiled from: CvMotivationBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/cv_motivation_banner/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/cv_motivation_banner/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.cv_motivation_banner.a$a, reason: collision with other inner class name */
    public static final class C2227a extends N implements p<ViewGroup, View, i> {
        public C2227a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f75012b);
        }
    }

    @Inject
    public a(@k e eVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f75011a = eVar;
        this.f75012b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f75011a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f75013c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CvMotivationBannerItem;
    }
}
