package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.TfaSource;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/RequireTfaRecoveryLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RequireTfaRecoveryLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RequireTfaRecoveryLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TfaSource f133952b;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequireTfaRecoveryLink> {
        @Override // android.os.Parcelable.Creator
        public final RequireTfaRecoveryLink createFromParcel(Parcel parcel) {
            return new RequireTfaRecoveryLink(TfaSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RequireTfaRecoveryLink[] newArray(int i12) {
            return new RequireTfaRecoveryLink[i12];
        }
    }

    public RequireTfaRecoveryLink(@k TfaSource tfaSource) {
        this.f133952b = tfaSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequireTfaRecoveryLink) && this.f133952b == ((RequireTfaRecoveryLink) obj).f133952b;
    }

    public final int hashCode() {
        return this.f133952b.hashCode();
    }

    @k
    public final String toString() {
        return "RequireTfaRecoveryLink(src=" + this.f133952b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133952b.name());
    }
}
