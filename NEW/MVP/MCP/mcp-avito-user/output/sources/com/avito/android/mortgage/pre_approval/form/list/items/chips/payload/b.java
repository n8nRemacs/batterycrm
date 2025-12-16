package com.avito.android.mortgage.pre_approval.form.list.items.chips.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.a;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof com.avito.android.mortgage.pre_approval.form.list.items.chips.c) || !(aVar2 instanceof com.avito.android.mortgage.pre_approval.form.list.items.chips.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.pre_approval.form.list.items.chips.c cVar = (com.avito.android.mortgage.pre_approval.form.list.items.chips.c) aVar2;
        com.avito.android.mortgage.pre_approval.form.list.items.chips.c cVar2 = (com.avito.android.mortgage.pre_approval.form.list.items.chips.c) aVar;
        boolean zEquals = cVar.f201745d.equals(cVar2.f201745d);
        ArrayList arrayList2 = cVar.f201745d;
        c.a aVar3 = cVar.f201746e;
        if (!zEquals) {
            arrayList.add(new a.C5983a(arrayList2, aVar3));
        }
        if (!L.f(aVar3, cVar2.f201746e)) {
            arrayList.add(new a.c(arrayList2, aVar3));
        }
        PrintableText printableText = cVar.f201747f;
        if (!L.f(printableText, cVar2.f201747f)) {
            arrayList.add(new a.b(printableText));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
