package com.avito.android.wallet.pin.impl.creation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import hP0.C40864b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinCreationInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddSymbolToFirstInput", "AddSymbolToSecondInput", "DeleteLastSymbolFromFirstInput", "DeleteLastSymbolFromSecondInput", "Finish", "HidePinsDoNotMatchError", "OnBackPressed", "ResetInputs", "SetActivityResultParams", "ShowContent", "ShowContentLoading", "ShowContentLoadingError", "ShowFirstInput", "ShowPinSaving", "ShowPinSavingError", "ShowPinsDoNotMatchError", "ShowSecondInput", "ShowSuccess", "ShowToast", "ShowWalletNotWorkingScreen", "StopPinSaving", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$AddSymbolToFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$AddSymbolToSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$DeleteLastSymbolFromFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$DeleteLastSymbolFromSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$Finish;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$HidePinsDoNotMatchError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$OnBackPressed;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ResetInputs;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$SetActivityResultParams;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinSaving;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinSavingError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinsDoNotMatchError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowSuccess;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowToast;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowWalletNotWorkingScreen;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$StopPinSaving;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletPinCreationInternalAction extends n {

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$AddSymbolToFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddSymbolToFirstInput implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final char f328620b;

        public AddSymbolToFirstInput(char c12) {
            this.f328620b = c12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddSymbolToFirstInput) && this.f328620b == ((AddSymbolToFirstInput) obj).f328620b;
        }

        public final int hashCode() {
            return Character.hashCode(this.f328620b);
        }

        @k
        public final String toString() {
            return "AddSymbolToFirstInput(symbol=" + this.f328620b + ')';
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$AddSymbolToSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddSymbolToSecondInput implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final char f328621b;

        public AddSymbolToSecondInput(char c12) {
            this.f328621b = c12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddSymbolToSecondInput) && this.f328621b == ((AddSymbolToSecondInput) obj).f328621b;
        }

        public final int hashCode() {
            return Character.hashCode(this.f328621b);
        }

        @k
        public final String toString() {
            return "AddSymbolToSecondInput(symbol=" + this.f328621b + ')';
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$DeleteLastSymbolFromFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteLastSymbolFromFirstInput implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeleteLastSymbolFromFirstInput f328622b = new DeleteLastSymbolFromFirstInput();

        private DeleteLastSymbolFromFirstInput() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DeleteLastSymbolFromFirstInput);
        }

        public final int hashCode() {
            return -1719915882;
        }

        @k
        public final String toString() {
            return "DeleteLastSymbolFromFirstInput";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$DeleteLastSymbolFromSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteLastSymbolFromSecondInput implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeleteLastSymbolFromSecondInput f328623b = new DeleteLastSymbolFromSecondInput();

        private DeleteLastSymbolFromSecondInput() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DeleteLastSymbolFromSecondInput);
        }

        public final int hashCode() {
            return -207857766;
        }

        @k
        public final String toString() {
            return "DeleteLastSymbolFromSecondInput";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$Finish;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Finish f328624b = new Finish();

        private Finish() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Finish);
        }

        public final int hashCode() {
            return -1078773844;
        }

        @k
        public final String toString() {
            return "Finish";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$HidePinsDoNotMatchError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HidePinsDoNotMatchError implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HidePinsDoNotMatchError f328625b = new HidePinsDoNotMatchError();

        private HidePinsDoNotMatchError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HidePinsDoNotMatchError);
        }

        public final int hashCode() {
            return -309790798;
        }

        @k
        public final String toString() {
            return "HidePinsDoNotMatchError";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$OnBackPressed;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackPressed implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnBackPressed f328626b = new OnBackPressed();

        private OnBackPressed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return 2146507939;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ResetInputs;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetInputs implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetInputs f328627b = new ResetInputs();

        private ResetInputs() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetInputs);
        }

        public final int hashCode() {
            return -1914728289;
        }

        @k
        public final String toString() {
            return "ResetInputs";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$SetActivityResultParams;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetActivityResultParams implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f328628b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f328629c;

        public SetActivityResultParams(@l DeepLink deepLink, @l Boolean bool) {
            this.f328628b = deepLink;
            this.f328629c = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetActivityResultParams)) {
                return false;
            }
            SetActivityResultParams setActivityResultParams = (SetActivityResultParams) obj;
            return L.f(this.f328628b, setActivityResultParams.f328628b) && L.f(this.f328629c, setActivityResultParams.f328629c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f328628b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Boolean bool = this.f328629c;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetActivityResultParams(deepLink=");
            sb2.append(this.f328628b);
            sb2.append(", closeScreen=");
            return C0.g(sb2, this.f328629c, ')');
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements WalletPinCreationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C40864b f328630b;

        public ShowContent(@k C40864b c40864b) {
            this.f328630b = c40864b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof ShowContent) && L.f(this.f328630b, ((ShowContent) obj).f328630b);
        }

        public final int hashCode() {
            return this.f328630b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(apiResponse=" + this.f328630b + ')';
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContentLoading extends TrackableLoadingStarted implements WalletPinCreationInternalAction {
        @k
        public final String toString() {
            return "WalletPinCreationInternalAction.ShowContentLoading";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContentLoadingError implements WalletPinCreationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f328631b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f328632c;

        public ShowContentLoadingError(@k ApiException apiException) {
            this.f328631b = apiException;
            this.f328632c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof ShowContentLoadingError) && this.f328631b.equals(((ShowContentLoadingError) obj).f328631b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325436c() {
            return this.f328632c;
        }

        public final int hashCode() {
            return this.f328631b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ShowContentLoadingError(error="), this.f328631b, ')');
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowFirstInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFirstInput implements WalletPinCreationInternalAction {
        static {
            new ShowFirstInput();
        }

        private ShowFirstInput() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowFirstInput);
        }

        public final int hashCode() {
            return -676125712;
        }

        @k
        public final String toString() {
            return "ShowFirstInput";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinSaving;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPinSaving implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPinSaving f328633b = new ShowPinSaving();

        private ShowPinSaving() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPinSaving);
        }

        public final int hashCode() {
            return 1667069241;
        }

        @k
        public final String toString() {
            return "ShowPinSaving";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinSavingError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPinSavingError implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPinSavingError f328634b = new ShowPinSavingError();

        private ShowPinSavingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPinSavingError);
        }

        public final int hashCode() {
            return 990496847;
        }

        @k
        public final String toString() {
            return "ShowPinSavingError";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowPinsDoNotMatchError;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPinsDoNotMatchError implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPinsDoNotMatchError f328635b = new ShowPinsDoNotMatchError();

        private ShowPinsDoNotMatchError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPinsDoNotMatchError);
        }

        public final int hashCode() {
            return 1796764183;
        }

        @k
        public final String toString() {
            return "ShowPinsDoNotMatchError";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowSecondInput;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSecondInput implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSecondInput f328636b = new ShowSecondInput();

        private ShowSecondInput() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSecondInput);
        }

        public final int hashCode() {
            return 2084866432;
        }

        @k
        public final String toString() {
            return "ShowSecondInput";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowSuccess;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuccess implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSuccess f328637b = new ShowSuccess();

        private ShowSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSuccess);
        }

        public final int hashCode() {
            return 1965716173;
        }

        @k
        public final String toString() {
            return "ShowSuccess";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowToast;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f328638b;

        public ShowToast(@k String str) {
            this.f328638b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f328638b, ((ShowToast) obj).f328638b);
        }

        public final int hashCode() {
            return this.f328638b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f328638b, ')');
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$ShowWalletNotWorkingScreen;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowWalletNotWorkingScreen implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowWalletNotWorkingScreen f328639b = new ShowWalletNotWorkingScreen();

        private ShowWalletNotWorkingScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowWalletNotWorkingScreen);
        }

        public final int hashCode() {
            return -2028861191;
        }

        @k
        public final String toString() {
            return "ShowWalletNotWorkingScreen";
        }
    }

    /* compiled from: WalletPinCreationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction$StopPinSaving;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopPinSaving implements WalletPinCreationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopPinSaving f328640b = new StopPinSaving();

        private StopPinSaving() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StopPinSaving);
        }

        public final int hashCode() {
            return 296689108;
        }

        @k
        public final String toString() {
            return "StopPinSaving";
        }
    }
}
