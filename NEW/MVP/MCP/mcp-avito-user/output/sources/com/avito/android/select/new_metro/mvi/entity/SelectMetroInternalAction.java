package com.avito.android.select.new_metro.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectMetroInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Cancel", "Clear", "ConfirmClicked", "FilterItemChanged", "KeyboardVisibilityChanged", "MetroLineItemChanged", "MetroStationsLoadedError", "MetroStationsLoadedSuccessfully", "MetroStationsLoadingStarted", "NewOutputTypeSelected", "ResetScroll", "SearchTextChanged", "SelectedStationsItemChanged", "ShowProgressBar", "StationItemChanged", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$Cancel;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$Clear;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ConfirmClicked;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$FilterItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$KeyboardVisibilityChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroLineItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadedError;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadedSuccessfully;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadingStarted;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$NewOutputTypeSelected;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ResetScroll;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$SearchTextChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$SelectedStationsItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ShowProgressBar;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$StationItemChanged;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectMetroInternalAction extends n {

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$Cancel;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Cancel f266232b = new Cancel();

        private Cancel() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -50539750;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$Clear;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Clear implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Clear f266233b = new Clear();

        private Clear() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Clear);
        }

        public final int hashCode() {
            return -1311315;
        }

        @k
        public final String toString() {
            return "Clear";
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ConfirmClicked;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmClicked implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f266234b;

        public ConfirmClicked(@k ArrayList arrayList) {
            this.f266234b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmClicked) && this.f266234b.equals(((ConfirmClicked) obj).f266234b);
        }

        public final int hashCode() {
            return this.f266234b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ConfirmClicked(items="), this.f266234b, ')');
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$FilterItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterItemChanged implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroFilterItem f266235b;

        public FilterItemChanged(@k MetroFilterItem metroFilterItem) {
            this.f266235b = metroFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterItemChanged) && L.f(this.f266235b, ((FilterItemChanged) obj).f266235b);
        }

        public final int hashCode() {
            return this.f266235b.hashCode();
        }

        @k
        public final String toString() {
            return "FilterItemChanged(item=" + this.f266235b + ')';
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$KeyboardVisibilityChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class KeyboardVisibilityChanged implements SelectMetroInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f266236b;

        public KeyboardVisibilityChanged(boolean z12) {
            this.f266236b = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            return (obj instanceof KeyboardVisibilityChanged) && this.f266236b == ((KeyboardVisibilityChanged) obj).f266236b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f266236b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f266236b, ')');
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroLineItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MetroLineItemChanged implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroLineItem f266237b;

        public MetroLineItemChanged(@k MetroLineItem metroLineItem) {
            this.f266237b = metroLineItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetroLineItemChanged) && L.f(this.f266237b, ((MetroLineItemChanged) obj).f266237b);
        }

        public final int hashCode() {
            return this.f266237b.hashCode();
        }

        @k
        public final String toString() {
            return "MetroLineItemChanged(item=" + this.f266237b + ')';
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadedError;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MetroStationsLoadedError implements SelectMetroInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f266238b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f266239c;

        public MetroStationsLoadedError(@k Throwable th2) {
            this.f266238b = th2;
            this.f266239c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            return (obj instanceof MetroStationsLoadedError) && L.f(this.f266238b, ((MetroStationsLoadedError) obj).f266238b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF252144b() {
            return this.f266239c;
        }

        public final int hashCode() {
            return this.f266238b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("MetroStationsLoadedError(error="), this.f266238b, ')');
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadedSuccessfully;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MetroStationsLoadedSuccessfully implements SelectMetroInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroResponseBody f266240b;

        public MetroStationsLoadedSuccessfully(@k MetroResponseBody metroResponseBody) {
            this.f266240b = metroResponseBody;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
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
            return (obj instanceof MetroStationsLoadedSuccessfully) && L.f(this.f266240b, ((MetroStationsLoadedSuccessfully) obj).f266240b);
        }

        public final int hashCode() {
            return this.f266240b.hashCode();
        }

        @k
        public final String toString() {
            return "MetroStationsLoadedSuccessfully(data=" + this.f266240b + ')';
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$MetroStationsLoadingStarted;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MetroStationsLoadingStarted extends TrackableLoadingStarted implements SelectMetroInternalAction {
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$NewOutputTypeSelected;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewOutputTypeSelected implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroListOutputTypeItem f266241b;

        public NewOutputTypeSelected(@k MetroListOutputTypeItem metroListOutputTypeItem) {
            this.f266241b = metroListOutputTypeItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewOutputTypeSelected) && L.f(this.f266241b, ((NewOutputTypeSelected) obj).f266241b);
        }

        public final int hashCode() {
            return this.f266241b.hashCode();
        }

        @k
        public final String toString() {
            return "NewOutputTypeSelected(item=" + this.f266241b + ')';
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ResetScroll;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetScroll implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetScroll f266242b = new ResetScroll();

        private ResetScroll() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetScroll);
        }

        public final int hashCode() {
            return 797882460;
        }

        @k
        public final String toString() {
            return "ResetScroll";
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$SearchTextChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchTextChanged implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f266243b;

        public SearchTextChanged(@k String str) {
            this.f266243b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && L.f(this.f266243b, ((SearchTextChanged) obj).f266243b);
        }

        public final int hashCode() {
            return this.f266243b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchTextChanged(query="), this.f266243b, ')');
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$SelectedStationsItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedStationsItemChanged implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroSelectedStationsItem f266244b;

        public SelectedStationsItemChanged(@k MetroSelectedStationsItem metroSelectedStationsItem) {
            this.f266244b = metroSelectedStationsItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedStationsItemChanged) && L.f(this.f266244b, ((SelectedStationsItemChanged) obj).f266244b);
        }

        public final int hashCode() {
            return this.f266244b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectedStationsItemChanged(item=" + this.f266244b + ')';
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$ShowProgressBar;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProgressBar implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowProgressBar f266245b = new ShowProgressBar();

        private ShowProgressBar() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowProgressBar);
        }

        public final int hashCode() {
            return 1661338313;
        }

        @k
        public final String toString() {
            return "ShowProgressBar";
        }
    }

    /* compiled from: SelectMetroInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction$StationItemChanged;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StationItemChanged implements SelectMetroInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MetroStationItem f266246b;

        public StationItemChanged(@k MetroStationItem metroStationItem) {
            this.f266246b = metroStationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StationItemChanged) && L.f(this.f266246b, ((StationItemChanged) obj).f266246b);
        }

        public final int hashCode() {
            return this.f266246b.hashCode();
        }

        @k
        public final String toString() {
            return "StationItemChanged(item=" + this.f266246b + ')';
        }
    }
}
