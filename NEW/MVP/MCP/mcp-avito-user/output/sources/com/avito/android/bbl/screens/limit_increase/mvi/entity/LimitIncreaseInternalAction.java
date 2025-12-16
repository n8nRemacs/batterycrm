package com.avito.android.bbl.screens.limit_increase.mvi.entity;

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
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qh.C47397a;

/* compiled from: LimitIncreaseInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeChip", "Content", "Error", "FinishFlow", "HandleDeeplink", "Loading", "PostSaveError", "PostSaveLoading", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Back;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$ChangeChip;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Content;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Error;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$FinishFlow;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Loading;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$PostSaveError;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$PostSaveLoading;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface LimitIncreaseInternalAction extends n {

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Back;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements LimitIncreaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f99795b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -997143186;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$ChangeChip;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeChip implements LimitIncreaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f99796b;

        public ChangeChip(int i12) {
            this.f99796b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeChip) && this.f99796b == ((ChangeChip) obj).f99796b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99796b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeChip(position="), this.f99796b, ')');
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Content;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements LimitIncreaseInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47397a f99797b;

        public Content(@k C47397a c47397a) {
            this.f99797b = c47397a;
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
            return (obj instanceof Content) && L.f(this.f99797b, ((Content) obj).f99797b);
        }

        public final int hashCode() {
            return this.f99797b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f99797b + ')';
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Error;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements LimitIncreaseInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f99798b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99799c;

        public Error(@k ApiException apiException) {
            this.f99798b = apiException;
            this.f99799c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f99798b.equals(((Error) obj).f99798b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF129491d() {
            return this.f99799c;
        }

        public final int hashCode() {
            return this.f99798b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f99798b, ')');
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$FinishFlow;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements LimitIncreaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f99800b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return 2066909096;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements LimitIncreaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f99801b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f99801b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f99801b, ((HandleDeeplink) obj).f99801b);
        }

        public final int hashCode() {
            return this.f99801b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f99801b, ')');
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$Loading;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements LimitIncreaseInternalAction {
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$PostSaveError;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveError implements LimitIncreaseInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f99802b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99803c;

        public PostSaveError(@k ApiException apiException) {
            this.f99802b = apiException;
            this.f99803c = new J.a(apiException);
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
            return (obj instanceof PostSaveError) && this.f99802b.equals(((PostSaveError) obj).f99802b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF129491d() {
            return this.f99803c;
        }

        public final int hashCode() {
            return this.f99802b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("PostSaveError(error="), this.f99802b, ')');
        }
    }

    /* compiled from: LimitIncreaseInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction$PostSaveLoading;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveLoading implements LimitIncreaseInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PostSaveLoading f99804b = new PostSaveLoading();

        private PostSaveLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PostSaveLoading);
        }

        public final int hashCode() {
            return 1667717464;
        }

        @k
        public final String toString() {
            return "PostSaveLoading";
        }
    }
}
