package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AdvertAutoPublishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertAutoPublishLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class AdvertAutoPublishLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AdvertAutoPublishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f132946c;

    /* compiled from: AdvertAutoPublishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertAutoPublishLink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertAutoPublishLink createFromParcel(Parcel parcel) {
            return new AdvertAutoPublishLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertAutoPublishLink[] newArray(int i12) {
            return new AdvertAutoPublishLink[i12];
        }
    }

    public AdvertAutoPublishLink(@Y61.k String str, boolean z12) {
        this.f132945b = str;
        this.f132946c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132945b);
        parcel.writeInt(this.f132946c ? 1 : 0);
    }
}
