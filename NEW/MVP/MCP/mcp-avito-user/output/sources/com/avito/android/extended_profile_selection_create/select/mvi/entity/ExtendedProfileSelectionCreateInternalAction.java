package com.avito.android.extended_profile_selection_create.select.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.extended_profile_selection_create.select.adapter.advert.SelectionAdvertItem;
import com.avito.android.extended_profile_selection_create.select.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvertsLoaded", "AdvertsLoading", "AdvertsLoadingError", "CloseScreen", "CloseSelectionMenu", "CreateSelectionError", "CreateSelectionIncorrectValues", "CreateSelectionItemListIdCreated", "CreateSelectionLoading", "CreateSelectionSuccess", "HighlightContinueText", "OpenFiltersScreen", "SelectAdvert", "SelectAll", "SelectedAdvertsLoaded", "SelectedAdvertsLoadedError", "SelectedAdvertsLoading", "ShowMoreActions", "UnselectAll", "UpdateItems", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoaded;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoadingError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CloseSelectionMenu;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionIncorrectValues;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionItemListIdCreated;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionSuccess;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$HighlightContinueText;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$OpenFiltersScreen;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectAdvert;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectAll;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoaded;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoadedError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$ShowMoreActions;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$UnselectAll;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$UpdateItems;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileSelectionCreateInternalAction extends n {

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoaded;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoaded implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f152306b;

        /* renamed from: c, reason: collision with root package name */
        public final int f152307c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f152308d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final SearchCorrectionItem f152309e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f152310f;

        /* renamed from: g, reason: collision with root package name */
        public final int f152311g;

        /* renamed from: h, reason: collision with root package name */
        public final int f152312h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f152313i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final SearchParams f152314j;

        public AdvertsLoaded(@k ArrayList arrayList, int i12, boolean z12, @l SearchCorrectionItem searchCorrectionItem, @l String str, int i13, int i14, @l String str2, @k SearchParams searchParams) {
            this.f152306b = arrayList;
            this.f152307c = i12;
            this.f152308d = z12;
            this.f152309e = searchCorrectionItem;
            this.f152310f = str;
            this.f152311g = i13;
            this.f152312h = i14;
            this.f152313i = str2;
            this.f152314j = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoaded)) {
                return false;
            }
            AdvertsLoaded advertsLoaded = (AdvertsLoaded) obj;
            return this.f152306b.equals(advertsLoaded.f152306b) && this.f152307c == advertsLoaded.f152307c && this.f152308d == advertsLoaded.f152308d && L.f(this.f152309e, advertsLoaded.f152309e) && L.f(this.f152310f, advertsLoaded.f152310f) && this.f152311g == advertsLoaded.f152311g && this.f152312h == advertsLoaded.f152312h && L.f(this.f152313i, advertsLoaded.f152313i) && L.f(this.f152314j, advertsLoaded.f152314j);
        }

        public final int hashCode() {
            int i12 = r.i(r.e(this.f152307c, this.f152306b.hashCode() * 31, 31), 31, this.f152308d);
            SearchCorrectionItem searchCorrectionItem = this.f152309e;
            int iHashCode = (i12 + (searchCorrectionItem == null ? 0 : searchCorrectionItem.hashCode())) * 31;
            String str = this.f152310f;
            int iE2 = r.e(this.f152312h, r.e(this.f152311g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
            String str2 = this.f152313i;
            return this.f152314j.hashCode() + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoaded(adverts=");
            sb2.append(this.f152306b);
            sb2.append(", pageNumber=");
            sb2.append(this.f152307c);
            sb2.append(", isFirstPage=");
            sb2.append(this.f152308d);
            sb2.append(", correctionItem=");
            sb2.append(this.f152309e);
            sb2.append(", searchHint=");
            sb2.append(this.f152310f);
            sb2.append(", totalCount=");
            sb2.append(this.f152311g);
            sb2.append(", foundCount=");
            sb2.append(this.f152312h);
            sb2.append(", emptySearchText=");
            sb2.append(this.f152313i);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f152314j, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoading implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f152315b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f152316c;

        public AdvertsLoading(boolean z12, @k SearchParams searchParams) {
            this.f152315b = z12;
            this.f152316c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoading)) {
                return false;
            }
            AdvertsLoading advertsLoading = (AdvertsLoading) obj;
            return this.f152315b == advertsLoading.f152315b && L.f(this.f152316c, advertsLoading.f152316c);
        }

        public final int hashCode() {
            return this.f152316c.hashCode() + (Boolean.hashCode(this.f152315b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoading(isFirstPage=");
            sb2.append(this.f152315b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f152316c, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$AdvertsLoadingError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoadingError implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f152317b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f152318c;

        public AdvertsLoadingError(@k Throwable th2, boolean z12) {
            this.f152317b = th2;
            this.f152318c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoadingError)) {
                return false;
            }
            AdvertsLoadingError advertsLoadingError = (AdvertsLoadingError) obj;
            return L.f(this.f152317b, advertsLoadingError.f152317b) && this.f152318c == advertsLoadingError.f152318c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f152318c) + (this.f152317b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoadingError(throwable=");
            sb2.append(this.f152317b);
            sb2.append(", isFirstPage=");
            return r.x(sb2, this.f152318c, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f152319b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1581653018;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CloseSelectionMenu;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseSelectionMenu implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseSelectionMenu f152320b = new CloseSelectionMenu();

        private CloseSelectionMenu() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseSelectionMenu);
        }

        public final int hashCode() {
            return -1550771811;
        }

        @k
        public final String toString() {
            return "CloseSelectionMenu";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateSelectionError implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f152321b;

        public CreateSelectionError(@k Throwable th2) {
            this.f152321b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreateSelectionError) && L.f(this.f152321b, ((CreateSelectionError) obj).f152321b);
        }

        public final int hashCode() {
            return this.f152321b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("CreateSelectionError(throwable="), this.f152321b, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionIncorrectValues;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateSelectionIncorrectValues implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152322b;

        public CreateSelectionIncorrectValues(@k String str) {
            this.f152322b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreateSelectionIncorrectValues) && L.f(this.f152322b, ((CreateSelectionIncorrectValues) obj).f152322b);
        }

        public final int hashCode() {
            return this.f152322b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CreateSelectionIncorrectValues(message="), this.f152322b, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionItemListIdCreated;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateSelectionItemListIdCreated implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f152323b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f152324c;

        public CreateSelectionItemListIdCreated(@l Long l12, @k String str) {
            this.f152323b = l12;
            this.f152324c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateSelectionItemListIdCreated)) {
                return false;
            }
            CreateSelectionItemListIdCreated createSelectionItemListIdCreated = (CreateSelectionItemListIdCreated) obj;
            return L.f(this.f152323b, createSelectionItemListIdCreated.f152323b) && L.f(this.f152324c, createSelectionItemListIdCreated.f152324c);
        }

        public final int hashCode() {
            Long l12 = this.f152323b;
            return this.f152324c.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CreateSelectionItemListIdCreated(itemListId=");
            sb2.append(this.f152323b);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.f152324c, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateSelectionLoading implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateSelectionLoading f152325b = new CreateSelectionLoading();

        private CreateSelectionLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateSelectionLoading);
        }

        public final int hashCode() {
            return -2038105642;
        }

        @k
        public final String toString() {
            return "CreateSelectionLoading";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$CreateSelectionSuccess;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateSelectionSuccess implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152326b;

        /* renamed from: c, reason: collision with root package name */
        public final long f152327c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f152328d;

        public CreateSelectionSuccess(@k String str, boolean z12, long j12) {
            this.f152326b = str;
            this.f152327c = j12;
            this.f152328d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateSelectionSuccess)) {
                return false;
            }
            CreateSelectionSuccess createSelectionSuccess = (CreateSelectionSuccess) obj;
            return L.f(this.f152326b, createSelectionSuccess.f152326b) && this.f152327c == createSelectionSuccess.f152327c && this.f152328d == createSelectionSuccess.f152328d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f152328d) + r.g(this.f152326b.hashCode() * 31, 31, this.f152327c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CreateSelectionSuccess(valueId=");
            sb2.append(this.f152326b);
            sb2.append(", itemListId=");
            sb2.append(this.f152327c);
            sb2.append(", isSelectionCreated=");
            return r.x(sb2, this.f152328d, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$HighlightContinueText;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HighlightContinueText implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HighlightContinueText f152329b = new HighlightContinueText();

        private HighlightContinueText() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HighlightContinueText);
        }

        public final int hashCode() {
            return -1993304738;
        }

        @k
        public final String toString() {
            return "HighlightContinueText";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$OpenFiltersScreen;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFiltersScreen implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f152330b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f152331c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f152332d;

        public OpenFiltersScreen(@k SearchParams searchParams, @l String str, @k FilterAnalyticsData filterAnalyticsData) {
            this.f152330b = searchParams;
            this.f152331c = str;
            this.f152332d = filterAnalyticsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFiltersScreen)) {
                return false;
            }
            OpenFiltersScreen openFiltersScreen = (OpenFiltersScreen) obj;
            return L.f(this.f152330b, openFiltersScreen.f152330b) && L.f(this.f152331c, openFiltersScreen.f152331c) && L.f(this.f152332d, openFiltersScreen.f152332d);
        }

        public final int hashCode() {
            int iHashCode = this.f152330b.hashCode() * 31;
            String str = this.f152331c;
            return this.f152332d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "OpenFiltersScreen(searchParams=" + this.f152330b + ", infoModelForm=" + this.f152331c + ", analyticsParams=" + this.f152332d + ')';
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectAdvert;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectAdvert implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectionAdvertItem f152333b;

        public SelectAdvert(@k SelectionAdvertItem selectionAdvertItem) {
            this.f152333b = selectionAdvertItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectAdvert) && L.f(this.f152333b, ((SelectAdvert) obj).f152333b);
        }

        public final int hashCode() {
            return this.f152333b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectAdvert(item=" + this.f152333b + ')';
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectAll;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectAll implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectAll f152334b = new SelectAll();

        private SelectAll() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelectAll);
        }

        public final int hashCode() {
            return -315640805;
        }

        @k
        public final String toString() {
            return "SelectAll";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoaded;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedAdvertsLoaded implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Long> f152335b;

        public SelectedAdvertsLoaded(@k List<Long> list) {
            this.f152335b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedAdvertsLoaded) && L.f(this.f152335b, ((SelectedAdvertsLoaded) obj).f152335b);
        }

        public final int hashCode() {
            return this.f152335b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SelectedAdvertsLoaded(selectedAdvertsIds="), this.f152335b, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoadedError;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedAdvertsLoadedError implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f152336b;

        public SelectedAdvertsLoadedError(@k Throwable th2) {
            this.f152336b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedAdvertsLoadedError) && L.f(this.f152336b, ((SelectedAdvertsLoadedError) obj).f152336b);
        }

        public final int hashCode() {
            return this.f152336b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SelectedAdvertsLoadedError(throwable="), this.f152336b, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$SelectedAdvertsLoading;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedAdvertsLoading implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SelectedAdvertsLoading f152337b = new SelectedAdvertsLoading();

        private SelectedAdvertsLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SelectedAdvertsLoading);
        }

        public final int hashCode() {
            return -2093831358;
        }

        @k
        public final String toString() {
            return "SelectedAdvertsLoading";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$ShowMoreActions;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMoreActions implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowMoreActions f152338b = new ShowMoreActions();

        private ShowMoreActions() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowMoreActions);
        }

        public final int hashCode() {
            return 1160993089;
        }

        @k
        public final String toString() {
            return "ShowMoreActions";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$UnselectAll;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnselectAll implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UnselectAll f152339b = new UnselectAll();

        private UnselectAll() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UnselectAll);
        }

        public final int hashCode() {
            return -223210462;
        }

        @k
        public final String toString() {
            return "UnselectAll";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction$UpdateItems;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItems implements ExtendedProfileSelectionCreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateItems f152340b = new UpdateItems();

        private UpdateItems() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateItems);
        }

        public final int hashCode() {
            return 830586893;
        }

        @k
        public final String toString() {
            return "UpdateItems";
        }
    }
}
