package com.avito.android.publish.slots.delivery_addresses.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAddressesSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/item/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243440b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f243441c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<AddressInfo> f243442d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f243443e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f243444f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f243445g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f243446h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f243447i;

    public c(@k String str, @k String str2, @k String str3, @l String str4, @l Integer num, @l Integer num2, @k String str5, @l List list) {
        this.f243440b = str;
        this.f243441c = num;
        this.f243442d = list;
        this.f243443e = str2;
        this.f243444f = str3;
        this.f243445g = str4;
        this.f243446h = str5;
        this.f243447i = num2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243440b, cVar.f243440b) && L.f(this.f243441c, cVar.f243441c) && L.f(this.f243442d, cVar.f243442d) && L.f(this.f243443e, cVar.f243443e) && L.f(this.f243444f, cVar.f243444f) && L.f(this.f243445g, cVar.f243445g) && L.f(this.f243446h, cVar.f243446h) && L.f(this.f243447i, cVar.f243447i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF244024b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244024b() {
        return this.f243440b;
    }

    public final int hashCode() {
        int iHashCode = this.f243440b.hashCode() * 31;
        Integer num = this.f243441c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<AddressInfo> list = this.f243442d;
        int iD2 = H.d(H.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f243443e), 31, this.f243444f);
        String str = this.f243445g;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f243446h);
        Integer num2 = this.f243447i;
        return iD3 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryAddressesSlotItem(stringId=");
        sb2.append(this.f243440b);
        sb2.append(", selectedAddressId=");
        sb2.append(this.f243441c);
        sb2.append(", addresses=");
        sb2.append(this.f243442d);
        sb2.append(", editButtonTitle=");
        sb2.append(this.f243443e);
        sb2.append(", sheetTitle=");
        sb2.append(this.f243444f);
        sb2.append(", sheetDescription=");
        sb2.append(this.f243445g);
        sb2.append(", sheetSaveButtonTitle=");
        sb2.append(this.f243446h);
        sb2.append(", deliveryAddressFieldId=");
        return s.j(sb2, this.f243447i, ')');
    }
}
