package androidx.compose.material;

import androidx.compose.runtime.C22143q0;
import androidx.compose.ui.node.C22417j;
import kotlin.Metadata;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material/ripple/l;", "invoke", "()Landroidx/compose/material/ripple/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U2 extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.material.ripple.l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W2 f33241l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(W2 w22) {
        super(0);
        this.f33241l = w22;
    }

    @Override // Y41.a
    public final androidx.compose.material.ripple.l invoke() {
        androidx.compose.material.ripple.l lVar;
        C22143q0 c22143q0 = B7.f32388a;
        W2 w22 = this.f33241l;
        C21432z7 c21432z7 = (C21432z7) C22417j.a(w22, c22143q0);
        if (c21432z7 != null && (lVar = c21432z7.f34439b) != null) {
            return lVar;
        }
        A7 a72 = A7.f32352a;
        long j12 = ((androidx.compose.ui.graphics.T) C22417j.a(w22, A2.f32335a)).f39331a;
        boolean zG2 = ((C21308q2) C22417j.a(w22, C21320r2.f34024a)).g();
        a72.getClass();
        return zG2 ? ((double) androidx.compose.ui.graphics.V.i(j12)) > 0.5d ? B7.f32391d : B7.f32392e : B7.f32393f;
    }
}
