package vR;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35793f6;
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
import tR.C48597a;
import yR.C50162a;
import yR.C50163b;
import yR.C50164c;
import yR.d;

/* compiled from: LfLevelsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvR/b;", "LvR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49256b implements InterfaceC49255a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35793f6 f440785a;

    @Inject
    public C49256b(@k C35793f6 c35793f6) {
        this.f440785a = c35793f6;
    }

    @Override // vR.InterfaceC49255a
    @k
    public final ArrayList a(@k List list) {
        List<C50162a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C50162a c50162a : list2) {
            arrayList.add(new C48597a(c50162a.getName(), c50162a.getId(), c50162a.getButton(), c50162a.getExtraInfo()));
        }
        return arrayList;
    }

    @Override // vR.InterfaceC49255a
    @k
    public final LinkedHashMap b(@k ArrayList arrayList, @k List list) {
        Object next;
        Object next2;
        boolean z12;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50164c c50164c = (C50164c) it.next();
            AttributedText attributedTextB = c50164c.getName();
            C35793f6 c35793f6 = this.f440785a;
            if (attributedTextB != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    List<C50163b> listA = c50164c.a();
                    if ((listA instanceof Collection) && listA.isEmpty()) {
                        z12 = true;
                    } else {
                        Iterator<T> it3 = listA.iterator();
                        while (it3.hasNext()) {
                            Iterator<T> it4 = ((C50163b) it3.next()).c().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                if (((d) next2).getId() == iIntValue) {
                                    break;
                                }
                            }
                            d dVar = (d) next2;
                            if (!(dVar != null ? L.f(dVar.getIsHidden(), Boolean.TRUE) : false)) {
                                z12 = false;
                                break;
                            }
                        }
                        z12 = true;
                    }
                    if (!z12) {
                        arrayList2.add(new com.avito.android.lf_levels.ui.items.business_tools_header.a(iIntValue, attributedTextB, c35793f6.a()));
                    }
                }
            }
            for (C50163b c50163b : c50164c.a()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    int iIntValue2 = ((Number) it5.next()).intValue();
                    Iterator<T> it6 = c50163b.c().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                        if (((d) next).getId() == iIntValue2) {
                            break;
                        }
                    }
                    d dVar2 = (d) next;
                    if (!(dVar2 != null ? L.f(dVar2.getIsHidden(), Boolean.TRUE) : false)) {
                        arrayList2.add(new com.avito.android.lf_levels.ui.items.business_tool.a(c35793f6.a(), iIntValue2, c50163b.getName(), c50163b.getIcon(), c50163b.getDisabledIcon(), dVar2 != null ? dVar2.getDeeplink() : null, dVar2 != null && dVar2.getIsEnabled(), dVar2 != null ? dVar2.getDescription() : null));
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            Integer numValueOf = Integer.valueOf(((BR.a) next3).getF175400c());
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
