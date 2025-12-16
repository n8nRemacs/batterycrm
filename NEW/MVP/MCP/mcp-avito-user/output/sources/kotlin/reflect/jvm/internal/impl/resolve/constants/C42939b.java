package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42939b extends g<List<? extends g<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f409583b;

    /* JADX WARN: Multi-variable type inference failed */
    public C42939b(@Y61.k Y41.l lVar, @Y61.k List list) {
        super(list);
        this.f409583b = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final O a(@Y61.k E e12) {
        O o12 = (O) this.f409583b.invoke(e12);
        if (!kotlin.reflect.jvm.internal.impl.builtins.k.x(o12) && !kotlin.reflect.jvm.internal.impl.builtins.k.E(o12) && !kotlin.reflect.jvm.internal.impl.builtins.k.A(o12, n.a.f407367W.i()) && !kotlin.reflect.jvm.internal.impl.builtins.k.A(o12, n.a.f407368X.i()) && !kotlin.reflect.jvm.internal.impl.builtins.k.A(o12, n.a.f407369Y.i())) {
            kotlin.reflect.jvm.internal.impl.builtins.k.A(o12, n.a.f407370Z.i());
        }
        return o12;
    }
}
