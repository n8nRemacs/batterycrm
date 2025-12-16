package com.avito.android.loyalty.ui.items.text_item;

import Y61.k;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LoyaltyTextItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/items/text_item/e;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/items/text_item/g;", "Lcom/avito/android/loyalty/ui/items/text_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183753b;

    @Inject
    public e(@k w wVar) {
        this.f183753b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        TextView textView = gVar.f183755b;
        AttributedText attributedText = aVar2.f183746c;
        j.a(textView, attributedText, null);
        attributedText.setOnDeepLinkClickListener(this.f183753b);
        gVar.f183756c = new d(aVar2);
    }
}
