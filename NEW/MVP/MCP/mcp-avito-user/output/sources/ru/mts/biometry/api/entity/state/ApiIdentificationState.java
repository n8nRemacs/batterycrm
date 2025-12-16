package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.mts.biometry.api.entity.state.screen.ApiDocumentConfirmationState;
import ru.mts.biometry.api.entity.state.screen.ApiOnboardingState;
import ru.mts.biometry.api.entity.state.screen.ApiPhotoCaptureState;

/* compiled from: ApiIdentificationState.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/mts/biometry/api/entity/state/ApiIdentificationState;", "", "", "status", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "subStatus", "l", "", "steps", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lru/mts/biometry/api/entity/state/ApiDocumentData;", "documentRecognitionFormData", "Lru/mts/biometry/api/entity/state/ApiDocumentData;", "c", "()Lru/mts/biometry/api/entity/state/ApiDocumentData;", "reason", "h", "Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "selectedDocument", "Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "i", "()Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "", "canRetryDocumentTypeSelection", "Z", "getCanRetryDocumentTypeSelection", "()Z", "Lru/mts/biometry/api/entity/state/ApiErrorState;", "error", "Lru/mts/biometry/api/entity/state/ApiErrorState;", "e", "()Lru/mts/biometry/api/entity/state/ApiErrorState;", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "onboarding", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "f", "()Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "photoCapture", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "g", "()Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "documentConfirmation", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "a", "()Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "documentRecognitionData", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "b", "()Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "documentTypeSelection", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "d", "()Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiIdentificationState {
    private final boolean canRetryDocumentTypeSelection;

    @l
    private final ApiDocumentConfirmationState documentConfirmation;

    @l
    private final ApiDocumentRecognitionData documentRecognitionData;

    @l
    private final ApiDocumentData documentRecognitionFormData;

    @l
    private final ApiDocumentTypeSelectionState documentTypeSelection;

    @l
    private final ApiErrorState error;

    @l
    private final ApiOnboardingState onboarding;

    @l
    private final ApiPhotoCaptureState photoCapture;

    @k
    private final String reason;

    @l
    private final ApiSelectedDocumentBody selectedDocument;

    @k
    private final String status;

    @l
    private final List<String> steps;

    @k
    private final String subStatus;

    public ApiIdentificationState(@k String str, @k String str2, @l List<String> list, @l ApiDocumentData apiDocumentData, @k String str3, @l ApiSelectedDocumentBody apiSelectedDocumentBody, boolean z12, @l ApiErrorState apiErrorState, @l ApiOnboardingState apiOnboardingState, @l ApiPhotoCaptureState apiPhotoCaptureState, @l ApiDocumentConfirmationState apiDocumentConfirmationState, @l ApiDocumentRecognitionData apiDocumentRecognitionData, @l ApiDocumentTypeSelectionState apiDocumentTypeSelectionState) {
        this.status = str;
        this.subStatus = str2;
        this.steps = list;
        this.documentRecognitionFormData = apiDocumentData;
        this.reason = str3;
        this.selectedDocument = apiSelectedDocumentBody;
        this.canRetryDocumentTypeSelection = z12;
        this.error = apiErrorState;
        this.onboarding = apiOnboardingState;
        this.photoCapture = apiPhotoCaptureState;
        this.documentConfirmation = apiDocumentConfirmationState;
        this.documentRecognitionData = apiDocumentRecognitionData;
        this.documentTypeSelection = apiDocumentTypeSelectionState;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiDocumentConfirmationState getDocumentConfirmation() {
        return this.documentConfirmation;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiDocumentRecognitionData getDocumentRecognitionData() {
        return this.documentRecognitionData;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ApiDocumentData getDocumentRecognitionFormData() {
        return this.documentRecognitionFormData;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ApiDocumentTypeSelectionState getDocumentTypeSelection() {
        return this.documentTypeSelection;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ApiErrorState getError() {
        return this.error;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiIdentificationState)) {
            return false;
        }
        ApiIdentificationState apiIdentificationState = (ApiIdentificationState) obj;
        return L.f(this.status, apiIdentificationState.status) && L.f(this.subStatus, apiIdentificationState.subStatus) && L.f(this.steps, apiIdentificationState.steps) && L.f(this.documentRecognitionFormData, apiIdentificationState.documentRecognitionFormData) && L.f(this.reason, apiIdentificationState.reason) && L.f(this.selectedDocument, apiIdentificationState.selectedDocument) && this.canRetryDocumentTypeSelection == apiIdentificationState.canRetryDocumentTypeSelection && L.f(this.error, apiIdentificationState.error) && L.f(this.onboarding, apiIdentificationState.onboarding) && L.f(this.photoCapture, apiIdentificationState.photoCapture) && L.f(this.documentConfirmation, apiIdentificationState.documentConfirmation) && L.f(this.documentRecognitionData, apiIdentificationState.documentRecognitionData) && L.f(this.documentTypeSelection, apiIdentificationState.documentTypeSelection);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final ApiOnboardingState getOnboarding() {
        return this.onboarding;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final ApiPhotoCaptureState getPhotoCapture() {
        return this.photoCapture;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final int hashCode() {
        int iD2 = H.d(this.status.hashCode() * 31, 31, this.subStatus);
        List<String> list = this.steps;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        ApiDocumentData apiDocumentData = this.documentRecognitionFormData;
        int iD3 = H.d((iHashCode + (apiDocumentData == null ? 0 : apiDocumentData.hashCode())) * 31, 31, this.reason);
        ApiSelectedDocumentBody apiSelectedDocumentBody = this.selectedDocument;
        int i12 = r.i((iD3 + (apiSelectedDocumentBody == null ? 0 : apiSelectedDocumentBody.hashCode())) * 31, 31, this.canRetryDocumentTypeSelection);
        ApiErrorState apiErrorState = this.error;
        int iHashCode2 = (i12 + (apiErrorState == null ? 0 : apiErrorState.hashCode())) * 31;
        ApiOnboardingState apiOnboardingState = this.onboarding;
        int iHashCode3 = (iHashCode2 + (apiOnboardingState == null ? 0 : apiOnboardingState.hashCode())) * 31;
        ApiPhotoCaptureState apiPhotoCaptureState = this.photoCapture;
        int iHashCode4 = (iHashCode3 + (apiPhotoCaptureState == null ? 0 : apiPhotoCaptureState.hashCode())) * 31;
        ApiDocumentConfirmationState apiDocumentConfirmationState = this.documentConfirmation;
        int iHashCode5 = (iHashCode4 + (apiDocumentConfirmationState == null ? 0 : apiDocumentConfirmationState.hashCode())) * 31;
        ApiDocumentRecognitionData apiDocumentRecognitionData = this.documentRecognitionData;
        int iHashCode6 = (iHashCode5 + (apiDocumentRecognitionData == null ? 0 : apiDocumentRecognitionData.hashCode())) * 31;
        ApiDocumentTypeSelectionState apiDocumentTypeSelectionState = this.documentTypeSelection;
        return iHashCode6 + (apiDocumentTypeSelectionState != null ? apiDocumentTypeSelectionState.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final ApiSelectedDocumentBody getSelectedDocument() {
        return this.selectedDocument;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    public final List<String> k() {
        return this.steps;
    }

    @k
    /* renamed from: l, reason: from getter */
    public final String getSubStatus() {
        return this.subStatus;
    }

    @k
    public final String toString() {
        return "ApiIdentificationState(status=" + this.status + ", subStatus=" + this.subStatus + ", steps=" + this.steps + ", documentRecognitionFormData=" + this.documentRecognitionFormData + ", reason=" + this.reason + ", selectedDocument=" + this.selectedDocument + ", canRetryDocumentTypeSelection=" + this.canRetryDocumentTypeSelection + ", error=" + this.error + ", onboarding=" + this.onboarding + ", photoCapture=" + this.photoCapture + ", documentConfirmation=" + this.documentConfirmation + ", documentRecognitionData=" + this.documentRecognitionData + ", documentTypeSelection=" + this.documentTypeSelection + ')';
    }
}
