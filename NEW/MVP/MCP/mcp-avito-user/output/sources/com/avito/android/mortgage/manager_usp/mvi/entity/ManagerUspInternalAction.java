package com.avito.android.mortgage.manager_usp.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import z00.f;

/* compiled from: ManagerUspInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "HandleDeeplinkClick", "Loading", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Content;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Error;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$HandleDeeplinkClick;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Loading;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManagerUspInternalAction extends n {

    /* compiled from: ManagerUspInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Content;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ManagerUspInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f200424b;

        public Content(@k f fVar) {
            this.f200424b = fVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof Content) && L.f(this.f200424b, ((Content) obj).f200424b);
        }

        public final int hashCode() {
            return this.f200424b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f200424b + ')';
        }
    }

    /* compiled from: ManagerUspInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Error;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ManagerUspInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f200425b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f200426c;

        public Error(@k ApiError apiError) {
            this.f200425b = apiError;
            this.f200426c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof Error) && L.f(this.f200425b, ((Error) obj).f200425b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF117165c() {
            return this.f200426c;
        }

        public final int hashCode() {
            return this.f200425b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f200425b, ')');
        }
    }

    /* compiled from: ManagerUspInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$HandleDeeplinkClick;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplinkClick implements ManagerUspInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f200427b;

        public HandleDeeplinkClick(@k DeepLink deepLink) {
            this.f200427b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplinkClick) && L.f(this.f200427b, ((HandleDeeplinkClick) obj).f200427b);
        }

        public final int hashCode() {
            return this.f200427b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplinkClick(deeplink="), this.f200427b, ')');
        }
    }

    /* compiled from: ManagerUspInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction$Loading;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ManagerUspInternalAction {
    }
}
