package com.avito.android.publish.items.alert_banner;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AlertBannerItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/alert_banner/a;", "LTV0/b;", "Lcom/avito/android/publish/items/alert_banner/g;", "Lcom/avito/android/publish/items/alert_banner/AlertBannerItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, AlertBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f236749a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<h> f236750b = new g.a<>(R.layout.alert_banner_item, C7131a.f236751l);

    /* compiled from: AlertBannerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/alert_banner/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/alert_banner/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.alert_banner.a$a, reason: collision with other inner class name */
    public static final class C7131a extends N implements Y41.p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7131a f236751l = new C7131a();

        public C7131a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f236749a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236749a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<h> b() {
        return this.f236750b;
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
