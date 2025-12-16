package com.avito.android.authorization.auth;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthPresenter.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/OnboardingState;", "", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnboardingState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<OnboardingState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final OnboardingState f92869b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OnboardingState[] f92870c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f92871d;

    static {
        OnboardingState onboardingState = new OnboardingState("START", 0);
        f92869b = onboardingState;
        OnboardingState[] onboardingStateArr = {onboardingState, new OnboardingState("BUSINESS_REGISTRATION_ONBOARDING", 1), new OnboardingState("POST_AUTH_DEEPLINK", 2), new OnboardingState("VK_GROUP_SUBSCRIPTION", 3), new OnboardingState("ACTUALIZATION", 4), new OnboardingState("REGISTRATION_LEGAL", 5), new OnboardingState("FINISH", 6)};
        f92870c = onboardingStateArr;
        f92871d = kotlin.enums.c.a(onboardingStateArr);
        CREATOR = new Parcelable.Creator<OnboardingState>() { // from class: com.avito.android.authorization.auth.OnboardingState.a
            @Override // android.os.Parcelable.Creator
            public final OnboardingState createFromParcel(Parcel parcel) {
                return OnboardingState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingState[] newArray(int i12) {
                return new OnboardingState[i12];
            }
        };
    }

    public OnboardingState() {
        throw null;
    }

    public static OnboardingState valueOf(String str) {
        return (OnboardingState) Enum.valueOf(OnboardingState.class, str);
    }

    public static OnboardingState[] values() {
        return (OnboardingState[]) f92870c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
