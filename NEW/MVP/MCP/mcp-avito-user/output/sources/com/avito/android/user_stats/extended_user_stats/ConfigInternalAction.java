package com.avito.android.user_stats.extended_user_stats;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "ErrorConfig", "Loading", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$Content;", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$ErrorConfig;", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$Loading;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConfigInternalAction extends com.avito.android.analytics.screens.mvi.n {

    /* compiled from: ConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$Content;", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements ConfigInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ZJ0.a f317003b;

        public Content(@Y61.k ZJ0.a aVar) {
            this.f317003b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.l
        /* renamed from: d */
        public final String getF220167d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f317003b, ((Content) obj).f317003b);
        }

        public final int hashCode() {
            return this.f317003b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Content(data=" + this.f317003b + ')';
        }
    }

    /* compiled from: ConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$ErrorConfig;", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorConfig implements ConfigInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f317004b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J.a f317005c;

        public ErrorConfig(@Y61.k ApiError apiError) {
            this.f317004b = apiError;
            this.f317005c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.l
        /* renamed from: d */
        public final String getF220167d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorConfig) && L.f(this.f317004b, ((ErrorConfig) obj).f317004b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final J.a getF317005c() {
            return this.f317005c;
        }

        public final int hashCode() {
            return this.f317004b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ErrorConfig(throwable="), this.f317004b, ')');
        }
    }

    /* compiled from: ConfigInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction$Loading;", "Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ConfigInternalAction {
    }
}
