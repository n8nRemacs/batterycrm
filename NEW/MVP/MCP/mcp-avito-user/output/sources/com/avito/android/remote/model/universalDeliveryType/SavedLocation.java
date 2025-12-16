package com.avito.android.remote.model.universalDeliveryType;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.delivery.DeliveryPointRect;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeContent.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;", "pin", "", "zoomLevel", "serviceId", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "iconType", "<init>", "(Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;)V", "component1", "()Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "copy", "(Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;)Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;", "getPin", "Ljava/lang/String;", "getZoomLevel", "getServiceId", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect$PointIconType;", "getIconType", "Coordinates", "Pin", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SavedLocation implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedLocation> CREATOR = new Creator();

    @c("iconType")
    @k
    private final DeliveryPointRect.PointIconType iconType;

    @c("pin")
    @k
    private final Pin pin;

    @c("selectedServiceId")
    @k
    private final String serviceId;

    @c("zoomLevel")
    @k
    private final String zoomLevel;

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "getLongitude", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Coordinates implements Parcelable {

        @k
        public static final Parcelable.Creator<Coordinates> CREATOR = new Creator();

        @c("lat")
        private final double latitude;

        @c(AddressParameter.Value.LNG)
        private final double longitude;

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Coordinates> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Coordinates createFromParcel(@k Parcel parcel) {
                return new Coordinates(parcel.readDouble(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Coordinates[] newArray(int i12) {
                return new Coordinates[i12];
            }
        }

        public Coordinates(double d12, double d13) {
            this.latitude = d12;
            this.longitude = d13;
        }

        public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, double d12, double d13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d12 = coordinates.latitude;
            }
            if ((i12 & 2) != 0) {
                d13 = coordinates.longitude;
            }
            return coordinates.copy(d12, d13);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @k
        public final Coordinates copy(double latitude, double longitude) {
            return new Coordinates(latitude, longitude);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coordinates)) {
                return false;
            }
            Coordinates coordinates = (Coordinates) other;
            return Double.compare(this.latitude, coordinates.latitude) == 0 && Double.compare(this.longitude, coordinates.longitude) == 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Coordinates(latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            return e.o(sb2, this.longitude, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
        }
    }

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavedLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SavedLocation createFromParcel(@k Parcel parcel) {
            return new SavedLocation(Pin.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), DeliveryPointRect.PointIconType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SavedLocation[] newArray(int i12) {
            return new SavedLocation[i12];
        }
    }

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;", "Landroid/os/Parcelable;", "", "", "serviceIds", "fiasGuid", "Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;)Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Pin;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getServiceIds", "Ljava/lang/String;", "getFiasGuid", "Lcom/avito/android/remote/model/universalDeliveryType/SavedLocation$Coordinates;", "getCoordinates", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pin implements Parcelable {

        @k
        public static final Parcelable.Creator<Pin> CREATOR = new Creator();

        @c(ServiceTransportationWidget.LocationField.COORDINATES)
        @k
        private final Coordinates coordinates;

        @c("fiasGuid")
        @k
        private final String fiasGuid;

        @c("serviceIds")
        @k
        private final List<String> serviceIds;

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Pin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Pin createFromParcel(@k Parcel parcel) {
                return new Pin(parcel.createStringArrayList(), parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Pin[] newArray(int i12) {
                return new Pin[i12];
            }
        }

        public Pin(@k List<String> list, @k String str, @k Coordinates coordinates) {
            this.serviceIds = list;
            this.fiasGuid = str;
            this.coordinates = coordinates;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pin copy$default(Pin pin, List list, String str, Coordinates coordinates, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = pin.serviceIds;
            }
            if ((i12 & 2) != 0) {
                str = pin.fiasGuid;
            }
            if ((i12 & 4) != 0) {
                coordinates = pin.coordinates;
            }
            return pin.copy(list, str, coordinates);
        }

        @k
        public final List<String> component1() {
            return this.serviceIds;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getFiasGuid() {
            return this.fiasGuid;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @k
        public final Pin copy(@k List<String> serviceIds, @k String fiasGuid, @k Coordinates coordinates) {
            return new Pin(serviceIds, fiasGuid, coordinates);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return L.f(this.serviceIds, pin.serviceIds) && L.f(this.fiasGuid, pin.fiasGuid) && L.f(this.coordinates, pin.coordinates);
        }

        @k
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @k
        public final String getFiasGuid() {
            return this.fiasGuid;
        }

        @k
        public final List<String> getServiceIds() {
            return this.serviceIds;
        }

        public int hashCode() {
            return this.coordinates.hashCode() + H.d(this.serviceIds.hashCode() * 31, 31, this.fiasGuid);
        }

        @k
        public String toString() {
            return "Pin(serviceIds=" + this.serviceIds + ", fiasGuid=" + this.fiasGuid + ", coordinates=" + this.coordinates + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.serviceIds);
            parcel.writeString(this.fiasGuid);
            this.coordinates.writeToParcel(parcel, flags);
        }
    }

    public SavedLocation(@k Pin pin, @k String str, @k String str2, @k DeliveryPointRect.PointIconType pointIconType) {
        this.pin = pin;
        this.zoomLevel = str;
        this.serviceId = str2;
        this.iconType = pointIconType;
    }

    public static /* synthetic */ SavedLocation copy$default(SavedLocation savedLocation, Pin pin, String str, String str2, DeliveryPointRect.PointIconType pointIconType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            pin = savedLocation.pin;
        }
        if ((i12 & 2) != 0) {
            str = savedLocation.zoomLevel;
        }
        if ((i12 & 4) != 0) {
            str2 = savedLocation.serviceId;
        }
        if ((i12 & 8) != 0) {
            pointIconType = savedLocation.iconType;
        }
        return savedLocation.copy(pin, str, str2, pointIconType);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Pin getPin() {
        return this.pin;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getZoomLevel() {
        return this.zoomLevel;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeliveryPointRect.PointIconType getIconType() {
        return this.iconType;
    }

    @k
    public final SavedLocation copy(@k Pin pin, @k String zoomLevel, @k String serviceId, @k DeliveryPointRect.PointIconType iconType) {
        return new SavedLocation(pin, zoomLevel, serviceId, iconType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedLocation)) {
            return false;
        }
        SavedLocation savedLocation = (SavedLocation) other;
        return L.f(this.pin, savedLocation.pin) && L.f(this.zoomLevel, savedLocation.zoomLevel) && L.f(this.serviceId, savedLocation.serviceId) && this.iconType == savedLocation.iconType;
    }

    @k
    public final DeliveryPointRect.PointIconType getIconType() {
        return this.iconType;
    }

    @k
    public final Pin getPin() {
        return this.pin;
    }

    @k
    public final String getServiceId() {
        return this.serviceId;
    }

    @k
    public final String getZoomLevel() {
        return this.zoomLevel;
    }

    public int hashCode() {
        return this.iconType.hashCode() + H.d(H.d(this.pin.hashCode() * 31, 31, this.zoomLevel), 31, this.serviceId);
    }

    @k
    public String toString() {
        return "SavedLocation(pin=" + this.pin + ", zoomLevel=" + this.zoomLevel + ", serviceId=" + this.serviceId + ", iconType=" + this.iconType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.pin.writeToParcel(parcel, flags);
        parcel.writeString(this.zoomLevel);
        parcel.writeString(this.serviceId);
        parcel.writeString(this.iconType.name());
    }
}
