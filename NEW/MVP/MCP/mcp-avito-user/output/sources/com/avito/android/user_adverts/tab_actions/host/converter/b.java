package com.avito.android.user_adverts.tab_actions.host.converter;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_adverts.model.UserAdvertActionPendingResult;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import hm0.C40962b;
import hm0.InterfaceC40961a;
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
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import rI0.C47552a;

/* compiled from: UserAdvertActionResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/converter/b;", "Lcom/avito/android/user_adverts/tab_actions/host/converter/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static UserAdvertActionPendingResult.Block b(C40962b c40962b) {
        ArrayList arrayList;
        String title = c40962b.getTitle();
        AttributedText description = c40962b.getDescription();
        List<C40962b.a> listA = c40962b.a();
        if (listA != null) {
            List<C40962b.a> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C40962b.a aVar : list) {
                arrayList.add(new UserAdvertActionPendingResult.Advert(String.valueOf(aVar.getId()), aVar.getShortcut(), aVar.getTitle(), aVar.getPrice(), aVar.getFailureReason(), aVar.getImages()));
            }
        } else {
            arrayList = null;
        }
        return new UserAdvertActionPendingResult.Block(description, title, arrayList);
    }

    public static Map c(Map map, Set set) {
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            UserAdvertsGroupInfo userAdvertsGroupInfo = (UserAdvertsGroupInfo) entry.getValue();
            Set<String> set3 = userAdvertsGroupInfo.f312184b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str : set3) {
                if (!set.contains(str)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            linkedHashMap.put(key, new UserAdvertsGroupInfo(linkedHashSet, userAdvertsGroupInfo.f312185c, userAdvertsGroupInfo.f312186d));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((UserAdvertsGroupInfo) entry2.getValue()).f312184b.isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // com.avito.android.user_adverts.tab_actions.host.converter.a
    @k
    public final UserAdvertActionPendingResult a(@k C47552a c47552a, @k InterfaceC40961a interfaceC40961a) {
        boolean z12 = interfaceC40961a instanceof InterfaceC40961a.C11277a;
        LinkedHashSet linkedHashSet = null;
        Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map = c47552a.f429724a;
        String str = c47552a.f429725b;
        if (z12) {
            InterfaceC40961a.C11277a c11277a = (InterfaceC40961a.C11277a) interfaceC40961a;
            String message = c11277a.getMessage();
            Set<Long> setA = c11277a.a();
            if (setA != null) {
                linkedHashSet = new LinkedHashSet();
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
                }
            }
            return new UserAdvertActionPendingResult.Failure(str, message, c(map, linkedHashSet));
        }
        if (interfaceC40961a instanceof InterfaceC40961a.b) {
            return new UserAdvertActionPendingResult.Ok(str, ((InterfaceC40961a.b) interfaceC40961a).getMessage());
        }
        if (!(interfaceC40961a instanceof InterfaceC40961a.c)) {
            if (interfaceC40961a instanceof InterfaceC40961a.d) {
                return new UserAdvertActionPendingResult.Redirect(str, ((InterfaceC40961a.d) interfaceC40961a).getUri());
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40961a.c cVar = (InterfaceC40961a.c) interfaceC40961a;
        C40962b successBlock = cVar.getSuccessBlock();
        UserAdvertActionPendingResult.Block blockB = successBlock != null ? b(successBlock) : null;
        C40962b failureBlock = cVar.getFailureBlock();
        UserAdvertActionPendingResult.Block blockB2 = failureBlock != null ? b(failureBlock) : null;
        return new UserAdvertActionPendingResult.Info(str, c(map, blockB2 != null ? blockB2.f312160e : 0), blockB, blockB2);
    }
}
