package com.avito.android.loyalty.ui.quality_service.items.text;

import Y61.k;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TextItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/text/c;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/text/e;", "Lcom/avito/android/loyalty/ui/quality_service/items/text/TextItem;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements TV0.d<e, TextItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183949b;

    @Inject
    public c(@k w wVar) {
        this.f183949b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        TextItem textItem = (TextItem) aVar;
        AttributedText attributedText = textItem.f183943d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f183949b);
        }
        int iJ2 = C35835l0.j(textItem.f183944e, eVar2.itemView.getContext());
        TextView textView = eVar2.f183951b;
        textView.setTextAppearance(iJ2);
        j.a(textView, attributedText, null);
        Integer num = textItem.f183942c;
        D6.c(eVar2.f183951b, null, null, null, Integer.valueOf(y6.b(num != null ? num.intValue() : 16)), 7);
    }
}
