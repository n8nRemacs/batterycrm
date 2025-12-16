package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: VerificationPhoneLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/MobilePhoneVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class MobilePhoneVerificationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<MobilePhoneVerificationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f133919b;

    /* compiled from: VerificationPhoneLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MobilePhoneVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final MobilePhoneVerificationLink createFromParcel(Parcel parcel) {
            return new MobilePhoneVerificationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MobilePhoneVerificationLink[] newArray(int i12) {
            return new MobilePhoneVerificationLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobilePhoneVerificationLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133919b);
    }

    public MobilePhoneVerificationLink(@k String str) {
        this.f133919b = str;
    }

    public /* synthetic */ MobilePhoneVerificationLink(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str);
    }
}
