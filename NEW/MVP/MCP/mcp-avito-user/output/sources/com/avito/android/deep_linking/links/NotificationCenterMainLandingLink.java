package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: NotificationCenterMainLandingLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/NotificationCenterMainLandingLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/deep_linking/links/v;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class NotificationCenterMainLandingLink extends DeepLink implements v {

    @Y61.k
    public static final Parcelable.Creator<NotificationCenterMainLandingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133516b;

    /* compiled from: NotificationCenterMainLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationCenterMainLandingLink> {
        @Override // android.os.Parcelable.Creator
        public final NotificationCenterMainLandingLink createFromParcel(Parcel parcel) {
            return new NotificationCenterMainLandingLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationCenterMainLandingLink[] newArray(int i12) {
            return new NotificationCenterMainLandingLink[i12];
        }
    }

    public NotificationCenterMainLandingLink(@Y61.k String str) {
        this.f133516b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133516b);
    }
}
