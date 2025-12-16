package com.avito.android.photo_gallery_carousel.gallery_view;

import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselPhotoGalleryAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$a;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$b;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$c;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$d;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$e;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$f;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a$g;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$a;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_gallery_carousel.gallery_view.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6530a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f217827a;

        public C6530a(int i12) {
            this.f217827a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6530a) && this.f217827a == ((C6530a) obj).f217827a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217827a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("AutotekaClick(position="), this.f217827a, ')');
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$b;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f217828a;

        public b(@Y61.k DeepLink deepLink) {
            this.f217828a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f217828a, ((b) obj).f217828a);
        }

        public final int hashCode() {
            return this.f217828a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AutotekaDeeplinkClick(deepLink="), this.f217828a, ')');
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$c;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f217829a;

        public c(@Y61.l DeepLink deepLink) {
            this.f217829a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f217829a, ((c) obj).f217829a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f217829a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("GalleryTeaserClick(deepLink="), this.f217829a, ')');
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$d;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Intent f217830a;

        public d(@Y61.k Intent intent) {
            this.f217830a = intent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f217830a, ((d) obj).f217830a);
        }

        public final int hashCode() {
            return this.f217830a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NativeVideoClick(intent=" + this.f217830a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$e;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f217831a;

        public e(int i12) {
            this.f217831a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f217831a == ((e) obj).f217831a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217831a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("PhotoClick(position="), this.f217831a, ')');
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$f;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f217832a;

        public f(@Y61.k PrintableText printableText) {
            this.f217832a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f217832a, ((f) obj).f217832a);
        }

        public final int hashCode() {
            return this.f217832a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(message="), this.f217832a, ')');
        }
    }

    /* compiled from: CarouselPhotoGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/a$g;", "Lcom/avito/android/photo_gallery_carousel/gallery_view/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f217833a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Intent f217834b;

        public g(int i12, @Y61.k Intent intent) {
            this.f217833a = i12;
            this.f217834b = intent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f217833a == gVar.f217833a && L.f(this.f217834b, gVar.f217834b);
        }

        public final int hashCode() {
            return this.f217834b.hashCode() + (Integer.hashCode(this.f217833a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "VideoClick(position=" + this.f217833a + ", intent=" + this.f217834b + ')';
        }
    }
}
