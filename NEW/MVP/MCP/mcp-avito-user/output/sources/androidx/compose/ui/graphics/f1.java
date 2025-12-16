package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: Shadow.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/f1;", "", "Landroidx/compose/ui/graphics/T;", "color", "Ll0/g;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f39508d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final f1 f39509e = new f1(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f39510a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39511b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39512c;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/f1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f1(long j12, long j13, float f12, C42822w c42822w) {
        this.f39510a = j12;
        this.f39511b = j13;
        this.f39512c = f12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return T.d(this.f39510a, f1Var.f39510a) && l0.g.d(this.f39511b, f1Var.f39511b) && this.f39512c == f1Var.f39512c;
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = kotlin.w0.f410662c;
        int iHashCode = Long.hashCode(this.f39510a) * 31;
        g.a aVar2 = l0.g.f413384b;
        return Float.hashCode(this.f39512c) + androidx.appcompat.app.r.g(iHashCode, 31, this.f39511b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        androidx.compose.foundation.H.z(this.f39510a, ", offset=", sb2);
        sb2.append((Object) l0.g.l(this.f39511b));
        sb2.append(", blurRadius=");
        return androidx.appcompat.app.r.k(')', this.f39512c, sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(long j12, long j13, float f12, int i12, C42822w c42822w) {
        long jD2 = (i12 & 1) != 0 ? V.d(4278190080L) : j12;
        if ((i12 & 2) != 0) {
            l0.g.f413384b.getClass();
            j13 = 0;
        }
        this(jD2, j13, (i12 & 4) != 0 ? 0.0f : f12, null);
    }
}
