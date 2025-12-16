package com.avito.android.intermediary_verification.presentation.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BuildState", "Cancel", "FollowDeeplink", "LeavePublish", "UpdateVerification", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$BuildState;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$Cancel;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$FollowDeeplink;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$LeavePublish;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$UpdateVerification;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IntermediaryVerificationInternalAction extends n {

    /* compiled from: IntermediaryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$BuildState;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildState implements IntermediaryVerificationInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuildState)) {
                return false;
            }
            ((BuildState) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "BuildState(data=" + ((Object) null) + ')';
        }
    }

    /* compiled from: IntermediaryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$Cancel;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel implements IntermediaryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Cancel f173190b = new Cancel();

        private Cancel() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 528178676;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: IntermediaryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$FollowDeeplink;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowDeeplink implements IntermediaryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f173191b;

        public FollowDeeplink(@k DeepLink deepLink) {
            this.f173191b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowDeeplink) && L.f(this.f173191b, ((FollowDeeplink) obj).f173191b);
        }

        public final int hashCode() {
            return this.f173191b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f173191b, ')');
        }
    }

    /* compiled from: IntermediaryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$LeavePublish;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeavePublish implements IntermediaryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LeavePublish f173192b = new LeavePublish();

        private LeavePublish() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LeavePublish);
        }

        public final int hashCode() {
            return -1670551982;
        }

        @k
        public final String toString() {
            return "LeavePublish";
        }
    }

    /* compiled from: IntermediaryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction$UpdateVerification;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVerification implements IntermediaryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateVerification f173193b = new UpdateVerification();

        private UpdateVerification() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateVerification);
        }

        public final int hashCode() {
            return 499205630;
        }

        @k
        public final String toString() {
            return "UpdateVerification";
        }
    }
}
