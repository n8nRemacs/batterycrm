package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.profile_settings_extended.analytics.ExtendedProfileAddAddressEvent;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import yc0.m;

/* compiled from: ExtendedProfileSettingsOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/O;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lyc0/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O implements com.avito.android.arch.mvi.t<ExtendedProfileSettingsInternalAction, yc0.m> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f230491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f230492c;

    @Inject
    public O(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f230491b = e12;
        this.f230492c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final yc0.m b(ExtendedProfileSettingsInternalAction extendedProfileSettingsInternalAction) {
        ExtendedProfileSettingsInternalAction extendedProfileSettingsInternalAction2 = extendedProfileSettingsInternalAction;
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.OpenAuthScreen) {
            ((ExtendedProfileSettingsInternalAction.OpenAuthScreen) extendedProfileSettingsInternalAction2).getClass();
            AuthSource authSource = AuthSource.f92694c;
            return new m.d();
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.AboutWidgetInternalAction.OpenTextFieldEditor) {
            return new m.o(((ExtendedProfileSettingsInternalAction.AboutWidgetInternalAction.OpenTextFieldEditor) extendedProfileSettingsInternalAction2).f230548b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.OpenAddressEditor) {
            ExtendedProfileSettingsInternalAction.OpenAddressEditor openAddressEditor = (ExtendedProfileSettingsInternalAction.OpenAddressEditor) extendedProfileSettingsInternalAction2;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = openAddressEditor.f230612c;
            ExtendedProfileAddAddressEvent.ActionType actionType = extendedProfilesSettingsAddress == null ? ExtendedProfileAddAddressEvent.ActionType.f229966c : ExtendedProfileAddAddressEvent.ActionType.f229967d;
            String strA = this.f230491b.a();
            if (strA != null) {
                this.f230492c.c(new ExtendedProfileAddAddressEvent(strA, actionType));
            }
            return new m.C50223c(openAddressEditor.f230611b, extendedProfilesSettingsAddress);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenAddPhoneForReplacementScreenEvent) {
            return new m.C50222b(((ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenAddPhoneForReplacementScreenEvent) extendedProfileSettingsInternalAction2).f230616b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenLandlinePhoneVerificationStatusScreen) {
            ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenLandlinePhoneVerificationStatusScreen openLandlinePhoneVerificationStatusScreen = (ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenLandlinePhoneVerificationStatusScreen) extendedProfileSettingsInternalAction2;
            openLandlinePhoneVerificationStatusScreen.getClass();
            return new m.j(openLandlinePhoneVerificationStatusScreen.f230617b, openLandlinePhoneVerificationStatusScreen.f230618c, openLandlinePhoneVerificationStatusScreen.f230619d);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.OpenCarouselEditor) {
            return new m.f(((ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.OpenCarouselEditor) extendedProfileSettingsInternalAction2).f230560b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ShowMoreActionsSettingItemAction) {
            return new m.y(((ExtendedProfileSettingsInternalAction.ShowMoreActionsSettingItemAction) extendedProfileSettingsInternalAction2).f230639b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages) {
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages pickImages = (ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages) extendedProfileSettingsInternalAction2;
            return new m.p(pickImages.f230587b, pickImages.f230588c);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenImageEditor) {
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenImageEditor openImageEditor = (ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenImageEditor) extendedProfileSettingsInternalAction2;
            return new m.i(openImageEditor.f230583c, openImageEditor.f230584d, openImageEditor.f230582b, openImageEditor.f230585e, openImageEditor.f230586f);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent) {
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent openGalleryEvent = (ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenGalleryEvent) extendedProfileSettingsInternalAction2;
            return new m.h(openGalleryEvent.f230580b, openGalleryEvent.f230581c);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ShowGalleryImagePlaceholder) {
            ExtendedProfileSettingsInternalAction.ImagesInternalAction.ShowGalleryImagePlaceholder showGalleryImagePlaceholder = (ExtendedProfileSettingsInternalAction.ImagesInternalAction.ShowGalleryImagePlaceholder) extendedProfileSettingsInternalAction2;
            return new m.u(showGalleryImagePlaceholder.f230589b, showGalleryImagePlaceholder.f230590c, showGalleryImagePlaceholder.f230591d, showGalleryImagePlaceholder.f230592e, showGalleryImagePlaceholder.f230593f);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.HideGalleryImagePlaceholder) {
            return m.C50221a.f443269a;
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageDeletionFailure) {
            return new m.s(((ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageDeletionFailure) extendedProfileSettingsInternalAction2).f230577c);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.ScrollToTop) {
            return m.q.f443293a;
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ScrollToWidgets) {
            return new m.r(((ExtendedProfileSettingsInternalAction.ScrollToWidgets) extendedProfileSettingsInternalAction2).f230626b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar) {
            return new m.s(((ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar) extendedProfileSettingsInternalAction2).f230641b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowDialogEvent) {
            ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowDialogEvent showDialogEvent = (ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowDialogEvent) extendedProfileSettingsInternalAction2;
            return new m.t(showDialogEvent.f230643b, showDialogEvent.f230644c, showDialogEvent.f230645d, showDialogEvent.f230646e, showDialogEvent.f230647f);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.ShowMoreActions) {
            return new m.v(((ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.ShowMoreActions) extendedProfileSettingsInternalAction2).f230602b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.OpenPersonalLinkEditScreen) {
            return new m.k(((ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.OpenPersonalLinkEditScreen) extendedProfileSettingsInternalAction2).f230601b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar) {
            ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar showToastBar = (ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar) extendedProfileSettingsInternalAction2;
            return new m.z(showToastBar.f230648b, showToastBar.f230649c);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveFail) {
            return new m.s(((ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveFail) extendedProfileSettingsInternalAction2).f230629b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicFail) {
            return new m.s(((ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicFail) extendedProfileSettingsInternalAction2).f230635b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.OpenSelectionCreateScreen) {
            return new m.l(((ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.OpenSelectionCreateScreen) extendedProfileSettingsInternalAction2).f230628b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.OpenSelector) {
            return new m.C12912m(((ExtendedProfileSettingsInternalAction.OpenSelector) extendedProfileSettingsInternalAction2).f230614b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.OpenCountEdit) {
            return new m.g(((ExtendedProfileSettingsInternalAction.OpenCountEdit) extendedProfileSettingsInternalAction2).f230613b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ShowScreenByJson) {
            return new m.w(((ExtendedProfileSettingsInternalAction.ShowScreenByJson) extendedProfileSettingsInternalAction2).f230640b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.UpdateExtendedProfileLazyColumnComponent) {
            return m.C.f443268a;
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.OpenShareDialog) {
            ExtendedProfileSettingsInternalAction.OpenShareDialog openShareDialog = (ExtendedProfileSettingsInternalAction.OpenShareDialog) extendedProfileSettingsInternalAction2;
            openShareDialog.getClass();
            return new m.n(openShareDialog.f230615b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenBasicInfoEditor) {
            return new m.e(((ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenBasicInfoEditor) extendedProfileSettingsInternalAction2).f230550b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.CreateSection) {
            return new m.A(((ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.CreateSection) extendedProfileSettingsInternalAction2).f230651b.f229888d);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.EditSection) {
            return new m.B(((ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.EditSection) extendedProfileSettingsInternalAction2).f230652b);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.SwapSections) {
            return new m.r(Collections.singletonList(((ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.SwapSections) extendedProfileSettingsInternalAction2).f230657e));
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.ShowSellerTypeOnboarding) {
            ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.ShowSellerTypeOnboarding showSellerTypeOnboarding = (ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.ShowSellerTypeOnboarding) extendedProfileSettingsInternalAction2;
            return new m.x(showSellerTypeOnboarding.f230553b, showSellerTypeOnboarding.f230554c);
        }
        if (extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.AboutWidgetInternalAction.OnAboutTextExpanded ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.CarouselEnabledSwitcherState ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.CarouselItemScrollStateChange ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.CommonValueInternalAction ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.AppendGalleryImages ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.CloseImageBottomMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.GroupImagesUpdate ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageDeletionCompleted ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageDeletionStarted ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageUpdate ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.ShowImageBottomMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.UpdateBannerImage ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ImagesInternalAction.UpdateImagePickerMode ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.DataLoaded ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.DataLoading ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.HideLoading ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.LoadingError ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.ReloadData ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.ShowLoading ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.LoadingDataInternalAction.UpdateDataInAdapter ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.PhoneDeletionProgress ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.OnPromoBlockClosed ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.UpdatePromoBlockButton ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionsItemScrollStateChange ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.ShowSelectionBottomMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.ToggleInternalAction ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.CloseSelectionMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicLoading ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicSuccess ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveSuccess ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveLoading ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenMoreActionsMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenUserNameModerationStatusMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.OpenStatusMenu ? true : extendedProfileSettingsInternalAction2 instanceof ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenAvatarModerationStatusMenu) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
