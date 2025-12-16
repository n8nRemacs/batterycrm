package T70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_gallery.LegacyPhotoGalleryOpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LT70/d;", "", "a", "b", "c", "d", "e", "LT70/d$a;", "LT70/d$b;", "LT70/d$c;", "LT70/d$d;", "LT70/d$e;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {

    /* compiled from: GridGalleryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/d$a;", "LT70/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15409a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f15410b;

        public a(int i12, @l Long l12) {
            this.f15409a = i12;
            this.f15410b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15409a == aVar.f15409a && L.f(this.f15410b, aVar.f15410b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f15409a) * 31;
            Long l12 = this.f15410b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreen(galleryPosition=");
            sb2.append(this.f15409a);
            sb2.append(", stateId=");
            return m.m(sb2, this.f15410b, ')');
        }
    }

    /* compiled from: GridGalleryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/d$b;", "LT70/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15411a;

        public b(@k DeepLink deepLink) {
            this.f15411a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15411a, ((b) obj).f15411a);
        }

        public final int hashCode() {
            return this.f15411a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f15411a, ')');
        }
    }

    /* compiled from: GridGalleryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/d$c;", "LT70/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LegacyPhotoGalleryOpenParams f15412a;

        public c(@k LegacyPhotoGalleryOpenParams legacyPhotoGalleryOpenParams) {
            this.f15412a = legacyPhotoGalleryOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15412a, ((c) obj).f15412a);
        }

        public final int hashCode() {
            return this.f15412a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFullScreenGallery(legacyPhotoGalleryOpenParams=" + this.f15412a + ')';
        }
    }

    /* compiled from: GridGalleryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/d$d;", "LT70/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: T70.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1051d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15413a;

        public C1051d(int i12) {
            this.f15413a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1051d) && this.f15413a == ((C1051d) obj).f15413a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15413a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(itemPosition="), this.f15413a, ')');
        }
    }

    /* compiled from: GridGalleryOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/d$e;", "LT70/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15414a;

        public e(int i12) {
            this.f15414a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f15414a == ((e) obj).f15414a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15414a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SmoothScrollToItem(itemPosition="), this.f15414a, ')');
        }
    }
}
