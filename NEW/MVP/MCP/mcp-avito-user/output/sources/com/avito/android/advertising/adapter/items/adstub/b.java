package com.avito.android.advertising.adapter.items.adstub;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmptyAdStubItemNewBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/b;", "LTV0/b;", "LTV0/e;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<TV0.e, CommercialBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f86930a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f86931b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<Eb.b> f86932c = new g.a<>(R.layout.empty_ad_stub, a.f86934l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<Eb.b> f86933d = new g.a<>(R.layout.empty_ad_stub_re23, new C2589b());

    /* compiled from: EmptyAdStubItemNewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LEb/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, Eb.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86934l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Eb.b invoke(ViewGroup viewGroup, View view) {
            return new Eb.b(view);
        }
    }

    /* compiled from: EmptyAdStubItemNewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "LEb/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.adstub.b$b, reason: collision with other inner class name */
    public static final class C2589b extends N implements Y41.p<ViewGroup, View, Eb.b> {
        public C2589b() {
            super(2);
        }

        @Override // Y41.p
        public final Eb.b invoke(ViewGroup viewGroup, View view) {
            ViewGroup viewGroup2 = viewGroup;
            View view2 = view;
            if (b.this.f86931b.b()) {
                viewGroup2.getLayoutParams().height = -1;
                view2.getLayoutParams().height = -1;
            }
            Eb.b bVar = new Eb.b(view2);
            com.avito.android.lib.util.v.b(view2, R.dimen.ad_borderless_grid_image_radius);
            return bVar;
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f86930a = dVar;
        this.f86931b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86930a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f86931b.a() ? this.f86933d : this.f86932c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof CommercialBannerItem) {
            CommercialBannerItem commercialBannerItem = (CommercialBannerItem) aVar;
            if (commercialBannerItem.isEmpty() && !commercialBannerItem.getDisplayType().isInformative() && !commercialBannerItem.isMediaX2()) {
                return true;
            }
        }
        return false;
    }
}
