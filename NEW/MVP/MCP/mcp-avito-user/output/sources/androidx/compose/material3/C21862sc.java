package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21862sc extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f37274l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f37275m;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.sc$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37276a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37276a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21862sc(long j12, androidx.compose.foundation.layout.T1 t12) {
        super(1);
        this.f37274l = j12;
        this.f37275m = t12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        long j12 = this.f37274l;
        float fE2 = l0.n.e(j12);
        if (fE2 > 0.0f) {
            float fM02 = dVar2.M0(C21565fc.f36340a);
            float fM03 = dVar2.M0(this.f37275m.c(dVar2.getLayoutDirection())) - fM02;
            float f12 = 2;
            float fE3 = (fM02 * f12) + fE2 + fM03;
            LayoutDirection layoutDirection = dVar2.getLayoutDirection();
            int[] iArr = a.f37276a;
            float fE4 = iArr[layoutDirection.ordinal()] == 1 ? l0.n.e(dVar2.i()) - fE3 : kotlin.ranges.s.a(fM03, 0.0f);
            if (iArr[dVar2.getLayoutDirection().ordinal()] == 1) {
                fE3 = l0.n.e(dVar2.i()) - kotlin.ranges.s.a(fM03, 0.0f);
            }
            float fC2 = l0.n.c(j12);
            float f13 = (-fC2) / f12;
            float f14 = fC2 / f12;
            androidx.compose.ui.graphics.S.f39317b.getClass();
            a.b f39478c = dVar2.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            f39478c.f39485a.b(fE4, f13, fE3, f14, 0);
            dVar2.y1();
            f39478c.a().i();
            f39478c.j(jE2);
        } else {
            dVar2.y1();
        }
        return kotlin.G0.f406611a;
    }
}
