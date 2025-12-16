package com.avito.android.bbl.screens.configure.v4.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import vh.C49328a;

/* compiled from: BblConfigureV4InternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "HandleDeeplink", "Loading", "OnSelectorCardClicked", "PostSaveLoading", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Loading;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$OnSelectorCardClicked;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$PostSaveLoading;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BblConfigureV4InternalAction extends n {

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements BblConfigureV4InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f99492b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -100523455;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements BblConfigureV4InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C49328a f99493b;

        public Content(@k C49328a c49328a) {
            this.f99493b = c49328a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof Content) && L.f(this.f99493b, ((Content) obj).f99493b);
        }

        public final int hashCode() {
            return this.f99493b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f99493b + ')';
        }
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BblConfigureV4InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f99494b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99495c;

        public Error(@k ApiException apiException) {
            this.f99494b = apiException;
            this.f99495c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof Error) && this.f99494b.equals(((Error) obj).f99494b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF329284c() {
            return this.f99495c;
        }

        public final int hashCode() {
            return this.f99494b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f99494b, ')');
        }
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BblConfigureV4InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f99496b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f99497c;

        public HandleDeeplink(@l Long l12, @l DeepLink deepLink) {
            this.f99496b = deepLink;
            this.f99497c = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f99496b, handleDeeplink.f99496b) && L.f(this.f99497c, handleDeeplink.f99497c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f99496b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Long l12 = this.f99497c;
            return iHashCode + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f99496b);
            sb2.append(", configId=");
            return m.m(sb2, this.f99497c, ')');
        }
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$Loading;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements BblConfigureV4InternalAction {
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$OnSelectorCardClicked;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSelectorCardClicked implements BblConfigureV4InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f99498b;

        public OnSelectorCardClicked(int i12) {
            this.f99498b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSelectorCardClicked) && this.f99498b == ((OnSelectorCardClicked) obj).f99498b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99498b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnSelectorCardClicked(index="), this.f99498b, ')');
        }
    }

    /* compiled from: BblConfigureV4InternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction$PostSaveLoading;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PostSaveLoading implements BblConfigureV4InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f99499b;

        public PostSaveLoading(boolean z12) {
            this.f99499b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostSaveLoading) && this.f99499b == ((PostSaveLoading) obj).f99499b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99499b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PostSaveLoading(isLoading="), this.f99499b, ')');
        }
    }
}
