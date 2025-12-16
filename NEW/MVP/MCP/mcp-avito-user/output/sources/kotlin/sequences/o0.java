package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/o0;", "T", "R", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o0<T, R> implements InterfaceC43030m<R> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, R> f410558b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/o0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<R>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410559b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0<T, R> f410560c;

        public a(o0<T, R> o0Var) {
            this.f410560c = o0Var;
            this.f410559b = o0Var.f410557a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410559b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f410560c.f410558b.invoke(this.f410559b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, @Y61.k Y41.l<? super T, ? extends R> lVar) {
        this.f410557a = interfaceC43030m;
        this.f410558b = lVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
