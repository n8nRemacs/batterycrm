package gn0;

import Y61.k;
import Y61.l;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.adapter.gallery.m;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewGalleryOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lgn0/b;", "", "a", "b", "c", "d", "Lgn0/b$a;", "Lgn0/b$b;", "Lgn0/b$c;", "Lgn0/b$d;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40713b {

    /* compiled from: ReviewGalleryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/b$a;", "Lgn0/b;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.b$a */
    public static final /* data */ class a implements InterfaceC40713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final m f396852a;

        public a(@k m mVar) {
            this.f396852a = mVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396852a, ((a) obj).f396852a);
        }

        public final int hashCode() {
            return this.f396852a.hashCode();
        }

        @k
        public final String toString() {
            return "AddNewItems(paginationItem=" + this.f396852a + ')';
        }
    }

    /* compiled from: ReviewGalleryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn0/b$b;", "Lgn0/b;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11230b implements InterfaceC40713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11230b f396853a = new C11230b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11230b);
        }

        public final int hashCode() {
            return -240830326;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ReviewGalleryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/b$c;", "Lgn0/b;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.b$c */
    public static final /* data */ class c implements InterfaceC40713b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GalleryItem.GalleyReview f396854a;

        public c(@k GalleryItem.GalleyReview galleyReview) {
            this.f396854a = galleyReview;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396854a, ((c) obj).f396854a);
        }

        public final int hashCode() {
            return this.f396854a.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToDetails(galleryReview=" + this.f396854a + ')';
        }
    }

    /* compiled from: ReviewGalleryOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/b$d;", "Lgn0/b;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.b$d */
    public static final /* data */ class d implements InterfaceC40713b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f396855a;

        public d(@l DeepLink deepLink) {
            this.f396855a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396855a, ((d) obj).f396855a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f396855a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f396855a, ')');
        }
    }
}
