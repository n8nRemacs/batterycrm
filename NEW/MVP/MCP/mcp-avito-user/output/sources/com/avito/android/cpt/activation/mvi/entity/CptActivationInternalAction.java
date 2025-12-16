package com.avito.android.cpt.activation.mvi.entity;

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
import com.avito.android.cpt.remote.model.ActivationEstimateResponseV2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "HandleDeeplink", "Loading", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Close;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Content;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Error;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$HandleDeeplink;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Loading;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CptActivationInternalAction extends n {

    /* compiled from: CptActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Close;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements CptActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f126294b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 897123683;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CptActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Content;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CptActivationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ActivationEstimateResponseV2 f126295b;

        public Content(@k ActivationEstimateResponseV2 activationEstimateResponseV2) {
            this.f126295b = activationEstimateResponseV2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Content) && L.f(this.f126295b, ((Content) obj).f126295b);
        }

        public final int hashCode() {
            return this.f126295b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f126295b + ')';
        }
    }

    /* compiled from: CptActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Error;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CptActivationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f126296b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f126297c;

        public Error(@k ApiException apiException) {
            this.f126296b = apiException;
            this.f126297c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Error) && this.f126296b.equals(((Error) obj).f126296b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF108213d() {
            return this.f126297c;
        }

        public final int hashCode() {
            return this.f126296b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f126296b, ')');
        }
    }

    /* compiled from: CptActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$HandleDeeplink;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CptActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f126298b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f126298b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f126298b, ((HandleDeeplink) obj).f126298b);
        }

        public final int hashCode() {
            return this.f126298b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f126298b, ')');
        }
    }

    /* compiled from: CptActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction$Loading;", "Lcom/avito/android/cpt/activation/mvi/entity/CptActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CptActivationInternalAction {
    }
}
