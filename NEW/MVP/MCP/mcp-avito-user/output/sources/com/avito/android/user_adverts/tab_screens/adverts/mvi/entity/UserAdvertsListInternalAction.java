package com.avito.android.user_adverts.tab_screens.adverts.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import eJ0.InterfaceC40015b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsListInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0011\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvertSelected", "AdvertsGroupSelected", "AdvertsUnselected", "ClosePositionAnimation", "LoadingError", "LoadingMore", "LoadingResult", "LoadingSearch", "LoadingStart", "NoChange", "ParamsChanged", "ProfileStatesChanged", "RefreshingStart", "SelectionTrackableInternalAction", "SingeSelectLoaded", "SingleSelect", "SingleSelectError", "SingleUnselect", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertSelected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertsGroupSelected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertsUnselected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ClosePositionAnimation;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingError;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingMore;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingResult;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingSearch;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingStart;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$NoChange;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ParamsChanged;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ProfileStatesChanged;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$RefreshingStart;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingeSelectLoaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleSelect;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleSelectError;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleUnselect;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertsListInternalAction extends n {

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertSelected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertSelected implements UserAdvertsListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315334b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315335c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f315336d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SelectionTrackableInternalAction f315337e = SelectionTrackableInternalAction.f315373b;

        public AdvertSelected(@k String str, @l String str2, boolean z12) {
            this.f315334b = str;
            this.f315335c = str2;
            this.f315336d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
            this.f315337e.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            this.f315337e.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertSelected)) {
                return false;
            }
            AdvertSelected advertSelected = (AdvertSelected) obj;
            return L.f(this.f315334b, advertSelected.f315334b) && L.f(this.f315335c, advertSelected.f315335c) && this.f315336d == advertSelected.f315336d;
        }

        public final int hashCode() {
            int iHashCode = this.f315334b.hashCode() * 31;
            String str = this.f315335c;
            return Boolean.hashCode(this.f315336d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertSelected(advertId=");
            sb2.append(this.f315334b);
            sb2.append(", shortcut=");
            sb2.append(this.f315335c);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f315336d, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertsGroupSelected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsGroupSelected implements UserAdvertsListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsShortcutGroup f315338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertsGroupSelectedState f315339c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SelectionTrackableInternalAction f315340d = SelectionTrackableInternalAction.f315373b;

        public AdvertsGroupSelected(@k UserAdvertsShortcutGroup userAdvertsShortcutGroup, @k UserAdvertsGroupSelectedState userAdvertsGroupSelectedState) {
            this.f315338b = userAdvertsShortcutGroup;
            this.f315339c = userAdvertsGroupSelectedState;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
            this.f315340d.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            this.f315340d.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsGroupSelected)) {
                return false;
            }
            AdvertsGroupSelected advertsGroupSelected = (AdvertsGroupSelected) obj;
            return L.f(this.f315338b, advertsGroupSelected.f315338b) && this.f315339c == advertsGroupSelected.f315339c;
        }

        public final int hashCode() {
            return this.f315339c.hashCode() + (this.f315338b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "AdvertsGroupSelected(shortcutGroup=" + this.f315338b + ", newState=" + this.f315339c + ')';
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$AdvertsUnselected;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertsUnselected implements UserAdvertsListInternalAction, TrackableContent {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final AdvertsUnselected f315341c = new AdvertsUnselected();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectionTrackableInternalAction f315342b = SelectionTrackableInternalAction.f315373b;

        private AdvertsUnselected() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
            this.f315342b.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            this.f315342b.getClass();
            return SelectionTrackableInternalAction.f315374c;
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ClosePositionAnimation;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClosePositionAnimation implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClosePositionAnimation f315343b = new ClosePositionAnimation();

        private ClosePositionAnimation() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClosePositionAnimation);
        }

        public final int hashCode() {
            return 551317489;
        }

        @k
        public final String toString() {
            return "ClosePositionAnimation";
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingMore;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingMore extends TrackableLoadingStarted implements UserAdvertsListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f315349d = ScreenPerformanceTracker.LoadingType.f90785b;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f315350e;

        public LoadingMore() {
            UserAdvertsScreen.f90543d.getClass();
            this.f315350e = UserAdvertsScreen.f90544e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315350e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF314046e() {
            return this.f315349d;
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingSearch;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingSearch extends TrackableLoadingStarted implements UserAdvertsListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315357d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UserAdvertsSearchStartFromType f315358e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f315359f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Map<String, Object> f315360g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final Map<String, Object> f315361h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f315362i = ScreenPerformanceTracker.LoadingType.f90785b;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final String f315363j;

        public LoadingSearch(@l UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, @k String str, @k Map map, @k Map map2, boolean z12) {
            this.f315357d = str;
            this.f315358e = userAdvertsSearchStartFromType;
            this.f315359f = z12;
            this.f315360g = map;
            this.f315361h = map2;
            UserAdvertsScreen.f90543d.getClass();
            this.f315363j = UserAdvertsScreen.f90547h;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315363j;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingSearch)) {
                return false;
            }
            LoadingSearch loadingSearch = (LoadingSearch) obj;
            return L.f(this.f315357d, loadingSearch.f315357d) && this.f315358e == loadingSearch.f315358e && this.f315359f == loadingSearch.f315359f && L.f(this.f315360g, loadingSearch.f315360g) && L.f(this.f315361h, loadingSearch.f315361h);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF314046e() {
            return this.f315362i;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            int iHashCode = this.f315357d.hashCode() * 31;
            UserAdvertsSearchStartFromType userAdvertsSearchStartFromType = this.f315358e;
            return this.f315361h.hashCode() + c.c(r.i((iHashCode + (userAdvertsSearchStartFromType == null ? 0 : userAdvertsSearchStartFromType.hashCode())) * 31, 31, this.f315359f), 31, this.f315360g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingSearch(searchQuery=");
            sb2.append(this.f315357d);
            sb2.append(", searchStartFrom=");
            sb2.append(this.f315358e);
            sb2.append(", queryByTitle=");
            sb2.append(this.f315359f);
            sb2.append(", filterParams=");
            sb2.append(this.f315360g);
            sb2.append(", defaultFilterParams=");
            return r.w(sb2, this.f315361h, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingStart;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStart extends TrackableLoadingStarted implements UserAdvertsListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f315364d = ScreenPerformanceTracker.LoadingType.f90785b;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f315365e;

        public LoadingStart() {
            UserAdvertsScreen.f90543d.getClass();
            this.f315365e = UserAdvertsScreen.f90544e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315365e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF314046e() {
            return this.f315364d;
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$NoChange;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoChange implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NoChange f315366b = new NoChange();

        private NoChange() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NoChange);
        }

        public final int hashCode() {
            return 352296959;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ParamsChanged;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParamsChanged implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsListParams f315367b;

        public ParamsChanged(@k UserAdvertsListParams userAdvertsListParams) {
            this.f315367b = userAdvertsListParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParamsChanged) && L.f(this.f315367b, ((ParamsChanged) obj).f315367b);
        }

        public final int hashCode() {
            return this.f315367b.hashCode();
        }

        @k
        public final String toString() {
            return "ParamsChanged(params=" + this.f315367b + ')';
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$ProfileStatesChanged;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileStatesChanged implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315368b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315369c;

        public ProfileStatesChanged(@k String str, @k String str2) {
            this.f315368b = str;
            this.f315369c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileStatesChanged)) {
                return false;
            }
            ProfileStatesChanged profileStatesChanged = (ProfileStatesChanged) obj;
            return L.f(this.f315368b, profileStatesChanged.f315368b) && L.f(this.f315369c, profileStatesChanged.f315369c);
        }

        public final int hashCode() {
            return this.f315369c.hashCode() + (this.f315368b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileStatesChanged(profileSettingsIdempotencyKey=");
            sb2.append(this.f315368b);
            sb2.append(", reAgentProfileStateIdempotencyKey=");
            return C22026a.c(sb2, this.f315369c, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$RefreshingStart;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshingStart extends TrackableLoadingStarted implements UserAdvertsListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315370d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f315371e = ScreenPerformanceTracker.LoadingType.f90785b;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f315372f;

        public RefreshingStart(@k String str) {
            this.f315370d = str;
            UserAdvertsScreen.f90543d.getClass();
            this.f315372f = UserAdvertsScreen.f90544e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315372f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingStart) && L.f(this.f315370d, ((RefreshingStart) obj).f315370d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF314046e() {
            return this.f315371e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f315370d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RefreshingStart(shortcut="), this.f315370d, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SelectionTrackableInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionTrackableInternalAction implements TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectionTrackableInternalAction f315373b = new SelectionTrackableInternalAction();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f315374c;

        static {
            UserAdvertsScreen.f90543d.getClass();
            f315374c = UserAdvertsScreen.f90548i;
        }

        private SelectionTrackableInternalAction() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF198624d() {
            return f315374c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return f315374c;
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingeSelectLoaded;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SingeSelectLoaded implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315375b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315376c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AvailableActionsDomain f315377d;

        public SingeSelectLoaded(@k String str, @k String str2, @k AvailableActionsDomain availableActionsDomain) {
            this.f315375b = str;
            this.f315376c = str2;
            this.f315377d = availableActionsDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingeSelectLoaded)) {
                return false;
            }
            SingeSelectLoaded singeSelectLoaded = (SingeSelectLoaded) obj;
            return L.f(this.f315375b, singeSelectLoaded.f315375b) && L.f(this.f315376c, singeSelectLoaded.f315376c) && L.f(this.f315377d, singeSelectLoaded.f315377d);
        }

        public final int hashCode() {
            return this.f315377d.f314259b.hashCode() + H.d(this.f315375b.hashCode() * 31, 31, this.f315376c);
        }

        @k
        public final String toString() {
            return "SingeSelectLoaded(advertId=" + this.f315375b + ", advertTitle=" + this.f315376c + ", actionsInfo=" + this.f315377d + ')';
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleSelect;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SingleSelect implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315378b;

        public SingleSelect(@k String str) {
            this.f315378b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleSelect) && L.f(this.f315378b, ((SingleSelect) obj).f315378b);
        }

        public final int hashCode() {
            return this.f315378b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SingleSelect(advertId="), this.f315378b, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleSelectError;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SingleSelectError implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315379b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315380c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ApiError f315381d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Throwable f315382e;

        public SingleSelectError(@k String str, @k String str2, @k ApiError apiError, @l Throwable th2) {
            this.f315379b = str;
            this.f315380c = str2;
            this.f315381d = apiError;
            this.f315382e = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleSelectError)) {
                return false;
            }
            SingleSelectError singleSelectError = (SingleSelectError) obj;
            return L.f(this.f315379b, singleSelectError.f315379b) && L.f(this.f315380c, singleSelectError.f315380c) && L.f(this.f315381d, singleSelectError.f315381d) && L.f(this.f315382e, singleSelectError.f315382e);
        }

        public final int hashCode() {
            int iHashCode = (this.f315381d.hashCode() + H.d(this.f315379b.hashCode() * 31, 31, this.f315380c)) * 31;
            Throwable th2 = this.f315382e;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SingleSelectError(advertId=");
            sb2.append(this.f315379b);
            sb2.append(", advertTitle=");
            sb2.append(this.f315380c);
            sb2.append(", apiError=");
            sb2.append(this.f315381d);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f315382e, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$SingleUnselect;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SingleUnselect implements UserAdvertsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315383b;

        public SingleUnselect(@k String str) {
            this.f315383b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleUnselect) && L.f(this.f315383b, ((SingleUnselect) obj).f315383b);
        }

        public final int hashCode() {
            return this.f315383b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SingleUnselect(advertId="), this.f315383b, ')');
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingResult;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingResult implements UserAdvertsListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40015b.C11066b f315351b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f315352c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315353d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f315354e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f315355f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f315356g;

        public LoadingResult(@k InterfaceC40015b.C11066b c11066b, boolean z12, @k String str, boolean z13, boolean z14) {
            this.f315351b = c11066b;
            this.f315352c = z12;
            this.f315353d = str;
            this.f315354e = z13;
            this.f315355f = z14;
            UserAdvertsScreen.f90543d.getClass();
            this.f315356g = z13 ? UserAdvertsScreen.f90547h : UserAdvertsScreen.f90544e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315356g;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f315356g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingResult)) {
                return false;
            }
            LoadingResult loadingResult = (LoadingResult) obj;
            return L.f(this.f315351b, loadingResult.f315351b) && this.f315352c == loadingResult.f315352c && L.f(this.f315353d, loadingResult.f315353d) && this.f315354e == loadingResult.f315354e && this.f315355f == loadingResult.f315355f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f315355f) + r.i(H.d(r.i(this.f315351b.hashCode() * 31, 31, this.f315352c), 31, this.f315353d), 31, this.f315354e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingResult(resultItems=");
            sb2.append(this.f315351b);
            sb2.append(", nextPageResult=");
            sb2.append(this.f315352c);
            sb2.append(", shortcut=");
            sb2.append(this.f315353d);
            sb2.append(", isSearchingState=");
            sb2.append(this.f315354e);
            sb2.append(", shouldShowFillParametersToast=");
            return r.x(sb2, this.f315355f, ')');
        }

        public /* synthetic */ LoadingResult(InterfaceC40015b.C11066b c11066b, boolean z12, String str, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(c11066b, z12, str, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14);
        }
    }

    /* compiled from: UserAdvertsListInternalAction.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction$LoadingError;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements UserAdvertsListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40015b.a f315344b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315345c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f315346d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final J.a f315347e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f315348f;

        public LoadingError(@k InterfaceC40015b.a aVar, @k String str, boolean z12) {
            J.a aVarB;
            this.f315344b = aVar;
            this.f315345c = str;
            this.f315346d = z12;
            Throwable th2 = aVar.f395103b;
            if (th2 != null) {
                J.a.f90383b.getClass();
                aVarB = J.a.C2676a.c(th2);
            } else {
                J.a.f90383b.getClass();
                aVarB = J.a.C2676a.b(aVar.f395102a);
            }
            this.f315347e = aVarB;
            UserAdvertsScreen.f90543d.getClass();
            this.f315348f = z12 ? UserAdvertsScreen.f90547h : UserAdvertsScreen.f90544e;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF198624d() {
            return this.f315348f;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f315348f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f315344b, loadingError.f315344b) && L.f(this.f315345c, loadingError.f315345c) && this.f315346d == loadingError.f315346d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF302311c() {
            return this.f315347e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f315346d) + H.d(this.f315344b.hashCode() * 31, 31, this.f315345c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(result=");
            sb2.append(this.f315344b);
            sb2.append(", shortcut=");
            sb2.append(this.f315345c);
            sb2.append(", isSearchingState=");
            return r.x(sb2, this.f315346d, ')');
        }

        public /* synthetic */ LoadingError(InterfaceC40015b.a aVar, String str, boolean z12, int i12, C42822w c42822w) {
            this(aVar, str, (i12 & 4) != 0 ? false : z12);
        }
    }
}
