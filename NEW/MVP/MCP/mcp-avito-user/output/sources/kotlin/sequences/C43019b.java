package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42736b;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/b;", "T", "K", "Lkotlin/collections/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43019b<T, K> extends AbstractC42736b<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Iterator<T> f410490d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, K> f410491e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final HashSet<K> f410492f = new HashSet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C43019b(@Y61.k Iterator<? extends T> it, @Y61.k Y41.l<? super T, ? extends K> lVar) {
        this.f410490d = it;
        this.f410491e = lVar;
    }

    @Override // kotlin.collections.AbstractC42736b
    public final void a() {
        T next;
        do {
            Iterator<T> it = this.f410490d;
            if (!it.hasNext()) {
                this.f406664b = 2;
                return;
            } else {
                next = it.next();
                ((H) this.f410491e).getClass();
            }
        } while (!this.f410492f.add(next));
        this.f406665c = next;
        this.f406664b = 1;
    }
}
