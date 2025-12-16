package com.avito.android.rating_form.item.stars;

import com.avito.android.printable_text.PrintableText;
import ih0.InterfaceC41402a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StarsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/stars/g;", "Lcom/avito/android/rating_form/item/stars/e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC41402a, G0> f248665b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC41402a, G0> lVar) {
        this.f248665b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        b bVar = (b) aVar;
        PrintableText printableText = bVar.f248654g;
        if (printableText != null) {
            lVar.G2(printableText);
        } else {
            lVar.y(bVar.f248651d);
            lVar.Lt(bVar.f248655h);
        }
        lVar.RL(new f(bVar, lVar, this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        b bVar = (b) aVar;
        Object objG = C42745f0.G(list);
        com.avito.android.rating_form.step.recycler.e eVar2 = objG instanceof com.avito.android.rating_form.step.recycler.e ? (com.avito.android.rating_form.step.recycler.e) objG : null;
        PrintableText printableText = eVar2 != null ? eVar2.f249734a : null;
        Object objG2 = C42745f0.G(list);
        com.avito.android.rating_form.step.recycler.e eVar3 = objG2 instanceof com.avito.android.rating_form.step.recycler.e ? (com.avito.android.rating_form.step.recycler.e) objG2 : null;
        Boolean bool = eVar3 != null ? eVar3.f249735b : null;
        if (printableText != null) {
            lVar.G2(printableText);
        } else {
            lVar.y(bVar.f248651d);
            lVar.Lt(bVar.f248655h);
        }
        lVar.setEnabled(bool != null ? bool.booleanValue() : true);
    }
}
