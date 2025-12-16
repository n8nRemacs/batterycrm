package com.avito.android.verification.inn.list.text;

import Y61.k;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TextItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/text/e;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/text/g;", "Lcom/avito/android/verification/inn/list/text/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324111b;

    @Inject
    public e(@k w wVar) {
        this.f324111b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f324101f;
        attributedText.setOnDeepLinkClickListener(this.f324111b);
        int iJ2 = C35835l0.j(aVar2.f324100e, gVar.itemView.getContext());
        TextView textView = gVar.f324113b;
        textView.setTextAppearance(iJ2);
        textView.setTextColor(C35835l0.d(aVar2.f324103h, gVar.f324114c));
        j.a(textView, attributedText, null);
        ((RecyclerView.n) gVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f324104i), 0, y6.b(aVar2.f324105j));
        gVar.f324115d = new d(aVar2);
    }
}
