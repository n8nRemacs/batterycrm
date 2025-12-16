package com.avito.android.universal_map.map.common.marker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarkerItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "()V", "Cluster", "ClusterWithLabel", "MyLocation", "Pin", "PinWithLabel", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem$Cluster;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem$ClusterWithLabel;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem$MyLocation;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem$Pin;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem$PinWithLabel;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MarkerItem implements AvitoMarkerItem {

    /* compiled from: MarkerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem$Cluster;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cluster extends MarkerItem {

        @Y61.k
        public static final Parcelable.Creator<Cluster> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f304949b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LatLng f304950c;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cluster> {
            @Override // android.os.Parcelable.Creator
            public final Cluster createFromParcel(Parcel parcel) {
                return new Cluster(parcel.readString(), (LatLng) parcel.readParcelable(Cluster.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Cluster[] newArray(int i12) {
                return new Cluster[i12];
            }
        }

        public Cluster(@Y61.k String str, @Y61.k LatLng latLng) {
            super(null);
            this.f304949b = str;
            this.f304950c = latLng;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cluster)) {
                return false;
            }
            Cluster cluster = (Cluster) obj;
            return L.f(this.f304949b, cluster.f304949b) && L.f(this.f304950c, cluster.f304950c);
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        /* renamed from: getCoordinates, reason: from getter */
        public final LatLng getF304960b() {
            return this.f304950c;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        public final String getMapId() {
            return String.format("cluster_%s", Arrays.copyOf(new Object[]{this.f304949b}, 1));
        }

        public final int hashCode() {
            return this.f304950c.hashCode() + (this.f304949b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Cluster(text=" + this.f304949b + ", coordinates=" + this.f304950c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f304949b);
            parcel.writeParcelable(this.f304950c, i12);
        }
    }

    /* compiled from: MarkerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem$ClusterWithLabel;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClusterWithLabel extends MarkerItem {

        @Y61.k
        public static final Parcelable.Creator<ClusterWithLabel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LatLng f304951b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f304952c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f304953d;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClusterWithLabel> {
            @Override // android.os.Parcelable.Creator
            public final ClusterWithLabel createFromParcel(Parcel parcel) {
                return new ClusterWithLabel((LatLng) parcel.readParcelable(ClusterWithLabel.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ClusterWithLabel[] newArray(int i12) {
                return new ClusterWithLabel[i12];
            }
        }

        public ClusterWithLabel(@Y61.k LatLng latLng, @Y61.l String str, @Y61.k String str2) {
            super(null);
            this.f304951b = latLng;
            this.f304952c = str;
            this.f304953d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClusterWithLabel)) {
                return false;
            }
            ClusterWithLabel clusterWithLabel = (ClusterWithLabel) obj;
            return L.f(this.f304951b, clusterWithLabel.f304951b) && L.f(this.f304952c, clusterWithLabel.f304952c) && L.f(this.f304953d, clusterWithLabel.f304953d);
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        /* renamed from: getCoordinates, reason: from getter */
        public final LatLng getF304960b() {
            return this.f304951b;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        public final String getMapId() {
            return String.format("cluster_with_label_%s%s", Arrays.copyOf(new Object[]{this.f304952c, this.f304953d}, 2));
        }

        public final int hashCode() {
            int iHashCode = this.f304951b.hashCode() * 31;
            String str = this.f304952c;
            return this.f304953d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClusterWithLabel(coordinates=");
            sb2.append(this.f304951b);
            sb2.append(", labelText=");
            sb2.append(this.f304952c);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f304953d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f304951b, i12);
            parcel.writeString(this.f304952c);
            parcel.writeString(this.f304953d);
        }
    }

    /* compiled from: MarkerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem$MyLocation;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyLocation extends MarkerItem {

        @Y61.k
        public static final Parcelable.Creator<MyLocation> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LatLng f304954b;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MyLocation> {
            @Override // android.os.Parcelable.Creator
            public final MyLocation createFromParcel(Parcel parcel) {
                return new MyLocation((LatLng) parcel.readParcelable(MyLocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MyLocation[] newArray(int i12) {
                return new MyLocation[i12];
            }
        }

        public MyLocation(@Y61.k LatLng latLng) {
            super(null);
            this.f304954b = latLng;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        /* renamed from: getCoordinates, reason: from getter */
        public final LatLng getF304960b() {
            return this.f304954b;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        public final String getMapId() {
            return "my_location";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f304954b, i12);
        }
    }

    /* compiled from: MarkerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem$Pin;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pin extends MarkerItem {

        @Y61.k
        public static final Parcelable.Creator<Pin> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LatLng f304955b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f304956c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f304957d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f304958e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Marker.Pin.IconType f304959f;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Pin> {
            @Override // android.os.Parcelable.Creator
            public final Pin createFromParcel(Parcel parcel) {
                return new Pin((LatLng) parcel.readParcelable(Pin.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Marker.Pin.IconType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Pin[] newArray(int i12) {
                return new Pin[i12];
            }
        }

        public /* synthetic */ Pin(LatLng latLng, boolean z12, String str, Integer num, Marker.Pin.IconType iconType, int i12, C42822w c42822w) {
            this(latLng, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : iconType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return L.f(this.f304955b, pin.f304955b) && this.f304956c == pin.f304956c && L.f(this.f304957d, pin.f304957d) && L.f(this.f304958e, pin.f304958e) && this.f304959f == pin.f304959f;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        /* renamed from: getCoordinates, reason: from getter */
        public final LatLng getF304960b() {
            return this.f304955b;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        public final String getMapId() {
            return String.format("pin_%s%s%s%s", Arrays.copyOf(new Object[]{this.f304957d, Boolean.valueOf(this.f304956c), this.f304958e, this.f304959f}, 4));
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f304955b.hashCode() * 31, 31, this.f304956c);
            String str = this.f304957d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f304958e;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Marker.Pin.IconType iconType = this.f304959f;
            return iHashCode2 + (iconType != null ? iconType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Pin(coordinates=" + this.f304955b + ", selected=" + this.f304956c + ", text=" + this.f304957d + ", count=" + this.f304958e + ", iconType=" + this.f304959f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f304955b, i12);
            parcel.writeInt(this.f304956c ? 1 : 0);
            parcel.writeString(this.f304957d);
            Integer num = this.f304958e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Marker.Pin.IconType iconType = this.f304959f;
            if (iconType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(iconType.name());
            }
        }

        public Pin(@Y61.k LatLng latLng, boolean z12, @Y61.l String str, @Y61.l Integer num, @Y61.l Marker.Pin.IconType iconType) {
            super(null);
            this.f304955b = latLng;
            this.f304956c = z12;
            this.f304957d = str;
            this.f304958e = num;
            this.f304959f = iconType;
        }
    }

    /* compiled from: MarkerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/MarkerItem$PinWithLabel;", "Lcom/avito/android/universal_map/map/common/marker/MarkerItem;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PinWithLabel extends MarkerItem {

        @Y61.k
        public static final Parcelable.Creator<PinWithLabel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LatLng f304960b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f304961c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f304962d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f304963e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final UniversalMapPointRect.HintLayout f304964f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f304965g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Integer f304966h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Marker.Pin.IconType f304967i;

        /* compiled from: MarkerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PinWithLabel> {
            @Override // android.os.Parcelable.Creator
            public final PinWithLabel createFromParcel(Parcel parcel) {
                return new PinWithLabel((LatLng) parcel.readParcelable(PinWithLabel.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (AttributedText) parcel.readParcelable(PinWithLabel.class.getClassLoader()), (UniversalMapPointRect.HintLayout) parcel.readParcelable(PinWithLabel.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Marker.Pin.IconType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final PinWithLabel[] newArray(int i12) {
                return new PinWithLabel[i12];
            }
        }

        public /* synthetic */ PinWithLabel(LatLng latLng, boolean z12, String str, AttributedText attributedText, UniversalMapPointRect.HintLayout hintLayout, String str2, Integer num, Marker.Pin.IconType iconType, int i12, C42822w c42822w) {
            this(latLng, (i12 & 2) != 0 ? false : z12, str, attributedText, hintLayout, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : iconType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinWithLabel)) {
                return false;
            }
            PinWithLabel pinWithLabel = (PinWithLabel) obj;
            return L.f(this.f304960b, pinWithLabel.f304960b) && this.f304961c == pinWithLabel.f304961c && L.f(this.f304962d, pinWithLabel.f304962d) && L.f(this.f304963e, pinWithLabel.f304963e) && L.f(this.f304964f, pinWithLabel.f304964f) && L.f(this.f304965g, pinWithLabel.f304965g) && L.f(this.f304966h, pinWithLabel.f304966h) && this.f304967i == pinWithLabel.f304967i;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        /* renamed from: getCoordinates, reason: from getter */
        public final LatLng getF304960b() {
            return this.f304960b;
        }

        @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
        @Y61.k
        public final String getMapId() {
            return String.format("pin_with_label_%s%s%s%s%s", Arrays.copyOf(new Object[]{this.f304962d, this.f304965g, this.f304966h, this.f304967i, Boolean.valueOf(this.f304961c)}, 5));
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f304960b.hashCode() * 31, 31, this.f304961c);
            String str = this.f304962d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f304963e;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalMapPointRect.HintLayout hintLayout = this.f304964f;
            int iHashCode3 = (iHashCode2 + (hintLayout == null ? 0 : hintLayout.hashCode())) * 31;
            String str2 = this.f304965g;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f304966h;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Marker.Pin.IconType iconType = this.f304967i;
            return iHashCode5 + (iconType != null ? iconType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "PinWithLabel(coordinates=" + this.f304960b + ", selected=" + this.f304961c + ", labelText=" + this.f304962d + ", richLabelText=" + this.f304963e + ", hintLayout=" + this.f304964f + ", text=" + this.f304965g + ", count=" + this.f304966h + ", iconType=" + this.f304967i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f304960b, i12);
            parcel.writeInt(this.f304961c ? 1 : 0);
            parcel.writeString(this.f304962d);
            parcel.writeParcelable(this.f304963e, i12);
            parcel.writeParcelable(this.f304964f, i12);
            parcel.writeString(this.f304965g);
            Integer num = this.f304966h;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Marker.Pin.IconType iconType = this.f304967i;
            if (iconType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(iconType.name());
            }
        }

        public PinWithLabel(@Y61.k LatLng latLng, boolean z12, @Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l UniversalMapPointRect.HintLayout hintLayout, @Y61.l String str2, @Y61.l Integer num, @Y61.l Marker.Pin.IconType iconType) {
            super(null);
            this.f304960b = latLng;
            this.f304961c = z12;
            this.f304962d = str;
            this.f304963e = attributedText;
            this.f304964f = hintLayout;
            this.f304965g = str2;
            this.f304966h = num;
            this.f304967i = iconType;
        }
    }

    public /* synthetic */ MarkerItem(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
    @Y61.l
    public final Float getZoomToMarker() {
        return AvitoMarkerItem.DefaultImpls.getZoomToMarker(this);
    }

    @Override // com.avito.android.avito_map.marker.AvitoMarkerItem
    public final boolean isApproximated() {
        return AvitoMarkerItem.DefaultImpls.isApproximated(this);
    }

    public MarkerItem() {
    }
}
