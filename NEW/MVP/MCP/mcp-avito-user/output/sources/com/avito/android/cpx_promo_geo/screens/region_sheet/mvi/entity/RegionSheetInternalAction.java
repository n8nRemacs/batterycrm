package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.cpx_promo_geo.screens.region_sheet.RegionSheetData;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegionSheetInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "ExpandLocation", "ResetSearchItemState", "SaveSelection", "SearchContent", "SearchError", "SearchLoading", "SearchSubError", "SearchSubLoading", "SearchValueChanged", "ShowValidationError", "SubContent", "SubError", "SubLoading", "UpdateState", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$Content;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ExpandLocation;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ResetSearchItemState;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SaveSelection;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchContent;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchSubError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchSubLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchValueChanged;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ShowValidationError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubContent;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$UpdateState;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RegionSheetInternalAction extends n {

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$Content;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RegionSheetData f128369b;

        public Content(@k RegionSheetData regionSheetData) {
            this.f128369b = regionSheetData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f128369b, ((Content) obj).f128369b);
        }

        public final int hashCode() {
            return this.f128369b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(sheetData=" + this.f128369b + ')';
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ExpandLocation;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExpandLocation implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128370b;

        public ExpandLocation(long j12) {
            this.f128370b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExpandLocation) && this.f128370b == ((ExpandLocation) obj).f128370b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f128370b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ExpandLocation(locationId="), this.f128370b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ResetSearchItemState;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetSearchItemState implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128371b;

        /* renamed from: c, reason: collision with root package name */
        public final long f128372c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final RegionSheetState.Location.CheckboxState f128373d;

        public ResetSearchItemState(long j12, long j13, @k RegionSheetState.Location.CheckboxState checkboxState) {
            this.f128371b = j12;
            this.f128372c = j13;
            this.f128373d = checkboxState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetSearchItemState)) {
                return false;
            }
            ResetSearchItemState resetSearchItemState = (ResetSearchItemState) obj;
            return this.f128371b == resetSearchItemState.f128371b && this.f128372c == resetSearchItemState.f128372c && this.f128373d == resetSearchItemState.f128373d;
        }

        public final int hashCode() {
            return this.f128373d.hashCode() + r.g(Long.hashCode(this.f128371b) * 31, 31, this.f128372c);
        }

        @k
        public final String toString() {
            return "ResetSearchItemState(parentLocationId=" + this.f128371b + ", childLocationId=" + this.f128372c + ", originalState=" + this.f128373d + ')';
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SaveSelection;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveSelection implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Long> f128374b;

        public SaveSelection(@k List<Long> list) {
            this.f128374b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveSelection) && L.f(this.f128374b, ((SaveSelection) obj).f128374b);
        }

        public final int hashCode() {
            return this.f128374b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SaveSelection(selectedIds="), this.f128374b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchContent;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchContent implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f128375b;

        public SearchContent(@k Map<Long, RegionSheetState.Location> map) {
            this.f128375b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchContent) && this.f128375b.equals(((SearchContent) obj).f128375b);
        }

        public final int hashCode() {
            return this.f128375b.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("SearchContent(locations="), this.f128375b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchError implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SearchError f128376b = new SearchError();

        private SearchError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SearchError);
        }

        public final int hashCode() {
            return 434284762;
        }

        @k
        public final String toString() {
            return "SearchError";
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchLoading implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SearchLoading f128377b = new SearchLoading();

        private SearchLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SearchLoading);
        }

        public final int hashCode() {
            return -1743500402;
        }

        @k
        public final String toString() {
            return "SearchLoading";
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchSubError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchSubError implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f128378b;

        public SearchSubError(@k ApiError apiError) {
            this.f128378b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchSubError) && L.f(this.f128378b, ((SearchSubError) obj).f128378b);
        }

        public final int hashCode() {
            return this.f128378b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SearchSubError(error="), this.f128378b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchSubLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchSubLoading implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128379b;

        /* renamed from: c, reason: collision with root package name */
        public final long f128380c;

        public SearchSubLoading(long j12, long j13) {
            this.f128379b = j12;
            this.f128380c = j13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSubLoading)) {
                return false;
            }
            SearchSubLoading searchSubLoading = (SearchSubLoading) obj;
            return this.f128379b == searchSubLoading.f128379b && this.f128380c == searchSubLoading.f128380c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f128380c) + (Long.hashCode(this.f128379b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchSubLoading(parentLocationId=");
            sb2.append(this.f128379b);
            sb2.append(", childLocationId=");
            return r.u(sb2, this.f128380c, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SearchValueChanged;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchValueChanged implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f128381b;

        public SearchValueChanged(@k String str) {
            this.f128381b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchValueChanged) && L.f(this.f128381b, ((SearchValueChanged) obj).f128381b);
        }

        public final int hashCode() {
            return this.f128381b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchValueChanged(value="), this.f128381b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$ShowValidationError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowValidationError implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f128382b;

        public ShowValidationError(@k String str) {
            this.f128382b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowValidationError) && L.f(this.f128382b, ((ShowValidationError) obj).f128382b);
        }

        public final int hashCode() {
            return this.f128382b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowValidationError(errorText="), this.f128382b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubContent;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubContent implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128383b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f128384c;

        public SubContent(long j12, @k ArrayList arrayList) {
            this.f128383b = j12;
            this.f128384c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubContent)) {
                return false;
            }
            SubContent subContent = (SubContent) obj;
            return this.f128383b == subContent.f128383b && this.f128384c.equals(subContent.f128384c);
        }

        public final int hashCode() {
            return this.f128384c.hashCode() + (Long.hashCode(this.f128383b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubContent(locationId=");
            sb2.append(this.f128383b);
            sb2.append(", subLocations=");
            return e.p(sb2, this.f128384c, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubError implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128385b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f128386c;

        public SubError(long j12, @k ApiError apiError) {
            this.f128385b = j12;
            this.f128386c = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubError)) {
                return false;
            }
            SubError subError = (SubError) obj;
            return this.f128385b == subError.f128385b && L.f(this.f128386c, subError.f128386c);
        }

        public final int hashCode() {
            return this.f128386c.hashCode() + (Long.hashCode(this.f128385b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubError(locationId=");
            sb2.append(this.f128385b);
            sb2.append(", error=");
            return c.n(sb2, this.f128386c, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$SubLoading;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubLoading implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f128387b;

        public SubLoading(long j12) {
            this.f128387b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubLoading) && this.f128387b == ((SubLoading) obj).f128387b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f128387b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("SubLoading(locationId="), this.f128387b, ')');
        }
    }

    /* compiled from: RegionSheetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction$UpdateState;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateState implements RegionSheetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RegionSheetState f128388b;

        public UpdateState(@k RegionSheetState regionSheetState) {
            this.f128388b = regionSheetState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateState) && L.f(this.f128388b, ((UpdateState) obj).f128388b);
        }

        public final int hashCode() {
            return this.f128388b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateState(state=" + this.f128388b + ')';
        }
    }
}
