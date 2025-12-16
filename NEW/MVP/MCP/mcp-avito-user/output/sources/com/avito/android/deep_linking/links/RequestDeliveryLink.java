package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RequestDeliveryLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/RequestDeliveryLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class RequestDeliveryLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RequestDeliveryLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133634b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133635c;

    /* compiled from: RequestDeliveryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequestDeliveryLink> {
        @Override // android.os.Parcelable.Creator
        public final RequestDeliveryLink createFromParcel(Parcel parcel) {
            return new RequestDeliveryLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RequestDeliveryLink[] newArray(int i12) {
            return new RequestDeliveryLink[i12];
        }
    }

    public RequestDeliveryLink(@Y61.k String str, @Y61.l String str2) {
        this.f133634b = str;
        this.f133635c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133634b);
        parcel.writeString(this.f133635c);
    }
}
