package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Predicate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/g;", "T", "E", "Lkotlinx/datetime/internal/format/w;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g<T, E> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    public final E f412522a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v f412523b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, @Y61.k v vVar) {
        this.f412522a = obj;
        this.f412523b = vVar;
    }

    @Override // kotlinx.datetime.internal.format.w
    public final boolean test(T t12) {
        return L.f(this.f412523b.invoke(t12), this.f412522a);
    }
}
