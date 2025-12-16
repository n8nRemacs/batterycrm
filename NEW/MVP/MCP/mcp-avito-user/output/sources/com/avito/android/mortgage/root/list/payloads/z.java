package com.avito.android.mortgage.root.list.payloads;

import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.y;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootStatusPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/payloads/z;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements Z00.e {
    @Inject
    public z() {
    }

    @Override // Z00.e
    @Y61.l
    public final Object a(@Y61.k InterfaceC19665b interfaceC19665b, @Y61.k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.status.c) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.status.c)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.status.c cVar = (com.avito.android.mortgage.root.list.items.status.c) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.status.c cVar2 = (com.avito.android.mortgage.root.list.items.status.c) interfaceC19665b2;
        Image image = cVar.f202833c;
        Image image2 = cVar2.f202833c;
        if (!L.f(image, image2)) {
            arrayList.add(new y.a(image2));
        }
        AttributedText attributedText = cVar.f202834d;
        AttributedText attributedText2 = cVar2.f202834d;
        if (!L.f(attributedText, attributedText2)) {
            arrayList.add(new y.c(attributedText2));
        }
        AttributedText attributedText3 = cVar.f202835e;
        AttributedText attributedText4 = cVar2.f202835e;
        if (!L.f(attributedText3, attributedText4)) {
            arrayList.add(new y.b(attributedText4));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
