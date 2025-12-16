package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingEnterDataDeeplink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/hotel_booking/Group;", "Landroid/os/Parcelable;", "", "id", "title", "", "Lcom/avito/android/hotel_booking/Input;", "inputs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Group implements Parcelable {

    @k
    public static final Parcelable.Creator<Group> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final transient String f163212b;

    @com.google.gson.annotations.c("inputs")
    @l
    private final List<Input> inputs;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: HotelBookingEnterDataDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Group> {
        @Override // android.os.Parcelable.Creator
        public final Group createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Input.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new Group(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Group[] newArray(int i12) {
            return new Group[i12];
        }
    }

    public Group(@l String str, @l String str2, @l List<Input> list) {
        this.f163212b = str;
        this.title = str2;
        this.inputs = list;
    }

    public static Group a(Group group, String str, List list, int i12) {
        if ((i12 & 1) != 0) {
            str = group.f163212b;
        }
        String str2 = group.title;
        if ((i12 & 4) != 0) {
            list = group.inputs;
        }
        group.getClass();
        return new Group(str, str2, list);
    }

    @l
    public final List<Input> c() {
        return this.inputs;
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
        return L.f(this.f163212b, group.f163212b) && L.f(this.title, group.title) && L.f(this.inputs, group.inputs);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.f163212b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Input> list = this.inputs;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Group(id=");
        sb2.append(this.f163212b);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", inputs=");
        return H.p(sb2, this.inputs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163212b);
        parcel.writeString(this.title);
        List<Input> list = this.inputs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Input) itA.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ Group(String str, String str2, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, str2, list);
    }
}
