package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;

/* compiled from: Scrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class P1 extends C42801a implements Y41.p<androidx.compose.ui.unit.B, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
    public final Object a(long j12) {
        O1 o12 = (O1) this.receiver;
        C43259k.d(o12.f27392B.d(), null, null, new Q1(o12, j12, null), 3);
        return kotlin.G0.f406611a;
    }

    @Override // Y41.p
    public final /* synthetic */ Object invoke(androidx.compose.ui.unit.B b12, Continuation<? super kotlin.G0> continuation) {
        return a(b12.f42837a);
    }
}
