package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/m0;", "T", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m0<T> implements InterfaceC43030m<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f410543b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/m0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410544b;

        /* renamed from: c, reason: collision with root package name */
        public int f410545c = -1;

        /* renamed from: d, reason: collision with root package name */
        public T f410546d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m0<T> f410547e;

        public a(m0<T> m0Var) {
            this.f410547e = m0Var;
            this.f410544b = m0Var.f410542a.iterator();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
        public final void a() {
            Iterator<T> it = this.f410544b;
            if (it.hasNext()) {
                T next = it.next();
                if (((Boolean) this.f410547e.f410543b.invoke(next)).booleanValue()) {
                    this.f410545c = 1;
                    this.f410546d = next;
                    return;
                }
            }
            this.f410545c = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f410545c == -1) {
                a();
            }
            return this.f410545c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f410545c == -1) {
                a();
            }
            if (this.f410545c == 0) {
                throw new NoSuchElementException();
            }
            T t12 = this.f410546d;
            this.f410546d = null;
            this.f410545c = -1;
            return t12;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, @Y61.k Y41.l<? super T, Boolean> lVar) {
        this.f410542a = interfaceC43030m;
        this.f410543b = (kotlin.jvm.internal.N) lVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
