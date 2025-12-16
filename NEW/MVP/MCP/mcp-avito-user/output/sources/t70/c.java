package T70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LT70/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LT70/c$a;", "LT70/c$b;", "LT70/c$c;", "LT70/c$d;", "LT70/c$e;", "LT70/c$f;", "LT70/c$g;", "LT70/c$h;", "LT70/c$i;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/c$a;", "LT70/c;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15398a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1654021404;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/c$b;", "LT70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15399a;

        public b(@k DeepLink deepLink) {
            this.f15399a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15399a, ((b) obj).f15399a);
        }

        public final int hashCode() {
            return this.f15399a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnBottomBarButtonClick(deeplink="), this.f15399a, ')');
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/c$c;", "LT70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: T70.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1050c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15400a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15401b;

        public C1050c(int i12, int i13) {
            this.f15400a = i12;
            this.f15401b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1050c)) {
                return false;
            }
            C1050c c1050c = (C1050c) obj;
            return this.f15400a == c1050c.f15400a && this.f15401b == c1050c.f15401b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15401b) + (Integer.hashCode(this.f15400a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnItemClick(fullScreenGalleryPosition=");
            sb2.append(this.f15400a);
            sb2.append(", gridGalleryPosition=");
            return r.t(sb2, this.f15401b, ')');
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/c$d;", "LT70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15402a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15403b;

        public d(int i12, int i13) {
            this.f15402a = i12;
            this.f15403b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15402a == dVar.f15402a && this.f15403b == dVar.f15403b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15403b) + (Integer.hashCode(this.f15402a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnItemsScrolled(firstPosition=");
            sb2.append(this.f15402a);
            sb2.append(", lastPosition=");
            return r.t(sb2, this.f15403b, ')');
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/c$e;", "LT70/c;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f15404a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1561243382;
        }

        @k
        public final String toString() {
            return "OnListSubmitted";
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/c$f;", "LT70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15405a;

        public f(@k String str) {
            this.f15405a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f15405a, ((f) obj).f15405a);
        }

        public final int hashCode() {
            return this.f15405a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnNavbarChipClick(blockTitle="), this.f15405a, ')');
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/c$g;", "LT70/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15406a;

        public g(int i12) {
            this.f15406a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f15406a == ((g) obj).f15406a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15406a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnReturnFromFullScreenGallery(fullScreenGalleryPosition="), this.f15406a, ')');
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/c$h;", "LT70/c;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f15407a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1158282915;
        }

        @k
        public final String toString() {
            return "OnSystemBack";
        }
    }

    /* compiled from: GridGalleryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/c$i;", "LT70/c;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f15408a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -365081691;
        }

        @k
        public final String toString() {
            return "OnUserLeftScreen";
        }
    }
}
