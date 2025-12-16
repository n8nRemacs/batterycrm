package com.avito.android.iac_util_deeplinks.impl_module;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
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

/* compiled from: PermissionSystemRequestLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/x;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemRequestLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x extends AbstractC40161a<PermissionSystemRequestLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f169235f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169236g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.h f169237h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169238i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f169239j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PermissionSystemRequestLinkHandler.kt */
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
    public x(@Y61.k com.avito.android.permissions.z zVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.h hVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f169235f = zVar;
        this.f169236g = aVar;
        this.f169237h = hVar;
        this.f169238i = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((PermissionSystemRequestLink) deepLink).f169260b;
        int iOrdinal = this.f169235f.b(str2).ordinal();
        if (iOrdinal == 0) {
            k(PermissionSystemRequestLink.ResultValue.f169265b);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            k(PermissionSystemRequestLink.ResultValue.f169266c);
        } else {
            PermissionSystemRequestLink permissionSystemRequestLinkC = c();
            a.h hVar = this.f169237h;
            if (permissionSystemRequestLinkC != null) {
                this.f169239j.b(hVar.W1().N(new y(permissionSystemRequestLinkC)).d0(new z(permissionSystemRequestLinkC)).t0(new A(this, permissionSystemRequestLinkC)));
            }
            hVar.o0(str2);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f169239j.e();
    }

    public final void k(PermissionSystemRequestLink.ResultValue resultValue) {
        PermissionSystemRequestLink permissionSystemRequestLinkC = c();
        if (permissionSystemRequestLinkC == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionSystemRequestLink.ResultValue>> entry : permissionSystemRequestLinkC.f169263e.entrySet()) {
            if (entry.getValue().contains(resultValue)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ParametrizedEvent> entry2 : permissionSystemRequestLinkC.f169264f.entrySet()) {
            if (setKeySet.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            this.f169238i.c(a0.a((ParametrizedEvent) it.next()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, List<PermissionSystemRequestLink.ResultValue>> entry3 : permissionSystemRequestLinkC.f169261c.entrySet()) {
            if (entry3.getValue().contains(resultValue)) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Set setKeySet2 = linkedHashMap3.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            DeepLink deepLink = permissionSystemRequestLinkC.f169262d.get((String) it2.next());
            if (deepLink != null) {
                arrayList.add(deepLink);
            }
        }
        PermissionSystemRequestLink.b bVar = new PermissionSystemRequestLink.b(resultValue);
        DeepLink[] deepLinkArr = (DeepLink[]) arrayList.toArray(new DeepLink[0]);
        i(bVar, this.f169236g, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
    }
}
