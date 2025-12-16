package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SemanticsProperties.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/h;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f41739d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final h f41740e = new h(0.0f, kotlin.ranges.s.m(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a, reason: collision with root package name */
    public final float f41741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.f<Float> f41742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41743c;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/h$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(float f12, @Y61.k kotlin.ranges.f<Float> fVar, int i12) {
        this.f41741a = f12;
        this.f41742b = fVar;
        this.f41743c = i12;
        if (Float.isNaN(f12)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f41741a == hVar.f41741a && L.f(this.f41742b, hVar.f41742b) && this.f41743c == hVar.f41743c;
    }

    public final int hashCode() {
        return ((this.f41742b.hashCode() + (Float.hashCode(this.f41741a) * 31)) * 31) + this.f41743c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f41741a);
        sb2.append(", range=");
        sb2.append(this.f41742b);
        sb2.append(", steps=");
        return androidx.appcompat.app.r.t(sb2, this.f41743c, ')');
    }

    public /* synthetic */ h(float f12, kotlin.ranges.f fVar, int i12, int i13, C42822w c42822w) {
        this(f12, fVar, (i13 & 4) != 0 ? 0 : i12);
    }
}
