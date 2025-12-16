package com.avito.android.mortgage_invite.client_search.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientSearchInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "CreateNewClient", "Init", "PageLoadingCompleted", "PageLoadingFailed", "PageLoadingStarted", "SelectClient", "UpdateSearchQuery", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$Back;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$CreateNewClient;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$Init;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingCompleted;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingFailed;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$SelectClient;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$UpdateSearchQuery;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ClientSearchInternalAction extends n {

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$Back;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements ClientSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f205429b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -833243727;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$CreateNewClient;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateNewClient implements ClientSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateNewClient f205430b = new CreateNewClient();

        private CreateNewClient() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateNewClient);
        }

        public final int hashCode() {
            return 1086224613;
        }

        @k
        public final String toString() {
            return "CreateNewClient";
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$Init;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements ClientSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f205431b;

        public Init(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f205431b = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f205431b, ((Init) obj).f205431b);
        }

        public final int hashCode() {
            return this.f205431b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f205431b + ')';
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingCompleted;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoadingCompleted implements ClientSearchInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MortgageClient> f205432b;

        public PageLoadingCompleted(@k List<MortgageClient> list) {
            this.f205432b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof PageLoadingCompleted) && L.f(this.f205432b, ((PageLoadingCompleted) obj).f205432b);
        }

        public final int hashCode() {
            return this.f205432b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PageLoadingCompleted(content="), this.f205432b, ')');
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingFailed;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoadingFailed implements ClientSearchInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f205433b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f205434c;

        public PageLoadingFailed(@k ApiError apiError) {
            this.f205433b = apiError;
            this.f205434c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof PageLoadingFailed) && L.f(this.f205433b, ((PageLoadingFailed) obj).f205433b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF184125c() {
            return this.f205434c;
        }

        public final int hashCode() {
            return this.f205433b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("PageLoadingFailed(error="), this.f205433b, ')');
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$PageLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoadingStarted extends TrackableLoadingStarted implements ClientSearchInternalAction {
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$SelectClient;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectClient implements ClientSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClient f205435b;

        public SelectClient(@k MortgageClient mortgageClient) {
            this.f205435b = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectClient) && L.f(this.f205435b, ((SelectClient) obj).f205435b);
        }

        public final int hashCode() {
            return this.f205435b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectClient(client=" + this.f205435b + ')';
        }
    }

    /* compiled from: ClientSearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction$UpdateSearchQuery;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSearchQuery implements ClientSearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f205436b;

        public UpdateSearchQuery(@k String str) {
            this.f205436b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSearchQuery) && L.f(this.f205436b, ((UpdateSearchQuery) obj).f205436b);
        }

        public final int hashCode() {
            return this.f205436b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateSearchQuery(query="), this.f205436b, ')');
        }
    }
}
