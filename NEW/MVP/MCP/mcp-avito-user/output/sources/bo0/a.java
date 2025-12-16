package BO0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.b;
import com.avito.android.wallet.history.analytics.WalletHistorySensitiveDataEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryEventUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-history_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    public static void a(InterfaceC28373a interfaceC28373a, CO0.a aVar) {
        if ((aVar != null ? aVar.getId() : null) == null || aVar.getVersion() == null) {
            return;
        }
        Map<String, Object> mapC = aVar.c();
        if (mapC == null) {
            mapC = P0.c();
        }
        LinkedHashMap linkedHashMapK = P0.k(mapC, P0.c());
        interfaceC28373a.c(linkedHashMapK.isEmpty() ? new b(aVar.getId().intValue(), aVar.getVersion().intValue()) : L.f(aVar.getHasSensitiveData(), Boolean.TRUE) ? new WalletHistorySensitiveDataEvent(aVar.getId().intValue(), aVar.getVersion().intValue(), linkedHashMapK) : new ParametrizedClickStreamEvent(aVar.getId().intValue(), aVar.getVersion().intValue(), linkedHashMapK, null, 8, null));
    }
}
