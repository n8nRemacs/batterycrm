package com.avito.android.intermediary_verification.presentation.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: IntermediaryVerificationAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "", "LeaveAction", "a", "b", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction$a;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction$b;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IntermediaryVerificationAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntermediaryVerificationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction$LeaveAction;", "", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeaveAction {

        /* renamed from: b, reason: collision with root package name */
        public static final LeaveAction f173184b;

        /* renamed from: c, reason: collision with root package name */
        public static final LeaveAction f173185c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LeaveAction[] f173186d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f173187e;

        static {
            LeaveAction leaveAction = new LeaveAction("CANCEL", 0);
            f173184b = leaveAction;
            LeaveAction leaveAction2 = new LeaveAction("LEAVE_PUBLISH", 1);
            f173185c = leaveAction2;
            LeaveAction[] leaveActionArr = {leaveAction, leaveAction2};
            f173186d = leaveActionArr;
            f173187e = c.a(leaveActionArr);
        }

        public LeaveAction() {
            throw null;
        }

        public static LeaveAction valueOf(String str) {
            return (LeaveAction) Enum.valueOf(LeaveAction.class, str);
        }

        public static LeaveAction[] values() {
            return (LeaveAction[]) f173186d.clone();
        }
    }

    /* compiled from: IntermediaryVerificationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction$a;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements IntermediaryVerificationAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LeaveAction f173188a;

        public a(@k LeaveAction leaveAction) {
            this.f173188a = leaveAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f173188a == ((a) obj).f173188a;
        }

        public final int hashCode() {
            return this.f173188a.hashCode();
        }

        @k
        public final String toString() {
            return "LeaveButtonPressed(leaveAction=" + this.f173188a + ')';
        }
    }

    /* compiled from: IntermediaryVerificationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction$b;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements IntermediaryVerificationAction {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f173189a;

        public b(@k DeepLink deepLink) {
            this.f173189a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f173189a, ((b) obj).f173189a);
        }

        public final int hashCode() {
            return this.f173189a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SubmitButtonPressed(deeplink="), this.f173189a, ')');
        }
    }
}
