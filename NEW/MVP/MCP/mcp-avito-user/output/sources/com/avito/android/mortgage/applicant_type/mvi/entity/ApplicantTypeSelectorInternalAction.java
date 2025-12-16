package com.avito.android.mortgage.applicant_type.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantTypeSelectorInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialogWithResult", "Init", "SelectApplicantType", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$CloseDialogWithResult;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$Init;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$SelectApplicantType;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ApplicantTypeSelectorInternalAction extends n {

    /* compiled from: ApplicantTypeSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$CloseDialogWithResult;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialogWithResult implements ApplicantTypeSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicantType f198324b;

        public CloseDialogWithResult(@k ApplicantType applicantType) {
            this.f198324b = applicantType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseDialogWithResult) && this.f198324b == ((CloseDialogWithResult) obj).f198324b;
        }

        public final int hashCode() {
            return this.f198324b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseDialogWithResult(result=" + this.f198324b + ')';
        }
    }

    /* compiled from: ApplicantTypeSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$Init;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements ApplicantTypeSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicantTypeSelectorArguments f198325b;

        public Init(@k ApplicantTypeSelectorArguments applicantTypeSelectorArguments) {
            this.f198325b = applicantTypeSelectorArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f198325b, ((Init) obj).f198325b);
        }

        public final int hashCode() {
            return this.f198325b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(args=" + this.f198325b + ')';
        }
    }

    /* compiled from: ApplicantTypeSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction$SelectApplicantType;", "Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectApplicantType implements ApplicantTypeSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicantType f198326b;

        public SelectApplicantType(@k ApplicantType applicantType) {
            this.f198326b = applicantType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectApplicantType) && this.f198326b == ((SelectApplicantType) obj).f198326b;
        }

        public final int hashCode() {
            return this.f198326b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectApplicantType(applicantType=" + this.f198326b + ')';
        }
    }
}
