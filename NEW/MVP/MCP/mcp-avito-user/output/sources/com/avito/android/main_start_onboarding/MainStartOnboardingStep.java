package com.avito.android.main_start_onboarding;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MainStartOnboardingStep.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Landroid/os/Parcelable;", "()V", "Authorization", "LocationPermission", "LoyaltyOnboarding", "MiniMenuOnBoarding", "MiuiProblemSheet", "NotificationPermission", "OnBoardingSheet", "ReplaceMainExitOnboarding", "Tooltip", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$Authorization;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$LocationPermission;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$LoyaltyOnboarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$MiniMenuOnBoarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$MiuiProblemSheet;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$NotificationPermission;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$OnBoardingSheet;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$ReplaceMainExitOnboarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$Tooltip;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class MainStartOnboardingStep implements Parcelable {

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$Authorization;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lcom/avito/android/main_start_onboarding/c;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Authorization extends MainStartOnboardingStep implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Authorization f184215b = new Authorization();

        @k
        public static final Parcelable.Creator<Authorization> CREATOR = new a();

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Authorization> {
            @Override // android.os.Parcelable.Creator
            public final Authorization createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Authorization.f184215b;
            }

            @Override // android.os.Parcelable.Creator
            public final Authorization[] newArray(int i12) {
                return new Authorization[i12];
            }
        }

        public Authorization() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Authorization);
        }

        public final int hashCode() {
            return 1368911232;
        }

        @k
        public final String toString() {
            return "Authorization";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$LocationPermission;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lcom/avito/android/main_start_onboarding/c;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationPermission extends MainStartOnboardingStep implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LocationPermission f184216b = new LocationPermission();

        @k
        public static final Parcelable.Creator<LocationPermission> CREATOR = new a();

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LocationPermission> {
            @Override // android.os.Parcelable.Creator
            public final LocationPermission createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LocationPermission.f184216b;
            }

            @Override // android.os.Parcelable.Creator
            public final LocationPermission[] newArray(int i12) {
                return new LocationPermission[i12];
            }
        }

        public LocationPermission() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LocationPermission);
        }

        public final int hashCode() {
            return 113435325;
        }

        @k
        public final String toString() {
            return "LocationPermission";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$LoyaltyOnboarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lcom/avito/android/main_start_onboarding/c;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoyaltyOnboarding extends MainStartOnboardingStep implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoyaltyOnboarding f184217b = new LoyaltyOnboarding();

        @k
        public static final Parcelable.Creator<LoyaltyOnboarding> CREATOR = new a();

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoyaltyOnboarding> {
            @Override // android.os.Parcelable.Creator
            public final LoyaltyOnboarding createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LoyaltyOnboarding.f184217b;
            }

            @Override // android.os.Parcelable.Creator
            public final LoyaltyOnboarding[] newArray(int i12) {
                return new LoyaltyOnboarding[i12];
            }
        }

        public LoyaltyOnboarding() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoyaltyOnboarding);
        }

        public final int hashCode() {
            return 1817962632;
        }

        @k
        public final String toString() {
            return "LoyaltyOnboarding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$MiniMenuOnBoarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lcom/avito/android/main_start_onboarding/c;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MiniMenuOnBoarding extends MainStartOnboardingStep implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MiniMenuOnBoarding f184218b = new MiniMenuOnBoarding();

        @k
        public static final Parcelable.Creator<MiniMenuOnBoarding> CREATOR = new a();

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MiniMenuOnBoarding> {
            @Override // android.os.Parcelable.Creator
            public final MiniMenuOnBoarding createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MiniMenuOnBoarding.f184218b;
            }

            @Override // android.os.Parcelable.Creator
            public final MiniMenuOnBoarding[] newArray(int i12) {
                return new MiniMenuOnBoarding[i12];
            }
        }

        public MiniMenuOnBoarding() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof MiniMenuOnBoarding);
        }

        public final int hashCode() {
            return 1932110986;
        }

        @k
        public final String toString() {
            return "MiniMenuOnBoarding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$MiuiProblemSheet;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class MiuiProblemSheet extends MainStartOnboardingStep {

        @k
        public static final Parcelable.Creator<MiuiProblemSheet> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f184219b;

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$MiuiProblemSheet$a;", "", "<init>", "()V", "", "DEEPLINK_REQUEST_KEY", "Ljava/lang/String;", "STEP_BUNDLE_KEY", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<MiuiProblemSheet> {
            @Override // android.os.Parcelable.Creator
            public final MiuiProblemSheet createFromParcel(Parcel parcel) {
                return new MiuiProblemSheet((DeepLink) parcel.readParcelable(MiuiProblemSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MiuiProblemSheet[] newArray(int i12) {
                return new MiuiProblemSheet[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public MiuiProblemSheet(@k DeepLink deepLink) {
            super(null);
            this.f184219b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiuiProblemSheet) && L.f(this.f184219b, ((MiuiProblemSheet) obj).f184219b);
        }

        public final int hashCode() {
            return this.f184219b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("MiuiProblemSheet(deeplink="), this.f184219b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f184219b, i12);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$NotificationPermission;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class NotificationPermission extends MainStartOnboardingStep {

        @k
        public static final Parcelable.Creator<NotificationPermission> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f184220b;

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$NotificationPermission$a;", "", "<init>", "()V", "", "DEEPLINK_REQUEST_KEY", "Ljava/lang/String;", "STEP_BUNDLE_KEY", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<NotificationPermission> {
            @Override // android.os.Parcelable.Creator
            public final NotificationPermission createFromParcel(Parcel parcel) {
                return new NotificationPermission((DeepLink) parcel.readParcelable(NotificationPermission.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationPermission[] newArray(int i12) {
                return new NotificationPermission[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public NotificationPermission(@k DeepLink deepLink) {
            super(null);
            this.f184220b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationPermission) && L.f(this.f184220b, ((NotificationPermission) obj).f184220b);
        }

        public final int hashCode() {
            return this.f184220b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NotificationPermission(deeplink="), this.f184220b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f184220b, i12);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$OnBoardingSheet;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OnBoardingSheet extends MainStartOnboardingStep {

        @k
        public static final Parcelable.Creator<OnBoardingSheet> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f184221b;

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$OnBoardingSheet$a;", "", "<init>", "()V", "", "DEEPLINK_REQUEST_KEY", "Ljava/lang/String;", "STEP_BUNDLE_KEY", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<OnBoardingSheet> {
            @Override // android.os.Parcelable.Creator
            public final OnBoardingSheet createFromParcel(Parcel parcel) {
                return new OnBoardingSheet((DeepLink) parcel.readParcelable(OnBoardingSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnBoardingSheet[] newArray(int i12) {
                return new OnBoardingSheet[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public OnBoardingSheet(@k DeepLink deepLink) {
            super(null);
            this.f184221b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBoardingSheet) && L.f(this.f184221b, ((OnBoardingSheet) obj).f184221b);
        }

        public final int hashCode() {
            return this.f184221b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnBoardingSheet(deeplink="), this.f184221b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f184221b, i12);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$ReplaceMainExitOnboarding;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "Lcom/avito/android/main_start_onboarding/c;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReplaceMainExitOnboarding extends MainStartOnboardingStep implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ReplaceMainExitOnboarding f184222b = new ReplaceMainExitOnboarding();

        @k
        public static final Parcelable.Creator<ReplaceMainExitOnboarding> CREATOR = new a();

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReplaceMainExitOnboarding> {
            @Override // android.os.Parcelable.Creator
            public final ReplaceMainExitOnboarding createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ReplaceMainExitOnboarding.f184222b;
            }

            @Override // android.os.Parcelable.Creator
            public final ReplaceMainExitOnboarding[] newArray(int i12) {
                return new ReplaceMainExitOnboarding[i12];
            }
        }

        public ReplaceMainExitOnboarding() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ReplaceMainExitOnboarding);
        }

        public final int hashCode() {
            return -1858683827;
        }

        @k
        public final String toString() {
            return "ReplaceMainExitOnboarding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MainStartOnboardingStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep$Tooltip;", "Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tooltip extends MainStartOnboardingStep {

        @k
        public static final Parcelable.Creator<Tooltip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final NavigationTab f184223b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f184224c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f184225d;

        /* compiled from: MainStartOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Tooltip> {
            @Override // android.os.Parcelable.Creator
            public final Tooltip createFromParcel(Parcel parcel) {
                return new Tooltip((NavigationTab) parcel.readParcelable(Tooltip.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@k NavigationTab navigationTab, @k String str, @l Integer num) {
            super(null);
            this.f184223b = navigationTab;
            this.f184224c = str;
            this.f184225d = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) obj;
            return this.f184223b == tooltip.f184223b && L.f(this.f184224c, tooltip.f184224c) && L.f(this.f184225d, tooltip.f184225d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f184223b.hashCode() * 31, 31, this.f184224c);
            Integer num = this.f184225d;
            return iD2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(tab=");
            sb2.append(this.f184223b);
            sb2.append(", text=");
            sb2.append(this.f184224c);
            sb2.append(", style=");
            return s.j(sb2, this.f184225d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f184223b, i12);
            parcel.writeString(this.f184224c);
            Integer num = this.f184225d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }

        public /* synthetic */ Tooltip(NavigationTab navigationTab, String str, Integer num, int i12, C42822w c42822w) {
            this(navigationTab, str, (i12 & 4) != 0 ? null : num);
        }
    }

    public /* synthetic */ MainStartOnboardingStep(C42822w c42822w) {
        this();
    }

    public MainStartOnboardingStep() {
    }
}
