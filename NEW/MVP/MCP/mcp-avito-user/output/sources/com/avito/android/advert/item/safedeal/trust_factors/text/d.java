package com.avito.android.advert.item.safedeal.trust_factors.text;

import Y61.k;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.text.f;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrustFactorsTextPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/text/d;", "LTV0/d;", "Lcom/avito/android/advert/item/safedeal/trust_factors/text/f;", "Lcom/avito/android/advert/item/safedeal/trust_factors/text/TrustFactorsTextItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, TrustFactorsTextItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.safedeal.trust_factors.d f79243b;

    @Inject
    public d(@k com.avito.android.advert.item.safedeal.trust_factors.d dVar) {
        this.f79243b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar;
        f fVar = (f) eVar;
        TrustFactorsTextItem trustFactorsTextItem = (TrustFactorsTextItem) aVar;
        SafeDeal.Component.Text text = trustFactorsTextItem.f79231c.f84272b;
        AttributedText attributedText = text.getAttributedText();
        com.avito.android.advert.item.safedeal.trust_factors.d dVar = this.f79243b;
        attributedText.setOnDeepLinkClickListener(new c(dVar));
        AttributedText attributedText2 = text.getAttributedText();
        com.avito.android.util.text.a aVar2 = fVar.f79246c;
        TextView textView = fVar.f79245b;
        j.a(textView, attributedText2, aVar2);
        textView.setTextAppearance(com.avito.android.lib.util.f.r(fVar.f79248e, text.getStyle()));
        SafeDeal.Alignment alignment = text.getAlignment();
        int i13 = alignment == null ? -1 : f.a.f79249a[alignment.ordinal()];
        textView.setGravity(i13 != 1 ? i13 != 2 ? 8388611 : 8388613 : 1);
        Integer numberOfLines = text.getNumberOfLines();
        if (numberOfLines == null) {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
        } else if (numberOfLines.intValue() == 1) {
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setMaxLines(numberOfLines.intValue());
        }
        SafeDeal.TooltipData tooltipData = trustFactorsTextItem.f79233e;
        if (tooltipData == null || (iVar = fVar.f79247d) == null) {
            return;
        }
        iVar.b(trustFactorsTextItem.f79230b, tooltipData, dVar);
    }
}
