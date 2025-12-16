package com.avito.android.serp.adapter.rich_snippets.travel;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.serp.adapter.rich_snippets.regular.C34801y;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e;
import com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34800x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertRichSmallStrRedesignItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/travel/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/x;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<InterfaceC34800x, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34782e f271403a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f271404b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f271405c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f271406d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<C34801y> f271407e = new g.a<>(R.layout.advert_item_rich_str_redesign, new C8075a());

    /* compiled from: AdvertRichSmallStrRedesignItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.travel.a$a, reason: collision with other inner class name */
    public static final class C8075a extends N implements Y41.p<ViewGroup, View, C34801y> {
        public C8075a() {
            super(2);
        }

        @Override // Y41.p
        public final C34801y invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            float f12 = view2.getResources().getConfiguration().orientation == 2 ? 0.6666667f : 1.3333334f;
            float f13 = view2.getResources().getConfiguration().orientation == 2 ? 1.0370371f : 1.7142857f;
            int i12 = view2.getResources().getConfiguration().orientation;
            a aVar = a.this;
            return new C34801y(view2, new com.avito.android.cyclic_gallery_widget.image_carousel.m(0.32f, 1.3333334f, f12, f13), aVar.f271404b, i12 == 2 ? aVar.f271405c.b() : aVar.f271405c.a(), AsyncViewportTracker.ViewContext.f430431u, aVar.f271406d, null, 64, null);
        }
    }

    @Inject
    public a(@Y61.k InterfaceC34782e interfaceC34782e, @Y61.k RecyclerView.t tVar, @Y61.k p pVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f271403a = interfaceC34782e;
        this.f271404b = tVar;
        this.f271405c = pVar;
        this.f271406d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f271403a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34801y> b() {
        return this.f271407e;
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
        if (aVar instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268582b && advertItem.f268378F.isRich() && (((str = advertItem.f268444k) == null || C43066x.K(str)) && advertItem.f268409U0 && advertItem.f268415X0 == null)) {
                return true;
            }
        }
        return false;
    }
}
