package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoZones.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u0017R(\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b5\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/GeoZones;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "departureTo", "", "bottomSheetPeekHeightPercent", "", "Lcom/avito/android/remote/model/Coordinates;", "metroMarkers", "polygons", "Lcom/avito/android/remote/model/GeoZonesMapParams;", "geoMapParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/GeoZonesMapParams;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Ljava/lang/Float;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/avito/android/remote/model/GeoZonesMapParams;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Float;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/GeoZonesMapParams;)Lcom/avito/android/remote/model/GeoZones;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDepartureTo", "Ljava/lang/Float;", "getBottomSheetPeekHeightPercent", "Ljava/util/List;", "getMetroMarkers", "getPolygons", "Lcom/avito/android/remote/model/GeoZonesMapParams;", "getGeoMapParams", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoZones implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoZones> CREATOR = new Creator();

    @c("bottomSheetPeekHeightPercent")
    @l
    private final Float bottomSheetPeekHeightPercent;

    @c("departureTo")
    @l
    private final AttributedText departureTo;

    @c("geoMapParams")
    @l
    private final GeoZonesMapParams geoMapParams;

    @c("metroMarkers")
    @l
    private final List<Coordinates> metroMarkers;

    @c("polygons")
    @l
    private final List<List<Coordinates>> polygons;

    @c("title")
    @l
    private final String title;

    /* compiled from: GeoZones.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoZones> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoZones createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(GeoZones.class.getClassLoader());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(GeoZones.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    int i15 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i15);
                    int iL3 = 0;
                    while (iL3 != i15) {
                        iL3 = a.l(GeoZones.class, parcel, arrayList4, iL3, 1);
                    }
                    arrayList3.add(arrayList4);
                }
                arrayList2 = arrayList3;
            }
            return new GeoZones(string, attributedText, fValueOf, arrayList, arrayList2, parcel.readInt() != 0 ? GeoZonesMapParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoZones[] newArray(int i12) {
            return new GeoZones[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeoZones(@l String str, @l AttributedText attributedText, @l Float f12, @l List<Coordinates> list, @l List<? extends List<Coordinates>> list2, @l GeoZonesMapParams geoZonesMapParams) {
        this.title = str;
        this.departureTo = attributedText;
        this.bottomSheetPeekHeightPercent = f12;
        this.metroMarkers = list;
        this.polygons = list2;
        this.geoMapParams = geoZonesMapParams;
    }

    public static /* synthetic */ GeoZones copy$default(GeoZones geoZones, String str, AttributedText attributedText, Float f12, List list, List list2, GeoZonesMapParams geoZonesMapParams, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoZones.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = geoZones.departureTo;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 4) != 0) {
            f12 = geoZones.bottomSheetPeekHeightPercent;
        }
        Float f13 = f12;
        if ((i12 & 8) != 0) {
            list = geoZones.metroMarkers;
        }
        List list3 = list;
        if ((i12 & 16) != 0) {
            list2 = geoZones.polygons;
        }
        List list4 = list2;
        if ((i12 & 32) != 0) {
            geoZonesMapParams = geoZones.geoMapParams;
        }
        return geoZones.copy(str, attributedText2, f13, list3, list4, geoZonesMapParams);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDepartureTo() {
        return this.departureTo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Float getBottomSheetPeekHeightPercent() {
        return this.bottomSheetPeekHeightPercent;
    }

    @l
    public final List<Coordinates> component4() {
        return this.metroMarkers;
    }

    @l
    public final List<List<Coordinates>> component5() {
        return this.polygons;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final GeoZonesMapParams getGeoMapParams() {
        return this.geoMapParams;
    }

    @k
    public final GeoZones copy(@l String title, @l AttributedText departureTo, @l Float bottomSheetPeekHeightPercent, @l List<Coordinates> metroMarkers, @l List<? extends List<Coordinates>> polygons, @l GeoZonesMapParams geoMapParams) {
        return new GeoZones(title, departureTo, bottomSheetPeekHeightPercent, metroMarkers, polygons, geoMapParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoZones)) {
            return false;
        }
        GeoZones geoZones = (GeoZones) other;
        return L.f(this.title, geoZones.title) && L.f(this.departureTo, geoZones.departureTo) && L.f(this.bottomSheetPeekHeightPercent, geoZones.bottomSheetPeekHeightPercent) && L.f(this.metroMarkers, geoZones.metroMarkers) && L.f(this.polygons, geoZones.polygons) && L.f(this.geoMapParams, geoZones.geoMapParams);
    }

    @l
    public final Float getBottomSheetPeekHeightPercent() {
        return this.bottomSheetPeekHeightPercent;
    }

    @l
    public final AttributedText getDepartureTo() {
        return this.departureTo;
    }

    @l
    public final GeoZonesMapParams getGeoMapParams() {
        return this.geoMapParams;
    }

    @l
    public final List<Coordinates> getMetroMarkers() {
        return this.metroMarkers;
    }

    @l
    public final List<List<Coordinates>> getPolygons() {
        return this.polygons;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.departureTo;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Float f12 = this.bottomSheetPeekHeightPercent;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        List<Coordinates> list = this.metroMarkers;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<Coordinates>> list2 = this.polygons;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GeoZonesMapParams geoZonesMapParams = this.geoMapParams;
        return iHashCode5 + (geoZonesMapParams != null ? geoZonesMapParams.hashCode() : 0);
    }

    @k
    public String toString() {
        return "GeoZones(title=" + this.title + ", departureTo=" + this.departureTo + ", bottomSheetPeekHeightPercent=" + this.bottomSheetPeekHeightPercent + ", metroMarkers=" + this.metroMarkers + ", polygons=" + this.polygons + ", geoMapParams=" + this.geoMapParams + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.departureTo, flags);
        Float f12 = this.bottomSheetPeekHeightPercent;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        List<Coordinates> list = this.metroMarkers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<List<Coordinates>> list2 = this.polygons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                Iterator itJ = C0.j((List) itA2.next(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }
        GeoZonesMapParams geoZonesMapParams = this.geoMapParams;
        if (geoZonesMapParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            geoZonesMapParams.writeToParcel(parcel, flags);
        }
    }
}
