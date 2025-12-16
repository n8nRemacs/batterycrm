package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AddCarToGarageLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AddCarToGarageLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AddCarToGarageLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AddCarToGarageLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132934c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f132935d;

    /* compiled from: AddCarToGarageLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddCarToGarageLink> {
        @Override // android.os.Parcelable.Creator
        public final AddCarToGarageLink createFromParcel(Parcel parcel) {
            return new AddCarToGarageLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddCarToGarageLink[] newArray(int i12) {
            return new AddCarToGarageLink[i12];
        }
    }

    public AddCarToGarageLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f132933b = str;
        this.f132934c = str2;
        this.f132935d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCarToGarageLink)) {
            return false;
        }
        AddCarToGarageLink addCarToGarageLink = (AddCarToGarageLink) obj;
        return kotlin.jvm.internal.L.f(this.f132933b, addCarToGarageLink.f132933b) && kotlin.jvm.internal.L.f(this.f132934c, addCarToGarageLink.f132934c) && kotlin.jvm.internal.L.f(this.f132935d, addCarToGarageLink.f132935d);
    }

    public final int hashCode() {
        int iHashCode = this.f132933b.hashCode() * 31;
        String str = this.f132934c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132935d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddCarToGarageLink(title=");
        sb2.append(this.f132933b);
        sb2.append(", vin=");
        sb2.append(this.f132934c);
        sb2.append(", regNum=");
        return C22026a.c(sb2, this.f132935d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132933b);
        parcel.writeString(this.f132934c);
        parcel.writeString(this.f132935d);
    }
}
