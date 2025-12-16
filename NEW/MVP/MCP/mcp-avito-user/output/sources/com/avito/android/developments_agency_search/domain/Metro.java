package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonModel.kt */
@P
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000256BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JX\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00067"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/Metro;", "Landroid/os/Parcelable;", "", "id", "", "name", DistrictParameter.TYPE, "distance", "Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;", "distanceInTime", "", "Lcom/avito/android/developments_agency_search/domain/Metro$MetroLine;", "lines", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;Ljava/util/List;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;", "component6", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/Metro;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getName", "getDistrict", "getDistance", "Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;", "getDistanceInTime", "Ljava/util/List;", "getLines", "DistanceInTime", "MetroLine", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class Metro implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<Metro> CREATOR = new a();

    @c("distance")
    @k
    private final String distance;

    @c("distanceInTime")
    @l
    private final DistanceInTime distanceInTime;

    @c(DistrictParameter.TYPE)
    @l
    private final String district;

    @c("id")
    private final long id;

    @c("lines")
    @l
    private final List<MetroLine> lines;

    @c("name")
    @k
    private final String name;

    /* compiled from: CommonModel.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;", "Landroid/os/Parcelable;", "", "text", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/Metro$DistanceInTime;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getIconName", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DistanceInTime implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<DistanceInTime> CREATOR = new a();

        @c("iconName")
        @k
        private final String iconName;

        @c("text")
        @k
        private final String text;

        /* compiled from: CommonModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DistanceInTime> {
            @Override // android.os.Parcelable.Creator
            public final DistanceInTime createFromParcel(Parcel parcel) {
                return new DistanceInTime(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DistanceInTime[] newArray(int i12) {
                return new DistanceInTime[i12];
            }
        }

        public DistanceInTime(@k String str, @k String str2) {
            this.text = str;
            this.iconName = str2;
        }

        public static /* synthetic */ DistanceInTime copy$default(DistanceInTime distanceInTime, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = distanceInTime.text;
            }
            if ((i12 & 2) != 0) {
                str2 = distanceInTime.iconName;
            }
            return distanceInTime.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @k
        public final DistanceInTime copy(@k String text, @k String iconName) {
            return new DistanceInTime(text, iconName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DistanceInTime)) {
                return false;
            }
            DistanceInTime distanceInTime = (DistanceInTime) other;
            return L.f(this.text, distanceInTime.text) && L.f(this.iconName, distanceInTime.iconName);
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.iconName.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DistanceInTime(text=");
            sb2.append(this.text);
            sb2.append(", iconName=");
            return C22026a.c(sb2, this.iconName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.iconName);
        }
    }

    /* compiled from: CommonModel.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/Metro$MetroLine;", "Landroid/os/Parcelable;", "", "color", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/Metro$MetroLine;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MetroLine implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<MetroLine> CREATOR = new a();

        @c("color")
        @k
        private final String color;

        /* compiled from: CommonModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MetroLine> {
            @Override // android.os.Parcelable.Creator
            public final MetroLine createFromParcel(Parcel parcel) {
                return new MetroLine(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MetroLine[] newArray(int i12) {
                return new MetroLine[i12];
            }
        }

        public MetroLine(@k String str) {
            this.color = str;
        }

        public static /* synthetic */ MetroLine copy$default(MetroLine metroLine, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = metroLine.color;
            }
            return metroLine.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final MetroLine copy(@k String color) {
            return new MetroLine(color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MetroLine) && L.f(this.color, ((MetroLine) other).color);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("MetroLine(color="), this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.color);
        }
    }

    /* compiled from: CommonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Metro> {
        @Override // android.os.Parcelable.Creator
        public final Metro createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            DistanceInTime distanceInTimeCreateFromParcel = parcel.readInt() == 0 ? null : DistanceInTime.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(MetroLine.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new Metro(j12, string, string2, string3, distanceInTimeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Metro[] newArray(int i12) {
            return new Metro[i12];
        }
    }

    public Metro(long j12, @k String str, @l String str2, @k String str3, @l DistanceInTime distanceInTime, @l List<MetroLine> list) {
        this.id = j12;
        this.name = str;
        this.district = str2;
        this.distance = str3;
        this.distanceInTime = distanceInTime;
        this.lines = list;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DistanceInTime getDistanceInTime() {
        return this.distanceInTime;
    }

    @l
    public final List<MetroLine> component6() {
        return this.lines;
    }

    @k
    public final Metro copy(long id2, @k String name, @l String district, @k String distance, @l DistanceInTime distanceInTime, @l List<MetroLine> lines) {
        return new Metro(id2, name, district, distance, distanceInTime, lines);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metro)) {
            return false;
        }
        Metro metro = (Metro) other;
        return this.id == metro.id && L.f(this.name, metro.name) && L.f(this.district, metro.district) && L.f(this.distance, metro.distance) && L.f(this.distanceInTime, metro.distanceInTime) && L.f(this.lines, metro.lines);
    }

    @k
    public final String getDistance() {
        return this.distance;
    }

    @l
    public final DistanceInTime getDistanceInTime() {
        return this.distanceInTime;
    }

    @l
    public final String getDistrict() {
        return this.district;
    }

    public final long getId() {
        return this.id;
    }

    @l
    public final List<MetroLine> getLines() {
        return this.lines;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iD2 = H.d(Long.hashCode(this.id) * 31, 31, this.name);
        String str = this.district;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.distance);
        DistanceInTime distanceInTime = this.distanceInTime;
        int iHashCode = (iD3 + (distanceInTime == null ? 0 : distanceInTime.hashCode())) * 31;
        List<MetroLine> list = this.lines;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metro(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", district=");
        sb2.append(this.district);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(", distanceInTime=");
        sb2.append(this.distanceInTime);
        sb2.append(", lines=");
        return H.p(sb2, this.lines, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.district);
        parcel.writeString(this.distance);
        DistanceInTime distanceInTime = this.distanceInTime;
        if (distanceInTime == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            distanceInTime.writeToParcel(parcel, flags);
        }
        List<MetroLine> list = this.lines;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((MetroLine) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
