package com.avito.android.inline_filters.dialog.group.item.double_input;

import Y41.q;
import Y61.k;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DoubleInputPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/double_input/b;", "LTV0/d;", "Lcom/avito/android/inline_filters/dialog/group/item/double_input/c;", "Lcom/avito/android/inline_filters/dialog/group/item/double_input/DoubleInputItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.d<c, DoubleInputItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q<Filter, Long, Long, G0> f171581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f171582c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k q<? super Filter, ? super Long, ? super Long, G0> qVar, @k Y41.a<G0> aVar) {
        this.f171581b = qVar;
        this.f171582c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        cVar.SN((DoubleInputItem) aVar);
        cVar.g80(this.f171581b);
        cVar.aW(this.f171582c);
    }
}
