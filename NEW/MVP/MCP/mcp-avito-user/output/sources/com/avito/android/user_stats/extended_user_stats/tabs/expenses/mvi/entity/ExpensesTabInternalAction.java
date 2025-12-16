package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.user_stats.model.extended_user_stats.StatsCommonExpenses;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpensesTabInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "ErrorExpenses", "HandleDeeplink", "Loading", "OnColumnClick", "OnExpenseClick", "ShowLoadingIfEmptyData", "ShowVisitUxFeedback", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$Content;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ErrorExpenses;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$HandleDeeplink;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$Loading;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$OnColumnClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$OnExpenseClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ShowLoadingIfEmptyData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ShowVisitUxFeedback;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ExpensesTabInternalAction extends n {

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$Content;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ExpensesTabInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StatsCommonExpenses f317813b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f317814c;

        public Content(@k StatsCommonExpenses statsCommonExpenses, @l StatsConfig statsConfig) {
            this.f317813b = statsCommonExpenses;
            this.f317814c = statsConfig;
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f317813b, content.f317813b) && L.f(this.f317814c, content.f317814c);
        }

        public final int hashCode() {
            int iHashCode = this.f317813b.hashCode() * 31;
            StatsConfig statsConfig = this.f317814c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f317813b + ", config=" + this.f317814c + ')';
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ErrorExpenses;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorExpenses implements ExpensesTabInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f317815b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final StatsConfig f317816c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f317817d;

        public ErrorExpenses(@k ApiError apiError, @l StatsConfig statsConfig) {
            this.f317815b = apiError;
            this.f317816c = statsConfig;
            this.f317817d = new J.a(apiError);
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
            if (!(obj instanceof ErrorExpenses)) {
                return false;
            }
            ErrorExpenses errorExpenses = (ErrorExpenses) obj;
            return L.f(this.f317815b, errorExpenses.f317815b) && L.f(this.f317816c, errorExpenses.f317816c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF296715c() {
            return this.f317817d;
        }

        public final int hashCode() {
            int iHashCode = this.f317815b.hashCode() * 31;
            StatsConfig statsConfig = this.f317816c;
            return iHashCode + (statsConfig == null ? 0 : statsConfig.hashCode());
        }

        @k
        public final String toString() {
            return "ErrorExpenses(throwable=" + this.f317815b + ", config=" + this.f317816c + ')';
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$HandleDeeplink;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ExpensesTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f317818b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f317818b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f317818b, ((HandleDeeplink) obj).f317818b);
        }

        public final int hashCode() {
            return this.f317818b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f317818b, ')');
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$Loading;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ExpensesTabInternalAction {
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$OnColumnClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnColumnClick implements ExpensesTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f317819b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f317820c;

        public OnColumnClick(@l Integer num, @l String str) {
            this.f317819b = num;
            this.f317820c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnColumnClick)) {
                return false;
            }
            OnColumnClick onColumnClick = (OnColumnClick) obj;
            return L.f(this.f317819b, onColumnClick.f317819b) && L.f(this.f317820c, onColumnClick.f317820c);
        }

        public final int hashCode() {
            Integer num = this.f317819b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f317820c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnColumnClick(index=");
            sb2.append(this.f317819b);
            sb2.append(", period=");
            return C22026a.c(sb2, this.f317820c, ')');
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$OnExpenseClick;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnExpenseClick implements ExpensesTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f317821b;

        public OnExpenseClick(@k String str) {
            this.f317821b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnExpenseClick) && L.f(this.f317821b, ((OnExpenseClick) obj).f317821b);
        }

        public final int hashCode() {
            return this.f317821b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnExpenseClick(stringId="), this.f317821b, ')');
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ShowLoadingIfEmptyData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadingIfEmptyData implements ExpensesTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingIfEmptyData f317822b = new ShowLoadingIfEmptyData();

        private ShowLoadingIfEmptyData() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoadingIfEmptyData);
        }

        public final int hashCode() {
            return 1336066753;
        }

        @k
        public final String toString() {
            return "ShowLoadingIfEmptyData";
        }
    }

    /* compiled from: ExpensesTabInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction$ShowVisitUxFeedback;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowVisitUxFeedback implements ExpensesTabInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowVisitUxFeedback f317823b = new ShowVisitUxFeedback();

        private ShowVisitUxFeedback() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowVisitUxFeedback);
        }

        public final int hashCode() {
            return -1910713808;
        }

        @k
        public final String toString() {
            return "ShowVisitUxFeedback";
        }
    }
}
