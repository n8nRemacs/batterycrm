package com.avito.android.verification.verification_passport.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: PassportInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DismissCbrSDK", "FinishWithNoChanges", "SetErrorAndFinish", "SetSuccessAndFinish", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$DismissCbrSDK;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$FinishWithNoChanges;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$SetErrorAndFinish;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$SetSuccessAndFinish;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PassportInternalAction extends n {

    /* compiled from: PassportInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$DismissCbrSDK;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DismissCbrSDK implements PassportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissCbrSDK f325724b = new DismissCbrSDK();

        private DismissCbrSDK() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DismissCbrSDK);
        }

        public final int hashCode() {
            return -390851003;
        }

        @k
        public final String toString() {
            return "DismissCbrSDK";
        }
    }

    /* compiled from: PassportInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$FinishWithNoChanges;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishWithNoChanges implements PassportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishWithNoChanges f325725b = new FinishWithNoChanges();

        private FinishWithNoChanges() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishWithNoChanges);
        }

        public final int hashCode() {
            return -2060649827;
        }

        @k
        public final String toString() {
            return "FinishWithNoChanges";
        }
    }

    /* compiled from: PassportInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$SetErrorAndFinish;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetErrorAndFinish implements PassportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f325726b;

        public SetErrorAndFinish(boolean z12) {
            this.f325726b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetErrorAndFinish) && this.f325726b == ((SetErrorAndFinish) obj).f325726b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f325726b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetErrorAndFinish(withChanges="), this.f325726b, ')');
        }
    }

    /* compiled from: PassportInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction$SetSuccessAndFinish;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSuccessAndFinish implements PassportInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetSuccessAndFinish f325727b = new SetSuccessAndFinish();

        private SetSuccessAndFinish() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetSuccessAndFinish);
        }

        public final int hashCode() {
            return 1388324317;
        }

        @k
        public final String toString() {
            return "SetSuccessAndFinish";
        }
    }
}
