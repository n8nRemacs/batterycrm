package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.view.C27253g;
import coil.view.Scale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.Headers;
import okhttp3.internal.http2.Http2;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/t;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f58717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bitmap.Config f58718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ColorSpace f58719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C27253g f58720d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Scale f58721e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58722f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58723g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58724h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f58725i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Headers f58726j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final y f58727k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final u f58728l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58729m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58730n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58731o;

    public t(@Y61.k Context context, @Y61.k Bitmap.Config config, @Y61.l ColorSpace colorSpace, @Y61.k C27253g c27253g, @Y61.k Scale scale, boolean z12, boolean z13, boolean z14, @Y61.l String str, @Y61.k Headers headers, @Y61.k y yVar, @Y61.k u uVar, @Y61.k CachePolicy cachePolicy, @Y61.k CachePolicy cachePolicy2, @Y61.k CachePolicy cachePolicy3) {
        this.f58717a = context;
        this.f58718b = config;
        this.f58719c = colorSpace;
        this.f58720d = c27253g;
        this.f58721e = scale;
        this.f58722f = z12;
        this.f58723g = z13;
        this.f58724h = z14;
        this.f58725i = str;
        this.f58726j = headers;
        this.f58727k = yVar;
        this.f58728l = uVar;
        this.f58729m = cachePolicy;
        this.f58730n = cachePolicy2;
        this.f58731o = cachePolicy3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (L.f(this.f58717a, tVar.f58717a) && this.f58718b == tVar.f58718b && L.f(this.f58719c, tVar.f58719c) && L.f(this.f58720d, tVar.f58720d) && this.f58721e == tVar.f58721e && this.f58722f == tVar.f58722f && this.f58723g == tVar.f58723g && this.f58724h == tVar.f58724h && L.f(this.f58725i, tVar.f58725i) && L.f(this.f58726j, tVar.f58726j) && L.f(this.f58727k, tVar.f58727k) && L.f(this.f58728l, tVar.f58728l) && this.f58729m == tVar.f58729m && this.f58730n == tVar.f58730n && this.f58731o == tVar.f58731o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f58718b.hashCode() + (this.f58717a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f58719c;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f58721e.hashCode() + ((this.f58720d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f58722f), 31, this.f58723g), 31, this.f58724h);
        String str = this.f58725i;
        return this.f58731o.hashCode() + ((this.f58730n.hashCode() + ((this.f58729m.hashCode() + AK.c.c(AK.c.c((this.f58726j.hashCode() + ((i12 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f58727k.f58747a), 31, this.f58728l.f58733b)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Context context, Bitmap.Config config, ColorSpace colorSpace, C27253g c27253g, Scale scale, boolean z12, boolean z13, boolean z14, String str, Headers headers, y yVar, u uVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i12, C42822w c42822w) {
        ColorSpace colorSpace2;
        Bitmap.Config config2 = (i12 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config;
        if ((i12 & 4) != 0) {
            Bitmap.Config[] configArr = coil.util.l.f58781a;
            colorSpace2 = null;
        } else {
            colorSpace2 = colorSpace;
        }
        this(context, config2, colorSpace2, (i12 & 8) != 0 ? C27253g.f58764c : c27253g, (i12 & 16) != 0 ? Scale.f58756c : scale, (i12 & 32) != 0 ? false : z12, (i12 & 64) == 0 ? z13 : false, (i12 & 128) != 0 ? true : z14, (i12 & 256) == 0 ? str : null, (i12 & 512) != 0 ? coil.util.l.f58783c : headers, (i12 & 1024) != 0 ? y.f58746c : yVar, (i12 & 2048) != 0 ? u.f58732c : uVar, (i12 & 4096) != 0 ? CachePolicy.f58614d : cachePolicy, (i12 & 8192) != 0 ? CachePolicy.f58614d : cachePolicy2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? CachePolicy.f58614d : cachePolicy3);
    }
}
