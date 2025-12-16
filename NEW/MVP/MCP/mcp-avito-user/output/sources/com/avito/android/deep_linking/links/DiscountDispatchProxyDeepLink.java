package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DiscountDispatchProxyDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchProxyDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DiscountDispatchProxyDeepLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final DiscountDispatchProxyDeepLink f133281b = new DiscountDispatchProxyDeepLink();

    @Y61.k
    public static final Parcelable.Creator<DiscountDispatchProxyDeepLink> CREATOR = new a();

    /* compiled from: DiscountDispatchProxyDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountDispatchProxyDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchProxyDeepLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DiscountDispatchProxyDeepLink.f133281b;
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountDispatchProxyDeepLink[] newArray(int i12) {
            return new DiscountDispatchProxyDeepLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof DiscountDispatchProxyDeepLink);
    }

    public final int hashCode() {
        return 388630326;
    }

    @Y61.k
    public final String toString() {
        return "DiscountDispatchProxyDeepLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
