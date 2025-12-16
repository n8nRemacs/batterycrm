package com.avito.android.extended_profile_widgets.adapter.premium_banner;

import SV.b;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner.PremiumBannerItem;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.util.D6;
import com.avito.android.util.X1;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.j;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PremiumBannerListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f154600b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f154601c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PageIndicatorRe23 f154602d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154603e;

    /* renamed from: f, reason: collision with root package name */
    public final int f154604f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayoutManager f154605g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final j f154606h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f154607i;

    /* compiled from: PremiumBannerListItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/premium_banner/i$a", "LSV/b$a;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a {
        public a() {
        }

        @Override // SV.b.a
        public final void a(int i12) {
            Y41.l<? super Integer, G0> lVar = i.this.f154607i;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i12));
            }
        }
    }

    public i(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) throws Resources.NotFoundException {
        super(view);
        this.f154600b = aVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.extended_profile_premium_banner_list_image_recycler);
        this.f154601c = recyclerView;
        this.f154602d = (PageIndicatorRe23) view.findViewById(R.id.extended_profile_premium_banner_page_indicator);
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.extended_profile_premium_banner_horizontal_margin);
        this.f154603e = dimensionPixelOffset;
        int dimensionPixelOffset2 = view.getResources().getDimensionPixelOffset(R.dimen.extended_profile_premium_banner_horizontal_margin_between);
        int i12 = dimensionPixelOffset2 / 2;
        this.f154604f = i12;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f154605g = linearLayoutManager;
        j jVar = new j(aVar2, aVar);
        this.f154606h = jVar;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(jVar);
        new SV.b(dimensionPixelOffset - i12, new a()).b(recyclerView);
        recyclerView.l(new X1(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2), -1);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.premium_banner.h
    public final void Qz(@k Y41.l lVar, @k List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        PremiumBannerItem premiumBannerItem = (PremiumBannerItem) it.next();
        RecyclerView recyclerView = this.f154601c;
        int iIntValue = com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner.i.a(recyclerView.getContext(), premiumBannerItem.f154577c.getOriginalSize()).f406620c.intValue();
        while (it.hasNext()) {
            int iIntValue2 = com.avito.android.extended_profile_widgets.adapter.premium_banner.adapter.banner.i.a(recyclerView.getContext(), ((PremiumBannerItem) it.next()).f154577c.getOriginalSize()).f406620c.intValue();
            if (iIntValue < iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        recyclerView.setMinimumHeight(iIntValue);
        this.f154607i = lVar;
        this.f154600b.c(new UV0.c(list));
        this.f154606h.notifyDataSetChanged();
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.premium_banner.h
    public final void Rs(int i12, boolean z12) {
        PageIndicatorRe23 pageIndicatorRe23 = this.f154602d;
        D6.G(pageIndicatorRe23, z12);
        if (!z12) {
            com.avito.android.lib.design.page_indicator_re23.b.c(pageIndicatorRe23);
            D6.f(this.f154601c, 0, 0, 0, y6.b(24), 7);
            return;
        }
        com.avito.android.lib.design.page_indicator_re23.b.a(pageIndicatorRe23, this.f154601c);
        D6.f(this.f154601c, 0, 0, 0, y6.b(0), 7);
        if (i12 == 0) {
            pageIndicatorRe23.e(i12, pageIndicatorRe23.getState$_design_modules_components().f179932b);
        } else {
            pageIndicatorRe23.f();
            pageIndicatorRe23.e(i12, pageIndicatorRe23.getState$_design_modules_components().f179932b);
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.premium_banner.h
    public final void W0(int i12) {
        this.f154605g.b2(i12, this.f154603e - this.f154604f);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154607i = null;
    }
}
