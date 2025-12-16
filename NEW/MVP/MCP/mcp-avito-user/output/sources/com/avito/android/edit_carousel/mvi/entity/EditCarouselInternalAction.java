package com.avito.android.edit_carousel.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.edit_carousel.adapter.advert.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sy.C48432a;

/* compiled from: EditCarouselInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvertDeleteItemAction", "AdvertSelectedItemAction", "AdvertsLoaded", "AdvertsLoadingError", "AdvertsLoadingInProgress", "CarouselModificationFailure", "CarouselModificationInProgress", "CarouselModificationSuccess", "HeaderSelectItemAction", "InitEditMode", "LeaveScreen", "OnNamePicked", "OnQueryUpdated", "OnSortTypePicked", "PagingBarItemAction", "RefreshAdverts", "SelectSortType", "SwapAdverts", "SwitchModeToEdit", "SwitchModeToSearch", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertDeleteItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertSelectedItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoaded;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoadingError;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoadingInProgress;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationFailure;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationInProgress;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationSuccess;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$HeaderSelectItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$InitEditMode;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$LeaveScreen;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnNamePicked;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnQueryUpdated;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnSortTypePicked;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$PagingBarItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$RefreshAdverts;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SelectSortType;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwapAdverts;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwitchModeToEdit;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwitchModeToSearch;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EditCarouselInternalAction extends n {

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertDeleteItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertDeleteItemAction implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.c f146458b;

        public AdvertDeleteItemAction(@k a.c cVar) {
            this.f146458b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertDeleteItemAction) && L.f(this.f146458b, ((AdvertDeleteItemAction) obj).f146458b);
        }

        public final int hashCode() {
            return this.f146458b.hashCode();
        }

        @k
        public final String toString() {
            return "AdvertDeleteItemAction(item=" + this.f146458b + ')';
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertSelectedItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertSelectedItemAction implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.b f146459b;

        public AdvertSelectedItemAction(@k a.b bVar) {
            this.f146459b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertSelectedItemAction) && L.f(this.f146459b, ((AdvertSelectedItemAction) obj).f146459b);
        }

        public final int hashCode() {
            return this.f146459b.hashCode();
        }

        @k
        public final String toString() {
            return "AdvertSelectedItemAction(item=" + this.f146459b + ')';
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoaded;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoaded implements EditCarouselInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<a.b> f146460b;

        /* renamed from: c, reason: collision with root package name */
        public final long f146461c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<C48432a> f146462d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f146463e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f146464f;

        public AdvertsLoaded() {
            this(null, 0L, null, null, 15, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201644d() {
            return this.f146464f;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f146464f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoaded)) {
                return false;
            }
            AdvertsLoaded advertsLoaded = (AdvertsLoaded) obj;
            return L.f(this.f146460b, advertsLoaded.f146460b) && this.f146461c == advertsLoaded.f146461c && L.f(this.f146462d, advertsLoaded.f146462d) && L.f(this.f146463e, advertsLoaded.f146463e);
        }

        public final int hashCode() {
            List<a.b> list = this.f146460b;
            int iG2 = r.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f146461c);
            List<C48432a> list2 = this.f146462d;
            int iHashCode = (iG2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.f146463e;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoaded(items=");
            sb2.append(this.f146460b);
            sb2.append(", totalCount=");
            sb2.append(this.f146461c);
            sb2.append(", sortTypes=");
            sb2.append(this.f146462d);
            sb2.append(", selectedSortType=");
            return s.j(sb2, this.f146463e, ')');
        }

        public AdvertsLoaded(@l List<a.b> list, long j12, @l List<C48432a> list2, @l Integer num) {
            this.f146460b = list;
            this.f146461c = j12;
            this.f146462d = list2;
            this.f146463e = num;
            this.f146464f = "profile-settings-showcase-add-items";
        }

        public /* synthetic */ AdvertsLoaded(List list, long j12, List list2, Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? 0L : j12, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : num);
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoadingError;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoadingError implements EditCarouselInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146465b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f146466c;

        public AdvertsLoadingError(@k Throwable th2) {
            this.f146465b = th2;
            this.f146466c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF201644d() {
            return "profile-settings-showcase-add-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "profile-settings-showcase-add-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertsLoadingError) && L.f(this.f146465b, ((AdvertsLoadingError) obj).f146465b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF287934c() {
            return this.f146466c;
        }

        public final int hashCode() {
            return this.f146465b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("AdvertsLoadingError(error="), this.f146465b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$AdvertsLoadingInProgress;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoadingInProgress extends TrackableLoadingStarted implements EditCarouselInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f146467d;

        public AdvertsLoadingInProgress() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF201644d() {
            return this.f146467d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdvertsLoadingInProgress) && L.f(this.f146467d, ((AdvertsLoadingInProgress) obj).f146467d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f146467d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AdvertsLoadingInProgress(contentType="), this.f146467d, ')');
        }

        public AdvertsLoadingInProgress(String str, int i12, C42822w c42822w) {
            this.f146467d = (i12 & 1) != 0 ? "profile-settings-showcase-add-items" : str;
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationFailure;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CarouselModificationFailure implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f146468b;

        public CarouselModificationFailure(@k Throwable th2) {
            this.f146468b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CarouselModificationFailure) && L.f(this.f146468b, ((CarouselModificationFailure) obj).f146468b);
        }

        public final int hashCode() {
            return this.f146468b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("CarouselModificationFailure(throwable="), this.f146468b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationInProgress;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CarouselModificationInProgress implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CarouselModificationInProgress f146469b = new CarouselModificationInProgress();

        private CarouselModificationInProgress() {
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$CarouselModificationSuccess;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CarouselModificationSuccess implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CarouselModificationSuccess f146470b = new CarouselModificationSuccess();

        private CarouselModificationSuccess() {
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$HeaderSelectItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeaderSelectItemAction implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f146471b;

        public HeaderSelectItemAction(@k ArrayList arrayList) {
            this.f146471b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderSelectItemAction) && this.f146471b.equals(((HeaderSelectItemAction) obj).f146471b);
        }

        public final int hashCode() {
            return this.f146471b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("HeaderSelectItemAction(list="), this.f146471b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$InitEditMode;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitEditMode implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InitEditMode f146472b = new InitEditMode();

        private InitEditMode() {
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$LeaveScreen;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeaveScreen implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LeaveScreen f146473b = new LeaveScreen();

        private LeaveScreen() {
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnNamePicked;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnNamePicked implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146474b;

        public OnNamePicked(int i12) {
            this.f146474b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNamePicked) && this.f146474b == ((OnNamePicked) obj).f146474b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146474b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnNamePicked(nameId="), this.f146474b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnQueryUpdated;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnQueryUpdated implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146475b;

        public OnQueryUpdated(@k String str) {
            this.f146475b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQueryUpdated) && L.f(this.f146475b, ((OnQueryUpdated) obj).f146475b);
        }

        public final int hashCode() {
            return this.f146475b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnQueryUpdated(query="), this.f146475b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$OnSortTypePicked;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSortTypePicked implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146476b;

        public OnSortTypePicked(int i12) {
            this.f146476b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSortTypePicked) && this.f146476b == ((OnSortTypePicked) obj).f146476b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146476b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnSortTypePicked(sortId="), this.f146476b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$PagingBarItemAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PagingBarItemAction implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146477b;

        public PagingBarItemAction(int i12) {
            this.f146477b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PagingBarItemAction) && this.f146477b == ((PagingBarItemAction) obj).f146477b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146477b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PagingBarItemAction(pageSelected="), this.f146477b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$RefreshAdverts;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RefreshAdverts implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RefreshAdverts f146478b = new RefreshAdverts();

        private RefreshAdverts() {
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SelectSortType;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSortType implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f146479b;

        public SelectSortType(@k ArrayList arrayList) {
            this.f146479b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectSortType) && this.f146479b.equals(((SelectSortType) obj).f146479b);
        }

        public final int hashCode() {
            return this.f146479b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("SelectSortType(list="), this.f146479b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwapAdverts;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SwapAdverts implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f146480b;

        /* renamed from: c, reason: collision with root package name */
        public final int f146481c;

        public SwapAdverts(int i12, int i13) {
            this.f146480b = i12;
            this.f146481c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwapAdverts)) {
                return false;
            }
            SwapAdverts swapAdverts = (SwapAdverts) obj;
            return this.f146480b == swapAdverts.f146480b && this.f146481c == swapAdverts.f146481c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146481c) + (Integer.hashCode(this.f146480b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SwapAdverts(currentPosition=");
            sb2.append(this.f146480b);
            sb2.append(", targetPosition=");
            return r.t(sb2, this.f146481c, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwitchModeToEdit;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SwitchModeToEdit implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f146482b;

        public SwitchModeToEdit(boolean z12) {
            this.f146482b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwitchModeToEdit) && this.f146482b == ((SwitchModeToEdit) obj).f146482b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f146482b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SwitchModeToEdit(saveChanges="), this.f146482b, ')');
        }
    }

    /* compiled from: EditCarouselInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction$SwitchModeToSearch;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwitchModeToSearch implements EditCarouselInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SwitchModeToSearch f146483b = new SwitchModeToSearch();

        private SwitchModeToSearch() {
        }
    }
}
