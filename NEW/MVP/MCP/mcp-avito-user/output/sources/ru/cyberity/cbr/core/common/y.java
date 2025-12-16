package ru.cyberity.cbr.core.common;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: ExceptionExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"", "", "payload", "Lru/cyberity/cbr/core/data/model/p;", "a", "Lru/cyberity/cbr/core/data/model/CBRException$Api;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class y {
    @Y61.l
    public static final ru.cyberity.cbr.core.data.model.p a(@Y61.k Throwable th2, @Y61.l Object obj) {
        ru.cyberity.cbr.core.data.model.p aVar;
        if (th2 instanceof CBRException.Api) {
            return a((CBRException.Api) th2, obj);
        }
        if (th2 instanceof IOException ? true : th2 instanceof CBRException.Network) {
            aVar = new p.b(th2, obj);
        } else {
            if (th2 instanceof CancellationException) {
                return null;
            }
            aVar = new p.a(th2, obj);
        }
        return aVar;
    }

    private static final ru.cyberity.cbr.core.data.model.p a(CBRException.Api api, Object obj) {
        Integer errorCode = api.getErrorCode();
        return ((errorCode != null && errorCode.intValue() == 1000) || (errorCode != null && errorCode.intValue() == 1001) || ((errorCode != null && errorCode.intValue() == 1002) || ((errorCode != null && errorCode.intValue() == 1003) || ((errorCode != null && errorCode.intValue() == 1004) || ((errorCode != null && errorCode.intValue() == 1005) || ((errorCode != null && errorCode.intValue() == 1006) || ((errorCode != null && errorCode.intValue() == 1007) || ((errorCode != null && errorCode.intValue() == 2000) || ((errorCode != null && errorCode.intValue() == 2001) || ((errorCode != null && errorCode.intValue() == 2002) || ((errorCode != null && errorCode.intValue() == 2003) || ((errorCode != null && errorCode.intValue() == 2004) || (errorCode != null && errorCode.intValue() == 2005))))))))))))) ? new p.c(api.getDescription(), api, obj) : new p.a(api, obj);
    }

    @Y61.l
    public static final String a(@Y61.l Throwable th2, @Y61.k c.C12476c c12476c) {
        return th2 instanceof CBRException.Api ? ((CBRException.Api) th2).getDescription() : th2 instanceof CBRException.Network ? c12476c.a("sns_oops_network_html") : th2 instanceof CBRException.Unknown ? ((CBRException.Unknown) th2).getLocalizedMessage() : "Unknown exception";
    }
}
