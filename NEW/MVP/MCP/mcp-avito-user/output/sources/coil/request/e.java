package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/e;", "Lcoil/request/q;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Drawable f58641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f58642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Throwable f58643c;

    public e(@Y61.l Drawable drawable, @Y61.k p pVar, @Y61.k Throwable th2) {
        super(null);
        this.f58641a = drawable;
        this.f58642b = pVar;
        this.f58643c = th2;
    }

    @Override // coil.request.q
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Drawable getF58641a() {
        return this.f58641a;
    }

    @Override // coil.request.q
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final p getF58642b() {
        return this.f58642b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (L.f(this.f58641a, eVar.f58641a)) {
                if (L.f(this.f58642b, eVar.f58642b) && L.f(this.f58643c, eVar.f58643c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f58641a;
        return this.f58643c.hashCode() + ((this.f58642b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
