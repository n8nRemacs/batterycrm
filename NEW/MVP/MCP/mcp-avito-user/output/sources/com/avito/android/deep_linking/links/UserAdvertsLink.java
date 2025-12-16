package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: UserAdvertsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAdvertsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class UserAdvertsLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<UserAdvertsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133835b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133836c;

    /* compiled from: UserAdvertsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsLink> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsLink createFromParcel(Parcel parcel) {
            return new UserAdvertsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsLink[] newArray(int i12) {
            return new UserAdvertsLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAdvertsLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133835b);
        parcel.writeString(this.f133836c);
    }

    public UserAdvertsLink(@Y61.l String str, @Y61.l String str2) {
        this.f133835b = str;
        this.f133836c = str2;
    }

    public /* synthetic */ UserAdvertsLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
