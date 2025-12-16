package com.avito.android.comfortable_deal.clients.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.comfortable_deal.clients.model.RequestType;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientsInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChipChange", "ClearData", "CloseArchivingFilterDialog", "DismissArchivingDialog", "Error", "HandleDeeplink", "Loading", "MortgageApplicationReturnToWorkCompleted", "MortgageApplicationReturnToWorkFailed", "MortgageApplicationReturnToWorkStarted", "NewPage", "OpenArchivingDialog", "OpenArchivingFilterDialog", "OpenDeal", "TabChange", "UpdateClientsFilterArchived", "UpdateClientsFilterQuery", "UpdateTabsCounters", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$ChipChange;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$ClearData;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$CloseArchivingFilterDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$DismissArchivingDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$Error;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$HandleDeeplink;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkCompleted;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkFailed;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkStarted;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$NewPage;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenArchivingDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenArchivingFilterDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenDeal;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$TabChange;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateClientsFilterArchived;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateClientsFilterQuery;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateTabsCounters;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ClientsInternalAction extends n {

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$ChipChange;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChipChange implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f120312b;

        public ChipChange(int i12) {
            this.f120312b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChipChange) && this.f120312b == ((ChipChange) obj).f120312b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f120312b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChipChange(index="), this.f120312b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$ClearData;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearData implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f120313b;

        public ClearData() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearData) && this.f120313b == ((ClearData) obj).f120313b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f120313b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ClearData(clearCounters="), this.f120313b, ')');
        }

        public ClearData(boolean z12) {
            this.f120313b = z12;
        }

        public /* synthetic */ ClearData(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$CloseArchivingFilterDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseArchivingFilterDialog implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseArchivingFilterDialog f120314b = new CloseArchivingFilterDialog();

        private CloseArchivingFilterDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseArchivingFilterDialog);
        }

        public final int hashCode() {
            return 2112094739;
        }

        @k
        public final String toString() {
            return "CloseArchivingFilterDialog";
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$DismissArchivingDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DismissArchivingDialog implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissArchivingDialog f120315b = new DismissArchivingDialog();

        private DismissArchivingDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DismissArchivingDialog);
        }

        public final int hashCode() {
            return -1721130775;
        }

        @k
        public final String toString() {
            return "DismissArchivingDialog";
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$Error;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ClientsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f120316b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f120317c;

        public Error(@k ApiError apiError) {
            this.f120316b = apiError;
            this.f120317c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Error) && L.f(this.f120316b, ((Error) obj).f120316b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97162c() {
            return this.f120317c;
        }

        public final int hashCode() {
            return this.f120316b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f120316b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$HandleDeeplink;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f120318b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f120318b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f120318b, ((HandleDeeplink) obj).f120318b);
        }

        public final int hashCode() {
            return this.f120318b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f120318b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ClientsInternalAction {
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkCompleted;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageApplicationReturnToWorkCompleted implements ClientsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f120319b;

        public MortgageApplicationReturnToWorkCompleted(boolean z12) {
            this.f120319b = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF202133d() {
            return "MORTGAGE_APPLICATION_RETURN_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "MORTGAGE_APPLICATION_RETURN_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageApplicationReturnToWorkCompleted) && this.f120319b == ((MortgageApplicationReturnToWorkCompleted) obj).f120319b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f120319b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("MortgageApplicationReturnToWorkCompleted(isSuccess="), this.f120319b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkFailed;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageApplicationReturnToWorkFailed implements ClientsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f120320b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f120321c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f120322d = "MORTGAGE_APPLICATION_RETURN_CONTENT_TYPE";

        public MortgageApplicationReturnToWorkFailed(@k ApiError apiError) {
            this.f120320b = apiError;
            this.f120321c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF202133d() {
            return this.f120322d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f120322d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageApplicationReturnToWorkFailed) && L.f(this.f120320b, ((MortgageApplicationReturnToWorkFailed) obj).f120320b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97162c() {
            return this.f120321c;
        }

        public final int hashCode() {
            return this.f120320b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("MortgageApplicationReturnToWorkFailed(error="), this.f120320b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$MortgageApplicationReturnToWorkStarted;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MortgageApplicationReturnToWorkStarted extends TrackableLoadingStarted implements ClientsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f120323d = "MORTGAGE_APPLICATION_RETURN_CONTENT_TYPE";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF202133d() {
            return this.f120323d;
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$NewPage;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewPage implements ClientsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ClientCardData> f120324b;

        /* renamed from: c, reason: collision with root package name */
        public final int f120325c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f120326d;

        public NewPage(@k List<ClientCardData> list, int i12, @l DeepLink deepLink) {
            this.f120324b = list;
            this.f120325c = i12;
            this.f120326d = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            if (!(obj instanceof NewPage)) {
                return false;
            }
            NewPage newPage = (NewPage) obj;
            return L.f(this.f120324b, newPage.f120324b) && this.f120325c == newPage.f120325c && L.f(this.f120326d, newPage.f120326d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f120325c, this.f120324b.hashCode() * 31, 31);
            DeepLink deepLink = this.f120326d;
            return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NewPage(data=");
            sb2.append(this.f120324b);
            sb2.append(", page=");
            sb2.append(this.f120325c);
            sb2.append(", mortgageEntryPoint=");
            return a.v(sb2, this.f120326d, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenArchivingDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenArchivingDialog implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f120327b;

        public OpenArchivingDialog(@k String str) {
            this.f120327b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenArchivingDialog) && L.f(this.f120327b, ((OpenArchivingDialog) obj).f120327b);
        }

        public final int hashCode() {
            return this.f120327b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenArchivingDialog(clientId="), this.f120327b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenArchivingFilterDialog;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenArchivingFilterDialog implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenArchivingFilterDialog f120328b = new OpenArchivingFilterDialog();

        private OpenArchivingFilterDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenArchivingFilterDialog);
        }

        public final int hashCode() {
            return -98350039;
        }

        @k
        public final String toString() {
            return "OpenArchivingFilterDialog";
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$OpenDeal;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeal implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f120329b;

        public OpenDeal(@k String str) {
            this.f120329b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeal) && L.f(this.f120329b, ((OpenDeal) obj).f120329b);
        }

        public final int hashCode() {
            return this.f120329b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDeal(dealId="), this.f120329b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$TabChange;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TabChange implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f120330b;

        public TabChange(int i12) {
            this.f120330b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabChange) && this.f120330b == ((TabChange) obj).f120330b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f120330b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("TabChange(index="), this.f120330b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateClientsFilterArchived;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClientsFilterArchived implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f120331b;

        public UpdateClientsFilterArchived(boolean z12) {
            this.f120331b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClientsFilterArchived) && this.f120331b == ((UpdateClientsFilterArchived) obj).f120331b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f120331b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateClientsFilterArchived(isArchived="), this.f120331b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateClientsFilterQuery;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClientsFilterQuery implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f120332b;

        public UpdateClientsFilterQuery(@k String str) {
            this.f120332b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClientsFilterQuery) && L.f(this.f120332b, ((UpdateClientsFilterQuery) obj).f120332b);
        }

        public final int hashCode() {
            return this.f120332b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateClientsFilterQuery(query="), this.f120332b, ')');
        }
    }

    /* compiled from: ClientsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction$UpdateTabsCounters;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTabsCounters implements ClientsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<RequestType, Integer> f120333b;

        public UpdateTabsCounters(@k Map<RequestType, Integer> map) {
            this.f120333b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTabsCounters) && L.f(this.f120333b, ((UpdateTabsCounters) obj).f120333b);
        }

        public final int hashCode() {
            return this.f120333b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("UpdateTabsCounters(counters="), this.f120333b, ')');
        }
    }
}
