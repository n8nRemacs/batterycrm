package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DiscountDispatchLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchLinkLegacy;", "Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DiscountDispatchLinkLegacy extends DiscountDispatchDeeplink {

    @Y61.k
    public static final Parcelable.Creator<DiscountDispatchLinkLegacy> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f133279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133280f;

    /* compiled from: DiscountDispatchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountDispatchLinkLegacy> {
        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchLinkLegacy createFromParcel(Parcel parcel) {
            return new DiscountDispatchLinkLegacy(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchLinkLegacy[] newArray(int i12) {
            return new DiscountDispatchLinkLegacy[i12];
        }
    }

    public /* synthetic */ DiscountDispatchLinkLegacy(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountDispatchLinkLegacy)) {
            return false;
        }
        DiscountDispatchLinkLegacy discountDispatchLinkLegacy = (DiscountDispatchLinkLegacy) obj;
        return kotlin.jvm.internal.L.f(this.f133279e, discountDispatchLinkLegacy.f133279e) && kotlin.jvm.internal.L.f(this.f133280f, discountDispatchLinkLegacy.f133280f);
    }

    @Override // com.avito.android.deep_linking.links.DiscountDispatchDeeplink
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getF133275d() {
        return this.f133280f;
    }

    @Override // com.avito.android.deep_linking.links.DiscountDispatchDeeplink
    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public final String getF133273b() {
        return this.f133279e;
    }

    public final int hashCode() {
        int iHashCode = this.f133279e.hashCode() * 31;
        String str = this.f133280f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountDispatchLinkLegacy(itemId=");
        sb2.append(this.f133279e);
        sb2.append(", from=");
        return C22026a.c(sb2, this.f133280f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133279e);
        parcel.writeString(this.f133280f);
    }

    public DiscountDispatchLinkLegacy(@Y61.k String str, @Y61.l String str2) {
        super(str, null, str2, null);
        this.f133279e = str;
        this.f133280f = str2;
    }
}
