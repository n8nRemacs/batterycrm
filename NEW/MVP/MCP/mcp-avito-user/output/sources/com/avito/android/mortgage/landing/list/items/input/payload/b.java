package com.avito.android.mortgage.landing.list.items.input.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import com.avito.android.mortgage.landing.list.items.input.InputItem;
import com.avito.android.mortgage.landing.list.items.input.payload.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof InputItem) || !(aVar2 instanceof InputItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        InputItem inputItem = (InputItem) aVar2;
        InputItem inputItem2 = (InputItem) aVar;
        if (!L.f(inputItem.f199731d, inputItem2.f199731d)) {
            Integer num = inputItem.f199731d;
            String string = num != null ? num.toString() : null;
            if (string == null) {
                string = "";
            }
            arrayList.add(new a.d(string));
        }
        double d12 = inputItem.f199735h;
        if (d12 != inputItem2.f199735h) {
            arrayList.add(new a.i(d12));
        }
        double d13 = inputItem.f199736i;
        if (d13 != inputItem2.f199736i) {
            arrayList.add(new a.h(d13));
        }
        double d14 = inputItem.f199737j;
        if (d14 != inputItem2.f199737j) {
            arrayList.add(new a.j(d14, inputItem.f199739l));
        }
        LabelValueParameter labelValueParameter = inputItem.f199733f;
        if (!L.f(labelValueParameter, inputItem2.f199733f)) {
            arrayList.add(new a.f(labelValueParameter));
        }
        LabelValueParameter labelValueParameter2 = inputItem.f199734g;
        if (!L.f(labelValueParameter2, inputItem2.f199734g)) {
            arrayList.add(new a.e(labelValueParameter2));
        }
        List<InputItem.Chip> list = inputItem.f199738k;
        if (!L.f(list, inputItem2.f199738k)) {
            arrayList.add(new a.g(list));
        }
        if (!L.f(inputItem.f(), inputItem2.f())) {
            arrayList.add(new a.C5903a(inputItem.f()));
        }
        boolean z12 = inputItem.f199740m;
        if (z12 != inputItem2.f199740m) {
            arrayList.add(new a.b(z12));
        }
        if (!L.f(inputItem.f199732e, inputItem2.f199732e)) {
            arrayList.add(a.c.f199783a);
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
