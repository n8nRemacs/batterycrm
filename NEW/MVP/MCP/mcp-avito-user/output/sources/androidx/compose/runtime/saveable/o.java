package androidx.compose.runtime.saveable;

import androidx.collection.R0;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SaveableStateHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class o extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f38594l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f38595m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f38596n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, Object obj, r rVar) {
        super(1);
        this.f38594l = mVar;
        this.f38595m = obj;
        this.f38596n = rVar;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        m mVar = this.f38594l;
        R0<Object, r> r02 = mVar.f38585b;
        Object obj = this.f38595m;
        if (r02.b(obj)) {
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
        mVar.f38584a.remove(obj);
        R0<Object, r> r03 = mVar.f38585b;
        r rVar = this.f38596n;
        r03.m(obj, rVar);
        return new n(mVar, obj, rVar);
    }
}
