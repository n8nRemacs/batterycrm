package com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExpandablePayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/payloads/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.c) || !(aVar2 instanceof com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z12 = ((com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.c) aVar).f202046d;
        boolean z13 = ((com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.c) aVar2).f202046d;
        if (z12 != z13) {
            arrayList.add(new a.C5997a(z13));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
