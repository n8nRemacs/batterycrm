package com.avito.android.advertising.adapter.items.adstub;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmptyAdStubItemRichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/g;", "LTV0/b;", "LTV0/e;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements TV0.b<TV0.e, CommercialBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f86946a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<Eb.b> f86947b = new g.a<>(R.layout.empty_ad_stub_rich, a.f86948l);

    /* compiled from: EmptyAdStubItemRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LEb/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LEb/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, Eb.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86948l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Eb.b invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            int dimensionPixelOffset = view2.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
            D6.f(view2, dimensionPixelOffset, view2.getResources().getDimensionPixelSize(R.dimen.rich_snippet_commercial_padding_top), dimensionPixelOffset, 0, 8);
            return new Eb.b(view2);
        }
    }

    @Inject
    public g(@Y61.k d dVar) {
        this.f86946a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86946a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<Eb.b> b() {
        return this.f86947b;
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
            if (commercialBannerItem.isEmpty() && commercialBannerItem.getDisplayType().isInformative()) {
                return true;
            }
        }
        return false;
    }
}
