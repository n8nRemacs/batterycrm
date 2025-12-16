package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/l0;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l0<T> implements InterfaceC43030m<T>, InterfaceC43022e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410539b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/l0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public int f410540b;

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<T> f410541c;

        public a(l0<T> l0Var) {
            this.f410540b = l0Var.f410539b;
            this.f410541c = l0Var.f410538a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410540b > 0 && this.f410541c.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            int i12 = this.f410540b;
            if (i12 == 0) {
                throw new NoSuchElementException();
            }
            this.f410540b = i12 - 1;
            return this.f410541c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, int i12) {
        this.f410538a = interfaceC43030m;
        this.f410539b = i12;
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.p("count must be non-negative, but was ", i12, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> a(int i12) {
        return i12 >= this.f410539b ? this : new l0(this.f410538a, i12);
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> drop(int i12) {
        int i13 = this.f410539b;
        return i12 >= i13 ? C43024g.f410502a : new k0(this.f410538a, i12, i13);
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
