package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.C22250e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceRenderNode.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/X0;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/Z0;", "renderEffect", "Landroidx/compose/ui/graphics/e0;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/Z0;ILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f41303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41308f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41309g;

    /* renamed from: h, reason: collision with root package name */
    public final float f41310h;

    /* renamed from: i, reason: collision with root package name */
    public final float f41311i;

    /* renamed from: j, reason: collision with root package name */
    public final float f41312j;

    /* renamed from: k, reason: collision with root package name */
    public final float f41313k;

    /* renamed from: l, reason: collision with root package name */
    public final float f41314l;

    /* renamed from: m, reason: collision with root package name */
    public final int f41315m;

    /* renamed from: n, reason: collision with root package name */
    public final int f41316n;

    /* renamed from: o, reason: collision with root package name */
    public final float f41317o;

    /* renamed from: p, reason: collision with root package name */
    public final float f41318p;

    /* renamed from: q, reason: collision with root package name */
    public final float f41319q;

    /* renamed from: r, reason: collision with root package name */
    public final float f41320r;

    /* renamed from: s, reason: collision with root package name */
    public final float f41321s;

    /* renamed from: t, reason: collision with root package name */
    public final float f41322t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f41323u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f41324v;

    /* renamed from: w, reason: collision with root package name */
    public final float f41325w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.graphics.Z0 f41326x;

    /* renamed from: y, reason: collision with root package name */
    public final int f41327y;

    public X0(long j12, int i12, int i13, int i14, int i15, int i16, int i17, float f12, float f13, float f14, float f15, float f16, int i18, int i19, float f17, float f18, float f19, float f22, float f23, float f24, boolean z12, boolean z13, float f25, androidx.compose.ui.graphics.Z0 z02, int i22, C42822w c42822w) {
        this.f41303a = j12;
        this.f41304b = i12;
        this.f41305c = i13;
        this.f41306d = i14;
        this.f41307e = i15;
        this.f41308f = i16;
        this.f41309g = i17;
        this.f41310h = f12;
        this.f41311i = f13;
        this.f41312j = f14;
        this.f41313k = f15;
        this.f41314l = f16;
        this.f41315m = i18;
        this.f41316n = i19;
        this.f41317o = f17;
        this.f41318p = f18;
        this.f41319q = f19;
        this.f41320r = f22;
        this.f41321s = f23;
        this.f41322t = f24;
        this.f41323u = z12;
        this.f41324v = z13;
        this.f41325w = f25;
        this.f41326x = z02;
        this.f41327y = i22;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        return this.f41303a == x02.f41303a && this.f41304b == x02.f41304b && this.f41305c == x02.f41305c && this.f41306d == x02.f41306d && this.f41307e == x02.f41307e && this.f41308f == x02.f41308f && this.f41309g == x02.f41309g && Float.compare(this.f41310h, x02.f41310h) == 0 && Float.compare(this.f41311i, x02.f41311i) == 0 && Float.compare(this.f41312j, x02.f41312j) == 0 && Float.compare(this.f41313k, x02.f41313k) == 0 && Float.compare(this.f41314l, x02.f41314l) == 0 && this.f41315m == x02.f41315m && this.f41316n == x02.f41316n && Float.compare(this.f41317o, x02.f41317o) == 0 && Float.compare(this.f41318p, x02.f41318p) == 0 && Float.compare(this.f41319q, x02.f41319q) == 0 && Float.compare(this.f41320r, x02.f41320r) == 0 && Float.compare(this.f41321s, x02.f41321s) == 0 && Float.compare(this.f41322t, x02.f41322t) == 0 && this.f41323u == x02.f41323u && this.f41324v == x02.f41324v && Float.compare(this.f41325w, x02.f41325w) == 0 && kotlin.jvm.internal.L.f(this.f41326x, x02.f41326x) && C22250e0.a(this.f41327y, x02.f41327y);
    }

    public final int hashCode() {
        int iD2 = androidx.appcompat.app.r.d(this.f41325w, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f41322t, androidx.appcompat.app.r.d(this.f41321s, androidx.appcompat.app.r.d(this.f41320r, androidx.appcompat.app.r.d(this.f41319q, androidx.appcompat.app.r.d(this.f41318p, androidx.appcompat.app.r.d(this.f41317o, androidx.appcompat.app.r.e(this.f41316n, androidx.appcompat.app.r.e(this.f41315m, androidx.appcompat.app.r.d(this.f41314l, androidx.appcompat.app.r.d(this.f41313k, androidx.appcompat.app.r.d(this.f41312j, androidx.appcompat.app.r.d(this.f41311i, androidx.appcompat.app.r.d(this.f41310h, androidx.appcompat.app.r.e(this.f41309g, androidx.appcompat.app.r.e(this.f41308f, androidx.appcompat.app.r.e(this.f41307e, androidx.appcompat.app.r.e(this.f41306d, androidx.appcompat.app.r.e(this.f41305c, androidx.appcompat.app.r.e(this.f41304b, Long.hashCode(this.f41303a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f41323u), 31, this.f41324v), 31);
        androidx.compose.ui.graphics.Z0 z02 = this.f41326x;
        int iHashCode = z02 == null ? 0 : z02.hashCode();
        C22250e0.a aVar = C22250e0.f39504b;
        return Integer.hashCode(this.f41327y) + ((iD2 + iHashCode) * 31);
    }

    @Y61.k
    public final String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f41303a + ", left=" + this.f41304b + ", top=" + this.f41305c + ", right=" + this.f41306d + ", bottom=" + this.f41307e + ", width=" + this.f41308f + ", height=" + this.f41309g + ", scaleX=" + this.f41310h + ", scaleY=" + this.f41311i + ", translationX=" + this.f41312j + ", translationY=" + this.f41313k + ", elevation=" + this.f41314l + ", ambientShadowColor=" + this.f41315m + ", spotShadowColor=" + this.f41316n + ", rotationZ=" + this.f41317o + ", rotationX=" + this.f41318p + ", rotationY=" + this.f41319q + ", cameraDistance=" + this.f41320r + ", pivotX=" + this.f41321s + ", pivotY=" + this.f41322t + ", clipToOutline=" + this.f41323u + ", clipToBounds=" + this.f41324v + ", alpha=" + this.f41325w + ", renderEffect=" + this.f41326x + ", compositingStrategy=" + ((Object) C22250e0.b(this.f41327y)) + ')';
    }
}
