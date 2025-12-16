package androidx.compose.foundation.pager;

import androidx.compose.ui.semantics.C22553a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f29811l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f29812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f29813n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(boolean z12, m0 m0Var, kotlinx.coroutines.T t12) {
        super(1);
        this.f29811l = z12;
        this.f29812m = m0Var;
        this.f29813n = t12;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.F f13 = f12;
        m0 m0Var = this.f29812m;
        boolean z12 = this.f29811l;
        kotlinx.coroutines.T t12 = this.f29813n;
        if (z12) {
            C c12 = new C(m0Var, t12);
            kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f13.a(androidx.compose.ui.semantics.k.f41784y, new C22553a(null, c12));
            f13.a(androidx.compose.ui.semantics.k.f41757A, new C22553a(null, new D(m0Var, t12)));
        } else {
            E e12 = new E(m0Var, t12);
            kotlin.reflect.n<Object>[] nVarArr2 = androidx.compose.ui.semantics.C.f41719a;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f13.a(androidx.compose.ui.semantics.k.f41785z, new C22553a(null, e12));
            f13.a(androidx.compose.ui.semantics.k.f41758B, new C22553a(null, new F(m0Var, t12)));
        }
        return G0.f406611a;
    }
}
