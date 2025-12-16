package com.avito.android.mortgage.verification_flow.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlowInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackClick", "Init", "PrimaryActionClicked", "SecondaryActionClicked", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$BackClick;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$Init;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$PrimaryActionClicked;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$SecondaryActionClicked;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VerificationFlowInternalAction extends n {

    /* compiled from: VerificationFlowInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$BackClick;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackClick implements VerificationFlowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BackClick f203915b = new BackClick();

        private BackClick() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return 1486509801;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: VerificationFlowInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$Init;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements VerificationFlowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationFlowArguments f203916b;

        public Init(@k VerificationFlowArguments verificationFlowArguments) {
            this.f203916b = verificationFlowArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f203916b, ((Init) obj).f203916b);
        }

        public final int hashCode() {
            return this.f203916b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(args=" + this.f203916b + ')';
        }
    }

    /* compiled from: VerificationFlowInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$PrimaryActionClicked;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrimaryActionClicked implements VerificationFlowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f203917b;

        public PrimaryActionClicked(@l DeepLink deepLink) {
            this.f203917b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryActionClicked) && L.f(this.f203917b, ((PrimaryActionClicked) obj).f203917b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f203917b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("PrimaryActionClicked(deeplink="), this.f203917b, ')');
        }
    }

    /* compiled from: VerificationFlowInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction$SecondaryActionClicked;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SecondaryActionClicked implements VerificationFlowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f203918b;

        public SecondaryActionClicked(@l DeepLink deepLink) {
            this.f203918b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondaryActionClicked) && L.f(this.f203918b, ((SecondaryActionClicked) obj).f203918b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f203918b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("SecondaryActionClicked(deeplink="), this.f203918b, ')');
        }
    }
}
