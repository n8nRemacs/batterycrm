package com.avito.android.advert_details_items.campaigns;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.campaigns.f;
import com.avito.android.remote.model.CampaignOption;
import com.avito.android.remote.model.CampaignOptionCopy;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCampaignsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/campaigns/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84513b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f84514c;

    public g(@k View view) {
        super(view);
        this.f84513b = view;
        View viewFindViewById = view.findViewById(R.id.campaign_options);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84514c = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.advert_details_items.campaigns.f
    public final void Ey(@k List<CampaignOption> list, @k f.b bVar) {
        LinearLayout linearLayout = this.f84514c;
        linearLayout.removeAllViews();
        for (CampaignOption campaignOption : list) {
            TextView textView = (TextView) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_campaign_option, (ViewGroup) linearLayout, false);
            com.avito.android.util.text.j.a(textView, campaignOption.getTitle(), null);
            I5.d(textView, null, C35835l0.h(R.attr.ic_arrowRight16, linearLayout.getContext()), 11);
            textView.setOnClickListener(new h(bVar, campaignOption, 0));
            CampaignOptionCopy copy = campaignOption.getCopy();
            if (copy != null) {
                textView.setOnLongClickListener(new i(bVar, copy, 0));
            }
            linearLayout.addView(textView);
        }
    }
}
