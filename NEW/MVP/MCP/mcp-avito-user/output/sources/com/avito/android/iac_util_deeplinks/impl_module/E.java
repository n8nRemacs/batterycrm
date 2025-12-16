package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionSystemSettingsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/E;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemSettingsLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E extends AbstractC40161a<PermissionSystemSettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f169106f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f169107g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169108h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169109i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f169110j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f169111k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f169112l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169113m = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PermissionSystemSettingsLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public E(@Y61.k com.avito.android.permissions.z zVar, @Y61.k com.avito.android.permissions.u uVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.app_foreground_provider.util_module.a aVar2) {
        this.f169106f = zVar;
        this.f169107g = uVar;
        this.f169108h = aVar;
        this.f169109i = interfaceC28373a;
        this.f169110j = interfaceC35845m2;
        this.f169111k = interfaceC4053a;
        this.f169112l = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PermissionSystemSettingsLink permissionSystemSettingsLink = (PermissionSystemSettingsLink) deepLink;
        int iOrdinal = this.f169106f.b(permissionSystemSettingsLink.f169273b).ordinal();
        if (iOrdinal == 0) {
            k(PermissionSystemSettingsLink.ResultValue.f169279b);
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            PermissionSystemSettingsLink permissionSystemSettingsLinkC = c();
            if (permissionSystemSettingsLinkC != null) {
                this.f169113m.b(A1.h(this.f169112l.b().d0(F.f169114b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L).N(G.f169115b).z0(1L), null, new H(this, permissionSystemSettingsLinkC), 3));
            }
            ParametrizedEvent parametrizedEvent = permissionSystemSettingsLink.f169278g;
            if (parametrizedEvent != null) {
                this.f169109i.c(a0.a(parametrizedEvent));
            }
            this.f169111k.R(this.f169110j.i(), com.avito.android.deeplink_handler.view.b.f134588l);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f169113m.e();
    }

    public final void k(PermissionSystemSettingsLink.ResultValue resultValue) {
        PermissionSystemSettingsLink permissionSystemSettingsLinkC = c();
        if (permissionSystemSettingsLinkC == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionSystemSettingsLink.ResultValue>> entry : permissionSystemSettingsLinkC.f169276e.entrySet()) {
            if (entry.getValue().contains(resultValue)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ParametrizedEvent> entry2 : permissionSystemSettingsLinkC.f169277f.entrySet()) {
            if (setKeySet.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            this.f169109i.c(a0.a((ParametrizedEvent) it.next()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionSystemSettingsLink.ResultValue>> entry3 : permissionSystemSettingsLinkC.f169274c.entrySet()) {
            if (entry3.getValue().contains(resultValue)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Set setKeySet2 = linkedHashMap3.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            DeepLink deepLink = permissionSystemSettingsLinkC.f169275d.get((String) it2.next());
            if (deepLink != null) {
                arrayList.add(deepLink);
            }
        }
        PermissionSystemSettingsLink.b bVar = new PermissionSystemSettingsLink.b(resultValue);
        DeepLink[] deepLinkArr = (DeepLink[]) arrayList.toArray(new DeepLink[0]);
        i(bVar, this.f169108h, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
