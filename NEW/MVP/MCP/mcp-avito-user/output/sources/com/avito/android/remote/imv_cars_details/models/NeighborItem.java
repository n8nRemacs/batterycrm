package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/NeighborItem;", "Landroid/os/Parcelable;", "", "title", "mileage", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/remote/imv_cars_details/models/NeighborParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NeighborItem implements Parcelable {

    @k
    public static final Parcelable.Creator<NeighborItem> CREATOR = new a();

    @c("images")
    @l
    private final Image image;

    @c("mileage")
    @l
    private final String mileage;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<NeighborParameter> parameters;

    @c("title")
    @l
    private final String title;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NeighborItem> {
        @Override // android.os.Parcelable.Creator
        public final NeighborItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(NeighborItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(NeighborParameter.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new NeighborItem(string, string2, image, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NeighborItem[] newArray(int i12) {
            return new NeighborItem[i12];
        }
    }

    public NeighborItem(@l String str, @l String str2, @l Image image, @l List<NeighborParameter> list) {
        this.title = str;
        this.mileage = str2;
        this.image = image;
        this.parameters = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getMileage() {
        return this.mileage;
    }

    @l
    public final List<NeighborParameter> d() {
        return this.parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NeighborItem)) {
            return false;
        }
        NeighborItem neighborItem = (NeighborItem) obj;
        return L.f(this.title, neighborItem.title) && L.f(this.mileage, neighborItem.mileage) && L.f(this.image, neighborItem.image) && L.f(this.parameters, neighborItem.parameters);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mileage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        List<NeighborParameter> list = this.parameters;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NeighborItem(title=");
        sb2.append(this.title);
        sb2.append(", mileage=");
        sb2.append(this.mileage);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.mileage);
        parcel.writeParcelable(this.image, i12);
        List<NeighborParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((NeighborParameter) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
