package com.avito.android.fees_methods.screen.fees_by_package.mvi.entity;

import AK.c;
import BE.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesByPackageInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "DeepLinkLoading", "Error", "FinishFlow", "HandleDeeplink", "Loading", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Back;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Content;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$DeepLinkLoading;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Error;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$FinishFlow;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$HandleDeeplink;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Loading;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FeesByPackageInternalAction extends n {

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Back;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements FeesByPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f158017b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 446888416;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Content;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FeesByPackageInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f158018b;

        public Content(@k a aVar) {
            this.f158018b = aVar;
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
            return (obj instanceof Content) && L.f(this.f158018b, ((Content) obj).f158018b);
        }

        public final int hashCode() {
            return this.f158018b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f158018b + ')';
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$DeepLinkLoading;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeepLinkLoading implements FeesByPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f158019b;

        public DeepLinkLoading(boolean z12) {
            this.f158019b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLinkLoading) && this.f158019b == ((DeepLinkLoading) obj).f158019b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f158019b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("DeepLinkLoading(isLoading="), this.f158019b, ')');
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Error;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FeesByPackageInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f158020b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f158021c;

        public Error(@k ApiException apiException) {
            this.f158020b = apiException;
            this.f158021c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f158020b.equals(((Error) obj).f158020b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF295751c() {
            return this.f158021c;
        }

        public final int hashCode() {
            return this.f158020b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f158020b, ')');
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$FinishFlow;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements FeesByPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f158022b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -1669720422;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$HandleDeeplink;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements FeesByPackageInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f158023b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f158023b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f158023b, ((HandleDeeplink) obj).f158023b);
        }

        public final int hashCode() {
            return this.f158023b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f158023b, ')');
        }
    }

    /* compiled from: FeesByPackageInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FeesByPackageInternalAction {
    }
}
