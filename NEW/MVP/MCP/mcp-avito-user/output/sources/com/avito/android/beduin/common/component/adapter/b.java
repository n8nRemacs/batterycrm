package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import Y61.l;
import bj.InterfaceC25659b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinAdapterFactoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/b;", "Lbj/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC25659b {
    @Inject
    public b() {
    }

    @Override // sj.InterfaceC48372a
    public final com.avito.android.beduin_shared.common.component.adapter.c a(Integer num) {
        com.avito.android.beduin_shared.common.component.adapter.c cVar = new com.avito.android.beduin_shared.common.component.adapter.c();
        cVar.f105273e = num;
        return cVar;
    }

    @Override // bj.InterfaceC25659b
    @k
    public final a b(@l Integer num) {
        return new a(num);
    }

    @Override // sj.InterfaceC48372a
    public final com.avito.android.beduin_shared.common.component.adapter.e c() {
        com.avito.android.beduin_shared.common.component.adapter.e eVar = new com.avito.android.beduin_shared.common.component.adapter.e();
        eVar.f105276e = 0;
        return eVar;
    }
}
