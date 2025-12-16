package com.avito.android.onboarding.steps;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.onboarding.steps.analytics.OnboardingStepsAnalyticsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepsActivity.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/steps/OnboardingStepsScreenParams;", "Landroid/os/Parcelable;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingStepsScreenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<OnboardingStepsScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f209276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f209277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OnboardingStepsAnalyticsParams f209278d;

    /* compiled from: OnboardingStepsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingStepsScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingStepsScreenParams createFromParcel(Parcel parcel) {
            return new OnboardingStepsScreenParams(parcel.readString(), parcel.readString(), OnboardingStepsAnalyticsParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingStepsScreenParams[] newArray(int i12) {
            return new OnboardingStepsScreenParams[i12];
        }
    }

    public OnboardingStepsScreenParams(@Y61.k String str, @Y61.l String str2, @Y61.k OnboardingStepsAnalyticsParams onboardingStepsAnalyticsParams) {
        this.f209276b = str;
        this.f209277c = str2;
        this.f209278d = onboardingStepsAnalyticsParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingStepsScreenParams)) {
            return false;
        }
        OnboardingStepsScreenParams onboardingStepsScreenParams = (OnboardingStepsScreenParams) obj;
        return L.f(this.f209276b, onboardingStepsScreenParams.f209276b) && L.f(this.f209277c, onboardingStepsScreenParams.f209277c) && L.f(this.f209278d, onboardingStepsScreenParams.f209278d);
    }

    public final int hashCode() {
        int iHashCode = this.f209276b.hashCode() * 31;
        String str = this.f209277c;
        return this.f209278d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "OnboardingStepsScreenParams(label=" + this.f209276b + ", title=" + this.f209277c + ", analyticsParams=" + this.f209278d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f209276b);
        parcel.writeString(this.f209277c);
        this.f209278d.writeToParcel(parcel, i12);
    }
}
