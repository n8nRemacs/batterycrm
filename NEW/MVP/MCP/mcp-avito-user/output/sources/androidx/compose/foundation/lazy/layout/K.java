package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.ui.layout.Y0;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20714d0 f29303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f29304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y0 f29305n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ K0 f29306o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C20714d0 c20714d0, B b12, Y0 y02, K0 k02) {
        super(1);
        this.f29303l = c20714d0;
        this.f29304m = b12;
        this.f29305n = y02;
        this.f29306o = k02;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        G0 g02 = new G0(this.f29304m, this.f29305n, this.f29306o);
        C20714d0 c20714d0 = this.f29303l;
        c20714d0.f29405d = g02;
        return new J(c20714d0);
    }
}
