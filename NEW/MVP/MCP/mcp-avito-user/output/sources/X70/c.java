package X70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselPhotoGalleryConverter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LX70/c;", "", "a", "b", "c", "d", "e", "f", "LX70/c$a;", "LX70/c$b;", "LX70/c$c;", "LX70/c$d;", "LX70/c$e;", "LX70/c$f;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$a;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AutotekaTeaserResult f18644a;

        public a(@k AutotekaTeaserResult autotekaTeaserResult) {
            this.f18644a = autotekaTeaserResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18644a, ((a) obj).f18644a);
        }

        public final int hashCode() {
            return this.f18644a.hashCode();
        }

        @k
        public final String toString() {
            return "AutotekaTeaserItem(teaser=" + this.f18644a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$b;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinItemTeaser f18645a;

        public b(@k BeduinItemTeaser beduinItemTeaser) {
            this.f18645a = beduinItemTeaser;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f18645a, ((b) obj).f18645a);
        }

        public final int hashCode() {
            return this.f18645a.hashCode();
        }

        @k
        public final String toString() {
            return "BeduinItem(teaser=" + this.f18645a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$d;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NativeVideo f18649a;

        public d(@k NativeVideo nativeVideo) {
            this.f18649a = nativeVideo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f18649a, ((d) obj).f18649a);
        }

        public final int hashCode() {
            return this.f18649a.hashCode();
        }

        @k
        public final String toString() {
            return "NativeVideoItem(nativeVideo=" + this.f18649a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$e;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final GalleryTeaser f18650a;

        public e(@k GalleryTeaser galleryTeaser) {
            this.f18650a = galleryTeaser;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f18650a, ((e) obj).f18650a);
        }

        public final int hashCode() {
            return this.f18650a.hashCode();
        }

        @k
        public final String toString() {
            return "TeaserItem(teaser=" + this.f18650a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$f;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Video f18651a;

        public f(@k Video video) {
            this.f18651a = video;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f18651a, ((f) obj).f18651a);
        }

        public final int hashCode() {
            return this.f18651a.hashCode();
        }

        @k
        public final String toString() {
            return "VideoItem(video=" + this.f18651a + ')';
        }
    }

    /* compiled from: CarouselPhotoGalleryConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/c$c;", "LX70/c;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X70.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1319c implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f18646a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18647b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f18648c;

        public C1319c(@l Image image, boolean z12, @l Image image2) {
            this.f18646a = image;
            this.f18647b = z12;
            this.f18648c = image2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1319c)) {
                return false;
            }
            C1319c c1319c = (C1319c) obj;
            return L.f(this.f18646a, c1319c.f18646a) && this.f18647b == c1319c.f18647b && L.f(this.f18648c, c1319c.f18648c);
        }

        public final int hashCode() {
            Image image = this.f18646a;
            int i12 = r.i((image == null ? 0 : image.hashCode()) * 31, 31, this.f18647b);
            Image image2 = this.f18648c;
            return i12 + (image2 != null ? image2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageItem(image=");
            sb2.append(this.f18646a);
            sb2.append(", isRealty=");
            sb2.append(this.f18647b);
            sb2.append(", aiDesignImage=");
            return AK.c.o(sb2, this.f18648c, ')');
        }

        public /* synthetic */ C1319c(Image image, boolean z12, Image image2, int i12, C42822w c42822w) {
            this(image, z12, (i12 & 4) != 0 ? null : image2);
        }
    }
}
