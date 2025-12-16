package GB0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35793f6;
import eC0.h;
import eC0.i;
import eC0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpxLevelsMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGB0/b;", "LGB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35793f6 f6363a;

    @Inject
    public b(@k C35793f6 c35793f6) {
        this.f6363a = c35793f6;
    }

    @Override // GB0.a
    @k
    public final ArrayList a(@k List list) {
        List<h> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (h hVar : list2) {
            arrayList.add(new FB0.a(hVar.getName(), hVar.getId(), hVar.getButton(), hVar.getExtraInfo()));
        }
        return arrayList;
    }

    @Override // GB0.a
    @k
    public final LinkedHashMap b(@k ArrayList arrayList, @k List list) {
        Object next;
        Object next2;
        boolean z12;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            AttributedText name = jVar.getName();
            C35793f6 c35793f6 = this.f6363a;
            if (name != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    List<i> listA = jVar.a();
                    if ((listA instanceof Collection) && listA.isEmpty()) {
                        z12 = true;
                    } else {
                        Iterator<T> it3 = listA.iterator();
                        while (it3.hasNext()) {
                            Iterator<T> it4 = ((i) it3.next()).c().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                if (((eC0.k) next2).getId() == iIntValue) {
                                    break;
                                }
                            }
                            eC0.k kVar = (eC0.k) next2;
                            if (!(kVar != null ? L.f(kVar.getIsHidden(), Boolean.TRUE) : false)) {
                                z12 = false;
                                break;
                            }
                        }
                        z12 = true;
                    }
                    if (!z12) {
                        arrayList2.add(new com.avito.android.tariff.cpx.levels.ui.items.business_tools_header.a(iIntValue, name, c35793f6.a()));
                    }
                }
            }
            for (i iVar : jVar.a()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    int iIntValue2 = ((Number) it5.next()).intValue();
                    Iterator<T> it6 = iVar.c().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                        if (((eC0.k) next).getId() == iIntValue2) {
                            break;
                        }
                    }
                    eC0.k kVar2 = (eC0.k) next;
                    if (!(kVar2 != null ? L.f(kVar2.getIsHidden(), Boolean.TRUE) : false)) {
                        arrayList2.add(new com.avito.android.tariff.cpx.levels.ui.items.business_tool.a(c35793f6.a(), iIntValue2, iVar.getName(), iVar.getIcon(), iVar.getDisabledIcon(), kVar2 != null ? kVar2.getDeeplink() : null, kVar2 != null && kVar2.getIsEnabled(), kVar2 != null ? kVar2.getDescription() : null));
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            Integer numValueOf = Integer.valueOf(((JB0.a) next3).getF297155c());
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(next3);
        }
        return linkedHashMap;
    }
}
