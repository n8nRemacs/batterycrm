package com.avito.android.profile_settings_extended.mvi.entity;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.about.AboutItem;
import com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.profile_settings_extended.adapter.setting.SettingItem;
import com.avito.android.profile_settings_extended.adapter.toggle.RegularToggleItem;
import com.avito.android.profile_settings_extended.adapter.universal.create.UniversalWidgetCreateItem;
import com.avito.android.profile_settings_extended.adapter.universal.section.UniversalWidgetSectionItem;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.profile_settings_extended.entity.u;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import yc0.InterfaceC50219c;

/* compiled from: ExtendedProfileSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AboutWidgetInternalAction", "BasicInfoV2InternalAction", "CarouselWidgetInternalAction", "CloseActionsBottomMenu", "CommonValueInternalAction", "ImagesInternalAction", "LinkEditWidgetInternalAction", "LoadingDataInternalAction", "OpenAddressEditor", "OpenAuthScreen", "OpenCountEdit", "OpenSelector", "OpenShareDialog", "PhonesWidgetInternalAction", "PromoBlockWidgetInternalAction", "ScrollToWidgets", "SelectionsWidgetInternalAction", "ShowMoreActionsSettingItemAction", "ShowScreenByJson", "SnackbarAndDialogInternalAction", "ToggleInternalAction", "UniversalWidgetInternalAction", "UpdateExtendedProfileLazyColumnComponent", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CloseActionsBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenAddressEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenAuthScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenCountEdit;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenSelector;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenShareDialog;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ScrollToWidgets;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ShowMoreActionsSettingItemAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ShowScreenByJson;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ToggleInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UpdateExtendedProfileLazyColumnComponent;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ExtendedProfileSettingsInternalAction extends n {

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "OnAboutTextExpanded", "OpenTextFieldEditor", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction$OnAboutTextExpanded;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction$OpenTextFieldEditor;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AboutWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction$OnAboutTextExpanded;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnAboutTextExpanded implements AboutWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AboutItem f230547b;

            public OnAboutTextExpanded(@k AboutItem aboutItem) {
                this.f230547b = aboutItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnAboutTextExpanded) && L.f(this.f230547b, ((OnAboutTextExpanded) obj).f230547b);
            }

            public final int hashCode() {
                return this.f230547b.hashCode();
            }

            @k
            public final String toString() {
                return "OnAboutTextExpanded(item=" + this.f230547b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction$OpenTextFieldEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$AboutWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenTextFieldEditor implements AboutWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AboutItem f230548b;

            public OpenTextFieldEditor(@k AboutItem aboutItem) {
                this.f230548b = aboutItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenTextFieldEditor) && L.f(this.f230548b, ((OpenTextFieldEditor) obj).f230548b);
            }

            public final int hashCode() {
                return this.f230548b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenTextFieldEditor(item=" + this.f230548b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "OpenAvatarModerationStatusMenu", "OpenBasicInfoEditor", "OpenMoreActionsMenu", "OpenUserNameModerationStatusMenu", "ShowSellerTypeOnboarding", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenAvatarModerationStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenBasicInfoEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenMoreActionsMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenUserNameModerationStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$ShowSellerTypeOnboarding;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BasicInfoV2InternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenAvatarModerationStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenAvatarModerationStatusMenu implements BasicInfoV2InternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BasicInfoV2Item f230549b;

            public OpenAvatarModerationStatusMenu(@k BasicInfoV2Item basicInfoV2Item) {
                this.f230549b = basicInfoV2Item;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAvatarModerationStatusMenu) && L.f(this.f230549b, ((OpenAvatarModerationStatusMenu) obj).f230549b);
            }

            public final int hashCode() {
                return this.f230549b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenAvatarModerationStatusMenu(item=" + this.f230549b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenBasicInfoEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenBasicInfoEditor implements BasicInfoV2InternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BasicInfoV2Item f230550b;

            public OpenBasicInfoEditor(@k BasicInfoV2Item basicInfoV2Item) {
                this.f230550b = basicInfoV2Item;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBasicInfoEditor) && L.f(this.f230550b, ((OpenBasicInfoEditor) obj).f230550b);
            }

            public final int hashCode() {
                return this.f230550b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenBasicInfoEditor(item=" + this.f230550b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenMoreActionsMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenMoreActionsMenu implements BasicInfoV2InternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BasicInfoV2Item f230551b;

            public OpenMoreActionsMenu(@k BasicInfoV2Item basicInfoV2Item) {
                this.f230551b = basicInfoV2Item;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenMoreActionsMenu) && L.f(this.f230551b, ((OpenMoreActionsMenu) obj).f230551b);
            }

            public final int hashCode() {
                return this.f230551b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenMoreActionsMenu(item=" + this.f230551b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$OpenUserNameModerationStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUserNameModerationStatusMenu implements BasicInfoV2InternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BasicInfoV2Item f230552b;

            public OpenUserNameModerationStatusMenu(@k BasicInfoV2Item basicInfoV2Item) {
                this.f230552b = basicInfoV2Item;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUserNameModerationStatusMenu) && L.f(this.f230552b, ((OpenUserNameModerationStatusMenu) obj).f230552b);
            }

            public final int hashCode() {
                return this.f230552b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenUserNameModerationStatusMenu(item=" + this.f230552b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction$ShowSellerTypeOnboarding;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$BasicInfoV2InternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSellerTypeOnboarding implements BasicInfoV2InternalAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f230553b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final BasicInfoV2Item.Onboarding f230554c;

            public ShowSellerTypeOnboarding(int i12, @k BasicInfoV2Item.Onboarding onboarding) {
                this.f230553b = i12;
                this.f230554c = onboarding;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSellerTypeOnboarding)) {
                    return false;
                }
                ShowSellerTypeOnboarding showSellerTypeOnboarding = (ShowSellerTypeOnboarding) obj;
                return this.f230553b == showSellerTypeOnboarding.f230553b && L.f(this.f230554c, showSellerTypeOnboarding.f230554c);
            }

            public final int hashCode() {
                return this.f230554c.hashCode() + (Integer.hashCode(this.f230553b) * 31);
            }

            @k
            public final String toString() {
                return "ShowSellerTypeOnboarding(targetViewId=" + this.f230553b + ", onboarding=" + this.f230554c + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "CarouselEnabledSwitcherState", "CarouselItemScrollStateChange", "OpenCarouselEditor", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$CarouselEnabledSwitcherState;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$CarouselItemScrollStateChange;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$OpenCarouselEditor;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CarouselWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$CarouselEnabledSwitcherState;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CarouselEnabledSwitcherState implements CarouselWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230555b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f230556c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f230557d;

            public CarouselEnabledSwitcherState(@k String str, boolean z12, boolean z13) {
                this.f230555b = str;
                this.f230556c = z12;
                this.f230557d = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CarouselEnabledSwitcherState)) {
                    return false;
                }
                CarouselEnabledSwitcherState carouselEnabledSwitcherState = (CarouselEnabledSwitcherState) obj;
                return L.f(this.f230555b, carouselEnabledSwitcherState.f230555b) && this.f230556c == carouselEnabledSwitcherState.f230556c && this.f230557d == carouselEnabledSwitcherState.f230557d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f230557d) + r.i(this.f230555b.hashCode() * 31, 31, this.f230556c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CarouselEnabledSwitcherState(fieldName=");
                sb2.append(this.f230555b);
                sb2.append(", isEnabled=");
                sb2.append(this.f230556c);
                sb2.append(", isChecked=");
                return r.x(sb2, this.f230557d, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$CarouselItemScrollStateChange;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CarouselItemScrollStateChange implements CarouselWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230558b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Parcelable f230559c;

            public CarouselItemScrollStateChange(@k Parcelable parcelable, @k String str) {
                this.f230558b = str;
                this.f230559c = parcelable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CarouselItemScrollStateChange)) {
                    return false;
                }
                CarouselItemScrollStateChange carouselItemScrollStateChange = (CarouselItemScrollStateChange) obj;
                return L.f(this.f230558b, carouselItemScrollStateChange.f230558b) && L.f(this.f230559c, carouselItemScrollStateChange.f230559c);
            }

            public final int hashCode() {
                return this.f230559c.hashCode() + (this.f230558b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CarouselItemScrollStateChange(fieldName=");
                sb2.append(this.f230558b);
                sb2.append(", scrollState=");
                return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f230559c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction$OpenCarouselEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CarouselWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenCarouselEditor implements CarouselWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CarouselEditorData f230560b;

            public OpenCarouselEditor(@k CarouselEditorData carouselEditorData) {
                this.f230560b = carouselEditorData;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCarouselEditor) && L.f(this.f230560b, ((OpenCarouselEditor) obj).f230560b);
            }

            public final int hashCode() {
                return this.f230560b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenCarouselEditor(data=" + this.f230560b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CloseActionsBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseActionsBottomMenu implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseActionsBottomMenu f230561b = new CloseActionsBottomMenu();

        private CloseActionsBottomMenu() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseActionsBottomMenu);
        }

        public final int hashCode() {
            return -550554022;
        }

        @k
        public final String toString() {
            return "CloseActionsBottomMenu";
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "OpenPersonalLinkEditScreen", "ShowMoreActions", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction$OpenPersonalLinkEditScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction$ShowMoreActions;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LinkEditWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction$OpenPersonalLinkEditScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenPersonalLinkEditScreen implements LinkEditWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PersonalLinkEditConfig f230601b;

            public OpenPersonalLinkEditScreen(@k PersonalLinkEditConfig personalLinkEditConfig) {
                this.f230601b = personalLinkEditConfig;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPersonalLinkEditScreen) && L.f(this.f230601b, ((OpenPersonalLinkEditScreen) obj).f230601b);
            }

            public final int hashCode() {
                return this.f230601b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenPersonalLinkEditScreen(editorConfig=" + this.f230601b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction$ShowMoreActions;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LinkEditWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowMoreActions implements LinkEditWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LinkEditItem f230602b;

            public ShowMoreActions(@k LinkEditItem linkEditItem) {
                this.f230602b = linkEditItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowMoreActions) && L.f(this.f230602b, ((ShowMoreActions) obj).f230602b);
            }

            public final int hashCode() {
                return this.f230602b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowMoreActions(item=" + this.f230602b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "DataLoaded", "DataLoading", "HideLoading", "LoadingError", "ReloadData", "ScrollToTop", "ShowLoading", "UpdateDataInAdapter", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$DataLoaded;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$DataLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$HideLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$LoadingError;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ReloadData;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ScrollToTop;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ShowLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$UpdateDataInAdapter;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LoadingDataInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$DataLoaded;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DataLoaded implements LoadingDataInternalAction, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final u f230603b;

            public DataLoaded(@k u uVar) {
                this.f230603b = uVar;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF206990d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DataLoaded) && L.f(this.f230603b, ((DataLoaded) obj).f230603b);
            }

            public final int hashCode() {
                return this.f230603b.hashCode();
            }

            @k
            public final String toString() {
                return "DataLoaded(data=" + this.f230603b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$DataLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DataLoading extends TrackableLoadingStarted implements LoadingDataInternalAction {
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$HideLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HideLoading implements LoadingDataInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final HideLoading f230604b = new HideLoading();

            private HideLoading() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$LoadingError;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements LoadingDataInternalAction, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f230605b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f230606c;

            public LoadingError(@k Throwable th2) {
                this.f230605b = th2;
                this.f230606c = new J.a(th2);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF206990d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && L.f(this.f230605b, ((LoadingError) obj).f230605b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF206988c() {
                return this.f230606c;
            }

            public final int hashCode() {
                return this.f230605b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(error="), this.f230605b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ReloadData;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReloadData implements LoadingDataInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f230607b;

            public ReloadData(@l String str) {
                this.f230607b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReloadData) && L.f(this.f230607b, ((ReloadData) obj).f230607b);
            }

            public final int hashCode() {
                String str = this.f230607b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ReloadData(message="), this.f230607b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ScrollToTop;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScrollToTop implements LoadingDataInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ScrollToTop f230608b = new ScrollToTop();

            private ScrollToTop() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$ShowLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ShowLoading implements LoadingDataInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowLoading f230609b = new ShowLoading();

            private ShowLoading() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction$UpdateDataInAdapter;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$LoadingDataInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateDataInAdapter implements LoadingDataInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final u f230610b;

            public UpdateDataInAdapter(@k u uVar) {
                this.f230610b = uVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateDataInAdapter) && L.f(this.f230610b, ((UpdateDataInAdapter) obj).f230610b);
            }

            public final int hashCode() {
                return this.f230610b.hashCode();
            }

            @k
            public final String toString() {
                return "UpdateDataInAdapter(data=" + this.f230610b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenAddressEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAddressEditor implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f230611b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ExtendedProfilesSettingsAddress f230612c;

        public OpenAddressEditor(@k String str, @l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f230611b = str;
            this.f230612c = extendedProfilesSettingsAddress;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAddressEditor)) {
                return false;
            }
            OpenAddressEditor openAddressEditor = (OpenAddressEditor) obj;
            return L.f(this.f230611b, openAddressEditor.f230611b) && L.f(this.f230612c, openAddressEditor.f230612c);
        }

        public final int hashCode() {
            int iHashCode = this.f230611b.hashCode() * 31;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = this.f230612c;
            return iHashCode + (extendedProfilesSettingsAddress == null ? 0 : extendedProfilesSettingsAddress.hashCode());
        }

        @k
        public final String toString() {
            return "OpenAddressEditor(fieldName=" + this.f230611b + ", address=" + this.f230612c + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenAuthScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthScreen implements ExtendedProfileSettingsInternalAction {
        public OpenAuthScreen() {
            AuthSource authSource = AuthSource.f92694c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAuthScreen)) {
                return false;
            }
            AuthSource authSource = AuthSource.f92694c;
            ((OpenAuthScreen) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return AuthSource.f92728t.hashCode();
        }

        @k
        public final String toString() {
            return "OpenAuthScreen(source=" + AuthSource.f92728t + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenCountEdit;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCountEdit implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CountItem f230613b;

        public OpenCountEdit(@k CountItem countItem) {
            this.f230613b = countItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenCountEdit) && L.f(this.f230613b, ((OpenCountEdit) obj).f230613b);
        }

        public final int hashCode() {
            return this.f230613b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenCountEdit(item=" + this.f230613b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenSelector;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelector implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectItem f230614b;

        public OpenSelector(@k SelectItem selectItem) {
            this.f230614b = selectItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSelector) && L.f(this.f230614b, ((OpenSelector) obj).f230614b);
        }

        public final int hashCode() {
            return this.f230614b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSelector(item=" + this.f230614b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$OpenShareDialog;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenShareDialog implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f230615b;

        public OpenShareDialog(@k String str) {
            this.f230615b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenShareDialog)) {
                return false;
            }
            OpenShareDialog openShareDialog = (OpenShareDialog) obj;
            openShareDialog.getClass();
            return L.f(null, null) && L.f(this.f230615b, openShareDialog.f230615b);
        }

        public final int hashCode() {
            return this.f230615b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenShareDialog(title=null, url="), this.f230615b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "OpenAddPhoneForReplacementScreenEvent", "OpenLandlinePhoneVerificationStatusScreen", "PhoneDeletionProgress", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$OpenAddPhoneForReplacementScreenEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$OpenLandlinePhoneVerificationStatusScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$PhoneDeletionProgress;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PhonesWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$OpenAddPhoneForReplacementScreenEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenAddPhoneForReplacementScreenEvent implements PhonesWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230616b;

            public OpenAddPhoneForReplacementScreenEvent(@k String str) {
                this.f230616b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAddPhoneForReplacementScreenEvent) && L.f(this.f230616b, ((OpenAddPhoneForReplacementScreenEvent) obj).f230616b);
            }

            public final int hashCode() {
                return this.f230616b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("OpenAddPhoneForReplacementScreenEvent(phoneToBeReplaced="), this.f230616b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$OpenLandlinePhoneVerificationStatusScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OpenLandlinePhoneVerificationStatusScreen implements PhonesWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230617b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f230618c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final AttributedText f230619d;

            public OpenLandlinePhoneVerificationStatusScreen(@k String str, @k String str2, @k AttributedText attributedText) {
                this.f230617b = str;
                this.f230618c = str2;
                this.f230619d = attributedText;
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction$PhoneDeletionProgress;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PhonesWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PhoneDeletionProgress implements PhonesWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CommonValueId f230620b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f230621c;

            public PhoneDeletionProgress(@k CommonValueId commonValueId, boolean z12) {
                this.f230620b = commonValueId;
                this.f230621c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PhoneDeletionProgress)) {
                    return false;
                }
                PhoneDeletionProgress phoneDeletionProgress = (PhoneDeletionProgress) obj;
                return L.f(this.f230620b, phoneDeletionProgress.f230620b) && this.f230621c == phoneDeletionProgress.f230621c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f230621c) + (this.f230620b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PhoneDeletionProgress(id=");
                sb2.append(this.f230620b);
                sb2.append(", isInProgress=");
                return r.x(sb2, this.f230621c, ')');
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "OnPromoBlockClosed", "UpdatePromoBlockButton", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$OnPromoBlockClosed;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PromoBlockWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$OnPromoBlockClosed;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnPromoBlockClosed implements PromoBlockWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PromoBlockItem f230622b;

            public OnPromoBlockClosed(@k PromoBlockItem promoBlockItem) {
                this.f230622b = promoBlockItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnPromoBlockClosed) && L.f(this.f230622b, ((OnPromoBlockClosed) obj).f230622b);
            }

            public final int hashCode() {
                return this.f230622b.hashCode();
            }

            @k
            public final String toString() {
                return "OnPromoBlockClosed(item=" + this.f230622b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdatePromoBlockButton implements PromoBlockWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PromoBlockItem f230623b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final DeepLink f230624c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f230625d;

            public UpdatePromoBlockButton(@k PromoBlockItem promoBlockItem, @k DeepLink deepLink, boolean z12) {
                this.f230623b = promoBlockItem;
                this.f230624c = deepLink;
                this.f230625d = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdatePromoBlockButton)) {
                    return false;
                }
                UpdatePromoBlockButton updatePromoBlockButton = (UpdatePromoBlockButton) obj;
                return this.f230623b.equals(updatePromoBlockButton.f230623b) && this.f230624c.equals(updatePromoBlockButton.f230624c) && this.f230625d == updatePromoBlockButton.f230625d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f230625d) + com.avito.android.actions_sheet.a.e(this.f230624c, this.f230623b.hashCode() * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UpdatePromoBlockButton(item=");
                sb2.append(this.f230623b);
                sb2.append(", deeplink=");
                sb2.append(this.f230624c);
                sb2.append(", isLoading=");
                return r.x(sb2, this.f230625d, ')');
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ScrollToWidgets;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToWidgets implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f230626b;

        public ScrollToWidgets(@k List<String> list) {
            this.f230626b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToWidgets) && L.f(this.f230626b, ((ScrollToWidgets) obj).f230626b);
        }

        public final int hashCode() {
            return this.f230626b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ScrollToWidgets(widgetsToScroll="), this.f230626b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "CloseSelectionMenu", "OpenSelectionCreateScreen", "SelectionRemoveFail", "SelectionRemoveLoading", "SelectionRemoveSuccess", "SelectionsItemScrollStateChange", "SetSelectionPublicFail", "SetSelectionPublicLoading", "SetSelectionPublicSuccess", "ShowSelectionBottomMenu", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$CloseSelectionMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$OpenSelectionCreateScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveFail;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveSuccess;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionsItemScrollStateChange;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicFail;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicSuccess;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$ShowSelectionBottomMenu;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SelectionsWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$CloseSelectionMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseSelectionMenu implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CloseSelectionMenu f230627b = new CloseSelectionMenu();

            private CloseSelectionMenu() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof CloseSelectionMenu);
            }

            public final int hashCode() {
                return 1406233336;
            }

            @k
            public final String toString() {
                return "CloseSelectionMenu";
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$OpenSelectionCreateScreen;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenSelectionCreateScreen implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ExtendedProfileSelectionCreateConfig f230628b;

            public OpenSelectionCreateScreen(@k ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig) {
                this.f230628b = extendedProfileSelectionCreateConfig;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSelectionCreateScreen) && L.f(this.f230628b, ((OpenSelectionCreateScreen) obj).f230628b);
            }

            public final int hashCode() {
                return this.f230628b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenSelectionCreateScreen(config=" + this.f230628b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveFail;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectionRemoveFail implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f230629b;

            public SelectionRemoveFail(@k Throwable th2) {
                this.f230629b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectionRemoveFail) && L.f(this.f230629b, ((SelectionRemoveFail) obj).f230629b);
            }

            public final int hashCode() {
                return this.f230629b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SelectionRemoveFail(throwable="), this.f230629b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectionRemoveLoading implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final SelectionRemoveLoading f230630b = new SelectionRemoveLoading();

            private SelectionRemoveLoading() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof SelectionRemoveLoading);
            }

            public final int hashCode() {
                return -1592423311;
            }

            @k
            public final String toString() {
                return "SelectionRemoveLoading";
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveSuccess;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectionRemoveSuccess implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230631b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f230632c;

            public SelectionRemoveSuccess(@k String str, @k String str2) {
                this.f230631b = str;
                this.f230632c = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectionRemoveSuccess)) {
                    return false;
                }
                SelectionRemoveSuccess selectionRemoveSuccess = (SelectionRemoveSuccess) obj;
                return L.f(this.f230631b, selectionRemoveSuccess.f230631b) && L.f(this.f230632c, selectionRemoveSuccess.f230632c);
            }

            public final int hashCode() {
                return this.f230632c.hashCode() + (this.f230631b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectionRemoveSuccess(fieldName=");
                sb2.append(this.f230631b);
                sb2.append(", valueId=");
                return C22026a.c(sb2, this.f230632c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionsItemScrollStateChange;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectionsItemScrollStateChange implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230633b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Parcelable f230634c;

            public SelectionsItemScrollStateChange(@l Parcelable parcelable, @k String str) {
                this.f230633b = str;
                this.f230634c = parcelable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectionsItemScrollStateChange)) {
                    return false;
                }
                SelectionsItemScrollStateChange selectionsItemScrollStateChange = (SelectionsItemScrollStateChange) obj;
                return L.f(this.f230633b, selectionsItemScrollStateChange.f230633b) && L.f(this.f230634c, selectionsItemScrollStateChange.f230634c);
            }

            public final int hashCode() {
                int iHashCode = this.f230633b.hashCode() * 31;
                Parcelable parcelable = this.f230634c;
                return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectionsItemScrollStateChange(fieldName=");
                sb2.append(this.f230633b);
                sb2.append(", scrollState=");
                return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f230634c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicFail;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetSelectionPublicFail implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f230635b;

            public SetSelectionPublicFail(@k Throwable th2) {
                this.f230635b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetSelectionPublicFail) && L.f(this.f230635b, ((SetSelectionPublicFail) obj).f230635b);
            }

            public final int hashCode() {
                return this.f230635b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SetSelectionPublicFail(throwable="), this.f230635b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicLoading;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetSelectionPublicLoading implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final SetSelectionPublicLoading f230636b = new SetSelectionPublicLoading();

            private SetSelectionPublicLoading() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof SetSelectionPublicLoading);
            }

            public final int hashCode() {
                return -1392897340;
            }

            @k
            public final String toString() {
                return "SetSelectionPublicLoading";
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SetSelectionPublicSuccess;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetSelectionPublicSuccess implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SelectionItem f230637b;

            public SetSelectionPublicSuccess(@k SelectionItem selectionItem) {
                this.f230637b = selectionItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetSelectionPublicSuccess) && L.f(this.f230637b, ((SetSelectionPublicSuccess) obj).f230637b);
            }

            public final int hashCode() {
                return this.f230637b.hashCode();
            }

            @k
            public final String toString() {
                return "SetSelectionPublicSuccess(selection=" + this.f230637b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$ShowSelectionBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSelectionBottomMenu implements SelectionsWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SelectionItem f230638b;

            public ShowSelectionBottomMenu(@k SelectionItem selectionItem) {
                this.f230638b = selectionItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSelectionBottomMenu) && L.f(this.f230638b, ((ShowSelectionBottomMenu) obj).f230638b);
            }

            public final int hashCode() {
                return this.f230638b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowSelectionBottomMenu(item=" + this.f230638b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ShowMoreActionsSettingItemAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMoreActionsSettingItemAction implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SettingItem f230639b;

        public ShowMoreActionsSettingItemAction(@k SettingItem settingItem) {
            this.f230639b = settingItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMoreActionsSettingItemAction) && L.f(this.f230639b, ((ShowMoreActionsSettingItemAction) obj).f230639b);
        }

        public final int hashCode() {
            return this.f230639b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowMoreActionsSettingItemAction(item=" + this.f230639b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ShowScreenByJson;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowScreenByJson implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f230640b;

        public ShowScreenByJson(@k String str) {
            this.f230640b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowScreenByJson) && L.f(this.f230640b, ((ShowScreenByJson) obj).f230640b);
        }

        public final int hashCode() {
            return this.f230640b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowScreenByJson(beduinJson="), this.f230640b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ToggleInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "RegularToggleUpdate", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ToggleInternalAction$RegularToggleUpdate;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ToggleInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ToggleInternalAction$RegularToggleUpdate;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ToggleInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RegularToggleUpdate implements ToggleInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final RegularToggleItem f230650b;

            public RegularToggleUpdate(@k RegularToggleItem regularToggleItem) {
                this.f230650b = regularToggleItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RegularToggleUpdate) && L.f(this.f230650b, ((RegularToggleUpdate) obj).f230650b);
            }

            public final int hashCode() {
                return this.f230650b.hashCode();
            }

            @k
            public final String toString() {
                return "RegularToggleUpdate(item=" + this.f230650b + ')';
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "CreateSection", "EditSection", "OpenStatusMenu", "SwapSections", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$CreateSection;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$EditSection;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$OpenStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$SwapSections;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UniversalWidgetInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$CreateSection;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CreateSection implements UniversalWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UniversalWidgetCreateItem f230651b;

            public CreateSection(@k UniversalWidgetCreateItem universalWidgetCreateItem) {
                this.f230651b = universalWidgetCreateItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CreateSection) && L.f(this.f230651b, ((CreateSection) obj).f230651b);
            }

            public final int hashCode() {
                return this.f230651b.hashCode();
            }

            @k
            public final String toString() {
                return "CreateSection(item=" + this.f230651b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$EditSection;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EditSection implements UniversalWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UniversalWidgetEditArguments f230652b;

            public EditSection(@k UniversalWidgetEditArguments universalWidgetEditArguments) {
                this.f230652b = universalWidgetEditArguments;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditSection) && L.f(this.f230652b, ((EditSection) obj).f230652b);
            }

            public final int hashCode() {
                return this.f230652b.hashCode();
            }

            @k
            public final String toString() {
                return "EditSection(args=" + this.f230652b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$OpenStatusMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenStatusMenu implements UniversalWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UniversalWidgetSectionItem f230653b;

            public OpenStatusMenu(@k UniversalWidgetSectionItem universalWidgetSectionItem) {
                this.f230653b = universalWidgetSectionItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenStatusMenu) && L.f(this.f230653b, ((OpenStatusMenu) obj).f230653b);
            }

            public final int hashCode() {
                return this.f230653b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenStatusMenu(item=" + this.f230653b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction$SwapSections;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SwapSections implements UniversalWidgetInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230654b;

            /* renamed from: c, reason: collision with root package name */
            public final int f230655c;

            /* renamed from: d, reason: collision with root package name */
            public final int f230656d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f230657e;

            public SwapSections(@k String str, int i12, int i13, @k String str2) {
                this.f230654b = str;
                this.f230655c = i12;
                this.f230656d = i13;
                this.f230657e = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SwapSections)) {
                    return false;
                }
                SwapSections swapSections = (SwapSections) obj;
                return L.f(this.f230654b, swapSections.f230654b) && this.f230655c == swapSections.f230655c && this.f230656d == swapSections.f230656d && L.f(this.f230657e, swapSections.f230657e);
            }

            public final int hashCode() {
                return this.f230657e.hashCode() + r.e(this.f230656d, r.e(this.f230655c, this.f230654b.hashCode() * 31, 31), 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SwapSections(fieldName=");
                sb2.append(this.f230654b);
                sb2.append(", sectionIndex1=");
                sb2.append(this.f230655c);
                sb2.append(", sectionIndex2=");
                sb2.append(this.f230656d);
                sb2.append(", currentValueId=");
                return C22026a.c(sb2, this.f230657e, ')');
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$UpdateExtendedProfileLazyColumnComponent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateExtendedProfileLazyColumnComponent implements ExtendedProfileSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateExtendedProfileLazyColumnComponent f230658b = new UpdateExtendedProfileLazyColumnComponent();

        private UpdateExtendedProfileLazyColumnComponent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateExtendedProfileLazyColumnComponent);
        }

        public final int hashCode() {
            return 1957142583;
        }

        @k
        public final String toString() {
            return "UpdateExtendedProfileLazyColumnComponent";
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "ShowCommonErrorToastBar", "ShowDialogEvent", "ShowToastBar", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowDialogEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowToastBar;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SnackbarAndDialogInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowCommonErrorToastBar implements SnackbarAndDialogInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Throwable f230641b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final yc0.k f230642c;

            public ShowCommonErrorToastBar(@k Throwable th2, @l yc0.k kVar) {
                this.f230641b = th2;
                this.f230642c = kVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCommonErrorToastBar)) {
                    return false;
                }
                ShowCommonErrorToastBar showCommonErrorToastBar = (ShowCommonErrorToastBar) obj;
                return L.f(this.f230641b, showCommonErrorToastBar.f230641b) && L.f(this.f230642c, showCommonErrorToastBar.f230642c);
            }

            public final int hashCode() {
                int iHashCode = this.f230641b.hashCode() * 31;
                yc0.k kVar = this.f230642c;
                return iHashCode + (kVar == null ? 0 : kVar.hashCode());
            }

            @k
            public final String toString() {
                return "ShowCommonErrorToastBar(throwable=" + this.f230641b + ", buttonAction=" + this.f230642c + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowDialogEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDialogEvent implements SnackbarAndDialogInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230643b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f230644c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f230645d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f230646e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final InterfaceC50219c.C12909c f230647f;

            public ShowDialogEvent(@k String str, @k String str2, @k String str3, @k String str4, @k InterfaceC50219c.C12909c c12909c) {
                this.f230643b = str;
                this.f230644c = str2;
                this.f230645d = str3;
                this.f230646e = str4;
                this.f230647f = c12909c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDialogEvent)) {
                    return false;
                }
                ShowDialogEvent showDialogEvent = (ShowDialogEvent) obj;
                return L.f(this.f230643b, showDialogEvent.f230643b) && L.f(this.f230644c, showDialogEvent.f230644c) && L.f(this.f230645d, showDialogEvent.f230645d) && L.f(this.f230646e, showDialogEvent.f230646e) && this.f230647f.equals(showDialogEvent.f230647f);
            }

            public final int hashCode() {
                return this.f230647f.hashCode() + H.d(H.d(H.d(this.f230643b.hashCode() * 31, 31, this.f230644c), 31, this.f230645d), 31, this.f230646e);
            }

            @k
            public final String toString() {
                return "ShowDialogEvent(title=" + this.f230643b + ", message=" + this.f230644c + ", primaryButtonText=" + this.f230645d + ", secondaryButtonText=" + this.f230646e + ", action=" + this.f230647f + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowToastBar;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowToastBar implements SnackbarAndDialogInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230648b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f230649c;

            public ShowToastBar(@k String str, boolean z12) {
                this.f230648b = str;
                this.f230649c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowToastBar)) {
                    return false;
                }
                ShowToastBar showToastBar = (ShowToastBar) obj;
                return L.f(this.f230648b, showToastBar.f230648b) && this.f230649c == showToastBar.f230649c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f230649c) + (this.f230648b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowToastBar(message=");
                sb2.append(this.f230648b);
                sb2.append(", isError=");
                return r.x(sb2, this.f230649c, ')');
            }

            public /* synthetic */ ShowToastBar(String str, boolean z12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? false : z12);
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "CloseCommonValueBottomMenu", "CommonValueRemovalProgress", "CommonValueRemoved", "ShowCommonValueBottomMenu", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CloseCommonValueBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CommonValueRemovalProgress;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CommonValueRemoved;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$ShowCommonValueBottomMenu;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CommonValueInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CloseCommonValueBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseCommonValueBottomMenu implements CommonValueInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CloseCommonValueBottomMenu f230562b = new CloseCommonValueBottomMenu();

            private CloseCommonValueBottomMenu() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CommonValueRemovalProgress;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CommonValueRemovalProgress implements CommonValueInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CommonValueId f230563b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f230564c;

            public CommonValueRemovalProgress(@k CommonValueId commonValueId, boolean z12) {
                this.f230563b = commonValueId;
                this.f230564c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CommonValueRemovalProgress)) {
                    return false;
                }
                CommonValueRemovalProgress commonValueRemovalProgress = (CommonValueRemovalProgress) obj;
                return L.f(this.f230563b, commonValueRemovalProgress.f230563b) && this.f230564c == commonValueRemovalProgress.f230564c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f230564c) + (this.f230563b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CommonValueRemovalProgress(id=");
                sb2.append(this.f230563b);
                sb2.append(", isInProgress=");
                return r.x(sb2, this.f230564c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$CommonValueRemoved;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CommonValueRemoved implements CommonValueInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CommonValueId f230565b;

            public CommonValueRemoved(@k CommonValueId commonValueId) {
                this.f230565b = commonValueId;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CommonValueRemoved) && L.f(this.f230565b, ((CommonValueRemoved) obj).f230565b);
            }

            public final int hashCode() {
                return this.f230565b.hashCode();
            }

            @k
            public final String toString() {
                return "CommonValueRemoved(id=" + this.f230565b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction$ShowCommonValueBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$CommonValueInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowCommonValueBottomMenu implements CommonValueInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CommonValueId f230566b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f230567c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final yc0.k f230568d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final CommonValueBottomMenuAction.DeleteCommonValue f230569e;

            public ShowCommonValueBottomMenu(@k CommonValueId commonValueId, boolean z12, @k yc0.k kVar, @k CommonValueBottomMenuAction.DeleteCommonValue deleteCommonValue) {
                this.f230566b = commonValueId;
                this.f230567c = z12;
                this.f230568d = kVar;
                this.f230569e = deleteCommonValue;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCommonValueBottomMenu)) {
                    return false;
                }
                ShowCommonValueBottomMenu showCommonValueBottomMenu = (ShowCommonValueBottomMenu) obj;
                return L.f(this.f230566b, showCommonValueBottomMenu.f230566b) && this.f230567c == showCommonValueBottomMenu.f230567c && L.f(this.f230568d, showCommonValueBottomMenu.f230568d) && L.f(this.f230569e, showCommonValueBottomMenu.f230569e);
            }

            public final int hashCode() {
                return this.f230569e.hashCode() + ((this.f230568d.hashCode() + r.i(this.f230566b.hashCode() * 31, 31, this.f230567c)) * 31);
            }

            @k
            public final String toString() {
                return "ShowCommonValueBottomMenu(id=" + this.f230566b + ", isDeletionInProgress=" + this.f230567c + ", editValueAction=" + this.f230568d + ", removeValueAction=" + this.f230569e + ')';
            }

            public /* synthetic */ ShowCommonValueBottomMenu(CommonValueId commonValueId, boolean z12, yc0.k kVar, CommonValueBottomMenuAction.DeleteCommonValue deleteCommonValue, int i12, C42822w c42822w) {
                this(commonValueId, (i12 & 2) != 0 ? false : z12, kVar, deleteCommonValue);
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "AppendGalleryImages", "CloseImageBottomMenu", "GroupImagesUpdate", "HideGalleryImagePlaceholder", "ImageDeletionCompleted", "ImageDeletionFailure", "ImageDeletionStarted", "ImageUpdate", "OpenGalleryEvent", "OpenImageEditor", "PickImages", "ShowGalleryImagePlaceholder", "ShowImageBottomMenu", "UpdateBannerImage", "UpdateImagePickerMode", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$AppendGalleryImages;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$CloseImageBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$GroupImagesUpdate;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$HideGalleryImagePlaceholder;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionCompleted;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionFailure;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionStarted;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$OpenGalleryEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$OpenImageEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$PickImages;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ShowGalleryImagePlaceholder;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ShowImageBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateBannerImage;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateImagePickerMode;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ImagesInternalAction extends ExtendedProfileSettingsInternalAction {

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$AppendGalleryImages;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AppendGalleryImages implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230570b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<UploadImage.ImageFromPhotoPicker> f230571c;

            public AppendGalleryImages(@k String str, @k List<UploadImage.ImageFromPhotoPicker> list) {
                this.f230570b = str;
                this.f230571c = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AppendGalleryImages)) {
                    return false;
                }
                AppendGalleryImages appendGalleryImages = (AppendGalleryImages) obj;
                return L.f(this.f230570b, appendGalleryImages.f230570b) && L.f(this.f230571c, appendGalleryImages.f230571c);
            }

            public final int hashCode() {
                return this.f230571c.hashCode() + (this.f230570b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AppendGalleryImages(fieldName=");
                sb2.append(this.f230570b);
                sb2.append(", images=");
                return H.p(sb2, this.f230571c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$CloseImageBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseImageBottomMenu implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CloseImageBottomMenu f230572b = new CloseImageBottomMenu();

            private CloseImageBottomMenu() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$GroupImagesUpdate;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GroupImagesUpdate implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ArrayList f230573b;

            public GroupImagesUpdate(@k ArrayList arrayList) {
                this.f230573b = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupImagesUpdate) && this.f230573b.equals(((GroupImagesUpdate) obj).f230573b);
            }

            public final int hashCode() {
                return this.f230573b.hashCode();
            }

            @k
            public final String toString() {
                return e.p(new StringBuilder("GroupImagesUpdate(images="), this.f230573b, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$HideGalleryImagePlaceholder;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HideGalleryImagePlaceholder implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final HideGalleryImagePlaceholder f230574b = new HideGalleryImagePlaceholder();

            private HideGalleryImagePlaceholder() {
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionCompleted;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ImageDeletionCompleted implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UploadImage f230575b;

            public ImageDeletionCompleted(@k UploadImage uploadImage) {
                this.f230575b = uploadImage;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageDeletionCompleted) && L.f(this.f230575b, ((ImageDeletionCompleted) obj).f230575b);
            }

            public final int hashCode() {
                return this.f230575b.hashCode();
            }

            @k
            public final String toString() {
                return "ImageDeletionCompleted(image=" + this.f230575b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionFailure;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ImageDeletionFailure implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UploadImage f230576b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Throwable f230577c;

            public ImageDeletionFailure(@k UploadImage uploadImage, @k Throwable th2) {
                this.f230576b = uploadImage;
                this.f230577c = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ImageDeletionFailure)) {
                    return false;
                }
                ImageDeletionFailure imageDeletionFailure = (ImageDeletionFailure) obj;
                return L.f(this.f230576b, imageDeletionFailure.f230576b) && L.f(this.f230577c, imageDeletionFailure.f230577c);
            }

            public final int hashCode() {
                return this.f230577c.hashCode() + (this.f230576b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ImageDeletionFailure(image=");
                sb2.append(this.f230576b);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f230577c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageDeletionStarted;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ImageDeletionStarted implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UploadImage f230578b;

            public ImageDeletionStarted(@k UploadImage uploadImage) {
                this.f230578b = uploadImage;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageDeletionStarted) && L.f(this.f230578b, ((ImageDeletionStarted) obj).f230578b);
            }

            public final int hashCode() {
                return this.f230578b.hashCode();
            }

            @k
            public final String toString() {
                return "ImageDeletionStarted(image=" + this.f230578b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ImageUpdate implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UploadImage.ImageFromPhotoPicker f230579b;

            public ImageUpdate(@k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
                this.f230579b = imageFromPhotoPicker;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageUpdate) && L.f(this.f230579b, ((ImageUpdate) obj).f230579b);
            }

            public final int hashCode() {
                return this.f230579b.hashCode();
            }

            @k
            public final String toString() {
                return "ImageUpdate(image=" + this.f230579b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$OpenGalleryEvent;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenGalleryEvent implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<Image> f230580b;

            /* renamed from: c, reason: collision with root package name */
            public final int f230581c;

            public OpenGalleryEvent(@k List<Image> list, int i12) {
                this.f230580b = list;
                this.f230581c = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenGalleryEvent)) {
                    return false;
                }
                OpenGalleryEvent openGalleryEvent = (OpenGalleryEvent) obj;
                return L.f(this.f230580b, openGalleryEvent.f230580b) && this.f230581c == openGalleryEvent.f230581c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f230581c) + (this.f230580b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenGalleryEvent(images=");
                sb2.append(this.f230580b);
                sb2.append(", position=");
                return r.t(sb2, this.f230581c, ')');
            }

            public /* synthetic */ OpenGalleryEvent(List list, int i12, int i13, C42822w c42822w) {
                this(list, (i13 & 2) != 0 ? 0 : i12);
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$OpenImageEditor;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenImageEditor implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230582b;

            /* renamed from: c, reason: collision with root package name */
            public final int f230583c;

            /* renamed from: d, reason: collision with root package name */
            public final int f230584d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f230585e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f230586f;

            public OpenImageEditor(int i12, int i13, @k String str, @k String str2, @k String str3) {
                this.f230582b = str;
                this.f230583c = i12;
                this.f230584d = i13;
                this.f230585e = str2;
                this.f230586f = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenImageEditor)) {
                    return false;
                }
                OpenImageEditor openImageEditor = (OpenImageEditor) obj;
                return L.f(this.f230582b, openImageEditor.f230582b) && this.f230583c == openImageEditor.f230583c && this.f230584d == openImageEditor.f230584d && L.f(this.f230585e, openImageEditor.f230585e) && L.f(this.f230586f, openImageEditor.f230586f);
            }

            public final int hashCode() {
                return this.f230586f.hashCode() + H.d(r.e(this.f230584d, r.e(this.f230583c, this.f230582b.hashCode() * 31, 31), 31), 31, this.f230585e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenImageEditor(fieldName=");
                sb2.append(this.f230582b);
                sb2.append(", minWidth=");
                sb2.append(this.f230583c);
                sb2.append(", minHeight=");
                sb2.append(this.f230584d);
                sb2.append(", warningDialogTitle=");
                sb2.append(this.f230585e);
                sb2.append(", warningDialogBody=");
                return C22026a.c(sb2, this.f230586f, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$PickImages;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PickImages implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230587b;

            /* renamed from: c, reason: collision with root package name */
            public final int f230588c;

            public PickImages(@k String str, int i12) {
                this.f230587b = str;
                this.f230588c = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PickImages)) {
                    return false;
                }
                PickImages pickImages = (PickImages) obj;
                return L.f(this.f230587b, pickImages.f230587b) && this.f230588c == pickImages.f230588c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f230588c) + (this.f230587b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PickImages(fieldName=");
                sb2.append(this.f230587b);
                sb2.append(", maxPhotoCount=");
                return r.t(sb2, this.f230588c, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ShowGalleryImagePlaceholder;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowGalleryImagePlaceholder implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GalleryImageItem f230589b;

            /* renamed from: c, reason: collision with root package name */
            public final int f230590c;

            /* renamed from: d, reason: collision with root package name */
            public final int f230591d;

            /* renamed from: e, reason: collision with root package name */
            public final int f230592e;

            /* renamed from: f, reason: collision with root package name */
            public final int f230593f;

            public ShowGalleryImagePlaceholder(@k GalleryImageItem galleryImageItem, int i12, int i13, int i14, int i15) {
                this.f230589b = galleryImageItem;
                this.f230590c = i12;
                this.f230591d = i13;
                this.f230592e = i14;
                this.f230593f = i15;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowGalleryImagePlaceholder)) {
                    return false;
                }
                ShowGalleryImagePlaceholder showGalleryImagePlaceholder = (ShowGalleryImagePlaceholder) obj;
                return L.f(this.f230589b, showGalleryImagePlaceholder.f230589b) && this.f230590c == showGalleryImagePlaceholder.f230590c && this.f230591d == showGalleryImagePlaceholder.f230591d && this.f230592e == showGalleryImagePlaceholder.f230592e && this.f230593f == showGalleryImagePlaceholder.f230593f;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f230593f) + r.e(this.f230592e, r.e(this.f230591d, r.e(this.f230590c, this.f230589b.hashCode() * 31, 31), 31), 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowGalleryImagePlaceholder(item=");
                sb2.append(this.f230589b);
                sb2.append(", x=");
                sb2.append(this.f230590c);
                sb2.append(", y=");
                sb2.append(this.f230591d);
                sb2.append(", width=");
                sb2.append(this.f230592e);
                sb2.append(", height=");
                return r.t(sb2, this.f230593f, ')');
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateBannerImage;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateBannerImage implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f230598b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UploadImage.ImageFromPhotoPicker f230599c;

            public UpdateBannerImage(@k String str, @k UploadImage.ImageFromPhotoPicker imageFromPhotoPicker) {
                this.f230598b = str;
                this.f230599c = imageFromPhotoPicker;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateBannerImage)) {
                    return false;
                }
                UpdateBannerImage updateBannerImage = (UpdateBannerImage) obj;
                return L.f(this.f230598b, updateBannerImage.f230598b) && L.f(this.f230599c, updateBannerImage.f230599c);
            }

            public final int hashCode() {
                return this.f230599c.hashCode() + (this.f230598b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "UpdateBannerImage(fieldName=" + this.f230598b + ", image=" + this.f230599c + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateImagePickerMode;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateImagePickerMode implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final yc0.r f230600b;

            public UpdateImagePickerMode(@k yc0.r rVar) {
                this.f230600b = rVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateImagePickerMode) && L.f(this.f230600b, ((UpdateImagePickerMode) obj).f230600b);
            }

            public final int hashCode() {
                return this.f230600b.hashCode();
            }

            @k
            public final String toString() {
                return "UpdateImagePickerMode(mode=" + this.f230600b + ')';
            }
        }

        /* compiled from: ExtendedProfileSettingsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction$ShowImageBottomMenu;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$ImagesInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowImageBottomMenu implements ImagesInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UploadImage f230594b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f230595c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final AttributedText f230596d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f230597e;

            public ShowImageBottomMenu(@k UploadImage uploadImage, @l String str, @l AttributedText attributedText, boolean z12) {
                this.f230594b = uploadImage;
                this.f230595c = str;
                this.f230596d = attributedText;
                this.f230597e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowImageBottomMenu)) {
                    return false;
                }
                ShowImageBottomMenu showImageBottomMenu = (ShowImageBottomMenu) obj;
                return L.f(this.f230594b, showImageBottomMenu.f230594b) && L.f(this.f230595c, showImageBottomMenu.f230595c) && L.f(this.f230596d, showImageBottomMenu.f230596d) && this.f230597e == showImageBottomMenu.f230597e;
            }

            public final int hashCode() {
                int iHashCode = this.f230594b.hashCode() * 31;
                String str = this.f230595c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AttributedText attributedText = this.f230596d;
                return Boolean.hashCode(this.f230597e) + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowImageBottomMenu(image=");
                sb2.append(this.f230594b);
                sb2.append(", title=");
                sb2.append(this.f230595c);
                sb2.append(", description=");
                sb2.append(this.f230596d);
                sb2.append(", useHardcodedTexts=");
                return r.x(sb2, this.f230597e, ')');
            }

            public /* synthetic */ ShowImageBottomMenu(UploadImage uploadImage, String str, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
                this(uploadImage, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? false : z12);
            }
        }
    }
}
