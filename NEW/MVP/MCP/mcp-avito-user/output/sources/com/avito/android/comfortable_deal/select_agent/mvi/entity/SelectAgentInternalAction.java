package com.avito.android.comfortable_deal.select_agent.mvi.entity;

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
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.remote.error.ApiError;
import dp.C39772a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAgentInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AgentsLoaded", "CloseDialog", "Init", "LoadingError", "SelectAgent", "StartLoading", "SubmitError", "SubmitStarted", "SubmitSuccess", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$AgentsLoaded;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$CloseDialog;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$Init;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SelectAgent;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitError;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitStarted;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitSuccess;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SelectAgentInternalAction extends n {

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$AgentsLoaded;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgentsLoaded implements SelectAgentInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C39772a> f122756b;

        public AgentsLoaded(@k List<C39772a> list) {
            this.f122756b = list;
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
            return (obj instanceof AgentsLoaded) && L.f(this.f122756b, ((AgentsLoaded) obj).f122756b);
        }

        public final int hashCode() {
            return this.f122756b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("AgentsLoaded(data="), this.f122756b, ')');
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$CloseDialog;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f122757b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return -1782338529;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$Init;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectAgentArguments f122758b;

        public Init(@k SelectAgentArguments selectAgentArguments) {
            this.f122758b = selectAgentArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f122758b, ((Init) obj).f122758b);
        }

        public final int hashCode() {
            return this.f122758b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f122758b + ')';
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements SelectAgentInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122759b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f122760c;

        public LoadingError(@k ApiError apiError) {
            this.f122759b = apiError;
            this.f122760c = new J.a(apiError);
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
            return (obj instanceof LoadingError) && L.f(this.f122759b, ((LoadingError) obj).f122759b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF326393d() {
            return this.f122760c;
        }

        public final int hashCode() {
            return this.f122759b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f122759b, ')');
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SelectAgent;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectAgent implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122761b;

        public SelectAgent(@l String str) {
            this.f122761b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectAgent) && L.f(this.f122761b, ((SelectAgent) obj).f122761b);
        }

        public final int hashCode() {
            String str = this.f122761b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectAgent(agentId="), this.f122761b, ')');
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements SelectAgentInternalAction {
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitError;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitError implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122762b;

        public SubmitError(@k ApiError apiError) {
            this.f122762b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitError) && L.f(this.f122762b, ((SubmitError) obj).f122762b);
        }

        public final int hashCode() {
            return this.f122762b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SubmitError(error="), this.f122762b, ')');
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitStarted;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitStarted implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitStarted f122763b = new SubmitStarted();

        private SubmitStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitStarted);
        }

        public final int hashCode() {
            return 1995855944;
        }

        @k
        public final String toString() {
            return "SubmitStarted";
        }
    }

    /* compiled from: SelectAgentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction$SubmitSuccess;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements SelectAgentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitSuccess f122764b = new SubmitSuccess();

        private SubmitSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitSuccess);
        }

        public final int hashCode() {
            return 2025871306;
        }

        @k
        public final String toString() {
            return "SubmitSuccess";
        }
    }
}
