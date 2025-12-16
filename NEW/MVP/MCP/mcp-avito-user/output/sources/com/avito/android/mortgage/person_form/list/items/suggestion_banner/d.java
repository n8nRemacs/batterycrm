package com.avito.android.mortgage.person_form.list.items.suggestion_banner;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/d;", "LC00/b;", "Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/i;", "Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/SuggestionBannerItem;", "Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends C00.b<i, SuggestionBannerItem, com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<E00.b, G0> f200800b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k l<? super E00.b, G0> lVar) {
        this.f200800b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        SuggestionBannerItem suggestionBannerItem = (SuggestionBannerItem) aVar;
        iVar.a(new c(this, suggestionBannerItem));
        iVar.LP(suggestionBannerItem.f200791d);
        iVar.ae(suggestionBannerItem.f200792e);
    }

    @Override // C00.b
    public final void k(C00.c cVar, PersonFormItem personFormItem, int i12, List<? extends com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads.a> list) {
        i iVar = (i) cVar;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            SuggestionBannerItem suggestionBannerItem = ((com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads.a) it.next()).f200811a;
            iVar.a(new c(this, suggestionBannerItem));
            iVar.LP(suggestionBannerItem.f200791d);
            iVar.ae(suggestionBannerItem.f200792e);
        }
    }
}
