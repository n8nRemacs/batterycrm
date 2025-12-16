package androidx.compose.material;

import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U6 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f33253l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f33254m;

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33255a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f33255a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(long j12, androidx.compose.foundation.layout.T1 t12) {
        super(1);
        this.f33253l = j12;
        this.f33254m = t12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        long j12 = this.f33253l;
        float fE2 = l0.n.e(j12);
        if (fE2 > 0.0f) {
            float fM02 = dVar2.M0(V6.f33279a);
            float fM03 = dVar2.M0(this.f33254m.c(dVar2.getLayoutDirection())) - fM02;
            float f12 = 2;
            float fE3 = (fM02 * f12) + fE2 + fM03;
            LayoutDirection layoutDirection = dVar2.getLayoutDirection();
            int[] iArr = a.f33255a;
            float fE4 = iArr[layoutDirection.ordinal()] == 1 ? l0.n.e(dVar2.i()) - fE3 : kotlin.ranges.s.a(fM03, 0.0f);
            if (iArr[dVar2.getLayoutDirection().ordinal()] == 1) {
                fE3 = l0.n.e(dVar2.i()) - kotlin.ranges.s.a(fM03, 0.0f);
            }
            float f13 = fE3;
            float fC2 = l0.n.c(j12);
            float f14 = (-fC2) / f12;
            float f15 = fC2 / f12;
            androidx.compose.ui.graphics.S.f39317b.getClass();
            a.b f39478c = dVar2.getF39478c();
            long jE2 = f39478c.e();
            f39478c.a().k();
            try {
                f39478c.f39485a.b(fE4, f14, f13, f15, 0);
                dVar2.y1();
            } finally {
                androidx.compose.foundation.H.C(f39478c, jE2);
            }
        } else {
            dVar2.y1();
        }
        return kotlin.G0.f406611a;
    }
}
