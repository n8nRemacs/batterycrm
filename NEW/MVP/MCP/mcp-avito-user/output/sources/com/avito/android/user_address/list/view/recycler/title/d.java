package com.avito.android.user_address.list.view.recycler.title;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TitleListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/title/d;", "LTV0/d;", "Lcom/avito/android/user_address/list/view/recycler/title/f;", "Lcom/avito/android/user_address/list/view/recycler/title/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.list.e f307485b;

    @Inject
    public d(@k com.avito.android.user_address.list.e eVar) {
        this.f307485b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        String f307377l = ((a) aVar).f307480b;
        if (f307377l == null) {
            f307377l = this.f307485b.getF307377l();
        }
        fVar.setTitle(f307377l);
    }
}
