package com.avito.android.vas_performance.screens.applied_services.mvi.entity;

import AK.c;
import BL0.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliedServicesInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "OpenDeepLink", "RemovePlannedVas", "ShowRemovalError", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$RemovePlannedVas;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$ShowRemovalError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AppliedServicesInternalAction extends n {

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements AppliedServicesInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f320272b;

        public Content(@k d dVar) {
            this.f320272b = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF205712d() {
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
            return (obj instanceof Content) && L.f(this.f320272b, ((Content) obj).f320272b);
        }

        public final int hashCode() {
            return this.f320272b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f320272b + ')';
        }
    }

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AppliedServicesInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f320273b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f320274c;

        public Error(@k ApiError apiError) {
            this.f320273b = apiError;
            this.f320274c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF205712d() {
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
            return (obj instanceof Error) && L.f(this.f320273b, ((Error) obj).f320273b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF298244c() {
            return this.f320274c;
        }

        public final int hashCode() {
            return this.f320273b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f320273b, ')');
        }
    }

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements AppliedServicesInternalAction {
    }

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements AppliedServicesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f320275b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f320276c;

        public OpenDeepLink(@k DeepLink deepLink, boolean z12) {
            this.f320275b = deepLink;
            this.f320276c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeepLink)) {
                return false;
            }
            OpenDeepLink openDeepLink = (OpenDeepLink) obj;
            return L.f(this.f320275b, openDeepLink.f320275b) && this.f320276c == openDeepLink.f320276c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f320276c) + (this.f320275b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f320275b);
            sb2.append(", shouldFinish=");
            return r.x(sb2, this.f320276c, ')');
        }
    }

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$RemovePlannedVas;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovePlannedVas implements AppliedServicesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f320277b;

        public RemovePlannedVas(@k String str) {
            this.f320277b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovePlannedVas) && L.f(this.f320277b, ((RemovePlannedVas) obj).f320277b);
        }

        public final int hashCode() {
            return this.f320277b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemovePlannedVas(vasId="), this.f320277b, ')');
        }
    }

    /* compiled from: AppliedServicesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction$ShowRemovalError;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRemovalError implements AppliedServicesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f320278b;

        public ShowRemovalError(@k String str) {
            this.f320278b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRemovalError) && L.f(this.f320278b, ((ShowRemovalError) obj).f320278b);
        }

        public final int hashCode() {
            return this.f320278b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRemovalError(message="), this.f320278b, ')');
        }
    }
}
