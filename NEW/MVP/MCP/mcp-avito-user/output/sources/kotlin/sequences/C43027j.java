package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/j;", "", "T", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43027j<T> implements InterfaceC43030m<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f410518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, T> f410519b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/j$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.j$a */
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public T f410520b;

        /* renamed from: c, reason: collision with root package name */
        public int f410521c = -2;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C43027j<T> f410522d;

        public a(C43027j<T> c43027j) {
            this.f410522d = c43027j;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [Y41.a, kotlin.jvm.internal.N] */
        public final void a() {
            int i12 = this.f410521c;
            C43027j<T> c43027j = this.f410522d;
            T tInvoke = i12 == -2 ? (T) c43027j.f410518a.invoke() : c43027j.f410519b.invoke(this.f410520b);
            this.f410520b = tInvoke;
            this.f410521c = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f410521c < 0) {
                a();
            }
            return this.f410521c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f410521c < 0) {
                a();
            }
            if (this.f410521c == 0) {
                throw new NoSuchElementException();
            }
            T t12 = this.f410520b;
            this.f410521c = -1;
            return t12;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43027j(@Y61.k Y41.a<? extends T> aVar, @Y61.k Y41.l<? super T, ? extends T> lVar) {
        this.f410518a = (kotlin.jvm.internal.N) aVar;
        this.f410519b = lVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
