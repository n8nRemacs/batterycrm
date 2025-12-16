package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DiscountDispatchVasFooterActionClickedDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchVasFooterActionClickedDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DiscountDispatchVasFooterActionClickedDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DiscountDispatchVasFooterActionClickedDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133283c;

    /* compiled from: DiscountDispatchVasFooterActionClickedDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountDispatchVasFooterActionClickedDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchVasFooterActionClickedDeeplink createFromParcel(Parcel parcel) {
            return new DiscountDispatchVasFooterActionClickedDeeplink(parcel.readString(), (DeepLink) parcel.readParcelable(DiscountDispatchVasFooterActionClickedDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchVasFooterActionClickedDeeplink[] newArray(int i12) {
            return new DiscountDispatchVasFooterActionClickedDeeplink[i12];
        }
    }

    public /* synthetic */ DiscountDispatchVasFooterActionClickedDeeplink(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountDispatchVasFooterActionClickedDeeplink)) {
            return false;
        }
        DiscountDispatchVasFooterActionClickedDeeplink discountDispatchVasFooterActionClickedDeeplink = (DiscountDispatchVasFooterActionClickedDeeplink) obj;
        return kotlin.jvm.internal.L.f(this.f133282b, discountDispatchVasFooterActionClickedDeeplink.f133282b) && kotlin.jvm.internal.L.f(this.f133283c, discountDispatchVasFooterActionClickedDeeplink.f133283c);
    }

    public final int hashCode() {
        int iHashCode = this.f133282b.hashCode() * 31;
        DeepLink deepLink = this.f133283c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountDispatchVasFooterActionClickedDeeplink(actionSlug=");
        sb2.append(this.f133282b);
        sb2.append(", actionDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133283c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133282b);
        parcel.writeParcelable(this.f133283c, i12);
    }

    public DiscountDispatchVasFooterActionClickedDeeplink(@Y61.k String str, @Y61.l DeepLink deepLink) {
        this.f133282b = str;
        this.f133283c = deepLink;
    }
}
