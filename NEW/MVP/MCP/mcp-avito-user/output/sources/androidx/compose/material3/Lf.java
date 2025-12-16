package androidx.compose.material3;

import androidx.compose.material3.Vf;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Lf extends kotlin.jvm.internal.N implements Y41.l<Float, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f35071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21589gd f35072m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lf(kotlin.ranges.f<Float> fVar, C21589gd c21589gd) {
        super(1);
        this.f35071l = fVar;
        this.f35072m = c21589gd;
    }

    @Override // Y41.l
    public final Boolean invoke(Float f12) {
        int iE2;
        boolean z12 = true;
        float fFloatValue = f12.floatValue();
        kotlin.ranges.f<Float> fVar = this.f35071l;
        float f13 = kotlin.ranges.s.f(fFloatValue, fVar.d().floatValue(), fVar.g().floatValue());
        C21589gd c21589gd = this.f35072m;
        if (c21589gd.e() > 0 && (iE2 = c21589gd.e() + 1) >= 0) {
            float fAbs = f13;
            float f14 = fAbs;
            int i12 = 0;
            while (true) {
                float fB2 = E0.e.b(fVar.d().floatValue(), fVar.g().floatValue(), i12 / (c21589gd.e() + 1));
                float f15 = fB2 - f13;
                if (Math.abs(f15) <= fAbs) {
                    fAbs = Math.abs(f15);
                    f14 = fB2;
                }
                if (i12 == iE2) {
                    break;
                }
                i12++;
            }
            f13 = f14;
        }
        if (f13 == c21589gd.a()) {
            z12 = false;
        } else {
            long jE2 = Tf.e(c21589gd.b(), f13);
            long jE3 = Tf.e(c21589gd.b(), c21589gd.a());
            Vf.a aVar = Vf.f35682b;
            if (jE2 != jE3) {
                c21589gd.j(Vf.b(jE2));
                c21589gd.i(Vf.a(jE2));
            }
            Y41.a<kotlin.G0> aVar2 = c21589gd.f36429b;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return Boolean.valueOf(z12);
    }
}
