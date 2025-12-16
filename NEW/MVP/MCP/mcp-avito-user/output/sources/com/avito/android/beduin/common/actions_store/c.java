package com.avito.android.beduin.common.actions_store;

import Y61.k;
import Y61.l;
import Zi.InterfaceC19564a;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: ScreenActionsStoreImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actions_store/c;", "LZi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC19564a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f100531a = new LinkedHashMap();

    @Inject
    public c() {
    }

    @Override // Zi.InterfaceC19564a
    public final void a(@k String str, @l List<? extends BeduinAction> list) {
        LinkedHashMap linkedHashMap = this.f100531a;
        Collection collection = (List) linkedHashMap.get(str);
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        Collection collection2 = collection;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        linkedHashMap.put(str, C42745f0.h0(list, collection2));
    }

    @Override // Zi.InterfaceC19564a
    @l
    public final List<BeduinAction> b(@k String str) {
        return (List) this.f100531a.remove(str);
    }
}
