package com.avito.android.screens.bbip_private_v2.mvi.entity;

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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip_private_v2.di.BbipPrivateV2PerformanceScreen;
import com.avito.android.util.ApiException;
import jh.C42376A;
import jh.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateV2InternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BudgetClicked", "BudgetSliderChange", "CloseScreen", "ConfiguratorContent", "ConfiguratorError", "ConfiguratorLoading", "ContextContent", "ContextError", "ContextLoading", "ForecastContent", "ForecastError", "ForecastLoading", "ForecastRequired", "HandleDeeplink", "OnPresetClicked", "OnSegmentClicked", "SelectDuration", "SetDurationPickerShown", "ShowMnzUxFeedback", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$BudgetSliderChange;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorLoading;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastRequired;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$OnPresetClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$OnSegmentClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$SelectDuration;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$SetDurationPickerShown;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ShowMnzUxFeedback;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BbipPrivateV2InternalAction extends n {

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BudgetClicked implements BbipPrivateV2InternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BudgetClicked)) {
                return false;
            }
            ((BudgetClicked) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "BudgetClicked(budget=null)";
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$BudgetSliderChange;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BudgetSliderChange implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f260986b;

        public BudgetSliderChange(float f12) {
            this.f260986b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BudgetSliderChange) && Float.compare(this.f260986b, ((BudgetSliderChange) obj).f260986b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f260986b);
        }

        @k
        public final String toString() {
            return r.k(')', this.f260986b, new StringBuilder("BudgetSliderChange(value="));
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f260987b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1689351340;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorContent implements BbipPrivateV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final v f260988b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f260989c;

        public ConfiguratorContent(@k v vVar) {
            this.f260988b = vVar;
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f260989c = BbipPrivateV2PerformanceScreen.f260887e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f260989c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260989c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorContent) && L.f(this.f260988b, ((ConfiguratorContent) obj).f260988b);
        }

        public final int hashCode() {
            return this.f260988b.hashCode();
        }

        @k
        public final String toString() {
            return "ConfiguratorContent(data=" + this.f260988b + ')';
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorError implements BbipPrivateV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f260990b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f260991c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f260992d;

        public ConfiguratorError(@k ApiException apiException) {
            this.f260990b = apiException;
            this.f260991c = new J.a(apiException);
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f260992d = BbipPrivateV2PerformanceScreen.f260887e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f260992d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260992d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorError) && this.f260990b.equals(((ConfiguratorError) obj).f260990b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF317005c() {
            return this.f260991c;
        }

        public final int hashCode() {
            return this.f260990b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ConfiguratorError(error="), this.f260990b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ConfiguratorLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfiguratorLoading extends TrackableLoadingStarted implements BbipPrivateV2InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f260993d;

        public ConfiguratorLoading() {
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f260993d = BbipPrivateV2PerformanceScreen.f260887e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f260993d;
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextContent implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLinkResponse f260994b;

        public ContextContent(@k DeepLinkResponse deepLinkResponse) {
            this.f260994b = deepLinkResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextContent) && L.f(this.f260994b, ((ContextContent) obj).f260994b);
        }

        public final int hashCode() {
            return this.f260994b.hashCode();
        }

        @k
        public final String toString() {
            return "ContextContent(result=" + this.f260994b + ')';
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextError implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f260995b;

        public ContextError(@k ApiException apiException) {
            this.f260995b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextError) && this.f260995b.equals(((ContextError) obj).f260995b);
        }

        public final int hashCode() {
            return this.f260995b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ContextError(throwable="), this.f260995b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContextLoading implements BbipPrivateV2InternalAction {
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastContent implements BbipPrivateV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42376A f260996b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f260997c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f260998d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f260999e;

        public ForecastContent(@k C42376A c42376a, @l Integer num, boolean z12) {
            this.f260996b = c42376a;
            this.f260997c = num;
            this.f260998d = z12;
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f260999e = BbipPrivateV2PerformanceScreen.f260888f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f260999e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f260999e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForecastContent)) {
                return false;
            }
            ForecastContent forecastContent = (ForecastContent) obj;
            return L.f(this.f260996b, forecastContent.f260996b) && L.f(this.f260997c, forecastContent.f260997c) && this.f260998d == forecastContent.f260998d;
        }

        public final int hashCode() {
            int iHashCode = this.f260996b.hashCode() * 31;
            Integer num = this.f260997c;
            return Boolean.hashCode(this.f260998d) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForecastContent(result=");
            sb2.append(this.f260996b);
            sb2.append(", duration=");
            sb2.append(this.f260997c);
            sb2.append(", fromDatePicker=");
            return r.x(sb2, this.f260998d, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastError implements BbipPrivateV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f261000b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f261001c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f261002d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f261003e;

        public ForecastError(@k ApiException apiException, boolean z12) {
            this.f261000b = apiException;
            this.f261001c = z12;
            this.f261002d = new J.a(apiException);
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f261003e = BbipPrivateV2PerformanceScreen.f260888f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f261003e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f261003e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForecastError)) {
                return false;
            }
            ForecastError forecastError = (ForecastError) obj;
            return this.f261000b.equals(forecastError.f261000b) && this.f261001c == forecastError.f261001c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF317005c() {
            return this.f261002d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f261001c) + (this.f261000b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForecastError(throwable=");
            sb2.append(this.f261000b);
            sb2.append(", fromDatePicker=");
            return r.x(sb2, this.f261001c, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForecastLoading extends TrackableLoadingStarted implements BbipPrivateV2InternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f261004d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f261005e;

        public ForecastLoading(boolean z12) {
            this.f261004d = z12;
            BbipPrivateV2PerformanceScreen.f260886d.getClass();
            this.f261005e = BbipPrivateV2PerformanceScreen.f260888f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF220167d() {
            return this.f261005e;
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ForecastRequired;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastRequired implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f261006b;

        public ForecastRequired() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForecastRequired) && L.f(this.f261006b, ((ForecastRequired) obj).f261006b);
        }

        public final int hashCode() {
            Integer num = this.f261006b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ForecastRequired(duration="), this.f261006b, ')');
        }

        public ForecastRequired(Integer num, int i12, C42822w c42822w) {
            this.f261006b = (i12 & 1) != 0 ? null : num;
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f261007b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f261007b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f261007b, ((HandleDeeplink) obj).f261007b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f261007b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f261007b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$OnPresetClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPresetClicked implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f261008b;

        public OnPresetClicked(int i12) {
            this.f261008b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPresetClicked) && this.f261008b == ((OnPresetClicked) obj).f261008b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261008b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnPresetClicked(index="), this.f261008b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$OnSegmentClicked;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSegmentClicked implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f261009b;

        public OnSegmentClicked(int i12) {
            this.f261009b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSegmentClicked) && this.f261009b == ((OnSegmentClicked) obj).f261009b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261009b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnSegmentClicked(index="), this.f261009b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$SelectDuration;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectDuration implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f261010b;

        public SelectDuration(int i12) {
            this.f261010b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectDuration) && this.f261010b == ((SelectDuration) obj).f261010b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261010b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectDuration(duration="), this.f261010b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$SetDurationPickerShown;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetDurationPickerShown implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f261011b;

        public SetDurationPickerShown(boolean z12) {
            this.f261011b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetDurationPickerShown) && this.f261011b == ((SetDurationPickerShown) obj).f261011b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f261011b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetDurationPickerShown(isShown="), this.f261011b, ')');
        }
    }

    /* compiled from: BbipPrivateV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction$ShowMnzUxFeedback;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMnzUxFeedback implements BbipPrivateV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f261012b;

        public ShowMnzUxFeedback(@k String str) {
            this.f261012b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMnzUxFeedback) && L.f(this.f261012b, ((ShowMnzUxFeedback) obj).f261012b);
        }

        public final int hashCode() {
            return this.f261012b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMnzUxFeedback(campaignName="), this.f261012b, ')');
        }
    }
}
