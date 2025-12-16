package com.avito.android.loyalty.ui.quality_service.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import com.avito.android.loyalty.ui.quality_service.items.effect.a;
import com.avito.android.loyalty.ui.quality_service.mvi.p;
import com.avito.android.util.ApiException;
import dX.g;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Error", "Forbidden", "LoadAlert", "Loaded", "Loading", "NavigateToEffectDetails", "OpenPopup", "ShowAlert", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Error;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Forbidden;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$LoadAlert;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Loaded;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$NavigateToEffectDetails;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$OpenPopup;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$ShowAlert;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface QualityServiceInternalAction extends n {

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Error;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements QualityServiceInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f183996b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f183997c;

        public Error(@k ApiException apiException) {
            this.f183996b = apiException;
            this.f183997c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f183996b.equals(((Error) obj).f183996b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF126593c() {
            return this.f183997c;
        }

        public final int hashCode() {
            return this.f183996b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f183996b, ')');
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Forbidden;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Forbidden implements QualityServiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Forbidden f183998b = new Forbidden();

        private Forbidden() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Forbidden);
        }

        public final int hashCode() {
            return -320583599;
        }

        @k
        public final String toString() {
            return "Forbidden";
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$LoadAlert;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadAlert implements QualityServiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f183999b;

        public LoadAlert(@k String str) {
            this.f183999b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadAlert) && L.f(this.f183999b, ((LoadAlert) obj).f183999b);
        }

        public final int hashCode() {
            return this.f183999b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadAlert(alert="), this.f183999b, ')');
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Loaded;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements QualityServiceInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f184000b;

        public Loaded(@k p pVar) {
            this.f184000b = pVar;
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
            return (obj instanceof Loaded) && L.f(this.f184000b, ((Loaded) obj).f184000b);
        }

        public final int hashCode() {
            return this.f184000b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f184000b + ')';
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$Loading;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements QualityServiceInternalAction {
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$NavigateToEffectDetails;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToEffectDetails implements QualityServiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f184001b;

        public NavigateToEffectDetails(@k a aVar) {
            this.f184001b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToEffectDetails) && L.f(this.f184001b, ((NavigateToEffectDetails) obj).f184001b);
        }

        public final int hashCode() {
            return this.f184001b.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToEffectDetails(effectItem=" + this.f184001b + ')';
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$OpenPopup;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPopup implements QualityServiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Content f184002b;

        public OpenPopup(@k Content content) {
            this.f184002b = content;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPopup) && L.f(this.f184002b, ((OpenPopup) obj).f184002b);
        }

        public final int hashCode() {
            return this.f184002b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPopup(content=" + this.f184002b + ')';
        }
    }

    /* compiled from: QualityServiceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction$ShowAlert;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAlert implements QualityServiceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f184003b;

        public ShowAlert(@k g gVar) {
            this.f184003b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowAlert) && L.f(this.f184003b, ((ShowAlert) obj).f184003b);
        }

        public final int hashCode() {
            return this.f184003b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowAlert(alertContent=" + this.f184003b + ')';
        }
    }
}
