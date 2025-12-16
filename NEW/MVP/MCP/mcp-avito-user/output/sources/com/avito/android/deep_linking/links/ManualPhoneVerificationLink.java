package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ManualPhoneVerificationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ManualPhoneVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ManualPhoneVerificationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ManualPhoneVerificationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhoneVerificationLinkContext f133435b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133436c;

    /* compiled from: ManualPhoneVerificationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ManualPhoneVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final ManualPhoneVerificationLink createFromParcel(Parcel parcel) {
            return new ManualPhoneVerificationLink(PhoneVerificationLinkContext.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ManualPhoneVerificationLink[] newArray(int i12) {
            return new ManualPhoneVerificationLink[i12];
        }
    }

    public ManualPhoneVerificationLink(@Y61.k PhoneVerificationLinkContext phoneVerificationLinkContext, @Y61.l String str) {
        this.f133435b = phoneVerificationLinkContext;
        this.f133436c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133435b.writeToParcel(parcel, i12);
        parcel.writeString(this.f133436c);
    }
}
