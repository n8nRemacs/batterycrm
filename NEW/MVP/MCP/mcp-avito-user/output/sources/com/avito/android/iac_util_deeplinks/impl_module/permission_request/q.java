package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.util.V2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionRequestSystemPopupLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "response", "", "test", "(Ljava/util/Map;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class q<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<String> f169196b;

    public q(List<String> list) {
        this.f169196b = list;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        Map map = (Map) obj;
        V2.f318762a.c("PermissionRequestSystemPopupLinkHandler", "subscribeToPermissionManager: " + map, null);
        List<String> list = this.f169196b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!map.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
