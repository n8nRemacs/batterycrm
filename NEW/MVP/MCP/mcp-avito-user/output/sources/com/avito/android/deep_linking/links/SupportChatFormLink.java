package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SupportChatFormLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/SupportChatFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class SupportChatFormLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SupportChatFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f133709b;

    /* compiled from: SupportChatFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SupportChatFormLink> {
        @Override // android.os.Parcelable.Creator
        public final SupportChatFormLink createFromParcel(Parcel parcel) {
            return new SupportChatFormLink(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SupportChatFormLink[] newArray(int i12) {
            return new SupportChatFormLink[i12];
        }
    }

    public SupportChatFormLink(int i12) {
        this.f133709b = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133709b);
    }
}
