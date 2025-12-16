package com.avito.android.mortgage.person_form.list.items.chips.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.chips.ChipsItem;
import com.avito.android.mortgage.person_form.list.items.chips.payload.a;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsPayloadProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/payload/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if (!(personFormItem instanceof ChipsItem) || !(personFormItem2 instanceof ChipsItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ChipsItem chipsItem = (ChipsItem) personFormItem;
        ChipsItem chipsItem2 = (ChipsItem) personFormItem2;
        List<ChipsItem.Chip> list = chipsItem.f200658f;
        List<ChipsItem.Chip> list2 = chipsItem2.f200658f;
        if (!L.f(list, list2)) {
            arrayList.add(new a.C5940a(list2));
        }
        String str = chipsItem.f200659g;
        String str2 = chipsItem2.f200659g;
        if (!L.f(str, str2) && str2 != null) {
            List<ChipsItem.Chip> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ChipsItem.Chip) it.next()).f200664b);
            }
            arrayList.add(new a.c(arrayList2, str2));
        }
        if (!L.f(str, str2) && str2 == null) {
            arrayList.add(a.d.f200686a);
        }
        PrintableText printableText = chipsItem.f200660h;
        PrintableText printableText2 = chipsItem2.f200660h;
        if (!L.f(printableText, printableText2)) {
            arrayList.add(new a.b(printableText2));
        }
        return arrayList;
    }
}
