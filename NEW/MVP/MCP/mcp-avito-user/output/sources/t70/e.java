package T70;

import T70.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LT70/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f15415j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final e f15416k = new e(null, false, -1, -1, -1, null, new b(null, null, null, null, null, null, 63, null), new f(g.b.f15429b, new T70.a(null, C42784z0.f406748b, null)));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final GridGalleryOpenParams f15417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15421f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f15422g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final b f15423h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final f f15424i;

    /* compiled from: GridGalleryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT70/e$a;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@l GridGalleryOpenParams gridGalleryOpenParams, boolean z12, int i12, int i13, int i14, @l String str, @k b bVar, @k f fVar) {
        this.f15417b = gridGalleryOpenParams;
        this.f15418c = z12;
        this.f15419d = i12;
        this.f15420e = i13;
        this.f15421f = i14;
        this.f15422g = str;
        this.f15423h = bVar;
        this.f15424i = fVar;
    }

    public static e a(e eVar, GridGalleryOpenParams gridGalleryOpenParams, boolean z12, int i12, int i13, int i14, String str, b bVar, f fVar, int i15) {
        GridGalleryOpenParams gridGalleryOpenParams2 = (i15 & 1) != 0 ? eVar.f15417b : gridGalleryOpenParams;
        boolean z13 = (i15 & 2) != 0 ? eVar.f15418c : z12;
        int i16 = (i15 & 4) != 0 ? eVar.f15419d : i12;
        int i17 = (i15 & 8) != 0 ? eVar.f15420e : i13;
        int i18 = (i15 & 16) != 0 ? eVar.f15421f : i14;
        String str2 = (i15 & 32) != 0 ? eVar.f15422g : str;
        b bVar2 = (i15 & 64) != 0 ? eVar.f15423h : bVar;
        f fVar2 = (i15 & 128) != 0 ? eVar.f15424i : fVar;
        eVar.getClass();
        return new e(gridGalleryOpenParams2, z13, i16, i17, i18, str2, bVar2, fVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f15417b, eVar.f15417b) && this.f15418c == eVar.f15418c && this.f15419d == eVar.f15419d && this.f15420e == eVar.f15420e && this.f15421f == eVar.f15421f && L.f(this.f15422g, eVar.f15422g) && L.f(this.f15423h, eVar.f15423h) && L.f(this.f15424i, eVar.f15424i);
    }

    public final int hashCode() {
        GridGalleryOpenParams gridGalleryOpenParams = this.f15417b;
        int iE2 = r.e(this.f15421f, r.e(this.f15420e, r.e(this.f15419d, r.i((gridGalleryOpenParams == null ? 0 : gridGalleryOpenParams.hashCode()) * 31, 31, this.f15418c), 31), 31), 31);
        String str = this.f15422g;
        return this.f15424i.hashCode() + ((this.f15423h.hashCode() + ((iE2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "GridGalleryState(openParams=" + this.f15417b + ", isNeedToInitialScroll=" + this.f15418c + ", lastValidGridGalleryItemPosition=" + this.f15419d + ", fullScreenGalleryPosition=" + this.f15420e + ", advertGalleryPosition=" + this.f15421f + ", selectedNavBarBlockTitle=" + this.f15422g + ", galleryPositions=" + this.f15423h + ", viewState=" + this.f15424i + ')';
    }
}
