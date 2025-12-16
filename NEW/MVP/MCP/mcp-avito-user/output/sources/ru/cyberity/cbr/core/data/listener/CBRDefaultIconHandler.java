package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.res.i;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.PublicApi;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;

/* compiled from: CBRDefaultIconHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRDefaultIconHandler;", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "()V", "onResolveIcon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "key", "", "stepIcon", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public class CBRDefaultIconHandler implements CBRIconHandler {
    private final int stepIcon(DocumentType documentType) {
        return documentType.g() ? R.drawable.cbr_ic_step_identity : documentType.h() ? R.drawable.cbr_ic_step_poa : documentType.k() ? R.drawable.cbr_ic_step_selfie : documentType.d() ? R.drawable.cbr_ic_step_applicant_data : documentType.j() ? R.drawable.cbr_ic_step_questionnaire : documentType.i() ? R.drawable.cbr_ic_step_phone : documentType.f() ? R.drawable.cbr_ic_step_email : documentType.e() ? R.drawable.cbr_ic_step_ekyc : documentType.m() ? R.drawable.cbr_ic_step_video_ident : R.drawable.cbr_ic_step_identity;
    }

    @Override // ru.cyberity.cbr.core.data.listener.CBRIconHandler
    @l
    public Drawable onResolveIcon(@k Context context, @k String key) throws Resources.NotFoundException {
        int iStepIcon;
        Drawable themeImage = ThemeHelper.INSTANCE.getThemeImage(key);
        if (themeImage != null) {
            return themeImage;
        }
        if (key.equals("default/videoident")) {
            iStepIcon = R.drawable.cbr_ic_videoident_intro_face;
        } else if (key.equals("default/do_idCard")) {
            iStepIcon = R.drawable.cbr_ic_intro_do;
        } else if (key.equals("default/do_passport")) {
            iStepIcon = R.drawable.cbr_ic_intro_do_passport;
        } else if (key.equals("default/dont_idCard")) {
            iStepIcon = R.drawable.cbr_ic_intro_dont;
        } else if (key.equals("default/dont_passport")) {
            iStepIcon = R.drawable.cbr_ic_intro_dont_passport;
        } else if (key.equals("default/facescan")) {
            iStepIcon = R.drawable.cbr_ic_intro_liveness;
        } else if (key.equals("default/do_idCard_backSide")) {
            iStepIcon = R.drawable.cbr_ic_intro_do_back;
        } else if (key.equals("default/dont_idCard_backSide")) {
            iStepIcon = R.drawable.cbr_ic_intro_dont_back;
        } else if (key.equals("IdentityType/PASSPORT")) {
            iStepIcon = R.drawable.cbr_ic_iddoc_passport;
        } else if (key.equals("IdentityType/DRIVERS")) {
            iStepIcon = R.drawable.cbr_ic_iddoc_driving_license;
        } else if (key.equals("IdentityType/RESIDENCE_PERMIT")) {
            iStepIcon = R.drawable.cbr_ic_iddoc_residence_permit;
        } else if (key.equals(CBRIconHandler.CBRResultIcons.SUCCESS.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_success;
        } else if (key.equals(CBRIconHandler.CBRResultIcons.FAILURE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_fatal;
        } else if (key.equals(CBRIconHandler.CBRResultIcons.SUBMITTED.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_submitted;
        } else if (key.equals(CBRIconHandler.CBRResultIcons.WARNING.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_warning;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.WARNING_OUTLINE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_warning_outline;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.CLOSE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_close;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.BACK.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_back;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_step_open;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.TORCH_ON.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_flash_on;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.TORCH_OFF.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_flash_off;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.GALLERY.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_gallery;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.MAIL.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_email;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.NFC.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_nfc_logo;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.MRTD_PASSPORT.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_mrtd_passport;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.MRTD_IDCARD.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_mrtd_id_card;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.MRTD_PHONE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_mrtd_hand;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.BIN.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_delete;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.CALENDAR.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_calendar;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ATTACHMENT.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_attachment;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.IMAGE.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_image;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.SEARCH.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_search;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.NOTIFY.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_notify;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.TAKE_PHOTO.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_capture;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.LOCATION_ON.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_location_on;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.LOCATION_OFF.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_location_off;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.COUNTRY_OTHER.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_flag_placeholder;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.PICTURE_AGREEMENT.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_earth;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_ID.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_iddoc_id_card;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_HOME.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_iddoc_residence_permit;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_PERSONS.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_persons;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_LIGHT.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_light;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_CAMERA.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_camera;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ICON_WIFI.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_wifi;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.WARNING.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_warning_triangle;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ROTATE_CW.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_rotate_cw;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.ROTATE_CCW.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_rotate_ccw;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.FLIP.getImageName())) {
            iStepIcon = R.drawable.cbr_flip;
        } else if (key.equals(CBRIconHandler.CBRCommonIcons.SUCCESS_CHECK.getImageName())) {
            iStepIcon = R.drawable.cbr_ic_success_check;
        } else if (C43066x.h0(key, "IdentityType/", false)) {
            iStepIcon = R.drawable.cbr_ic_iddoc_id_card;
        } else if (C43066x.h0(key, "Flag/", false)) {
            int iA2 = s.a(context, "cbr_ic_flag_".concat(C43066x.m0(key, "/", key)));
            Integer numValueOf = Integer.valueOf(iA2);
            if (iA2 == 0) {
                numValueOf = null;
            }
            iStepIcon = numValueOf != null ? numValueOf.intValue() : R.drawable.cbr_ic_flag_placeholder;
        } else {
            iStepIcon = C43066x.h0(key, "DocType/", false) ? stepIcon(new DocumentType(C43066x.m0(key, "/", key))) : -1;
        }
        Integer numValueOf2 = Integer.valueOf(iStepIcon);
        if (iStepIcon == -1) {
            numValueOf2 = null;
        }
        if (numValueOf2 == null) {
            return null;
        }
        int iIntValue = numValueOf2.intValue();
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        Drawable drawable = resources.getDrawable(iIntValue, theme);
        if (drawable == null) {
            return null;
        }
        drawable.applyTheme(context.getTheme());
        return drawable;
    }
}
