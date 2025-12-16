package e11;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.map_core.view.draw_button.DrawButton;
import com.avito.android.photo_list_view_groups.image_with_group.ImageWithGroupContent;
import com.avito.android.photo_list_view_groups.image_with_group.a;
import com.avito.android.photo_list_view_groups.image_with_group_error.ImageWithGroupError;
import com.avito.android.photo_list_view_groups.image_with_group_error.a;
import com.avito.android.photo_list_view_groups.image_with_group_loading.ImageWithGroupLoading;
import com.avito.android.photo_list_view_groups.image_with_group_loading.a;
import com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups.ImageWithLabel;
import com.avito.android.theme_settings.ThemeSettingsFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.C37816v0;
import com.my.target.InterfaceC37815v;
import com.my.target.Q0;
import hy.DialogC41189a;
import iy.DialogC42133a;
import jr.InterfaceC42416a;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.widget.CBRDateInputLayout;
import ru.cyberity.cbr.core.widget.CBRDateTimeInputLayout;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;
import ru.cyberity.cbr.presentation.screen.questionnary.CBRQuestionnaireFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e11.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC39879j1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f394621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f394622c;

    public /* synthetic */ ViewOnClickListenerC39879j1(Object obj, int i12) {
        this.f394621b = i12;
        this.f394622c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r22 = this.f394622c;
        switch (this.f394621b) {
            case 0:
                Q0.a aVar = ((C37816v0) r22).f365167B;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            case 1:
                ((com.my.target.G0) r22).f364396b.a();
                return;
            case 2:
                InterfaceC37815v.a aVar2 = ((com.my.target.K0) r22).f364430q;
                if (aVar2 != null) {
                    aVar2.e();
                    return;
                }
                return;
            case 3:
                ru.mts.biometry.sdk.feature.passport.ui.intro.a aVar3 = (ru.mts.biometry.sdk.feature.passport.ui.intro.a) r22;
                A91.b.a(A91.r.a(aVar3.getResources().getStringArray(R.array.sdk_bio_passport_intro_list_full)), aVar3.getResources().getString(R.string.sdk_bio_passport_recommendation_dialog_title)).show(aVar3.getParentFragmentManager(), "BottomSheetContainer");
                return;
            case 4:
                ((DrawButton) r22).f185700c.accept(kotlin.G0.f406611a);
                return;
            case 5:
                ThemeSettingsFragment.a aVar4 = ThemeSettingsFragment.f301289o0;
                ((ThemeSettingsFragment) r22).requireActivity().onBackPressed();
                return;
            case 6:
                int i12 = ru.mts.biometry.sdk.feature.recognition.ui.camera.z.f436501m0;
                ((ru.mts.biometry.sdk.feature.recognition.ui.camera.z) r22).d();
                return;
            case 7:
                int i13 = DialogC41189a.f398312E;
                ((DialogC41189a) r22).dismiss();
                return;
            case 8:
                int i14 = ImageWithGroupContent.f218548m;
                ((a.c) r22).f218566b.invoke();
                return;
            case 9:
                int i15 = ImageWithGroupContent.f218548m;
                ((a.d.C6561a) ((a.d) r22)).f218568b.invoke();
                return;
            case 10:
                ((ru.mts.biometry.sdk.feature.recognition.ui.error.a) r22).requireContext();
                z91.s sVar = z91.e.f443908b;
                if (sVar == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                sVar.b().d(true);
                return;
            case 11:
                int i16 = DialogC42133a.f405407E;
                ((DialogC42133a) r22).dismiss();
                return;
            case 12:
                int i17 = ImageWithGroupError.f218571j;
                ((a.c) r22).f218587b.invoke();
                return;
            case 13:
                int i18 = ImageWithGroupError.f218571j;
                ((a.d) r22).f218588a.invoke();
                return;
            case 14:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
                ((ru.mts.biometry.sdk.feature.recognition.ui.intro.e) r22).requireContext();
                z91.s sVar2 = z91.e.f443908b;
                if (sVar2 == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                sVar2.b().d(true);
                return;
            case 15:
                ((InterfaceC42416a.C11584a) r22).f405828b.invoke();
                return;
            case 16:
                int i19 = ImageWithGroupLoading.f218589l;
                ((a.d) r22).f218607b.invoke();
                return;
            case 17:
                int i22 = ImageWithLabel.f244234i;
                ((ImageWithLabel) r22).performClick();
                return;
            case 18:
                int i23 = NavBar.f179818g;
                r22.invoke();
                return;
            case 19:
                ru.cyberity.cbr.camera.photo.presentation.a.a((ru.cyberity.cbr.camera.photo.presentation.a) r22, view);
                return;
            case 20:
                ru.cyberity.cbr.camera.photo.presentation.document.b.a((ru.cyberity.cbr.camera.photo.presentation.document.b) r22, view);
                return;
            case 21:
                ru.cyberity.cbr.camera.video.presentation.a.a((ru.cyberity.cbr.camera.video.presentation.a) r22, view);
                return;
            case 22:
                BaseFragment.m276initToolbar$lambda11((BaseFragment) r22, view);
                return;
            case 23:
                ((CBRDateInputLayout) r22).showCalendar();
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((CBRDateTimeInputLayout) r22).showCalendar();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                CBRApplicantDataFileFieldView.m304populateViewItems$lambda9$lambda8((CBRApplicantDataFileFieldView) r22, view);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ru.cyberity.cbr.presentation.screen.error.a.a((ru.cyberity.cbr.presentation.screen.error.a) r22, view);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ru.cyberity.cbr.presentation.screen.intro.a.a((ru.cyberity.cbr.presentation.screen.intro.a) r22, view);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ru.cyberity.cbr.presentation.screen.preview.applicantdata.b.a((ru.cyberity.cbr.presentation.screen.preview.applicantdata.b) r22, view);
                return;
            default:
                CBRQuestionnaireFragment.a((CBRQuestionnaireFragment) r22, view);
                return;
        }
    }
}
