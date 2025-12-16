package com.avito.android.verification.list_items.banner;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.banner.a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/list_items/banner/e;", "LTV0/d;", "Lcom/avito/android/verification/list_items/banner/g;", "Lcom/avito/android/verification/list_items/banner/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324792b;

    @Inject
    public e(@k w wVar) {
        this.f324792b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        Integer numA;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        String str = aVar2.f324783e;
        Context context = gVar.f324794c;
        c5258a.getClass();
        com.avito.android.lib.design.banner.a aVarB = a.C5258a.b(C35835l0.j(com.avito.android.lib.util.f.b(str), context), context);
        String str2 = aVar2.f324784f;
        if (str2 != null && (numA = com.avito.android.lib.util.e.a(str2)) != null) {
            aVarB = com.avito.android.lib.design.banner.a.a(aVarB, null, new C35763c0(C35835l0.d(numA.intValue(), context), null, null, null, 14, null), null, 0, 0, 0, 0, false, 0.0f, false, false, 8388605);
        }
        gVar.f324795d.setStyle(aVarB);
        I5.a(gVar.f324796e, aVar2.f324781c, false);
        TextView textView = gVar.f324797f;
        AttributedText attributedText = aVar2.f324782d;
        j.a(textView, attributedText, null);
        ((RecyclerView.n) gVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f324785g), 0, y6.b(aVar2.f324786h));
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f324792b);
            gVar.f8928b = new d(attributedText);
        }
    }
}
