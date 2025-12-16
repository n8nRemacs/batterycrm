package com.avito.android.mortgage.person_form.list.items.child.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.child.ChildItem;
import com.avito.android.mortgage.person_form.list.items.child.payloads.a;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChildPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if (!(personFormItem instanceof ChildItem) || !(personFormItem2 instanceof ChildItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ChildItem childItem = (ChildItem) personFormItem;
        ChildItem childItem2 = (ChildItem) personFormItem2;
        String str = childItem.f200608d;
        String str2 = childItem2.f200608d;
        if (!L.f(str, str2)) {
            arrayList.add(new a.e(str2));
        }
        InputItem inputItem = childItem.f200609e;
        String str3 = inputItem.f200692f;
        InputItem inputItem2 = childItem2.f200609e;
        if (!L.f(str3, inputItem2.f200692f)) {
            arrayList.add(new a.d(inputItem2.f200692f));
        }
        boolean z12 = inputItem.f200697k;
        boolean z13 = inputItem2.f200697k;
        if (z12 != z13) {
            arrayList.add(new a.c(z13));
        }
        PrintableText printableText = inputItem.f200695i;
        PrintableText printableText2 = inputItem2.f200695i;
        if (!L.f(printableText, printableText2)) {
            arrayList.add(new a.b(printableText2));
        }
        boolean z14 = childItem.f200610f.f200594d;
        boolean z15 = childItem2.f200610f.f200594d;
        if (z14 != z15) {
            arrayList.add(new a.C5937a(z15));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
