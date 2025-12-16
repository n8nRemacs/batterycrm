package androidx.compose.material;

import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.C22417j;
import kotlin.Metadata;

/* compiled from: Ripple.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/T;", "invoke-0d7_KjU", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class T2 implements InterfaceC22242a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W2 f33206a;

    public T2(W2 w22) {
        this.f33206a = w22;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22242a0
    public final long a() {
        W2 w22 = this.f33206a;
        long jA2 = w22.f33297u.a();
        if (jA2 != 16) {
            return jA2;
        }
        C21432z7 c21432z7 = (C21432z7) C22417j.a(w22, B7.f32388a);
        if (c21432z7 != null) {
            long j12 = c21432z7.f34438a;
            if (j12 != 16) {
                return j12;
            }
        }
        A7 a72 = A7.f32352a;
        long j13 = ((androidx.compose.ui.graphics.T) C22417j.a(w22, A2.f32335a)).f39331a;
        boolean zG2 = ((C21308q2) C22417j.a(w22, C21320r2.f34024a)).g();
        a72.getClass();
        float fI2 = androidx.compose.ui.graphics.V.i(j13);
        if (zG2 || fI2 >= 0.5d) {
            return j13;
        }
        androidx.compose.ui.graphics.T.f39320b.getClass();
        return androidx.compose.ui.graphics.T.f39323e;
    }
}
