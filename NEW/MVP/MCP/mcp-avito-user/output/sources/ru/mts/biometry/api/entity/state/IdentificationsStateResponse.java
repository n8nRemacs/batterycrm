package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: IdentificationsStateResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/mts/biometry/api/entity/state/IdentificationsStateResponse;", "", "", "id", "status", "", "reasons", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionFormData;", "documentRecognitionFormData", "collectingApplicantDataStatus", "Lru/mts/biometry/api/entity/state/ApiFlowOnboardingData;", "flowOnboardingData", "Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "selectedDocument", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "documentRecognitionData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionFormData;Ljava/lang/String;Lru/mts/biometry/api/entity/state/ApiFlowOnboardingData;Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getStatus", "Ljava/util/List;", "getReasons", "()Ljava/util/List;", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionFormData;", "getDocumentRecognitionFormData", "()Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionFormData;", "getCollectingApplicantDataStatus", "Lru/mts/biometry/api/entity/state/ApiFlowOnboardingData;", "getFlowOnboardingData", "()Lru/mts/biometry/api/entity/state/ApiFlowOnboardingData;", "Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "getSelectedDocument", "()Lru/mts/biometry/api/entity/state/ApiSelectedDocumentBody;", "Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "getDocumentRecognitionData", "()Lru/mts/biometry/api/entity/state/ApiDocumentRecognitionData;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IdentificationsStateResponse {

    @c("collectingApplicantDataStatus")
    @l
    private final String collectingApplicantDataStatus;

    @c("documentRecognitionData")
    @l
    private final ApiDocumentRecognitionData documentRecognitionData;

    @c("documentRecognisedData")
    @l
    private final ApiDocumentRecognitionFormData documentRecognitionFormData;

    @c("recognitionOnboardingData")
    @l
    private final ApiFlowOnboardingData flowOnboardingData;

    @c("id")
    @k
    private final String id;

    @c("reasons")
    @k
    private final List<String> reasons;

    @c("selectedDocument")
    @l
    private final ApiSelectedDocumentBody selectedDocument;

    @c("status")
    @k
    private final String status;

    public IdentificationsStateResponse(@k String str, @k String str2, @k List<String> list, @l ApiDocumentRecognitionFormData apiDocumentRecognitionFormData, @l String str3, @l ApiFlowOnboardingData apiFlowOnboardingData, @l ApiSelectedDocumentBody apiSelectedDocumentBody, @l ApiDocumentRecognitionData apiDocumentRecognitionData) {
        this.id = str;
        this.status = str2;
        this.reasons = list;
        this.documentRecognitionFormData = apiDocumentRecognitionFormData;
        this.collectingApplicantDataStatus = str3;
        this.flowOnboardingData = apiFlowOnboardingData;
        this.selectedDocument = apiSelectedDocumentBody;
        this.documentRecognitionData = apiDocumentRecognitionData;
    }

    @k
    public final ApiIdentificationState a() {
        ApiDocumentData apiDocumentData;
        Boolean canRetryDocumentTypeSelection;
        String str = this.status;
        String str2 = this.collectingApplicantDataStatus;
        if (str2 == null) {
            str2 = "Empty";
        }
        String str3 = str2;
        ApiFlowOnboardingData apiFlowOnboardingData = this.flowOnboardingData;
        List<String> listA = apiFlowOnboardingData != null ? apiFlowOnboardingData.a() : null;
        ApiDocumentRecognitionFormData apiDocumentRecognitionFormData = this.documentRecognitionFormData;
        if (apiDocumentRecognitionFormData == null || (passport = apiDocumentRecognitionFormData.getDocument()) == null) {
            ApiDocumentRecognitionFormData apiDocumentRecognitionFormData2 = this.documentRecognitionFormData;
            if (apiDocumentRecognitionFormData2 != null) {
                ApiDocumentData passport = apiDocumentRecognitionFormData2.getPassport();
                apiDocumentData = passport;
            } else {
                apiDocumentData = null;
            }
        } else {
            apiDocumentData = passport;
        }
        String str4 = (String) C42745f0.G(this.reasons);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        ApiSelectedDocumentBody apiSelectedDocumentBody = this.selectedDocument;
        return new ApiIdentificationState(str, str3, listA, apiDocumentData, str5, apiSelectedDocumentBody, (apiSelectedDocumentBody == null || (canRetryDocumentTypeSelection = apiSelectedDocumentBody.getCanRetryDocumentTypeSelection()) == null) ? false : canRetryDocumentTypeSelection.booleanValue(), null, null, null, null, this.documentRecognitionData, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentificationsStateResponse)) {
            return false;
        }
        IdentificationsStateResponse identificationsStateResponse = (IdentificationsStateResponse) obj;
        return L.f(this.id, identificationsStateResponse.id) && L.f(this.status, identificationsStateResponse.status) && L.f(this.reasons, identificationsStateResponse.reasons) && L.f(this.documentRecognitionFormData, identificationsStateResponse.documentRecognitionFormData) && L.f(this.collectingApplicantDataStatus, identificationsStateResponse.collectingApplicantDataStatus) && L.f(this.flowOnboardingData, identificationsStateResponse.flowOnboardingData) && L.f(this.selectedDocument, identificationsStateResponse.selectedDocument) && L.f(this.documentRecognitionData, identificationsStateResponse.documentRecognitionData);
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.id.hashCode() * 31, 31, this.status), 31, this.reasons);
        ApiDocumentRecognitionFormData apiDocumentRecognitionFormData = this.documentRecognitionFormData;
        int iHashCode = (iE2 + (apiDocumentRecognitionFormData == null ? 0 : apiDocumentRecognitionFormData.hashCode())) * 31;
        String str = this.collectingApplicantDataStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ApiFlowOnboardingData apiFlowOnboardingData = this.flowOnboardingData;
        int iHashCode3 = (iHashCode2 + (apiFlowOnboardingData == null ? 0 : apiFlowOnboardingData.hashCode())) * 31;
        ApiSelectedDocumentBody apiSelectedDocumentBody = this.selectedDocument;
        int iHashCode4 = (iHashCode3 + (apiSelectedDocumentBody == null ? 0 : apiSelectedDocumentBody.hashCode())) * 31;
        ApiDocumentRecognitionData apiDocumentRecognitionData = this.documentRecognitionData;
        return iHashCode4 + (apiDocumentRecognitionData != null ? apiDocumentRecognitionData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "IdentificationsStateResponse(id=" + this.id + ", status=" + this.status + ", reasons=" + this.reasons + ", documentRecognitionFormData=" + this.documentRecognitionFormData + ", collectingApplicantDataStatus=" + this.collectingApplicantDataStatus + ", flowOnboardingData=" + this.flowOnboardingData + ", selectedDocument=" + this.selectedDocument + ", documentRecognitionData=" + this.documentRecognitionData + ')';
    }
}
