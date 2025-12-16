package com.avito.android.tariff.cpa.info.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import bC0.f;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import dC0.AbstractC39559a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaInfoInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "InputChange", "MainContent", "MainDelayedContent", "MainDelayedError", "MainDelayedLoading", "MainDelayedPreLoading", "MainError", "MainLoading", "OpenDeeplink", "OpenDialog", "Redirect", "RefillContent", "RefillError", "RefillLoading", "ShowErrorRefillMsg", "ShowPaymentMsg", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$CloseScreen;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$InputChange;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedLoading;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedPreLoading;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainLoading;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$OpenDeeplink;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$OpenDialog;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$Redirect;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillLoading;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$ShowErrorRefillMsg;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$ShowPaymentMsg;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CpaInfoInternalAction extends n {

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$CloseScreen;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f294743b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$InputChange;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f294744b;

        public InputChange(@k String str) {
            this.f294744b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChange) && L.f(this.f294744b, ((InputChange) obj).f294744b);
        }

        public final int hashCode() {
            return this.f294744b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(input="), this.f294744b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainContent implements CpaInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC39559a.b f294745b;

        public MainContent(@k AbstractC39559a.b bVar) {
            this.f294745b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof MainContent) && L.f(this.f294745b, ((MainContent) obj).f294745b);
        }

        public final int hashCode() {
            return this.f294745b.hashCode();
        }

        @k
        public final String toString() {
            return "MainContent(data=" + this.f294745b + ')';
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainDelayedContent implements CpaInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC39559a.b f294746b;

        public MainDelayedContent(@k AbstractC39559a.b bVar) {
            this.f294746b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF212874d() {
            return "tariffCpaInfoDelayed";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "tariffCpaInfoDelayed";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MainDelayedContent) && L.f(this.f294746b, ((MainDelayedContent) obj).f294746b);
        }

        public final int hashCode() {
            return this.f294746b.hashCode();
        }

        @k
        public final String toString() {
            return "MainDelayedContent(data=" + this.f294746b + ')';
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainDelayedError implements CpaInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f294747b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f294748c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f294749d = "tariffCpaInfoDelayed";

        public MainDelayedError(@k ApiError apiError) {
            this.f294747b = apiError;
            this.f294748c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212874d() {
            return this.f294749d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f294749d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MainDelayedError) && L.f(this.f294747b, ((MainDelayedError) obj).f294747b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287702c() {
            return this.f294748c;
        }

        public final int hashCode() {
            return this.f294747b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("MainDelayedError(error="), this.f294747b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainDelayedLoading extends TrackableLoadingStarted implements CpaInfoInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f294750d = "tariffCpaInfoDelayed";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212874d() {
            return this.f294750d;
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainDelayedPreLoading;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainDelayedPreLoading implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MainDelayedPreLoading f294751b = new MainDelayedPreLoading();

        private MainDelayedPreLoading() {
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainError implements CpaInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f294752b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f294753c;

        public MainError(@k ApiError apiError) {
            this.f294752b = apiError;
            this.f294753c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            return (obj instanceof MainError) && L.f(this.f294752b, ((MainError) obj).f294752b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287702c() {
            return this.f294753c;
        }

        public final int hashCode() {
            return this.f294752b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("MainError(error="), this.f294752b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$MainLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainLoading extends TrackableLoadingStarted implements CpaInfoInternalAction {
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$OpenDeeplink;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f294754b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f294754b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f294754b, ((OpenDeeplink) obj).f294754b);
        }

        public final int hashCode() {
            return this.f294754b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f294754b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$OpenDialog;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDialog implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.tariff.cpa.info.ui.items.balance_info.a f294755b;

        public OpenDialog(@k com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar) {
            this.f294755b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDialog) && L.f(this.f294755b, ((OpenDialog) obj).f294755b);
        }

        public final int hashCode() {
            return this.f294755b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDialog(data=" + this.f294755b + ')';
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$Redirect;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f294756b;

        public Redirect(@k DeepLink deepLink) {
            this.f294756b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Redirect) && L.f(this.f294756b, ((Redirect) obj).f294756b);
        }

        public final int hashCode() {
            return this.f294756b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("Redirect(deeplink="), this.f294756b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillContent;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefillContent implements CpaInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f294757b;

        public RefillContent(@k f fVar) {
            this.f294757b = fVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF212874d() {
            return "tariffCpaInfoRefill";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "tariffCpaInfoRefill";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefillContent) && L.f(this.f294757b, ((RefillContent) obj).f294757b);
        }

        public final int hashCode() {
            return this.f294757b.hashCode();
        }

        @k
        public final String toString() {
            return "RefillContent(data=" + this.f294757b + ')';
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillError;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefillError implements CpaInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f294758b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f294759c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f294760d = "tariffCpaInfoRefill";

        public RefillError(@k ApiError apiError) {
            this.f294758b = apiError;
            this.f294759c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212874d() {
            return this.f294760d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f294760d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefillError) && L.f(this.f294758b, ((RefillError) obj).f294758b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287702c() {
            return this.f294759c;
        }

        public final int hashCode() {
            return this.f294758b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RefillError(error="), this.f294758b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$RefillLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RefillLoading extends TrackableLoadingStarted implements CpaInfoInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f294761d = "tariffCpaInfoRefill";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212874d() {
            return this.f294761d;
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$ShowErrorRefillMsg;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorRefillMsg implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f294762b;

        public ShowErrorRefillMsg(@k String str) {
            this.f294762b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorRefillMsg) && L.f(this.f294762b, ((ShowErrorRefillMsg) obj).f294762b);
        }

        public final int hashCode() {
            return this.f294762b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorRefillMsg(text="), this.f294762b, ')');
        }
    }

    /* compiled from: CpaInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction$ShowPaymentMsg;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPaymentMsg implements CpaInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f294763b;

        public ShowPaymentMsg(@k String str) {
            this.f294763b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPaymentMsg) && L.f(this.f294763b, ((ShowPaymentMsg) obj).f294763b);
        }

        public final int hashCode() {
            return this.f294763b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPaymentMsg(text="), this.f294763b, ')');
        }
    }
}
