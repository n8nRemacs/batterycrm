package com.avito.android.advert.item;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.CombinedButtonsItem;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: StickyButtonVisibilityTuner.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/n2;", "Lcom/avito/android/advert/item/v2;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n2 implements v2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n2 f77744a = new n2();

    @Override // com.avito.android.advert.item.v2
    public final int a(int i12, @Y61.k RecyclerView recyclerView) {
        RecyclerView.C cQ2 = recyclerView.Q(i12, false);
        com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.h hVar = cQ2 instanceof com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.h ? (com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.h) cQ2 : null;
        if (hVar == null) {
            return 0;
        }
        int[] iArr = new int[2];
        ConstraintLayout constraintLayout = hVar.f79098c;
        constraintLayout.getLocationOnScreen(iArr);
        return constraintLayout.getHeight() + iArr[1];
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
            if (((com.avito.android.serp.adapter.i1) listIterator.previous()) instanceof CombinedButtonsItem) {
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
