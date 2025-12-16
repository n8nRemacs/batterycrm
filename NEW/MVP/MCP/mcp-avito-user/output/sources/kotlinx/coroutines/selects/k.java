package kotlinx.coroutines.selects;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/selects/k;", "Q", "Lkotlinx/coroutines/selects/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k<Q> implements j<Q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f412206a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> f412207b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> f412208c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> f412209d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k Object obj, @Y61.k Y41.q<Object, ? super r<?>, Object, G0> qVar, @Y61.k Y41.q<Object, Object, Object, ? extends Object> qVar2, @Y61.l Y41.q<? super r<?>, Object, Object, ? extends Y41.l<? super Throwable, G0>> qVar3) {
        this.f412206a = obj;
        this.f412207b = qVar;
        this.f412208c = qVar2;
        this.f412209d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.l
    public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> a() {
        return this.f412209d;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> b() {
        return this.f412207b;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final Object getF412206a() {
        return this.f412206a;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> d() {
        return this.f412208c;
    }

    public /* synthetic */ k(Object obj, Y41.q qVar, Y41.q qVar2, Y41.q qVar3, int i12, C42822w c42822w) {
        this(obj, qVar, qVar2, (i12 & 8) != 0 ? null : qVar3);
    }
}
