package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageRootEnablingPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/n;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements Z00.e {
    @Inject
    public n() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof InterfaceC19664a) || !(interfaceC19665b2 instanceof InterfaceC19664a)) {
            return null;
        }
        InterfaceC19664a interfaceC19664a = (InterfaceC19664a) interfaceC19665b2;
        if (((InterfaceC19664a) interfaceC19665b).getF202464f() != interfaceC19664a.getF202464f()) {
            return new m(interfaceC19664a.getF202464f());
        }
        return null;
    }
}
