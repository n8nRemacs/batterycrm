package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import Gy0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.StrCalendarWarningDialogActions;
import com.avito.android.remote.model.StrCalendarWarningDialogCondition;
import com.avito.android.remote.model.StrSellerCalendarParameters;
import com.avito.android.remote.model.StrSellerCalendarParametersWarningDialog;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_calendar.seller.calandar_parameters.C35095f;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogActions;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogCondition;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCalendarParametersOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements com.avito.android.arch.mvi.t<StrCalendarParametersInternalAction, Gy0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.r f287444b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C35095f f287445c;

    @Inject
    public r(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.r rVar, @Y61.k C35095f c35095f) {
        this.f287444b = rVar;
        this.f287445c = c35095f;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Gy0.d b(StrCalendarParametersInternalAction strCalendarParametersInternalAction) {
        GroupParameter.OnboardingTooltip onboardingTooltip;
        WarningDialogData warningDialogData;
        List<StrCalendarWarningDialogCondition> list;
        StrCalendarParametersInternalAction strCalendarParametersInternalAction2 = strCalendarParametersInternalAction;
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.OpenDeeplink) {
            return new d.e(((StrCalendarParametersInternalAction.OpenDeeplink) strCalendarParametersInternalAction2).f287369b);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.OpenUrl) {
            return new d.f(((StrCalendarParametersInternalAction.OpenUrl) strCalendarParametersInternalAction2).f287371b);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.CloseScreen) {
            StrCalendarParametersInternalAction.CloseScreen closeScreen = (StrCalendarParametersInternalAction.CloseScreen) strCalendarParametersInternalAction2;
            return new d.b(closeScreen.f287351c, closeScreen.f287352d, closeScreen.f287350b, closeScreen.f287353e);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.CloseBottomPicker) {
            return d.a.f6850a;
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ShowToast) {
            StrCalendarParametersInternalAction.ShowToast showToast = (StrCalendarParametersInternalAction.ShowToast) strCalendarParametersInternalAction2;
            return new d.k(showToast.f287384b, showToast.f287385c);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.OpenCancellationSettings) {
            StrCalendarParametersInternalAction.OpenCancellationSettings openCancellationSettings = (StrCalendarParametersInternalAction.OpenCancellationSettings) strCalendarParametersInternalAction2;
            return new d.C0388d(openCancellationSettings.f287366b, openCancellationSettings.f287367c, openCancellationSettings.f287368d);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ShowRejectInfo) {
            return new d.j(((StrCalendarParametersInternalAction.ShowRejectInfo) strCalendarParametersInternalAction2).f287383b);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.OpenBottomPicker) {
            StrCalendarParametersInternalAction.OpenBottomPicker openBottomPicker = (StrCalendarParametersInternalAction.OpenBottomPicker) strCalendarParametersInternalAction2;
            return new d.c(openBottomPicker.f287365d, openBottomPicker.f287364c);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ShowLastMinuteOffer) {
            StrCalendarParametersInternalAction.ShowLastMinuteOffer showLastMinuteOffer = (StrCalendarParametersInternalAction.ShowLastMinuteOffer) strCalendarParametersInternalAction2;
            return new d.i(showLastMinuteOffer.f287381b, showLastMinuteOffer.f287382c);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ScrollToPosition) {
            return new d.h(((StrCalendarParametersInternalAction.ScrollToPosition) strCalendarParametersInternalAction2).f287374b);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ShowTooltipAtPosition) {
            StrCalendarParametersInternalAction.ShowTooltipAtPosition showTooltipAtPosition = (StrCalendarParametersInternalAction.ShowTooltipAtPosition) strCalendarParametersInternalAction2;
            return new d.l(showTooltipAtPosition.f287386b, showTooltipAtPosition.f287387c);
        }
        if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ShowWarningDialog) {
            this.f287444b.getClass();
            StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog = ((StrCalendarParametersInternalAction.ShowWarningDialog) strCalendarParametersInternalAction2).f287388b;
            String title = strSellerCalendarParametersWarningDialog.getTitle();
            List<StrCalendarWarningDialogCondition> conditions = strSellerCalendarParametersWarningDialog.getConditions();
            StrCalendarWarningDialogActions actions = strSellerCalendarParametersWarningDialog.getActions();
            Button acceptButton = actions != null ? actions.getAcceptButton() : null;
            StrCalendarWarningDialogActions actions2 = strSellerCalendarParametersWarningDialog.getActions();
            Button denyButton = actions2 != null ? actions2.getDenyButton() : null;
            if (title == null || title.length() == 0 || acceptButton == null || denyButton == null || (list = conditions) == null || list.isEmpty()) {
                warningDialogData = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (StrCalendarWarningDialogCondition strCalendarWarningDialogCondition : conditions) {
                    AttributedText description = strCalendarWarningDialogCondition.getDescription();
                    WarningDialogCondition warningDialogCondition = description == null ? null : new WarningDialogCondition(strCalendarWarningDialogCondition.getImage(), description);
                    if (warningDialogCondition != null) {
                        arrayList.add(warningDialogCondition);
                    }
                }
                warningDialogData = new WarningDialogData(title, arrayList, new WarningDialogActions(acceptButton, denyButton));
            }
            if (warningDialogData != null) {
                return new d.m(warningDialogData);
            }
        } else if (strCalendarParametersInternalAction2 instanceof StrCalendarParametersInternalAction.ContentLoaded) {
            StrSellerCalendarParameters strSellerCalendarParameters = ((StrCalendarParametersInternalAction.ContentLoaded) strCalendarParametersInternalAction2).f287356b;
            List<ParameterSlot> formFields = strSellerCalendarParameters != null ? strSellerCalendarParameters.getFormFields() : null;
            this.f287445c.getClass();
            if (formFields != null) {
                for (ParameterSlot parameterSlot : formFields) {
                    if ((parameterSlot instanceof GroupParameter) && (onboardingTooltip = ((GroupParameter) parameterSlot).getOnboardingTooltip()) != null) {
                        return new d.g(parameterSlot.getId(), onboardingTooltip);
                    }
                }
            }
        }
        return null;
    }
}
