package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PullRefresh.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class n extends H implements Y41.l<Float, Float> {
    @Override // Y41.l
    public final Float invoke(Float f12) {
        float fA2;
        float fFloatValue = f12.floatValue();
        t tVar = (t) this.receiver;
        if (!tVar.b()) {
            InterfaceC22192v1 interfaceC22192v1 = tVar.f33973f;
            C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
            float fA3 = kotlin.ranges.s.a(c22040c3.f() + fFloatValue, 0.0f);
            float f13 = fA3 - c22040c3.f();
            ((C22040c3) interfaceC22192v1).S6(fA3);
            I3 i32 = tVar.f33970c;
            if (((Number) i32.getF42167b()).floatValue() <= tVar.a()) {
                fA2 = ((Number) i32.getF42167b()).floatValue();
            } else {
                float fAbs = Math.abs(((Number) i32.getF42167b()).floatValue() / tVar.a()) - 1.0f;
                f = fAbs >= 0.0f ? fAbs : 0.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                fA2 = (tVar.a() * (f - (((float) Math.pow(f, 2)) / 4))) + tVar.a();
            }
            ((C22040c3) tVar.f33972e).S6(fA2);
            f = f13;
        }
        return Float.valueOf(f);
    }
}
