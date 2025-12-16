package com.avito.android.publish.slots.network_stores_fake_door_slot;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.analytics.T;
import com.avito.android.publish.slots.network_stores_fake_door_slot.h;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.network_stores_fake_door.NetworkStoresFakeDoorSlot;
import com.avito.android.remote.model.category_parameters.slot.network_stores_fake_door.NetworkStoresFakeDoorSlotConfig;
import i31.InterfaceC41220a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkStoresFakeDoorSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/network_stores_fake_door_slot/D;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/network_stores_fake_door/NetworkStoresFakeDoorSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D extends com.avito.android.category_parameters.k<NetworkStoresFakeDoorSlot> implements com.avito.android.publish.slots.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NetworkStoresFakeDoorSlot f244603b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T f244604c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244605d = new com.jakewharton.rxrelay3.c();

    @i31.c
    public D(@InterfaceC41220a @Y61.k NetworkStoresFakeDoorSlot networkStoresFakeDoorSlot, @Y61.k T t12) {
        this.f244603b = networkStoresFakeDoorSlot;
        this.f244604c = t12;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.category_parameters.f> a() {
        return this.f244605d;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244603b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        ArrayList arrayList;
        NetworkStoresFakeDoorSlot networkStoresFakeDoorSlot = this.f244603b;
        NetworkStoresFakeDoorSlotConfig networkStoresFakeDoorSlotConfig = (NetworkStoresFakeDoorSlotConfig) networkStoresFakeDoorSlot.getWidget().getConfig();
        String price = networkStoresFakeDoorSlotConfig.getPrice();
        if (price == null) {
            price = "0";
        }
        this.f244604c.a(price);
        String id2 = networkStoresFakeDoorSlot.getId();
        String title = networkStoresFakeDoorSlotConfig.getTitle();
        List<NetworkStoresFakeDoorSlotConfig.ConditionItem> conditionsList = networkStoresFakeDoorSlotConfig.getConditionsList();
        ArrayList arrayList2 = null;
        if (conditionsList != null) {
            List<NetworkStoresFakeDoorSlotConfig.ConditionItem> list = conditionsList;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (NetworkStoresFakeDoorSlotConfig.ConditionItem conditionItem : list) {
                arrayList3.add(new h.a(conditionItem.getTitle(), conditionItem.getIcon()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<NetworkStoresFakeDoorSlotConfig.InformationCard> informationCards = networkStoresFakeDoorSlotConfig.getInformationCards();
        if (informationCards != null) {
            List<NetworkStoresFakeDoorSlotConfig.InformationCard> list2 = informationCards;
            arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (NetworkStoresFakeDoorSlotConfig.InformationCard informationCard : list2) {
                String text = informationCard.getText();
                Boolean imageGravityToRight = informationCard.getImageGravityToRight();
                arrayList2.add(new h.b(text, Boolean.valueOf(imageGravityToRight != null ? imageGravityToRight.booleanValue() : false), informationCard.getUniversalImage()));
            }
        }
        return Collections.singletonList(new h(id2, title, arrayList, arrayList2, networkStoresFakeDoorSlotConfig.getPrice()));
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
