package com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity;

import AK.c;
import CE.a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.LimitsInfo;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2InternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "FeesMethodClicked", "FinishFlow", "HandleDeeplink", "Loading", "Redirect", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Back;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Content;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Error;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$FeesMethodClicked;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$FinishFlow;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$HandleDeeplink;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Loading;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Redirect;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FeesMethodsV2InternalAction extends n {

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Back;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements FeesMethodsV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f158279b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 51622636;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Content;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements FeesMethodsV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.b f158280b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LimitsInfo f158281c;

        public Content(@k a.b bVar, @l LimitsInfo limitsInfo) {
            this.f158280b = bVar;
            this.f158281c = limitsInfo;
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f158280b, content.f158280b) && L.f(this.f158281c, content.f158281c);
        }

        public final int hashCode() {
            int iHashCode = this.f158280b.hashCode() * 31;
            LimitsInfo limitsInfo = this.f158281c;
            return iHashCode + (limitsInfo == null ? 0 : limitsInfo.hashCode());
        }

        @k
        public final String toString() {
            return "Content(feesMethodsResult=" + this.f158280b + ", limitsInfoResult=" + this.f158281c + ')';
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Error;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements FeesMethodsV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f158282b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f158283c;

        public Error(@k ApiException apiException) {
            this.f158282b = apiException;
            this.f158283c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f158282b.equals(((Error) obj).f158282b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF118360c() {
            return this.f158283c;
        }

        public final int hashCode() {
            return this.f158282b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f158282b, ')');
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$FeesMethodClicked;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeesMethodClicked implements FeesMethodsV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f158284b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f158285c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final LimitsInfo f158286d;

        public FeesMethodClicked(@k String str, @k String str2, @l LimitsInfo limitsInfo) {
            this.f158284b = str;
            this.f158285c = str2;
            this.f158286d = limitsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeesMethodClicked)) {
                return false;
            }
            FeesMethodClicked feesMethodClicked = (FeesMethodClicked) obj;
            return L.f(this.f158284b, feesMethodClicked.f158284b) && L.f(this.f158285c, feesMethodClicked.f158285c) && L.f(this.f158286d, feesMethodClicked.f158286d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f158284b.hashCode() * 31, 31, this.f158285c);
            LimitsInfo limitsInfo = this.f158286d;
            return iD2 + (limitsInfo == null ? 0 : limitsInfo.hashCode());
        }

        @k
        public final String toString() {
            return "FeesMethodClicked(itemId=" + this.f158284b + ", feesMethodId=" + this.f158285c + ", limitsInfo=" + this.f158286d + ')';
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$FinishFlow;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements FeesMethodsV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f158287b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return 1283905190;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$HandleDeeplink;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements FeesMethodsV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f158288b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f158288b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f158288b, ((HandleDeeplink) obj).f158288b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f158288b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f158288b, ')');
        }
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Loading;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements FeesMethodsV2InternalAction {
    }

    /* compiled from: FeesMethodsV2InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction$Redirect;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements FeesMethodsV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f158289b;

        public Redirect(@k DeepLink deepLink) {
            this.f158289b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Redirect) && L.f(this.f158289b, ((Redirect) obj).f158289b);
        }

        public final int hashCode() {
            return this.f158289b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(deeplink="), this.f158289b, ')');
        }
    }
}
