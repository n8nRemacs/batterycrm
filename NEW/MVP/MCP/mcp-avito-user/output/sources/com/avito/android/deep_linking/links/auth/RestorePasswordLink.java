package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/RestorePasswordLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class RestorePasswordLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<RestorePasswordLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f133956b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133957c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133958d;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RestorePasswordLink> {
        @Override // android.os.Parcelable.Creator
        public final RestorePasswordLink createFromParcel(Parcel parcel) {
            return new RestorePasswordLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RestorePasswordLink[] newArray(int i12) {
            return new RestorePasswordLink[i12];
        }
    }

    public RestorePasswordLink(@k String str, @l String str2, @l String str3) {
        this.f133956b = str;
        this.f133957c = str2;
        this.f133958d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133956b);
        parcel.writeString(this.f133957c);
        parcel.writeString(this.f133958d);
    }
}
