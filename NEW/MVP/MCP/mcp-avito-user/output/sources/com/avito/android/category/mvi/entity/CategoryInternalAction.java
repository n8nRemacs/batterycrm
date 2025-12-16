package com.avito.android.category.mvi.entity;

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
import com.avito.android.category.ListItem;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.MainSearchResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ExpandCategory", "LoadingLinkCompleted", "LoadingLinkFailed", "LoadingLinkStarted", "LoadingMainCompleted", "LoadingMainFailed", "LoadingMainStarted", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$CloseScreen;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$ExpandCategory;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkCompleted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkFailed;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkStarted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainCompleted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainFailed;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainStarted;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CategoryInternalAction extends n {

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$CloseScreen;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements CategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f116667b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$ExpandCategory;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExpandCategory implements CategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ListItem.Category f116668b;

        public ExpandCategory(@k ListItem.Category category) {
            this.f116668b = category;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExpandCategory) && L.f(this.f116668b, ((ExpandCategory) obj).f116668b);
        }

        public final int hashCode() {
            return this.f116668b.hashCode();
        }

        @k
        public final String toString() {
            return "ExpandCategory(item=" + this.f116668b + ')';
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkCompleted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingLinkCompleted implements CategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLinkResponse f116669b;

        public LoadingLinkCompleted(@k DeepLinkResponse deepLinkResponse) {
            this.f116669b = deepLinkResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingLinkCompleted) && L.f(this.f116669b, ((LoadingLinkCompleted) obj).f116669b);
        }

        public final int hashCode() {
            return this.f116669b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingLinkCompleted(result=" + this.f116669b + ')';
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkFailed;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingLinkFailed implements CategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f116670b;

        public LoadingLinkFailed(@k ApiError apiError) {
            this.f116670b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingLinkFailed) && L.f(this.f116670b, ((LoadingLinkFailed) obj).f116670b);
        }

        public final int hashCode() {
            return this.f116670b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingLinkFailed(error="), this.f116670b, ')');
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingLinkStarted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingLinkStarted implements CategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Location f116671b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f116672c;

        public LoadingLinkStarted(@k Location location, @l String str) {
            this.f116671b = location;
            this.f116672c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingLinkStarted)) {
                return false;
            }
            LoadingLinkStarted loadingLinkStarted = (LoadingLinkStarted) obj;
            return L.f(this.f116671b, loadingLinkStarted.f116671b) && L.f(this.f116672c, loadingLinkStarted.f116672c);
        }

        public final int hashCode() {
            int iHashCode = this.f116671b.hashCode() * 31;
            String str = this.f116672c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingLinkStarted(location=");
            sb2.append(this.f116671b);
            sb2.append(", categoryId=");
            return C22026a.c(sb2, this.f116672c, ')');
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainCompleted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingMainCompleted implements CategoryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MainSearchResult f116673b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Location f116674c;

        public LoadingMainCompleted(@k MainSearchResult mainSearchResult, @k Location location) {
            this.f116673b = mainSearchResult;
            this.f116674c = location;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            if (!(obj instanceof LoadingMainCompleted)) {
                return false;
            }
            LoadingMainCompleted loadingMainCompleted = (LoadingMainCompleted) obj;
            return L.f(this.f116673b, loadingMainCompleted.f116673b) && L.f(this.f116674c, loadingMainCompleted.f116674c);
        }

        public final int hashCode() {
            return this.f116674c.hashCode() + (this.f116673b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "LoadingMainCompleted(result=" + this.f116673b + ", location=" + this.f116674c + ')';
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainFailed;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingMainFailed implements CategoryInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f116675b;

        public LoadingMainFailed(@k ApiError apiError) {
            this.f116675b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof LoadingMainFailed) && L.f(this.f116675b, ((LoadingMainFailed) obj).f116675b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF328859c() {
            return new J.a(this.f116675b);
        }

        public final int hashCode() {
            return this.f116675b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingMainFailed(error="), this.f116675b, ')');
        }
    }

    /* compiled from: CategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/mvi/entity/CategoryInternalAction$LoadingMainStarted;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingMainStarted extends TrackableLoadingStarted implements CategoryInternalAction {
    }
}
