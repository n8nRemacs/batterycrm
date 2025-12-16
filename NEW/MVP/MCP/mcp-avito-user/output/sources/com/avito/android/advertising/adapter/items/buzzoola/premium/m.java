package com.avito.android.advertising.adapter.items.buzzoola.premium;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumRichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/m;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/p;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/BuzzoolaPremiumBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements TV0.b<com.avito.android.advertising.ui.buzzoola.premium.p, BuzzoolaPremiumBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f87437a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> f87438b = new g.a<>(R.layout.buzzoola_premium, a.f87439l);

    /* compiled from: BuzzoolaPremiumRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.premium.q> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87439l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.premium.q invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
            float f12 = view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f;
            com.avito.android.advertising.ui.buzzoola.premium.q qVar = new com.avito.android.advertising.ui.buzzoola.premium.q((ForegroundRelativeLayout) view2, 1.3333334f, cVar, AdStyle.f88542g, new com.avito.android.advertising.adapter.items.buzzoola.premium.legal.c(new com.avito.android.advertising.adapter.items.buzzoola.premium.legal.e(1.3333334f, cVar), false), new com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.c(new com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.e(1.3333334f, cVar)));
            com.avito.android.advertising.ui.buzzoola.premium.h hVar = qVar.f88664b;
            hVar.getClass();
            com.avito.android.advertising.ui.h.f88704a.getClass();
            com.avito.android.advertising.ui.h.j(hVar.f88638h, true);
            ForegroundRelativeLayout foregroundRelativeLayout = hVar.f88632b;
            int i12 = foregroundRelativeLayout.getResources().getDisplayMetrics().widthPixels;
            RecyclerView recyclerView = hVar.f88635e;
            hVar.f88637g.f132066a.getLayoutParams().height = (int) (((i12 - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) * f12);
            Resources resources = foregroundRelativeLayout.getContext().getResources();
            D6.f(hVar.f88632b, 0, resources.getDimensionPixelOffset(R.dimen.rich_snippet_padding_top), 0, resources.getDimensionPixelOffset(R.dimen.premium_ad_rich_bottom_padding), 5);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
            D6.f(hVar.f88635e, dimensionPixelOffset, 0, resources.getDimensionPixelOffset(R.dimen.rich_snippet_padding_right), 0, 10);
            D6.c(hVar.f88636f, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_image_bottom_margin)), 7);
            D6.c(hVar.f88643m, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_logo_inset)), null, null, null, 14);
            D6.c(hVar.f88638h, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            D6.c(hVar.f88639i, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            D6.c(hVar.f88644n, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            return qVar;
        }
    }

    @Inject
    public m(@Y61.k f fVar) {
        this.f87437a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87437a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> b() {
        return this.f87438b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof BuzzoolaPremiumBannerItem) && ((BuzzoolaPremiumBannerItem) aVar).getDisplayType().isInformative();
    }
}
