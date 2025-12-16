package com.avito.android.user_advert.advert.items.address;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/address/g;", "Lcom/avito/android/user_advert/advert/items/address/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309075b;

    @Inject
    public g() {
    }

    @Override // com.avito.android.user_advert.advert.items.address.d
    public final void B2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309075b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.B0(aVar2.f309063c);
        iVar.wG(new e(this, aVar2));
        iVar.Ie(new f(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.address.d
    public final void c0() {
        this.f309075b = null;
    }
}
