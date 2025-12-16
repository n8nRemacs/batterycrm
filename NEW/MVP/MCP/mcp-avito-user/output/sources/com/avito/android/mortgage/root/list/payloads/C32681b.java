package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageRootAddBorrowerPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/b;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.root.list.payloads.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32681b implements Z00.e {
    @Inject
    public C32681b() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.borrower_add.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.borrower_add.c)) {
            return null;
        }
        boolean z12 = ((com.avito.android.mortgage.root.list.items.borrower_add.c) interfaceC19665b).f202463e;
        boolean z13 = ((com.avito.android.mortgage.root.list.items.borrower_add.c) interfaceC19665b2).f202463e;
        if (z12 != z13) {
            return new C32680a(z13);
        }
        return null;
    }
}
