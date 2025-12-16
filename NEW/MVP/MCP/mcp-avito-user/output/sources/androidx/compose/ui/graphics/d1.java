package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/d1;", "Landroidx/compose/ui/graphics/J;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d1 extends J {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Shader f39475b;

    /* renamed from: c, reason: collision with root package name */
    public long f39476c;

    public d1() {
        super(null);
        l0.n.f413402b.getClass();
        this.f39476c = l0.n.f413403c;
    }

    @Override // androidx.compose.ui.graphics.J
    public final void a(float f12, long j12, @Y61.k F0 f02) {
        Shader shaderB = this.f39475b;
        if (shaderB == null || !l0.n.b(this.f39476c, j12)) {
            if (l0.n.f(j12)) {
                shaderB = null;
                this.f39475b = null;
                l0.n.f413402b.getClass();
                this.f39476c = l0.n.f413403c;
            } else {
                shaderB = b(j12);
                this.f39475b = shaderB;
                this.f39476c = j12;
            }
        }
        long jA2 = f02.a();
        T.f39320b.getClass();
        long j13 = T.f39321c;
        if (!T.d(jA2, j13)) {
            f02.b(j13);
        }
        if (!kotlin.jvm.internal.L.f(f02.d(), shaderB)) {
            f02.e(shaderB);
        }
        if (f02.getAlpha() == f12) {
            return;
        }
        f02.setAlpha(f12);
    }

    @Y61.k
    public abstract Shader b(long j12);
}
