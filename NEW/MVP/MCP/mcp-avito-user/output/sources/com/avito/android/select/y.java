package com.avito.android.select;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.GroupSection;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/y;", "Lcom/avito/android/select/x;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y implements x {
    @Inject
    public y() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.select.x
    @Y61.k
    public final List<ParcelableEntity<String>> a(@Y61.l List<MultiselectParameter.Displaying.Group> list, @Y61.k List<? extends ParcelableEntity<String>> list2) {
        String str;
        GroupSection groupSection;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MultiselectParameter.Displaying.Group group : list) {
                if (L.f(group.getEnsureOrder(), Boolean.TRUE)) {
                    List<? extends ParcelableEntity<String>> list3 = list2;
                    int iF2 = P0.f(C42745f0.q(list3, 10));
                    if (iF2 < 16) {
                        iF2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                    for (Object obj : list3) {
                        linkedHashMap.put((String) ((ParcelableEntity) obj).getId(), obj);
                    }
                    String title = group.getTitle();
                    str = title != null ? title : "";
                    List<String> ids = group.getIds();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = ids.iterator();
                    while (it.hasNext()) {
                        ParcelableEntity parcelableEntity = (ParcelableEntity) linkedHashMap.get((String) it.next());
                        if (parcelableEntity != null) {
                            arrayList2.add(parcelableEntity);
                        }
                    }
                    groupSection = new GroupSection(str, arrayList2);
                } else {
                    String title2 = group.getTitle();
                    str = title2 != null ? title2 : "";
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (group.getIds().contains(((ParcelableEntity) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    groupSection = new GroupSection(str, arrayList3);
                }
                arrayList.add(groupSection);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.select.x
    @Y61.k
    public final List<ParcelableEntity<String>> b(@Y61.l List<MultiselectParameter.Displaying.Group> list, @Y61.k List<? extends ParcelableEntity<String>> list2) {
        String str;
        GroupSection groupSection;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MultiselectParameter.Displaying.Group group : list) {
                String title = group.getTitle();
                if (title == null || title.length() == 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        if (group.getIds().contains(((ParcelableEntity) obj).getId())) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    if (L.f(group.getEnsureOrder(), Boolean.TRUE)) {
                        List<? extends ParcelableEntity<String>> list3 = list2;
                        int iF2 = P0.f(C42745f0.q(list3, 10));
                        if (iF2 < 16) {
                            iF2 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                        for (Object obj2 : list3) {
                            linkedHashMap.put((String) ((ParcelableEntity) obj2).getId(), obj2);
                        }
                        String title2 = group.getTitle();
                        str = title2 != null ? title2 : "";
                        List<String> ids = group.getIds();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<T> it = ids.iterator();
                        while (it.hasNext()) {
                            ParcelableEntity parcelableEntity = (ParcelableEntity) linkedHashMap.get((String) it.next());
                            if (parcelableEntity != null) {
                                arrayList3.add(parcelableEntity);
                            }
                        }
                        groupSection = new GroupSection(str, arrayList3);
                    } else {
                        String title3 = group.getTitle();
                        str = title3 != null ? title3 : "";
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (group.getIds().contains(((ParcelableEntity) obj3).getId())) {
                                arrayList4.add(obj3);
                            }
                        }
                        groupSection = new GroupSection(str, arrayList4);
                    }
                    arrayList.add(groupSection);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? list2 : arrayList;
    }
}
