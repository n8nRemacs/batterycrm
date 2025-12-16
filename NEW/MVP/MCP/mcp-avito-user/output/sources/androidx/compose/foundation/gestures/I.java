package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.L;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/I;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<L.a> f27267a = new androidx.compose.runtime.collection.e<>(new L.a[16], 0);

    public final void a(@Y61.l CancellationException cancellationException) {
        androidx.compose.runtime.collection.e<L.a> eVar = this.f27267a;
        int i12 = eVar.f38262d;
        InterfaceC43271q[] interfaceC43271qArr = new InterfaceC43271q[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            interfaceC43271qArr[i13] = eVar.f38260b[i13].f27324b;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            interfaceC43271qArr[i14].f(cancellationException);
        }
        if (eVar.f38262d == 0) {
            return;
        }
        androidx.compose.foundation.internal.e.c("uncancelled requests present");
    }

    public final void b() {
        androidx.compose.runtime.collection.e<L.a> eVar = this.f27267a;
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, eVar.f38262d);
        int i12 = lVarR.f406905b;
        int i13 = lVarR.f406906c;
        if (i12 <= i13) {
            while (true) {
                kotlinx.coroutines.r rVar = eVar.f38260b[i12].f27324b;
                kotlin.G0 g02 = kotlin.G0.f406611a;
                int i14 = kotlin.Z.f406624c;
                rVar.resumeWith(g02);
                if (i12 == i13) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        eVar.g();
    }
}
