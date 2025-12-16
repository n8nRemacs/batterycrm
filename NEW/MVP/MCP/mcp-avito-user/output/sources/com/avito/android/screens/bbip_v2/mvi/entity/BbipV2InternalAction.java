package com.avito.android.screens.bbip_v2.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bbip_common.BbipV2PerfScreen;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import com.avito.android.util.ApiException;
import jh.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2InternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BudgetClicked", "CloseScreen", "ConfiguratorContent", "ConfiguratorError", "ConfiguratorLoading", "ContextContent", "ContextError", "ContextLoading", "DurationClicked", "ForecastContent", "ForecastError", "ForecastLoading", "HandleDeeplink", "ShowInfo", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$DurationClicked;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ShowInfo;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BbipV2InternalAction extends n {

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$BudgetClicked;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BudgetClicked implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.a f261530b;

        public BudgetClicked(@k b.a aVar) {
            this.f261530b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BudgetClicked) && L.f(this.f261530b, ((BudgetClicked) obj).f261530b);
        }

        public final int hashCode() {
            return this.f261530b.hashCode();
        }

        @k
        public final String toString() {
            return "BudgetClicked(budget=" + this.f261530b + ')';
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$CloseScreen;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f261531b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1221435171;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorContent implements BbipV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j f261532b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f261533c;

        public ConfiguratorContent(@k j jVar) {
            this.f261532b = jVar;
            BbipV2PerfScreen.f99063d.getClass();
            this.f261533c = BbipV2PerfScreen.f99064e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261533c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f261533c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorContent) && L.f(this.f261532b, ((ConfiguratorContent) obj).f261532b);
        }

        public final int hashCode() {
            return this.f261532b.hashCode();
        }

        @k
        public final String toString() {
            return "ConfiguratorContent(result=" + this.f261532b + ')';
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfiguratorError implements BbipV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f261534b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f261535c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f261536d;

        public ConfiguratorError(@k ApiException apiException) {
            this.f261534b = apiException;
            BbipV2PerfScreen.f99063d.getClass();
            this.f261535c = BbipV2PerfScreen.f99064e;
            this.f261536d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261535c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f261535c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguratorError) && this.f261534b.equals(((ConfiguratorError) obj).f261534b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF163103c() {
            return this.f261536d;
        }

        public final int hashCode() {
            return this.f261534b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ConfiguratorError(error="), this.f261534b, ')');
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ConfiguratorLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfiguratorLoading extends TrackableLoadingStarted implements BbipV2InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f261537d;

        public ConfiguratorLoading() {
            BbipV2PerfScreen.f99063d.getClass();
            this.f261537d = BbipV2PerfScreen.f99064e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261537d;
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextContent implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLinkResponse f261538b;

        public ContextContent(@k DeepLinkResponse deepLinkResponse) {
            this.f261538b = deepLinkResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextContent) && L.f(this.f261538b, ((ContextContent) obj).f261538b);
        }

        public final int hashCode() {
            return this.f261538b.hashCode();
        }

        @k
        public final String toString() {
            return "ContextContent(result=" + this.f261538b + ')';
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextError implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f261539b;

        public ContextError(@k ApiException apiException) {
            this.f261539b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextError) && this.f261539b.equals(((ContextError) obj).f261539b);
        }

        public final int hashCode() {
            return this.f261539b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ContextError(error="), this.f261539b, ')');
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ContextLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContextLoading implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ContextLoading f261540b = new ContextLoading();

        private ContextLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ContextLoading);
        }

        public final int hashCode() {
            return -1294821996;
        }

        @k
        public final String toString() {
            return "ContextLoading";
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$DurationClicked;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DurationClicked implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b.a f261541b;

        public DurationClicked(@k b.a aVar) {
            this.f261541b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DurationClicked) && L.f(this.f261541b, ((DurationClicked) obj).f261541b);
        }

        public final int hashCode() {
            return this.f261541b.hashCode();
        }

        @k
        public final String toString() {
            return "DurationClicked(duration=" + this.f261541b + ')';
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastContent;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastContent implements BbipV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final jh.n f261542b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f261543c;

        static {
            Parcelable.Creator<MnzFloatingFooterContact> creator = MnzFloatingFooterContact.CREATOR;
        }

        public ForecastContent(@k jh.n nVar) {
            this.f261542b = nVar;
            BbipV2PerfScreen.f99063d.getClass();
            this.f261543c = BbipV2PerfScreen.f99065f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261543c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f261543c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForecastContent) && L.f(this.f261542b, ((ForecastContent) obj).f261542b);
        }

        public final int hashCode() {
            return this.f261542b.hashCode();
        }

        @k
        public final String toString() {
            return "ForecastContent(result=" + this.f261542b + ')';
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastError;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ForecastError implements BbipV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f261544b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f261545c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f261546d;

        public ForecastError(@k ApiException apiException) {
            this.f261544b = apiException;
            BbipV2PerfScreen.f99063d.getClass();
            this.f261545c = BbipV2PerfScreen.f99065f;
            this.f261546d = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261545c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f261545c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForecastError) && this.f261544b.equals(((ForecastError) obj).f261544b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF163103c() {
            return this.f261546d;
        }

        public final int hashCode() {
            return this.f261544b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ForecastError(error="), this.f261544b, ')');
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ForecastLoading;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForecastLoading extends TrackableLoadingStarted implements BbipV2InternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f261547d;

        public ForecastLoading() {
            BbipV2PerfScreen.f99063d.getClass();
            this.f261547d = BbipV2PerfScreen.f99065f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF302190d() {
            return this.f261547d;
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$HandleDeeplink;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f261548b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f261548b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f261548b, ((HandleDeeplink) obj).f261548b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f261548b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f261548b, ')');
        }
    }

    /* compiled from: BbipV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction$ShowInfo;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInfo implements BbipV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f261549b;

        public ShowInfo(@l PrintableText printableText) {
            this.f261549b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowInfo) && L.f(this.f261549b, ((ShowInfo) obj).f261549b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f261549b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowInfo(text="), this.f261549b, ')');
        }
    }
}
