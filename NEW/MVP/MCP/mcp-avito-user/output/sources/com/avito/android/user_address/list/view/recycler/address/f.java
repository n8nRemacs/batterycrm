package com.avito.android.user_address.list.view.recycler.address;

import Y41.l;
import Y61.k;
import com.avito.android.user_address.list.view.recycler.address.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddressListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/address/f;", "LTV0/d;", "Lcom/avito/android/user_address/list/view/recycler/address/h;", "Lcom/avito/android/user_address/list/view/recycler/address/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<XG0.a, G0> f307472b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super XG0.a, G0> lVar) {
        this.f307472b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        a.C9447a c9447a = aVar2.f307460f;
        String str = c9447a.f307461a;
        d dVar = new d(this, aVar2);
        e eVar2 = new e(this, aVar2);
        hVar.cU(aVar2.f307459e, aVar2.f307458d, str, c9447a.f307462b, c9447a.f307463c, dVar, eVar2);
    }
}
