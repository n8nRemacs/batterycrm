package com.avito.android.advert.item.ownership_cost.dialogs;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.dialogs.e;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35770d;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostDisclaimerContentViewFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/g;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35770d f77898a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e.a f77899b;

    @Inject
    public g(@k InterfaceC35770d interfaceC35770d, @k e.a aVar) {
        this.f77898a = interfaceC35770d;
        this.f77899b = aVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.e
    public final void a(@k LinearLayout linearLayout, @k OwnershipCostResponse.OwnershipCostDisclaimer ownershipCostDisclaimer) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        String title = ownershipCostDisclaimer.getTitle();
        TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.ownership_cost_disclaimer_paragraph, (ViewGroup) linearLayout, false);
        textView.setText(title);
        textView.setTextAppearance(C35835l0.j(R.attr.textH3, linearLayout.getContext()));
        linearLayout.addView(textView);
        for (String str : ownershipCostDisclaimer.getParagraphs()) {
            TextView textView2 = (TextView) layoutInflaterFrom.inflate(R.layout.ownership_cost_disclaimer_paragraph, (ViewGroup) linearLayout, false);
            textView2.setText(str);
            linearLayout.addView(textView2);
        }
        OwnershipCostResponse.OwnershipCostDisclaimer.DisclaimerLink disclaimerLink = ownershipCostDisclaimer.getDisclaimerLink();
        TextView textView3 = (TextView) layoutInflaterFrom.inflate(R.layout.ownership_cost_disclaimer_paragraph, (ViewGroup) linearLayout, false);
        textView3.setText(this.f77898a.a(disclaimerLink.getText(), disclaimerLink.getLinkText(), disclaimerLink.getLinkKey(), new f(this, disclaimerLink)));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView3.getLayoutParams();
        layoutParams.bottomMargin = y6.b(82);
        linearLayout.addView(textView3, layoutParams);
    }
}
