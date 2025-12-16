package androidx.compose.foundation;

import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Border.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/f0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C20425f0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public InterfaceC22280q0 f27137a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.M f27138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.drawscope.a f27139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Path f27140d;

    public C20425f0() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20425f0)) {
            return false;
        }
        C20425f0 c20425f0 = (C20425f0) obj;
        return kotlin.jvm.internal.L.f(this.f27137a, c20425f0.f27137a) && kotlin.jvm.internal.L.f(this.f27138b, c20425f0.f27138b) && kotlin.jvm.internal.L.f(this.f27139c, c20425f0.f27139c) && kotlin.jvm.internal.L.f(this.f27140d, c20425f0.f27140d);
    }

    public final int hashCode() {
        InterfaceC22280q0 interfaceC22280q0 = this.f27137a;
        int iHashCode = (interfaceC22280q0 == null ? 0 : interfaceC22280q0.hashCode()) * 31;
        androidx.compose.ui.graphics.M m12 = this.f27138b;
        int iHashCode2 = (iHashCode + (m12 == null ? 0 : m12.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f27139c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Path path = this.f27140d;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f27137a + ", canvas=" + this.f27138b + ", canvasDrawScope=" + this.f27139c + ", borderPath=" + this.f27140d + ')';
    }

    public C20425f0(InterfaceC22280q0 interfaceC22280q0, androidx.compose.ui.graphics.M m12, androidx.compose.ui.graphics.drawscope.a aVar, Path path, int i12, C42822w c42822w) {
        interfaceC22280q0 = (i12 & 1) != 0 ? null : interfaceC22280q0;
        m12 = (i12 & 2) != 0 ? null : m12;
        aVar = (i12 & 4) != 0 ? null : aVar;
        path = (i12 & 8) != 0 ? null : path;
        this.f27137a = interfaceC22280q0;
        this.f27138b = m12;
        this.f27139c = aVar;
        this.f27140d = path;
    }
}
