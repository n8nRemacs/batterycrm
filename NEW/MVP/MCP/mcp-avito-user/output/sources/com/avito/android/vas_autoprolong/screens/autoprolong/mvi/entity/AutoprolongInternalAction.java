package com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import hL0.C40846a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoprolongInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "HandleDeeplink", "MainContent", "MainError", "MainLoading", "PostContent", "PostError", "PostLoading", "ToggleChanged", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$CloseScreen;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$HandleDeeplink;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainContent;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainError;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainLoading;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostContent;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostError;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostLoading;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$ToggleChanged;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AutoprolongInternalAction extends n {

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$CloseScreen;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f319536b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$HandleDeeplink;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f319537b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f319537b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f319537b, ((HandleDeeplink) obj).f319537b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f319537b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f319537b, ')');
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainContent;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainContent implements AutoprolongInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C40846a f319538b;

        public MainContent(@k C40846a c40846a) {
            this.f319538b = c40846a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof MainContent) && L.f(this.f319538b, ((MainContent) obj).f319538b);
        }

        public final int hashCode() {
            return this.f319538b.hashCode();
        }

        @k
        public final String toString() {
            return "MainContent(data=" + this.f319538b + ')';
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainError;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainError implements AutoprolongInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f319539b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f319540c;

        public MainError(@k ApiError apiError) {
            this.f319539b = apiError;
            this.f319540c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof MainError) && L.f(this.f319539b, ((MainError) obj).f319539b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF301107c() {
            return this.f319540c;
        }

        public final int hashCode() {
            return this.f319539b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("MainError(apiError="), this.f319539b, ')');
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$MainLoading;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainLoading extends TrackableLoadingStarted implements AutoprolongInternalAction {
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostContent;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostContent implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f319541b;

        public PostContent(@k DeepLink deepLink) {
            this.f319541b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostContent) && L.f(this.f319541b, ((PostContent) obj).f319541b);
        }

        public final int hashCode() {
            return this.f319541b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("PostContent(deepLink="), this.f319541b, ')');
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostError;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostError implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f319542b;

        public PostError(@k ApiError apiError) {
            this.f319542b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostError) && L.f(this.f319542b, ((PostError) obj).f319542b);
        }

        public final int hashCode() {
            return this.f319542b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("PostError(apiError="), this.f319542b, ')');
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$PostLoading;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostLoading implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PostLoading f319543b = new PostLoading();

        private PostLoading() {
        }
    }

    /* compiled from: AutoprolongInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction$ToggleChanged;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleChanged implements AutoprolongInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f319544b;

        public ToggleChanged(boolean z12) {
            this.f319544b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleChanged) && this.f319544b == ((ToggleChanged) obj).f319544b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f319544b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleChanged(isChecked="), this.f319544b, ')');
        }
    }
}
