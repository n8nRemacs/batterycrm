package com.avito.android.bbl.screens.configure.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import xh.C49944b;

/* compiled from: BblConfigureInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeOnScreenLoading", "Content", "Error", "HandleConfig", "HandleDeeplink", "Loading", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$HandleConfig;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Loading;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BblConfigureInternalAction extends n {

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Back;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements BblConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f99214b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1392302823;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeOnScreenLoading implements BblConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f99215b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f99216c;

        public ChangeOnScreenLoading(boolean z12, @l Integer num) {
            this.f99215b = z12;
            this.f99216c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOnScreenLoading)) {
                return false;
            }
            ChangeOnScreenLoading changeOnScreenLoading = (ChangeOnScreenLoading) obj;
            return this.f99215b == changeOnScreenLoading.f99215b && L.f(this.f99216c, changeOnScreenLoading.f99216c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f99215b) * 31;
            Integer num = this.f99216c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeOnScreenLoading(isLoading=");
            sb2.append(this.f99215b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f99216c, ')');
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Content;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements BblConfigureInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C49944b f99217b;

        public Content(@k C49944b c49944b) {
            this.f99217b = c49944b;
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
            return (obj instanceof Content) && L.f(this.f99217b, ((Content) obj).f99217b);
        }

        public final int hashCode() {
            return this.f99217b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f99217b + ')';
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Error;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "ScreenError", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Error$ScreenError;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements BblConfigureInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f99218b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f99219c;

        /* compiled from: BblConfigureInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Error$ScreenError;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Error;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenError extends Error {
        }

        public Error(ApiError apiError, C42822w c42822w) {
            this.f99218b = apiError;
            this.f99219c = new J.a(apiError);
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

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF280044c() {
            return this.f99219c;
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$HandleConfig;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleConfig implements BblConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BblConfigureConfigsItem.Config f99220b;

        public HandleConfig(@l BblConfigureConfigsItem.Config config) {
            this.f99220b = config;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleConfig) && L.f(this.f99220b, ((HandleConfig) obj).f99220b);
        }

        public final int hashCode() {
            BblConfigureConfigsItem.Config config = this.f99220b;
            if (config == null) {
                return 0;
            }
            return config.hashCode();
        }

        @k
        public final String toString() {
            return "HandleConfig(config=" + this.f99220b + ')';
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$HandleDeeplink;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements BblConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f99221b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f99222c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f99223d;

        public HandleDeeplink(@l DeepLink deepLink, @l Integer num, @l Long l12) {
            this.f99221b = deepLink;
            this.f99222c = num;
            this.f99223d = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f99221b, handleDeeplink.f99221b) && L.f(this.f99222c, handleDeeplink.f99222c) && L.f(this.f99223d, handleDeeplink.f99223d);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f99221b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Integer num = this.f99222c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l12 = this.f99223d;
            return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deepLink=");
            sb2.append(this.f99221b);
            sb2.append(", buttonId=");
            sb2.append(this.f99222c);
            sb2.append(", configId=");
            return m.m(sb2, this.f99223d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, Long l12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : l12);
        }
    }

    /* compiled from: BblConfigureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction$Loading;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements BblConfigureInternalAction {
    }
}
