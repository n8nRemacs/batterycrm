package com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AwardBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/award_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/award_banner/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f137268b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137269c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137270d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f137271e;

    public g(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f137268b = context;
        View viewFindViewById = view.findViewById(R.id.award_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(banner.getContext(), R.attr.gradientLinearMonoVerticalViolet, 0, 4, null);
        c5275a.f179264a = y6.b(20);
        banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
        View viewFindViewById2 = banner.findViewById(R.id.banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137269c = (TextView) viewFindViewById2;
        View viewFindViewById3 = banner.findViewById(R.id.award_amount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137270d = (TextView) viewFindViewById3;
        View viewFindViewById4 = banner.findViewById(R.id.award_amount_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137271e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.award_amount_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        float fB2 = y6.b(20);
        Ow.f.a(viewFindViewById5, fB2, fB2, fB2, fB2, C35835l0.e(R.attr.white, context));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.f
    public final void Kk(@k String str) {
        I5.a(this.f137270d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.f
    public final void Kt(@k PrintableText printableText) {
        I5.a(this.f137269c, printableText.k0(this.f137268b), false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.f
    public final void p70(@k PrintableText printableText) {
        I5.a(this.f137271e, printableText.k0(this.f137268b), false);
    }
}
