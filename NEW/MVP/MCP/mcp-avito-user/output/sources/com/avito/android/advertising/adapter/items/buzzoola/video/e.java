package com.avito.android.advertising.adapter.items.buzzoola.video;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialVideoBigBorderlessBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/e;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/k;", "Lcom/avito/android/advertising/adapter/items/buzzoola/video/CommercialVideoBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.b<com.avito.android.advertising.ui.buzzoola.k, CommercialVideoBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f87552a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f87553b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f87554c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.m> f87555d = new g.a<>(R.layout.buzzoola_video_ad, new a());

    /* compiled from: CommercialVideoBigBorderlessBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.m> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.m invoke(ViewGroup viewGroup, View view) {
            AdStyle adStyle = AdStyle.f88544i;
            e eVar = e.this;
            com.avito.android.advertising.ui.buzzoola.m mVar = new com.avito.android.advertising.ui.buzzoola.m(view, adStyle, eVar.f87553b, eVar.f87554c.e());
            ViewGroup viewGroup2 = mVar.f88604f;
            if (viewGroup2 != null) {
                v.b(viewGroup2, R.dimen.ad_video_corner_radius);
            }
            ViewGroup viewGroup3 = mVar.f88605g;
            if (viewGroup3 != null) {
                v.b(viewGroup3, R.dimen.ad_video_corner_radius);
            }
            mVar.H60(R.dimen.ad_video_icon_corner_radius);
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(C35835l0.d(R.attr.warmGray4, mVar.f88600b.getContext()));
            }
            return mVar;
        }
    }

    @Inject
    public e(@Y61.k j jVar, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f87552a = jVar;
        this.f87553b = aVar;
        this.f87554c = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87552a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.m> b() {
        return this.f87555d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CommercialVideoBannerItem;
    }
}
