package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.list.payloads.s;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootNavigationPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/t;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements Z00.e {
    @Inject
    public t() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.navigation.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.navigation.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.navigation.c cVar = (com.avito.android.mortgage.root.list.items.navigation.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.navigation.c cVar2 = (com.avito.android.mortgage.root.list.items.navigation.c) interfaceC19665b2;
        ApplicationProcessType applicationProcessType = cVar.f202706e;
        ApplicationProcessType applicationProcessType2 = cVar2.f202706e;
        if (applicationProcessType != applicationProcessType2) {
            arrayList.add(new s.d(applicationProcessType2));
        }
        KZ.A a12 = cVar.f202704c;
        KZ.A a13 = cVar2.f202704c;
        if (!L.f(a12, a13)) {
            arrayList.add(new s.a(a13));
        }
        KZ.A a14 = cVar.f202705d;
        KZ.A a15 = cVar2.f202705d;
        if (!L.f(a14, a15)) {
            arrayList.add(new s.b(a15));
        }
        AttributedText attributedText = cVar.f202707f;
        AttributedText attributedText2 = cVar2.f202707f;
        if (!L.f(attributedText, attributedText2)) {
            arrayList.add(new s.c(attributedText2));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
