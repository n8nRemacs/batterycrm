package com.avito.android.advert_details_items.campaigns.restyle;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.campaigns.f;
import com.avito.android.advert_details_items.campaigns.h;
import com.avito.android.advert_details_items.campaigns.i;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/restyle/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/campaigns/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84527b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f84528c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f84529d;

    public c(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f84527b = view;
        this.f84528c = aVar;
        View viewFindViewById = view.findViewById(R.id.campaign_options);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84529d = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.advert_details_items.campaigns.f
    public final void Ey(@k List<CampaignOption> list, @k f.b bVar) {
        LinearLayout linearLayout = this.f84529d;
        linearLayout.removeAllViews();
        for (CampaignOption campaignOption : list) {
            TextView textView = (TextView) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_campaign_option_restyle, (ViewGroup) linearLayout, false);
            CharSequence charSequenceC = this.f84528c.c(textView.getContext(), campaignOption.getTitle());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequenceC);
            Drawable drawableH = C35835l0.h(R.attr.ic_arrowRight16, textView.getContext());
            if (drawableH != null) {
                drawableH.setTint(C35835l0.d(R.attr.black, textView.getContext()));
                drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
                spannableStringBuilderAppend.append(" _", new ImageSpan(drawableH, 0), 34);
            }
            I5.a(textView, spannableStringBuilder, false);
            textView.setOnClickListener(new h(bVar, campaignOption, 1));
            CampaignOptionCopy copy = campaignOption.getCopy();
            if (copy != null) {
                textView.setOnLongClickListener(new i(bVar, copy, 1));
            }
            linearLayout.addView(textView);
        }
    }
}
