package com.avito.android.mortgage.landing.list.items.expandable_block.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.expandable_block.ExpandableBlockItem;
import com.avito.android.mortgage.landing.list.items.expandable_block.payload.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExpandablePayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/expandable_block/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof ExpandableBlockItem) || !(aVar2 instanceof ExpandableBlockItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z12 = ((ExpandableBlockItem) aVar2).f199696e;
        if (z12 != ((ExpandableBlockItem) aVar).f199696e) {
            arrayList.add(new a.C5900a(z12));
        }
        return arrayList;
    }
}
