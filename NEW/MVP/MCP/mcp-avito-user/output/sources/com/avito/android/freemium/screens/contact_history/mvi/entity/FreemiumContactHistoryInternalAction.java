package com.avito.android.freemium.screens.contact_history.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bF.C25506a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumContactHistoryInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "OnBackClick", "OpenDeepLink", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Content;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Error;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Loading;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$OnBackClick;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$OpenDeepLink;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FreemiumContactHistoryInternalAction extends n {

    /* compiled from: FreemiumContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Content;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FreemiumContactHistoryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C25506a f158993b;

        public Content(@k C25506a c25506a) {
            this.f158993b = c25506a;
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
            return (obj instanceof Content) && L.f(this.f158993b, ((Content) obj).f158993b);
        }

        public final int hashCode() {
            return this.f158993b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f158993b + ')';
        }
    }

    /* compiled from: FreemiumContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Error;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FreemiumContactHistoryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f158994b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f158995c;

        public Error(@k ApiException apiException) {
            this.f158994b = apiException;
            this.f158995c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f158994b.equals(((Error) obj).f158994b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99678c() {
            return this.f158995c;
        }

        public final int hashCode() {
            return this.f158994b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f158994b, ')');
        }
    }

    /* compiled from: FreemiumContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$Loading;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FreemiumContactHistoryInternalAction {
    }

    /* compiled from: FreemiumContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$OnBackClick;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackClick implements FreemiumContactHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnBackClick f158996b = new OnBackClick();

        private OnBackClick() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnBackClick);
        }

        public final int hashCode() {
            return 717485365;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: FreemiumContactHistoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction$OpenDeepLink;", "Lcom/avito/android/freemium/screens/contact_history/mvi/entity/FreemiumContactHistoryInternalAction;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements FreemiumContactHistoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f158997b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f158997b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f158997b, ((OpenDeepLink) obj).f158997b);
        }

        public final int hashCode() {
            return this.f158997b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f158997b, ')');
        }
    }
}
