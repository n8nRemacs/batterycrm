package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: UnsupportedPlatformActionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/UnsupportedPlatformActionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class UnsupportedPlatformActionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UnsupportedPlatformActionLink> CREATOR = new a();

    /* compiled from: UnsupportedPlatformActionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UnsupportedPlatformActionLink> {
        @Override // android.os.Parcelable.Creator
        public final UnsupportedPlatformActionLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new UnsupportedPlatformActionLink();
        }

        @Override // android.os.Parcelable.Creator
        public final UnsupportedPlatformActionLink[] newArray(int i12) {
            return new UnsupportedPlatformActionLink[i12];
        }
    }

    /* compiled from: UnsupportedPlatformActionLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UnsupportedPlatformActionLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
