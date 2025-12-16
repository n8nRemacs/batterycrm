package ru.cyberity.cbr.core.common;

import kotlin.Metadata;
import ru.cyberity.log.logger.Logger;

/* compiled from: DocumentRotationUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/common/l;", "", "Lru/cyberity/cbr/core/common/k;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class l {
    @Y61.k
    public final k a() {
        try {
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Using MLKit Face rotation detector", null, 4, null);
            return new m0();
        } catch (Exception unused) {
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Disable rotation detector", null, 4, null);
            return new x();
        }
    }
}
