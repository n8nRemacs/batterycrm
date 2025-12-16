package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.j;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MyAdvertAddressesListEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/d;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/j;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/k;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements t<j, k> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final k b(j jVar) {
        j jVar2 = jVar;
        if (jVar2 instanceof j.a) {
            return new k.a(((j.a) jVar2).f309721a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
