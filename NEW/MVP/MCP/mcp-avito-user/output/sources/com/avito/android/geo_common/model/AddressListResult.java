package com.avito.android.geo_common.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressListResult.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/avito/android/geo_common/model/AddressListResult;", "Landroid/os/Parcelable;", "", "geoSessionId", "", "Lcom/avito/android/geo_common/model/AddressListResult$AddressResult;", "list", "", "isAddAvailable", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "getGeoSessionId", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "getTitle", "AddressResult", "Description", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressListResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressListResult> CREATOR = new a();

    @c("geoSessionId")
    @l
    private final String geoSessionId;

    @c("isAddAvailable")
    @l
    private final Boolean isAddAvailable;

    @c("list")
    @l
    private final List<AddressResult> list;

    @c("title")
    @l
    private final String title;

    /* compiled from: AddressListResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/geo_common/model/AddressListResult$AddressResult;", "Landroid/os/Parcelable;", "", "addressId", "", "isDefault", "", MessageBody.Location.KIND, "Lcom/avito/android/geo_common/model/AddressListResult$Description;", "description", "<init>", "(IZLjava/lang/String;Lcom/avito/android/geo_common/model/AddressListResult$Description;)V", "I", "c", "()I", "Z", "f", "()Z", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/geo_common/model/AddressListResult$Description;", "d", "()Lcom/avito/android/geo_common/model/AddressListResult$Description;", "Kind", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AddressResult implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressResult> CREATOR = new a();

        @c("id")
        private final int addressId;

        @c("description")
        @k
        private final Description description;

        @c("isDefault")
        private final boolean isDefault;

        @c(MessageBody.Location.KIND)
        @l
        private final String kind;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AddressListResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/geo_common/model/AddressListResult$AddressResult$Kind;", "", "(Ljava/lang/String;I)V", "HOME", "WORK", "OTHER", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Kind {

            @c("home")
            public static final Kind HOME;

            @c(PluralsKeys.OTHER)
            public static final Kind OTHER;

            @c("work")
            public static final Kind WORK;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Kind[] f159406b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f159407c;

            static {
                Kind kind = new Kind("HOME", 0);
                HOME = kind;
                Kind kind2 = new Kind("WORK", 1);
                WORK = kind2;
                Kind kind3 = new Kind("OTHER", 2);
                OTHER = kind3;
                Kind[] kindArr = {kind, kind2, kind3};
                f159406b = kindArr;
                f159407c = kotlin.enums.c.a(kindArr);
            }

            private Kind(String str, int i12) {
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) f159406b.clone();
            }
        }

        /* compiled from: AddressListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressResult> {
            @Override // android.os.Parcelable.Creator
            public final AddressResult createFromParcel(Parcel parcel) {
                return new AddressResult(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), Description.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AddressResult[] newArray(int i12) {
                return new AddressResult[i12];
            }
        }

        public AddressResult(int i12, boolean z12, @l String str, @k Description description) {
            this.addressId = i12;
            this.isDefault = z12;
            this.kind = str;
            this.description = description;
        }

        /* renamed from: c, reason: from getter */
        public final int getAddressId() {
            return this.addressId;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Description getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressResult)) {
                return false;
            }
            AddressResult addressResult = (AddressResult) obj;
            return this.addressId == addressResult.addressId && this.isDefault == addressResult.isDefault && L.f(this.kind, addressResult.kind) && L.f(this.description, addressResult.description);
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        public final int hashCode() {
            int i12 = r.i(Integer.hashCode(this.addressId) * 31, 31, this.isDefault);
            String str = this.kind;
            return this.description.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "AddressResult(addressId=" + this.addressId + ", isDefault=" + this.isDefault + ", kind=" + this.kind + ", description=" + this.description + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.addressId);
            parcel.writeInt(this.isDefault ? 1 : 0);
            parcel.writeString(this.kind);
            this.description.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AddressListResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/geo_common/model/AddressListResult$Description;", "Landroid/os/Parcelable;", "", "location", "house", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "c", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Description implements Parcelable {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new a();

        @c("details")
        @l
        private final String details;

        @c("house")
        @l
        private final String house;

        @c("location")
        @k
        private final String location;

        /* compiled from: AddressListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                return new Description(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@k String str, @l String str2, @l String str3) {
            this.location = str;
            this.house = str2;
            this.details = str3;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getHouse() {
            return this.house;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return L.f(this.location, description.location) && L.f(this.house, description.house) && L.f(this.details, description.details);
        }

        public final int hashCode() {
            int iHashCode = this.location.hashCode() * 31;
            String str = this.house;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.details;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(location=");
            sb2.append(this.location);
            sb2.append(", house=");
            sb2.append(this.house);
            sb2.append(", details=");
            return C22026a.c(sb2, this.details, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.location);
            parcel.writeString(this.house);
            parcel.writeString(this.details);
        }
    }

    /* compiled from: AddressListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressListResult> {
        @Override // android.os.Parcelable.Creator
        public final AddressListResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressResult.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressListResult(string, arrayList, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressListResult[] newArray(int i12) {
            return new AddressListResult[i12];
        }
    }

    public AddressListResult(@l String str, @l List<AddressResult> list, @l Boolean bool, @l String str2) {
        this.geoSessionId = str;
        this.list = list;
        this.isAddAvailable = bool;
        this.title = str2;
    }

    @l
    public final List<AddressResult> c() {
        return this.list;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsAddAvailable() {
        return this.isAddAvailable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListResult)) {
            return false;
        }
        AddressListResult addressListResult = (AddressListResult) obj;
        return L.f(this.geoSessionId, addressListResult.geoSessionId) && L.f(this.list, addressListResult.list) && L.f(this.isAddAvailable, addressListResult.isAddAvailable) && L.f(this.title, addressListResult.title);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.geoSessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AddressResult> list = this.list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isAddAvailable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressListResult(geoSessionId=");
        sb2.append(this.geoSessionId);
        sb2.append(", list=");
        sb2.append(this.list);
        sb2.append(", isAddAvailable=");
        sb2.append(this.isAddAvailable);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.geoSessionId);
        List<AddressResult> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressResult) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.isAddAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.title);
    }
}
