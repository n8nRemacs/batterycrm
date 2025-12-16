package com.avito.android.publish.screen.objects.mvi.entity;

import Ee0.C13479a;
import UV0.a;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ObjectFillFormInternalAction.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HideKeyboard", "ItemsUpdate", "LeaveScreen", "LeaveScreenWithChangedObject", "NavigateToAuth", "OpenDeepLink", "PriceListInputFocusChanged", "ScrollToItem", "SetupObjectView", "ShowAddressActionMessageAlert", "ShowAppBarOnboarding", "ShowAutoEarlyAccessSelectScreen", "ShowConfettiAnimation", "ShowConfirmation", "ShowContent", "ShowDatePickerDialog", "ShowDateTimeRangeDialog", "ShowDeleteObjectDialog", "ShowErrorAlert", "ShowErrorWithAction", "ShowLocationPicker", "ShowSelectScreen", "ShowSelectorCardGroupBottomSheet", "ShowSimpleMessageAlert", "ShowSuggestInstitutesDialog", "ShowToastBarError", "ShowTooltipForItem", "UpdateValidationProgress", "UpdatedInstantMarketValue", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$HideKeyboard;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ItemsUpdate;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$LeaveScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$LeaveScreenWithChangedObject;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$NavigateToAuth;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$OpenDeepLink;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$PriceListInputFocusChanged;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ScrollToItem;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$SetupObjectView;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAddressActionMessageAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAppBarOnboarding;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAutoEarlyAccessSelectScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowConfettiAnimation;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowConfirmation;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowContent;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDatePickerDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDateTimeRangeDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDeleteObjectDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowErrorAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowErrorWithAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowLocationPicker;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSelectScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSelectorCardGroupBottomSheet;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSimpleMessageAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSuggestInstitutesDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowToastBarError;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowTooltipForItem;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$UpdateValidationProgress;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$UpdatedInstantMarketValue;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ObjectFillFormInternalAction extends n {

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$HideKeyboard;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements ObjectFillFormInternalAction {
        static {
            new HideKeyboard();
        }

        private HideKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 2051617555;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ItemsUpdate;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemsUpdate implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a<? extends com.avito.conveyor_item.a> f240197b;

        public ItemsUpdate(@k a<? extends com.avito.conveyor_item.a> aVar) {
            this.f240197b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemsUpdate) && L.f(this.f240197b, ((ItemsUpdate) obj).f240197b);
        }

        public final int hashCode() {
            return this.f240197b.hashCode();
        }

        @k
        public final String toString() {
            return "ItemsUpdate(items=" + this.f240197b + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$LeaveScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeaveScreen implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LeaveScreen f240198b = new LeaveScreen();

        private LeaveScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LeaveScreen);
        }

        public final int hashCode() {
            return 546166009;
        }

        @k
        public final String toString() {
            return "LeaveScreen";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$LeaveScreenWithChangedObject;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeaveScreenWithChangedObject implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f240199b;

        public LeaveScreenWithChangedObject(@k String str) {
            this.f240199b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LeaveScreenWithChangedObject) && L.f(this.f240199b, ((LeaveScreenWithChangedObject) obj).f240199b);
        }

        public final int hashCode() {
            return this.f240199b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LeaveScreenWithChangedObject(id="), this.f240199b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$NavigateToAuth;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToAuth implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToAuth f240200b = new NavigateToAuth();

        private NavigateToAuth() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToAuth);
        }

        public final int hashCode() {
            return -1831626530;
        }

        @k
        public final String toString() {
            return "NavigateToAuth";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$OpenDeepLink;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f240201b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f240201b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f240201b, ((OpenDeepLink) obj).f240201b);
        }

        public final int hashCode() {
            return this.f240201b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f240201b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$PriceListInputFocusChanged;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceListInputFocusChanged implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f240202b;

        public PriceListInputFocusChanged(boolean z12) {
            this.f240202b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PriceListInputFocusChanged) && this.f240202b == ((PriceListInputFocusChanged) obj).f240202b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f240202b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PriceListInputFocusChanged(hasFocus="), this.f240202b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ScrollToItem;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f240203b;

        public ScrollToItem(int i12) {
            this.f240203b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToItem) && this.f240203b == ((ScrollToItem) obj).f240203b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f240203b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(itemPosition="), this.f240203b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$SetupObjectView;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetupObjectView implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f240204b;

        public SetupObjectView(@l String str) {
            this.f240204b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupObjectView) && L.f(this.f240204b, ((SetupObjectView) obj).f240204b);
        }

        public final int hashCode() {
            String str = this.f240204b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetupObjectView(title="), this.f240204b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAddressActionMessageAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAddressActionMessageAlert implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAddressActionMessageAlert)) {
                return false;
            }
            ((ShowAddressActionMessageAlert) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowAddressActionMessageAlert(address=null, action=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAppBarOnboarding;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAppBarOnboarding implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAppBarOnboarding)) {
                return false;
            }
            ((ShowAppBarOnboarding) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowAppBarOnboarding(data=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowAutoEarlyAccessSelectScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAutoEarlyAccessSelectScreen implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoEarlyAccessSelectParams f240205b;

        static {
            Parcelable.Creator<AutoEarlyAccessSelectParams> creator = AutoEarlyAccessSelectParams.CREATOR;
        }

        public ShowAutoEarlyAccessSelectScreen(@k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
            this.f240205b = autoEarlyAccessSelectParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAutoEarlyAccessSelectScreen) && L.f(this.f240205b, ((ShowAutoEarlyAccessSelectScreen) obj).f240205b);
        }

        public final int hashCode() {
            return this.f240205b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowAutoEarlyAccessSelectScreen(openParams=" + this.f240205b + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowConfettiAnimation;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfettiAnimation implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConfettiAnimation)) {
                return false;
            }
            ((ShowConfettiAnimation) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowConfettiAnimation(confetti=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowConfirmation;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmation implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C13479a f240206b;

        public ShowConfirmation(@k C13479a c13479a) {
            this.f240206b = c13479a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowConfirmation) && L.f(this.f240206b, ((ShowConfirmation) obj).f240206b);
        }

        public final int hashCode() {
            return this.f240206b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowConfirmation(data=" + this.f240206b + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowContent;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f240207b = new ShowContent();

        private ShowContent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowContent);
        }

        public final int hashCode() {
            return -1122367054;
        }

        @k
        public final String toString() {
            return "ShowContent";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDatePickerDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDatePickerDialog implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f240208b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ParameterElement.C29377e f240209c;

        public ShowDatePickerDialog(@k c.a aVar, @k ParameterElement.C29377e c29377e) {
            this.f240208b = aVar;
            this.f240209c = c29377e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowDatePickerDialog)) {
                return false;
            }
            ShowDatePickerDialog showDatePickerDialog = (ShowDatePickerDialog) obj;
            return L.f(this.f240208b, showDatePickerDialog.f240208b) && L.f(this.f240209c, showDatePickerDialog.f240209c);
        }

        public final int hashCode() {
            return this.f240209c.hashCode() + (this.f240208b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowDatePickerDialog(dateSelectInfo=" + this.f240208b + ", dateTime=" + this.f240209c + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDateTimeRangeDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDateTimeRangeDialog implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f240210b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ParameterElement.C29377e f240211c;

        public ShowDateTimeRangeDialog(@k c.a aVar, @k ParameterElement.C29377e c29377e) {
            this.f240210b = aVar;
            this.f240211c = c29377e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowDateTimeRangeDialog)) {
                return false;
            }
            ShowDateTimeRangeDialog showDateTimeRangeDialog = (ShowDateTimeRangeDialog) obj;
            return L.f(this.f240210b, showDateTimeRangeDialog.f240210b) && L.f(this.f240211c, showDateTimeRangeDialog.f240211c);
        }

        public final int hashCode() {
            return this.f240211c.hashCode() + (this.f240210b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowDateTimeRangeDialog(dateSelectInfo=" + this.f240210b + ", dateTime=" + this.f240211c + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowDeleteObjectDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDeleteObjectDialog implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowDeleteObjectDialog f240212b = new ShowDeleteObjectDialog();

        private ShowDeleteObjectDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowDeleteObjectDialog);
        }

        public final int hashCode() {
            return 503148505;
        }

        @k
        public final String toString() {
            return "ShowDeleteObjectDialog";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowErrorAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorAlert implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f240213b;

        public ShowErrorAlert(@k String str) {
            this.f240213b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorAlert) && L.f(this.f240213b, ((ShowErrorAlert) obj).f240213b);
        }

        public final int hashCode() {
            return this.f240213b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorAlert(message="), this.f240213b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowErrorWithAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorWithAction implements ObjectFillFormInternalAction {
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

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowLocationPicker;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLocationPicker implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AddressParameter f240214b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f240215c;

        public ShowLocationPicker(@k AddressParameter addressParameter, boolean z12) {
            this.f240214b = addressParameter;
            this.f240215c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLocationPicker)) {
                return false;
            }
            ShowLocationPicker showLocationPicker = (ShowLocationPicker) obj;
            return L.f(this.f240214b, showLocationPicker.f240214b) && this.f240215c == showLocationPicker.f240215c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f240215c) + (this.f240214b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLocationPicker(address=");
            sb2.append(this.f240214b);
            sb2.append(", withRedesignTheme=");
            return r.x(sb2, this.f240215c, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSelectScreen;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelectScreen implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f240216b;

        public ShowSelectScreen(@k Arguments arguments) {
            this.f240216b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSelectScreen) && L.f(this.f240216b, ((ShowSelectScreen) obj).f240216b);
        }

        public final int hashCode() {
            return this.f240216b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("ShowSelectScreen(args="), this.f240216b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSelectorCardGroupBottomSheet;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelectorCardGroupBottomSheet implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.blueprints.selector_card_group_bottom_sheet.k f240217b;

        public ShowSelectorCardGroupBottomSheet(@k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
            this.f240217b = kVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSelectorCardGroupBottomSheet) && L.f(this.f240217b, ((ShowSelectorCardGroupBottomSheet) obj).f240217b);
        }

        public final int hashCode() {
            return this.f240217b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowSelectorCardGroupBottomSheet(params=" + this.f240217b + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSimpleMessageAlert;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSimpleMessageAlert implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSimpleMessageAlert)) {
                return false;
            }
            ((ShowSimpleMessageAlert) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowSimpleMessageAlert(text=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowSuggestInstitutesDialog;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuggestInstitutesDialog implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SuggestInstituteArguments f240218b;

        public ShowSuggestInstitutesDialog(@k SuggestInstituteArguments suggestInstituteArguments) {
            this.f240218b = suggestInstituteArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSuggestInstitutesDialog) && L.f(this.f240218b, ((ShowSuggestInstitutesDialog) obj).f240218b);
        }

        public final int hashCode() {
            return this.f240218b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowSuggestInstitutesDialog(args=" + this.f240218b + ')';
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowToastBarError;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBarError implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastBarError)) {
                return false;
            }
            ((ShowToastBarError) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowToastBarError(state=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$ShowTooltipForItem;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowTooltipForItem implements ObjectFillFormInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowTooltipForItem)) {
                return false;
            }
            ((ShowTooltipForItem) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return Integer.hashCode(0) * 31;
        }

        @k
        public final String toString() {
            return "ShowTooltipForItem(position=0, options=null)";
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$UpdateValidationProgress;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateValidationProgress implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f240219b;

        public UpdateValidationProgress(boolean z12) {
            this.f240219b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateValidationProgress) && this.f240219b == ((UpdateValidationProgress) obj).f240219b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f240219b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateValidationProgress(isShow="), this.f240219b, ')');
        }
    }

    /* compiled from: ObjectFillFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction$UpdatedInstantMarketValue;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lcom/avito/android/publish/screen/objects/mvi/entity/InternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatedInstantMarketValue implements ObjectFillFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.publish.imv.a f240220b;

        public UpdatedInstantMarketValue(@k com.avito.android.publish.imv.a aVar) {
            this.f240220b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatedInstantMarketValue) && L.f(this.f240220b, ((UpdatedInstantMarketValue) obj).f240220b);
        }

        public final int hashCode() {
            return this.f240220b.f236061a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdatedInstantMarketValue(data=" + this.f240220b + ')';
        }
    }
}
