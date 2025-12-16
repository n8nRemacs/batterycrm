package com.avito.android.cart_snippet_actions.utils;

import Y41.l;
import Y41.q;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ItemQuantityChanges.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-snippet-actions_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {
    @k
    public static final z a(@k z zVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @k LinkedHashMap linkedHashMap, @k l lVar, @k q qVar) {
        return C35896f0.e(zVar.o0(linkedHashMap, a.f116279b), b.f116280l).y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).y0(new g(linkedHashMap, new LinkedHashMap(), qVar, lVar, hVar));
    }
}
