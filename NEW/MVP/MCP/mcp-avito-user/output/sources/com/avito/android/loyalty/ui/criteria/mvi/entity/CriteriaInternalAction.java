package com.avito.android.loyalty.ui.criteria.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.ui.criteria.CriteriaTabsInfo;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "NavigateBack", "NavigateToMain", "OpenDeeplink", "OpenUrl", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Content;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Error;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$NavigateBack;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$NavigateToMain;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$OpenDeeplink;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$OpenUrl;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CriteriaInternalAction extends n {

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Content;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CriteriaTabsInfo f183539b;

        public Content(@k CriteriaTabsInfo criteriaTabsInfo) {
            this.f183539b = criteriaTabsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f183539b, ((Content) obj).f183539b);
        }

        public final int hashCode() {
            return this.f183539b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f183539b + ')';
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Error;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f183540b;

        public Error(@k ApiException apiException) {
            this.f183540b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f183540b.equals(((Error) obj).f183540b);
        }

        public final int hashCode() {
            return this.f183540b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f183540b, ')');
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f183541b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1590240085;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$NavigateBack;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f183542b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 942211967;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$NavigateToMain;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToMain implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToMain f183543b = new NavigateToMain();

        private NavigateToMain() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToMain);
        }

        public final int hashCode() {
            return -244806804;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$OpenDeeplink;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f183544b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f183544b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f183544b, ((OpenDeeplink) obj).f183544b);
        }

        public final int hashCode() {
            return this.f183544b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f183544b, ')');
        }
    }

    /* compiled from: CriteriaInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction$OpenUrl;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements CriteriaInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f183545b;

        public OpenUrl(@k String str) {
            this.f183545b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f183545b, ((OpenUrl) obj).f183545b);
        }

        public final int hashCode() {
            return this.f183545b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f183545b, ')');
        }
    }
}
