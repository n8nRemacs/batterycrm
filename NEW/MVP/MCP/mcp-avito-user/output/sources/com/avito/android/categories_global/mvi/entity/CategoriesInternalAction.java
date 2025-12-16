package com.avito.android.categories_global.mvi.entity;

import AK.c;
import Ln.C14417b;
import Y61.k;
import Y61.l;
import android.net.Uri;
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

/* compiled from: CategoriesInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "LoadContentStarted", "NavigateBack", "OpenDeeplink", "OpenDestination", "ShowErrorToast", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$ContentLoaded;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$Error;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$LoadContentStarted;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$NavigateBack;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$OpenDeeplink;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$OpenDestination;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$ShowErrorToast;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CategoriesInternalAction extends n {

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$ContentLoaded;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements CategoriesInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C14417b f116419b;

        public ContentLoaded(@k C14417b c14417b) {
            this.f116419b = c14417b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f116419b, ((ContentLoaded) obj).f116419b);
        }

        public final int hashCode() {
            return this.f116419b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(category=" + this.f116419b + ')';
        }
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$Error;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements CategoriesInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f116420b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f116421c;

        public Error(@k ApiException apiException) {
            this.f116420b = apiException;
            this.f116421c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof Error) && this.f116420b.equals(((Error) obj).f116420b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF289564c() {
            return this.f116421c;
        }

        public final int hashCode() {
            return this.f116420b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f116420b, ')');
        }
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$LoadContentStarted;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadContentStarted extends TrackableLoadingStarted implements CategoriesInternalAction {
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$NavigateBack;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements CategoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f116422b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -1437620243;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$OpenDeeplink;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements CategoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f116423b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f116423b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f116423b, ((OpenDeeplink) obj).f116423b);
        }

        public final int hashCode() {
            return this.f116423b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f116423b, ')');
        }
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$OpenDestination;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDestination implements CategoriesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f116424b;

        public OpenDestination(@k Uri uri) {
            this.f116424b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDestination) && L.f(this.f116424b, ((OpenDestination) obj).f116424b);
        }

        public final int hashCode() {
            return this.f116424b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("OpenDestination(route="), this.f116424b, ')');
        }
    }

    /* compiled from: CategoriesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction$ShowErrorToast;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements CategoriesInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToast)) {
                return false;
            }
            ((ShowErrorToast) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        @k
        public final String toString() {
            return "ShowErrorToast(message=null)";
        }
    }
}
