package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.root.list.payloads.d;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/e;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements Z00.e {
    @Inject
    public e() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.bank.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.bank.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.bank.c cVar = (com.avito.android.mortgage.root.list.items.bank.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.bank.c cVar2 = (com.avito.android.mortgage.root.list.items.bank.c) interfaceC19665b2;
        AttributedText attributedText = cVar.f202306e;
        AttributedText attributedText2 = cVar2.f202306e;
        if (!L.f(attributedText, attributedText2)) {
            arrayList.add(new d.g(attributedText2));
        }
        List<com.avito.android.mortgage.root.list.items.bank.e> list = cVar.f202307f;
        List<com.avito.android.mortgage.root.list.items.bank.e> list2 = cVar2.f202307f;
        if (!L.f(list, list2)) {
            arrayList.add(new d.c(list2));
        }
        ApplicationAppealComment applicationAppealComment = cVar.f202308g;
        ApplicationAppealComment applicationAppealComment2 = cVar2.f202308g;
        if (!L.f(applicationAppealComment, applicationAppealComment2)) {
            arrayList.add(new d.b(applicationAppealComment2));
        }
        com.avito.android.mortgage.root.list.items.bank.f fVar = cVar.f202309h;
        com.avito.android.mortgage.root.list.items.bank.f fVar2 = cVar2.f202309h;
        if (!L.f(fVar, fVar2)) {
            arrayList.add(new d.f(fVar2));
        }
        com.avito.android.mortgage.root.list.items.bank.d dVar = cVar.f202310i;
        com.avito.android.mortgage.root.list.items.bank.d dVar2 = cVar2.f202310i;
        if (!L.f(dVar, dVar2)) {
            arrayList.add(new d.a(dVar2));
        }
        com.avito.android.mortgage.root.list.items.bank.d dVar3 = cVar.f202311j;
        com.avito.android.mortgage.root.list.items.bank.d dVar4 = cVar2.f202311j;
        if (!L.f(dVar3, dVar4)) {
            arrayList.add(new d.e(dVar4));
        }
        boolean z12 = cVar.f202312k;
        boolean z13 = cVar2.f202312k;
        if (z12 != z13) {
            arrayList.add(new d.C6041d(z13));
        }
        return arrayList;
    }
}
