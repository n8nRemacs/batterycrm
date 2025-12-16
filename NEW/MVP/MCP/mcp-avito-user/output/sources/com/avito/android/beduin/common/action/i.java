package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import com.avito.android.beduin.common.action.BeduinCloseModuleAction;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.action.BeduinLogEventAction;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.beduin.common.action.BeduinRemoveComponentsAction;
import com.avito.android.beduin.common.action.BeduinSelectComponentAction;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction;
import com.avito.android.beduin_shared.common.action.BeduinSendActionsToFormAction;
import com.avito.android.beduin_shared.model.action.custom.applyMapFilters.BeduinApplyMapFiltersAction;
import com.avito.android.beduin_shared.model.action.custom.openItemsList.BeduinOpenItemsListAction;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinCancelScreenReloadAction;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.beduin_shared.model.action.custom.selectTab.BeduinSelectTabAction;
import com.avito.android.beduin_shared.model.action.custom.submitForm.BeduinSubmitFormAction;
import com.avito.android.beduin_shared.model.action.storeParameters.BeduinStoreParametersAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: StandardActionsRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/i;", "LUi/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements Ui.d {
    @Inject
    public i() {
    }

    @Override // Ui.d
    @Y61.k
    public final List<InterfaceC15524c> a() {
        return C42756l.B(new InterfaceC15524c[]{new BeduinOpenLinkAction.b(), new BeduinExecuteRequestAction.b(), new BeduinShowAlertAction.b(), new BeduinSubmitFormAction.b(), new BeduinLogEventAction.b(), new BeduinRemoveComponentsAction.b(null, null, 3, null), new BeduinCloseModuleAction.a(), new BeduinSelectComponentAction.b(), BeduinRealEstateFilterReloadAction.INSTANCE, BeduinAddComponentsToEndAction.INSTANCE, BeduinReloadFormAction.INSTANCE, BeduinApplyTransformAction.INSTANCE, BeduinAuthenticateAction.INSTANCE, BeduinOpenSelectBottomSheetAction.INSTANCE, BeduinOpenItemsListAction.INSTANCE, BeduinScrollToComponentAction.INSTANCE, BeduinScrollToFirstInvalidModelAction.INSTANCE, BeduinOpenLocalDeeplinkAction.INSTANCE, BeduinShareAction.INSTANCE, BeduinOpenUniversalPageAction.INSTANCE, BeduinOpenUniversalPageV2Action.INSTANCE, BeduinOpenGalleryAction.INSTANCE, BeduinOpenSearchFiltersAction.INSTANCE, BeduinOnEndEditingAction.INSTANCE, BeduinValidateFormsAction.INSTANCE, BeduinAddComponentsAfterModelAction.INSTANCE, BeduinAddComponentsBeforeModelAction.INSTANCE, BeduinAddComponentsToBeginningAction.INSTANCE, BeduinSendActionsToFormAction.INSTANCE, BeduinLogAdjustEventAction.INSTANCE, BeduinLogFirebaseEventAction.INSTANCE, BeduinSingleExposeAction.INSTANCE, BeduinTriggerActionsAction.INSTANCE, BeduinCopyTextAction.INSTANCE, BeduinContentPlaceholderAction.Show.f99973b, BeduinContentPlaceholderAction.Hide.f99970b, BeduinToastAction.f100012b, BeduinSubscribeToProfileAction.INSTANCE, BeduinStoreParametersAction.f105302b, BeduinUpdateFormVisibilityAction.INSTANCE, BeduinUpdateNavbarTitleAction.INSTANCE, BeduinReloadScreenAction.INSTANCE, BeduinRunUntilLimitAction.INSTANCE, BeduinCancelScreenReloadAction.f105297b, BeduinToggleAction.INSTANCE, BeduinTooltipAction.INSTANCE, BeduinApplyWebPaymentMessageAction.INSTANCE, new BeduinApplyMapFiltersAction.a(), new BeduinApplyMapFiltersAction.b(), BeduinReplaceComponentsAction.INSTANCE, BeduinDelayAction.INSTANCE, BeduinConditionalAction.INSTANCE, BeduinDebounceAction.f99976b, BeduinThrottleAction.f100008b, BeduinSelectTabAction.INSTANCE, BeduinShowFiltersAction.INSTANCE, OpenOptionSelectorAction.f100035b, BeduinCancelRequestAction.INSTANCE, BeduinCloseKeyboardAction.INSTANCE, ModifyCartItemsCacheAction.f100030b, BeduinApplyCountdownTextAction.INSTANCE, BeduinCancelCountdownTextAction.INSTANCE, BeduinExecutePeriodicAction.INSTANCE, BeduinCancelPeriodicAction.INSTANCE, BeduinToggleFavoriteStatusAction.f100021b, BeduinApplyHapticAction.INSTANCE, BeduinSetNavigationBarAction.INSTANCE, BeduinPersistCounterAction.INSTANCE, BeduinSocketEventAction.Subscribe.INSTANCE, BeduinSocketEventAction.Unsubscribe.INSTANCE});
    }
}
