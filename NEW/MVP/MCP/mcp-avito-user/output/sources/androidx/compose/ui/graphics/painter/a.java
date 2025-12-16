package androidx.compose.ui.graphics.painter;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.C22258i0;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.unit.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BitmapPainter.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/painter/a;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/ui/graphics/q0;", "image", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "<init>", "(Landroidx/compose/ui/graphics/q0;JJLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC22280q0 f39726g;

    /* renamed from: h, reason: collision with root package name */
    public final long f39727h;

    /* renamed from: i, reason: collision with root package name */
    public final long f39728i;

    /* renamed from: j, reason: collision with root package name */
    public int f39729j;

    /* renamed from: k, reason: collision with root package name */
    public final long f39730k;

    /* renamed from: l, reason: collision with root package name */
    public float f39731l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public U f39732m;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(InterfaceC22280q0 interfaceC22280q0, long j12, long j13, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            q.f42862b.getClass();
            j12 = 0;
        }
        long j14 = j12;
        if ((i12 & 4) != 0) {
            j13 = (interfaceC22280q0.getWidth() << 32) | (interfaceC22280q0.getHeight() & 4294967295L);
            u.a aVar = u.f42871b;
        }
        this(interfaceC22280q0, j14, j13, null);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean a(float f12) {
        this.f39731l = f12;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final boolean d(@l U u12) {
        this.f39732m = u12;
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f39726g, aVar.f39726g) && q.c(this.f39727h, aVar.f39727h) && u.c(this.f39728i, aVar.f39728i) && C22258i0.a(this.f39729j, aVar.f39729j);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final long h() {
        return v.c(this.f39730k);
    }

    public final int hashCode() {
        int iHashCode = this.f39726g.hashCode() * 31;
        q.a aVar = q.f42862b;
        int iG2 = r.g(iHashCode, 31, this.f39727h);
        u.a aVar2 = u.f42871b;
        int iG3 = r.g(iG2, 31, this.f39728i);
        int i12 = this.f39729j;
        C22258i0.a aVar3 = C22258i0.f39518b;
        return Integer.hashCode(i12) + iG3;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    public final void i(@k g gVar) {
        u.a aVar = u.f42871b;
        g.X0(gVar, this.f39726g, this.f39727h, this.f39728i, 0L, (Math.round(Float.intBitsToFloat((int) (gVar.i() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (gVar.i() & 4294967295L))) & 4294967295L), this.f39731l, null, this.f39732m, 0, this.f39729j, 328);
    }

    @k
    public final String toString() {
        return "BitmapPainter(image=" + this.f39726g + ", srcOffset=" + ((Object) q.f(this.f39727h)) + ", srcSize=" + ((Object) u.d(this.f39728i)) + ", filterQuality=" + ((Object) C22258i0.b(this.f39729j)) + ')';
    }

    public a(InterfaceC22280q0 interfaceC22280q0, long j12, long j13, C42822w c42822w) {
        int i12;
        int i13;
        this.f39726g = interfaceC22280q0;
        this.f39727h = j12;
        this.f39728i = j13;
        C22258i0.f39518b.getClass();
        this.f39729j = C22258i0.f39519c;
        q.a aVar = q.f42862b;
        if (((int) (j12 >> 32)) >= 0 && ((int) (j12 & 4294967295L)) >= 0 && (i12 = (int) (j13 >> 32)) >= 0 && (i13 = (int) (4294967295L & j13)) >= 0 && i12 <= interfaceC22280q0.getWidth() && i13 <= interfaceC22280q0.getHeight()) {
            this.f39730k = j13;
            this.f39731l = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
