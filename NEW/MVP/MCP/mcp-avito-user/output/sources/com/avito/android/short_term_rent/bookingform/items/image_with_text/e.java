package com.avito.android.short_term_rent.bookingform.items.image_with_text;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.short_term_rent.bookingform.items.image_with_text.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AbsImageWithTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/image_with_text/e;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/image_with_text/n;", "Lcom/avito/android/short_term_rent/bookingform/items/image_with_text/ImageWithTextItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e implements TV0.f<n, ImageWithTextItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f281514b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f281514b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        ImageWithTextItem imageWithTextItem = (ImageWithTextItem) aVar;
        nVar.F(imageWithTextItem.f281504d);
        nVar.J9(imageWithTextItem.f281503c);
        nVar.S(new d(imageWithTextItem, this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        n nVar = (n) eVar;
        ImageWithTextItem imageWithTextItem = (ImageWithTextItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<h> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            nVar.F(imageWithTextItem.f281504d);
            nVar.J9(imageWithTextItem.f281503c);
            nVar.S(new d(imageWithTextItem, this));
            return;
        }
        for (h hVar : list2) {
            if (hVar instanceof h.a) {
                nVar.J9(((h.a) hVar).f281517a);
            } else if (hVar instanceof h.c) {
                nVar.F(((h.c) hVar).f281519a);
            } else if (hVar instanceof h.b) {
                nVar.S(new b((h.b) hVar, this));
            }
        }
        nVar.S(new c(imageWithTextItem, this));
    }
}
