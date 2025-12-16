package androidx.compose.foundation.lazy.layout;

import androidx.collection.S0;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: LazySaveableStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class w0 extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0 f29550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f29551m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(s0 s0Var, Object obj) {
        super(1);
        this.f29550l = s0Var;
        this.f29551m = obj;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        s0 s0Var = this.f29550l;
        S0<Object> s02 = s0Var.f29539c;
        Object obj = this.f29551m;
        s02.k(obj);
        return new v0(s0Var, obj);
    }
}
