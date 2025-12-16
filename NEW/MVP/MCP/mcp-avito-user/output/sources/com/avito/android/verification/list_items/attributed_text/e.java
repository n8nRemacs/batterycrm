package com.avito.android.verification.list_items.attributed_text;

import Y61.k;
import android.widget.TextView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AttributedTextItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/list_items/attributed_text/e;", "LTV0/d;", "Lcom/avito/android/verification/list_items/attributed_text/g;", "Lcom/avito/android/verification/list_items/attributed_text/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324776b;

    @Inject
    public e(@k w wVar) {
        this.f324776b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        TextView textView = gVar.f324779d;
        Integer num = aVar2.f324769d;
        if (num != null) {
            textView.setTextAppearance(C35835l0.j(num.intValue(), gVar.itemView.getContext()));
        }
        AttributedText attributedText = aVar2.f324768c;
        j.a(textView, attributedText, null);
        gVar.f324778c.setVisibility(aVar2.f324770e ? 0 : 8);
        attributedText.setOnDeepLinkClickListener(this.f324776b);
        gVar.f8928b = new d(aVar2);
    }
}
