package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryPointRect.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001aR\u0014\u00109\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0015¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/delivery/Markerable;", "", "", "serviceIds", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "fiasGuid", "hint", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "iconType", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onSelectEvent", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/Coordinates;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "component6", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getServiceIds", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Ljava/lang/String;", "getFiasGuid", "getHint", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "getIconType", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getOnSelectEvent", "getId", "id", "PointIconType", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryPointRect implements Parcelable, Markerable {

    @k
    public static final Parcelable.Creator<DeliveryPointRect> CREATOR = new Creator();

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final Coordinates coordinates;

    @c("fiasGuid")
    @k
    private final String fiasGuid;

    @c("hint")
    @l
    private final String hint;

    @c("iconType")
    @l
    private final PointIconType iconType;

    @c("onSelectEvent")
    @l
    private final ParametrizedEvent onSelectEvent;

    @c("serviceIds")
    @k
    private final List<String> serviceIds;

    /* compiled from: DeliveryPointRect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryPointRect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPointRect createFromParcel(@k Parcel parcel) {
            return new DeliveryPointRect(parcel.createStringArrayList(), (Coordinates) parcel.readParcelable(DeliveryPointRect.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PointIconType.valueOf(parcel.readString()), (ParametrizedEvent) parcel.readParcelable(DeliveryPointRect.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPointRect[] newArray(int i12) {
            return new DeliveryPointRect[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeliveryPointRect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "", "(Ljava/lang/String;I)V", "AVITO", "POSTAMAT", "PVZ", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PointIconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PointIconType[] $VALUES;

        @c("avito")
        public static final PointIconType AVITO = new PointIconType("AVITO", 0);

        @c("postamat")
        public static final PointIconType POSTAMAT = new PointIconType("POSTAMAT", 1);

        @c("pvz")
        public static final PointIconType PVZ = new PointIconType("PVZ", 2);

        private static final /* synthetic */ PointIconType[] $values() {
            return new PointIconType[]{AVITO, POSTAMAT, PVZ};
        }

        static {
            PointIconType[] pointIconTypeArr$values = $values();
            $VALUES = pointIconTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(pointIconTypeArr$values);
        }

        private PointIconType(String str, int i12) {
        }

        @k
        public static a<PointIconType> getEntries() {
            return $ENTRIES;
        }

        public static PointIconType valueOf(String str) {
            return (PointIconType) Enum.valueOf(PointIconType.class, str);
        }

        public static PointIconType[] values() {
            return (PointIconType[]) $VALUES.clone();
        }
    }

    public DeliveryPointRect(@k List<String> list, @k Coordinates coordinates, @k String str, @l String str2, @l PointIconType pointIconType, @l ParametrizedEvent parametrizedEvent) {
        this.serviceIds = list;
        this.coordinates = coordinates;
        this.fiasGuid = str;
        this.hint = str2;
        this.iconType = pointIconType;
        this.onSelectEvent = parametrizedEvent;
    }

    public static /* synthetic */ DeliveryPointRect copy$default(DeliveryPointRect deliveryPointRect, List list, Coordinates coordinates, String str, String str2, PointIconType pointIconType, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = deliveryPointRect.serviceIds;
        }
        if ((i12 & 2) != 0) {
            coordinates = deliveryPointRect.coordinates;
        }
        Coordinates coordinates2 = coordinates;
        if ((i12 & 4) != 0) {
            str = deliveryPointRect.fiasGuid;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            str2 = deliveryPointRect.hint;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            pointIconType = deliveryPointRect.iconType;
        }
        PointIconType pointIconType2 = pointIconType;
        if ((i12 & 32) != 0) {
            parametrizedEvent = deliveryPointRect.onSelectEvent;
        }
        return deliveryPointRect.copy(list, coordinates2, str3, str4, pointIconType2, parametrizedEvent);
    }

    @k
    public final List<String> component1() {
        return this.serviceIds;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getFiasGuid() {
        return this.fiasGuid;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final PointIconType getIconType() {
        return this.iconType;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ParametrizedEvent getOnSelectEvent() {
        return this.onSelectEvent;
    }

    @k
    public final DeliveryPointRect copy(@k List<String> serviceIds, @k Coordinates coordinates, @k String fiasGuid, @l String hint, @l PointIconType iconType, @l ParametrizedEvent onSelectEvent) {
        return new DeliveryPointRect(serviceIds, coordinates, fiasGuid, hint, iconType, onSelectEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryPointRect)) {
            return false;
        }
        DeliveryPointRect deliveryPointRect = (DeliveryPointRect) other;
        return L.f(this.serviceIds, deliveryPointRect.serviceIds) && L.f(this.coordinates, deliveryPointRect.coordinates) && L.f(this.fiasGuid, deliveryPointRect.fiasGuid) && L.f(this.hint, deliveryPointRect.hint) && this.iconType == deliveryPointRect.iconType && L.f(this.onSelectEvent, deliveryPointRect.onSelectEvent);
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    public final String getFiasGuid() {
        return this.fiasGuid;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final PointIconType getIconType() {
        return this.iconType;
    }

    @Override // com.avito.android.remote.model.delivery.Markerable
    @k
    public String getId() {
        return this.coordinates.toString();
    }

    @l
    public final ParametrizedEvent getOnSelectEvent() {
        return this.onSelectEvent;
    }

    @k
    public final List<String> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        int iD2 = H.d((this.coordinates.hashCode() + (this.serviceIds.hashCode() * 31)) * 31, 31, this.fiasGuid);
        String str = this.hint;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        PointIconType pointIconType = this.iconType;
        int iHashCode2 = (iHashCode + (pointIconType == null ? 0 : pointIconType.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onSelectEvent;
        return iHashCode2 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryPointRect(serviceIds=");
        sb2.append(this.serviceIds);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", fiasGuid=");
        sb2.append(this.fiasGuid);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", iconType=");
        sb2.append(this.iconType);
        sb2.append(", onSelectEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onSelectEvent, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.serviceIds);
        parcel.writeParcelable(this.coordinates, flags);
        parcel.writeString(this.fiasGuid);
        parcel.writeString(this.hint);
        PointIconType pointIconType = this.iconType;
        if (pointIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pointIconType.name());
        }
        parcel.writeParcelable(this.onSelectEvent, flags);
    }
}
