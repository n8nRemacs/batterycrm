package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import SV.b;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.util.X1;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCompanyCarouselView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f154502b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final j f154503c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f154504d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PageIndicatorRe23 f154505e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f154506f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayoutManager f154507g;

    /* renamed from: h, reason: collision with root package name */
    public final int f154508h;

    /* renamed from: i, reason: collision with root package name */
    public final int f154509i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f154510j;

    /* compiled from: JobCompanyCarouselView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/job_company_carousel/g$a", "LSV/b$a;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a {
        public a() {
        }

        @Override // SV.b.a
        public final void a(int i12) {
            Y41.l<? super Integer, G0> lVar = g.this.f154510j;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i12));
            }
        }
    }

    public g(@k View view, @k com.avito.konveyor.adapter.a aVar, @k j jVar) throws Resources.NotFoundException {
        super(view);
        this.f154502b = aVar;
        this.f154503c = jVar;
        View viewFindViewById = view.findViewById(R.id.extended_profile_job_company_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f154504d = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_job_company_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23");
        }
        this.f154505e = (PageIndicatorRe23) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154506f = (TextView) viewFindViewById3;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f154507g = linearLayoutManager;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.extended_profile_widget_horizontal_margin);
        this.f154508h = dimensionPixelSize;
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.extended_profile_job_company_carousel_items_between_margin);
        int i12 = dimensionPixelSize2 / 2;
        this.f154509i = i12;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.l(new X1(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2), -1);
        new SV.b(dimensionPixelSize - i12, new a()).b(recyclerView);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154510j = null;
    }
}
