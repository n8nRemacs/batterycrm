package UL;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mM.InterfaceC43981a;

/* compiled from: IacDisablerImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUL/a;", "LYL/a;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements YL.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43981a f16348a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f16349b;

    @Inject
    public a(@k InterfaceC43981a interfaceC43981a, @k InterfaceC28373a interfaceC28373a) {
        this.f16348a = interfaceC43981a;
        this.f16349b = interfaceC28373a;
    }

    @Override // YL.a
    public final boolean a() {
        Map<String, Integer> mapA = this.f16348a.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            if (entry.getValue().intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("IacDisabler", "iacScenario field will be overridden by null, cause: " + linkedHashMap, null);
        int size = linkedHashMap.size();
        InterfaceC28373a interfaceC28373a = this.f16349b;
        if (size > 1) {
            interfaceC28373a.c(new y.a("iac.registered_crash.disable_iac_outgoing_by.multiple", 0L, 2, null));
        } else {
            Map.Entry entry2 = (Map.Entry) C42745f0.F(linkedHashMap.entrySet());
            StringBuilder sb2 = new StringBuilder("iac.registered_crash.disable_iac_outgoing_by.");
            sb2.append(entry2 != null ? (String) entry2.getKey() : null);
            sb2.append(".count_");
            sb2.append(entry2 != null ? (Integer) entry2.getValue() : null);
            interfaceC28373a.c(new y.a(sb2.toString(), 0L, 2, null));
        }
        return true;
    }
}
