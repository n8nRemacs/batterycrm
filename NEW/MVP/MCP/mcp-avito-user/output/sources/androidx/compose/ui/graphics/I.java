package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.ui.graphics.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/I;", "Landroidx/compose/ui/graphics/Z0;", "renderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/p1;", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/Z0;FFILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I extends Z0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Z0 f39281b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39282c;

    /* renamed from: d, reason: collision with root package name */
    public final float f39283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39284e;

    public I(Z0 z02, float f12, float f13, int i12, C42822w c42822w) {
        super(null);
        this.f39281b = z02;
        this.f39282c = f12;
        this.f39283d = f13;
        this.f39284e = i12;
    }

    @Override // androidx.compose.ui.graphics.Z0
    @Y61.k
    @j.X
    public final RenderEffect b() {
        b1.f39350a.getClass();
        float f12 = this.f39282c;
        float f13 = this.f39283d;
        if (f12 == 0.0f && f13 == 0.0f) {
            return RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        Z0 z02 = this.f39281b;
        int i12 = this.f39284e;
        return z02 == null ? RenderEffect.createBlurEffect(f12, f13, A.a(i12)) : RenderEffect.createBlurEffect(f12, f13, z02.a(), A.a(i12));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return this.f39282c == i12.f39282c && this.f39283d == i12.f39283d && p1.a(this.f39284e, i12.f39284e) && kotlin.jvm.internal.L.f(this.f39281b, i12.f39281b);
    }

    public final int hashCode() {
        Z0 z02 = this.f39281b;
        int iD2 = androidx.appcompat.app.r.d(this.f39283d, androidx.appcompat.app.r.d(this.f39282c, (z02 != null ? z02.hashCode() : 0) * 31, 31), 31);
        p1.a aVar = p1.f39721b;
        return Integer.hashCode(this.f39284e) + iD2;
    }

    @Y61.k
    public final String toString() {
        return "BlurEffect(renderEffect=" + this.f39281b + ", radiusX=" + this.f39282c + ", radiusY=" + this.f39283d + ", edgeTreatment=" + ((Object) p1.b(this.f39284e)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(Z0 z02, float f12, float f13, int i12, int i13, C42822w c42822w) {
        float f14 = (i13 & 4) != 0 ? f12 : f13;
        if ((i13 & 8) != 0) {
            p1.f39721b.getClass();
            i12 = 0;
        }
        this(z02, f12, f14, i12, null);
    }
}
