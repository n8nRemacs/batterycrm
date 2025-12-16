package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DiscountDispatchLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchLink;", "Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DiscountDispatchLink extends DiscountDispatchDeeplink {

    @Y61.k
    public static final Parcelable.Creator<DiscountDispatchLink> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f133276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133278g;

    /* compiled from: DiscountDispatchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountDispatchLink> {
        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchLink createFromParcel(Parcel parcel) {
            return new DiscountDispatchLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchLink[] newArray(int i12) {
            return new DiscountDispatchLink[i12];
        }
    }

    public /* synthetic */ DiscountDispatchLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountDispatchLink)) {
            return false;
        }
        DiscountDispatchLink discountDispatchLink = (DiscountDispatchLink) obj;
        return kotlin.jvm.internal.L.f(this.f133276e, discountDispatchLink.f133276e) && kotlin.jvm.internal.L.f(this.f133277f, discountDispatchLink.f133277f) && kotlin.jvm.internal.L.f(this.f133278g, discountDispatchLink.f133278g);
    }

    @Override // com.avito.android.deep_linking.links.DiscountDispatchDeeplink
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getF133274c() {
        return this.f133277f;
    }

    @Override // com.avito.android.deep_linking.links.DiscountDispatchDeeplink
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getF133275d() {
        return this.f133278g;
    }

    @Override // com.avito.android.deep_linking.links.DiscountDispatchDeeplink
    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public final String getF133273b() {
        return this.f133276e;
    }

    public final int hashCode() {
        int iHashCode = this.f133276e.hashCode() * 31;
        String str = this.f133277f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133278g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountDispatchLink(itemId=");
        sb2.append(this.f133276e);
        sb2.append(", action=");
        sb2.append(this.f133277f);
        sb2.append(", from=");
        return C22026a.c(sb2, this.f133278g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133276e);
        parcel.writeString(this.f133277f);
        parcel.writeString(this.f133278g);
    }

    public DiscountDispatchLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        super(str, str2, str3, null);
        this.f133276e = str;
        this.f133277f = str2;
        this.f133278g = str3;
    }
}
