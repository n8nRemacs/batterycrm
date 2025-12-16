package ru.cyberity.cbr.core.analytics;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: AnalyticsEnums.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/analytics/Screen;", "", "Lru/cyberity/cbr/core/analytics/m;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "StatusScreen", "DocTypeSelectorScreen", "CountriesScreen", "InstructionsScreen", "CameraScreen", "VideoScreen", "PreviewScreen", "MrtdScreen", "LivenessScreen", "ApplicantDataScreen", "ConfirmationContactScreen", "ConfirmationCodeScreen", "QuestionnaireScreen", "SupportScreen", "AgreementScreen", "AgreementSelectorScreen", "OopsFatalScreen", "OopsNetworkScreen", "SystemImagePicker", "SystemDocumentPicker", "VideoidentScreen", "GeolocationDetectionScreen", "GeolocationFormScreen", "GeolocationUnknownScreen", "ImageViewer", "VideoIdentExitPopup", "VerificationExitPopup", "EkycFormScreen", "EkycOtpConfirmationScreen", "EkycOauthConfirmationScreen", "EkycFinishScreen", "VideoidentLangSelectorScreen", "Other", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public enum Screen implements m {
    StatusScreen("statusScreen"),
    DocTypeSelectorScreen("docTypeSelectorScreen"),
    CountriesScreen("countriesScreen"),
    InstructionsScreen("instructionsScreen"),
    CameraScreen("cameraScreen"),
    VideoScreen("videoScreen"),
    PreviewScreen("previewScreen"),
    MrtdScreen("mrtdScreen"),
    LivenessScreen("livenessScreen"),
    ApplicantDataScreen("applicantDataScreen"),
    ConfirmationContactScreen("confirmationContactScreen"),
    ConfirmationCodeScreen("confirmationCodeScreen"),
    QuestionnaireScreen("questionnaireScreen"),
    SupportScreen("supportScreen"),
    AgreementScreen("agreementScreen"),
    AgreementSelectorScreen("agreementSelectorScreen"),
    OopsFatalScreen("oopsFatalScreen"),
    OopsNetworkScreen("oopsNetworkScreen"),
    SystemImagePicker("systemImagePicker"),
    SystemDocumentPicker("systemDocumentPicker"),
    VideoidentScreen("videoidentScreen"),
    GeolocationDetectionScreen("geolocationDetectionScreen"),
    GeolocationFormScreen("geolocationFormScreen"),
    GeolocationUnknownScreen("geolocationUnknownScreen"),
    ImageViewer("imageViewer"),
    VideoIdentExitPopup("videoidentExitPopup"),
    VerificationExitPopup("verificationExitPopup"),
    EkycFormScreen("ekycFormScreen"),
    EkycOtpConfirmationScreen("ekycOtpConfirmationScreen"),
    EkycOauthConfirmationScreen("ekycOauthConfirmationScreen"),
    EkycFinishScreen("ekycFinishScreen"),
    VideoidentLangSelectorScreen("videoidentLangSelectorScreen"),
    Other(PluralsKeys.OTHER);


    @Y61.k
    private final String text;

    Screen(String str) {
        this.text = str;
    }

    @Override // ru.cyberity.cbr.core.analytics.m
    @Y61.k
    public String getText() {
        return this.text;
    }
}
