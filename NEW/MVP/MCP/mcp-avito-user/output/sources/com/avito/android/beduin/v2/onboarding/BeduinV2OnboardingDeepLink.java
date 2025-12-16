package com.avito.android.beduin.v2.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinV2OnboardingDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/BeduinV2OnboardingDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_beduin-v2-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2OnboardingDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<BeduinV2OnboardingDeepLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104636b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f104637c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f104638d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f104639e;

    /* compiled from: BeduinV2OnboardingDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/BeduinV2OnboardingDeepLink$a;", "", "<init>", "()V", "", "FIT_CONTENT", "Ljava/lang/String;", "HALF_HEIGHT", "MAX_HEIGHT", "_avito_beduin-v2-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2OnboardingDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinV2OnboardingDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2OnboardingDeepLink createFromParcel(Parcel parcel) {
            return new BeduinV2OnboardingDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2OnboardingDeepLink[] newArray(int i12) {
            return new BeduinV2OnboardingDeepLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public BeduinV2OnboardingDeepLink(@k String str, @l String str2, @k String str3, @l String str4) {
        this.f104636b = str;
        this.f104637c = str2;
        this.f104638d = str3;
        this.f104639e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2OnboardingDeepLink)) {
            return false;
        }
        BeduinV2OnboardingDeepLink beduinV2OnboardingDeepLink = (BeduinV2OnboardingDeepLink) obj;
        return L.f(this.f104636b, beduinV2OnboardingDeepLink.f104636b) && L.f(this.f104637c, beduinV2OnboardingDeepLink.f104637c) && L.f(this.f104638d, beduinV2OnboardingDeepLink.f104638d) && L.f(this.f104639e, beduinV2OnboardingDeepLink.f104639e);
    }

    public final int hashCode() {
        int iHashCode = this.f104636b.hashCode() * 31;
        String str = this.f104637c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f104638d);
        String str2 = this.f104639e;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2OnboardingDeepLink(id=");
        sb2.append(this.f104636b);
        sb2.append(", eventEncoded=");
        sb2.append(this.f104637c);
        sb2.append(", heightMode=");
        sb2.append(this.f104638d);
        sb2.append(", onboardingContext=");
        return C22026a.c(sb2, this.f104639e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104636b);
        parcel.writeString(this.f104637c);
        parcel.writeString(this.f104638d);
        parcel.writeString(this.f104639e);
    }
}
