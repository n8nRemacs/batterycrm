package com.avito.android.extended_profile_tabs.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_tabs.mvi.entity.a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DataLoaded", "DataLoading", "HandleTabNavigationDeeplink", "LoadingError", "SelectBrandTab", "SelectRatingTab", "SelectSearchTab", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$DataLoaded;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$DataLoading;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$HandleTabNavigationDeeplink;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$LoadingError;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectBrandTab;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectRatingTab;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectSearchTab;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileTabsInternalAction extends n {

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$DataLoaded;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements ExtendedProfileTabsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f153231b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.b f153232c;

        public DataLoaded(@l Image image, @k a.b bVar) {
            this.f153231b = image;
            this.f153232c = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            if (!(obj instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) obj;
            return L.f(this.f153231b, dataLoaded.f153231b) && L.f(this.f153232c, dataLoaded.f153232c);
        }

        public final int hashCode() {
            Image image = this.f153231b;
            return this.f153232c.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "DataLoaded(avatar=" + this.f153231b + ", tabsState=" + this.f153232c + ')';
        }
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$DataLoading;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataLoading extends TrackableLoadingStarted implements ExtendedProfileTabsInternalAction {
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$HandleTabNavigationDeeplink;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleTabNavigationDeeplink implements ExtendedProfileTabsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f153233b;

        public HandleTabNavigationDeeplink(@k DeepLink deepLink) {
            this.f153233b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleTabNavigationDeeplink) && L.f(this.f153233b, ((HandleTabNavigationDeeplink) obj).f153233b);
        }

        public final int hashCode() {
            return this.f153233b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleTabNavigationDeeplink(deepLink="), this.f153233b, ')');
        }
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$LoadingError;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements ExtendedProfileTabsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f153234b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f153235c;

        public LoadingError(@k Throwable th2) {
            this.f153234b = th2;
            this.f153235c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof LoadingError) && L.f(this.f153234b, ((LoadingError) obj).f153234b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF134902c() {
            return this.f153235c;
        }

        public final int hashCode() {
            return this.f153234b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(error="), this.f153234b, ')');
        }
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectBrandTab;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectBrandTab implements ExtendedProfileTabsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectBrandTab f153236b = new SelectBrandTab();

        private SelectBrandTab() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelectBrandTab);
        }

        public final int hashCode() {
            return 437432821;
        }

        @k
        public final String toString() {
            return "SelectBrandTab";
        }
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectRatingTab;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectRatingTab implements ExtendedProfileTabsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectRatingTab f153237b = new SelectRatingTab();

        private SelectRatingTab() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelectRatingTab);
        }

        public final int hashCode() {
            return 1807354417;
        }

        @k
        public final String toString() {
            return "SelectRatingTab";
        }
    }

    /* compiled from: ExtendedProfileTabsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction$SelectSearchTab;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSearchTab implements ExtendedProfileTabsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectSearchTab f153238b = new SelectSearchTab();

        private SelectSearchTab() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelectSearchTab);
        }

        public final int hashCode() {
            return -1053960634;
        }

        @k
        public final String toString() {
            return "SelectSearchTab";
        }
    }
}
