package com.avito.android.services_onboarding;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServicesSteppedOnboardingIntentFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingTarget;", "Landroid/os/Parcelable;", "Cpx", "Stepped", "Lcom/avito/android/services_onboarding/ServicesOnboardingTarget$Cpx;", "Lcom/avito/android/services_onboarding/ServicesOnboardingTarget$Stepped;", "_avito_services-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServicesOnboardingTarget extends Parcelable {

    /* compiled from: ServicesSteppedOnboardingIntentFactory.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingTarget$Cpx;", "Lcom/avito/android/services_onboarding/ServicesOnboardingTarget;", "_avito_services-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cpx implements ServicesOnboardingTarget {

        @k
        public static final Parcelable.Creator<Cpx> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f279805b;

        /* compiled from: ServicesSteppedOnboardingIntentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cpx> {
            @Override // android.os.Parcelable.Creator
            public final Cpx createFromParcel(Parcel parcel) {
                return new Cpx(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Cpx[] newArray(int i12) {
                return new Cpx[i12];
            }
        }

        public Cpx(@k String str) {
            this.f279805b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cpx) && L.f(this.f279805b, ((Cpx) obj).f279805b);
        }

        public final int hashCode() {
            return this.f279805b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Cpx(cpxContext="), this.f279805b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f279805b);
        }
    }

    /* compiled from: ServicesSteppedOnboardingIntentFactory.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingTarget$Stepped;", "Lcom/avito/android/services_onboarding/ServicesOnboardingTarget;", "_avito_services-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stepped implements ServicesOnboardingTarget {

        @k
        public static final Parcelable.Creator<Stepped> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f279806b;

        /* compiled from: ServicesSteppedOnboardingIntentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Stepped> {
            @Override // android.os.Parcelable.Creator
            public final Stepped createFromParcel(Parcel parcel) {
                return new Stepped(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Stepped[] newArray(int i12) {
                return new Stepped[i12];
            }
        }

        public Stepped(@k String str) {
            this.f279806b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stepped) && L.f(this.f279806b, ((Stepped) obj).f279806b);
        }

        public final int hashCode() {
            return this.f279806b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Stepped(onboardingType="), this.f279806b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f279806b);
        }
    }
}
