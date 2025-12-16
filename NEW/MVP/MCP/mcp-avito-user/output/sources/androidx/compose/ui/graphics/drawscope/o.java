package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/o;", "Landroidx/compose/ui/graphics/drawscope/j;", "", "width", "miter", "Landroidx/compose/ui/graphics/m1;", "cap", "Landroidx/compose/ui/graphics/n1;", "join", "Landroidx/compose/ui/graphics/I0;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/I0;Lkotlin/jvm/internal/w;)V", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f39498f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f39499a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39502d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final I0 f39503e;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/o$a;", "", "<init>", "()V", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        m1.f39698b.getClass();
        n1.f39707b.getClass();
    }

    public /* synthetic */ o(float f12, float f13, int i12, int i13, I0 i02, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0.0f : f12, (i14 & 2) != 0 ? 4.0f : f13, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? null : i02, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f39499a == oVar.f39499a && this.f39500b == oVar.f39500b && m1.b(this.f39501c, oVar.f39501c) && n1.b(this.f39502d, oVar.f39502d) && L.f(this.f39503e, oVar.f39503e);
    }

    public final int hashCode() {
        int iD2 = r.d(this.f39500b, Float.hashCode(this.f39499a) * 31, 31);
        m1.a aVar = m1.f39698b;
        int iE2 = r.e(this.f39501c, iD2, 31);
        n1.a aVar2 = n1.f39707b;
        int iE3 = r.e(this.f39502d, iE2, 31);
        I0 i02 = this.f39503e;
        return iE3 + (i02 != null ? i02.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Stroke(width=" + this.f39499a + ", miter=" + this.f39500b + ", cap=" + ((Object) m1.c(this.f39501c)) + ", join=" + ((Object) n1.c(this.f39502d)) + ", pathEffect=" + this.f39503e + ')';
    }

    public o(float f12, float f13, int i12, int i13, I0 i02, C42822w c42822w) {
        super(null);
        this.f39499a = f12;
        this.f39500b = f13;
        this.f39501c = i12;
        this.f39502d = i13;
        this.f39503e = i02;
    }
}
