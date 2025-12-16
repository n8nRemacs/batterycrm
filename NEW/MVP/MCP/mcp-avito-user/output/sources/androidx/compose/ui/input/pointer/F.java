package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.U;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: InternalPointerInput.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/F;", "", "Landroidx/compose/ui/input/pointer/B;", "id", "", "uptime", "Ll0/g;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/U;", "type", "activeHover", "", "Landroidx/compose/ui/input/pointer/e;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class F {

    /* renamed from: a, reason: collision with root package name */
    public final long f40138a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40140c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40141d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40142e;

    /* renamed from: f, reason: collision with root package name */
    public final float f40143f;

    /* renamed from: g, reason: collision with root package name */
    public final int f40144g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40145h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<C22327e> f40146i;

    /* renamed from: j, reason: collision with root package name */
    public final long f40147j;

    /* renamed from: k, reason: collision with root package name */
    public final long f40148k;

    public F() {
        throw null;
    }

    public F(long j12, long j13, long j14, long j15, boolean z12, float f12, int i12, boolean z13, List list, long j16, long j17, C42822w c42822w) {
        this.f40138a = j12;
        this.f40139b = j13;
        this.f40140c = j14;
        this.f40141d = j15;
        this.f40142e = z12;
        this.f40143f = f12;
        this.f40144g = i12;
        this.f40145h = z13;
        this.f40146i = list;
        this.f40147j = j16;
        this.f40148k = j17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return B.a(this.f40138a, f12.f40138a) && this.f40139b == f12.f40139b && l0.g.d(this.f40140c, f12.f40140c) && l0.g.d(this.f40141d, f12.f40141d) && this.f40142e == f12.f40142e && Float.compare(this.f40143f, f12.f40143f) == 0 && U.a(this.f40144g, f12.f40144g) && this.f40145h == f12.f40145h && kotlin.jvm.internal.L.f(this.f40146i, f12.f40146i) && l0.g.d(this.f40147j, f12.f40147j) && l0.g.d(this.f40148k, f12.f40148k);
    }

    public final int hashCode() {
        int iG2 = androidx.appcompat.app.r.g(Long.hashCode(this.f40138a) * 31, 31, this.f40139b);
        g.a aVar = l0.g.f413384b;
        int iD2 = androidx.appcompat.app.r.d(this.f40143f, androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(iG2, 31, this.f40140c), 31, this.f40141d), 31, this.f40142e), 31);
        U.a aVar2 = U.f40189b;
        return Long.hashCode(this.f40148k) + androidx.appcompat.app.r.g(androidx.compose.foundation.H.e(androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f40144g, iD2, 31), 31, this.f40145h), 31, this.f40146i), 31, this.f40147j);
    }

    @Y61.k
    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) B.b(this.f40138a)) + ", uptime=" + this.f40139b + ", positionOnScreen=" + ((Object) l0.g.l(this.f40140c)) + ", position=" + ((Object) l0.g.l(this.f40141d)) + ", down=" + this.f40142e + ", pressure=" + this.f40143f + ", type=" + ((Object) U.b(this.f40144g)) + ", activeHover=" + this.f40145h + ", historical=" + this.f40146i + ", scrollDelta=" + ((Object) l0.g.l(this.f40147j)) + ", originalEventPosition=" + ((Object) l0.g.l(this.f40148k)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(long j12, long j13, long j14, long j15, boolean z12, float f12, int i12, boolean z13, List list, long j16, long j17, int i13, C42822w c42822w) {
        long j18;
        long j19;
        boolean z14 = (i13 & 128) != 0 ? false : z13;
        List arrayList = (i13 & 256) != 0 ? new ArrayList() : list;
        if ((i13 & 512) != 0) {
            l0.g.f413384b.getClass();
            j18 = 0;
        } else {
            j18 = j16;
        }
        if ((i13 & 1024) != 0) {
            l0.g.f413384b.getClass();
            j19 = 0;
        } else {
            j19 = j17;
        }
        this(j12, j13, j14, j15, z12, f12, i12, z14, arrayList, j18, j19, null);
    }
}
