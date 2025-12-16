package com.avito.android.advert.item;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: StickyButtonVisibilityTuner.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/l2;", "Lcom/avito/android/advert/item/v2;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l2 implements v2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l2 f77254a = new l2();

    @Override // com.avito.android.advert.item.v2
    public final int a(int i12, @Y61.k RecyclerView recyclerView) {
        Object objQ = recyclerView.Q(i12, false);
        com.avito.android.advert_core.contactbar.w wVar = objQ instanceof com.avito.android.advert_core.contactbar.w ? (com.avito.android.advert_core.contactbar.w) objQ : null;
        if (wVar != null) {
            return wVar.va();
        }
        return 0;
    }

    @Override // com.avito.android.advert.item.v2
    @Y61.l
    public final Integer b(@Y61.k ArrayList arrayList) {
        int iNextIndex;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((com.avito.android.serp.adapter.i1) listIterator.previous()) instanceof AdvertDetailsContactBarItem) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(iNextIndex);
        if (iNextIndex == -1) {
            return null;
        }
        return numValueOf;
    }
}
