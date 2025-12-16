package com.avito.android.select;

import androidx.compose.foundation.text.selection.W0;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.remote.model.category_parameters.SortDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectParameterLocalSorter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/s;", "Lcom/avito/android/select/q;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements q {
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k SortDirection sortDirection) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        int i12 = -1;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ParcelableEntity parcelableEntity = (ParcelableEntity) obj;
            if (i13 == size) {
                List listSubList = list.subList(i12 + 1, i14);
                arrayList.addAll(listSubList.isEmpty() ? C42784z0.f406748b : C42745f0.B0(listSubList, new W0(6, new r(sortDirection))));
            }
            if ((parcelableEntity instanceof SectionTitle) && i12 < i13) {
                List listSubList2 = list.subList(i12 + 1, i13);
                arrayList.addAll(listSubList2.isEmpty() ? C42784z0.f406748b : C42745f0.B0(listSubList2, new W0(6, new r(sortDirection))));
                arrayList.add(parcelableEntity);
                i12 = i13;
            }
            i13 = i14;
        }
        return arrayList;
    }
}
