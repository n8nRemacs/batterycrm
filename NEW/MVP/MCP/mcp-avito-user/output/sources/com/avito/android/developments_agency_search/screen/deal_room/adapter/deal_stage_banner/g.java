package com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DealStageBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_stage_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_stage_banner/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f137318b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.reward_amount);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137318b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.reward_banner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById2;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(banner.getContext(), R.attr.gradientLinearMixedHorizontalGreenViolet, 0, 4, null);
        c5275a.f179264a = y6.b(20);
        banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner.f
    public final void pG(@k String str) {
        I5.a(this.f137318b, str, false);
    }
}
