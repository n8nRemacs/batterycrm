package com.avito.android.user_viewed.screen.mvi.entity;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "ListResetting", "Loading", "OpenDeeplink", "Refreshing", "ScrolledBottom", "UpdateFavoriteStatus", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Content;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Error;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$ListResetting;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Loading;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$OpenDeeplink;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Refreshing;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$ScrolledBottom;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$UpdateFavoriteStatus;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserViewedInternalAction extends n {

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Content;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements UserViewedInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<UserViewedAdvert> f318411b;

        public Content(@k List<UserViewedAdvert> list) {
            this.f318411b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f318411b, ((Content) obj).f318411b);
        }

        public final int hashCode() {
            return this.f318411b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(items="), this.f318411b, ')');
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Error;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements UserViewedInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f318412b;

        public Error(@k ApiError apiError) {
            this.f318412b = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF200214d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF200213c() {
            return this.f318412b;
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$ListResetting;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ListResetting implements UserViewedInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ListResetting f318413b = new ListResetting();

        private ListResetting() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ListResetting);
        }

        public final int hashCode() {
            return 1221282479;
        }

        @k
        public final String toString() {
            return "ListResetting";
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Loading;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements UserViewedInternalAction {
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$OpenDeeplink;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements UserViewedInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f318414b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f318415c;

        public OpenDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f318414b = deepLink;
            this.f318415c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f318414b, openDeeplink.f318414b) && L.f(this.f318415c, openDeeplink.f318415c);
        }

        public final int hashCode() {
            int iHashCode = this.f318414b.hashCode() * 31;
            Bundle bundle = this.f318415c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f318414b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f318415c, ')');
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$Refreshing;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Refreshing implements UserViewedInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Refreshing f318416b = new Refreshing();

        private Refreshing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Refreshing);
        }

        public final int hashCode() {
            return -1674141641;
        }

        @k
        public final String toString() {
            return "Refreshing";
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$ScrolledBottom;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrolledBottom implements UserViewedInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrolledBottom f318417b = new ScrolledBottom();

        private ScrolledBottom() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScrolledBottom);
        }

        public final int hashCode() {
            return 452816519;
        }

        @k
        public final String toString() {
            return "ScrolledBottom";
        }
    }

    /* compiled from: UserViewedInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction$UpdateFavoriteStatus;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFavoriteStatus implements UserViewedInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HashSet f318418b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f318419c;

        public UpdateFavoriteStatus(@k HashSet hashSet, boolean z12) {
            this.f318418b = hashSet;
            this.f318419c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateFavoriteStatus)) {
                return false;
            }
            UpdateFavoriteStatus updateFavoriteStatus = (UpdateFavoriteStatus) obj;
            return this.f318418b.equals(updateFavoriteStatus.f318418b) && this.f318419c == updateFavoriteStatus.f318419c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f318419c) + (this.f318418b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateFavoriteStatus(ids=");
            sb2.append(this.f318418b);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f318419c, ')');
        }
    }
}
