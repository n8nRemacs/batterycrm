package com.avito.android.user_address.list.mvi;

import XG0.d;
import com.avito.android.arch.mvi.u;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import com.avito.android.util.NetworkException;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressListMviReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/list/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "LXG0/d;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements u<UserAddressListMviInternalAction, XG0.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final XG0.d a(UserAddressListMviInternalAction userAddressListMviInternalAction, XG0.d dVar) {
        UserAddressListMviInternalAction userAddressListMviInternalAction2 = userAddressListMviInternalAction;
        XG0.d dVar2 = dVar;
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.Load) {
            return d.e.f18808d;
        }
        if (!(userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.RenderData)) {
            return userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.Error ? ((UserAddressListMviInternalAction.Error) userAddressListMviInternalAction2).f307404b instanceof NetworkException ? d.f.f18809d : d.a.f18802d : dVar2;
        }
        UserAddressListMviInternalAction.RenderData renderData = (UserAddressListMviInternalAction.RenderData) userAddressListMviInternalAction2;
        ArrayList arrayList = renderData.f307409b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof com.avito.android.user_address.list.view.recycler.address.a) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return d.C1326d.f18807d;
        }
        Boolean bool = renderData.f307410c;
        return new d.c(renderData.f307411d, arrayList, bool != null ? bool.booleanValue() : false, arrayList.size() <= 5);
    }
}
