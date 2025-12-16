package com.avito.android.inline_filters.dialog.group.item.multiselect;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.dialog.s;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiselectPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/multiselect/b;", "LTV0/d;", "Lcom/avito/android/inline_filters/dialog/group/item/multiselect/c;", "Lcom/avito/android/inline_filters/dialog/group/item/multiselect/MultiselectItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.d<c, MultiselectItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s f171608b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<Filter, List<String>, G0> f171609c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f171610d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k s sVar, @k p<? super Filter, ? super List<String>, G0> pVar, @k l<? super DeepLink, G0> lVar) {
        this.f171608b = sVar;
        this.f171609c = pVar;
        this.f171610d = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        MultiselectItem multiselectItem = (MultiselectItem) aVar;
        cVar.yz(multiselectItem, this.f171608b.a(multiselectItem.f171603c));
        cVar.f70(this.f171609c);
        cVar.dY(this.f171610d);
    }
}
