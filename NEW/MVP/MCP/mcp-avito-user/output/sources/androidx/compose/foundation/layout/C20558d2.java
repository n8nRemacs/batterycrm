package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/d2;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C20558d2 {

    /* renamed from: a, reason: collision with root package name */
    public float f28594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AbstractC20606p0 f28596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public L0 f28597d;

    public C20558d2() {
        this(0.0f, false, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20558d2)) {
            return false;
        }
        C20558d2 c20558d2 = (C20558d2) obj;
        return Float.compare(this.f28594a, c20558d2.f28594a) == 0 && this.f28595b == c20558d2.f28595b && kotlin.jvm.internal.L.f(this.f28596c, c20558d2.f28596c) && kotlin.jvm.internal.L.f(this.f28597d, c20558d2.f28597d);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(Float.hashCode(this.f28594a) * 31, 31, this.f28595b);
        AbstractC20606p0 abstractC20606p0 = this.f28596c;
        int iHashCode = (i12 + (abstractC20606p0 == null ? 0 : abstractC20606p0.hashCode())) * 31;
        L0 l02 = this.f28597d;
        return iHashCode + (l02 != null ? Float.hashCode(l02.f28366a) : 0);
    }

    @Y61.k
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f28594a + ", fill=" + this.f28595b + ", crossAxisAlignment=" + this.f28596c + ", flowLayoutData=" + this.f28597d + ')';
    }

    public C20558d2(float f12, boolean z12, AbstractC20606p0 abstractC20606p0, L0 l02, int i12, C42822w c42822w) {
        f12 = (i12 & 1) != 0 ? 0.0f : f12;
        z12 = (i12 & 2) != 0 ? true : z12;
        abstractC20606p0 = (i12 & 4) != 0 ? null : abstractC20606p0;
        l02 = (i12 & 8) != 0 ? null : l02;
        this.f28594a = f12;
        this.f28595b = z12;
        this.f28596c = abstractC20606p0;
        this.f28597d = l02;
    }
}
