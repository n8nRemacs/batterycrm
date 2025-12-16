package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.avito.android.permissions.G;
import com.avito.android.permissions.PermissionState;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import rv.C47920c;

/* compiled from: PermissionRequestSystemPopupLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "response", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f169198b;

    public s(p pVar) {
        this.f169198b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        p pVar;
        PermissionRequestSystemPopupLink.b bVar;
        PermissionState permissionState;
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            pVar = this.f169198b;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            C47920c c47920c = (C47920c) entry.getValue();
            if (!((List) pVar.f169194k.getValue()).contains(str)) {
                permissionState = c47920c.f437161a ? PermissionState.f215104b : c47920c.f437162b ? PermissionState.f215105c : PermissionState.f215106d;
            } else if (c47920c.f437161a) {
                permissionState = PermissionState.f215104b;
            } else {
                G g12 = pVar.f169192i;
                boolean zH2 = g12.h(str);
                boolean z12 = c47920c.f437162b;
                if (!zH2 || z12) {
                    g12.l(str, z12);
                    permissionState = PermissionState.f215105c;
                } else {
                    permissionState = PermissionState.f215106d;
                }
            }
            linkedHashMap.put(key, permissionState);
        }
        V2.f318762a.c("PermissionRequestSystemPopupLinkHandler", "newPermissionsState=" + linkedHashMap, null);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            pVar.f169189f.c((PermissionState) entry2.getValue(), (String) entry2.getKey());
        }
        if (linkedHashMap.isEmpty()) {
            bVar = PermissionRequestSystemPopupLink.b.e.f169318b;
        } else {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((Map.Entry) it2.next()).getValue() != PermissionState.f215104b) {
                    if (linkedHashMap.isEmpty()) {
                        bVar = PermissionRequestSystemPopupLink.b.c.f169316b;
                    } else {
                        Iterator it3 = linkedHashMap.entrySet().iterator();
                        while (it3.hasNext()) {
                            if (((Map.Entry) it3.next()).getValue() == PermissionState.f215106d) {
                                bVar = PermissionRequestSystemPopupLink.b.d.f169317b;
                                break;
                            }
                        }
                        bVar = PermissionRequestSystemPopupLink.b.c.f169316b;
                    }
                }
            }
            bVar = PermissionRequestSystemPopupLink.b.e.f169318b;
        }
        pVar.k(bVar);
    }
}
