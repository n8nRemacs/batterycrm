package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootTeamPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/B;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements Z00.e {
    @Inject
    public B() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.team.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.team.c)) {
            return null;
        }
        com.avito.android.mortgage.root.list.items.team.c cVar = (com.avito.android.mortgage.root.list.items.team.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.team.c cVar2 = (com.avito.android.mortgage.root.list.items.team.c) interfaceC19665b2;
        if (cVar.f202858f == cVar2.f202858f && L.f(cVar.f202856d, cVar2.f202856d) && L.f(cVar.f202857e, cVar2.f202857e)) {
            return null;
        }
        return G0.f406611a;
    }
}
