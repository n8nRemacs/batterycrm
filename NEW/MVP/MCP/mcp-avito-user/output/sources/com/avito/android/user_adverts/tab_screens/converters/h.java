package com.avito.android.user_adverts.tab_screens.converters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.model.UserAdvertsGroupState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import com.avito.android.user_adverts.tab_screens.converters.g;
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
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsGroupsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/h;", "Lcom/avito/android/user_adverts/tab_screens/converters/g;", "<init>", "()V", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* compiled from: UserAdvertsGroupsConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/h$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f315791a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Set<String> f315792b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Set<String> f315793c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<String, DeepLink> f315794d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public a(List list, Set set, Set set2, Map map, int i12, C42822w c42822w) {
            list = (i12 & 1) != 0 ? new ArrayList() : list;
            set = (i12 & 2) != 0 ? new LinkedHashSet() : set;
            set2 = (i12 & 4) != 0 ? new LinkedHashSet() : set2;
            map = (i12 & 8) != 0 ? new LinkedHashMap() : map;
            this.f315791a = list;
            this.f315792b = set;
            this.f315793c = set2;
            this.f315794d = map;
        }
    }

    /* compiled from: UserAdvertsGroupsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[UserAdvertsGroupSelectedState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = UserAdvertsGroupSelectedState.f312187b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UserAdvertsGroupSelectedState userAdvertsGroupSelectedState2 = UserAdvertsGroupSelectedState.f312187b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public h() {
    }

    @Override // com.avito.android.user_adverts.tab_screens.converters.g
    @Y61.k
    public final UserAdvertsGroupData a(@Y61.k List<? extends UserAdvertsBaseItemDomain> list) {
        DeepLink deepLink;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UserAdvertsBaseItemDomain userAdvertsBaseItemDomain : list) {
            UserAdvertItemDomain userAdvertItemDomain = userAdvertsBaseItemDomain instanceof UserAdvertItemDomain ? (UserAdvertItemDomain) userAdvertsBaseItemDomain : null;
            if (userAdvertItemDomain != null) {
                UserAdvertsShortcutGroup.f312197b2.getClass();
                UserAdvertsShortcutGroup userAdvertsShortcutGroupA = UserAdvertsShortcutGroup.a.a(userAdvertItemDomain.f315037h);
                a aVar = (a) linkedHashMap.get(userAdvertsShortcutGroupA);
                if (aVar == null) {
                    aVar = new a(null, null, null, null, 15, null);
                }
                List<String> list2 = userAdvertItemDomain.f315015A;
                String str = userAdvertItemDomain.f315030P;
                if (list2 != null && !list2.isEmpty()) {
                    aVar.f315791a.add(str);
                    aVar.f315793c.addAll(list2);
                }
                UserAdvertItemDomain.LinkedAdvertisementsInfo linkedAdvertisementsInfo = userAdvertItemDomain.f315024J;
                if (linkedAdvertisementsInfo != null && (deepLink = linkedAdvertisementsInfo.f315085f) != null) {
                    aVar.f315794d.put(str, deepLink);
                }
                linkedHashMap.put(userAdvertsShortcutGroupA, aVar);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            a aVar2 = (a) entry.getValue();
            aVar2.getClass();
            linkedHashMap2.put(key, new UserAdvertsGroupState(C42745f0.P0(aVar2.f315791a), aVar2.f315792b, aVar2.f315793c, aVar2.f315794d));
        }
        return new UserAdvertsGroupData(linkedHashMap2);
    }

    @Override // com.avito.android.user_adverts.tab_screens.converters.g
    @Y61.k
    public final UserAdvertsGroupData b(@Y61.k UserAdvertsGroupData userAdvertsGroupData, @Y61.k g.a aVar) {
        UserAdvertsGroupData userAdvertsGroupData2;
        boolean z12 = aVar instanceof g.a.C9789a;
        Map<UserAdvertsShortcutGroup, UserAdvertsGroupState> map = userAdvertsGroupData.f312182b;
        if (z12) {
            g.a.C9789a c9789a = (g.a.C9789a) aVar;
            UserAdvertsShortcutGroup.f312197b2.getClass();
            UserAdvertsShortcutGroup userAdvertsShortcutGroupA = UserAdvertsShortcutGroup.a.a(c9789a.f315787b);
            UserAdvertsGroupState userAdvertsGroupState = map.get(userAdvertsShortcutGroupA);
            if (userAdvertsGroupState == null) {
                return userAdvertsGroupData;
            }
            Set<String> set = userAdvertsGroupState.f312192b;
            String str = c9789a.f315786a;
            if (!set.contains(str)) {
                return userAdvertsGroupData;
            }
            boolean z13 = c9789a.f315788c;
            Set<String> set2 = userAdvertsGroupState.f312193c;
            userAdvertsGroupData2 = new UserAdvertsGroupData(P0.l(map, new Q(userAdvertsShortcutGroupA, UserAdvertsGroupState.a(userAdvertsGroupState, z13 ? b1.i(set2, str) : b1.e(set2, str)))));
        } else {
            if (!(aVar instanceof g.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            g.a.b bVar = (g.a.b) aVar;
            UserAdvertsShortcutGroup userAdvertsShortcutGroup = bVar.f315789a;
            UserAdvertsGroupState userAdvertsGroupState2 = map.get(userAdvertsShortcutGroup);
            if (userAdvertsGroupState2 == null) {
                return userAdvertsGroupData;
            }
            int iOrdinal = bVar.f315790b.ordinal();
            if (iOrdinal == 0) {
                userAdvertsGroupData2 = new UserAdvertsGroupData(P0.l(map, new Q(userAdvertsShortcutGroup, UserAdvertsGroupState.a(userAdvertsGroupState2, b1.h(userAdvertsGroupState2.f312193c, userAdvertsGroupState2.f312192b)))));
            } else {
                if (iOrdinal == 1) {
                    return userAdvertsGroupData;
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                userAdvertsGroupData2 = new UserAdvertsGroupData(P0.l(map, new Q(userAdvertsShortcutGroup, UserAdvertsGroupState.a(userAdvertsGroupState2, B0.f406639b))));
            }
        }
        return userAdvertsGroupData2;
    }

    @Override // com.avito.android.user_adverts.tab_screens.converters.g
    @Y61.k
    public final UserAdvertsGroupData c(@Y61.k UserAdvertsGroupData userAdvertsGroupData, @Y61.k UserAdvertsGroupData userAdvertsGroupData2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Map<UserAdvertsShortcutGroup, UserAdvertsGroupState> map = userAdvertsGroupData.f312182b;
        Iterator<UserAdvertsGroupState> it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().f312193c);
        }
        Map<UserAdvertsShortcutGroup, UserAdvertsGroupState> map2 = userAdvertsGroupData2.f312182b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
        Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            UserAdvertsShortcutGroup userAdvertsShortcutGroup = (UserAdvertsShortcutGroup) entry.getKey();
            UserAdvertsGroupState userAdvertsGroupState = (UserAdvertsGroupState) entry.getValue();
            LinkedHashSet linkedHashSetO0 = C42745f0.O0(userAdvertsGroupState.f312193c);
            UserAdvertsGroupState userAdvertsGroupState2 = map.get(userAdvertsShortcutGroup);
            UserAdvertsGroupSelectedState userAdvertsGroupSelectedState = userAdvertsGroupState2 != null ? userAdvertsGroupState2.f312196f : null;
            UserAdvertsGroupSelectedState userAdvertsGroupSelectedState2 = UserAdvertsGroupSelectedState.f312187b;
            Set<String> set = userAdvertsGroupState.f312192b;
            if (userAdvertsGroupSelectedState == userAdvertsGroupSelectedState2) {
                linkedHashSetO0.addAll(set);
            } else {
                for (String str : linkedHashSet) {
                    if (set.contains(str)) {
                        linkedHashSetO0.add(str);
                    }
                }
            }
            linkedHashMap.put(key, UserAdvertsGroupState.a(userAdvertsGroupState, linkedHashSetO0));
        }
        return new UserAdvertsGroupData(linkedHashMap);
    }
}
