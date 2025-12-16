package com.avito.android.user_stats.extended_user_stats;

import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.CheckBoxData;
import com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.CheckboxType;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CreateConfigHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/c;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_stats.extended_user_stats.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35731c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317169a;

    public C35731c(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f317169a = interfaceC35863o4;
    }

    public static void b(ArrayList arrayList, fW0.o oVar) {
        List<fW0.o> listA;
        String id2;
        if (oVar != null && (id2 = oVar.getId()) != null) {
            arrayList.add(id2);
        }
        if (oVar == null || (listA = oVar.a()) == null) {
            return;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            b(arrayList, (fW0.o) it.next());
        }
    }

    @Y61.k
    public static CheckboxType d(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.k List list) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f((String) next, str)) {
                break;
            }
        }
        return next != null ? CheckboxType.f317256b : !C42745f0.M(list, C42745f0.P0(arrayList)).isEmpty() ? CheckboxType.f317258d : CheckboxType.f317257c;
    }

    public final void a(fW0.o oVar, ArrayList arrayList, int i12, ArrayList arrayList2) {
        String id2 = oVar.getId();
        if (id2 != null) {
            ArrayList arrayList3 = new ArrayList();
            List<fW0.o> listA = oVar.a();
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    b(arrayList3, (fW0.o) it.next());
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList) {
                List<String> list = ((CheckBoxData) obj).f317254h;
                if (list != null && list.contains(id2)) {
                    arrayList5.add(obj);
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((CheckBoxData) it2.next()).f317249c);
            }
            int i13 = i12 + 1;
            String strA = this.f317169a.a();
            String name = oVar.getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(new CheckBoxData(strA, id2, name, d(id2, arrayList2, arrayList3), i13, arrayList4, arrayList3, null, 128, null));
            List<fW0.o> listA2 = oVar.a();
            if (listA2 != null) {
                Iterator<T> it3 = listA2.iterator();
                while (it3.hasNext()) {
                    a((fW0.o) it3.next(), arrayList, i13, arrayList2);
                }
            }
        }
    }

    @Y61.k
    public final com.avito.android.user_stats.extended_user_stats.list_search_dialog.a c(@Y61.k LinkedHashSet linkedHashSet, @Y61.k List list, @Y61.k String str, @Y61.k String str2, int i12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fW0.o oVar = (fW0.o) it.next();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(linkedHashSet, 10));
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((NameIdEntity) it2.next()).getId());
            }
            a(oVar, arrayList, -1, arrayList2);
        }
        return new com.avito.android.user_stats.extended_user_stats.list_search_dialog.a(arrayList, str, str2, linkedHashSet, i12);
    }
}
