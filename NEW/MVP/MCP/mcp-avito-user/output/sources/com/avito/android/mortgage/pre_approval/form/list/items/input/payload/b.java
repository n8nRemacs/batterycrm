package com.avito.android.mortgage.pre_approval.form.list.items.input.payload;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.input.payload.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!(aVar instanceof com.avito.android.mortgage.pre_approval.form.list.items.input.c) || !(aVar2 instanceof com.avito.android.mortgage.pre_approval.form.list.items.input.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.pre_approval.form.list.items.input.c cVar = (com.avito.android.mortgage.pre_approval.form.list.items.input.c) aVar2;
        com.avito.android.mortgage.pre_approval.form.list.items.input.c cVar2 = (com.avito.android.mortgage.pre_approval.form.list.items.input.c) aVar;
        if (!L.f(cVar.f201771f, cVar2.f201771f)) {
            Integer num = cVar.f201771f;
            String string = num != null ? num.toString() : null;
            if (string == null) {
                string = "";
            }
            arrayList.add(new a.e(string));
        }
        O00.a aVar3 = cVar.f201772g;
        Double dValueOf = aVar3 != null ? Double.valueOf(aVar3.f11895a) : null;
        O00.a aVar4 = cVar2.f201772g;
        if (!L.c(dValueOf, aVar4 != null ? Double.valueOf(aVar4.f11895a) : null)) {
            arrayList.add(new a.f(aVar3 != null ? Double.valueOf(aVar3.f11895a) : null));
        }
        if (!L.f(cVar.a(), cVar2.a())) {
            arrayList.add(new a.C5985a(cVar.a()));
        }
        if (!L.f(cVar.f201770e, cVar2.f201770e)) {
            arrayList.add(a.c.f201815a);
        }
        Double d12 = cVar.f201775j;
        if (!L.c(d12, cVar2.f201775j)) {
            arrayList.add(new a.d(d12));
        }
        arrayList.add(new a.b(cVar.f201774i));
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
