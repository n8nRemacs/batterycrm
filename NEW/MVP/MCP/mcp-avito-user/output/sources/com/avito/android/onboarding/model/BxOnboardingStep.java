package com.avito.android.onboarding.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.onboarding.E;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxOnboardingStep.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep;", "Landroid/os/Parcelable;", "MiuiProblemSheet", "NotificationPermission", "OnBoardingSheet", "ShowReplaceMainExitOnboarding", "View", "Lcom/avito/android/onboarding/model/BxOnboardingStep$MiuiProblemSheet;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$NotificationPermission;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$OnBoardingSheet;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$ShowReplaceMainExitOnboarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BxOnboardingStep implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f209121b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Class<? extends E> f209122c;

    /* compiled from: BxOnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$MiuiProblemSheet;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MiuiProblemSheet extends BxOnboardingStep {

        @k
        public static final Parcelable.Creator<MiuiProblemSheet> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f209123d;

        /* compiled from: BxOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MiuiProblemSheet> {
            @Override // android.os.Parcelable.Creator
            public final MiuiProblemSheet createFromParcel(Parcel parcel) {
                return new MiuiProblemSheet((DeepLink) parcel.readParcelable(MiuiProblemSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MiuiProblemSheet[] newArray(int i12) {
                return new MiuiProblemSheet[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MiuiProblemSheet(@k DeepLink deepLink) {
            super("miuiProblemSheet", null, 2, 0 == true ? 1 : 0);
            this.f209123d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiuiProblemSheet) && L.f(this.f209123d, ((MiuiProblemSheet) obj).f209123d);
        }

        public final int hashCode() {
            return this.f209123d.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("MiuiProblemSheet(deeplink="), this.f209123d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f209123d, i12);
        }
    }

    /* compiled from: BxOnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$NotificationPermission;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationPermission extends BxOnboardingStep {

        @k
        public static final Parcelable.Creator<NotificationPermission> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f209124d;

        /* compiled from: BxOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotificationPermission> {
            @Override // android.os.Parcelable.Creator
            public final NotificationPermission createFromParcel(Parcel parcel) {
                return new NotificationPermission((DeepLink) parcel.readParcelable(NotificationPermission.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationPermission[] newArray(int i12) {
                return new NotificationPermission[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationPermission(@k DeepLink deepLink) {
            super("notificationPermission", null, 2, 0 == true ? 1 : 0);
            this.f209124d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationPermission) && L.f(this.f209124d, ((NotificationPermission) obj).f209124d);
        }

        public final int hashCode() {
            return this.f209124d.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NotificationPermission(deeplink="), this.f209124d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f209124d, i12);
        }
    }

    /* compiled from: BxOnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$OnBoardingSheet;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBoardingSheet extends BxOnboardingStep {

        @k
        public static final Parcelable.Creator<OnBoardingSheet> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f209125d;

        /* compiled from: BxOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnBoardingSheet> {
            @Override // android.os.Parcelable.Creator
            public final OnBoardingSheet createFromParcel(Parcel parcel) {
                return new OnBoardingSheet((DeepLink) parcel.readParcelable(OnBoardingSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnBoardingSheet[] newArray(int i12) {
                return new OnBoardingSheet[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnBoardingSheet(@k DeepLink deepLink) {
            super("onBoardingSheet", null, 2, 0 == true ? 1 : 0);
            this.f209125d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBoardingSheet) && L.f(this.f209125d, ((OnBoardingSheet) obj).f209125d);
        }

        public final int hashCode() {
            return this.f209125d.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnBoardingSheet(deeplink="), this.f209125d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f209125d, i12);
        }
    }

    /* compiled from: BxOnboardingStep.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$ShowReplaceMainExitOnboarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowReplaceMainExitOnboarding extends BxOnboardingStep {

        @k
        public static final Parcelable.Creator<ShowReplaceMainExitOnboarding> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ReplaceMainExitOnboarding f209126d;

        /* compiled from: BxOnboardingStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowReplaceMainExitOnboarding> {
            @Override // android.os.Parcelable.Creator
            public final ShowReplaceMainExitOnboarding createFromParcel(Parcel parcel) {
                return new ShowReplaceMainExitOnboarding((ReplaceMainExitOnboarding) parcel.readParcelable(ShowReplaceMainExitOnboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShowReplaceMainExitOnboarding[] newArray(int i12) {
                return new ShowReplaceMainExitOnboarding[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowReplaceMainExitOnboarding(@k ReplaceMainExitOnboarding replaceMainExitOnboarding) {
            super("replaceMainExitOnboarding", null, 2, 0 == true ? 1 : 0);
            this.f209126d = replaceMainExitOnboarding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowReplaceMainExitOnboarding) && L.f(this.f209126d, ((ShowReplaceMainExitOnboarding) obj).f209126d);
        }

        public final int hashCode() {
            return this.f209126d.hashCode();
        }

        @k
        public final String toString() {
            return "ShowReplaceMainExitOnboarding(onboarding=" + this.f209126d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f209126d, i12);
        }
    }

    /* compiled from: BxOnboardingStep.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "Authorization", "LocationPermission", "LoyaltyOnboarding", "MiniMenuOnBoarding", "Tooltip", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View$Authorization;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View$LocationPermission;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View$LoyaltyOnboarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View$MiniMenuOnBoarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View$Tooltip;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class View extends BxOnboardingStep {

        /* compiled from: BxOnboardingStep.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View$Authorization;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Authorization extends View {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final Authorization f209127d = new Authorization();

            @k
            public static final Parcelable.Creator<Authorization> CREATOR = new a();

            /* compiled from: BxOnboardingStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Authorization> {
                @Override // android.os.Parcelable.Creator
                public final Authorization createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Authorization.f209127d;
                }

                @Override // android.os.Parcelable.Creator
                public final Authorization[] newArray(int i12) {
                    return new Authorization[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Authorization() {
                super("authorization", null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Authorization);
            }

            public final int hashCode() {
                return 372726644;
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

        /* compiled from: BxOnboardingStep.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View$LocationPermission;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LocationPermission extends View {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final LocationPermission f209128d = new LocationPermission();

            @k
            public static final Parcelable.Creator<LocationPermission> CREATOR = new a();

            /* compiled from: BxOnboardingStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LocationPermission> {
                @Override // android.os.Parcelable.Creator
                public final LocationPermission createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LocationPermission.f209128d;
                }

                @Override // android.os.Parcelable.Creator
                public final LocationPermission[] newArray(int i12) {
                    return new LocationPermission[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public LocationPermission() {
                super("locationPermission", null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof LocationPermission);
            }

            public final int hashCode() {
                return -300020407;
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

        /* compiled from: BxOnboardingStep.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View$LoyaltyOnboarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoyaltyOnboarding extends View {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final LoyaltyOnboarding f209129d = new LoyaltyOnboarding();

            @k
            public static final Parcelable.Creator<LoyaltyOnboarding> CREATOR = new a();

            /* compiled from: BxOnboardingStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LoyaltyOnboarding> {
                @Override // android.os.Parcelable.Creator
                public final LoyaltyOnboarding createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoyaltyOnboarding.f209129d;
                }

                @Override // android.os.Parcelable.Creator
                public final LoyaltyOnboarding[] newArray(int i12) {
                    return new LoyaltyOnboarding[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public LoyaltyOnboarding() {
                super("loyaltyOnboarding", null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof LoyaltyOnboarding);
            }

            public final int hashCode() {
                return -689226628;
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

        /* compiled from: BxOnboardingStep.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View$MiniMenuOnBoarding;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MiniMenuOnBoarding extends View {

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final MiniMenuOnBoarding f209130d = new MiniMenuOnBoarding();

            @k
            public static final Parcelable.Creator<MiniMenuOnBoarding> CREATOR = new a();

            /* compiled from: BxOnboardingStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MiniMenuOnBoarding> {
                @Override // android.os.Parcelable.Creator
                public final MiniMenuOnBoarding createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return MiniMenuOnBoarding.f209130d;
                }

                @Override // android.os.Parcelable.Creator
                public final MiniMenuOnBoarding[] newArray(int i12) {
                    return new MiniMenuOnBoarding[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public MiniMenuOnBoarding() {
                super("miniMenuOnBoarding", null, 2, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof MiniMenuOnBoarding);
            }

            public final int hashCode() {
                return 1518655254;
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

        /* compiled from: BxOnboardingStep.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep$View$Tooltip;", "Lcom/avito/android/onboarding/model/BxOnboardingStep$View;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Tooltip extends View {

            @k
            public static final Parcelable.Creator<Tooltip> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @k
            public final NavigationTab f209131d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f209132e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Integer f209133f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Integer f209134g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final Class<? extends E> f209135h;

            /* compiled from: BxOnboardingStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Tooltip> {
                @Override // android.os.Parcelable.Creator
                public final Tooltip createFromParcel(Parcel parcel) {
                    return new Tooltip((NavigationTab) parcel.readParcelable(Tooltip.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Class) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Tooltip[] newArray(int i12) {
                    return new Tooltip[i12];
                }
            }

            public /* synthetic */ Tooltip(NavigationTab navigationTab, String str, Integer num, Integer num2, Class cls, int i12, C42822w c42822w) {
                this(navigationTab, str, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : cls);
            }

            @Override // com.avito.android.onboarding.model.BxOnboardingStep
            @l
            public final Class<? extends E> c() {
                return this.f209135h;
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
                return this.f209131d == tooltip.f209131d && L.f(this.f209132e, tooltip.f209132e) && L.f(this.f209133f, tooltip.f209133f) && L.f(this.f209134g, tooltip.f209134g) && L.f(this.f209135h, tooltip.f209135h);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f209131d.hashCode() * 31, 31, this.f209132e);
                Integer num = this.f209133f;
                int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f209134g;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Class<? extends E> cls = this.f209135h;
                return iHashCode2 + (cls != null ? cls.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Tooltip(tab=" + this.f209131d + ", text=" + this.f209132e + ", style=" + this.f209133f + ", anchorOffsetDp=" + this.f209134g + ", handler=" + this.f209135h + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f209131d, i12);
                parcel.writeString(this.f209132e);
                Integer num = this.f209133f;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.f209134g;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
                parcel.writeSerializable(this.f209135h);
            }

            public Tooltip(@k NavigationTab navigationTab, @k String str, @l Integer num, @l Integer num2, @l Class<? extends E> cls) {
                super(TooltipAttribute.ATTRIBUTE_TYPE, cls, null);
                this.f209131d = navigationTab;
                this.f209132e = str;
                this.f209133f = num;
                this.f209134g = num2;
                this.f209135h = cls;
            }
        }

        public View() {
            throw null;
        }

        public /* synthetic */ View(String str, Class cls, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : cls, null);
        }

        public View(String str, Class cls, C42822w c42822w) {
            super(str, cls, null);
        }
    }

    public BxOnboardingStep() {
        throw null;
    }

    public /* synthetic */ BxOnboardingStep(String str, Class cls, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : cls, null);
    }

    @l
    public Class<? extends E> c() {
        return this.f209122c;
    }

    public BxOnboardingStep(String str, Class cls, C42822w c42822w) {
        this.f209121b = str;
        this.f209122c = cls;
    }
}
