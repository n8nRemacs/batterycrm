package gn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.adapter.gallery.GalleryItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewGalleryAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lgn0/a;", "", "a", "b", "c", "d", "e", "Lgn0/a$a;", "Lgn0/a$b;", "Lgn0/a$c;", "Lgn0/a$d;", "Lgn0/a$e;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40712a {

    /* compiled from: ReviewGalleryAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn0/a$a;", "Lgn0/a;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11229a implements InterfaceC40712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11229a f396844a = new C11229a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11229a);
        }

        public final int hashCode() {
            return -1837680680;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: ReviewGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/a$b;", "Lgn0/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.a$b */
    public static final /* data */ class b implements InterfaceC40712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GalleryItem.GalleryButton f396845a;

        public b(@k GalleryItem.GalleryButton galleryButton) {
            this.f396845a = galleryButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f396845a, ((b) obj).f396845a);
        }

        public final int hashCode() {
            return this.f396845a.hashCode();
        }

        @k
        public final String toString() {
            return "ContactButtonClicked(button=" + this.f396845a + ')';
        }
    }

    /* compiled from: ReviewGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/a$c;", "Lgn0/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.a$c */
    public static final /* data */ class c implements InterfaceC40712a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GalleryItem.GalleyReview f396846a;

        public c(@k GalleryItem.GalleyReview galleyReview) {
            this.f396846a = galleyReview;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396846a, ((c) obj).f396846a);
        }

        public final int hashCode() {
            return this.f396846a.hashCode();
        }

        @k
        public final String toString() {
            return "MoreClicked(galleryReview=" + this.f396846a + ')';
        }
    }

    /* compiled from: ReviewGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/a$d;", "Lgn0/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.a$d */
    public static final /* data */ class d implements InterfaceC40712a {

        /* renamed from: a, reason: collision with root package name */
        public final int f396847a;

        /* renamed from: b, reason: collision with root package name */
        public final int f396848b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final GalleryItem f396849c;

        public d(int i12, int i13, @k GalleryItem galleryItem) {
            this.f396847a = i12;
            this.f396848b = i13;
            this.f396849c = galleryItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f396847a == dVar.f396847a && this.f396848b == dVar.f396848b && L.f(this.f396849c, dVar.f396849c);
        }

        public final int hashCode() {
            return this.f396849c.hashCode() + r.e(this.f396848b, Integer.hashCode(this.f396847a) * 31, 31);
        }

        @k
        public final String toString() {
            return "OnScrolled(oldPosition=" + this.f396847a + ", newPosition=" + this.f396848b + ", galleryItem=" + this.f396849c + ')';
        }
    }

    /* compiled from: ReviewGalleryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn0/a$e;", "Lgn0/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.a$e */
    public static final /* data */ class e implements InterfaceC40712a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f396850a;

        /* renamed from: b, reason: collision with root package name */
        public final int f396851b;

        public e(int i12, @l Long l12) {
            this.f396850a = l12;
            this.f396851b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f396850a, eVar.f396850a) && this.f396851b == eVar.f396851b;
        }

        public final int hashCode() {
            Long l12 = this.f396850a;
            return Integer.hashCode(this.f396851b) + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Opened(reviewId=");
            sb2.append(this.f396850a);
            sb2.append(", position=");
            return r.t(sb2, this.f396851b, ')');
        }
    }
}
