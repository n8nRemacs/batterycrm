package com.avito.android.mortgage.root.list.items.mortgage_progress.payloads;

import Y61.k;
import Y61.l;
import Z00.e;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageProgressPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/b;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements e {
    @Inject
    public b() {
    }

    @Override // Z00.e
    @l
    public final Object a(@k InterfaceC19665b interfaceC19665b, @k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.mortgage_progress.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.mortgage_progress.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.mortgage_progress.c cVar = (com.avito.android.mortgage.root.list.items.mortgage_progress.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.mortgage_progress.c cVar2 = (com.avito.android.mortgage.root.list.items.mortgage_progress.c) interfaceC19665b2;
        String str = cVar.f202685c;
        String str2 = cVar2.f202685c;
        if (!L.f(str, str2)) {
            arrayList.add(new a.c(str2));
        }
        ArrayList arrayList2 = cVar.f202686d;
        ArrayList arrayList3 = cVar2.f202686d;
        if (!arrayList2.equals(arrayList3)) {
            arrayList.add(new a.b(arrayList3));
        }
        int i12 = cVar.f202687e;
        int i13 = cVar2.f202687e;
        if (i12 != i13) {
            arrayList.add(new a.C6032a(i13));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
