package com.avito.android.mortgage.pre_approval.result.mvi.entity;

import AK.c;
import JZ.o;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.remote.error.ApiError;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalResultInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseFlow", "GetApplicationLoadingCompleted", "GetApplicationLoadingFailed", "GetApplicationLoadingStarted", "Init", "Retry", "ScoreLoadingCompleted", "ScoreLoadingFailed", "ScoreLoadingStarted", "TimerTick", "ToggleExpandableBlock", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$Init;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$Retry;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$TimerTick;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ToggleExpandableBlock;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PreApprovalResultInternalAction extends n {

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseFlow implements PreApprovalResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseFlow f202121b = new CloseFlow();

        private CloseFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseFlow);
        }

        public final int hashCode() {
            return 1699340602;
        }

        @k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GetApplicationLoadingCompleted implements PreApprovalResultInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f202122b;

        public GetApplicationLoadingCompleted(@k String str) {
            this.f202122b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF288444d() {
            return "application_create";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "application_create";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetApplicationLoadingCompleted) && L.f(this.f202122b, ((GetApplicationLoadingCompleted) obj).f202122b);
        }

        public final int hashCode() {
            return this.f202122b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("GetApplicationLoadingCompleted(applicationId="), this.f202122b, ')');
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GetApplicationLoadingFailed implements PreApprovalResultInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f202123b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f202124c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f202125d = "application_create";

        public GetApplicationLoadingFailed(@k ApiError apiError) {
            this.f202123b = apiError;
            this.f202124c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF288444d() {
            return this.f202125d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f202125d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetApplicationLoadingFailed) && L.f(this.f202123b, ((GetApplicationLoadingFailed) obj).f202123b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF183997c() {
            return this.f202124c;
        }

        public final int hashCode() {
            return this.f202123b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("GetApplicationLoadingFailed(error="), this.f202123b, ')');
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$GetApplicationLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetApplicationLoadingStarted extends TrackableLoadingStarted implements PreApprovalResultInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f202126d = "application_create";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF288444d() {
            return this.f202126d;
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$Init;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements PreApprovalResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreApprovalArguments f202127b;

        public Init(@k PreApprovalArguments preApprovalArguments) {
            this.f202127b = preApprovalArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f202127b, ((Init) obj).f202127b);
        }

        public final int hashCode() {
            return this.f202127b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f202127b + ')';
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$Retry;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Retry implements PreApprovalResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Retry f202128b = new Retry();

        private Retry() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -696023396;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScoreLoadingCompleted implements PreApprovalResultInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o f202129b;

        public ScoreLoadingCompleted(@k o oVar) {
            this.f202129b = oVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF288444d() {
            return "score";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "score";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScoreLoadingCompleted) && L.f(this.f202129b, ((ScoreLoadingCompleted) obj).f202129b);
        }

        public final int hashCode() {
            return this.f202129b.hashCode();
        }

        @k
        public final String toString() {
            return "ScoreLoadingCompleted(score=" + this.f202129b + ')';
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScoreLoadingFailed implements PreApprovalResultInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f202130b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f202131c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f202132d = "score";

        public ScoreLoadingFailed(@k ApiError apiError) {
            this.f202130b = apiError;
            this.f202131c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF288444d() {
            return this.f202132d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f202132d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScoreLoadingFailed) && L.f(this.f202130b, ((ScoreLoadingFailed) obj).f202130b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF183997c() {
            return this.f202131c;
        }

        public final int hashCode() {
            return this.f202130b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ScoreLoadingFailed(error="), this.f202130b, ')');
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ScoreLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScoreLoadingStarted extends TrackableLoadingStarted implements PreApprovalResultInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f202133d = "score";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF288444d() {
            return this.f202133d;
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$TimerTick;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimerTick implements PreApprovalResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40507d.a f202134b;

        public TimerTick(@k InterfaceC40507d.a aVar) {
            this.f202134b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimerTick) && this.f202134b.equals(((TimerTick) obj).f202134b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f202134b.f396214a);
        }

        @k
        public final String toString() {
            return "TimerTick(timerTime=" + this.f202134b + ')';
        }
    }

    /* compiled from: PreApprovalResultInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction$ToggleExpandableBlock;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleExpandableBlock implements PreApprovalResultInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ToggleExpandableBlock f202135b = new ToggleExpandableBlock();

        private ToggleExpandableBlock() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ToggleExpandableBlock);
        }

        public final int hashCode() {
            return 1608637433;
        }

        @k
        public final String toString() {
            return "ToggleExpandableBlock";
        }
    }
}
