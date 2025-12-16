package com.avito.android.serp.adapter.alert_banner;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AlertBannerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/alert_banner/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/alert_banner/m;", "Lcom/avito/android/serp/adapter/alert_banner/AlertBannerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<m, AlertBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f268905a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f268906b = new g.a<>(R.layout.serp_alert_banner_item, C8034a.f268907l);

    /* compiled from: AlertBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/alert_banner/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/alert_banner/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.alert_banner.a$a, reason: collision with other inner class name */
    public static final class C8034a extends N implements p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8034a f268907l = new C8034a();

        public C8034a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view);
        }
    }

    @Inject
    public a(@Y61.k e eVar) {
        this.f268905a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f268905a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f268906b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AlertBannerItem;
    }
}
