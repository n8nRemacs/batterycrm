package VU;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShadowModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVU/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17168a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f17169b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f17170c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17171d;

    public c() {
        this(false, null, null, 0.0f, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17168a == cVar.f17168a && L.f(this.f17169b, cVar.f17169b) && L.f(this.f17170c, cVar.f17170c) && Float.compare(this.f17171d, cVar.f17171d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17171d) + ((this.f17170c.hashCode() + ((this.f17169b.hashCode() + (Boolean.hashCode(this.f17168a) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowModel(shadowEnabled=");
        sb2.append(this.f17168a);
        sb2.append(", upperShadowParams=");
        sb2.append(this.f17169b);
        sb2.append(", bottomShadowParams=");
        sb2.append(this.f17170c);
        sb2.append(", cornerRadius=");
        return r.k(')', this.f17171d, sb2);
    }

    public c(float f12, @k d dVar, @k d dVar2, boolean z12) {
        this.f17168a = z12;
        this.f17169b = dVar;
        this.f17170c = dVar2;
        this.f17171d = f12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(boolean z12, d dVar, d dVar2, float f12, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        this((i12 & 8) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? new d(0, 0, 0, 0, 15, null) : dVar, (i12 & 4) != 0 ? new d(0, 0, 0, 0, 15, null) : dVar2, z12);
    }
}
