package com.avito.android.loyalty.ui.criteria_gray.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.ui.criteria_gray.h;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "NavigateBack", "NavigateToMain", "OpenDeeplink", "OpenUrl", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Content;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Error;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$NavigateBack;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$NavigateToMain;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$OpenDeeplink;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$OpenUrl;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CriteriaGrayInternalAction extends n {

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Content;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CriteriaGrayInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f183618b;

        public Content(@k h hVar) {
            this.f183618b = hVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Content) && L.f(this.f183618b, ((Content) obj).f183618b);
        }

        public final int hashCode() {
            return this.f183618b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f183618b + ')';
        }
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Error;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CriteriaGrayInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f183619b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f183620c;

        public Error(@k ApiException apiException) {
            this.f183619b = apiException;
            this.f183620c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Error) && this.f183619b.equals(((Error) obj).f183619b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF158995c() {
            return this.f183620c;
        }

        public final int hashCode() {
            return this.f183619b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f183619b, ')');
        }
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CriteriaGrayInternalAction {
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$NavigateBack;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements CriteriaGrayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f183621b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -1607656090;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$NavigateToMain;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToMain implements CriteriaGrayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToMain f183622b = new NavigateToMain();

        private NavigateToMain() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToMain);
        }

        public final int hashCode() {
            return 1758316435;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$OpenDeeplink;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements CriteriaGrayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f183623b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f183623b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f183623b, ((OpenDeeplink) obj).f183623b);
        }

        public final int hashCode() {
            return this.f183623b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f183623b, ')');
        }
    }

    /* compiled from: CriteriaGrayInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction$OpenUrl;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements CriteriaGrayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f183624b;

        public OpenUrl(@k String str) {
            this.f183624b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f183624b, ((OpenUrl) obj).f183624b);
        }

        public final int hashCode() {
            return this.f183624b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f183624b, ')');
        }
    }
}
