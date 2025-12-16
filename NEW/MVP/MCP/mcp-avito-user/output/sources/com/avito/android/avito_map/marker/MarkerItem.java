package com.avito.android.avito_map.marker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.map.Brand;
import com.avito.android.remote.model.search.map.Form;
import com.avito.android.remote.model.search.map.Highlight;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import org.webrtc.h;

/* compiled from: MarkerItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "()V", "LitePin", "MyLocation", "Pin", "Rash", "SpecialPin", "Lcom/avito/android/avito_map/marker/MarkerItem$LitePin;", "Lcom/avito/android/avito_map/marker/MarkerItem$MyLocation;", "Lcom/avito/android/avito_map/marker/MarkerItem$Pin;", "Lcom/avito/android/avito_map/marker/MarkerItem$Rash;", "Lcom/avito/android/avito_map/marker/MarkerItem$SpecialPin;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class MarkerItem implements AvitoMarkerItem {

    /* compiled from: MarkerItem.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BA\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b2\u0010\u0013R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001aR\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem$LitePin;", "Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "Lcom/avito/android/avito_map/marker/MarkerWithId;", "Lcom/avito/android/avito_map/marker/MarkerWithType;", "Lcom/avito/android/avito_map/marker/SelectableMarker;", "", "id", "type", "", "color", "title", "Lcom/google/android/gms/maps/model/LatLng;", ServiceTransportationWidget.LocationField.COORDINATES, "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Z)V", "getMapId", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lcom/google/android/gms/maps/model/LatLng;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Z)Lcom/avito/android/avito_map/marker/MarkerItem$LitePin;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getType", "Ljava/lang/Integer;", "getColor", "getTitle", "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "Z", "getSelected", "setSelected", "(Z)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LitePin extends MarkerItem implements AvitoMarkerItem, MarkerWithId, MarkerWithType, SelectableMarker {

        @k
        public static final Parcelable.Creator<LitePin> CREATOR = new Creator();

        @l
        private final Integer color;

        @k
        private final LatLng coordinates;

        @k
        private final String id;
        private boolean selected;

        @l
        private final String title;

        @k
        private final String type;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LitePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LitePin createFromParcel(@k Parcel parcel) {
                return new LitePin(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (LatLng) parcel.readParcelable(LitePin.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LitePin[] newArray(int i12) {
                return new LitePin[i12];
            }
        }

        public /* synthetic */ LitePin(String str, String str2, Integer num, String str3, LatLng latLng, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : str3, latLng, (i12 & 32) != 0 ? false : z12);
        }

        public static /* synthetic */ LitePin copy$default(LitePin litePin, String str, String str2, Integer num, String str3, LatLng latLng, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = litePin.id;
            }
            if ((i12 & 2) != 0) {
                str2 = litePin.type;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                num = litePin.color;
            }
            Integer num2 = num;
            if ((i12 & 8) != 0) {
                str3 = litePin.title;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                latLng = litePin.coordinates;
            }
            LatLng latLng2 = latLng;
            if ((i12 & 32) != 0) {
                z12 = litePin.selected;
            }
            return litePin.copy(str, str4, num2, str5, latLng2, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final LatLng getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        @k
        public final LitePin copy(@k String id2, @k String type, @l Integer color, @l String title, @k LatLng coordinates, boolean selected) {
            return new LitePin(id2, type, color, title, coordinates, selected);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LitePin)) {
                return false;
            }
            LitePin litePin = (LitePin) other;
            return L.f(this.id, litePin.id) && L.f(this.type, litePin.type) && L.f(this.color, litePin.color) && L.f(this.title, litePin.title) && L.f(this.coordinates, litePin.coordinates) && this.selected == litePin.selected;
        }

        @l
        public final Integer getColor() {
            return this.color;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        /* renamed from: getCoordinates */
        public LatLng getF304960b() {
            return this.coordinates;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithId
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        public String getMapId() {
            return String.format(MarkerItemKt.ID_LITE_MARKER, Arrays.copyOf(new Object[]{getType(), this.title, Boolean.valueOf(getSelected())}, 3));
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public boolean getSelected() {
            return this.selected;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithType
        @k
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.type);
            Integer num = this.color;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.title;
            return Boolean.hashCode(this.selected) + ((this.coordinates.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public void setSelected(boolean z12) {
            this.selected = z12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LitePin(id=");
            sb2.append(this.id);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", color=");
            sb2.append(this.color);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", coordinates=");
            sb2.append(this.coordinates);
            sb2.append(", selected=");
            return r.x(sb2, this.selected, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.type);
            Integer num = this.color;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeParcelable(this.coordinates, flags);
            parcel.writeInt(this.selected ? 1 : 0);
        }

        public LitePin(@k String str, @k String str2, @l Integer num, @l String str3, @k LatLng latLng, boolean z12) {
            super(null);
            this.id = str;
            this.type = str2;
            this.color = num;
            this.title = str3;
            this.coordinates = latLng;
            this.selected = z12;
        }
    }

    /* compiled from: MarkerItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem$MyLocation;", "Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/google/android/gms/maps/model/LatLng;", ServiceTransportationWidget.LocationField.COORDINATES, "", "isApproximated", "", "zoomToMarker", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;ZLjava/lang/Float;)V", "", "getMapId", "()Ljava/lang/String;", "component1", "()Lcom/google/android/gms/maps/model/LatLng;", "component2", "()Z", "component3", "()Ljava/lang/Float;", "copy", "(Lcom/google/android/gms/maps/model/LatLng;ZLjava/lang/Float;)Lcom/avito/android/avito_map/marker/MarkerItem$MyLocation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "Z", "Ljava/lang/Float;", "getZoomToMarker", "setZoomToMarker", "(Ljava/lang/Float;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MyLocation extends MarkerItem {

        @k
        public static final Parcelable.Creator<MyLocation> CREATOR = new Creator();

        @k
        private final LatLng coordinates;
        private final boolean isApproximated;

        @l
        private Float zoomToMarker;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MyLocation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyLocation createFromParcel(@k Parcel parcel) {
                return new MyLocation((LatLng) parcel.readParcelable(MyLocation.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyLocation[] newArray(int i12) {
                return new MyLocation[i12];
            }
        }

        public /* synthetic */ MyLocation(LatLng latLng, boolean z12, Float f12, int i12, C42822w c42822w) {
            this(latLng, z12, (i12 & 4) != 0 ? null : f12);
        }

        public static /* synthetic */ MyLocation copy$default(MyLocation myLocation, LatLng latLng, boolean z12, Float f12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                latLng = myLocation.coordinates;
            }
            if ((i12 & 2) != 0) {
                z12 = myLocation.isApproximated;
            }
            if ((i12 & 4) != 0) {
                f12 = myLocation.zoomToMarker;
            }
            return myLocation.copy(latLng, z12, f12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final LatLng getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsApproximated() {
            return this.isApproximated;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Float getZoomToMarker() {
            return this.zoomToMarker;
        }

        @k
        public final MyLocation copy(@k LatLng coordinates, boolean isApproximated, @l Float zoomToMarker) {
            return new MyLocation(coordinates, isApproximated, zoomToMarker);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MyLocation)) {
                return false;
            }
            MyLocation myLocation = (MyLocation) other;
            return L.f(this.coordinates, myLocation.coordinates) && this.isApproximated == myLocation.isApproximated && L.f(this.zoomToMarker, myLocation.zoomToMarker);
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        /* renamed from: getCoordinates */
        public LatLng getF304960b() {
            return this.coordinates;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        public String getMapId() {
            return MarkerItemKt.ID_MY_LOCATION;
        }

        @Override // com.avito.android.avito_map.marker.MarkerItem, com.avito.android.avito_map.marker.AvitoMarkerItem
        @l
        public Float getZoomToMarker() {
            return this.zoomToMarker;
        }

        public int hashCode() {
            int i12 = r.i(this.coordinates.hashCode() * 31, 31, this.isApproximated);
            Float f12 = this.zoomToMarker;
            return i12 + (f12 == null ? 0 : f12.hashCode());
        }

        @Override // com.avito.android.avito_map.marker.MarkerItem, com.avito.android.avito_map.marker.AvitoMarkerItem
        public boolean isApproximated() {
            return this.isApproximated;
        }

        public void setZoomToMarker(@l Float f12) {
            this.zoomToMarker = f12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MyLocation(coordinates=");
            sb2.append(this.coordinates);
            sb2.append(", isApproximated=");
            sb2.append(this.isApproximated);
            sb2.append(", zoomToMarker=");
            return h.d(sb2, this.zoomToMarker, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.coordinates, flags);
            parcel.writeInt(this.isApproximated ? 1 : 0);
            Float f12 = this.zoomToMarker;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                a.B(parcel, 1, f12);
            }
        }

        public MyLocation(@k LatLng latLng, boolean z12, @l Float f12) {
            super(null);
            this.coordinates = latLng;
            this.isApproximated = z12;
            this.zoomToMarker = f12;
        }
    }

    /* compiled from: MarkerItem.kt */
    @d
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u0095\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u0010\"J\u0012\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u0010\"Jª\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b9\u0010\"J\u0010\u0010:\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b:\u0010*J\u001a\u0010=\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b?\u0010*J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bD\u0010ER\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bH\u0010\"R\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010LR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010*R\"\u0010\u0013\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010&\"\u0004\bQ\u0010LR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bR\u0010\"R\"\u0010\u0015\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\b\u0015\u0010&\"\u0004\bS\u0010LR\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bT\u0010\"R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\bX\u00102R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\bZ\u00104R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\b[\u0010\"R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010F\u001a\u0004\b\\\u0010\"R.\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0]8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010e\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR.\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0f8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bg\u0010_\u0012\u0004\bj\u0010e\u001a\u0004\bh\u0010a\"\u0004\bi\u0010c¨\u0006k"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem$Pin;", "Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/PartialMarker;", "Lcom/avito/android/avito_map/marker/MarkerWithPrice;", "Lcom/avito/android/avito_map/marker/MarkerWithMultipleItemIds;", "Lcom/avito/android/avito_map/marker/MarkerWithIdAndContext;", "Lcom/avito/android/avito_map/marker/MarkerWithHighlight;", "Lcom/avito/android/avito_map/marker/MarkerWithForm;", "Lcom/avito/android/avito_map/marker/MarkerWithBrand;", "Lcom/avito/android/avito_map/marker/MarkerWithIcon;", "", "id", "text", "", "selected", "Lcom/google/android/gms/maps/model/LatLng;", ServiceTransportationWidget.LocationField.COORDINATES, "", "count", "isViewed", "price", "isFavorite", "favoritesIds", "Lcom/avito/android/remote/model/search/map/Form;", "form", "Lcom/avito/android/remote/model/search/map/Highlight;", ServiceTypeKt.SERVICE_HIGHLIGHT, "Lcom/avito/android/remote/model/search/map/Brand;", "brand", "context", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/maps/model/LatLng;IZLjava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/search/map/Form;Lcom/avito/android/remote/model/search/map/Highlight;Lcom/avito/android/remote/model/search/map/Brand;Ljava/lang/String;Ljava/lang/String;)V", "getMapId", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "()Lcom/google/android/gms/maps/model/LatLng;", "component5", "()I", "component6", "component7", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/search/map/Form;", "component11", "()Lcom/avito/android/remote/model/search/map/Highlight;", "component12", "()Lcom/avito/android/remote/model/search/map/Brand;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/maps/model/LatLng;IZLjava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/search/map/Form;Lcom/avito/android/remote/model/search/map/Highlight;Lcom/avito/android/remote/model/search/map/Brand;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/avito_map/marker/MarkerItem$Pin;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getText", "Z", "getSelected", "setSelected", "(Z)V", "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "I", "getCount", "setViewed", "getPrice", "setFavorite", "getFavoritesIds", "Lcom/avito/android/remote/model/search/map/Form;", "getForm", "Lcom/avito/android/remote/model/search/map/Highlight;", "getHighlight", "Lcom/avito/android/remote/model/search/map/Brand;", "getBrand", "getContext", "getIcon", "", "listIds", "Ljava/util/List;", "getListIds", "()Ljava/util/List;", "setListIds", "(Ljava/util/List;)V", "getListIds$annotations", "()V", "", "listFavoritesIds", "getListFavoritesIds", "setListFavoritesIds", "getListFavoritesIds$annotations", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pin extends MarkerItem implements PartialMarker, MarkerWithPrice, MarkerWithMultipleItemIds, MarkerWithIdAndContext, MarkerWithHighlight, MarkerWithForm, MarkerWithBrand, MarkerWithIcon {

        @k
        public static final Parcelable.Creator<Pin> CREATOR = new Creator();

        @l
        private final Brand brand;

        @l
        private final String context;

        @k
        private final LatLng coordinates;
        private final int count;

        @k
        private final String favoritesIds;

        @l
        private final Form form;

        @l
        private final Highlight highlight;

        @l
        private final String icon;

        @k
        private final String id;
        private boolean isFavorite;
        private boolean isViewed;

        @k
        private List<String> listFavoritesIds;

        @k
        private List<String> listIds;

        @l
        private final String price;
        private boolean selected;

        @l
        private final String text;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Pin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Pin createFromParcel(@k Parcel parcel) {
                return new Pin(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (LatLng) parcel.readParcelable(Pin.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Form.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Highlight.valueOf(parcel.readString()), (Brand) parcel.readParcelable(Pin.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Pin[] newArray(int i12) {
                return new Pin[i12];
            }
        }

        public /* synthetic */ Pin(String str, String str2, boolean z12, LatLng latLng, int i12, boolean z13, String str3, boolean z14, String str4, Form form, Highlight highlight, Brand brand, String str5, String str6, int i13, C42822w c42822w) {
            this(str, str2, z12, latLng, i12, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? false : z14, str4, (i13 & 512) != 0 ? null : form, (i13 & 1024) != 0 ? null : highlight, (i13 & 2048) != 0 ? null : brand, (i13 & 4096) != 0 ? null : str5, (i13 & 8192) != 0 ? null : str6);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Form getForm() {
            return this.form;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final Highlight getHighlight() {
            return this.highlight;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Brand getBrand() {
            return this.brand;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final LatLng getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsViewed() {
            return this.isViewed;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final String getFavoritesIds() {
            return this.favoritesIds;
        }

        @k
        public final Pin copy(@k String id2, @l String text, boolean selected, @k LatLng coordinates, int count, boolean isViewed, @l String price, boolean isFavorite, @k String favoritesIds, @l Form form, @l Highlight highlight, @l Brand brand, @l String context, @l String icon) {
            return new Pin(id2, text, selected, coordinates, count, isViewed, price, isFavorite, favoritesIds, form, highlight, brand, context, icon);
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
            return L.f(this.id, pin.id) && L.f(this.text, pin.text) && this.selected == pin.selected && L.f(this.coordinates, pin.coordinates) && this.count == pin.count && this.isViewed == pin.isViewed && L.f(this.price, pin.price) && this.isFavorite == pin.isFavorite && L.f(this.favoritesIds, pin.favoritesIds) && this.form == pin.form && this.highlight == pin.highlight && L.f(this.brand, pin.brand) && L.f(this.context, pin.context) && L.f(this.icon, pin.icon);
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithBrand
        @l
        public Brand getBrand() {
            return this.brand;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithContext
        @l
        public String getContext() {
            return this.context;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        /* renamed from: getCoordinates */
        public LatLng getF304960b() {
            return this.coordinates;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithCount
        public int getCount() {
            return this.count;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        @k
        public String getFavoritesIds() {
            return this.favoritesIds;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithForm
        @l
        public Form getForm() {
            return this.form;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithHighlight
        @l
        public Highlight getHighlight() {
            return this.highlight;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithIcon
        @l
        public String getIcon() {
            return this.icon;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithId
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        @k
        public List<String> getListFavoritesIds() {
            return this.listFavoritesIds;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithMultipleItemIds
        @k
        public List<String> getListIds() {
            return this.listIds;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        public String getMapId() {
            return String.format(MarkerItemKt.ID_MARKER, Arrays.copyOf(new Object[]{Integer.valueOf(getCount()), Boolean.valueOf(isViewed()), Boolean.valueOf(getSelected()), getPrice(), Boolean.valueOf(isFavorite()), getHighlight(), getForm(), getBrand(), getIcon()}, 9));
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithPrice
        @l
        public String getPrice() {
            return this.price;
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public boolean getSelected() {
            return this.selected;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithText
        @l
        public String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.text;
            int i12 = r.i(r.e(this.count, (this.coordinates.hashCode() + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.selected)) * 31, 31), 31, this.isViewed);
            String str2 = this.price;
            int iD2 = H.d(r.i((i12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isFavorite), 31, this.favoritesIds);
            Form form = this.form;
            int iHashCode2 = (iD2 + (form == null ? 0 : form.hashCode())) * 31;
            Highlight highlight = this.highlight;
            int iHashCode3 = (iHashCode2 + (highlight == null ? 0 : highlight.hashCode())) * 31;
            Brand brand = this.brand;
            int iHashCode4 = (iHashCode3 + (brand == null ? 0 : brand.hashCode())) * 31;
            String str3 = this.context;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.icon;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public boolean isFavorite() {
            return this.isFavorite;
        }

        @Override // com.avito.android.avito_map.marker.ViewableMarker
        public boolean isViewed() {
            return this.isViewed;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public void setFavorite(boolean z12) {
            this.isFavorite = z12;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public void setListFavoritesIds(@k List<String> list) {
            this.listFavoritesIds = list;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithMultipleItemIds
        public void setListIds(@k List<String> list) {
            this.listIds = list;
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public void setSelected(boolean z12) {
            this.selected = z12;
        }

        @Override // com.avito.android.avito_map.marker.ViewableMarker
        public void setViewed(boolean z12) {
            this.isViewed = z12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Pin(id=");
            sb2.append(this.id);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", selected=");
            sb2.append(this.selected);
            sb2.append(", coordinates=");
            sb2.append(this.coordinates);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", isViewed=");
            sb2.append(this.isViewed);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", isFavorite=");
            sb2.append(this.isFavorite);
            sb2.append(", favoritesIds=");
            sb2.append(this.favoritesIds);
            sb2.append(", form=");
            sb2.append(this.form);
            sb2.append(", highlight=");
            sb2.append(this.highlight);
            sb2.append(", brand=");
            sb2.append(this.brand);
            sb2.append(", context=");
            sb2.append(this.context);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.icon, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.text);
            parcel.writeInt(this.selected ? 1 : 0);
            parcel.writeParcelable(this.coordinates, flags);
            parcel.writeInt(this.count);
            parcel.writeInt(this.isViewed ? 1 : 0);
            parcel.writeString(this.price);
            parcel.writeInt(this.isFavorite ? 1 : 0);
            parcel.writeString(this.favoritesIds);
            Form form = this.form;
            if (form == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(form.name());
            }
            Highlight highlight = this.highlight;
            if (highlight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(highlight.name());
            }
            parcel.writeParcelable(this.brand, flags);
            parcel.writeString(this.context);
            parcel.writeString(this.icon);
        }

        public Pin(@k String str, @l String str2, boolean z12, @k LatLng latLng, int i12, boolean z13, @l String str3, boolean z14, @k String str4, @l Form form, @l Highlight highlight, @l Brand brand, @l String str5, @l String str6) {
            super(null);
            this.id = str;
            this.text = str2;
            this.selected = z12;
            this.coordinates = latLng;
            this.count = i12;
            this.isViewed = z13;
            this.price = str3;
            this.isFavorite = z14;
            this.favoritesIds = str4;
            this.form = form;
            this.highlight = highlight;
            this.brand = brand;
            this.context = str5;
            this.icon = str6;
            this.listIds = C43066x.f0(getId(), new String[]{","}, 0, 6);
            this.listFavoritesIds = new ArrayList(C43066x.f0(getFavoritesIds(), new String[]{","}, 0, 6));
        }

        public static /* synthetic */ void getListFavoritesIds$annotations() {
        }

        public static /* synthetic */ void getListIds$annotations() {
        }
    }

    /* compiled from: MarkerItem.kt */
    @d
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006Bq\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ\u0086\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010#J\u001a\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b4\u0010#J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010@R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bC\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010#R\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010=\u001a\u0004\b\u0010\u0010\u001e\"\u0004\bF\u0010@R\"\u0010\u0011\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010=\u001a\u0004\b\u0011\u0010\u001e\"\u0004\bG\u0010@R\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\bH\u0010\u001bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bM\u0010\u001bR.\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070N8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00070W8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bX\u0010P\u0012\u0004\b[\u0010V\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010T¨\u0006\\"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem$Rash;", "Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/PartialMarker;", "Lcom/avito/android/avito_map/marker/MarkerWithMultipleItemIds;", "Lcom/avito/android/avito_map/marker/MarkerWithIdAndContext;", "Lcom/avito/android/avito_map/marker/MarkerWithHighlight;", "Lcom/avito/android/avito_map/marker/MarkerWithForm;", "", "id", "", "selected", "Lcom/google/android/gms/maps/model/LatLng;", ServiceTransportationWidget.LocationField.COORDINATES, "text", "", "count", "isViewed", "isFavorite", "favoritesIds", "Lcom/avito/android/remote/model/search/map/Form;", "form", "Lcom/avito/android/remote/model/search/map/Highlight;", ServiceTypeKt.SERVICE_HIGHLIGHT, "context", "<init>", "(Ljava/lang/String;ZLcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;IZZLjava/lang/String;Lcom/avito/android/remote/model/search/map/Form;Lcom/avito/android/remote/model/search/map/Highlight;Ljava/lang/String;)V", "getMapId", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "()Lcom/google/android/gms/maps/model/LatLng;", "component4", "component5", "()I", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/search/map/Form;", "component10", "()Lcom/avito/android/remote/model/search/map/Highlight;", "component11", "copy", "(Ljava/lang/String;ZLcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;IZZLjava/lang/String;Lcom/avito/android/remote/model/search/map/Form;Lcom/avito/android/remote/model/search/map/Highlight;Ljava/lang/String;)Lcom/avito/android/avito_map/marker/MarkerItem$Rash;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Z", "getSelected", "setSelected", "(Z)V", "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "getText", "I", "getCount", "setViewed", "setFavorite", "getFavoritesIds", "Lcom/avito/android/remote/model/search/map/Form;", "getForm", "Lcom/avito/android/remote/model/search/map/Highlight;", "getHighlight", "getContext", "", "listIds", "Ljava/util/List;", "getListIds", "()Ljava/util/List;", "setListIds", "(Ljava/util/List;)V", "getListIds$annotations", "()V", "", "listFavoritesIds", "getListFavoritesIds", "setListFavoritesIds", "getListFavoritesIds$annotations", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Rash extends MarkerItem implements PartialMarker, MarkerWithMultipleItemIds, MarkerWithIdAndContext, MarkerWithHighlight, MarkerWithForm {

        @k
        public static final Parcelable.Creator<Rash> CREATOR = new Creator();

        @l
        private final String context;

        @k
        private final LatLng coordinates;
        private final int count;

        @k
        private final String favoritesIds;

        @l
        private final Form form;

        @l
        private final Highlight highlight;

        @k
        private final String id;
        private boolean isFavorite;
        private boolean isViewed;

        @k
        private List<String> listFavoritesIds;

        @k
        private List<String> listIds;
        private boolean selected;

        @l
        private final String text;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Rash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Rash createFromParcel(@k Parcel parcel) {
                return new Rash(parcel.readString(), parcel.readInt() != 0, (LatLng) parcel.readParcelable(Rash.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Form.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Highlight.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Rash[] newArray(int i12) {
                return new Rash[i12];
            }
        }

        public /* synthetic */ Rash(String str, boolean z12, LatLng latLng, String str2, int i12, boolean z13, boolean z14, String str3, Form form, Highlight highlight, String str4, int i13, C42822w c42822w) {
            this(str, z12, latLng, str2, i12, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, str3, (i13 & 256) != 0 ? null : form, (i13 & 512) != 0 ? null : highlight, (i13 & 1024) != 0 ? null : str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Highlight getHighlight() {
            return this.highlight;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final LatLng getCoordinates() {
            return this.coordinates;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsViewed() {
            return this.isViewed;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        @k
        /* renamed from: component8, reason: from getter */
        public final String getFavoritesIds() {
            return this.favoritesIds;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Form getForm() {
            return this.form;
        }

        @k
        public final Rash copy(@k String id2, boolean selected, @k LatLng coordinates, @l String text, int count, boolean isViewed, boolean isFavorite, @k String favoritesIds, @l Form form, @l Highlight highlight, @l String context) {
            return new Rash(id2, selected, coordinates, text, count, isViewed, isFavorite, favoritesIds, form, highlight, context);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rash)) {
                return false;
            }
            Rash rash = (Rash) other;
            return L.f(this.id, rash.id) && this.selected == rash.selected && L.f(this.coordinates, rash.coordinates) && L.f(this.text, rash.text) && this.count == rash.count && this.isViewed == rash.isViewed && this.isFavorite == rash.isFavorite && L.f(this.favoritesIds, rash.favoritesIds) && this.form == rash.form && this.highlight == rash.highlight && L.f(this.context, rash.context);
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithContext
        @l
        public String getContext() {
            return this.context;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        /* renamed from: getCoordinates */
        public LatLng getF304960b() {
            return this.coordinates;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithCount
        public int getCount() {
            return this.count;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        @k
        public String getFavoritesIds() {
            return this.favoritesIds;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithForm
        @l
        public Form getForm() {
            return this.form;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithHighlight
        @l
        public Highlight getHighlight() {
            return this.highlight;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithId
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        @k
        public List<String> getListFavoritesIds() {
            return this.listFavoritesIds;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithMultipleItemIds
        @k
        public List<String> getListIds() {
            return this.listIds;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        public String getMapId() {
            return String.format(MarkerItemKt.ID_RASH, Arrays.copyOf(new Object[]{Integer.valueOf(getCount()), Boolean.valueOf(isViewed()), Boolean.valueOf(getSelected()), Boolean.valueOf(isFavorite()), getHighlight(), getForm()}, 6));
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public boolean getSelected() {
            return this.selected;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithText
        @l
        public String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = (this.coordinates.hashCode() + r.i(this.id.hashCode() * 31, 31, this.selected)) * 31;
            String str = this.text;
            int iD2 = H.d(r.i(r.i(r.e(this.count, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isViewed), 31, this.isFavorite), 31, this.favoritesIds);
            Form form = this.form;
            int iHashCode2 = (iD2 + (form == null ? 0 : form.hashCode())) * 31;
            Highlight highlight = this.highlight;
            int iHashCode3 = (iHashCode2 + (highlight == null ? 0 : highlight.hashCode())) * 31;
            String str2 = this.context;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public boolean isFavorite() {
            return this.isFavorite;
        }

        @Override // com.avito.android.avito_map.marker.ViewableMarker
        public boolean isViewed() {
            return this.isViewed;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public void setFavorite(boolean z12) {
            this.isFavorite = z12;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithFavorite
        public void setListFavoritesIds(@k List<String> list) {
            this.listFavoritesIds = list;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithMultipleItemIds
        public void setListIds(@k List<String> list) {
            this.listIds = list;
        }

        @Override // com.avito.android.avito_map.marker.SelectableMarker
        public void setSelected(boolean z12) {
            this.selected = z12;
        }

        @Override // com.avito.android.avito_map.marker.ViewableMarker
        public void setViewed(boolean z12) {
            this.isViewed = z12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Rash(id=");
            sb2.append(this.id);
            sb2.append(", selected=");
            sb2.append(this.selected);
            sb2.append(", coordinates=");
            sb2.append(this.coordinates);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", isViewed=");
            sb2.append(this.isViewed);
            sb2.append(", isFavorite=");
            sb2.append(this.isFavorite);
            sb2.append(", favoritesIds=");
            sb2.append(this.favoritesIds);
            sb2.append(", form=");
            sb2.append(this.form);
            sb2.append(", highlight=");
            sb2.append(this.highlight);
            sb2.append(", context=");
            return C22026a.c(sb2, this.context, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeInt(this.selected ? 1 : 0);
            parcel.writeParcelable(this.coordinates, flags);
            parcel.writeString(this.text);
            parcel.writeInt(this.count);
            parcel.writeInt(this.isViewed ? 1 : 0);
            parcel.writeInt(this.isFavorite ? 1 : 0);
            parcel.writeString(this.favoritesIds);
            Form form = this.form;
            if (form == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(form.name());
            }
            Highlight highlight = this.highlight;
            if (highlight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(highlight.name());
            }
            parcel.writeString(this.context);
        }

        public Rash(@k String str, boolean z12, @k LatLng latLng, @l String str2, int i12, boolean z13, boolean z14, @k String str3, @l Form form, @l Highlight highlight, @l String str4) {
            super(null);
            this.id = str;
            this.selected = z12;
            this.coordinates = latLng;
            this.text = str2;
            this.count = i12;
            this.isViewed = z13;
            this.isFavorite = z14;
            this.favoritesIds = str3;
            this.form = form;
            this.highlight = highlight;
            this.context = str4;
            this.listIds = C43066x.f0(getId(), new String[]{","}, 0, 6);
            this.listFavoritesIds = new ArrayList(C43066x.f0(getFavoritesIds(), new String[]{","}, 0, 6));
        }

        public static /* synthetic */ void getListFavoritesIds$annotations() {
        }

        public static /* synthetic */ void getListIds$annotations() {
        }
    }

    /* compiled from: MarkerItem.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerItem$SpecialPin;", "Lcom/avito/android/avito_map/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/MarkerWithId;", "", "id", "Lcom/google/android/gms/maps/model/LatLng;", ServiceTransportationWidget.LocationField.COORDINATES, "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V", "getMapId", "()Ljava/lang/String;", "component1", "component2", "()Lcom/google/android/gms/maps/model/LatLng;", "copy", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)Lcom/avito/android/avito_map/marker/MarkerItem$SpecialPin;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/google/android/gms/maps/model/LatLng;", "getCoordinates", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpecialPin extends MarkerItem implements MarkerWithId {

        @k
        public static final Parcelable.Creator<SpecialPin> CREATOR = new Creator();

        @k
        private final LatLng coordinates;

        @k
        private final String id;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SpecialPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SpecialPin createFromParcel(@k Parcel parcel) {
                return new SpecialPin(parcel.readString(), (LatLng) parcel.readParcelable(SpecialPin.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SpecialPin[] newArray(int i12) {
                return new SpecialPin[i12];
            }
        }

        public SpecialPin(@k String str, @k LatLng latLng) {
            super(null);
            this.id = str;
            this.coordinates = latLng;
        }

        public static /* synthetic */ SpecialPin copy$default(SpecialPin specialPin, String str, LatLng latLng, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = specialPin.id;
            }
            if ((i12 & 2) != 0) {
                latLng = specialPin.coordinates;
            }
            return specialPin.copy(str, latLng);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final LatLng getCoordinates() {
            return this.coordinates;
        }

        @k
        public final SpecialPin copy(@k String id2, @k LatLng coordinates) {
            return new SpecialPin(id2, coordinates);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpecialPin)) {
                return false;
            }
            SpecialPin specialPin = (SpecialPin) other;
            return L.f(this.id, specialPin.id) && L.f(this.coordinates, specialPin.coordinates);
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        /* renamed from: getCoordinates */
        public LatLng getF304960b() {
            return this.coordinates;
        }

        @Override // com.avito.android.avito_map.marker.MarkerWithId
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @k
        public String getMapId() {
            return String.format(MarkerItemKt.ID_SPECIAL_PIN, Arrays.copyOf(new Object[]{getF304960b()}, 1));
        }

        public int hashCode() {
            return this.coordinates.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            return "SpecialPin(id=" + this.id + ", coordinates=" + this.coordinates + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeParcelable(this.coordinates, flags);
        }
    }

    public /* synthetic */ MarkerItem(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
    @l
    public Float getZoomToMarker() {
        return AvitoMarkerItem.DefaultImpls.getZoomToMarker(this);
    }

    @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
    public boolean isApproximated() {
        return AvitoMarkerItem.DefaultImpls.isApproximated(this);
    }

    private MarkerItem() {
    }
}
