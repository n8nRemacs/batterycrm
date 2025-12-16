package com.avito.android.user_address.list.mvi;

import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAddressListMviBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements com.avito.android.arch.mvi.b<UserAddressListMviInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.list.domain.c f307420a;

    @Inject
    public i(@Y61.k com.avito.android.user_address.list.domain.c cVar) {
        this.f307420a = cVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UserAddressListMviInternalAction> a() {
        return this.f307420a.a(true);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
