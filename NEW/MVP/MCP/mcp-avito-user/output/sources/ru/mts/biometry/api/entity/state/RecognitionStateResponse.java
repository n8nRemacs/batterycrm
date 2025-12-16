package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.mts.biometry.api.entity.state.screen.ApiDocumentConfirmationState;
import ru.mts.biometry.api.entity.state.screen.ApiOnboardingState;
import ru.mts.biometry.api.entity.state.screen.ApiPhotoCaptureState;

/* compiled from: RecognitionStateResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/mts/biometry/api/entity/state/RecognitionStateResponse;", "", "", "id", "status", "pageId", "collectingDataStatus", "Lru/mts/biometry/api/entity/state/ApiErrorState;", "error", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "onboarding", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "photoCapture", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "documentConfirmation", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "documentTypeSelection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/mts/biometry/api/entity/state/ApiErrorState;Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getStatus", "a", "getCollectingDataStatus", "Lru/mts/biometry/api/entity/state/ApiErrorState;", "getError", "()Lru/mts/biometry/api/entity/state/ApiErrorState;", "Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "getOnboarding", "()Lru/mts/biometry/api/entity/state/screen/ApiOnboardingState;", "Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "getPhotoCapture", "()Lru/mts/biometry/api/entity/state/screen/ApiPhotoCaptureState;", "Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "getDocumentConfirmation", "()Lru/mts/biometry/api/entity/state/screen/ApiDocumentConfirmationState;", "Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "getDocumentTypeSelection", "()Lru/mts/biometry/api/entity/state/ApiDocumentTypeSelectionState;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecognitionStateResponse {

    @c("collectingDataStatus")
    @l
    private final String collectingDataStatus;

    @c("documentConfirmation")
    @l
    private final ApiDocumentConfirmationState documentConfirmation;

    @c("documentTypeSelection")
    @l
    private final ApiDocumentTypeSelectionState documentTypeSelection;

    @c("error")
    @l
    private final ApiErrorState error;

    @c("id")
    @k
    private final String id;

    @c("onboarding")
    @l
    private final ApiOnboardingState onboarding;

    @c("pageId")
    @k
    private final String pageId;

    @c("photoCapture")
    @l
    private final ApiPhotoCaptureState photoCapture;

    @c("status")
    @k
    private final String status;

    public RecognitionStateResponse(@k String str, @k String str2, @k String str3, @l String str4, @l ApiErrorState apiErrorState, @l ApiOnboardingState apiOnboardingState, @l ApiPhotoCaptureState apiPhotoCaptureState, @l ApiDocumentConfirmationState apiDocumentConfirmationState, @l ApiDocumentTypeSelectionState apiDocumentTypeSelectionState) {
        this.id = str;
        this.status = str2;
        this.pageId = str3;
        this.collectingDataStatus = str4;
        this.error = apiErrorState;
        this.onboarding = apiOnboardingState;
        this.photoCapture = apiPhotoCaptureState;
        this.documentConfirmation = apiDocumentConfirmationState;
        this.documentTypeSelection = apiDocumentTypeSelectionState;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @k
    public final ApiIdentificationState b() {
        String str = this.status;
        String str2 = this.collectingDataStatus;
        if (str2 == null) {
            str2 = "Empty";
        }
        return new ApiIdentificationState(str, str2, null, null, "", null, false, this.error, this.onboarding, this.photoCapture, this.documentConfirmation, null, this.documentTypeSelection);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecognitionStateResponse)) {
            return false;
        }
        RecognitionStateResponse recognitionStateResponse = (RecognitionStateResponse) obj;
        return L.f(this.id, recognitionStateResponse.id) && L.f(this.status, recognitionStateResponse.status) && L.f(this.pageId, recognitionStateResponse.pageId) && L.f(this.collectingDataStatus, recognitionStateResponse.collectingDataStatus) && L.f(this.error, recognitionStateResponse.error) && L.f(this.onboarding, recognitionStateResponse.onboarding) && L.f(this.photoCapture, recognitionStateResponse.photoCapture) && L.f(this.documentConfirmation, recognitionStateResponse.documentConfirmation) && L.f(this.documentTypeSelection, recognitionStateResponse.documentTypeSelection);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.status), 31, this.pageId);
        String str = this.collectingDataStatus;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ApiErrorState apiErrorState = this.error;
        int iHashCode2 = (iHashCode + (apiErrorState == null ? 0 : apiErrorState.hashCode())) * 31;
        ApiOnboardingState apiOnboardingState = this.onboarding;
        int iHashCode3 = (iHashCode2 + (apiOnboardingState == null ? 0 : apiOnboardingState.hashCode())) * 31;
        ApiPhotoCaptureState apiPhotoCaptureState = this.photoCapture;
        int iHashCode4 = (iHashCode3 + (apiPhotoCaptureState == null ? 0 : apiPhotoCaptureState.hashCode())) * 31;
        ApiDocumentConfirmationState apiDocumentConfirmationState = this.documentConfirmation;
        int iHashCode5 = (iHashCode4 + (apiDocumentConfirmationState == null ? 0 : apiDocumentConfirmationState.hashCode())) * 31;
        ApiDocumentTypeSelectionState apiDocumentTypeSelectionState = this.documentTypeSelection;
        return iHashCode5 + (apiDocumentTypeSelectionState != null ? apiDocumentTypeSelectionState.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RecognitionStateResponse(id=" + this.id + ", status=" + this.status + ", pageId=" + this.pageId + ", collectingDataStatus=" + this.collectingDataStatus + ", error=" + this.error + ", onboarding=" + this.onboarding + ", photoCapture=" + this.photoCapture + ", documentConfirmation=" + this.documentConfirmation + ", documentTypeSelection=" + this.documentTypeSelection + ')';
    }
}
