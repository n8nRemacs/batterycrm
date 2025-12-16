package com.avito.android.universal_map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams;", "Landroid/os/Parcelable;", "BeduinForm", "LocationSettings", "MapSettings", "PointInfoBottomSheetSettings", "ToolbarSettings", "TrackerSettings", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniversalMapParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UniversalMapParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f304738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f304739c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f304740d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ToolbarSettings f304741e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final MapSettings f304742f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f304743g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TrackerSettings f304744h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f304745i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<BeduinAction> f304746j;

    /* compiled from: UniversalMapParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$BeduinForm;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinForm implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BeduinForm> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f304747b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<BeduinModel> f304748c;

        /* compiled from: UniversalMapParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BeduinForm> {
            @Override // android.os.Parcelable.Creator
            public final BeduinForm createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(BeduinForm.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BeduinForm(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final BeduinForm[] newArray(int i12) {
                return new BeduinForm[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinForm(@Y61.l String str, @Y61.l List<? extends BeduinModel> list) {
            this.f304747b = str;
            this.f304748c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeduinForm)) {
                return false;
            }
            BeduinForm beduinForm = (BeduinForm) obj;
            return L.f(this.f304747b, beduinForm.f304747b) && L.f(this.f304748c, beduinForm.f304748c);
        }

        public final int hashCode() {
            String str = this.f304747b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BeduinModel> list = this.f304748c;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinForm(topFormId=");
            sb2.append(this.f304747b);
            sb2.append(", topComponents=");
            return H.p(sb2, this.f304748c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f304747b);
            List<BeduinModel> list = this.f304748c;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$LocationSettings;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<LocationSettings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f304749b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<BeduinAction> f304750c;

        /* compiled from: UniversalMapParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LocationSettings> {
            @Override // android.os.Parcelable.Creator
            public final LocationSettings createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(LocationSettings.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new LocationSettings(z12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final LocationSettings[] newArray(int i12) {
                return new LocationSettings[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationSettings(boolean z12, @Y61.l List<? extends BeduinAction> list) {
            this.f304749b = z12;
            this.f304750c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationSettings)) {
                return false;
            }
            LocationSettings locationSettings = (LocationSettings) obj;
            return this.f304749b == locationSettings.f304749b && L.f(this.f304750c, locationSettings.f304750c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f304749b) * 31;
            List<BeduinAction> list = this.f304750c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocationSettings(isEnabledLocationRequest=");
            sb2.append(this.f304749b);
            sb2.append(", onTapActions=");
            return H.p(sb2, this.f304750c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f304749b ? 1 : 0);
            List<BeduinAction> list = this.f304750c;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$MapSettings;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<MapSettings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final LocationSettings f304751b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f304752c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PointInfoBottomSheetSettings f304753d;

        /* compiled from: UniversalMapParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MapSettings> {
            @Override // android.os.Parcelable.Creator
            public final MapSettings createFromParcel(Parcel parcel) {
                return new MapSettings(parcel.readInt() == 0 ? null : LocationSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? PointInfoBottomSheetSettings.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MapSettings[] newArray(int i12) {
                return new MapSettings[i12];
            }
        }

        public MapSettings(@Y61.l LocationSettings locationSettings, @Y61.l Long l12, @Y61.l PointInfoBottomSheetSettings pointInfoBottomSheetSettings) {
            this.f304751b = locationSettings;
            this.f304752c = l12;
            this.f304753d = pointInfoBottomSheetSettings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapSettings)) {
                return false;
            }
            MapSettings mapSettings = (MapSettings) obj;
            return L.f(this.f304751b, mapSettings.f304751b) && L.f(this.f304752c, mapSettings.f304752c) && L.f(this.f304753d, mapSettings.f304753d);
        }

        public final int hashCode() {
            LocationSettings locationSettings = this.f304751b;
            int iHashCode = (locationSettings == null ? 0 : locationSettings.hashCode()) * 31;
            Long l12 = this.f304752c;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            PointInfoBottomSheetSettings pointInfoBottomSheetSettings = this.f304753d;
            return iHashCode2 + (pointInfoBottomSheetSettings != null ? pointInfoBottomSheetSettings.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "MapSettings(location=" + this.f304751b + ", beduinFormsContentId=" + this.f304752c + ", pointInfoBottomSheetSettings=" + this.f304753d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            LocationSettings locationSettings = this.f304751b;
            if (locationSettings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                locationSettings.writeToParcel(parcel, i12);
            }
            Long l12 = this.f304752c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            PointInfoBottomSheetSettings pointInfoBottomSheetSettings = this.f304753d;
            if (pointInfoBottomSheetSettings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                pointInfoBottomSheetSettings.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$PointInfoBottomSheetSettings;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PointInfoBottomSheetSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PointInfoBottomSheetSettings> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f304754b;

        /* renamed from: c, reason: collision with root package name */
        public final float f304755c;

        /* compiled from: UniversalMapParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PointInfoBottomSheetSettings> {
            @Override // android.os.Parcelable.Creator
            public final PointInfoBottomSheetSettings createFromParcel(Parcel parcel) {
                return new PointInfoBottomSheetSettings(parcel.readInt(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final PointInfoBottomSheetSettings[] newArray(int i12) {
                return new PointInfoBottomSheetSettings[i12];
            }
        }

        public PointInfoBottomSheetSettings(int i12, float f12) {
            this.f304754b = i12;
            this.f304755c = f12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointInfoBottomSheetSettings)) {
                return false;
            }
            PointInfoBottomSheetSettings pointInfoBottomSheetSettings = (PointInfoBottomSheetSettings) obj;
            return this.f304754b == pointInfoBottomSheetSettings.f304754b && Float.compare(this.f304755c, pointInfoBottomSheetSettings.f304755c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f304755c) + (Integer.hashCode(this.f304754b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PointInfoBottomSheetSettings(topPadding=");
            sb2.append(this.f304754b);
            sb2.append(", compactHeightRatio=");
            return r.k(')', this.f304755c, sb2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f304754b);
            parcel.writeFloat(this.f304755c);
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$ToolbarSettings;", "Landroid/os/Parcelable;", "", "title", "", "hideSearchAddress", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "c", "()Z", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToolbarSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ToolbarSettings> CREATOR = new a();

        @com.google.gson.annotations.c("hideSearchAddress")
        private final boolean hideSearchAddress;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        /* compiled from: UniversalMapParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ToolbarSettings> {
            @Override // android.os.Parcelable.Creator
            public final ToolbarSettings createFromParcel(Parcel parcel) {
                return new ToolbarSettings(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ToolbarSettings[] newArray(int i12) {
                return new ToolbarSettings[i12];
            }
        }

        public ToolbarSettings(@Y61.l String str, boolean z12) {
            this.title = str;
            this.hideSearchAddress = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getHideSearchAddress() {
            return this.hideSearchAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolbarSettings)) {
                return false;
            }
            ToolbarSettings toolbarSettings = (ToolbarSettings) obj;
            return L.f(this.title, toolbarSettings.title) && this.hideSearchAddress == toolbarSettings.hideSearchAddress;
        }

        @Y61.l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            return Boolean.hashCode(this.hideSearchAddress) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToolbarSettings(title=");
            sb2.append(this.title);
            sb2.append(", hideSearchAddress=");
            return r.x(sb2, this.hideSearchAddress, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeInt(this.hideSearchAddress ? 1 : 0);
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings;", "Landroid/os/Parcelable;", "TrackByHost", "TrackByUniversalMap", "Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings$TrackByHost;", "Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings$TrackByUniversalMap;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public interface TrackerSettings extends Parcelable {

        /* compiled from: UniversalMapParams.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings$TrackByHost;", "Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TrackByHost implements TrackerSettings, Parcelable {

            @Y61.k
            public static final Parcelable.Creator<TrackByHost> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f304756b;

            /* compiled from: UniversalMapParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TrackByHost> {
                @Override // android.os.Parcelable.Creator
                public final TrackByHost createFromParcel(Parcel parcel) {
                    return new TrackByHost(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TrackByHost[] newArray(int i12) {
                    return new TrackByHost[i12];
                }
            }

            public TrackByHost(@Y61.k String str) {
                this.f304756b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f304756b);
            }
        }

        /* compiled from: UniversalMapParams.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings$TrackByUniversalMap;", "Lcom/avito/android/universal_map/UniversalMapParams$TrackerSettings;", "Landroid/os/Parcelable;", "_avito_universal-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TrackByUniversalMap implements TrackerSettings, Parcelable {

            @Y61.k
            public static final Parcelable.Creator<TrackByUniversalMap> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f304757b;

            /* compiled from: UniversalMapParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TrackByUniversalMap> {
                @Override // android.os.Parcelable.Creator
                public final TrackByUniversalMap createFromParcel(Parcel parcel) {
                    return new TrackByUniversalMap(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TrackByUniversalMap[] newArray(int i12) {
                    return new TrackByUniversalMap[i12];
                }
            }

            public TrackByUniversalMap(@Y61.l String str) {
                this.f304757b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f304757b);
            }
        }
    }

    /* compiled from: UniversalMapParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapParams> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            ToolbarSettings toolbarSettingsCreateFromParcel = parcel.readInt() == 0 ? null : ToolbarSettings.CREATOR.createFromParcel(parcel);
            MapSettings mapSettingsCreateFromParcel = parcel.readInt() == 0 ? null : MapSettings.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = org.webrtc.h.c(UniversalMapParams.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            TrackerSettings trackerSettings = (TrackerSettings) parcel.readParcelable(UniversalMapParams.class.getClassLoader());
            ParametrizedEvent parametrizedEvent = (ParametrizedEvent) parcel.readParcelable(UniversalMapParams.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(UniversalMapParams.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new UniversalMapParams(string, string2, string3, toolbarSettingsCreateFromParcel, mapSettingsCreateFromParcel, linkedHashMap, trackerSettings, parametrizedEvent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapParams[] newArray(int i12) {
            return new UniversalMapParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalMapParams(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l ToolbarSettings toolbarSettings, @Y61.l MapSettings mapSettings, @Y61.k Map<String, ? extends Object> map, @Y61.k TrackerSettings trackerSettings, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l List<? extends BeduinAction> list) {
        this.f304738b = str;
        this.f304739c = str2;
        this.f304740d = str3;
        this.f304741e = toolbarSettings;
        this.f304742f = mapSettings;
        this.f304743g = map;
        this.f304744h = trackerSettings;
        this.f304745i = parametrizedEvent;
        this.f304746j = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalMapParams)) {
            return false;
        }
        UniversalMapParams universalMapParams = (UniversalMapParams) obj;
        return L.f(this.f304738b, universalMapParams.f304738b) && L.f(this.f304739c, universalMapParams.f304739c) && L.f(this.f304740d, universalMapParams.f304740d) && L.f(this.f304741e, universalMapParams.f304741e) && L.f(this.f304742f, universalMapParams.f304742f) && L.f(this.f304743g, universalMapParams.f304743g) && L.f(this.f304744h, universalMapParams.f304744h) && L.f(this.f304745i, universalMapParams.f304745i) && L.f(this.f304746j, universalMapParams.f304746j);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f304738b.hashCode() * 31, 31, this.f304739c);
        String str = this.f304740d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ToolbarSettings toolbarSettings = this.f304741e;
        int iHashCode2 = (iHashCode + (toolbarSettings == null ? 0 : toolbarSettings.hashCode())) * 31;
        MapSettings mapSettings = this.f304742f;
        int iHashCode3 = (this.f304744h.hashCode() + AK.c.c((iHashCode2 + (mapSettings == null ? 0 : mapSettings.hashCode())) * 31, 31, this.f304743g)) * 31;
        ParametrizedEvent parametrizedEvent = this.f304745i;
        int iHashCode4 = (iHashCode3 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        List<BeduinAction> list = this.f304746j;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalMapParams(pointListRequest=");
        sb2.append(this.f304738b);
        sb2.append(", pointInfoRequest=");
        sb2.append(this.f304739c);
        sb2.append(", filtersInfoRequest=");
        sb2.append(this.f304740d);
        sb2.append(", toolbarSettings=");
        sb2.append(this.f304741e);
        sb2.append(", mapSettings=");
        sb2.append(this.f304742f);
        sb2.append(", extraParameters=");
        sb2.append(this.f304743g);
        sb2.append(", trackerSettings=");
        sb2.append(this.f304744h);
        sb2.append(", onOpenEvent=");
        sb2.append(this.f304745i);
        sb2.append(", onInitActions=");
        return H.p(sb2, this.f304746j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f304738b);
        parcel.writeString(this.f304739c);
        parcel.writeString(this.f304740d);
        ToolbarSettings toolbarSettings = this.f304741e;
        if (toolbarSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarSettings.writeToParcel(parcel, i12);
        }
        MapSettings mapSettings = this.f304742f;
        if (mapSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapSettings.writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.f304743g);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
        parcel.writeParcelable(this.f304744h, i12);
        parcel.writeParcelable(this.f304745i, i12);
        List<BeduinAction> list = this.f304746j;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }

    public /* synthetic */ UniversalMapParams(String str, String str2, String str3, ToolbarSettings toolbarSettings, MapSettings mapSettings, Map map, TrackerSettings trackerSettings, ParametrizedEvent parametrizedEvent, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, toolbarSettings, mapSettings, map, trackerSettings, parametrizedEvent, (i12 & 256) != 0 ? null : list);
    }
}
