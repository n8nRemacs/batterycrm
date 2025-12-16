package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.MyAdvertAddressesListActivity;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddressesListIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/b;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f309688a;

    @Inject
    public b(@k Context context) {
        this.f309688a = context;
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.a
    @k
    public final Intent a(@k List<MultiAddressesItem> list) {
        MyAdvertAddressesListActivity.f309677r.getClass();
        Intent intent = new Intent(this.f309688a, (Class<?>) MyAdvertAddressesListActivity.class);
        C35961v3.b(intent, new MyAdvertAddressesListActivity.MyAdvertAddressesListParams(list));
        return intent;
    }
}
