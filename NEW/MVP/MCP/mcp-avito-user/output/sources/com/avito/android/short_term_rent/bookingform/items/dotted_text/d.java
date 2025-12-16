package com.avito.android.short_term_rent.bookingform.items.dotted_text;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.dotted_text.g;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AbsDottedTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/d;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/m;", "Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/DottedTextItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d implements TV0.f<m, DottedTextItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f281492b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f281492b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        DottedTextItem dottedTextItem = (DottedTextItem) aVar;
        AttributedText attributedText = dottedTextItem.f281483c;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new b(this, 0));
        }
        mVar.D9(attributedText);
        AttributedText attributedText2 = dottedTextItem.f281484d;
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(new b(this, 1));
        }
        mVar.ed(attributedText2);
        if (dottedTextItem.f281485e != null) {
            mVar.a(new c(this, dottedTextItem));
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar = (m) eVar;
        DottedTextItem dottedTextItem = (DottedTextItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<g> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            AttributedText attributedText = dottedTextItem.f281483c;
            if (attributedText != null) {
                attributedText.setOnDeepLinkClickListener(new b(this, 0));
            }
            mVar.D9(attributedText);
            AttributedText attributedText2 = dottedTextItem.f281484d;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new b(this, 1));
            }
            mVar.ed(attributedText2);
            if (dottedTextItem.f281485e != null) {
                mVar.a(new c(this, dottedTextItem));
                return;
            }
            return;
        }
        for (g gVar : list2) {
            if (gVar instanceof g.a) {
                AttributedText attributedText3 = ((g.a) gVar).f281495a;
                if (attributedText3 != null) {
                    attributedText3.setOnDeepLinkClickListener(new b(this, 0));
                }
                mVar.D9(attributedText3);
            } else if (gVar instanceof g.b) {
                AttributedText attributedText4 = ((g.b) gVar).f281496a;
                if (attributedText4 != null) {
                    attributedText4.setOnDeepLinkClickListener(new b(this, 1));
                }
                mVar.ed(attributedText4);
            }
        }
    }
}
