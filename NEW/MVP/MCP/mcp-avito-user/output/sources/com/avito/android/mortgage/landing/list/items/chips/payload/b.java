package com.avito.android.mortgage.landing.list.items.chips.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import com.avito.android.mortgage.landing.list.items.chips.payload.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof ChipsItem) || !(aVar2 instanceof ChipsItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ChipsItem chipsItem = (ChipsItem) aVar2;
        ChipsItem chipsItem2 = (ChipsItem) aVar;
        boolean zF2 = L.f(chipsItem.f199670d, chipsItem2.f199670d);
        List<ChipsItem.Chip> list = chipsItem.f199670d;
        ChipsItem.Chip chip = chipsItem.f199671e;
        if (!zF2) {
            arrayList.add(new a.C5898a(list, chip));
        }
        if (!L.f(chip, chipsItem2.f199671e)) {
            arrayList.add(new a.c(list, chip));
        }
        boolean z12 = chipsItem.f199672f;
        if (z12 != chipsItem2.f199672f) {
            arrayList.add(new a.b(z12));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
