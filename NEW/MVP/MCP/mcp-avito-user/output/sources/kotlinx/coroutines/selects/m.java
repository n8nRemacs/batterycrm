package kotlinx.coroutines.selects;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/selects/m;", "P", "Q", "Lkotlinx/coroutines/selects/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m<P, Q> implements l<P, Q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f412210a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> f412211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> f412212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> f412213d;

    public m() {
        throw null;
    }

    public m(Object obj, Y41.q qVar, Y41.q qVar2, Y41.q qVar3, int i12, C42822w c42822w) {
        qVar3 = (i12 & 8) != 0 ? null : qVar3;
        this.f412210a = obj;
        this.f412211b = qVar;
        this.f412212c = qVar2;
        this.f412213d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> b() {
        return this.f412211b;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> d() {
        return this.f412212c;
    }
}
