package com.avito.android.remote.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/models/SparePartsResponse;", "Landroid/os/Parcelable;", "", "header", "subheader", "", "Lcom/avito/android/remote/models/SparePartsGroup;", "groups", "Lcom/avito/android/remote/models/SparePartsSpecification;", "specifications", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "getSubheader", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "getSpecifications", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsResponse> CREATOR = new a();

    @c("groupings")
    @l
    private final List<SparePartsGroup> groups;

    @c("header")
    @k
    private final String header;

    @c("specifications")
    @l
    private final List<SparePartsSpecification> specifications;

    @c("subheader")
    @l
    private final String subheader;

    /* compiled from: SparePartsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsResponse> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(SparePartsGroup.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(SparePartsSpecification.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new SparePartsResponse(string, string2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsResponse[] newArray(int i12) {
            return new SparePartsResponse[i12];
        }
    }

    public SparePartsResponse(@k String str, @l String str2, @l List<SparePartsGroup> list, @l List<SparePartsSpecification> list2) {
        this.header = str;
        this.subheader = str2;
        this.groups = list;
        this.specifications = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsResponse)) {
            return false;
        }
        SparePartsResponse sparePartsResponse = (SparePartsResponse) obj;
        return L.f(this.header, sparePartsResponse.header) && L.f(this.subheader, sparePartsResponse.subheader) && L.f(this.groups, sparePartsResponse.groups) && L.f(this.specifications, sparePartsResponse.specifications);
    }

    public final int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        String str = this.subheader;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SparePartsGroup> list = this.groups;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<SparePartsSpecification> list2 = this.specifications;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsResponse(header=");
        sb2.append(this.header);
        sb2.append(", subheader=");
        sb2.append(this.subheader);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", specifications=");
        return H.p(sb2, this.specifications, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        parcel.writeString(this.subheader);
        List<SparePartsGroup> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SparePartsGroup) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<SparePartsSpecification> list2 = this.specifications;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((SparePartsSpecification) itA2.next()).writeToParcel(parcel, i12);
        }
    }
}
