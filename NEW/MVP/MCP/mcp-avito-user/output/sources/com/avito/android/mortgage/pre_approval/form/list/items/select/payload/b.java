package com.avito.android.mortgage.pre_approval.form.list.items.select.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.mortgage.pre_approval.form.list.items.select.payload.a;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof SelectItem) || !(aVar2 instanceof SelectItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SelectItem selectItem = (SelectItem) aVar;
        SelectItem.Option option = selectItem.f201823e;
        String str = option != null ? option.f201826b : null;
        SelectItem selectItem2 = (SelectItem) aVar2;
        SelectItem.Option option2 = selectItem2.f201823e;
        if (!L.f(str, option2 != null ? option2.f201826b : null)) {
            arrayList.add(new a.b(selectItem2.f201823e));
        }
        PrintableText printableText = selectItem.f201825g;
        PrintableText printableText2 = selectItem2.f201825g;
        if (!L.f(printableText, printableText2)) {
            arrayList.add(new a.C5987a(printableText2));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
