package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/collections/I0;", "T", "", "Lkotlin/collections/H0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class I0<T> implements Iterable<H0<? extends T>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f406645b;

    /* JADX WARN: Multi-variable type inference failed */
    public I0(@Y61.k Y41.a<? extends Iterator<? extends T>> aVar) {
        this.f406645b = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<H0<T>> iterator() {
        return new J0((Iterator) this.f406645b.invoke());
    }
}
