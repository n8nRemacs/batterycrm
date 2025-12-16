package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestCheckLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import ev.AbstractC40161a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionRequestCheckLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/permission_request/j;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends AbstractC40161a<PermissionRequestCheckLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f169181f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169182g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169183h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k z zVar) {
        this.f169181f = zVar;
        this.f169182g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        List<String> list = ((PermissionRequestCheckLink) deepLink).f169301b;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(obj, this.f169181f.b((String) obj));
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() != PermissionState.f215104b) {
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (((Map.Entry) it2.next()).getValue() == PermissionState.f215106d) {
                                k(PermissionRequestCheckLink.b.C5006b.f169306b);
                                return;
                            }
                        }
                    }
                    k(PermissionRequestCheckLink.b.a.f169305b);
                    return;
                }
            }
        }
        k(PermissionRequestCheckLink.b.c.f169307b);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f169183h.e();
    }

    public final void k(PermissionRequestCheckLink.b bVar) {
        DeepLink deepLink;
        PermissionRequestCheckLink permissionRequestCheckLinkC = c();
        if (permissionRequestCheckLinkC == null) {
            return;
        }
        if (L.f(bVar, PermissionRequestCheckLink.b.c.f169307b)) {
            deepLink = permissionRequestCheckLinkC.f169302c;
        } else if (L.f(bVar, PermissionRequestCheckLink.b.a.f169305b)) {
            deepLink = permissionRequestCheckLinkC.f169303d;
        } else {
            if (!L.f(bVar, PermissionRequestCheckLink.b.C5006b.f169306b)) {
                throw new NoWhenBranchMatchedException();
            }
            deepLink = permissionRequestCheckLinkC.f169304e;
        }
        DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(deepLink).toArray(new DeepLink[0]);
        i(bVar, this.f169182g, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
