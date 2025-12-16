package com.avito.android.review_gallery.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.adapter.gallery.m;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewGalleryInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "NavigateBack", "NavigateToDetails", "NewItemsLoaded", "OpenDeeplink", "UpdateContent", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NavigateBack;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NavigateToDetails;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NewItemsLoaded;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$OpenDeeplink;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$UpdateContent;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ReviewGalleryInternalAction extends n {

    /* compiled from: ReviewGalleryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NavigateBack;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements ReviewGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f255534b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 1785225726;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ReviewGalleryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NavigateToDetails;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToDetails implements ReviewGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GalleryItem.GalleyReview f255535b;

        public NavigateToDetails(@k GalleryItem.GalleyReview galleyReview) {
            this.f255535b = galleyReview;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToDetails) && L.f(this.f255535b, ((NavigateToDetails) obj).f255535b);
        }

        public final int hashCode() {
            return this.f255535b.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToDetails(galleryReview=" + this.f255535b + ')';
        }
    }

    /* compiled from: ReviewGalleryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$NewItemsLoaded;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewItemsLoaded implements ReviewGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f255536b;

        public NewItemsLoaded(@k m mVar) {
            this.f255536b = mVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewItemsLoaded) && L.f(this.f255536b, ((NewItemsLoaded) obj).f255536b);
        }

        public final int hashCode() {
            return this.f255536b.hashCode();
        }

        @k
        public final String toString() {
            return "NewItemsLoaded(paginationItem=" + this.f255536b + ')';
        }
    }

    /* compiled from: ReviewGalleryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$OpenDeeplink;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements ReviewGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f255537b;

        public OpenDeeplink(@l DeepLink deepLink) {
            this.f255537b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f255537b, ((OpenDeeplink) obj).f255537b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f255537b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f255537b, ')');
        }
    }

    /* compiled from: ReviewGalleryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction$UpdateContent;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContent implements ReviewGalleryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GalleryItem.GalleyReview f255538b;

        public UpdateContent(@k GalleryItem.GalleyReview galleyReview) {
            this.f255538b = galleyReview;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateContent) && L.f(this.f255538b, ((UpdateContent) obj).f255538b);
        }

        public final int hashCode() {
            return this.f255538b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateContent(review=" + this.f255538b + ')';
        }
    }
}
