package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0002\u001b\u001cBE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/service_booking/SbCheckPriceListBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "", "id", "Lcom/avito/android/service_booking/SbCheckPriceListBlock$Group;", "groups", "Lcom/avito/android/service_booking/SbCheckPriceListBlock$Value;", "values", "", "isOptional", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "setValue", "(Ljava/util/List;)V", "Group", "Value", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbCheckPriceListBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<List<? extends String>> {

    @k
    public static final Parcelable.Creator<SbCheckPriceListBlock> CREATOR = new a();

    @c("groups")
    @k
    private final List<Group> groups;

    @c("id")
    @k
    private final String id;

    @c("optional")
    @l
    private final Boolean isOptional;

    @c("value")
    @l
    private List<String> value;

    @c("values")
    @k
    private final List<Value> values;

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_booking/SbCheckPriceListBlock$Group;", "Landroid/os/Parcelable;", "", "", "groupIds", "groupTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Group implements Parcelable {

        @k
        public static final Parcelable.Creator<Group> CREATOR = new a();

        @c("groupIds")
        @k
        private final List<String> groupIds;

        @c("groupTitle")
        @k
        private final String groupTitle;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Group> {
            @Override // android.os.Parcelable.Creator
            public final Group createFromParcel(Parcel parcel) {
                return new Group(parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Group[] newArray(int i12) {
                return new Group[i12];
            }
        }

        public Group(@k List<String> list, @k String str) {
            this.groupIds = list;
            this.groupTitle = str;
        }

        @k
        public final List<String> c() {
            return this.groupIds;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getGroupTitle() {
            return this.groupTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return L.f(this.groupIds, group.groupIds) && L.f(this.groupTitle, group.groupTitle);
        }

        public final int hashCode() {
            return this.groupTitle.hashCode() + (this.groupIds.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Group(groupIds=");
            sb2.append(this.groupIds);
            sb2.append(", groupTitle=");
            return C22026a.c(sb2, this.groupTitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeStringList(this.groupIds);
            parcel.writeString(this.groupTitle);
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking/SbCheckPriceListBlock$Value;", "Landroid/os/Parcelable;", "", "id", "title", "price", "duration", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getPrice", "c", "getDescription", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        @c("description")
        @l
        private final String description;

        @c("duration")
        @l
        private final String duration;

        @c("id")
        @k
        private final String id;

        @c("price")
        @k
        private final String price;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                return new Value(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @k String str2, @k String str3, @l String str4, @l String str5) {
            this.id = str;
            this.title = str2;
            this.price = str3;
            this.duration = str4;
            this.description = str5;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getDuration() {
            return this.duration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return L.f(this.id, value.id) && L.f(this.title, value.title) && L.f(this.price, value.price) && L.f(this.duration, value.duration) && L.f(this.description, value.description);
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.price);
            String str = this.duration;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", duration=");
            sb2.append(this.duration);
            sb2.append(", description=");
            return C22026a.c(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.price);
            parcel.writeString(this.duration);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbCheckPriceListBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbCheckPriceListBlock createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Group.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList2, iC3, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SbCheckPriceListBlock(string, arrayList, arrayList2, boolValueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SbCheckPriceListBlock[] newArray(int i12) {
            return new SbCheckPriceListBlock[i12];
        }
    }

    public SbCheckPriceListBlock(@k String str, @k List<Group> list, @k List<Value> list2, @l Boolean bool, @l List<String> list3) {
        this.id = str;
        this.groups = list;
        this.values = list2;
        this.isOptional = bool;
        this.value = list3;
    }

    @l
    public final List<String> c() {
        return this.value;
    }

    @k
    public final List<Value> d() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SbCheckPriceListBlock.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        SbCheckPriceListBlock sbCheckPriceListBlock = (SbCheckPriceListBlock) obj;
        return L.f(this.id, sbCheckPriceListBlock.id) && L.f(this.groups, sbCheckPriceListBlock.groups) && L.f(this.values, sbCheckPriceListBlock.values) && L.f(this.isOptional, sbCheckPriceListBlock.isOptional) && L.f(this.value, sbCheckPriceListBlock.value);
    }

    @k
    public final List<Group> getGroups() {
        return this.groups;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.groups.hashCode() + (this.id.hashCode() * 31);
        int iHashCode2 = this.values.hashCode() + (iHashCode * 31) + iHashCode;
        int i12 = iHashCode2 * 31;
        Boolean bool = this.isOptional;
        return i12 + (bool != null ? bool.hashCode() : 0) + iHashCode2;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbCheckPriceListBlock(id=");
        sb2.append(this.id);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", isOptional=");
        sb2.append(this.isOptional);
        sb2.append(", value=");
        return H.p(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.groups, parcel);
        while (itJ.hasNext()) {
            ((Group) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.values, parcel);
        while (itJ2.hasNext()) {
            ((Value) itJ2.next()).writeToParcel(parcel, i12);
        }
        Boolean bool = this.isOptional;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeStringList(this.value);
    }
}
