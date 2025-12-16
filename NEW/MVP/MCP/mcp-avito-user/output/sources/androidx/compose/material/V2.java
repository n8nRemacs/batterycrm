package androidx.compose.material;

import androidx.compose.material.ripple.C21332c;
import androidx.compose.runtime.C22143q0;
import androidx.compose.ui.node.C22417j;
import kotlin.Metadata;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class V2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W2 f33269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(W2 w22) {
        super(0);
        this.f33269l = w22;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C22143q0 c22143q0 = B7.f32388a;
        W2 w22 = this.f33269l;
        if (((C21432z7) C22417j.a(w22, c22143q0)) == null) {
            C21332c c21332c = w22.f33298v;
            if (c21332c != null) {
                w22.l2(c21332c);
            }
            w22.f33298v = null;
        } else if (w22.f33298v == null) {
            T2 t22 = new T2(w22);
            U2 u22 = new U2(w22);
            androidx.compose.animation.core.G1<Float> g12 = androidx.compose.material.ripple.w.f34146a;
            C21332c c21332c2 = new C21332c(w22.f33294r, w22.f33295s, w22.f33296t, t22, u22, null);
            w22.k2(c21332c2);
            w22.f33298v = c21332c2;
        }
        return kotlin.G0.f406611a;
    }
}
