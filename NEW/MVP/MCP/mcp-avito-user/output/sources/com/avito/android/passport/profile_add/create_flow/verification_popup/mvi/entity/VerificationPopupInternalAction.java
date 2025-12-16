package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPopupInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleDeeplink", "Navigate", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction$HandleDeeplink;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction$Navigate;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VerificationPopupInternalAction extends n {

    /* compiled from: VerificationPopupInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction$HandleDeeplink;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements VerificationPopupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f212271b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f212271b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HandleDeeplink) {
                return this.f212271b.equals(((HandleDeeplink) obj).f212271b);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f212271b.hashCode() * 31) - 1084338561;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=" + this.f212271b + ", requestKey=passport.add_profile.verification_popup.start_verification)";
        }
    }

    /* compiled from: VerificationPopupInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction$Navigate;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Navigate implements VerificationPopupInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Navigation f212272b;

        public Navigate(@k Navigation navigation2) {
            this.f212272b = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Navigate) && L.f(this.f212272b, ((Navigate) obj).f212272b);
        }

        public final int hashCode() {
            return this.f212272b.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(navigation=" + this.f212272b + ')';
        }
    }
}
