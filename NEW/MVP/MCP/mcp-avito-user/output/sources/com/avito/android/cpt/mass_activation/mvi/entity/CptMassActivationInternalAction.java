package com.avito.android.cpt.mass_activation.mvi.entity;

import AK.c;
import Rr.g;
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
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithDeeplinkResult", "Content", "Error", "HandleDeeplink", "Loading", "SetEmptyResult", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$CloseWithDeeplinkResult;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Content;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Error;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$HandleDeeplink;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Loading;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$SetEmptyResult;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CptMassActivationInternalAction extends n {

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$CloseWithDeeplinkResult;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithDeeplinkResult implements CptMassActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f126590b;

        public CloseWithDeeplinkResult(@k DeepLink deepLink) {
            this.f126590b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithDeeplinkResult) && L.f(this.f126590b, ((CloseWithDeeplinkResult) obj).f126590b);
        }

        public final int hashCode() {
            return this.f126590b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("CloseWithDeeplinkResult(deeplink="), this.f126590b, ')');
        }
    }

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Content;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CptMassActivationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f126591b;

        public Content(@k g gVar) {
            this.f126591b = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Content) && L.f(this.f126591b, ((Content) obj).f126591b);
        }

        public final int hashCode() {
            return this.f126591b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f126591b + ')';
        }
    }

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Error;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CptMassActivationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f126592b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f126593c;

        public Error(@k ApiException apiException) {
            this.f126592b = apiException;
            this.f126593c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Error) && this.f126592b.equals(((Error) obj).f126592b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99803c() {
            return this.f126593c;
        }

        public final int hashCode() {
            return this.f126592b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f126592b, ')');
        }
    }

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$HandleDeeplink;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements CptMassActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f126594b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f126594b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f126594b, ((HandleDeeplink) obj).f126594b);
        }

        public final int hashCode() {
            return this.f126594b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f126594b, ')');
        }
    }

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$Loading;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CptMassActivationInternalAction {
    }

    /* compiled from: CptMassActivationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction$SetEmptyResult;", "Lcom/avito/android/cpt/mass_activation/mvi/entity/CptMassActivationInternalAction;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetEmptyResult implements CptMassActivationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetEmptyResult f126595b = new SetEmptyResult();

        private SetEmptyResult() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetEmptyResult);
        }

        public final int hashCode() {
            return -1083966352;
        }

        @k
        public final String toString() {
            return "SetEmptyResult";
        }
    }
}
