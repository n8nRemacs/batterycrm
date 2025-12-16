package com.vk.id.internal.ipc;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.silentauth.SilentTokenProviderInfo;
import com.vk.silentauth.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VkSilentInfoItemsGrouper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentInfoItemsGrouper;", "", "<init>", "()V", "", "Lcom/vk/silentauth/b;", "groupByUserHash", "(Ljava/util/List;)Ljava/util/List;", "groupByWeightAndUserHash", "SilentAuthInfoPriorityComparator", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VkSilentInfoItemsGrouper {

    @k
    public static final VkSilentInfoItemsGrouper INSTANCE = new VkSilentInfoItemsGrouper();

    /* compiled from: VkSilentInfoItemsGrouper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentInfoItemsGrouper$SilentAuthInfoPriorityComparator;", "Ljava/util/Comparator;", "Lcom/vk/silentauth/b;", "Lkotlin/Comparator;", "<init>", "()V", "first", "second", "", "compare", "(Lcom/vk/silentauth/b;Lcom/vk/silentauth/b;)I", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SilentAuthInfoPriorityComparator implements Comparator<b> {
        @Override // java.util.Comparator
        public int compare(@k b first, @k b second) {
            int iG2 = L.g(first.f367212b, second.f367212b);
            if (iG2 != 0) {
                return iG2;
            }
            int iG3 = L.g(first.f367211a.f367198n, second.f367211a.f367198n);
            return iG3 != 0 ? iG3 : Boolean.compare(!L.f(r3.f367199o, ""), !L.f(r4.f367199o, ""));
        }
    }

    private VkSilentInfoItemsGrouper() {
    }

    private final List<b> groupByUserHash(List<b> list) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((b) obj).f367211a.f367199o;
            Object objR = linkedHashMap.get(str);
            if (objR == null) {
                objR = e.r(linkedHashMap, str);
            }
            ((List) objR).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        List list2 = (List) linkedHashMap2.remove("");
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            List<b> list3 = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i12 = ((b) next).f367212b;
                    do {
                        Object next3 = it2.next();
                        int i13 = ((b) next3).f367212b;
                        if (i12 < i13) {
                            next = next3;
                            i12 = i13;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            b bVar = (b) next;
            Integer numValueOf = bVar != null ? Integer.valueOf(bVar.f367212b) : null;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (b bVar2 : list3) {
                SilentTokenProviderInfo.b bVar3 = SilentTokenProviderInfo.f367203h;
                SilentAuthInfo silentAuthInfo = bVar2.f367211a;
                bVar3.getClass();
                arrayList2.add(new SilentTokenProviderInfo(silentAuthInfo.f367186b, silentAuthInfo.f367187c, silentAuthInfo.f367188d, silentAuthInfo.f367189e, silentAuthInfo.f367198n, silentAuthInfo.f367200p));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                int i14 = ((b) obj2).f367212b;
                if (numValueOf != null && i14 == numValueOf.intValue()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    int i15 = ((b) next2).f367211a.f367198n;
                    do {
                        Object next4 = it3.next();
                        int i16 = ((b) next4).f367211a.f367198n;
                        if (i15 < i16) {
                            next2 = next4;
                            i15 = i16;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next2 = null;
            }
            b bVar4 = (b) next2;
            if (bVar4 != null) {
                arrayList.add(new b(SilentAuthInfo.a(bVar4.f367211a, null, arrayList2, 98303), bVar4.f367212b));
            }
        }
        return arrayList;
    }

    @k
    public final List<b> groupByWeightAndUserHash(@k List<b> list) {
        List listQ0 = C42745f0.q0(C42745f0.B0(groupByUserHash(list), new SilentAuthInfoPriorityComparator()));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            SilentAuthInfo silentAuthInfo = ((b) obj).f367211a;
            silentAuthInfo.getClass();
            int i12 = com.vk.dto.common.id.b.f366763a;
            long j12 = silentAuthInfo.f367186b.f366761b;
            if (j12 == 0) {
                j12 = -Math.abs((silentAuthInfo.f367190f + silentAuthInfo.f367194j + silentAuthInfo.f367193i + silentAuthInfo.f367195k).hashCode());
            }
            if (hashSet.add(Long.valueOf(j12))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
