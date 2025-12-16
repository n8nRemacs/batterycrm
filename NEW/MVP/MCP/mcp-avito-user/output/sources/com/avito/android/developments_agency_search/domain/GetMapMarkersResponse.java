package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetMapMarkersResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker;", "markers", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getMarkers", "Marker", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetMapMarkersResponse implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetMapMarkersResponse> CREATOR = new a();

    @c("markers")
    @l
    private final List<Marker> markers;

    /* compiled from: GetMapMarkersResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u0017J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010 R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b@\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\b\u0011\u0010#¨\u0006C"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker;", "Landroid/os/Parcelable;", "", "id", "", "developmentId", "", "title", "subtitle", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;", "type", "", "latitude", "longitude", "", "isResidentialComplexCompleted", "<init>", "(JILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;DDZ)V", "component1", "()J", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "()Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;", "component7", "()D", "component8", "component9", "()Z", "copy", "(JILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;DDZ)Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "I", "getDevelopmentId", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;", "getType", "D", "getLatitude", "getLongitude", "Z", "Type", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Marker implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Marker> CREATOR = new a();

        @c("developmentId")
        private final int developmentId;

        @c("id")
        private final long id;

        @c("images")
        @l
        private final Image image;

        @c("isResidentialComplexCompleted")
        private final boolean isResidentialComplexCompleted;

        @c("lat")
        private final double latitude;

        @c(MessageBody.Location.LONGITUDE)
        private final double longitude;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetMapMarkersResponse.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetMapMarkersResponse$Marker$Type;", "", "(Ljava/lang/String;I)V", "POINT", "SMALL_PIN", "MEDIUM_PIN", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("medium_pin")
            public static final Type MEDIUM_PIN;

            @c("point")
            public static final Type POINT;

            @c("small_pin")
            public static final Type SMALL_PIN;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f136525b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f136526c;

            static {
                Type type = new Type("POINT", 0);
                POINT = type;
                Type type2 = new Type("SMALL_PIN", 1);
                SMALL_PIN = type2;
                Type type3 = new Type("MEDIUM_PIN", 2);
                MEDIUM_PIN = type3;
                Type[] typeArr = {type, type2, type3};
                f136525b = typeArr;
                f136526c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f136525b.clone();
            }
        }

        /* compiled from: GetMapMarkersResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Marker> {
            @Override // android.os.Parcelable.Creator
            public final Marker createFromParcel(Parcel parcel) {
                return new Marker(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Marker.class.getClassLoader()), Type.valueOf(parcel.readString()), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Marker[] newArray(int i12) {
                return new Marker[i12];
            }
        }

        public Marker(long j12, int i12, @l String str, @l String str2, @l Image image, @k Type type, double d12, double d13, boolean z12) {
            this.id = j12;
            this.developmentId = i12;
            this.title = str;
            this.subtitle = str2;
            this.image = image;
            this.type = type;
            this.latitude = d12;
            this.longitude = d13;
            this.isResidentialComplexCompleted = z12;
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDevelopmentId() {
            return this.developmentId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component8, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsResidentialComplexCompleted() {
            return this.isResidentialComplexCompleted;
        }

        @k
        public final Marker copy(long id2, int developmentId, @l String title, @l String subtitle, @l Image image, @k Type type, double latitude, double longitude, boolean isResidentialComplexCompleted) {
            return new Marker(id2, developmentId, title, subtitle, image, type, latitude, longitude, isResidentialComplexCompleted);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Marker)) {
                return false;
            }
            Marker marker = (Marker) other;
            return this.id == marker.id && this.developmentId == marker.developmentId && L.f(this.title, marker.title) && L.f(this.subtitle, marker.subtitle) && L.f(this.image, marker.image) && this.type == marker.type && Double.compare(this.latitude, marker.latitude) == 0 && Double.compare(this.longitude, marker.longitude) == 0 && this.isResidentialComplexCompleted == marker.isResidentialComplexCompleted;
        }

        public final int getDevelopmentId() {
            return this.developmentId;
        }

        public final long getId() {
            return this.id;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iE2 = r.e(this.developmentId, Long.hashCode(this.id) * 31, 31);
            String str = this.title;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.image;
            return Boolean.hashCode(this.isResidentialComplexCompleted) + e.d(e.d((this.type.hashCode() + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31)) * 31, 31, this.latitude), 31, this.longitude);
        }

        public final boolean isResidentialComplexCompleted() {
            return this.isResidentialComplexCompleted;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Marker(id=");
            sb2.append(this.id);
            sb2.append(", developmentId=");
            sb2.append(this.developmentId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            sb2.append(this.longitude);
            sb2.append(", isResidentialComplexCompleted=");
            return r.x(sb2, this.isResidentialComplexCompleted, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeLong(this.id);
            parcel.writeInt(this.developmentId);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.type.name());
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
            parcel.writeInt(this.isResidentialComplexCompleted ? 1 : 0);
        }
    }

    /* compiled from: GetMapMarkersResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetMapMarkersResponse> {
        @Override // android.os.Parcelable.Creator
        public final GetMapMarkersResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Marker.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new GetMapMarkersResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GetMapMarkersResponse[] newArray(int i12) {
            return new GetMapMarkersResponse[i12];
        }
    }

    public GetMapMarkersResponse(@l List<Marker> list) {
        this.markers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetMapMarkersResponse copy$default(GetMapMarkersResponse getMapMarkersResponse, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getMapMarkersResponse.markers;
        }
        return getMapMarkersResponse.copy(list);
    }

    @l
    public final List<Marker> component1() {
        return this.markers;
    }

    @k
    public final GetMapMarkersResponse copy(@l List<Marker> markers) {
        return new GetMapMarkersResponse(markers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetMapMarkersResponse) && L.f(this.markers, ((GetMapMarkersResponse) other).markers);
    }

    @l
    public final List<Marker> getMarkers() {
        return this.markers;
    }

    public int hashCode() {
        List<Marker> list = this.markers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("GetMapMarkersResponse(markers="), this.markers, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Marker> list = this.markers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Marker) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
