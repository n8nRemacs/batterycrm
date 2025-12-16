package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.d3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38743d3 {
    @Y61.k
    public final InterfaceC38913k a(@Y61.k Context context, @Y61.k Executor executor, @Y61.k Executor executor2, @Y61.k com.yandex.metrica.billing_interface.b bVar, @Y61.k InterfaceC38988n interfaceC38988n, @Y61.k InterfaceC38963m interfaceC38963m) {
        int iOrdinal = bVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? new C38818g3() : new com.yandex.metrica.billing.v4.library.p(context, executor, executor2, interfaceC38963m, new C38789f(interfaceC38988n), new C38839h(null, 1)) : new com.yandex.metrica.billing.v3.library.m(context, executor, executor2, new C38714c(interfaceC38988n), new C38739d(), interfaceC38963m);
    }
}
