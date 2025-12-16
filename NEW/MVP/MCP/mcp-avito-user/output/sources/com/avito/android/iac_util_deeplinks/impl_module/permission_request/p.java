package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.avito.android.permissions.G;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionRequestSystemPopupLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/permission_request/p;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p extends AbstractC40161a<PermissionRequestSystemPopupLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f169189f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169190g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.h f169191h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final G f169192i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169193j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f169194k = C42727D.c(a.f169195l);

    /* compiled from: PermissionRequestSystemPopupLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f169195l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends String> invoke() {
            return C42745f0.U("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        }
    }

    @Inject
    public p(@Y61.k z zVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.h hVar, @Y61.k G g12) {
        this.f169189f = zVar;
        this.f169190g = aVar;
        this.f169191h = hVar;
        this.f169192i = g12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        List<String> list = ((PermissionRequestSystemPopupLink) deepLink).f169308b;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(obj, this.f169189f.b((String) obj));
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() != PermissionState.f215104b) {
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (((Map.Entry) it2.next()).getValue() == PermissionState.f215106d) {
                                k(PermissionRequestSystemPopupLink.b.a.f169314b);
                                return;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((PermissionState) entry.getValue()) == PermissionState.f215105c) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    List listM0 = C42745f0.M0(linkedHashMap2.keySet());
                    V2 v22 = V2.f318762a;
                    v22.c("PermissionRequestSystemPopupLinkHandler", "permissionsState=" + linkedHashMap, null);
                    v22.c("PermissionRequestSystemPopupLinkHandler", "permissionsToRequest=" + listM0, null);
                    a.h hVar = this.f169191h;
                    this.f169193j.b(hVar.W1().N(new q(listM0)).d0(new r(listM0)).t0(new s(this)));
                    String[] strArr = (String[]) listM0.toArray(new String[0]);
                    hVar.o0((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
            }
        }
        k(PermissionRequestSystemPopupLink.b.C5007b.f169315b);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f169193j.e();
    }

    public final void k(PermissionRequestSystemPopupLink.b bVar) {
        DeepLink deepLink;
        PermissionRequestSystemPopupLink permissionRequestSystemPopupLinkC = c();
        if (permissionRequestSystemPopupLinkC == null) {
            return;
        }
        if (L.f(bVar, PermissionRequestSystemPopupLink.b.C5007b.f169315b)) {
            deepLink = permissionRequestSystemPopupLinkC.f169309c;
        } else if (L.f(bVar, PermissionRequestSystemPopupLink.b.a.f169314b)) {
            deepLink = permissionRequestSystemPopupLinkC.f169310d;
        } else if (L.f(bVar, PermissionRequestSystemPopupLink.b.e.f169318b)) {
            deepLink = permissionRequestSystemPopupLinkC.f169311e;
        } else if (L.f(bVar, PermissionRequestSystemPopupLink.b.c.f169316b)) {
            deepLink = permissionRequestSystemPopupLinkC.f169312f;
        } else {
            if (!L.f(bVar, PermissionRequestSystemPopupLink.b.d.f169317b)) {
                throw new NoWhenBranchMatchedException();
            }
            deepLink = permissionRequestSystemPopupLinkC.f169313g;
        }
        DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(deepLink).toArray(new DeepLink[0]);
        i(bVar, this.f169190g, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
