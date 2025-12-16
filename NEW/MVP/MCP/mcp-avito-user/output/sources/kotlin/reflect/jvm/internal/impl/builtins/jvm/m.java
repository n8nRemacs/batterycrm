package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.H;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes8.dex */
final class m extends N implements Y41.a<Y> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f407291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f f407292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, kotlin.reflect.jvm.internal.impl.storage.f fVar) {
        super(0);
        this.f407291l = lVar;
        this.f407292m = fVar;
    }

    @Override // Y41.a
    public final Y invoke() {
        kotlin.reflect.n<Object>[] nVarArr = l.f407274i;
        l lVar = this.f407291l;
        G g12 = lVar.g().f407233a;
        e.f407257d.getClass();
        return C42904w.c(g12, e.f407261h, new H(this.f407292m, lVar.g().f407233a)).q();
    }
}
