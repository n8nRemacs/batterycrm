package com.avito.android.publish.screen.step.params.mvi.entity;

import Y41.a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.slots.contact_info.d;
import com.avito.android.publish.slots.delivery_addresses.c;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import vf0.C49325f;

/* compiled from: PublishDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "InternalRouteAction", "InternalStateAction", "InternalViewAction", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PublishDetailsInternalAction extends n {

    /* compiled from: PublishDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:/\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01\u0082\u0001/23456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/InternalAction;", "AddressResubmissionBottomSheet", "CheckVideoPicker", "ContinuePublishAfterVerification", "GoToPreviousStep", "HtmlFormatClicked", "HtmlHistoryNavigationClicked", "IacMicSystemPermissionRequest", "LeaveFillingParamsScreen", "LeaveScreen", "NavigateToSelectDistrictsScreen", "NavigateToSelectMetroScreen", "NavigateToSelectPriceListScreen", "OnEditCategoryClicked", "OpenCamera", "OpenCameraRequest", "OpenConfirmDisablingDialog", "OpenDeepLink", "OpenDeleteAddressConfirmationDialog", "OpenDeliveryAddressesListDialog", "OpenDeliveryToggles", "OpenFilePicker", "OpenIacDevicesInfoDialog", "OpenIacDevicesSelectDialog", "OpenParametersBottomSheet", "OpenSleepingPlacesBedTypesDialog", "OpenVideoPicker", "OpenWebUrl", "PhoneVerificationScreen", "ReverificationInfoScreen", "ShowAppSettings", "ShowAutoEarlyAccessSelectScreen", "ShowConfirmation", "ShowConfirmationDialog", "ShowCpaTariffRequestScreen", "ShowDateDialog", "ShowDatePickerDialog", "ShowDateTimeRangeDialog", "ShowDialog", "ShowDialogDismissable", "ShowEditObjectsScreen", "ShowHelpCenterScreen", "ShowLocationPicker", "ShowPublishDetailsStepForFillParams", "ShowResidentialComplexSuggestScreen", "ShowSelectScreen", "ShowSelectorCardGroupBottomSheet", "ShowSellerProtectionDialog", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$AddressResubmissionBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$CheckVideoPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ContinuePublishAfterVerification;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$GoToPreviousStep;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$HtmlFormatClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$HtmlHistoryNavigationClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$IacMicSystemPermissionRequest;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$LeaveFillingParamsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$LeaveScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectDistrictsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectMetroScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectPriceListScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OnEditCategoryClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenCamera;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenCameraRequest;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenConfirmDisablingDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeepLink;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeleteAddressConfirmationDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeliveryAddressesListDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeliveryToggles;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenFilePicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenIacDevicesInfoDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenIacDevicesSelectDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenParametersBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenSleepingPlacesBedTypesDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenVideoPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenWebUrl;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$PhoneVerificationScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ReverificationInfoScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowAppSettings;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowAutoEarlyAccessSelectScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowConfirmation;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowConfirmationDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowCpaTariffRequestScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDateDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDatePickerDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDateTimeRangeDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDialogDismissable;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowEditObjectsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowHelpCenterScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowLocationPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowPublishDetailsStepForFillParams;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowResidentialComplexSuggestScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSelectScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSelectorCardGroupBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSellerProtectionDialog;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InternalRouteAction extends PublishDetailsInternalAction {

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$AddressResubmissionBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddressResubmissionBottomSheet implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final RealtyAddressSubmissionInfo f241355b;

            public AddressResubmissionBottomSheet(@k RealtyAddressSubmissionInfo realtyAddressSubmissionInfo) {
                this.f241355b = realtyAddressSubmissionInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddressResubmissionBottomSheet) && L.f(this.f241355b, ((AddressResubmissionBottomSheet) obj).f241355b);
            }

            public final int hashCode() {
                return this.f241355b.hashCode();
            }

            @k
            public final String toString() {
                return "AddressResubmissionBottomSheet(info=" + this.f241355b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$CheckVideoPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CheckVideoPicker implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CheckVideoPicker f241356b = new CheckVideoPicker();

            private CheckVideoPicker() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof CheckVideoPicker);
            }

            public final int hashCode() {
                return -89987370;
            }

            @k
            public final String toString() {
                return "CheckVideoPicker";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ContinuePublishAfterVerification;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ContinuePublishAfterVerification implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ContinuePublishAfterVerification f241357b = new ContinuePublishAfterVerification();

            private ContinuePublishAfterVerification() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ContinuePublishAfterVerification);
            }

            public final int hashCode() {
                return -244571484;
            }

            @k
            public final String toString() {
                return "ContinuePublishAfterVerification";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$GoToPreviousStep;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GoToPreviousStep implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final GoToPreviousStep f241358b = new GoToPreviousStep();

            private GoToPreviousStep() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof GoToPreviousStep);
            }

            public final int hashCode() {
                return 410197915;
            }

            @k
            public final String toString() {
                return "GoToPreviousStep";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$HtmlFormatClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HtmlFormatClicked implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final FormatChange f241359b;

            public HtmlFormatClicked(@k FormatChange formatChange) {
                this.f241359b = formatChange;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HtmlFormatClicked) && L.f(this.f241359b, ((HtmlFormatClicked) obj).f241359b);
            }

            public final int hashCode() {
                return this.f241359b.hashCode();
            }

            @k
            public final String toString() {
                return "HtmlFormatClicked(format=" + this.f241359b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$HtmlHistoryNavigationClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HtmlHistoryNavigationClicked implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final EditorNavigationEvent f241360b;

            public HtmlHistoryNavigationClicked(@k EditorNavigationEvent editorNavigationEvent) {
                this.f241360b = editorNavigationEvent;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HtmlHistoryNavigationClicked) && this.f241360b == ((HtmlHistoryNavigationClicked) obj).f241360b;
            }

            public final int hashCode() {
                return this.f241360b.hashCode();
            }

            @k
            public final String toString() {
                return "HtmlHistoryNavigationClicked(event=" + this.f241360b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$IacMicSystemPermissionRequest;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class IacMicSystemPermissionRequest implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final IacPermissionRequestSource f241361b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final a<G0> f241362c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final a<G0> f241363d;

            public IacMicSystemPermissionRequest(@k IacPermissionRequestSource iacPermissionRequestSource, @k a<G0> aVar, @k a<G0> aVar2) {
                this.f241361b = iacPermissionRequestSource;
                this.f241362c = aVar;
                this.f241363d = aVar2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IacMicSystemPermissionRequest)) {
                    return false;
                }
                IacMicSystemPermissionRequest iacMicSystemPermissionRequest = (IacMicSystemPermissionRequest) obj;
                return this.f241361b == iacMicSystemPermissionRequest.f241361b && L.f(this.f241362c, iacMicSystemPermissionRequest.f241362c) && L.f(this.f241363d, iacMicSystemPermissionRequest.f241363d);
            }

            public final int hashCode() {
                return this.f241363d.hashCode() + r.h(this.f241361b.hashCode() * 31, 31, this.f241362c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("IacMicSystemPermissionRequest(source=");
                sb2.append(this.f241361b);
                sb2.append(", onPermissionGranted=");
                sb2.append(this.f241362c);
                sb2.append(", onPermissionDenied=");
                return r.v(sb2, this.f241363d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$LeaveFillingParamsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LeaveFillingParamsScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final LeaveFillingParamsScreen f241364b = new LeaveFillingParamsScreen();

            private LeaveFillingParamsScreen() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof LeaveFillingParamsScreen);
            }

            public final int hashCode() {
                return 497332623;
            }

            @k
            public final String toString() {
                return "LeaveFillingParamsScreen";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$LeaveScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LeaveScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final LeaveScreen f241365b = new LeaveScreen();

            private LeaveScreen() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof LeaveScreen);
            }

            public final int hashCode() {
                return -2050833202;
            }

            @k
            public final String toString() {
                return "LeaveScreen";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectDistrictsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NavigateToSelectDistrictsScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DistrictParameter f241366b;

            public NavigateToSelectDistrictsScreen(@k DistrictParameter districtParameter) {
                this.f241366b = districtParameter;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSelectDistrictsScreen) && L.f(this.f241366b, ((NavigateToSelectDistrictsScreen) obj).f241366b);
            }

            public final int hashCode() {
                return this.f241366b.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectDistrictsScreen(parameter=" + this.f241366b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectMetroScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NavigateToSelectMetroScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final MetroParameter f241367b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f241368c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f241369d;

            public NavigateToSelectMetroScreen(@k MetroParameter metroParameter, @l Integer num, @l String str) {
                this.f241367b = metroParameter;
                this.f241368c = num;
                this.f241369d = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NavigateToSelectMetroScreen)) {
                    return false;
                }
                NavigateToSelectMetroScreen navigateToSelectMetroScreen = (NavigateToSelectMetroScreen) obj;
                return L.f(this.f241367b, navigateToSelectMetroScreen.f241367b) && L.f(this.f241368c, navigateToSelectMetroScreen.f241368c) && L.f(this.f241369d, navigateToSelectMetroScreen.f241369d);
            }

            public final int hashCode() {
                int iHashCode = this.f241367b.hashCode() * 31;
                Integer num = this.f241368c;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f241369d;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToSelectMetroScreen(parameter=");
                sb2.append(this.f241367b);
                sb2.append(", categoryId=");
                sb2.append(this.f241368c);
                sb2.append(", publishSessionId=");
                return C22026a.c(sb2, this.f241369d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$NavigateToSelectPriceListScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NavigateToSelectPriceListScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ObjectsParameter f241370b;

            public NavigateToSelectPriceListScreen(@k ObjectsParameter objectsParameter) {
                this.f241370b = objectsParameter;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSelectPriceListScreen) && L.f(this.f241370b, ((NavigateToSelectPriceListScreen) obj).f241370b);
            }

            public final int hashCode() {
                return this.f241370b.hashCode();
            }

            @k
            public final String toString() {
                return "NavigateToSelectPriceListScreen(parameter=" + this.f241370b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OnEditCategoryClicked;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnEditCategoryClicked implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final OnEditCategoryClicked f241371b = new OnEditCategoryClicked();

            private OnEditCategoryClicked() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof OnEditCategoryClicked);
            }

            public final int hashCode() {
                return 1119431307;
            }

            @k
            public final String toString() {
                return "OnEditCategoryClicked";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenCamera;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenCamera implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final OpenCamera f241372b = new OpenCamera();

            private OpenCamera() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof OpenCamera);
            }

            public final int hashCode() {
                return 1233650148;
            }

            @k
            public final String toString() {
                return "OpenCamera";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenCameraRequest;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenCameraRequest implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final OpenCameraRequest f241373b = new OpenCameraRequest();

            private OpenCameraRequest() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof OpenCameraRequest);
            }

            public final int hashCode() {
                return 2008571915;
            }

            @k
            public final String toString() {
                return "OpenCameraRequest";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenConfirmDisablingDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenConfirmDisablingDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final a<G0> f241374b;

            public OpenConfirmDisablingDialog(@k a<G0> aVar) {
                this.f241374b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenConfirmDisablingDialog) && L.f(this.f241374b, ((OpenConfirmDisablingDialog) obj).f241374b);
            }

            public final int hashCode() {
                return this.f241374b.hashCode();
            }

            @k
            public final String toString() {
                return r.v(new StringBuilder("OpenConfirmDisablingDialog(onConfirmDisable="), this.f241374b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeleteAddressConfirmationDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenDeleteAddressConfirmationDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AddressParameter.SellerAddresses.DeleteAddressSheet f241377b;

            public OpenDeleteAddressConfirmationDialog(@k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet) {
                this.f241377b = deleteAddressSheet;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenDeleteAddressConfirmationDialog) && L.f(this.f241377b, ((OpenDeleteAddressConfirmationDialog) obj).f241377b);
            }

            public final int hashCode() {
                return this.f241377b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenDeleteAddressConfirmationDialog(data=" + this.f241377b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeliveryAddressesListDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenDeliveryAddressesListDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c f241378b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final com.avito.android.publish.slots.delivery_addresses.item.c f241379c;

            public OpenDeliveryAddressesListDialog(@k c cVar, @k com.avito.android.publish.slots.delivery_addresses.item.c cVar2) {
                this.f241378b = cVar;
                this.f241379c = cVar2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenDeliveryAddressesListDialog)) {
                    return false;
                }
                OpenDeliveryAddressesListDialog openDeliveryAddressesListDialog = (OpenDeliveryAddressesListDialog) obj;
                return L.f(this.f241378b, openDeliveryAddressesListDialog.f241378b) && L.f(this.f241379c, openDeliveryAddressesListDialog.f241379c);
            }

            public final int hashCode() {
                return this.f241379c.hashCode() + (this.f241378b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "OpenDeliveryAddressesListDialog(presenter=" + this.f241378b + ", data=" + this.f241379c + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeliveryToggles;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenDeliveryToggles implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final OpenDeliveryToggles f241380b = new OpenDeliveryToggles();

            private OpenDeliveryToggles() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof OpenDeliveryToggles);
            }

            public final int hashCode() {
                return 1062828332;
            }

            @k
            public final String toString() {
                return "OpenDeliveryToggles";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenFilePicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenFilePicker implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String[] f241381b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241382c;

            public OpenFilePicker(@k String[] strArr, boolean z12) {
                this.f241381b = strArr;
                this.f241382c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenFilePicker)) {
                    return false;
                }
                OpenFilePicker openFilePicker = (OpenFilePicker) obj;
                return L.f(this.f241381b, openFilePicker.f241381b) && this.f241382c == openFilePicker.f241382c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241382c) + (Arrays.hashCode(this.f241381b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenFilePicker(mimeTypes=");
                sb2.append(Arrays.toString(this.f241381b));
                sb2.append(", isMultiUploadEnabled=");
                return r.x(sb2, this.f241382c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenIacDevicesInfoDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenIacDevicesInfoDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final OpenIacDevicesInfoDialog f241383b = new OpenIacDevicesInfoDialog();

            private OpenIacDevicesInfoDialog() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof OpenIacDevicesInfoDialog);
            }

            public final int hashCode() {
                return 461380039;
            }

            @k
            public final String toString() {
                return "OpenIacDevicesInfoDialog";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenIacDevicesSelectDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenIacDevicesSelectDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<IacDevice> f241384b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241385c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final N f241386d;

            /* JADX WARN: Multi-variable type inference failed */
            public OpenIacDevicesSelectDialog(@k List<IacDevice> list, boolean z12, @k Y41.l<? super List<IacDevice>, G0> lVar) {
                this.f241384b = list;
                this.f241385c = z12;
                this.f241386d = (N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenIacDevicesSelectDialog)) {
                    return false;
                }
                OpenIacDevicesSelectDialog openIacDevicesSelectDialog = (OpenIacDevicesSelectDialog) obj;
                return L.f(this.f241384b, openIacDevicesSelectDialog.f241384b) && this.f241385c == openIacDevicesSelectDialog.f241385c && this.f241386d.equals(openIacDevicesSelectDialog.f241386d);
            }

            public final int hashCode() {
                return this.f241386d.hashCode() + r.i(this.f241384b.hashCode() * 31, 31, this.f241385c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenIacDevicesSelectDialog(devices=");
                sb2.append(this.f241384b);
                sb2.append(", isPro=");
                sb2.append(this.f241385c);
                sb2.append(", onDevicesChosen=");
                return C22026a.d(sb2, this.f241386d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenParametersBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenParametersBottomSheet implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f241387b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<com.avito.conveyor_item.a> f241388c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final h f241389d;

            /* JADX WARN: Multi-variable type inference failed */
            public OpenParametersBottomSheet(@l String str, @k List<? extends com.avito.conveyor_item.a> list, @k h hVar) {
                this.f241387b = str;
                this.f241388c = list;
                this.f241389d = hVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenParametersBottomSheet)) {
                    return false;
                }
                OpenParametersBottomSheet openParametersBottomSheet = (OpenParametersBottomSheet) obj;
                return L.f(this.f241387b, openParametersBottomSheet.f241387b) && L.f(this.f241388c, openParametersBottomSheet.f241388c) && L.f(this.f241389d, openParametersBottomSheet.f241389d);
            }

            public final int hashCode() {
                String str = this.f241387b;
                return this.f241389d.hashCode() + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f241388c);
            }

            @k
            public final String toString() {
                return "OpenParametersBottomSheet(title=" + this.f241387b + ", parameters=" + this.f241388c + ", consumer=" + this.f241389d + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenSleepingPlacesBedTypesDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenSleepingPlacesBedTypesDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C49325f f241390b;

            public OpenSleepingPlacesBedTypesDialog(@k C49325f c49325f) {
                this.f241390b = c49325f;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSleepingPlacesBedTypesDialog) && L.f(this.f241390b, ((OpenSleepingPlacesBedTypesDialog) obj).f241390b);
            }

            public final int hashCode() {
                return this.f241390b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenSleepingPlacesBedTypesDialog(data=" + this.f241390b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenVideoPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenVideoPicker implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.J f241391b;

            public OpenVideoPicker(@k ParameterElement.J j12) {
                this.f241391b = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenVideoPicker) && L.f(this.f241391b, ((OpenVideoPicker) obj).f241391b);
            }

            public final int hashCode() {
                return this.f241391b.hashCode();
            }

            @k
            public final String toString() {
                return "OpenVideoPicker(videoUploadItem=" + this.f241391b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenWebUrl;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenWebUrl implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241392b;

            public OpenWebUrl(@k String str) {
                this.f241392b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenWebUrl) && L.f(this.f241392b, ((OpenWebUrl) obj).f241392b);
            }

            public final int hashCode() {
                return this.f241392b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("OpenWebUrl(url="), this.f241392b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$PhoneVerificationScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PhoneVerificationScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final d.b f241393b;

            public PhoneVerificationScreen(@k d.b bVar) {
                this.f241393b = bVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhoneVerificationScreen) && L.f(this.f241393b, ((PhoneVerificationScreen) obj).f241393b);
            }

            public final int hashCode() {
                return this.f241393b.hashCode();
            }

            @k
            public final String toString() {
                return "PhoneVerificationScreen(phoneVerificationData=" + this.f241393b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ReverificationInfoScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReverificationInfoScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241394b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f241395c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f241396d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f241397e;

            public ReverificationInfoScreen(@k String str, @k String str2, @l String str3, boolean z12) {
                this.f241394b = str;
                this.f241395c = str2;
                this.f241396d = str3;
                this.f241397e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReverificationInfoScreen)) {
                    return false;
                }
                ReverificationInfoScreen reverificationInfoScreen = (ReverificationInfoScreen) obj;
                return L.f(this.f241394b, reverificationInfoScreen.f241394b) && L.f(this.f241395c, reverificationInfoScreen.f241395c) && L.f(this.f241396d, reverificationInfoScreen.f241396d) && this.f241397e == reverificationInfoScreen.f241397e;
            }

            public final int hashCode() {
                int iD2 = H.d(this.f241394b.hashCode() * 31, 31, this.f241395c);
                String str = this.f241396d;
                return Boolean.hashCode(this.f241397e) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ReverificationInfoScreen(phone=");
                sb2.append(this.f241394b);
                sb2.append(", phoneFormatted=");
                sb2.append(this.f241395c);
                sb2.append(", userEmail=");
                sb2.append(this.f241396d);
                sb2.append(", isAllow=");
                return r.x(sb2, this.f241397e, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowAppSettings;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowAppSettings implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowAppSettings f241398b = new ShowAppSettings();

            private ShowAppSettings() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowAppSettings);
            }

            public final int hashCode() {
                return -1593215118;
            }

            @k
            public final String toString() {
                return "ShowAppSettings";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowAutoEarlyAccessSelectScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowAutoEarlyAccessSelectScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AutoEarlyAccessSelectParams f241399b;

            static {
                Parcelable.Creator<AutoEarlyAccessSelectParams> creator = AutoEarlyAccessSelectParams.CREATOR;
            }

            public ShowAutoEarlyAccessSelectScreen(@k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
                this.f241399b = autoEarlyAccessSelectParams;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAutoEarlyAccessSelectScreen) && L.f(this.f241399b, ((ShowAutoEarlyAccessSelectScreen) obj).f241399b);
            }

            public final int hashCode() {
                return this.f241399b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowAutoEarlyAccessSelectScreen(openParams=" + this.f241399b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowConfirmation;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowConfirmation implements InternalRouteAction {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowConfirmation)) {
                    return false;
                }
                ((ShowConfirmation) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "ShowConfirmation(confirmation=null, onConfirmed=null)";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowConfirmationDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowConfirmationDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.NavigationButtonAction f241400b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final CategoryPublishStep.Params.Confirmation f241401c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f241402d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final List<BeduinAction> f241403e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final CategoryPublishStep.Params.ParamsToFill f241404f;

            public ShowConfirmationDialog() {
                throw null;
            }

            public ShowConfirmationDialog(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, CategoryPublishStep.Params.Confirmation confirmation, DeepLink deepLink, List list, CategoryPublishStep.Params.ParamsToFill paramsToFill, int i12, C42822w c42822w) {
                navigationButtonAction = (i12 & 1) != 0 ? null : navigationButtonAction;
                deepLink = (i12 & 4) != 0 ? null : deepLink;
                list = (i12 & 8) != 0 ? null : list;
                paramsToFill = (i12 & 16) != 0 ? null : paramsToFill;
                this.f241400b = navigationButtonAction;
                this.f241401c = confirmation;
                this.f241402d = deepLink;
                this.f241403e = list;
                this.f241404f = paramsToFill;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowConfirmationDialog)) {
                    return false;
                }
                ShowConfirmationDialog showConfirmationDialog = (ShowConfirmationDialog) obj;
                return this.f241400b == showConfirmationDialog.f241400b && L.f(this.f241401c, showConfirmationDialog.f241401c) && L.f(this.f241402d, showConfirmationDialog.f241402d) && L.f(this.f241403e, showConfirmationDialog.f241403e) && L.f(this.f241404f, showConfirmationDialog.f241404f);
            }

            public final int hashCode() {
                CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f241400b;
                int iHashCode = (this.f241401c.hashCode() + ((navigationButtonAction == null ? 0 : navigationButtonAction.hashCode()) * 31)) * 31;
                DeepLink deepLink = this.f241402d;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                List<BeduinAction> list = this.f241403e;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                CategoryPublishStep.Params.ParamsToFill paramsToFill = this.f241404f;
                return iHashCode3 + (paramsToFill != null ? paramsToFill.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "ShowConfirmationDialog(action=" + this.f241400b + ", confirmation=" + this.f241401c + ", deepLink=" + this.f241402d + ", beduinActions=" + this.f241403e + ", paramsToFill=" + this.f241404f + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowCpaTariffRequestScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowCpaTariffRequestScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f241405b;

            public ShowCpaTariffRequestScreen(int i12) {
                this.f241405b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowCpaTariffRequestScreen) && this.f241405b == ((ShowCpaTariffRequestScreen) obj).f241405b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f241405b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ShowCpaTariffRequestScreen(categoryId="), this.f241405b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDateDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDateDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f241406b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f241407c;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowDateDialog(@k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f241406b = c29377e;
                this.f241407c = lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDateDialog)) {
                    return false;
                }
                ShowDateDialog showDateDialog = (ShowDateDialog) obj;
                return L.f(this.f241406b, showDateDialog.f241406b) && L.f(this.f241407c, showDateDialog.f241407c);
            }

            public final int hashCode() {
                return this.f241407c.hashCode() + (this.f241406b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateDialog(item=");
                sb2.append(this.f241406b);
                sb2.append(", onApplyDateCallback=");
                return H.l(sb2, this.f241407c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDatePickerDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDatePickerDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c.a f241408b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f241409c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final N f241410d;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowDatePickerDialog(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f241408b = aVar;
                this.f241409c = c29377e;
                this.f241410d = (N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDatePickerDialog)) {
                    return false;
                }
                ShowDatePickerDialog showDatePickerDialog = (ShowDatePickerDialog) obj;
                return L.f(this.f241408b, showDatePickerDialog.f241408b) && this.f241409c.equals(showDatePickerDialog.f241409c) && this.f241410d.equals(showDatePickerDialog.f241410d);
            }

            public final int hashCode() {
                return this.f241410d.hashCode() + ((this.f241409c.hashCode() + (this.f241408b.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDatePickerDialog(dateSelectInfo=");
                sb2.append(this.f241408b);
                sb2.append(", dateTime=");
                sb2.append(this.f241409c);
                sb2.append(", callback=");
                return C22026a.d(sb2, this.f241410d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDateTimeRangeDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDateTimeRangeDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c.a f241411b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ParameterElement.C29377e f241412c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Y41.l<Long, G0> f241413d;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowDateTimeRangeDialog(@k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
                this.f241411b = aVar;
                this.f241412c = c29377e;
                this.f241413d = lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDateTimeRangeDialog)) {
                    return false;
                }
                ShowDateTimeRangeDialog showDateTimeRangeDialog = (ShowDateTimeRangeDialog) obj;
                return L.f(this.f241411b, showDateTimeRangeDialog.f241411b) && L.f(this.f241412c, showDateTimeRangeDialog.f241412c) && L.f(this.f241413d, showDateTimeRangeDialog.f241413d);
            }

            public final int hashCode() {
                return this.f241413d.hashCode() + ((this.f241412c.hashCode() + (this.f241411b.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDateTimeRangeDialog(dateSelectInfo=");
                sb2.append(this.f241411b);
                sb2.append(", dateTime=");
                sb2.append(this.f241412c);
                sb2.append(", callback=");
                return H.l(sb2, this.f241413d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f241414b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f241415c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f241416d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f241417e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final N f241418f;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowDialog(@l String str, @k String str2, @k String str3, @k String str4, @k a<G0> aVar) {
                this.f241414b = str;
                this.f241415c = str2;
                this.f241416d = str3;
                this.f241417e = str4;
                this.f241418f = (N) aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDialog)) {
                    return false;
                }
                ShowDialog showDialog = (ShowDialog) obj;
                return L.f(this.f241414b, showDialog.f241414b) && L.f(this.f241415c, showDialog.f241415c) && L.f(this.f241416d, showDialog.f241416d) && L.f(this.f241417e, showDialog.f241417e) && this.f241418f.equals(showDialog.f241418f);
            }

            public final int hashCode() {
                String str = this.f241414b;
                return this.f241418f.hashCode() + H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f241415c), 31, this.f241416d), 31, this.f241417e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialog(title=");
                sb2.append(this.f241414b);
                sb2.append(", message=");
                sb2.append(this.f241415c);
                sb2.append(", positiveOption=");
                sb2.append(this.f241416d);
                sb2.append(", negativeOption=");
                sb2.append(this.f241417e);
                sb2.append(", onPositiveClicked=");
                return C22026a.d(sb2, this.f241418f, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowDialogDismissable;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowDialogDismissable implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241419b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f241420c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f241421d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final a<G0> f241422e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final a<G0> f241423f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final a<G0> f241424g;

            public ShowDialogDismissable(@k String str, @k String str2, @k String str3, @k a<G0> aVar, @k a<G0> aVar2, @k a<G0> aVar3) {
                this.f241419b = str;
                this.f241420c = str2;
                this.f241421d = str3;
                this.f241422e = aVar;
                this.f241423f = aVar2;
                this.f241424g = aVar3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDialogDismissable)) {
                    return false;
                }
                ShowDialogDismissable showDialogDismissable = (ShowDialogDismissable) obj;
                return L.f(this.f241419b, showDialogDismissable.f241419b) && L.f(this.f241420c, showDialogDismissable.f241420c) && L.f(this.f241421d, showDialogDismissable.f241421d) && L.f(this.f241422e, showDialogDismissable.f241422e) && L.f(this.f241423f, showDialogDismissable.f241423f) && L.f(this.f241424g, showDialogDismissable.f241424g);
            }

            public final int hashCode() {
                return this.f241424g.hashCode() + r.h(r.h(H.d(H.d(this.f241419b.hashCode() * 31, 31, this.f241420c), 31, this.f241421d), 31, this.f241422e), 31, this.f241423f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowDialogDismissable(title=");
                sb2.append(this.f241419b);
                sb2.append(", message=");
                sb2.append(this.f241420c);
                sb2.append(", button=");
                sb2.append(this.f241421d);
                sb2.append(", onShow=");
                sb2.append(this.f241422e);
                sb2.append(", onAccept=");
                sb2.append(this.f241423f);
                sb2.append(", onDismiss=");
                return r.v(sb2, this.f241424g, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowEditObjectsScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowEditObjectsScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ObjectsParameter f241425b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f241426c;

            public ShowEditObjectsScreen(@k ObjectsParameter objectsParameter, @l Integer num) {
                this.f241425b = objectsParameter;
                this.f241426c = num;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowEditObjectsScreen)) {
                    return false;
                }
                ShowEditObjectsScreen showEditObjectsScreen = (ShowEditObjectsScreen) obj;
                return L.f(this.f241425b, showEditObjectsScreen.f241425b) && L.f(this.f241426c, showEditObjectsScreen.f241426c);
            }

            public final int hashCode() {
                int iHashCode = this.f241425b.hashCode() * 31;
                Integer num = this.f241426c;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowEditObjectsScreen(parameter=");
                sb2.append(this.f241425b);
                sb2.append(", selectedObject=");
                return s.j(sb2, this.f241426c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowHelpCenterScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowHelpCenterScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241427b;

            public ShowHelpCenterScreen(@k String str) {
                this.f241427b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowHelpCenterScreen) && L.f(this.f241427b, ((ShowHelpCenterScreen) obj).f241427b);
            }

            public final int hashCode() {
                return this.f241427b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowHelpCenterScreen(url="), this.f241427b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowLocationPicker;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowLocationPicker implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AddressParameter f241428b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241429c;

            public ShowLocationPicker(@k AddressParameter addressParameter, boolean z12) {
                this.f241428b = addressParameter;
                this.f241429c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowLocationPicker)) {
                    return false;
                }
                ShowLocationPicker showLocationPicker = (ShowLocationPicker) obj;
                return L.f(this.f241428b, showLocationPicker.f241428b) && this.f241429c == showLocationPicker.f241429c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241429c) + (this.f241428b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowLocationPicker(address=");
                sb2.append(this.f241428b);
                sb2.append(", withRedesignTheme=");
                return r.x(sb2, this.f241429c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowPublishDetailsStepForFillParams;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowPublishDetailsStepForFillParams implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241430b;

            public ShowPublishDetailsStepForFillParams(@k String str) {
                this.f241430b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowPublishDetailsStepForFillParams) && L.f(this.f241430b, ((ShowPublishDetailsStepForFillParams) obj).f241430b);
            }

            public final int hashCode() {
                return this.f241430b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowPublishDetailsStepForFillParams(slotWithStepConfigId="), this.f241430b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowResidentialComplexSuggestScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowResidentialComplexSuggestScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowResidentialComplexSuggestScreen f241431b = new ShowResidentialComplexSuggestScreen();

            private ShowResidentialComplexSuggestScreen() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowResidentialComplexSuggestScreen);
            }

            public final int hashCode() {
                return 2064277106;
            }

            @k
            public final String toString() {
                return "ShowResidentialComplexSuggestScreen";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSelectScreen;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSelectScreen implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Arguments f241432b;

            public ShowSelectScreen(@k Arguments arguments) {
                this.f241432b = arguments;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSelectScreen) && L.f(this.f241432b, ((ShowSelectScreen) obj).f241432b);
            }

            public final int hashCode() {
                return this.f241432b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.p(new StringBuilder("ShowSelectScreen(arguments="), this.f241432b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSelectorCardGroupBottomSheet;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSelectorCardGroupBottomSheet implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.blueprints.selector_card_group_bottom_sheet.k f241433b;

            public ShowSelectorCardGroupBottomSheet(@k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
                this.f241433b = kVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSelectorCardGroupBottomSheet) && L.f(this.f241433b, ((ShowSelectorCardGroupBottomSheet) obj).f241433b);
            }

            public final int hashCode() {
                return this.f241433b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowSelectorCardGroupBottomSheet(params=" + this.f241433b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$ShowSellerProtectionDialog;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSellerProtectionDialog implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowSellerProtectionDialog f241434b = new ShowSellerProtectionDialog();

            private ShowSellerProtectionDialog() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowSellerProtectionDialog);
            }

            public final int hashCode() {
                return -1454821294;
            }

            @k
            public final String toString() {
                return "ShowSellerProtectionDialog";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction$OpenDeepLink;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalRouteAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenDeepLink implements InternalRouteAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f241375b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Bundle f241376c;

            public OpenDeepLink(@k DeepLink deepLink, @l Bundle bundle) {
                this.f241375b = deepLink;
                this.f241376c = bundle;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenDeepLink)) {
                    return false;
                }
                OpenDeepLink openDeepLink = (OpenDeepLink) obj;
                return L.f(this.f241375b, openDeepLink.f241375b) && L.f(this.f241376c, openDeepLink.f241376c);
            }

            public final int hashCode() {
                int iHashCode = this.f241375b.hashCode() * 31;
                Bundle bundle = this.f241376c;
                return iHashCode + (bundle == null ? 0 : bundle.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
                sb2.append(this.f241375b);
                sb2.append(", args=");
                return H.m(sb2, this.f241376c, ')');
            }

            public /* synthetic */ OpenDeepLink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
                this(deepLink, (i12 & 2) != 0 ? null : bundle);
            }
        }
    }

    /* compiled from: PublishDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/InternalAction;", "ButtonsState", "ErrorAutoDescription", "HideLoading", "ItemsUpdate", "SetupDownScrollListener", "ShowContent", "ShowLoading", "ShowProgress", "ShowRetry", "UpdateEditorNavigationButtonsState", "UpdateHtmlEditorToolbarFlags", "UpdateHtmlEditorToolbarVisible", "UpdateToolbar", "UpdateValidationProgress", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ButtonsState;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ErrorAutoDescription;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$HideLoading;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ItemsUpdate;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$SetupDownScrollListener;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowContent;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowLoading;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowProgress;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowRetry;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateEditorNavigationButtonsState;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateHtmlEditorToolbarFlags;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateHtmlEditorToolbarVisible;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateToolbar;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateValidationProgress;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InternalStateAction extends PublishDetailsInternalAction {

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ButtonsState;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ButtonsState implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f241435b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241436c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f241437d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f241438e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final com.avito.android.publish.slots.card_select.item.k f241439f;

            public ButtonsState() {
                this(null, false, false, false, null, 31, null);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonsState)) {
                    return false;
                }
                ButtonsState buttonsState = (ButtonsState) obj;
                return L.f(this.f241435b, buttonsState.f241435b) && this.f241436c == buttonsState.f241436c && this.f241437d == buttonsState.f241437d && this.f241438e == buttonsState.f241438e && L.f(this.f241439f, buttonsState.f241439f);
            }

            public final int hashCode() {
                String str = this.f241435b;
                int i12 = r.i(r.i(r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f241436c), 31, this.f241437d), 31, this.f241438e);
                com.avito.android.publish.slots.card_select.item.k kVar = this.f241439f;
                return i12 + (kVar != null ? kVar.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "ButtonsState(buttonTitle=" + this.f241435b + ", isEnabled=" + this.f241436c + ", isVisible=" + this.f241437d + ", isSecondary=" + this.f241438e + ", conditionalAction=" + this.f241439f + ')';
            }

            public ButtonsState(@l String str, boolean z12, boolean z13, boolean z14, @l com.avito.android.publish.slots.card_select.item.k kVar) {
                this.f241435b = str;
                this.f241436c = z12;
                this.f241437d = z13;
                this.f241438e = z14;
                this.f241439f = kVar;
            }

            public /* synthetic */ ButtonsState(String str, boolean z12, boolean z13, boolean z14, com.avito.android.publish.slots.card_select.item.k kVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? null : kVar);
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ErrorAutoDescription;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ErrorAutoDescription implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241440b;

            public ErrorAutoDescription(@k String str) {
                this.f241440b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorAutoDescription) && L.f(this.f241440b, ((ErrorAutoDescription) obj).f241440b);
            }

            public final int hashCode() {
                return this.f241440b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ErrorAutoDescription(error="), this.f241440b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$HideLoading;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HideLoading implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final HideLoading f241441b = new HideLoading();

            private HideLoading() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof HideLoading);
            }

            public final int hashCode() {
                return -835482451;
            }

            @k
            public final String toString() {
                return "HideLoading";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ItemsUpdate;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ItemsUpdate implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UV0.a<? extends com.avito.conveyor_item.a> f241442b;

            public ItemsUpdate(@k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
                this.f241442b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ItemsUpdate) && L.f(this.f241442b, ((ItemsUpdate) obj).f241442b);
            }

            public final int hashCode() {
                return this.f241442b.hashCode();
            }

            @k
            public final String toString() {
                return "ItemsUpdate(items=" + this.f241442b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$SetupDownScrollListener;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetupDownScrollListener implements InternalStateAction {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupDownScrollListener)) {
                    return false;
                }
                ((SetupDownScrollListener) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            @k
            public final String toString() {
                return "SetupDownScrollListener(enable=true)";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowContent;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowContent implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowContent f241443b = new ShowContent();

            private ShowContent() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowContent);
            }

            public final int hashCode() {
                return 287967695;
            }

            @k
            public final String toString() {
                return "ShowContent";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowLoading;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowLoading implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241444b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f241445c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final N f241446d;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowLoading(@k Y41.l lVar, @k String str, @k String str2) {
                this.f241444b = str;
                this.f241445c = str2;
                this.f241446d = (N) lVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowLoading)) {
                    return false;
                }
                ShowLoading showLoading = (ShowLoading) obj;
                return L.f(this.f241444b, showLoading.f241444b) && L.f(this.f241445c, showLoading.f241445c) && this.f241446d.equals(showLoading.f241446d);
            }

            public final int hashCode() {
                return this.f241446d.hashCode() + H.d(this.f241444b.hashCode() * 31, 31, this.f241445c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowLoading(interruptTitle=");
                sb2.append(this.f241444b);
                sb2.append(", loadingMessage=");
                sb2.append(this.f241445c);
                sb2.append(", interruptCallback=");
                return C22026a.d(sb2, this.f241446d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowProgress;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowProgress implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowProgress f241447b = new ShowProgress();

            private ShowProgress() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowProgress);
            }

            public final int hashCode() {
                return -96692329;
            }

            @k
            public final String toString() {
                return "ShowProgress";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$ShowRetry;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowRetry implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ShowRetry f241448b = new ShowRetry();

            private ShowRetry() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ShowRetry);
            }

            public final int hashCode() {
                return 992630142;
            }

            @k
            public final String toString() {
                return "ShowRetry";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateEditorNavigationButtonsState;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateEditorNavigationButtonsState implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f241449b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241450c;

            public UpdateEditorNavigationButtonsState(boolean z12, boolean z13) {
                this.f241449b = z12;
                this.f241450c = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateEditorNavigationButtonsState)) {
                    return false;
                }
                UpdateEditorNavigationButtonsState updateEditorNavigationButtonsState = (UpdateEditorNavigationButtonsState) obj;
                return this.f241449b == updateEditorNavigationButtonsState.f241449b && this.f241450c == updateEditorNavigationButtonsState.f241450c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241450c) + (Boolean.hashCode(this.f241449b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UpdateEditorNavigationButtonsState(undoEnabled=");
                sb2.append(this.f241449b);
                sb2.append(", redoEnabled=");
                return r.x(sb2, this.f241450c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateHtmlEditorToolbarFlags;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateHtmlEditorToolbarFlags implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f241451b;

            public UpdateHtmlEditorToolbarFlags(int i12) {
                this.f241451b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateHtmlEditorToolbarFlags) && this.f241451b == ((UpdateHtmlEditorToolbarFlags) obj).f241451b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f241451b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("UpdateHtmlEditorToolbarFlags(flags="), this.f241451b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateHtmlEditorToolbarVisible;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateHtmlEditorToolbarVisible implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f241452b;

            public UpdateHtmlEditorToolbarVisible(boolean z12) {
                this.f241452b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateHtmlEditorToolbarVisible) && this.f241452b == ((UpdateHtmlEditorToolbarVisible) obj).f241452b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241452b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("UpdateHtmlEditorToolbarVisible(isShow="), this.f241452b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateToolbar;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateToolbar implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CategoryPublishStep f241453b;

            public UpdateToolbar(@l CategoryPublishStep categoryPublishStep) {
                this.f241453b = categoryPublishStep;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateToolbar) && L.f(this.f241453b, ((UpdateToolbar) obj).f241453b);
            }

            public final int hashCode() {
                CategoryPublishStep categoryPublishStep = this.f241453b;
                if (categoryPublishStep == null) {
                    return 0;
                }
                return categoryPublishStep.hashCode();
            }

            @k
            public final String toString() {
                return "UpdateToolbar(currentStep=" + this.f241453b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction$UpdateValidationProgress;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalStateAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateValidationProgress implements InternalStateAction {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f241454b;

            public UpdateValidationProgress(boolean z12) {
                this.f241454b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateValidationProgress) && this.f241454b == ((UpdateValidationProgress) obj).f241454b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241454b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("UpdateValidationProgress(isShow="), this.f241454b, ')');
            }
        }
    }

    /* compiled from: PublishDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00060\u0001j\u0002`\u0002:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/InternalAction;", "HideKeyboard", "ScrollToAccordionContent", "ScrollToItem", "ShowActionError", "ShowAddressActionMessageAlert", "ShowAppBarOnboarding", "ShowConfettiAnimation", "ShowErrorAlert", "ShowErrorWithAction", "ShowSimpleMessageAlert", "ShowToastBarError", "ShowTooltipForItem", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$HideKeyboard;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ScrollToAccordionContent;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ScrollToItem;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowActionError;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowAddressActionMessageAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowAppBarOnboarding;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowConfettiAnimation;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowErrorAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowErrorWithAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowSimpleMessageAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowToastBarError;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowTooltipForItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InternalViewAction extends PublishDetailsInternalAction {

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$HideKeyboard;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HideKeyboard implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final HideKeyboard f241455b = new HideKeyboard();

            private HideKeyboard() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof HideKeyboard);
            }

            public final int hashCode() {
                return -1218381386;
            }

            @k
            public final String toString() {
                return "HideKeyboard";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ScrollToAccordionContent;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ScrollToAccordionContent implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f241456b;

            public ScrollToAccordionContent(int i12) {
                this.f241456b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScrollToAccordionContent) && this.f241456b == ((ScrollToAccordionContent) obj).f241456b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f241456b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ScrollToAccordionContent(itemPosition="), this.f241456b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ScrollToItem;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ScrollToItem implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f241457b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f241458c;

            public ScrollToItem(int i12, boolean z12) {
                this.f241457b = i12;
                this.f241458c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScrollToItem)) {
                    return false;
                }
                ScrollToItem scrollToItem = (ScrollToItem) obj;
                return this.f241457b == scrollToItem.f241457b && this.f241458c == scrollToItem.f241458c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f241458c) + (Integer.hashCode(this.f241457b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScrollToItem(itemPosition=");
                sb2.append(this.f241457b);
                sb2.append(", waitForRelayout=");
                return r.x(sb2, this.f241458c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowAddressActionMessageAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowAddressActionMessageAlert implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241462b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f241463c;

            public ShowAddressActionMessageAlert(@k String str, @k String str2) {
                this.f241462b = str;
                this.f241463c = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowAddressActionMessageAlert)) {
                    return false;
                }
                ShowAddressActionMessageAlert showAddressActionMessageAlert = (ShowAddressActionMessageAlert) obj;
                return L.f(this.f241462b, showAddressActionMessageAlert.f241462b) && L.f(this.f241463c, showAddressActionMessageAlert.f241463c);
            }

            public final int hashCode() {
                return this.f241463c.hashCode() + (this.f241462b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowAddressActionMessageAlert(address=");
                sb2.append(this.f241462b);
                sb2.append(", action=");
                return C22026a.c(sb2, this.f241463c, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowAppBarOnboarding;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowAppBarOnboarding implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ru.avito.component.toolbar.d f241464b;

            public ShowAppBarOnboarding(@k ru.avito.component.toolbar.d dVar) {
                this.f241464b = dVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAppBarOnboarding) && L.f(this.f241464b, ((ShowAppBarOnboarding) obj).f241464b);
            }

            public final int hashCode() {
                return this.f241464b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowAppBarOnboarding(data=" + this.f241464b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowConfettiAnimation;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowConfettiAnimation implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Confetti f241465b;

            public ShowConfettiAnimation(@k Confetti confetti) {
                this.f241465b = confetti;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowConfettiAnimation) && L.f(this.f241465b, ((ShowConfettiAnimation) obj).f241465b);
            }

            public final int hashCode() {
                return this.f241465b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowConfettiAnimation(confetti=" + this.f241465b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowErrorAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowErrorAlert implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241466b;

            public ShowErrorAlert(@k String str) {
                this.f241466b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorAlert) && L.f(this.f241466b, ((ShowErrorAlert) obj).f241466b);
            }

            public final int hashCode() {
                return this.f241466b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowErrorAlert(message="), this.f241466b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowErrorWithAction;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowErrorWithAction implements InternalViewAction {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowErrorWithAction)) {
                    return false;
                }
                ((ShowErrorWithAction) obj).getClass();
                return L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "ShowErrorWithAction(message=null, action=null)";
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowSimpleMessageAlert;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSimpleMessageAlert implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f241467b;

            public ShowSimpleMessageAlert(@k String str) {
                this.f241467b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSimpleMessageAlert) && L.f(this.f241467b, ((ShowSimpleMessageAlert) obj).f241467b);
            }

            public final int hashCode() {
                return this.f241467b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowSimpleMessageAlert(text="), this.f241467b, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowToastBarError;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowToastBarError implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ToastBarState f241468b;

            public ShowToastBarError(@k ToastBarState toastBarState) {
                this.f241468b = toastBarState;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowToastBarError) && L.f(this.f241468b, ((ShowToastBarError) obj).f241468b);
            }

            public final int hashCode() {
                return this.f241468b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowToastBarError(state=" + this.f241468b + ')';
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowTooltipForItem;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowTooltipForItem implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            public final int f241469b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final TooltipOptions f241470c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f241471d;

            public ShowTooltipForItem(int i12, @l TooltipOptions tooltipOptions, @l DeepLink deepLink) {
                this.f241469b = i12;
                this.f241470c = tooltipOptions;
                this.f241471d = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowTooltipForItem)) {
                    return false;
                }
                ShowTooltipForItem showTooltipForItem = (ShowTooltipForItem) obj;
                return this.f241469b == showTooltipForItem.f241469b && L.f(this.f241470c, showTooltipForItem.f241470c) && L.f(this.f241471d, showTooltipForItem.f241471d);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f241469b) * 31;
                TooltipOptions tooltipOptions = this.f241470c;
                int iHashCode2 = (iHashCode + (tooltipOptions == null ? 0 : tooltipOptions.hashCode())) * 31;
                DeepLink deepLink = this.f241471d;
                return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowTooltipForItem(position=");
                sb2.append(this.f241469b);
                sb2.append(", options=");
                sb2.append(this.f241470c);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f241471d, ')');
            }
        }

        /* compiled from: PublishDetailsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction$ShowActionError;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction$InternalViewAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowActionError implements InternalViewAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f241459b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final PrintableText f241460c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final SlotType f241461d;

            public ShowActionError(@k PrintableText printableText, @l PrintableText printableText2, @k SlotType slotType) {
                this.f241459b = printableText;
                this.f241460c = printableText2;
                this.f241461d = slotType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowActionError)) {
                    return false;
                }
                ShowActionError showActionError = (ShowActionError) obj;
                return L.f(this.f241459b, showActionError.f241459b) && L.f(this.f241460c, showActionError.f241460c) && this.f241461d == showActionError.f241461d;
            }

            public final int hashCode() {
                int iHashCode = this.f241459b.hashCode() * 31;
                PrintableText printableText = this.f241460c;
                return this.f241461d.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "ShowActionError(errorMessage=" + this.f241459b + ", actionText=" + this.f241460c + ", slotType=" + this.f241461d + ')';
            }

            public /* synthetic */ ShowActionError(PrintableText printableText, PrintableText printableText2, SlotType slotType, int i12, C42822w c42822w) {
                this(printableText, (i12 & 2) != 0 ? null : printableText2, slotType);
            }
        }
    }
}
