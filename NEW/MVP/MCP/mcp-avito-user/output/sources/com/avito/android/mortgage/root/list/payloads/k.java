package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.j;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBorrowerTitlePayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/k;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements Z00.e {
    @Inject
    public k() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.borrower_title.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.borrower_title.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.borrower_title.c cVar = (com.avito.android.mortgage.root.list.items.borrower_title.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.borrower_title.c cVar2 = (com.avito.android.mortgage.root.list.items.borrower_title.c) interfaceC19665b2;
        String str = cVar.f202477c;
        String str2 = cVar2.f202477c;
        boolean zF2 = L.f(str, str2);
        String str3 = cVar2.f202478d;
        if (!zF2 || !L.f(cVar.f202478d, str3)) {
            arrayList.add(new j.c(str2, str3));
        }
        AttributedText attributedText = cVar.f202479e;
        AttributedText attributedText2 = cVar2.f202479e;
        if (!L.f(attributedText, attributedText2)) {
            arrayList.add(new j.b(attributedText2));
        }
        boolean z12 = cVar.f202480f;
        boolean z13 = cVar2.f202480f;
        if (z12 != z13) {
            arrayList.add(new j.a(z13));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
