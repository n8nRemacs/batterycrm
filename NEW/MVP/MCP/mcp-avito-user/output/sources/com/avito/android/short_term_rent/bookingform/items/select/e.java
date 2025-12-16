package com.avito.android.short_term_rent.bookingform.items.select;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.short_term_rent.bookingform.items.select.FormSelectState;
import com.avito.android.short_term_rent.bookingform.items.select.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbsFormSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/select/e;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/select/m;", "Lcom/avito/android/short_term_rent/bookingform/items/select/FormSelectItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e implements TV0.f<m, FormSelectItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f281647b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f281647b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((m) eVar, (FormSelectItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar = (m) eVar;
        FormSelectItem formSelectItem = (FormSelectItem) aVar;
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
            k(mVar, formSelectItem);
            return;
        }
        for (h hVar : list2) {
            if (hVar instanceof h.a) {
                mVar.setEnabled(((h.a) hVar).f281650a);
            } else if (hVar instanceof h.b) {
                mVar.S(new b((h.b) hVar, this));
            } else if (hVar instanceof h.c) {
                FormSelectState formSelectState = ((h.c) hVar).f281652a;
                if (L.f(formSelectState, FormSelectState.Normal.f281638b)) {
                    mVar.G();
                } else if (formSelectState instanceof FormSelectState.Error) {
                    mVar.G1(((FormSelectState.Error) formSelectState).f281637b);
                }
            } else if (hVar instanceof h.d) {
                h.d dVar = (h.d) hVar;
                mVar.setText(dVar.f281653a);
                mVar.setHint(dVar.f281654b);
            }
        }
        mVar.S(new c(formSelectItem, this));
    }

    public final void k(@Y61.k m mVar, @Y61.k FormSelectItem formSelectItem) {
        mVar.setText(formSelectItem.f281633d);
        mVar.setHint(formSelectItem.f281634e);
        mVar.setEnabled(formSelectItem.f281632c);
        FormSelectState.Normal normal = FormSelectState.Normal.f281638b;
        FormSelectState formSelectState = formSelectItem.f281635f;
        if (L.f(formSelectState, normal)) {
            mVar.G();
        } else if (formSelectState instanceof FormSelectState.Error) {
            mVar.G1(((FormSelectState.Error) formSelectState).f281637b);
        }
        mVar.S(new d(formSelectItem, this));
    }
}
