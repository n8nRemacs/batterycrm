package com.avito.android.remote.imv_cars_details.models;

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

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/ImvPriceDetails;", "Landroid/os/Parcelable;", "", "title", "", "items", "Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsItemWithIcon;", "itemsWithIcon", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "c", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvPriceDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvPriceDetails> CREATOR = new a();

    @c("items")
    @l
    private final List<String> items;

    @c("itemsWithIcon")
    @l
    private final List<PriceDetailsItemWithIcon> itemsWithIcon;

    @c("title")
    @k
    private final String title;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvPriceDetails> {
        @Override // android.os.Parcelable.Creator
        public final ImvPriceDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PriceDetailsItemWithIcon.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ImvPriceDetails(string, arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvPriceDetails[] newArray(int i12) {
            return new ImvPriceDetails[i12];
        }
    }

    public ImvPriceDetails(@k String str, @l List<String> list, @l List<PriceDetailsItemWithIcon> list2) {
        this.title = str;
        this.items = list;
        this.itemsWithIcon = list2;
    }

    @l
    public final List<PriceDetailsItemWithIcon> c() {
        return this.itemsWithIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvPriceDetails)) {
            return false;
        }
        ImvPriceDetails imvPriceDetails = (ImvPriceDetails) obj;
        return L.f(this.title, imvPriceDetails.title) && L.f(this.items, imvPriceDetails.items) && L.f(this.itemsWithIcon, imvPriceDetails.itemsWithIcon);
    }

    @l
    public final List<String> getItems() {
        return this.items;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<String> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PriceDetailsItemWithIcon> list2 = this.itemsWithIcon;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvPriceDetails(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", itemsWithIcon=");
        return H.p(sb2, this.itemsWithIcon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeStringList(this.items);
        List<PriceDetailsItemWithIcon> list = this.itemsWithIcon;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((PriceDetailsItemWithIcon) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
