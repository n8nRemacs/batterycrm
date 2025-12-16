package kotlinx.coroutines.selects;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/selects/h;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f412202a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> f412203b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> f412204c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> f412205d;

    public i() {
        throw null;
    }

    public i(Object obj, Y41.q qVar, Y41.q qVar2, int i12, C42822w c42822w) {
        qVar2 = (i12 & 4) != 0 ? null : qVar2;
        this.f412202a = obj;
        this.f412203b = qVar;
        this.f412204c = qVar2;
        this.f412205d = t.f412236a;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.l
    public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> a() {
        return this.f412204c;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, r<?>, Object, G0> b() {
        return this.f412203b;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final Object getF412202a() {
        return this.f412202a;
    }

    @Override // kotlinx.coroutines.selects.n
    @Y61.k
    public final Y41.q<Object, Object, Object, Object> d() {
        return this.f412205d;
    }
}
