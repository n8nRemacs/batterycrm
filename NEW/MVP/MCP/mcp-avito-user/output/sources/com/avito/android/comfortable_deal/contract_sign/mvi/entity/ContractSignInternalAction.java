package com.avito.android.comfortable_deal.contract_sign.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContractSignInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContractSigned", "FailedOffer", "LoadedOffer", "LoadingError", "LoadingOffer", "NavigateBack", "OpenClientsFragment", "OpenContractLink", "StartLoading", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$ContractSigned;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$FailedOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadedOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadingOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$OpenClientsFragment;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$OpenContractLink;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$StartLoading;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContractSignInternalAction extends n {

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$ContractSigned;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContractSigned implements ContractSignInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ContractSigned f120859b = new ContractSigned();

        private ContractSigned() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ContractSigned);
        }

        public final int hashCode() {
            return 1719059487;
        }

        @k
        public final String toString() {
            return "ContractSigned";
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$FailedOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FailedOffer implements ContractSignInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f120860b;

        public FailedOffer(@k ApiError apiError) {
            this.f120860b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            return (obj instanceof FailedOffer) && L.f(this.f120860b, ((FailedOffer) obj).f120860b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF247799f() {
            return new J.a(this.f120860b);
        }

        public final int hashCode() {
            return this.f120860b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FailedOffer(error="), this.f120860b, ')');
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadedOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadedOffer implements ContractSignInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f120861b;

        public LoadedOffer(@k String str) {
            this.f120861b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            return (obj instanceof LoadedOffer) && L.f(this.f120861b, ((LoadedOffer) obj).f120861b);
        }

        public final int hashCode() {
            return this.f120861b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadedOffer(url="), this.f120861b, ')');
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements ContractSignInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f120862b;

        public LoadingError(@k ApiError apiError) {
            this.f120862b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF203255e() {
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
            return (obj instanceof LoadingError) && L.f(this.f120862b, ((LoadingError) obj).f120862b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF247799f() {
            return new J.a(this.f120862b);
        }

        public final int hashCode() {
            return this.f120862b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f120862b, ')');
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$LoadingOffer;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingOffer extends TrackableLoadingStarted implements ContractSignInternalAction {
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements ContractSignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f120863b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 1957948297;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$OpenClientsFragment;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenClientsFragment implements ContractSignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenClientsFragment f120864b = new OpenClientsFragment();

        private OpenClientsFragment() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenClientsFragment);
        }

        public final int hashCode() {
            return 467334685;
        }

        @k
        public final String toString() {
            return "OpenClientsFragment";
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$OpenContractLink;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenContractLink implements ContractSignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f120865b;

        public OpenContractLink(@k String str) {
            this.f120865b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenContractLink) && L.f(this.f120865b, ((OpenContractLink) obj).f120865b);
        }

        public final int hashCode() {
            return this.f120865b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenContractLink(url="), this.f120865b, ')');
        }
    }

    /* compiled from: ContractSignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ContractSignInternalAction {
    }
}
