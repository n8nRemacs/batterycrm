package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: InstallmentsOnboardingShowLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsOnboardingShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class InstallmentsOnboardingShowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<InstallmentsOnboardingShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133395c;

    /* compiled from: InstallmentsOnboardingShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsOnboardingShowLink> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsOnboardingShowLink createFromParcel(Parcel parcel) {
            return new InstallmentsOnboardingShowLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsOnboardingShowLink[] newArray(int i12) {
            return new InstallmentsOnboardingShowLink[i12];
        }
    }

    /* compiled from: InstallmentsOnboardingShowLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsOnboardingShowLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f133396b = new b();
    }

    public InstallmentsOnboardingShowLink(@Y61.k String str, @Y61.l String str2) {
        this.f133394b = str;
        this.f133395c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsOnboardingShowLink)) {
            return false;
        }
        InstallmentsOnboardingShowLink installmentsOnboardingShowLink = (InstallmentsOnboardingShowLink) obj;
        return kotlin.jvm.internal.L.f(this.f133394b, installmentsOnboardingShowLink.f133394b) && kotlin.jvm.internal.L.f(this.f133395c, installmentsOnboardingShowLink.f133395c);
    }

    public final int hashCode() {
        int iHashCode = this.f133394b.hashCode() * 31;
        String str = this.f133395c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsOnboardingShowLink(requestUrl=");
        sb2.append(this.f133394b);
        sb2.append(", screenName=");
        return C22026a.c(sb2, this.f133395c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133394b);
        parcel.writeString(this.f133395c);
    }
}
