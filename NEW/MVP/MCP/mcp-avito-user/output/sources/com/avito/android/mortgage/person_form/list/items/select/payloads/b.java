package com.avito.android.mortgage.person_form.list.items.select.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.mortgage.person_form.list.items.select.payloads.a;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/payloads/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if (!(personFormItem instanceof SelectItem) || !(personFormItem2 instanceof SelectItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SelectItem selectItem = (SelectItem) personFormItem2;
        SelectItem selectItem2 = (SelectItem) personFormItem;
        if (!L.f(selectItem.f200750i, selectItem2.f200750i)) {
            arrayList.add(new a.c(selectItem));
        }
        PrintableText printableText = selectItem2.f200748g;
        PrintableText printableText2 = selectItem.f200748g;
        if (!L.f(printableText2, printableText)) {
            arrayList.add(new a.C5947a(printableText2));
        }
        if (!L.f(selectItem.f200749h, selectItem2.f200749h)) {
            arrayList.add(new a.b(selectItem));
        }
        return arrayList;
    }
}
