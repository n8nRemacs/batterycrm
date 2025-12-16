package com.avito.android.wallet.pin.impl.verification.mvi.entity;

import AK.c;
import CP0.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rP0.C47583b;

/* compiled from: WalletPinVerificationInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddPinSymbol", "Close", "DeleteLastPinSymbol", "HideIncorrectPinErrorMessage", "ResetEnteredPin", "ResetPinCipher", "SetActivityResultParams", "SetPin", "ShowContent", "ShowContentLoading", "ShowContentLoadingError", "ShowErrorAnimation", "ShowIncorrectPinErrorMessage", "ShowPinVerifying", "ShowSuccessAnimation", "ShowToast", "StopLoadingAnimation", "StopPinVerifying", "UpdateCurrentAttempt", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$AddPinSymbol;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$Close;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$DeleteLastPinSymbol;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$HideIncorrectPinErrorMessage;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ResetEnteredPin;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ResetPinCipher;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$SetActivityResultParams;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$SetPin;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowErrorAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowIncorrectPinErrorMessage;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowPinVerifying;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowSuccessAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowToast;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$StopLoadingAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$StopPinVerifying;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$UpdateCurrentAttempt;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WalletPinVerificationInternalAction extends n {

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$AddPinSymbol;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddPinSymbol implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final char f329272b;

        public AddPinSymbol(char c12) {
            this.f329272b = c12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddPinSymbol) && this.f329272b == ((AddPinSymbol) obj).f329272b;
        }

        public final int hashCode() {
            return Character.hashCode(this.f329272b);
        }

        @k
        public final String toString() {
            return "AddPinSymbol(symbol=" + this.f329272b + ')';
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$Close;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f329273b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1922860863;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$DeleteLastPinSymbol;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteLastPinSymbol implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeleteLastPinSymbol f329274b = new DeleteLastPinSymbol();

        private DeleteLastPinSymbol() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DeleteLastPinSymbol);
        }

        public final int hashCode() {
            return -1760051533;
        }

        @k
        public final String toString() {
            return "DeleteLastPinSymbol";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$HideIncorrectPinErrorMessage;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideIncorrectPinErrorMessage implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideIncorrectPinErrorMessage f329275b = new HideIncorrectPinErrorMessage();

        private HideIncorrectPinErrorMessage() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideIncorrectPinErrorMessage);
        }

        public final int hashCode() {
            return -225161494;
        }

        @k
        public final String toString() {
            return "HideIncorrectPinErrorMessage";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ResetEnteredPin;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetEnteredPin implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetEnteredPin f329276b = new ResetEnteredPin();

        private ResetEnteredPin() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetEnteredPin);
        }

        public final int hashCode() {
            return -2096802860;
        }

        @k
        public final String toString() {
            return "ResetEnteredPin";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ResetPinCipher;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetPinCipher implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetPinCipher f329277b = new ResetPinCipher();

        private ResetPinCipher() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetPinCipher);
        }

        public final int hashCode() {
            return -1164533238;
        }

        @k
        public final String toString() {
            return "ResetPinCipher";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$SetActivityResultParams;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetActivityResultParams implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f329278b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f329279c;

        public SetActivityResultParams(@l DeepLink deepLink, @l Boolean bool) {
            this.f329278b = deepLink;
            this.f329279c = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetActivityResultParams)) {
                return false;
            }
            SetActivityResultParams setActivityResultParams = (SetActivityResultParams) obj;
            return L.f(this.f329278b, setActivityResultParams.f329278b) && L.f(this.f329279c, setActivityResultParams.f329279c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f329278b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Boolean bool = this.f329279c;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetActivityResultParams(deepLink=");
            sb2.append(this.f329278b);
            sb2.append(", closeScreen=");
            return C0.g(sb2, this.f329279c, ')');
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$SetPin;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetPin implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f329280b;

        public SetPin(@k String str) {
            this.f329280b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetPin) && L.f(this.f329280b, ((SetPin) obj).f329280b);
        }

        public final int hashCode() {
            return this.f329280b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetPin(pin="), this.f329280b, ')');
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContent;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements WalletPinVerificationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47583b f329281b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final d f329282c;

        public ShowContent(@k C47583b c47583b, @l d dVar) {
            this.f329281b = c47583b;
            this.f329282c = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f329281b, showContent.f329281b) && L.f(this.f329282c, showContent.f329282c);
        }

        public final int hashCode() {
            int iHashCode = this.f329281b.hashCode() * 31;
            d dVar = this.f329282c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @k
        public final String toString() {
            return "ShowContent(apiResponse=" + this.f329281b + ", walletPinCipher=" + this.f329282c + ')';
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContentLoading;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowContentLoading extends TrackableLoadingStarted implements WalletPinVerificationInternalAction {
        @k
        public final String toString() {
            return "WalletPinVerificationInternalAction.ShowContentLoading";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowContentLoadingError;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContentLoadingError implements WalletPinVerificationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f329283b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f329284c;

        public ShowContentLoadingError(@k ApiException apiException) {
            this.f329283b = apiException;
            this.f329284c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof ShowContentLoadingError) && this.f329283b.equals(((ShowContentLoadingError) obj).f329283b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF297778c() {
            return this.f329284c;
        }

        public final int hashCode() {
            return this.f329283b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ShowContentLoadingError(error="), this.f329283b, ')');
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowErrorAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorAnimation implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowErrorAnimation f329285b = new ShowErrorAnimation();

        private ShowErrorAnimation() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowErrorAnimation);
        }

        public final int hashCode() {
            return 493239506;
        }

        @k
        public final String toString() {
            return "ShowErrorAnimation";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowIncorrectPinErrorMessage;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowIncorrectPinErrorMessage implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f329286b;

        public ShowIncorrectPinErrorMessage(@k AttributedText attributedText) {
            this.f329286b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowIncorrectPinErrorMessage) && L.f(this.f329286b, ((ShowIncorrectPinErrorMessage) obj).f329286b);
        }

        public final int hashCode() {
            return this.f329286b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("ShowIncorrectPinErrorMessage(errorMessage="), this.f329286b, ')');
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowPinVerifying;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPinVerifying implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowPinVerifying f329287b = new ShowPinVerifying();

        private ShowPinVerifying() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowPinVerifying);
        }

        public final int hashCode() {
            return -1934383446;
        }

        @k
        public final String toString() {
            return "ShowPinVerifying";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowSuccessAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuccessAnimation implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSuccessAnimation f329288b = new ShowSuccessAnimation();

        private ShowSuccessAnimation() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSuccessAnimation);
        }

        public final int hashCode() {
            return -1538681929;
        }

        @k
        public final String toString() {
            return "ShowSuccessAnimation";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$ShowToast;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f329289b;

        public ShowToast(@k String str) {
            this.f329289b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f329289b, ((ShowToast) obj).f329289b);
        }

        public final int hashCode() {
            return this.f329289b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f329289b, ')');
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$StopLoadingAnimation;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopLoadingAnimation implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopLoadingAnimation f329290b = new StopLoadingAnimation();

        private StopLoadingAnimation() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StopLoadingAnimation);
        }

        public final int hashCode() {
            return -1155218013;
        }

        @k
        public final String toString() {
            return "StopLoadingAnimation";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$StopPinVerifying;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopPinVerifying implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopPinVerifying f329291b = new StopPinVerifying();

        private StopPinVerifying() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StopPinVerifying);
        }

        public final int hashCode() {
            return 1030190127;
        }

        @k
        public final String toString() {
            return "StopPinVerifying";
        }
    }

    /* compiled from: WalletPinVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction$UpdateCurrentAttempt;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCurrentAttempt implements WalletPinVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f329292b;

        public UpdateCurrentAttempt(int i12) {
            this.f329292b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCurrentAttempt) && this.f329292b == ((UpdateCurrentAttempt) obj).f329292b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f329292b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCurrentAttempt(currentAttempt="), this.f329292b, ')');
        }
    }
}
