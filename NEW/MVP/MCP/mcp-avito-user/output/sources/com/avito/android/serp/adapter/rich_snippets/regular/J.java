package com.avito.android.serp.adapter.rich_snippets.regular;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertXlRichItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/J;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/x;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class J implements TV0.b<InterfaceC34800x, AdvertXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f271068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f271069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.p f271070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f271071d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<C34801y> f271072e = new g.a<>(R.layout.advert_xl_item_rich, new a());

    /* compiled from: AdvertXlRichItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34801y> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C34801y invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            com.avito.android.cyclic_gallery_widget.image_carousel.m mVar = new com.avito.android.cyclic_gallery_widget.image_carousel.m(view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.75f, 1.3333334f, 0.0f, 0.0f, 12, null);
            J j12 = J.this;
            return new C34801y(view2, mVar, j12.f271069b, j12.f271070c.c(), AsyncViewportTracker.ViewContext.f430428r, j12.f271071d, null, 64, null);
        }
    }

    @Inject
    public J(@Y61.k L l12, @Y61.k RecyclerView.t tVar, @Y61.k com.avito.android.serp.adapter.rich_snippets.p pVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f271068a = l12;
        this.f271069b = tVar;
        this.f271070c = pVar;
        this.f271071d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f271068a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34801y> b() {
        return this.f271072e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        String str;
        if (aVar instanceof AdvertXlItem) {
            AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
            if (advertXlItem.f268789i.isRich() && ((str = advertXlItem.f268809u) == null || C43066x.K(str))) {
                return true;
            }
        }
        return false;
    }
}
