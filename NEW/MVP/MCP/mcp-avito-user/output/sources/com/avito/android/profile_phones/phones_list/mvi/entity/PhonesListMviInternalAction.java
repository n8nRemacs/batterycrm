package com.avito.android.profile_phones.phones_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.X;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.C33432d;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: PhonesListMviInternalAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangePhonesExpandState", "CloseTimePickerDialog", "Content", "ContentWithPhonesError", "DeleteDeviceError", "ErrorToastOnTimePickerDialog", "FullScreenLoading", "HideDeletedDevice", "IacEnableChangeError", "IacEnableChangeState", "IacEnableChangedFromBottomSheet", "IacEnableSwitchLoading", "NeedRefreshProfileAfterExit", "NumbersContent", "NumbersFailed", "NumbersFailedViewLoading", "OpenAddPhoneScreen", "OpenDeleteDeviceFragment", "OpenIacEnableBottomSheet", "OpenPhoneActionsSheet", "OpenSchedulePicker", "OpenTimePicker", "RefreshIacProblemBanner", "ScheduleOptionClick", "ShowUxFeedback", "StartMicPermissionRequestFlow", "SuccessToast", "UpdateTimePicker", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ChangePhonesExpandState;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$CloseTimePickerDialog;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$Content;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ContentWithPhonesError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$DeleteDeviceError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ErrorToastOnTimePickerDialog;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$FullScreenLoading;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$HideDeletedDevice;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangeError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangeState;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangedFromBottomSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableSwitchLoading;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NeedRefreshProfileAfterExit;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersContent;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersFailed;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersFailedViewLoading;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenAddPhoneScreen;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenDeleteDeviceFragment;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenIacEnableBottomSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenPhoneActionsSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenSchedulePicker;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenTimePicker;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$RefreshIacProblemBanner;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ScheduleOptionClick;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ShowUxFeedback;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$StartMicPermissionRequestFlow;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$SuccessToast;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$UpdateTimePicker;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PhonesListMviInternalAction extends n {

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ChangePhonesExpandState;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChangePhonesExpandState implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ChangePhonesExpandState f227983b = new ChangePhonesExpandState();

        private ChangePhonesExpandState() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$CloseTimePickerDialog;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseTimePickerDialog implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseTimePickerDialog f227984b = new CloseTimePickerDialog();

        private CloseTimePickerDialog() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$Content;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements PhonesListMviInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PhoneListItem> f227985b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C33432d f227986c;

        public Content(@k List<PhoneListItem> list, @k C33432d c33432d) {
            this.f227985b = list;
            this.f227986c = c33432d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f227985b, content.f227985b) && L.f(this.f227986c, content.f227986c);
        }

        public final int hashCode() {
            return this.f227986c.hashCode() + (this.f227985b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Content(phones=" + this.f227985b + ", phonesIacData=" + this.f227986c + ')';
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ContentWithPhonesError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentWithPhonesError implements PhonesListMviInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227987b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C33432d f227988c;

        public ContentWithPhonesError(@k Throwable th2, @k C33432d c33432d) {
            this.f227987b = th2;
            this.f227988c = c33432d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentWithPhonesError)) {
                return false;
            }
            ContentWithPhonesError contentWithPhonesError = (ContentWithPhonesError) obj;
            return L.f(this.f227987b, contentWithPhonesError.f227987b) && L.f(this.f227988c, contentWithPhonesError.f227988c);
        }

        public final int hashCode() {
            return this.f227988c.hashCode() + (this.f227987b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContentWithPhonesError(phonesError=" + this.f227987b + ", phonesIacData=" + this.f227988c + ')';
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$DeleteDeviceError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteDeviceError implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227989b;

        public DeleteDeviceError(@k Throwable th2) {
            this.f227989b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteDeviceError) && L.f(this.f227989b, ((DeleteDeviceError) obj).f227989b);
        }

        public final int hashCode() {
            return this.f227989b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("DeleteDeviceError(error="), this.f227989b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ErrorToastOnTimePickerDialog;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorToastOnTimePickerDialog implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227990b;

        public ErrorToastOnTimePickerDialog(@k Throwable th2) {
            this.f227990b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorToastOnTimePickerDialog) && L.f(this.f227990b, ((ErrorToastOnTimePickerDialog) obj).f227990b);
        }

        public final int hashCode() {
            return this.f227990b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ErrorToastOnTimePickerDialog(error="), this.f227990b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$FullScreenLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FullScreenLoading extends TrackableLoadingStarted implements PhonesListMviInternalAction {
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$HideDeletedDevice;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideDeletedDevice implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeviceListItem f227991b;

        public HideDeletedDevice(@k DeviceListItem deviceListItem) {
            this.f227991b = deviceListItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HideDeletedDevice) && L.f(this.f227991b, ((HideDeletedDevice) obj).f227991b);
        }

        public final int hashCode() {
            return this.f227991b.hashCode();
        }

        @k
        public final String toString() {
            return "HideDeletedDevice(device=" + this.f227991b + ')';
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangeError;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IacEnableChangeError implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227992b;

        public IacEnableChangeError(@k Throwable th2) {
            this.f227992b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IacEnableChangeError) && L.f(this.f227992b, ((IacEnableChangeError) obj).f227992b);
        }

        public final int hashCode() {
            return this.f227992b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("IacEnableChangeError(error="), this.f227992b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangeState;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IacEnableChangeState implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f227993b;

        public IacEnableChangeState(boolean z12) {
            this.f227993b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IacEnableChangeState) && this.f227993b == ((IacEnableChangeState) obj).f227993b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f227993b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IacEnableChangeState(iacEnabled="), this.f227993b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableChangedFromBottomSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IacEnableChangedFromBottomSheet implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f227994b;

        public IacEnableChangedFromBottomSheet(boolean z12) {
            this.f227994b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IacEnableChangedFromBottomSheet) && this.f227994b == ((IacEnableChangedFromBottomSheet) obj).f227994b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f227994b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IacEnableChangedFromBottomSheet(iacEnabled="), this.f227994b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$IacEnableSwitchLoading;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IacEnableSwitchLoading implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final IacEnableSwitchLoading f227995b = new IacEnableSwitchLoading();

        private IacEnableSwitchLoading() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NeedRefreshProfileAfterExit;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NeedRefreshProfileAfterExit implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NeedRefreshProfileAfterExit f227996b = new NeedRefreshProfileAfterExit();

        private NeedRefreshProfileAfterExit() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersContent;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NumbersContent implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PhoneListItem> f227997b;

        public NumbersContent(@k List<PhoneListItem> list) {
            this.f227997b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NumbersContent) && L.f(this.f227997b, ((NumbersContent) obj).f227997b);
        }

        public final int hashCode() {
            return this.f227997b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("NumbersContent(phones="), this.f227997b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersFailed;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NumbersFailed implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227998b;

        public NumbersFailed(@k Throwable th2) {
            this.f227998b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NumbersFailed) && L.f(this.f227998b, ((NumbersFailed) obj).f227998b);
        }

        public final int hashCode() {
            return this.f227998b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("NumbersFailed(error="), this.f227998b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$NumbersFailedViewLoading;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NumbersFailedViewLoading implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NumbersFailedViewLoading f227999b = new NumbersFailedViewLoading();

        private NumbersFailedViewLoading() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenAddPhoneScreen;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenAddPhoneScreen implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAddPhoneScreen f228000b = new OpenAddPhoneScreen();

        private OpenAddPhoneScreen() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenDeleteDeviceFragment;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeleteDeviceFragment implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeviceListItem f228001b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f228002c;

        public OpenDeleteDeviceFragment(@k DeviceListItem deviceListItem, @k ArrayList arrayList) {
            this.f228001b = deviceListItem;
            this.f228002c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeleteDeviceFragment)) {
                return false;
            }
            OpenDeleteDeviceFragment openDeleteDeviceFragment = (OpenDeleteDeviceFragment) obj;
            return L.f(this.f228001b, openDeleteDeviceFragment.f228001b) && L.f(this.f228002c, openDeleteDeviceFragment.f228002c);
        }

        public final int hashCode() {
            return this.f228002c.hashCode() + (this.f228001b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeleteDeviceFragment(deviceToDelete=");
            sb2.append(this.f228001b);
            sb2.append(", devices=");
            return e.p(sb2, this.f228002c, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenIacEnableBottomSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenIacEnableBottomSheet implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f228003b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f228004c;

        public OpenIacEnableBottomSheet(boolean z12, boolean z13) {
            this.f228003b = z12;
            this.f228004c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenIacEnableBottomSheet)) {
                return false;
            }
            OpenIacEnableBottomSheet openIacEnableBottomSheet = (OpenIacEnableBottomSheet) obj;
            return this.f228003b == openIacEnableBottomSheet.f228003b && this.f228004c == openIacEnableBottomSheet.f228004c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f228004c) + (Boolean.hashCode(this.f228003b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenIacEnableBottomSheet(iacEnabled=");
            sb2.append(this.f228003b);
            sb2.append(", canChangeStateIacEnable=");
            return r.x(sb2, this.f228004c, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenPhoneActionsSheet;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhoneActionsSheet implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f228005b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<PhoneListItem.Action> f228006c;

        public OpenPhoneActionsSheet(@k String str, @k List<PhoneListItem.Action> list) {
            this.f228005b = str;
            this.f228006c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenPhoneActionsSheet)) {
                return false;
            }
            OpenPhoneActionsSheet openPhoneActionsSheet = (OpenPhoneActionsSheet) obj;
            return L.f(this.f228005b, openPhoneActionsSheet.f228005b) && L.f(this.f228006c, openPhoneActionsSheet.f228006c);
        }

        public final int hashCode() {
            return this.f228006c.hashCode() + (this.f228005b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhoneActionsSheet(phone=");
            sb2.append(this.f228005b);
            sb2.append(", actions=");
            return H.p(sb2, this.f228006c, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenSchedulePicker;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSchedulePicker implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ScheduleOption> f228007b;

        public OpenSchedulePicker(@k List<ScheduleOption> list) {
            this.f228007b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSchedulePicker) && L.f(this.f228007b, ((OpenSchedulePicker) obj).f228007b);
        }

        public final int hashCode() {
            return this.f228007b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OpenSchedulePicker(options="), this.f228007b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$OpenTimePicker;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenTimePicker implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final X f228008b;

        public OpenTimePicker(@k X x12) {
            this.f228008b = x12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTimePicker) && L.f(this.f228008b, ((OpenTimePicker) obj).f228008b);
        }

        public final int hashCode() {
            return this.f228008b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenTimePicker(data=" + this.f228008b + ')';
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$RefreshIacProblemBanner;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RefreshIacProblemBanner implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RefreshIacProblemBanner f228009b = new RefreshIacProblemBanner();

        private RefreshIacProblemBanner() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ScheduleOptionClick;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScheduleOptionClick implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ScheduleOption f228010b;

        public ScheduleOptionClick(@k ScheduleOption scheduleOption) {
            this.f228010b = scheduleOption;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScheduleOptionClick) && L.f(this.f228010b, ((ScheduleOptionClick) obj).f228010b);
        }

        public final int hashCode() {
            return this.f228010b.hashCode();
        }

        @k
        public final String toString() {
            return "ScheduleOptionClick(option=" + this.f228010b + ')';
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$ShowUxFeedback;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUxFeedback implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f228011b;

        public ShowUxFeedback(@k DeepLink deepLink) {
            this.f228011b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUxFeedback) && L.f(this.f228011b, ((ShowUxFeedback) obj).f228011b);
        }

        public final int hashCode() {
            return this.f228011b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("ShowUxFeedback(link="), this.f228011b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$StartMicPermissionRequestFlow;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartMicPermissionRequestFlow implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartMicPermissionRequestFlow f228012b = new StartMicPermissionRequestFlow();

        private StartMicPermissionRequestFlow() {
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$SuccessToast;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessToast implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f228013b;

        public SuccessToast(@k PrintableText printableText) {
            this.f228013b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessToast) && L.f(this.f228013b, ((SuccessToast) obj).f228013b);
        }

        public final int hashCode() {
            return this.f228013b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("SuccessToast(text="), this.f228013b, ')');
        }
    }

    /* compiled from: PhonesListMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction$UpdateTimePicker;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTimePicker implements PhonesListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f228014b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final g f228015c;

        public UpdateTimePicker(@k g gVar, @k g gVar2) {
            this.f228014b = gVar;
            this.f228015c = gVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateTimePicker)) {
                return false;
            }
            UpdateTimePicker updateTimePicker = (UpdateTimePicker) obj;
            return L.f(this.f228014b, updateTimePicker.f228014b) && L.f(this.f228015c, updateTimePicker.f228015c);
        }

        public final int hashCode() {
            return this.f228015c.hashCode() + (this.f228014b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateTimePicker(timePickerStart=");
            sb2.append(this.f228014b);
            sb2.append(", timePickerEnd=");
            return h.f(sb2, this.f228015c, ')');
        }
    }
}
