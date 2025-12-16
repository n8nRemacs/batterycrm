package com.avito.android.advert_details_items.flats.services_redesign;

import PK0.j;
import Y61.k;
import Y61.l;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatsServicesRedesignView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/flats/services_redesign/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/flats/services_redesign/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.appcompat.view.d f84763b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f84764c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f84765d;

    public g(@k View view) {
        super(view);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f84763b = dVar;
        TextView textView = (TextView) view.findViewById(R.id.flats_container_title);
        this.f84764c = textView;
        this.f84765d = (LinearLayout) view.findViewById(R.id.flat_container);
        if (textView != null) {
            textView.setTextAppearance(C35835l0.j(R.attr.textH25, dVar));
        }
    }

    @Override // com.avito.android.advert_details_items.flats.services_redesign.f
    public final void KF(@k List<AdvertParameters.WorkingCondition> list) {
        LinearLayout linearLayout = this.f84765d;
        linearLayout.removeAllViews();
        for (AdvertParameters.WorkingCondition workingCondition : list) {
            androidx.appcompat.view.d dVar = this.f84763b;
            View viewInflate = LayoutInflater.from(dVar).inflate(R.layout.advert_details_items_flats_working_condition_item, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text_icon);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.text);
            String strO = com.avito.android.lib.util.f.o(dVar, workingCondition.getIconName());
            if (strO != null) {
                SpannableString spannableString = new SpannableString(strO);
                spannableString.setSpan(new j(null, 1, null), 0, spannableString.length(), 33);
                I5.a(textView, spannableString, false);
            }
            I5.a(textView2, workingCondition.getText(), false);
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            D6.c(viewInflate, null, Integer.valueOf(y6.b(8)), null, null, 13);
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.advert_details_items.flats.services_redesign.f
    public final void w(@l AttributedText attributedText) {
        TextView textView = this.f84764c;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }
}
