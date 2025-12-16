package androidx.compose.ui.unit;

import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Dp.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/k;", "", "Landroidx/compose/ui/unit/h;", "left", "top", "right", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/j;", "origin", "Landroidx/compose/ui/unit/l;", "size", "(JJLkotlin/jvm/internal/w;)V", "a", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f42855a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42856b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42857c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42858d;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/k$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public k(float f12, float f13, float f14, float f15, C42822w c42822w) {
        this.f42855a = f12;
        this.f42856b = f13;
        this.f42857c = f14;
        this.f42858d = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.b(this.f42855a, kVar.f42855a) && h.b(this.f42856b, kVar.f42856b) && h.b(this.f42857c, kVar.f42857c) && h.b(this.f42858d, kVar.f42858d);
    }

    public final int hashCode() {
        h.a aVar = h.f42849c;
        return Float.hashCode(this.f42858d) + androidx.appcompat.app.r.d(this.f42857c, androidx.appcompat.app.r.d(this.f42856b, Float.hashCode(this.f42855a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpRect(left=");
        H.u(this.f42855a, ", top=", sb2);
        H.u(this.f42856b, ", right=", sb2);
        H.u(this.f42857c, ", bottom=", sb2);
        return H.h(')', this.f42858d, sb2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(long j12, long j13, C42822w c42822w) {
        float fB2 = j.b(j12);
        float fC2 = j.c(j12);
        float fD2 = l.d(j13) + j.b(j12);
        h.a aVar = h.f42849c;
        this(fB2, fC2, fD2, l.c(j13) + j.c(j12), null);
    }
}
