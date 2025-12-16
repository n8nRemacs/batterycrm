package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ProfileSettingsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileSettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ProfileSettingsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ProfileSettingsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133614c;

    /* compiled from: ProfileSettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileSettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsLink createFromParcel(Parcel parcel) {
            return new ProfileSettingsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsLink[] newArray(int i12) {
            return new ProfileSettingsLink[i12];
        }
    }

    public /* synthetic */ ProfileSettingsLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133613b);
        parcel.writeString(this.f133614c);
    }

    public ProfileSettingsLink(@Y61.l String str, @Y61.l String str2) {
        this.f133613b = str;
        this.f133614c = str2;
    }
}
