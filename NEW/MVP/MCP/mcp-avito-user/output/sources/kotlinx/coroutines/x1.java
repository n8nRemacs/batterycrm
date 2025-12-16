package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/y1", "kotlinx/coroutines/z1"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x1 {
    @B0
    @Y61.k
    @InterfaceC43223g0
    public static final C43315z0 a(@Y61.k String str) {
        return new C43315z0(Executors.newScheduledThreadPool(1, new com.avito.android.iac_dialer.impl_module.telecom.b(str, new AtomicInteger())));
    }
}
