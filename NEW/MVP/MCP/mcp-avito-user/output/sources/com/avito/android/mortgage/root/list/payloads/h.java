package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.root.list.payloads.g;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBorrowerActionPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/h;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements Z00.e {
    @Inject
    public h() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.borrower_action.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.borrower_action.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.borrower_action.c cVar = (com.avito.android.mortgage.root.list.items.borrower_action.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.borrower_action.c cVar2 = (com.avito.android.mortgage.root.list.items.borrower_action.c) interfaceC19665b2;
        AttributedText attributedText = cVar.f202441g;
        AttributedText attributedText2 = cVar2.f202441g;
        if (!L.f(attributedText, attributedText2)) {
            arrayList.add(new g.d(attributedText2));
        }
        DeepLink deepLink = cVar.f202442h;
        DeepLink deepLink2 = cVar2.f202442h;
        boolean zF2 = L.f(deepLink, deepLink2);
        String str = cVar2.f202437c;
        KZ.L l12 = cVar2.f202443i;
        if (!zF2 || !L.f(cVar.f202443i, l12) || !L.f(cVar.f202437c, str)) {
            arrayList.add(new g.a(str, deepLink2, l12));
        }
        String str2 = cVar.f202438d;
        String str3 = cVar2.f202438d;
        if (!L.f(str2, str3)) {
            arrayList.add(new g.c(str3));
        }
        String str4 = cVar.f202439e;
        String str5 = cVar2.f202439e;
        if (!L.f(str4, str5)) {
            arrayList.add(new g.b(str5));
        }
        return arrayList;
    }
}
