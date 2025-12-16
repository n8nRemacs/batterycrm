package com.avito.android.serp.adapter.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SerpConstructorAdvertItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/PriceModel;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PriceModel implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PriceModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f269453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f269454c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f269455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f269456e;

    /* compiled from: SerpConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceModel> {
        @Override // android.os.Parcelable.Creator
        public final PriceModel createFromParcel(Parcel parcel) {
            return new PriceModel(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(PriceModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceModel[] newArray(int i12) {
            return new PriceModel[i12];
        }
    }

    public PriceModel(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l UniversalColor universalColor) {
        this.f269453b = str;
        this.f269454c = str2;
        this.f269455d = str3;
        this.f269456e = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceModel)) {
            return false;
        }
        PriceModel priceModel = (PriceModel) obj;
        return L.f(this.f269453b, priceModel.f269453b) && L.f(this.f269454c, priceModel.f269454c) && L.f(this.f269455d, priceModel.f269455d) && L.f(this.f269456e, priceModel.f269456e);
    }

    public final int hashCode() {
        String str = this.f269453b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f269454c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f269455d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalColor universalColor = this.f269456e;
        return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceModel(current=");
        sb2.append(this.f269453b);
        sb2.append(", previous=");
        sb2.append(this.f269454c);
        sb2.append(", priceWithoutDiscount=");
        sb2.append(this.f269455d);
        sb2.append(", highlightColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f269456e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f269453b);
        parcel.writeString(this.f269454c);
        parcel.writeString(this.f269455d);
        parcel.writeParcelable(this.f269456e, i12);
    }
}
