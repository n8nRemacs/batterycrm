package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/x;", "Lcoil/request/q;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x extends q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Drawable f58738a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f58739b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DataSource f58740c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final MemoryCache.Key f58741d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f58742e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58743f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58744g;

    public /* synthetic */ x(Drawable drawable, p pVar, DataSource dataSource, MemoryCache.Key key, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(drawable, pVar, dataSource, (i12 & 8) != 0 ? null : key, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13);
    }

    @Override // coil.request.q
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Drawable getF58738a() {
        return this.f58738a;
    }

    @Override // coil.request.q
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final p getF58739b() {
        return this.f58739b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (L.f(this.f58738a, xVar.f58738a)) {
                if (L.f(this.f58739b, xVar.f58739b) && this.f58740c == xVar.f58740c && L.f(this.f58741d, xVar.f58741d) && L.f(this.f58742e, xVar.f58742e) && this.f58743f == xVar.f58743f && this.f58744g == xVar.f58744g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f58740c.hashCode() + ((this.f58739b.hashCode() + (this.f58738a.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.f58741d;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f58742e;
        return Boolean.hashCode(this.f58744g) + androidx.appcompat.app.r.i((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f58743f);
    }

    public x(@Y61.k Drawable drawable, @Y61.k p pVar, @Y61.k DataSource dataSource, @Y61.l MemoryCache.Key key, @Y61.l String str, boolean z12, boolean z13) {
        super(null);
        this.f58738a = drawable;
        this.f58739b = pVar;
        this.f58740c = dataSource;
        this.f58741d = key;
        this.f58742e = str;
        this.f58743f = z12;
        this.f58744g = z13;
    }
}
