package com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.imv_cars_details.models.NeighborParameter;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsNeighborItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_detail_neighbor_item/ImvCarsDetailsNeighborItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsNeighborItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsNeighborItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170102b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170103c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f170104d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f170105e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<NeighborParameter> f170106f;

    /* compiled from: ImvCarsDetailsNeighborItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsNeighborItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsNeighborItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ImvCarsDetailsNeighborItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ImvCarsDetailsNeighborItem.class, parcel, arrayList, iL2, 1);
            }
            return new ImvCarsDetailsNeighborItem(image, string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsNeighborItem[] newArray(int i12) {
            return new ImvCarsDetailsNeighborItem[i12];
        }
    }

    public ImvCarsDetailsNeighborItem(@l Image image, @k String str, @l String str2, @l String str3, @k List list) {
        this.f170102b = str;
        this.f170103c = str2;
        this.f170104d = str3;
        this.f170105e = image;
        this.f170106f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF162909b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162909b() {
        return this.f170102b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170102b);
        parcel.writeString(this.f170103c);
        parcel.writeString(this.f170104d);
        parcel.writeParcelable(this.f170105e, i12);
        Iterator itJ = C0.j(this.f170106f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
