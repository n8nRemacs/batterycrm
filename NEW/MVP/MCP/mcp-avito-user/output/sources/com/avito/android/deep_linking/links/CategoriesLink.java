package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CategoriesLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/CategoriesLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CategoriesLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CategoriesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133090b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133091c;

    /* compiled from: CategoriesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoriesLink> {
        @Override // android.os.Parcelable.Creator
        public final CategoriesLink createFromParcel(Parcel parcel) {
            return new CategoriesLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategoriesLink[] newArray(int i12) {
            return new CategoriesLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategoriesLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoriesLink)) {
            return false;
        }
        CategoriesLink categoriesLink = (CategoriesLink) obj;
        return kotlin.jvm.internal.L.f(this.f133090b, categoriesLink.f133090b) && kotlin.jvm.internal.L.f(this.f133091c, categoriesLink.f133091c);
    }

    public final int hashCode() {
        String str = this.f133090b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133091c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoriesLink(categoryId=");
        sb2.append(this.f133090b);
        sb2.append(", locationId=");
        return C22026a.c(sb2, this.f133091c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133090b);
        parcel.writeString(this.f133091c);
    }

    public /* synthetic */ CategoriesLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public CategoriesLink(@Y61.l String str, @Y61.l String str2) {
        this.f133090b = str;
        this.f133091c = str2;
    }
}
