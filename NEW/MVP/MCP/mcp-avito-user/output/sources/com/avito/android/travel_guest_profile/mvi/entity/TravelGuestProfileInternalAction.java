package com.avito.android.travel_guest_profile.mvi.entity;

import AK.c;
import OE0.b;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelGuestProfileInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContentLoaded", "Init", "LoadingError", "LoadingStarted", "OpenDeeplink", "OpenPhotoGallery", "OpenSortingOptionsDialog", "ReviewsLoaded", "ReviewsLoadingError", "ReviewsLoadingStarted", "ReviewsPaginationError", "ReviewsPaginationLoaded", "ReviewsPaginationStarted", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$CloseScreen;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ContentLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$Init;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$LoadingError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$LoadingStarted;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenDeeplink;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenPhotoGallery;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenSortingOptionsDialog;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoadingError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoadingStarted;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationStarted;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TravelGuestProfileInternalAction extends n {

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$CloseScreen;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements TravelGuestProfileInternalAction {
        static {
            new CloseScreen();
        }

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -592458325;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ContentLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements TravelGuestProfileInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f302168b;

        public ContentLoaded(@k b bVar) {
            this.f302168b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF206205d() {
            return "core";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "core";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f302168b, ((ContentLoaded) obj).f302168b);
        }

        public final int hashCode() {
            return this.f302168b.f12098a.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(response=" + this.f302168b + ')';
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$Init;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements TravelGuestProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f302169b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f302170c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f302171d;

        public Init(@k String str, @l String str2, @l String str3) {
            this.f302169b = str;
            this.f302170c = str2;
            this.f302171d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f302169b, init.f302169b) && L.f(this.f302170c, init.f302170c) && L.f(this.f302171d, init.f302171d);
        }

        public final int hashCode() {
            int iHashCode = this.f302169b.hashCode() * 31;
            String str = this.f302170c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f302171d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(userKey=");
            sb2.append(this.f302169b);
            sb2.append(", context=");
            sb2.append(this.f302170c);
            sb2.append(", bookingId=");
            return C22026a.c(sb2, this.f302171d, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$LoadingError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements TravelGuestProfileInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f302172b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f302173c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302174d = "core";

        public LoadingError(@k ApiError apiError) {
            this.f302172b = apiError;
            this.f302173c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302174d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f302174d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f302172b, ((LoadingError) obj).f302172b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF122316c() {
            return this.f302173c;
        }

        public final int hashCode() {
            return this.f302172b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(apiError="), this.f302172b, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$LoadingStarted;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements TravelGuestProfileInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302175d = "core";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302175d;
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenDeeplink;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements TravelGuestProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f302176b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f302176b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f302176b, ((OpenDeeplink) obj).f302176b);
        }

        public final int hashCode() {
            return this.f302176b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f302176b, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenPhotoGallery;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhotoGallery implements TravelGuestProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f302177b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f302178c;

        public OpenPhotoGallery(@k List<Image> list, @l Integer num) {
            this.f302177b = list;
            this.f302178c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenPhotoGallery)) {
                return false;
            }
            OpenPhotoGallery openPhotoGallery = (OpenPhotoGallery) obj;
            return L.f(this.f302177b, openPhotoGallery.f302177b) && L.f(this.f302178c, openPhotoGallery.f302178c);
        }

        public final int hashCode() {
            int iHashCode = this.f302177b.hashCode() * 31;
            Integer num = this.f302178c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhotoGallery(images=");
            sb2.append(this.f302177b);
            sb2.append(", position=");
            return s.j(sb2, this.f302178c, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$OpenSortingOptionsDialog;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSortingOptionsDialog implements TravelGuestProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f302179b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> f302180c;

        public OpenSortingOptionsDialog(@l String str, @k List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> list) {
            this.f302179b = str;
            this.f302180c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSortingOptionsDialog)) {
                return false;
            }
            OpenSortingOptionsDialog openSortingOptionsDialog = (OpenSortingOptionsDialog) obj;
            return L.f(this.f302179b, openSortingOptionsDialog.f302179b) && L.f(this.f302180c, openSortingOptionsDialog.f302180c);
        }

        public final int hashCode() {
            String str = this.f302179b;
            return this.f302180c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortingOptionsDialog(selectedOption=");
            sb2.append(this.f302179b);
            sb2.append(", options=");
            return H.p(sb2, this.f302180c, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsLoaded implements TravelGuestProfileInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingDetailsResult f302181b;

        public ReviewsLoaded(@k RatingDetailsResult ratingDetailsResult) {
            this.f302181b = ratingDetailsResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF206205d() {
            return "reviews";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "reviews";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsLoaded) && L.f(this.f302181b, ((ReviewsLoaded) obj).f302181b);
        }

        public final int hashCode() {
            return this.f302181b.hashCode();
        }

        @k
        public final String toString() {
            return "ReviewsLoaded(response=" + this.f302181b + ')';
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoadingError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsLoadingError implements TravelGuestProfileInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f302182b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f302183c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302184d = "reviews";

        public ReviewsLoadingError(@k ApiError apiError) {
            this.f302182b = apiError;
            this.f302183c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302184d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f302184d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsLoadingError) && L.f(this.f302182b, ((ReviewsLoadingError) obj).f302182b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF122316c() {
            return this.f302183c;
        }

        public final int hashCode() {
            return this.f302182b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ReviewsLoadingError(apiError="), this.f302182b, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsLoadingStarted;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewsLoadingStarted extends TrackableLoadingStarted implements TravelGuestProfileInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302185d = "reviews";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302185d;
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationError;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsPaginationError implements TravelGuestProfileInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f302186b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f302187c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302188d = "reviews";

        public ReviewsPaginationError(@k ApiError apiError) {
            this.f302186b = apiError;
            this.f302187c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302188d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f302188d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsPaginationError) && L.f(this.f302186b, ((ReviewsPaginationError) obj).f302186b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF122316c() {
            return this.f302187c;
        }

        public final int hashCode() {
            return this.f302186b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ReviewsPaginationError(apiError="), this.f302186b, ')');
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationLoaded;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewsPaginationLoaded implements TravelGuestProfileInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingDetailsResult f302189b;

        public ReviewsPaginationLoaded(@k RatingDetailsResult ratingDetailsResult) {
            this.f302189b = ratingDetailsResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF206205d() {
            return "reviews";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "reviews";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewsPaginationLoaded) && L.f(this.f302189b, ((ReviewsPaginationLoaded) obj).f302189b);
        }

        public final int hashCode() {
            return this.f302189b.hashCode();
        }

        @k
        public final String toString() {
            return "ReviewsPaginationLoaded(response=" + this.f302189b + ')';
        }
    }

    /* compiled from: TravelGuestProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction$ReviewsPaginationStarted;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewsPaginationStarted extends TrackableLoadingStarted implements TravelGuestProfileInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f302190d = "reviews";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF206205d() {
            return this.f302190d;
        }
    }
}
