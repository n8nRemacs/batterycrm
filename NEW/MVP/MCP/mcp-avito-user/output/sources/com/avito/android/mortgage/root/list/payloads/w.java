package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.v;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootPersonalStatusPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/w;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements Z00.e {
    @Inject
    public w() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.legacy_status.d) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.legacy_status.d)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.legacy_status.c cVar = ((com.avito.android.mortgage.root.list.items.legacy_status.d) interfaceC19665b).f202668c;
        com.avito.android.mortgage.root.list.items.legacy_status.c cVar2 = ((com.avito.android.mortgage.root.list.items.legacy_status.d) interfaceC19665b2).f202668c;
        if (!L.f(cVar, cVar2)) {
            arrayList.add(new v.a(cVar2));
        }
        return arrayList;
    }
}
