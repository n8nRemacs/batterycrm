package com.avito.android.constructor_advert.ui.serp.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "Landroid/os/Parcelable;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PriceModel implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PriceModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f125780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f125781c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f125782d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f125783e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125784f;

    /* compiled from: ConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceModel> {
        @Override // android.os.Parcelable.Creator
        public final PriceModel createFromParcel(Parcel parcel) {
            return new PriceModel(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(PriceModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceModel[] newArray(int i12) {
            return new PriceModel[i12];
        }
    }

    public PriceModel(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l UniversalColor universalColor, boolean z12) {
        this.f125780b = str;
        this.f125781c = str2;
        this.f125782d = str3;
        this.f125783e = universalColor;
        this.f125784f = z12;
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
        return L.f(this.f125780b, priceModel.f125780b) && L.f(this.f125781c, priceModel.f125781c) && L.f(this.f125782d, priceModel.f125782d) && L.f(this.f125783e, priceModel.f125783e) && this.f125784f == priceModel.f125784f;
    }

    public final int hashCode() {
        String str = this.f125780b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f125781c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f125782d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalColor universalColor = this.f125783e;
        return Boolean.hashCode(this.f125784f) + ((iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceModel(current=");
        sb2.append(this.f125780b);
        sb2.append(", previous=");
        sb2.append(this.f125781c);
        sb2.append(", priceWithoutDiscount=");
        sb2.append(this.f125782d);
        sb2.append(", highlightColor=");
        sb2.append(this.f125783e);
        sb2.append(", hasDiscount=");
        return androidx.appcompat.app.r.x(sb2, this.f125784f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f125780b);
        parcel.writeString(this.f125781c);
        parcel.writeString(this.f125782d);
        parcel.writeParcelable(this.f125783e, i12);
        parcel.writeInt(this.f125784f ? 1 : 0);
    }
}
