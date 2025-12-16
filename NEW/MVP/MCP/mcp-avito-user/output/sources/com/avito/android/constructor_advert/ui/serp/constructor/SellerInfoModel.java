package com.avito.android.constructor_advert.ui.serp.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "Landroid/os/Parcelable;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerInfoModel implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SellerInfoModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f125785b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f125786c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f125787d;

    /* compiled from: ConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerInfoModel> {
        @Override // android.os.Parcelable.Creator
        public final SellerInfoModel createFromParcel(Parcel parcel) {
            return new SellerInfoModel(parcel.readString(), (Image) parcel.readParcelable(SellerInfoModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerInfoModel[] newArray(int i12) {
            return new SellerInfoModel[i12];
        }
    }

    public SellerInfoModel(@Y61.l String str, @Y61.l Image image, @Y61.l String str2) {
        this.f125785b = str;
        this.f125786c = image;
        this.f125787d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerInfoModel)) {
            return false;
        }
        SellerInfoModel sellerInfoModel = (SellerInfoModel) obj;
        return L.f(this.f125785b, sellerInfoModel.f125785b) && L.f(this.f125786c, sellerInfoModel.f125786c) && L.f(this.f125787d, sellerInfoModel.f125787d);
    }

    public final int hashCode() {
        String str = this.f125785b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f125786c;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.f125787d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerInfoModel(userKey=");
        sb2.append(this.f125785b);
        sb2.append(", image=");
        sb2.append(this.f125786c);
        sb2.append(", displayName=");
        return C22026a.c(sb2, this.f125787d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f125785b);
        parcel.writeParcelable(this.f125786c, i12);
        parcel.writeString(this.f125787d);
    }

    public /* synthetic */ SellerInfoModel(String str, Image image, String str2, int i12, C42822w c42822w) {
        this(str, image, (i12 & 4) != 0 ? null : str2);
    }
}
