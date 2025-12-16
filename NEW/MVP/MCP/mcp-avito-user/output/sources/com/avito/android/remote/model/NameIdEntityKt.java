package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: NameIdEntity.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0086\b\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"filter", "", "Lcom/avito/android/remote/model/NameIdEntity;", "ids", "", "getNamesFrom", "", "", "(Ljava/util/List;)[Ljava/lang/CharSequence;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NameIdEntityKt {
    @k
    public static final List<NameIdEntity> filter(@l List<NameIdEntity> list, @l List<String> list2) {
        List<String> list3;
        List<NameIdEntity> list4 = list;
        if (list4 == null || list4.isEmpty() || (list3 = list2) == null || list3.isEmpty()) {
            return C42784z0.f406748b;
        }
        if (list == null) {
            list = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((list2 == null ? C42784z0.f406748b : list2).contains(((NameIdEntity) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @k
    public static final CharSequence[] getNamesFrom(@k List<NameIdEntity> list) {
        List<NameIdEntity> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String f201827c = ((NameIdEntity) it.next()).getF201827c();
            if (f201827c == null) {
                f201827c = "";
            }
            arrayList.add(f201827c);
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
    }
}
