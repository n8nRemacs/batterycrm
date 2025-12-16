package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestAppSettingsWithReturnLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionRequestAppSettingsWithReturnLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PermissionRequestAppSettingsWithReturnLink f169163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f169164m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PermissionRequestAppSettingsWithReturnLink permissionRequestAppSettingsWithReturnLink, d dVar) {
        super(1);
        this.f169163l = permissionRequestAppSettingsWithReturnLink;
        this.f169164m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        d dVar;
        List<String> list = this.f169163l.f169294b;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dVar = this.f169164m;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            linkedHashMap.put(next, Boolean.valueOf(dVar.f169166g.b((String) next)));
        }
        V2.f318762a.c("PermissionRequestAppSettingsWithReturnLinkHandler", "newState=" + linkedHashMap, null);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                LinkedHashMap linkedHashMap2 = dVar.f169172m;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = null;
                }
                Object obj = linkedHashMap2.get(str);
                PermissionState permissionState = PermissionState.f215104b;
                if (obj != permissionState) {
                    dVar.f169165f.c(permissionState, str);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            dVar.k(PermissionRequestAppSettingsWithReturnLink.b.C5005b.f169299b);
        } else {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                    dVar.k(PermissionRequestAppSettingsWithReturnLink.b.c.f169300b);
                    break;
                }
            }
            dVar.k(PermissionRequestAppSettingsWithReturnLink.b.C5005b.f169299b);
        }
        return G0.f406611a;
    }
}
