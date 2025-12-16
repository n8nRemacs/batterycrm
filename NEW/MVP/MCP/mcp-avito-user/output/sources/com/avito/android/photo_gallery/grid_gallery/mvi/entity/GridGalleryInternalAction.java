package com.avito.android.photo_gallery.grid_gallery.mvi.entity;

import T70.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContentLoaded", "OpenDeeplink", "OpenFullScreenGallery", "ScrollToItem", "SmoothScrollToItem", "UpdateGalleryItemPosition", "UpdateLastValidGridGalleryItemPosition", "UpdateNavbarChipSelectedBlockId", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$CloseScreen;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$ContentLoaded;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$OpenDeeplink;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$OpenFullScreenGallery;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$ScrollToItem;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$SmoothScrollToItem;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateGalleryItemPosition;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateLastValidGridGalleryItemPosition;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateNavbarChipSelectedBlockId;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface GridGalleryInternalAction extends n {

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$CloseScreen;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f217322b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f217323c;

        public CloseScreen(int i12, @l Long l12) {
            this.f217322b = i12;
            this.f217323c = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseScreen)) {
                return false;
            }
            CloseScreen closeScreen = (CloseScreen) obj;
            return this.f217322b == closeScreen.f217322b && L.f(this.f217323c, closeScreen.f217323c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f217322b) * 31;
            Long l12 = this.f217323c;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreen(advertGalleryPosition=");
            sb2.append(this.f217322b);
            sb2.append(", stateId=");
            return m.m(sb2, this.f217323c, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$ContentLoaded;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements GridGalleryInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GridGalleryOpenParams f217324b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final b f217325c;

        public ContentLoaded(@k GridGalleryOpenParams gridGalleryOpenParams, @k b bVar) {
            this.f217324b = gridGalleryOpenParams;
            this.f217325c = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212874d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f217324b, contentLoaded.f217324b) && L.f(this.f217325c, contentLoaded.f217325c);
        }

        public final int hashCode() {
            return this.f217325c.hashCode() + (this.f217324b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContentLoaded(openParams=" + this.f217324b + ", galleryPositions=" + this.f217325c + ')';
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$OpenDeeplink;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f217326b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f217326b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f217326b, ((OpenDeeplink) obj).f217326b);
        }

        public final int hashCode() {
            return this.f217326b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f217326b, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$OpenFullScreenGallery;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFullScreenGallery implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GridGalleryOpenParams f217327b;

        /* renamed from: c, reason: collision with root package name */
        public final int f217328c;

        public OpenFullScreenGallery(@k GridGalleryOpenParams gridGalleryOpenParams, int i12) {
            this.f217327b = gridGalleryOpenParams;
            this.f217328c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFullScreenGallery)) {
                return false;
            }
            OpenFullScreenGallery openFullScreenGallery = (OpenFullScreenGallery) obj;
            return L.f(this.f217327b, openFullScreenGallery.f217327b) && this.f217328c == openFullScreenGallery.f217328c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217328c) + (this.f217327b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenFullScreenGallery(openParams=");
            sb2.append(this.f217327b);
            sb2.append(", fullScreenGalleryPosition=");
            return r.t(sb2, this.f217328c, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$ScrollToItem;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f217329b;

        public ScrollToItem(int i12) {
            this.f217329b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToItem) && this.f217329b == ((ScrollToItem) obj).f217329b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217329b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(itemPosition="), this.f217329b, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$SmoothScrollToItem;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SmoothScrollToItem implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f217330b;

        public SmoothScrollToItem(int i12) {
            this.f217330b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SmoothScrollToItem) && this.f217330b == ((SmoothScrollToItem) obj).f217330b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217330b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SmoothScrollToItem(itemPosition="), this.f217330b, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateGalleryItemPosition;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateGalleryItemPosition implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f217331b;

        /* renamed from: c, reason: collision with root package name */
        public final int f217332c;

        public UpdateGalleryItemPosition(int i12, int i13) {
            this.f217331b = i12;
            this.f217332c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateGalleryItemPosition)) {
                return false;
            }
            UpdateGalleryItemPosition updateGalleryItemPosition = (UpdateGalleryItemPosition) obj;
            return this.f217331b == updateGalleryItemPosition.f217331b && this.f217332c == updateGalleryItemPosition.f217332c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217332c) + (Integer.hashCode(this.f217331b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateGalleryItemPosition(fullScreenGalleryPosition=");
            sb2.append(this.f217331b);
            sb2.append(", advertGalleryPosition=");
            return r.t(sb2, this.f217332c, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateLastValidGridGalleryItemPosition;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLastValidGridGalleryItemPosition implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f217333b;

        public UpdateLastValidGridGalleryItemPosition(int i12) {
            this.f217333b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLastValidGridGalleryItemPosition) && this.f217333b == ((UpdateLastValidGridGalleryItemPosition) obj).f217333b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217333b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateLastValidGridGalleryItemPosition(position="), this.f217333b, ')');
        }
    }

    /* compiled from: GridGalleryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction$UpdateNavbarChipSelectedBlockId;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateNavbarChipSelectedBlockId implements GridGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f217334b;

        public UpdateNavbarChipSelectedBlockId(@k String str) {
            this.f217334b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNavbarChipSelectedBlockId) && L.f(this.f217334b, ((UpdateNavbarChipSelectedBlockId) obj).f217334b);
        }

        public final int hashCode() {
            return this.f217334b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNavbarChipSelectedBlockId(newLastVisibleItemBlockTitle="), this.f217334b, ')');
        }
    }
}
