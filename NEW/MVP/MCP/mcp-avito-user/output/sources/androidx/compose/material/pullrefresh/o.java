package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;

/* compiled from: PullRefresh.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class o extends C42801a implements Y41.p<Float, Continuation<? super Float>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(Float f12, Continuation<? super Float> continuation) {
        float fFloatValue = f12.floatValue();
        t tVar = (t) this.receiver;
        float f13 = 0.0f;
        if (!tVar.b()) {
            if (((Number) tVar.f33970c.getF42167b()).floatValue() > tVar.a()) {
                ((Y41.a) tVar.f33969b.getF42167b()).invoke();
            }
            C43259k.d(tVar.f33968a, null, null, new s(tVar, 0.0f, null), 3);
            InterfaceC22192v1 interfaceC22192v1 = tVar.f33973f;
            if (((C22040c3) interfaceC22192v1).f() == 0.0f || fFloatValue < 0.0f) {
                fFloatValue = 0.0f;
            }
            ((C22040c3) interfaceC22192v1).S6(0.0f);
            f13 = fFloatValue;
        }
        return Boxing.boxFloat(f13);
    }
}
