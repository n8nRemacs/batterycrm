package com.avito.android.mortgage.root.list.items.bank_tabs.payload;

import Y61.k;
import Y61.l;
import Z00.e;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.items.bank_tabs.c;
import com.avito.android.mortgage.root.list.items.bank_tabs.payload.c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankTabsPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/payload/a;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements e {
    @Inject
    public a() {
    }

    @Override // Z00.e
    @l
    public final Object a(@k InterfaceC19665b interfaceC19665b, @k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.bank_tabs.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.bank_tabs.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.bank_tabs.c cVar = (com.avito.android.mortgage.root.list.items.bank_tabs.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.bank_tabs.c cVar2 = (com.avito.android.mortgage.root.list.items.bank_tabs.c) interfaceC19665b2;
        List<c.a> list = cVar.f202410c;
        List<c.a> list2 = cVar2.f202410c;
        if (!L.f(list, list2)) {
            arrayList.add(new c.b(list2));
        }
        int i12 = cVar.f202411d;
        int i13 = cVar2.f202411d;
        if (i12 != i13) {
            arrayList.add(new c.a(i13));
        }
        return arrayList;
    }
}
