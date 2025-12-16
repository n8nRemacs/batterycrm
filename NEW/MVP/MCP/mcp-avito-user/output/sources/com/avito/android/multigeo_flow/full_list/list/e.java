package com.avito.android.multigeo_flow.full_list.list;

import Y41.l;
import Y61.k;
import com.avito.android.multigeo_flow.domain.AddressItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/list/e;", "Lcom/avito/android/multigeo_flow/full_list/list/c;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<AddressItem, G0> f206916b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super AddressItem, G0> lVar) {
        this.f206916b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AddressItem addressItem = (AddressItem) aVar;
        gVar.setTitle(addressItem.f206874b);
        gVar.G3(new d(this, addressItem));
    }
}
