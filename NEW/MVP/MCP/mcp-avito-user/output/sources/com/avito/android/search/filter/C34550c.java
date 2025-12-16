package com.avito.android.search.filter;

import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CategoriesParameterFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/c;", "Lcom/avito/android/search/filter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34550c implements InterfaceC34547b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34536a1 f262660a;

    @Inject
    public C34550c(@Y61.k InterfaceC34536a1 interfaceC34536a1) {
        this.f262660a = interfaceC34536a1;
    }

    public static SelectParameter.Flat b(String str, String str2, String str3, List list, SelectParameter.Displaying displaying) {
        SelectParameter.Displaying displaying2;
        if (displaying == null || (displaying2 = SelectParameter.Displaying.copy$default(displaying, "dialog", null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -2, 511, null)) == null) {
            displaying2 = new SelectParameter.Displaying("dialog", null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -2, 511, null);
        }
        return new SelectParameter.Flat(str, str2, null, false, false, null, Boolean.TRUE, null, str3, null, list, displaying2, null, null, null, null, null, null, null, null, null, null, false, null, null, 33550980, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    @Override // com.avito.android.search.filter.InterfaceC34547b
    @Y61.k
    public final List<CategoryParameter> a(@Y61.k List<Category> list, @Y61.l Category category, @Y61.l SelectParameter.Displaying displaying, @Y61.l List<SelectParameter.Value> list2) {
        String id2;
        InterfaceC34536a1 interfaceC34536a1;
        String id3;
        Object next;
        Object next2;
        String str = null;
        String id4 = category != null ? category.getId() : null;
        if (id4 != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (kotlin.jvm.internal.L.f(((Category) next2).getId(), id4)) {
                    break;
                }
            }
            Category category2 = (Category) next2;
            id2 = category2 != null ? category2.isRoot() ? category2.getId() : category2.getParentId() : null;
        } else {
            id2 = null;
        }
        List<Category> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (((Category) obj).isRoot()) {
                arrayList.add(obj);
            }
        }
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            interfaceC34536a1 = this.f262660a;
            if (!zHasNext) {
                break;
            }
            Category category3 = (Category) it2.next();
            String id5 = category3.getId();
            if (id4 != null) {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = str;
                        break;
                    }
                    next = it3.next();
                    Category category4 = (Category) next;
                    if (kotlin.jvm.internal.L.f(category4.getId(), id4) && kotlin.jvm.internal.L.f(category4.getParentId(), id5)) {
                        break;
                    }
                }
                Category category5 = (Category) next;
                id3 = category5 != null ? category5.getId() : str;
            } else {
                id3 = str;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (kotlin.jvm.internal.L.f(((Category) obj2).getParentId(), id5)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, i12));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Category category6 = (Category) it4.next();
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(new SelectParameter.Value(category6.getId(), category6.getName(), null, str, null, null, false, null, null, null, 996, null));
                arrayList4 = arrayList5;
                arrayList2 = arrayList2;
                interfaceC34536a1 = interfaceC34536a1;
                i12 = i12;
                id3 = id3;
                str = null;
                id4 = id4;
            }
            ArrayList arrayList6 = arrayList4;
            int i13 = i12;
            String str2 = id4;
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(new SelectParameter.Value(category3.getId(), category3.getName(), null, C42745f0.C(Collections.singletonList(arrayList6.isEmpty() ? null : b("parameter_id_subcategories", interfaceC34536a1.b(), id3, arrayList6, null))), null, null, false, null, null, null, 996, null));
            arrayList2 = arrayList7;
            i12 = i13;
            str = null;
            id4 = str2;
        }
        List<SelectParameter.Value> list4 = arrayList2;
        String strA = interfaceC34536a1.a();
        if (list2 != null) {
            list4 = list2;
        }
        return Collections.singletonList(b("parameter_id_categories", strA, id2, list4, displaying));
    }
}
