package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.root.list.payloads.p;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootIssuePayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/q;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements Z00.e {
    @Inject
    public q() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.issue.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.issue.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.issue.c cVar = (com.avito.android.mortgage.root.list.items.issue.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.issue.c cVar2 = (com.avito.android.mortgage.root.list.items.issue.c) interfaceC19665b2;
        String str = cVar.f202642d;
        String str2 = cVar2.f202642d;
        if (!L.f(str, str2)) {
            arrayList.add(new p.b(str2));
        }
        ActionButton actionButton = cVar.f202643e;
        ActionButton actionButton2 = cVar2.f202643e;
        if (!L.f(actionButton, actionButton2)) {
            arrayList.add(new p.a(actionButton2));
        }
        return arrayList;
    }
}
