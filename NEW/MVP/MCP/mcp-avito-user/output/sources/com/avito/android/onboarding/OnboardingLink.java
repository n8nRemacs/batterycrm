package com.avito.android.onboarding;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OnboardingLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/OnboardingLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class OnboardingLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<OnboardingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f208694b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f208695c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f208696d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f208697e;

    /* compiled from: OnboardingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingLink> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingLink createFromParcel(Parcel parcel) {
            return new OnboardingLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingLink[] newArray(int i12) {
            return new OnboardingLink[i12];
        }
    }

    /* compiled from: OnboardingLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/OnboardingLink$b;", "", "<init>", "()V", "a", "b", "_avito_onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: OnboardingLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/OnboardingLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f208698b = new a();
        }

        /* compiled from: OnboardingLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/OnboardingLink$b$b;", "LJu/c$a;", "<init>", "()V", "_avito_onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.onboarding.OnboardingLink$b$b, reason: collision with other inner class name */
        public static final class C6223b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6223b f208699b = new C6223b();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ OnboardingLink(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingLink)) {
            return false;
        }
        OnboardingLink onboardingLink = (OnboardingLink) obj;
        return L.f(this.f208694b, onboardingLink.f208694b) && L.f(this.f208695c, onboardingLink.f208695c) && L.f(this.f208696d, onboardingLink.f208696d) && L.f(this.f208697e, onboardingLink.f208697e);
    }

    public final int hashCode() {
        String str = this.f208694b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f208695c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f208696d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f208697e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingLink(id=");
        sb2.append(this.f208694b);
        sb2.append(", locationId=");
        sb2.append(this.f208695c);
        sb2.append(", eventEncoded=");
        sb2.append(this.f208696d);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f208697e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f208694b);
        parcel.writeString(this.f208695c);
        parcel.writeString(this.f208696d);
        parcel.writeString(this.f208697e);
    }

    public OnboardingLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f208694b = str;
        this.f208695c = str2;
        this.f208696d = str3;
        this.f208697e = str4;
    }
}
