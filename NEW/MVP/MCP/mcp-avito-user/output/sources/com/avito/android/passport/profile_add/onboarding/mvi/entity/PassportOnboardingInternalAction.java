package com.avito.android.passport.profile_add.onboarding.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportOnboardingInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AccountsMerged", "Close", "Continue", "KnowMore", "ProfileCreated", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$AccountsMerged;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$Close;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$Continue;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$KnowMore;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$ProfileCreated;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PassportOnboardingInternalAction extends n {

    /* compiled from: PassportOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$AccountsMerged;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccountsMerged implements PassportOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f213583b;

        public AccountsMerged(@l PrintableText printableText) {
            this.f213583b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountsMerged) && L.f(this.f213583b, ((AccountsMerged) obj).f213583b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f213583b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("AccountsMerged(mergeSuccessText="), this.f213583b, ')');
        }
    }

    /* compiled from: PassportOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$Close;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements PassportOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f213584b = new Close();

        private Close() {
        }
    }

    /* compiled from: PassportOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$Continue;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Continue implements PassportOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Continue f213585b = new Continue();

        private Continue() {
        }
    }

    /* compiled from: PassportOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$KnowMore;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KnowMore implements PassportOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final KnowMore f213586b = new KnowMore();

        private KnowMore() {
        }
    }

    /* compiled from: PassportOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction$ProfileCreated;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileCreated implements PassportOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ProfileCreated f213587b = new ProfileCreated();

        private ProfileCreated() {
        }
    }
}
