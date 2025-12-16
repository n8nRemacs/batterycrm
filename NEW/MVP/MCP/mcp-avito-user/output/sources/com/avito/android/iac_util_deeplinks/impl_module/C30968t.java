package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionCheckLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.remote.model.ParametrizedEvent;
import ev.AbstractC40161a;
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

/* compiled from: PermissionCheckLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/t;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/PermissionCheckLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30968t extends AbstractC40161a<PermissionCheckLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f169227f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169228g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169229h;

    /* compiled from: PermissionCheckLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_util_deeplinks.impl_module.t$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public C30968t(@Y61.k com.avito.android.permissions.z zVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f169227f = zVar;
        this.f169228g = aVar;
        this.f169229h = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        int iOrdinal = this.f169227f.b(((PermissionCheckLink) deepLink).f169249b).ordinal();
        if (iOrdinal == 0) {
            k(PermissionCheckLink.ResultValue.f169254b);
        } else if (iOrdinal == 1) {
            k(PermissionCheckLink.ResultValue.f169255c);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            k(PermissionCheckLink.ResultValue.f169256d);
        }
    }

    public final void k(PermissionCheckLink.ResultValue resultValue) {
        PermissionCheckLink permissionCheckLinkC = c();
        if (permissionCheckLinkC == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionCheckLink.ResultValue>> entry : permissionCheckLinkC.f169252e.entrySet()) {
            if (entry.getValue().contains(resultValue)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ParametrizedEvent> entry2 : permissionCheckLinkC.f169253f.entrySet()) {
            if (setKeySet.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            this.f169229h.c(a0.a((ParametrizedEvent) it.next()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionCheckLink.ResultValue>> entry3 : permissionCheckLinkC.f169250c.entrySet()) {
            if (entry3.getValue().contains(resultValue)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Set setKeySet2 = linkedHashMap3.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            DeepLink deepLink = permissionCheckLinkC.f169251d.get((String) it2.next());
            if (deepLink != null) {
                arrayList.add(deepLink);
            }
        }
        PermissionCheckLink.b bVar = new PermissionCheckLink.b(resultValue);
        DeepLink[] deepLinkArr = (DeepLink[]) arrayList.toArray(new DeepLink[0]);
        i(bVar, this.f169228g, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
