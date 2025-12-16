package com.avito.android.publish.slots.delivery_addresses;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlotConfig;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAddressesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/m;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/DeliveryAddressesSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.android.category_parameters.k<DeliveryAddressesSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryAddressesSlot f243456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243458d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243459e;

    @i31.c
    public m(@InterfaceC41220a @Y61.k DeliveryAddressesSlot deliveryAddressesSlot, @Y61.k com.avito.android.details.a aVar) {
        this.f243456b = deliveryAddressesSlot;
        this.f243457c = aVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243458d = cVar;
        this.f243459e = cVar;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243459e;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof com.avito.android.publish.slots.delivery_addresses.item.c)) {
            return f.c.f117644b;
        }
        DeliveryAddressesSlot deliveryAddressesSlot = this.f243456b;
        Iterator<T> it = deliveryAddressesSlot.getParameters().iterator();
        while (it.hasNext() && !L.f(((ParameterSlot) it.next()).getId(), String.valueOf(((DeliveryAddressesSlotConfig) deliveryAddressesSlot.getWidget().getConfig()).getDeliveryAddressFieldId()))) {
        }
        ((DeliveryAddressesSlotConfig) deliveryAddressesSlot.getWidget().getConfig()).setSelectedAddressId(((com.avito.android.publish.slots.delivery_addresses.item.c) aVar).f243441c);
        f.b bVar = new f.b(deliveryAddressesSlot.getSlotType(), null);
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = this.f243458d;
        cVar.accept(bVar);
        cVar.accept(new f.a(deliveryAddressesSlot.getSlotType(), deliveryAddressesSlot));
        return new f.b(deliveryAddressesSlot.getSlotType(), null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243456b;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.z<com.avito.android.util.P2<kotlin.G0>> h() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_addresses.m.h():io.reactivex.rxjava3.core.z");
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        AddressInfo addressInfo;
        DeliveryAddressesSlot deliveryAddressesSlot = this.f243456b;
        DeliveryAddressesSlotConfig deliveryAddressesSlotConfig = (DeliveryAddressesSlotConfig) deliveryAddressesSlot.getWidget().getConfig();
        String id2 = deliveryAddressesSlot.getId();
        String editButtonTitle = deliveryAddressesSlotConfig.getEditButtonTitle();
        String sheetTitle = deliveryAddressesSlotConfig.getSheetTitle();
        String sheetDescription = deliveryAddressesSlotConfig.getSheetDescription();
        String sheetSaveButtonTitle = deliveryAddressesSlotConfig.getSheetSaveButtonTitle();
        List<AddressInfo> deliveryAddresses = deliveryAddressesSlotConfig.getDeliveryAddresses();
        Integer selectedAddressId = deliveryAddressesSlotConfig.getSelectedAddressId();
        if (selectedAddressId == null) {
            List<AddressInfo> deliveryAddresses2 = deliveryAddressesSlotConfig.getDeliveryAddresses();
            selectedAddressId = (deliveryAddresses2 == null || (addressInfo = (AddressInfo) C42745f0.E(deliveryAddresses2)) == null) ? null : Integer.valueOf(addressInfo.getAddressId());
        }
        return Collections.singletonList(new com.avito.android.publish.slots.delivery_addresses.item.c(id2, editButtonTitle, sheetTitle, sheetDescription, selectedAddressId, deliveryAddressesSlotConfig.getDeliveryAddressFieldId(), sheetSaveButtonTitle, deliveryAddresses));
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
