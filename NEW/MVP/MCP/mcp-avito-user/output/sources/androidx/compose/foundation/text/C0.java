package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CoreTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C0 extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30182l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.Y f30183m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30184n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22655v f30185o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C20985q1 c20985q1, androidx.compose.ui.text.input.Y y12, androidx.compose.ui.text.input.W w12, C22655v c22655v) {
        super(1);
        this.f30182l = c20985q1;
        this.f30183m = y12;
        this.f30184n = w12;
        this.f30185o = c22655v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.text.input.i0, java.lang.Object] */
    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        C20985q1 c20985q1 = this.f30182l;
        if (c20985q1.b()) {
            C20862e2.a aVar = C20862e2.f30700a;
            Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
            Y41.l<C22654u, kotlin.G0> lVar2 = c20985q1.f31800w;
            aVar.getClass();
            l0.h hVar = new l0.h();
            C20854c2 c20854c2 = new C20854c2(c20985q1.f31781d, lVar, hVar);
            androidx.compose.ui.text.input.Y y12 = this.f30183m;
            androidx.compose.ui.text.input.P p12 = y12.f42388a;
            p12.c(this.f30184n, this.f30185o, c20854c2, lVar2);
            ?? i0Var = new androidx.compose.ui.text.input.i0(y12, p12);
            y12.f42389b.set(i0Var);
            hVar.f406842b = i0Var;
            c20985q1.f31782e = i0Var;
        }
        return new B0();
    }
}
