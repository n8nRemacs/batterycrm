package com.avito.android.imv_cars_details.presentation.items.seller_comment;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsPriceCommentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/seller_comment/ImvCarsDetailsPriceCommentItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvCarsDetailsPriceCommentItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsPriceCommentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170215b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170216c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f170217d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f170218e;

    /* compiled from: ImvCarsDetailsPriceCommentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsPriceCommentItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsPriceCommentItem createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsPriceCommentItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsPriceCommentItem[] newArray(int i12) {
            return new ImvCarsDetailsPriceCommentItem[i12];
        }
    }

    public ImvCarsDetailsPriceCommentItem(@k String str, @l String str2, @l String str3, @l String str4) {
        this.f170215b = str;
        this.f170216c = str2;
        this.f170217d = str3;
        this.f170218e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsPriceCommentItem)) {
            return false;
        }
        ImvCarsDetailsPriceCommentItem imvCarsDetailsPriceCommentItem = (ImvCarsDetailsPriceCommentItem) obj;
        return L.f(this.f170215b, imvCarsDetailsPriceCommentItem.f170215b) && L.f(this.f170216c, imvCarsDetailsPriceCommentItem.f170216c) && L.f(this.f170217d, imvCarsDetailsPriceCommentItem.f170217d) && L.f(this.f170218e, imvCarsDetailsPriceCommentItem.f170218e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return getF272243c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272243c() {
        return this.f170215b;
    }

    public final int hashCode() {
        int iHashCode = this.f170215b.hashCode() * 31;
        String str = this.f170216c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170217d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f170218e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvCarsDetailsPriceCommentItem(stringId=");
        sb2.append(this.f170215b);
        sb2.append(", title=");
        sb2.append(this.f170216c);
        sb2.append(", subtitle=");
        sb2.append(this.f170217d);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f170218e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170215b);
        parcel.writeString(this.f170216c);
        parcel.writeString(this.f170217d);
        parcel.writeString(this.f170218e);
    }
}
