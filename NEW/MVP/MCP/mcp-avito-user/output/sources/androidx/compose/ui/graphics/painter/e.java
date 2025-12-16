package androidx.compose.ui.graphics.painter;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.j;
import l0.n;

/* compiled from: Painter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/painter/e;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C22273n f39739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39740c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public U f39741d;

    /* renamed from: e, reason: collision with root package name */
    public float f39742e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    @k
    public LayoutDirection f39743f = LayoutDirection.f42838b;

    /* compiled from: Painter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<g, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(g gVar) {
            e.this.i(gVar);
            return G0.f406611a;
        }
    }

    public e() {
        new a();
    }

    public boolean a(float f12) {
        return false;
    }

    public boolean d(@l U u12) {
        return false;
    }

    public final void g(@k g gVar, long j12, float f12, @l U u12) {
        if (this.f39742e != f12) {
            if (!a(f12)) {
                if (f12 == 1.0f) {
                    C22273n c22273n = this.f39739b;
                    if (c22273n != null) {
                        c22273n.setAlpha(f12);
                    }
                    this.f39740c = false;
                } else {
                    C22273n c22273n2 = this.f39739b;
                    if (c22273n2 == null) {
                        c22273n2 = new C22273n();
                        this.f39739b = c22273n2;
                    }
                    c22273n2.setAlpha(f12);
                    this.f39740c = true;
                }
            }
            this.f39742e = f12;
        }
        if (!L.f(this.f39741d, u12)) {
            if (!d(u12)) {
                if (u12 == null) {
                    C22273n c22273n3 = this.f39739b;
                    if (c22273n3 != null) {
                        c22273n3.j(null);
                    }
                    this.f39740c = false;
                } else {
                    C22273n c22273n4 = this.f39739b;
                    if (c22273n4 == null) {
                        c22273n4 = new C22273n();
                        this.f39739b = c22273n4;
                    }
                    c22273n4.j(u12);
                    this.f39740c = true;
                }
            }
            this.f39741d = u12;
        }
        LayoutDirection layoutDirection = gVar.getLayoutDirection();
        if (this.f39743f != layoutDirection) {
            f(layoutDirection);
            this.f39743f = layoutDirection;
        }
        int i12 = (int) (j12 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.i() >> 32)) - Float.intBitsToFloat(i12);
        int i13 = (int) (j12 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gVar.i() & 4294967295L)) - Float.intBitsToFloat(i13);
        gVar.getF39478c().f39485a.c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f12 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i12) > 0.0f && Float.intBitsToFloat(i13) > 0.0f) {
                    if (this.f39740c) {
                        l0.g.f413384b.getClass();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
                        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
                        n.a aVar = n.f413402b;
                        j jVarA = l0.k.a(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (jFloatToRawIntBits << 32));
                        M mA2 = gVar.getF39478c().a();
                        C22273n c22273n5 = this.f39739b;
                        if (c22273n5 == null) {
                            c22273n5 = new C22273n();
                            this.f39739b = c22273n5;
                        }
                        try {
                            mA2.e(jVarA, c22273n5);
                            i(gVar);
                            mA2.i();
                        } catch (Throwable th2) {
                            mA2.i();
                            throw th2;
                        }
                    } else {
                        i(gVar);
                    }
                }
            } catch (Throwable th3) {
                gVar.getF39478c().f39485a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        gVar.getF39478c().f39485a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(@k g gVar);

    public void f(@k LayoutDirection layoutDirection) {
    }
}
