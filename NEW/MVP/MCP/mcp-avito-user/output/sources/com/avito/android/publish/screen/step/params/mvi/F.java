package com.avito.android.publish.screen.step.params.mvi;

import Ie0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishDetailsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/F;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "LIe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class F implements com.avito.android.arch.mvi.t<PublishDetailsInternalAction, Ie0.d> {
    @Inject
    public F() {
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r9v69, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.arch.mvi.t
    public final Ie0.d b(PublishDetailsInternalAction publishDetailsInternalAction) {
        Ie0.d dVar;
        PublishDetailsInternalAction publishDetailsInternalAction2 = publishDetailsInternalAction;
        if (publishDetailsInternalAction2 instanceof PublishDetailsInternalAction.InternalViewAction) {
            PublishDetailsInternalAction.InternalViewAction internalViewAction = (PublishDetailsInternalAction.InternalViewAction) publishDetailsInternalAction2;
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowConfettiAnimation) {
                return new d.b.g(((PublishDetailsInternalAction.InternalViewAction.ShowConfettiAnimation) internalViewAction).f241465b);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.HideKeyboard) {
                return d.b.a.f8411a;
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ScrollToItem) {
                PublishDetailsInternalAction.InternalViewAction.ScrollToItem scrollToItem = (PublishDetailsInternalAction.InternalViewAction.ScrollToItem) internalViewAction;
                return new d.b.c(scrollToItem.f241457b, scrollToItem.f241458c);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ScrollToAccordionContent) {
                return new d.b.C0478b(((PublishDetailsInternalAction.InternalViewAction.ScrollToAccordionContent) internalViewAction).f241456b);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowActionError) {
                PublishDetailsInternalAction.InternalViewAction.ShowActionError showActionError = (PublishDetailsInternalAction.InternalViewAction.ShowActionError) internalViewAction;
                return new d.b.C0479d(showActionError.f241459b, showActionError.f241460c, showActionError.f241461d);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowAddressActionMessageAlert) {
                PublishDetailsInternalAction.InternalViewAction.ShowAddressActionMessageAlert showAddressActionMessageAlert = (PublishDetailsInternalAction.InternalViewAction.ShowAddressActionMessageAlert) internalViewAction;
                return new d.b.e(showAddressActionMessageAlert.f241462b, showAddressActionMessageAlert.f241463c);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowAppBarOnboarding) {
                return new d.b.f(((PublishDetailsInternalAction.InternalViewAction.ShowAppBarOnboarding) internalViewAction).f241464b);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowErrorAlert) {
                return new d.b.h(((PublishDetailsInternalAction.InternalViewAction.ShowErrorAlert) internalViewAction).f241466b);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowErrorWithAction) {
                return new d.b.i();
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowSimpleMessageAlert) {
                return new d.b.j(((PublishDetailsInternalAction.InternalViewAction.ShowSimpleMessageAlert) internalViewAction).f241467b);
            }
            if (internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowToastBarError) {
                return new d.b.k(((PublishDetailsInternalAction.InternalViewAction.ShowToastBarError) internalViewAction).f241468b);
            }
            if (!(internalViewAction instanceof PublishDetailsInternalAction.InternalViewAction.ShowTooltipForItem)) {
                throw new NoWhenBranchMatchedException();
            }
            PublishDetailsInternalAction.InternalViewAction.ShowTooltipForItem showTooltipForItem = (PublishDetailsInternalAction.InternalViewAction.ShowTooltipForItem) internalViewAction;
            return new d.b.l(showTooltipForItem.f241469b, showTooltipForItem.f241470c, showTooltipForItem.f241471d);
        }
        if (!(publishDetailsInternalAction2 instanceof PublishDetailsInternalAction.InternalRouteAction)) {
            return null;
        }
        PublishDetailsInternalAction.InternalRouteAction internalRouteAction = (PublishDetailsInternalAction.InternalRouteAction) publishDetailsInternalAction2;
        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowPublishDetailsStepForFillParams) {
            return new d.a.Q(((PublishDetailsInternalAction.InternalRouteAction.ShowPublishDetailsStepForFillParams) internalRouteAction).f241430b);
        }
        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowDateDialog) {
            PublishDetailsInternalAction.InternalRouteAction.ShowDateDialog showDateDialog = (PublishDetailsInternalAction.InternalRouteAction.ShowDateDialog) internalRouteAction;
            return new d.a.I(showDateDialog.f241406b, showDateDialog.f241407c);
        }
        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenWebUrl) {
            return new d.a.A(((PublishDetailsInternalAction.InternalRouteAction.OpenWebUrl) internalRouteAction).f241392b);
        }
        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowHelpCenterScreen) {
            return new d.a.O(((PublishDetailsInternalAction.InternalRouteAction.ShowHelpCenterScreen) internalRouteAction).f241427b);
        }
        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowAppSettings) {
            dVar = d.a.D.f8337a;
        } else if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.GoToPreviousStep) {
            dVar = d.a.C0477d.f8377a;
        } else {
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenParametersBottomSheet) {
                PublishDetailsInternalAction.InternalRouteAction.OpenParametersBottomSheet openParametersBottomSheet = (PublishDetailsInternalAction.InternalRouteAction.OpenParametersBottomSheet) internalRouteAction;
                return new d.a.x(openParametersBottomSheet.f241387b, openParametersBottomSheet.f241388c, openParametersBottomSheet.f241389d);
            }
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowDatePickerDialog) {
                PublishDetailsInternalAction.InternalRouteAction.ShowDatePickerDialog showDatePickerDialog = (PublishDetailsInternalAction.InternalRouteAction.ShowDatePickerDialog) internalRouteAction;
                return new d.a.J(showDatePickerDialog.f241408b, showDatePickerDialog.f241409c, showDatePickerDialog.f241410d);
            }
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowDateTimeRangeDialog) {
                PublishDetailsInternalAction.InternalRouteAction.ShowDateTimeRangeDialog showDateTimeRangeDialog = (PublishDetailsInternalAction.InternalRouteAction.ShowDateTimeRangeDialog) internalRouteAction;
                return new d.a.K(showDateTimeRangeDialog.f241411b, showDateTimeRangeDialog.f241412c, showDateTimeRangeDialog.f241413d);
            }
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowEditObjectsScreen) {
                PublishDetailsInternalAction.InternalRouteAction.ShowEditObjectsScreen showEditObjectsScreen = (PublishDetailsInternalAction.InternalRouteAction.ShowEditObjectsScreen) internalRouteAction;
                return new d.a.N(showEditObjectsScreen.f241425b, showEditObjectsScreen.f241426c);
            }
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectPriceListScreen) {
                return new d.a.C14086l(((PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectPriceListScreen) internalRouteAction).f241370b);
            }
            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowResidentialComplexSuggestScreen) {
                dVar = d.a.R.f8370a;
            } else if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OnEditCategoryClicked) {
                dVar = d.a.C14087m.f8390a;
            } else {
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectMetroScreen) {
                    PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectMetroScreen navigateToSelectMetroScreen = (PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectMetroScreen) internalRouteAction;
                    return new d.a.C14085k(navigateToSelectMetroScreen.f241367b, navigateToSelectMetroScreen.f241368c, navigateToSelectMetroScreen.f241369d);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectDistrictsScreen) {
                    return new d.a.C14084j(((PublishDetailsInternalAction.InternalRouteAction.NavigateToSelectDistrictsScreen) internalRouteAction).f241366b);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenDeepLink) {
                    PublishDetailsInternalAction.InternalRouteAction.OpenDeepLink openDeepLink = (PublishDetailsInternalAction.InternalRouteAction.OpenDeepLink) internalRouteAction;
                    return new d.a.C14091q(openDeepLink.f241375b, openDeepLink.f241376c);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowConfirmation) {
                    ((PublishDetailsInternalAction.InternalRouteAction.ShowConfirmation) internalRouteAction).getClass();
                    return new d.a.F();
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowLocationPicker) {
                    PublishDetailsInternalAction.InternalRouteAction.ShowLocationPicker showLocationPicker = (PublishDetailsInternalAction.InternalRouteAction.ShowLocationPicker) internalRouteAction;
                    return new d.a.P(showLocationPicker.f241428b, showLocationPicker.f241429c);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowSelectScreen) {
                    return new d.a.S(((PublishDetailsInternalAction.InternalRouteAction.ShowSelectScreen) internalRouteAction).f241432b);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowAutoEarlyAccessSelectScreen) {
                    return new d.a.E(((PublishDetailsInternalAction.InternalRouteAction.ShowAutoEarlyAccessSelectScreen) internalRouteAction).f241399b);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowSelectorCardGroupBottomSheet) {
                    return new d.a.T(((PublishDetailsInternalAction.InternalRouteAction.ShowSelectorCardGroupBottomSheet) internalRouteAction).f241433b);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesSelectDialog) {
                    PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesSelectDialog openIacDevicesSelectDialog = (PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesSelectDialog) internalRouteAction;
                    return new d.a.w(openIacDevicesSelectDialog.f241384b, openIacDevicesSelectDialog.f241385c, openIacDevicesSelectDialog.f241386d);
                }
                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenIacDevicesInfoDialog) {
                    dVar = d.a.v.f8402a;
                } else if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.CheckVideoPicker) {
                    dVar = d.a.C14077b.f8375a;
                } else if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenCamera) {
                    dVar = d.a.C14088n.f8391a;
                } else {
                    if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenVideoPicker) {
                        return new d.a.z(((PublishDetailsInternalAction.InternalRouteAction.OpenVideoPicker) internalRouteAction).f241391b);
                    }
                    if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenCameraRequest) {
                        dVar = d.a.C14089o.f8392a;
                    } else if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryToggles) {
                        dVar = d.a.C14094t.f8399a;
                    } else {
                        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenConfirmDisablingDialog) {
                            return new d.a.C14090p(((PublishDetailsInternalAction.InternalRouteAction.OpenConfirmDisablingDialog) internalRouteAction).f241374b);
                        }
                        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenFilePicker) {
                            PublishDetailsInternalAction.InternalRouteAction.OpenFilePicker openFilePicker = (PublishDetailsInternalAction.InternalRouteAction.OpenFilePicker) internalRouteAction;
                            return new d.a.C14095u(openFilePicker.f241381b, openFilePicker.f241382c);
                        }
                        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenSleepingPlacesBedTypesDialog) {
                            return new d.a.y(((PublishDetailsInternalAction.InternalRouteAction.OpenSleepingPlacesBedTypesDialog) internalRouteAction).f241390b);
                        }
                        if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ContinuePublishAfterVerification) {
                            dVar = d.a.C14078c.f8376a;
                        } else {
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryAddressesListDialog) {
                                PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryAddressesListDialog openDeliveryAddressesListDialog = (PublishDetailsInternalAction.InternalRouteAction.OpenDeliveryAddressesListDialog) internalRouteAction;
                                return new d.a.C14093s(openDeliveryAddressesListDialog.f241378b, openDeliveryAddressesListDialog.f241379c);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.OpenDeleteAddressConfirmationDialog) {
                                return new d.a.C14092r(((PublishDetailsInternalAction.InternalRouteAction.OpenDeleteAddressConfirmationDialog) internalRouteAction).f241377b);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowDialog) {
                                PublishDetailsInternalAction.InternalRouteAction.ShowDialog showDialog = (PublishDetailsInternalAction.InternalRouteAction.ShowDialog) internalRouteAction;
                                return new d.a.L(showDialog.f241414b, showDialog.f241415c, showDialog.f241416d, showDialog.f241417e, showDialog.f241418f);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowDialogDismissable) {
                                PublishDetailsInternalAction.InternalRouteAction.ShowDialogDismissable showDialogDismissable = (PublishDetailsInternalAction.InternalRouteAction.ShowDialogDismissable) internalRouteAction;
                                String str = showDialogDismissable.f241419b;
                                Y41.a<G0> aVar = showDialogDismissable.f241423f;
                                Y41.a<G0> aVar2 = showDialogDismissable.f241424g;
                                return new d.a.M(str, showDialogDismissable.f241420c, showDialogDismissable.f241421d, showDialogDismissable.f241422e, aVar, aVar2);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowCpaTariffRequestScreen) {
                                return new d.a.H(((PublishDetailsInternalAction.InternalRouteAction.ShowCpaTariffRequestScreen) internalRouteAction).f241405b);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.AddressResubmissionBottomSheet) {
                                return new d.a.C0476a(((PublishDetailsInternalAction.InternalRouteAction.AddressResubmissionBottomSheet) internalRouteAction).f241355b);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.IacMicSystemPermissionRequest) {
                                PublishDetailsInternalAction.InternalRouteAction.IacMicSystemPermissionRequest iacMicSystemPermissionRequest = (PublishDetailsInternalAction.InternalRouteAction.IacMicSystemPermissionRequest) internalRouteAction;
                                return new d.a.C14081g(iacMicSystemPermissionRequest.f241361b, iacMicSystemPermissionRequest.f241362c, iacMicSystemPermissionRequest.f241363d);
                            }
                            if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.LeaveFillingParamsScreen) {
                                dVar = d.a.C14082h.f8383a;
                            } else {
                                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.PhoneVerificationScreen) {
                                    return new d.a.B(((PublishDetailsInternalAction.InternalRouteAction.PhoneVerificationScreen) internalRouteAction).f241393b);
                                }
                                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ReverificationInfoScreen) {
                                    PublishDetailsInternalAction.InternalRouteAction.ReverificationInfoScreen reverificationInfoScreen = (PublishDetailsInternalAction.InternalRouteAction.ReverificationInfoScreen) internalRouteAction;
                                    return new d.a.C(reverificationInfoScreen.f241394b, reverificationInfoScreen.f241395c, reverificationInfoScreen.f241396d, reverificationInfoScreen.f241397e);
                                }
                                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.HtmlFormatClicked) {
                                    return new d.a.C14079e(((PublishDetailsInternalAction.InternalRouteAction.HtmlFormatClicked) internalRouteAction).f241359b);
                                }
                                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.HtmlHistoryNavigationClicked) {
                                    return new d.a.C14080f(((PublishDetailsInternalAction.InternalRouteAction.HtmlHistoryNavigationClicked) internalRouteAction).f241360b);
                                }
                                if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowSellerProtectionDialog) {
                                    dVar = d.a.U.f8373a;
                                } else {
                                    if (internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.ShowConfirmationDialog) {
                                        PublishDetailsInternalAction.InternalRouteAction.ShowConfirmationDialog showConfirmationDialog = (PublishDetailsInternalAction.InternalRouteAction.ShowConfirmationDialog) internalRouteAction;
                                        return new d.a.G(showConfirmationDialog.f241400b, showConfirmationDialog.f241401c, showConfirmationDialog.f241402d, showConfirmationDialog.f241403e, showConfirmationDialog.f241404f);
                                    }
                                    if (!(internalRouteAction instanceof PublishDetailsInternalAction.InternalRouteAction.LeaveScreen)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar = d.a.C14083i.f8384a;
                                }
                            }
                        }
                    }
                }
            }
        }
        return dVar;
    }
}
