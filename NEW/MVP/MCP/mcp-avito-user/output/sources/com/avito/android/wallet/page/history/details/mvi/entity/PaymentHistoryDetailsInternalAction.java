package com.avito.android.wallet.page.history.details.mvi.entity;

import AK.c;
import UO0.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseRefundConfirmationSheet", "Content", "Error", "Loading", "Refund", "RunChromeCustomTabs", "ShowFiscalizationErrorDialog", "ShowFiscalizationInProgressDialog", "ShowRefundError", "ShowRefundSuccess", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$CloseRefundConfirmationSheet;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Content;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Error;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Loading;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Refund;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$RunChromeCustomTabs;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowFiscalizationErrorDialog;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowFiscalizationInProgressDialog;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowRefundError;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowRefundSuccess;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentHistoryDetailsInternalAction extends n {

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$CloseRefundConfirmationSheet;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseRefundConfirmationSheet implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseRefundConfirmationSheet f327935b = new CloseRefundConfirmationSheet();

        private CloseRefundConfirmationSheet() {
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Content;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements PaymentHistoryDetailsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f327936b;

        public Content(@k a aVar) {
            this.f327936b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Content) && L.f(this.f327936b, ((Content) obj).f327936b);
        }

        public final int hashCode() {
            return this.f327936b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f327936b + ')';
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Error;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PaymentHistoryDetailsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f327937b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f327938c;

        public Error(@k ApiException apiException) {
            this.f327937b = apiException;
            this.f327938c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Error) && this.f327937b.equals(((Error) obj).f327937b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF290276c() {
            return this.f327938c;
        }

        public final int hashCode() {
            return this.f327937b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f327937b, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Loading;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements PaymentHistoryDetailsInternalAction {
        @k
        public final String toString() {
            return Loading.class.getSimpleName();
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$Refund;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Refund implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f327939b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f327940c;

        public Refund(@k String str, @k String str2) {
            this.f327939b = str;
            this.f327940c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj;
            return L.f(this.f327939b, refund.f327939b) && L.f(this.f327940c, refund.f327940c);
        }

        public final int hashCode() {
            return this.f327940c.hashCode() + (this.f327939b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Refund(amount=");
            sb2.append(this.f327939b);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f327940c, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$RunChromeCustomTabs;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RunChromeCustomTabs implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f327941b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f327942c;

        public RunChromeCustomTabs(@l String str, @l String str2) {
            this.f327941b = str;
            this.f327942c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RunChromeCustomTabs)) {
                return false;
            }
            RunChromeCustomTabs runChromeCustomTabs = (RunChromeCustomTabs) obj;
            return L.f(this.f327941b, runChromeCustomTabs.f327941b) && L.f(this.f327942c, runChromeCustomTabs.f327942c);
        }

        public final int hashCode() {
            String str = this.f327941b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f327942c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RunChromeCustomTabs(url=");
            sb2.append(this.f327941b);
            sb2.append(", intentPackage=");
            return C22026a.c(sb2, this.f327942c, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowFiscalizationErrorDialog;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFiscalizationErrorDialog implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowFiscalizationErrorDialog f327943b = new ShowFiscalizationErrorDialog();

        private ShowFiscalizationErrorDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowFiscalizationErrorDialog);
        }

        public final int hashCode() {
            return -862997328;
        }

        @k
        public final String toString() {
            return "ShowFiscalizationErrorDialog";
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowFiscalizationInProgressDialog;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFiscalizationInProgressDialog implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowFiscalizationInProgressDialog f327944b = new ShowFiscalizationInProgressDialog();

        private ShowFiscalizationInProgressDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowFiscalizationInProgressDialog);
        }

        public final int hashCode() {
            return -1791560934;
        }

        @k
        public final String toString() {
            return "ShowFiscalizationInProgressDialog";
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowRefundError;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRefundError implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowRefundError f327945b = new ShowRefundError();

        private ShowRefundError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowRefundError);
        }

        public final int hashCode() {
            return 873283498;
        }

        @k
        public final String toString() {
            return "ShowRefundError";
        }
    }

    /* compiled from: PaymentHistoryDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction$ShowRefundSuccess;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRefundSuccess implements PaymentHistoryDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f327946b;

        public ShowRefundSuccess(@k String str) {
            this.f327946b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRefundSuccess) && L.f(this.f327946b, ((ShowRefundSuccess) obj).f327946b);
        }

        public final int hashCode() {
            return this.f327946b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRefundSuccess(deeplink="), this.f327946b, ')');
        }
    }
}
