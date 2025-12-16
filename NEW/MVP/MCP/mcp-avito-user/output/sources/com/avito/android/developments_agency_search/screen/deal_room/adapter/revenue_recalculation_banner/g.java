package com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RevenueRecalculationBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/revenue_recalculation_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/revenue_recalculation_banner/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137426b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137427c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137428d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f137429e;

    public g(@k View view) {
        super(view);
        this.f137426b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137427c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137428d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f137429e = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.f
    public final void H4(int i12) {
        this.f137429e.setImageResource(i12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.f
    public final void Jh(int i12, int i13) {
        Ow.f.a(this.f137426b, y6.b(i12), y6.b(i12), y6.b(i13), y6.b(i13), C35835l0.e(R.attr.warmGray75, this.f137426b.getContext()));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.f
    public final void f(@k String str) {
        I5.a(this.f137428d, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137426b.setBackground(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.f
    public final void setTitle(@k String str) {
        I5.a(this.f137427c, str, false);
    }
}
