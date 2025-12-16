package com.avito.android.publish.slots.delivery_all_toggles.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAllTogglesSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final BooleanParameter f243473a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final BooleanParameter f243474b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final BooleanParameter f243475c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final BooleanParameter f243476d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final BooleanParameter f243477e;

    public a(@Y61.l BooleanParameter booleanParameter, @Y61.l BooleanParameter booleanParameter2, @Y61.l BooleanParameter booleanParameter3, @Y61.l BooleanParameter booleanParameter4, @Y61.l BooleanParameter booleanParameter5) {
        this.f243473a = booleanParameter;
        this.f243474b = booleanParameter2;
        this.f243475c = booleanParameter3;
        this.f243476d = booleanParameter4;
        this.f243477e = booleanParameter5;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f243473a, aVar.f243473a) && L.f(this.f243474b, aVar.f243474b) && L.f(this.f243475c, aVar.f243475c) && L.f(this.f243476d, aVar.f243476d) && L.f(this.f243477e, aVar.f243477e);
    }

    public final int hashCode() {
        BooleanParameter booleanParameter = this.f243473a;
        int iHashCode = (booleanParameter == null ? 0 : booleanParameter.hashCode()) * 31;
        BooleanParameter booleanParameter2 = this.f243474b;
        int iHashCode2 = (iHashCode + (booleanParameter2 == null ? 0 : booleanParameter2.hashCode())) * 31;
        BooleanParameter booleanParameter3 = this.f243475c;
        int iHashCode3 = (iHashCode2 + (booleanParameter3 == null ? 0 : booleanParameter3.hashCode())) * 31;
        BooleanParameter booleanParameter4 = this.f243476d;
        int iHashCode4 = (iHashCode3 + (booleanParameter4 == null ? 0 : booleanParameter4.hashCode())) * 31;
        BooleanParameter booleanParameter5 = this.f243477e;
        return iHashCode4 + (booleanParameter5 != null ? booleanParameter5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "DeliveryAllTogglesBottomSheetData(pvz=" + this.f243473a + ", courier=" + this.f243474b + ", postamat=" + this.f243475c + ", dbsCourier=" + this.f243476d + ", dbs=" + this.f243477e + ')';
    }
}
