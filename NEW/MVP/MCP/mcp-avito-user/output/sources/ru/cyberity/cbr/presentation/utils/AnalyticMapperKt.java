package ru.cyberity.cbr.presentation.utils;

import Y61.k;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.presentation.support.CBRSupportFragment;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRCountryPickerDialog;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;
import ru.cyberity.cbr.presentation.screen.questionnary.CBRQuestionnaireFragment;
import ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment;

/* compiled from: AnalyticMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getScreenByFragment", "Lru/cyberity/cbr/core/analytics/Screen;", "fragment", "Landroidx/fragment/app/Fragment;", "cyberity-mobile-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class AnalyticMapperKt {
    @k
    public static final Screen getScreenByFragment(@k Fragment fragment) {
        return fragment instanceof ru.cyberity.cbr.presentation.screen.intro.a ? Screen.InstructionsScreen : fragment instanceof ru.cyberity.cbr.presentation.screen.verification.a ? Screen.StatusScreen : fragment instanceof ru.cyberity.cbr.presentation.dialogs.bottomsheet.a ? Screen.AgreementScreen : fragment instanceof CBRCountryPickerDialog ? Screen.CountriesScreen : fragment instanceof ru.cyberity.cbr.presentation.screen.preview.photo.identity.a ? Screen.PreviewScreen : fragment instanceof ru.cyberity.cbr.presentation.screen.preview.selfie.a ? Screen.PreviewScreen : fragment instanceof ru.cyberity.cbr.presentation.screen.preview.applicantdata.b ? Screen.ApplicantDataScreen : fragment instanceof ru.cyberity.cbr.presentation.screen.preview.photo.common.a ? Screen.PreviewScreen : fragment instanceof CBRLiveness3dFaceFragment ? Screen.LivenessScreen : fragment instanceof ru.cyberity.cbr.core.presentation.screen.verification.a ? Screen.ConfirmationContactScreen : fragment instanceof CBRQuestionnaireFragment ? Screen.QuestionnaireScreen : fragment instanceof CBRSupportFragment ? Screen.SupportScreen : fragment instanceof CBRPickerDialog ? Screen.SystemImagePicker : fragment instanceof ru.cyberity.cbr.camera.photo.presentation.a ? Screen.DocTypeSelectorScreen : fragment instanceof ru.cyberity.cbr.camera.photo.presentation.selfie.a ? Screen.PreviewScreen : fragment instanceof ru.cyberity.cbr.camera.photo.presentation.document.b ? Screen.CameraScreen : fragment instanceof ru.cyberity.cbr.camera.video.presentation.a ? Screen.VideoScreen : fragment instanceof ru.cyberity.cbr.presentation.consent.a ? Screen.AgreementSelectorScreen : Screen.Other;
    }
}
