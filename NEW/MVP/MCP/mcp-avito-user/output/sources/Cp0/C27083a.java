package cP0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.b;
import com.avito.android.wallet.pin.impl.analytics.WalletPinSensitiveDataEvent;
import dP0.C39614a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinEventUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-pin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27083a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.builders.d] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Map] */
    public static final void a(@k InterfaceC28373a interfaceC28373a, @l C39614a c39614a, @l d dVar) {
        if ((c39614a != null ? c39614a.getId() : null) == null || c39614a.getVersion() == null) {
            return;
        }
        Map<String, Object> mapC = c39614a.c();
        if (mapC == null) {
            mapC = P0.c();
        }
        if (dVar == 0) {
            dVar = P0.c();
        }
        LinkedHashMap linkedHashMapK = P0.k(mapC, dVar);
        interfaceC28373a.c(linkedHashMapK.isEmpty() ? new b(c39614a.getId().intValue(), c39614a.getVersion().intValue()) : L.f(c39614a.getHasSensitiveData(), Boolean.TRUE) ? new WalletPinSensitiveDataEvent(c39614a.getId().intValue(), c39614a.getVersion().intValue(), linkedHashMapK) : new ParametrizedClickStreamEvent(c39614a.getId().intValue(), c39614a.getVersion().intValue(), linkedHashMapK, null, 8, null));
    }
}
