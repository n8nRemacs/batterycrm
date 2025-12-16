package com.avito.android.mortgage.person_form.list.items.input.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import com.avito.android.mortgage.person_form.list.items.input.payloads.a;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/payloads/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if (!(personFormItem instanceof InputItem) || !(personFormItem2 instanceof InputItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        InputItem inputItem = (InputItem) personFormItem2;
        InputItem inputItem2 = (InputItem) personFormItem;
        String str = inputItem2.f200692f;
        String str2 = inputItem.f200692f;
        if (!L.f(str2, str)) {
            arrayList.add(new a.c(str2));
        }
        PrintableText printableText = inputItem2.f200695i;
        PrintableText printableText2 = inputItem.f200695i;
        if (!L.f(printableText2, printableText)) {
            arrayList.add(new a.C5943a(printableText2));
        }
        boolean z12 = inputItem2.f200697k;
        boolean z13 = inputItem.f200697k;
        if (z13 != z12) {
            arrayList.add(new a.b(z13));
        }
        return arrayList;
    }
}
