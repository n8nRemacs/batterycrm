package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestAppSettingsWithReturnLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
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

/* compiled from: PermissionRequestAppSettingsWithReturnLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/permission_request/d;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC40161a<PermissionRequestAppSettingsWithReturnLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f169165f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f169166g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169167h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f169168i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f169169j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f169170k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169171l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    public LinkedHashMap f169172m;

    @Inject
    public d(@Y61.k z zVar, @Y61.k com.avito.android.permissions.u uVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.app_foreground_provider.util_module.a aVar2) {
        this.f169165f = zVar;
        this.f169166g = uVar;
        this.f169167h = aVar;
        this.f169168i = interfaceC35845m2;
        this.f169169j = interfaceC4053a;
        this.f169170k = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        List<String> list = ((PermissionRequestAppSettingsWithReturnLink) deepLink).f169294b;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list) {
            linkedHashMap.put(obj, this.f169165f.b((String) obj));
        }
        this.f169172m = linkedHashMap;
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() != PermissionState.f215104b) {
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder("permissionsState=");
                    LinkedHashMap linkedHashMap2 = this.f169172m;
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = null;
                    }
                    sb2.append(linkedHashMap2);
                    v22.c("PermissionRequestAppSettingsWithReturnLinkHandler", sb2.toString(), null);
                    PermissionRequestAppSettingsWithReturnLink permissionRequestAppSettingsWithReturnLinkC = c();
                    if (permissionRequestAppSettingsWithReturnLinkC != null) {
                        this.f169171l.b(A1.h(this.f169170k.b().d0(a.f169161b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L).N(b.f169162b).z0(1L), null, new c(permissionRequestAppSettingsWithReturnLinkC, this), 3));
                    }
                    this.f169169j.R(this.f169168i.i(), com.avito.android.deeplink_handler.view.b.f134588l);
                    return;
                }
            }
        }
        k(PermissionRequestAppSettingsWithReturnLink.b.a.f169298b);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f169171l.e();
    }

    public final void k(PermissionRequestAppSettingsWithReturnLink.b bVar) {
        DeepLink deepLink;
        PermissionRequestAppSettingsWithReturnLink permissionRequestAppSettingsWithReturnLinkC = c();
        if (permissionRequestAppSettingsWithReturnLinkC == null) {
            return;
        }
        if (L.f(bVar, PermissionRequestAppSettingsWithReturnLink.b.a.f169298b)) {
            deepLink = permissionRequestAppSettingsWithReturnLinkC.f169295c;
        } else if (L.f(bVar, PermissionRequestAppSettingsWithReturnLink.b.C5005b.f169299b)) {
            deepLink = permissionRequestAppSettingsWithReturnLinkC.f169296d;
        } else {
            if (!L.f(bVar, PermissionRequestAppSettingsWithReturnLink.b.c.f169300b)) {
                throw new NoWhenBranchMatchedException();
            }
            deepLink = permissionRequestAppSettingsWithReturnLinkC.f169297e;
        }
        DeepLink[] deepLinkArr = (DeepLink[]) C42745f0.V(deepLink).toArray(new DeepLink[0]);
        i(bVar, this.f169167h, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
