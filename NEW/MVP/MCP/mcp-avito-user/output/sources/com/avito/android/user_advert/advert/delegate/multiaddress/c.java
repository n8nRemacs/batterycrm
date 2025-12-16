package com.avito.android.user_advert.advert.delegate.multiaddress;

import Y61.k;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.user_advert.advert.delegate.multiaddress.b;
import fH0.AbstractC40291a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiAddressPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multiaddress/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/multiaddress/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.user_advert.advert.delegate.multiaddress.a
    public final void A(@k com.avito.android.user_advert.advert.items.multiaddresses.a aVar) {
        this.f395801b.accept(new b.C9474b(aVar.f309675g));
    }

    @Override // com.avito.android.user_advert.advert.delegate.multiaddress.a
    public final void V1(@k List<MultiAddressesItem> list) {
        this.f395801b.accept(new b.a(list));
    }
}
