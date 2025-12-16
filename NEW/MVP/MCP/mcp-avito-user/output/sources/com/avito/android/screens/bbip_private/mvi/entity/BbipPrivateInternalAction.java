package com.avito.android.screens.bbip_private.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bbip_common.BbipPrivatePerfScreen;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import com.avito.android.util.ApiException;
import jh.C42376A;
import jh.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BudgetClicked", "BudgetWidgetClicked", "CloseScreen", "ConfiguratorContent", "ConfiguratorError", "ConfiguratorLoading", "ContextContent", "ContextError", "ContextLoading", "DurationClicked", "ForecastContent", "ForecastError", "ForecastLoading", "HandleDeeplink", "ScrollToScreenTop", "ShowMnzUxFeedback", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$BudgetWidgetClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$DurationClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ScrollToScreenTop;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ShowMnzUxFeedback;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BbipPrivateInternalAction extends n {

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BudgetClicked implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BbipPrivateBudgetItem.Budget f260586b;

        public BudgetClicked(@k BbipPrivateBudgetItem.Budget budget) {
            this.f260586b = budget;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BudgetClicked) && L.f(this.f260586b, ((BudgetClicked) obj).f260586b);
        }

        public final int hashCode() {
            return this.f260586b.hashCode();
        }

        @k
        public final String toString() {
            return "BudgetClicked(budget=" + this.f260586b + ')';
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$BudgetWidgetClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BudgetWidgetClicked implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BbipPrivateBudgetWidgetItem.Budget f260587b;

        public BudgetWidgetClicked(@k BbipPrivateBudgetWidgetItem.Budget budget) {
            this.f260587b = budget;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BudgetWidgetClicked) && L.f(this.f260587b, ((BudgetWidgetClicked) obj).f260587b);
        }

        public final int hashCode() {
            return this.f260587b.hashCode();
        }

        @k
        public final String toString() {
            return "BudgetWidgetClicked(budget=" + this.f260587b + ')';
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f260588b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorContent implements BbipPrivateInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final v f260589b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f260590c;

        public ConfiguratorContent(@k v vVar) {
            this.f260589b = vVar;
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260590c = BbipPrivatePerfScreen.f99061e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260590c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260590c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorContent) && L.f(this.f260589b, ((ConfiguratorContent) obj).f260589b);
        }

        public final int hashCode() {
            return this.f260589b.hashCode();
        }

        @k
        public final String toString() {
            return "ConfiguratorContent(result=" + this.f260589b + ')';
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorError implements BbipPrivateInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f260591b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f260592c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f260593d;

        public ConfiguratorError(@k ApiException apiException) {
            this.f260591b = apiException;
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260592c = BbipPrivatePerfScreen.f99061e;
            this.f260593d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260592c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260592c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorError) && this.f260591b.equals(((ConfiguratorError) obj).f260591b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF124443d() {
            return this.f260593d;
        }

        public final int hashCode() {
            return this.f260591b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ConfiguratorError(throwable="), this.f260591b, ')');
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ConfiguratorLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfiguratorLoading extends TrackableLoadingStarted implements BbipPrivateInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f260594d;

        public ConfiguratorLoading() {
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260594d = BbipPrivatePerfScreen.f99061e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260594d;
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextContent implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLinkResponse f260595b;

        public ContextContent(@k DeepLinkResponse deepLinkResponse) {
            this.f260595b = deepLinkResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextContent) && L.f(this.f260595b, ((ContextContent) obj).f260595b);
        }

        public final int hashCode() {
            return this.f260595b.hashCode();
        }

        @k
        public final String toString() {
            return "ContextContent(result=" + this.f260595b + ')';
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextError implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f260596b;

        public ContextError(@k ApiException apiException) {
            this.f260596b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextError) && this.f260596b.equals(((ContextError) obj).f260596b);
        }

        public final int hashCode() {
            return this.f260596b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ContextError(throwable="), this.f260596b, ')');
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextLoading implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f260597b;

        /* JADX WARN: Multi-variable type inference failed */
        public ContextLoading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextLoading) && L.f(this.f260597b, ((ContextLoading) obj).f260597b);
        }

        public final int hashCode() {
            Integer num = this.f260597b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ContextLoading(buttonId="), this.f260597b, ')');
        }

        public ContextLoading(@l Integer num) {
            this.f260597b = num;
        }

        public /* synthetic */ ContextLoading(Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num);
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$DurationClicked;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DurationClicked implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f260598b;

        public DurationClicked(int i12) {
            this.f260598b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DurationClicked) && this.f260598b == ((DurationClicked) obj).f260598b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f260598b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("DurationClicked(duration="), this.f260598b, ')');
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastContent implements BbipPrivateInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42376A f260599b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f260600c;

        public ForecastContent(@k C42376A c42376a) {
            this.f260599b = c42376a;
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260600c = BbipPrivatePerfScreen.f99062f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260600c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260600c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForecastContent) && L.f(this.f260599b, ((ForecastContent) obj).f260599b);
        }

        public final int hashCode() {
            return this.f260599b.hashCode();
        }

        @k
        public final String toString() {
            return "ForecastContent(result=" + this.f260599b + ')';
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastError implements BbipPrivateInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f260601b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f260602c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f260603d;

        public ForecastError(@k ApiException apiException) {
            this.f260601b = apiException;
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260602c = BbipPrivatePerfScreen.f99062f;
            this.f260603d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260602c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260602c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForecastError) && this.f260601b.equals(((ForecastError) obj).f260601b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF124443d() {
            return this.f260603d;
        }

        public final int hashCode() {
            return this.f260601b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ForecastError(throwable="), this.f260601b, ')');
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForecastLoading extends TrackableLoadingStarted implements BbipPrivateInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f260604d;

        public ForecastLoading() {
            BbipPrivatePerfScreen.f99060d.getClass();
            this.f260604d = BbipPrivatePerfScreen.f99062f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f260604d;
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f260605b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f260605b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f260605b, ((HandleDeeplink) obj).f260605b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f260605b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f260605b, ')');
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ScrollToScreenTop;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScrollToScreenTop implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrollToScreenTop f260606b = new ScrollToScreenTop();

        private ScrollToScreenTop() {
        }
    }

    /* compiled from: BbipPrivateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction$ShowMnzUxFeedback;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMnzUxFeedback implements BbipPrivateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f260607b;

        public ShowMnzUxFeedback(@k String str) {
            this.f260607b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMnzUxFeedback) && L.f(this.f260607b, ((ShowMnzUxFeedback) obj).f260607b);
        }

        public final int hashCode() {
            return this.f260607b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMnzUxFeedback(campaignName="), this.f260607b, ')');
        }
    }
}
