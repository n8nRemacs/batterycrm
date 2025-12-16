package com.avito.android.developments_agency_search.adapter.commission_promo_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommissionPromoBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/i;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f136256e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f136257b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f136258c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f136259d;

    public j(@k View view) {
        super(view);
        Banner banner = (Banner) view;
        banner.setClipToOutline(true);
        this.f136257b = banner;
        View viewFindViewById = view.findViewById(R.id.subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f136258c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.show_promo_condition_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f136259d = (Button) viewFindViewById2;
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.i
    public final void AS(@k Y41.a<G0> aVar) {
        this.f136257b.setCloseButtonListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(6, aVar));
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.i
    public final void f(@k String str) {
        I5.a(this.f136258c, str, false);
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.i
    public final void gJ(@k Y41.a<G0> aVar) {
        this.f136259d.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(7, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f136257b.setCloseButtonListener(null);
        this.f136259d.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.i
    public final void setTitle(@k String str) {
        this.f136257b.setTitle(str);
    }
}
