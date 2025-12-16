package com.avito.android.user_adverts.tab_actions.host.converter;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsGroupState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertSelectedActionsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/converter/e;", "Lcom/avito/android/user_adverts/tab_actions/host/converter/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f314228a;

    /* compiled from: UserAdvertSelectedActionsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvailableActionsDomain.ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvailableActionsDomain.ActionType actionType = AvailableActionsDomain.ActionType.f314265b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public e(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f314228a = interfaceC35863o4.a();
    }

    public static UserAdvertActionAttentionInfo c(UserAdvertActionsInfoDomain.a aVar, String str, int i12) {
        UserAdvertActionsInfoDomain.DialogInfo f314996b = aVar.getF314996b();
        if (f314996b == null) {
            return null;
        }
        return new UserAdvertActionAttentionInfo((AttributedText) d(f314996b.f314999b, str, i12), f314996b.f315003f, f314996b.f315000c, f314996b.f315001d, f314996b.f315002e);
    }

    public static Object d(UserAdvertActionsInfoDomain.c cVar, String str, int i12) {
        UserAdvertActionsInfoDomain.c.a aVar;
        Object f315009b;
        Object f315010c;
        Object next;
        List listC = cVar.c();
        if (listC != null) {
            Iterator it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((UserAdvertActionsInfoDomain.c.a) next).c().contains(str)) {
                    break;
                }
            }
            aVar = (UserAdvertActionsInfoDomain.c.a) next;
        } else {
            aVar = null;
        }
        if (i12 <= 1) {
            return (aVar == null || (f315009b = aVar.getF315009b()) == null) ? cVar.getF315006b() : f315009b;
        }
        if (aVar != null && (f315010c = aVar.getF315010c()) != null) {
            return f315010c;
        }
        Object f315009b2 = aVar != null ? aVar.getF315009b() : null;
        if (f315009b2 != null) {
            return f315009b2;
        }
        Object f315007c = cVar.getF315007c();
        return f315007c == null ? cVar.getF315006b() : f315007c;
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.converter.d
    @k
    public final ArrayList a(@k UserAdvertsGroupData userAdvertsGroupData, @k String str, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain, @l UserAdvertActionType userAdvertActionType) {
        ArrayList arrayList;
        int i12;
        com.avito.android.user_adverts.tab_actions.host.items.a aVar;
        UserAdvertActionsInfoDomain.Config config;
        UserAdvertsGroupInfo userAdvertsGroupInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        int size = 0;
        for (Map.Entry<UserAdvertsShortcutGroup, UserAdvertsGroupState> entry : userAdvertsGroupData.f312182b.entrySet()) {
            UserAdvertsShortcutGroup key = entry.getKey();
            UserAdvertsGroupState value = entry.getValue();
            if (!value.f312193c.isEmpty()) {
                Map<String, DeepLink> map = value.f312195e;
                Set<String> set = value.f312193c;
                Set<String> set2 = value.f312194d;
                linkedHashMap.put(key, new UserAdvertsGroupInfo(set, set2, map));
                linkedHashSet.addAll(set2);
                size += set.size();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : linkedHashSet) {
            UserAdvertActionType.Multiple multiple = UserAdvertActionType.Multiple.f312173c;
            if (L.f(str2, ServiceTypeKt.SERVICE_ACTIVATION)) {
                UserAdvertActionsInfoDomain.Config config2 = userAdvertActionsInfoDomain.f314986d;
                arrayList = arrayList2;
                i12 = size;
                aVar = new com.avito.android.user_adverts.tab_actions.host.items.a((String) d(config2.getF314997c(), str, size), linkedHashMap, c(config2, str, size), str, multiple, multiple == userAdvertActionType, null, null, 192, null);
            } else {
                arrayList = arrayList2;
                i12 = size;
                UserAdvertActionType.Multiple multiple2 = UserAdvertActionType.Multiple.f312175e;
                if (L.f(str2, "close")) {
                    UserAdvertActionsInfoDomain.Config config3 = userAdvertActionsInfoDomain.f314987e;
                    aVar = new com.avito.android.user_adverts.tab_actions.host.items.a((String) d(config3.getF314997c(), str, i12), linkedHashMap, c(config3, str, i12), str, multiple2, multiple2 == userAdvertActionType, null, null, 192, null);
                } else {
                    UserAdvertActionType.Multiple multiple3 = UserAdvertActionType.Multiple.f312174d;
                    if (L.f(str2, "delete")) {
                        UserAdvertActionsInfoDomain.Config config4 = userAdvertActionsInfoDomain.f314985c;
                        aVar = new com.avito.android.user_adverts.tab_actions.host.items.a((String) d(config4.getF314997c(), str, i12), linkedHashMap, c(config4, str, i12), str, multiple3, multiple3 == userAdvertActionType, null, null, 192, null);
                    } else {
                        UserAdvertActionType.Multiple multiple4 = UserAdvertActionType.Multiple.f312176f;
                        if (L.f(str2, "restore")) {
                            UserAdvertActionsInfoDomain.Config config5 = userAdvertActionsInfoDomain.f314988f;
                            aVar = new com.avito.android.user_adverts.tab_actions.host.items.a((String) d(config5.getF314997c(), str, i12), linkedHashMap, c(config5, str, i12), str, multiple4, multiple4 == userAdvertActionType, null, null, 192, null);
                        } else {
                            UserAdvertActionType.Multiple multiple5 = UserAdvertActionType.Multiple.f312177g;
                            if (L.f(str2, "copy")) {
                                if (i12 <= 1 && (config = userAdvertActionsInfoDomain.f314989g) != null && (userAdvertsGroupInfo = (UserAdvertsGroupInfo) C42745f0.F(linkedHashMap.values())) != null) {
                                    String str3 = (String) C42745f0.F(userAdvertsGroupInfo.f312184b);
                                    DeepLink deepLink = str3 != null ? userAdvertsGroupInfo.f312186d.get(str3) : null;
                                    if (deepLink != null) {
                                        aVar = new com.avito.android.user_adverts.tab_actions.host.items.a((String) d(config.getF314997c(), str, i12), linkedHashMap, c(config, str, i12), str, multiple5, multiple5 == userAdvertActionType, deepLink, config.f314998d);
                                    }
                                }
                                size = i12;
                                arrayList2 = arrayList;
                            } else {
                                aVar = null;
                            }
                        }
                    }
                }
            }
            if (aVar != null) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(aVar);
                arrayList2 = arrayList3;
                size = i12;
            } else {
                size = i12;
                arrayList2 = arrayList;
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.converter.d
    @k
    public final ArrayList b(@l UserAdvertActionType userAdvertActionType, @k AvailableActionsDomain availableActionsDomain, @k String str) {
        UserAdvertSingleActionItem.Type type;
        ArrayList<AvailableActionsDomain.ActionItem> arrayList = availableActionsDomain.f314259b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (AvailableActionsDomain.ActionItem actionItem : arrayList) {
            UserAdvertActionType.Single single = new UserAdvertActionType.Single(actionItem.f314261c);
            String str2 = this.f314228a + actionItem.f314261c;
            int iOrdinal = actionItem.f314263e.ordinal();
            if (iOrdinal == 0) {
                type = UserAdvertSingleActionItem.Type.f314311c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                type = UserAdvertSingleActionItem.Type.f314310b;
            }
            UserAdvertSingleActionItem.Type type2 = type;
            arrayList2.add(new UserAdvertSingleActionItem(str2, str, actionItem.f314260b, actionItem.f314261c, actionItem.f314262d, type2, actionItem.f314264f, single, single.equals(userAdvertActionType)));
        }
        return arrayList2;
    }
}
