package com.avito.android.user_adverts_filters.main.mvi_main.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinResult;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.tracker.UserAdvertsFiltersScreen;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MainFiltersInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyFilters", "Close", "LoadError", "Loaded", "Loading", "MoveTo", "NoChange", "ParamsChanged", "RequestError", "RequestLoaded", "RequestLoading", "ResetScreens", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ApplyFilters;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Close;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$LoadError;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Loaded;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Loading;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$MoveTo;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$NoChange;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ParamsChanged;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestError;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestLoaded;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestLoading;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ResetScreens;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MainFiltersInternalAction extends n {

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ApplyFilters;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyFilters implements MainFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f316221b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f316222c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f316223d;

        public ApplyFilters() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplyFilters)) {
                return false;
            }
            ApplyFilters applyFilters = (ApplyFilters) obj;
            return L.f(this.f316221b, applyFilters.f316221b) && L.f(this.f316222c, applyFilters.f316222c) && L.f(this.f316223d, applyFilters.f316223d);
        }

        public final int hashCode() {
            int iC2 = c.c(this.f316221b.hashCode() * 31, 31, this.f316222c);
            String str = this.f316223d;
            return iC2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyFilters(filterParams=");
            sb2.append(this.f316221b);
            sb2.append(", defaultFilterParams=");
            sb2.append(this.f316222c);
            sb2.append(", profileTab=");
            return C22026a.c(sb2, this.f316223d, ')');
        }

        public ApplyFilters(@l String str, @k Map map, @k Map map2) {
            this.f316221b = map;
            this.f316222c = map2;
            this.f316223d = str;
        }

        public /* synthetic */ ApplyFilters(Map map, Map map2, String str, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : str, (i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? P0.c() : map2);
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Close;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements MainFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f316224b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 203485521;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$LoadError;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadError implements MainFiltersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f316225b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f316226c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f316227d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f316228e;

        public LoadError(@l ApiError apiError, @l Throwable th2) {
            this.f316225b = apiError;
            this.f316226c = th2;
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316227d = UserAdvertsFiltersScreen.f316329e;
            J.a.f90383b.getClass();
            this.f316228e = J.a.C2676a.a(apiError, th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316227d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f316227d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadError)) {
                return false;
            }
            LoadError loadError = (LoadError) obj;
            return L.f(this.f316225b, loadError.f316225b) && L.f(this.f316226c, loadError.f316226c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF251697c() {
            return this.f316228e;
        }

        public final int hashCode() {
            ApiError apiError = this.f316225b;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f316226c;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadError(apiError=");
            sb2.append(this.f316225b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f316226c, ')');
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Loaded;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements MainFiltersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersBeduinResult f316229b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f316230c;

        public Loaded(@k UserAdvertsFiltersBeduinResult userAdvertsFiltersBeduinResult) {
            this.f316229b = userAdvertsFiltersBeduinResult;
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316230c = UserAdvertsFiltersScreen.f316329e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316230c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f316230c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && L.f(this.f316229b, ((Loaded) obj).f316229b);
        }

        public final int hashCode() {
            return this.f316229b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(result=" + this.f316229b + ')';
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$Loading;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements MainFiltersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f316231d;

        public Loading() {
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316231d = UserAdvertsFiltersScreen.f316329e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316231d;
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$MoveTo;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveTo implements MainFiltersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersBeduinScreen f316232b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f316233c;

        public MoveTo(@k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen) {
            this.f316232b = userAdvertsFiltersBeduinScreen;
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316233c = "open_".concat(userAdvertsFiltersBeduinScreen.f316078b);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316233c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f316233c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoveTo) && L.f(this.f316232b, ((MoveTo) obj).f316232b);
        }

        public final int hashCode() {
            return this.f316232b.f316078b.hashCode();
        }

        @k
        public final String toString() {
            return "MoveTo(screen=" + this.f316232b + ')';
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$NoChange;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements MainFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f316234b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return 927038168;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ParamsChanged;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamsChanged implements MainFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersBeduinScreen f316235b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f316236c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, Object> f316237d;

        public ParamsChanged(@k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2) {
            this.f316235b = userAdvertsFiltersBeduinScreen;
            this.f316236c = map;
            this.f316237d = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamsChanged)) {
                return false;
            }
            ParamsChanged paramsChanged = (ParamsChanged) obj;
            return L.f(this.f316235b, paramsChanged.f316235b) && L.f(this.f316236c, paramsChanged.f316236c) && L.f(this.f316237d, paramsChanged.f316237d);
        }

        public final int hashCode() {
            return this.f316237d.hashCode() + c.c(this.f316235b.f316078b.hashCode() * 31, 31, this.f316236c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ParamsChanged(screen=");
            sb2.append(this.f316235b);
            sb2.append(", filterParams=");
            sb2.append(this.f316236c);
            sb2.append(", defaultFilterParams=");
            return r.w(sb2, this.f316237d, ')');
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestError;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestError implements MainFiltersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f316238b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f316239c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f316240d;

        public RequestError(@k ApiError apiError) {
            this.f316238b = apiError;
            J.a.f90383b.getClass();
            this.f316239c = J.a.C2676a.b(apiError);
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316240d = UserAdvertsFiltersScreen.f316330f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316240d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f316240d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestError) && L.f(this.f316238b, ((RequestError) obj).f316238b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF251697c() {
            return this.f316239c;
        }

        public final int hashCode() {
            return this.f316238b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RequestError(apiError="), this.f316238b, ')');
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestLoaded;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestLoaded implements MainFiltersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestLoaded f316241b = new RequestLoaded();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f316242c;

        static {
            UserAdvertsFiltersScreen.f316328d.getClass();
            f316242c = UserAdvertsFiltersScreen.f316330f;
        }

        private RequestLoaded() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF115373d() {
            return f316242c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return f316242c;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestLoaded);
        }

        public final int hashCode() {
            return 1122587085;
        }

        @k
        public final String toString() {
            return "RequestLoaded";
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$RequestLoading;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequestLoading extends TrackableLoadingStarted implements MainFiltersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f316243d;

        public RequestLoading() {
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316243d = UserAdvertsFiltersScreen.f316330f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316243d;
        }
    }

    /* compiled from: MainFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction$ResetScreens;", "Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetScreens implements MainFiltersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersBeduinScreen f316244b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Collection<UserAdvertsFiltersBeduinScreen> f316245c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f316246d;

        public ResetScreens(@k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k Collection<UserAdvertsFiltersBeduinScreen> collection) {
            this.f316244b = userAdvertsFiltersBeduinScreen;
            this.f316245c = collection;
            UserAdvertsFiltersScreen.f316328d.getClass();
            this.f316246d = "reset_".concat(userAdvertsFiltersBeduinScreen.f316078b);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f316246d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f316246d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetScreens)) {
                return false;
            }
            ResetScreens resetScreens = (ResetScreens) obj;
            return L.f(this.f316244b, resetScreens.f316244b) && L.f(this.f316245c, resetScreens.f316245c);
        }

        public final int hashCode() {
            return this.f316245c.hashCode() + (this.f316244b.f316078b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ResetScreens(currentScreen=" + this.f316244b + ", screensToReset=" + this.f316245c + ')';
        }
    }
}
