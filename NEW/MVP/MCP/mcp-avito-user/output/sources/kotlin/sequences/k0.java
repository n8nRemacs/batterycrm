package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/k0;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k0<T> implements InterfaceC43030m<T>, InterfaceC43022e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410528c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/k0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410529b;

        /* renamed from: c, reason: collision with root package name */
        public int f410530c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0<T> f410531d;

        public a(k0<T> k0Var) {
            this.f410531d = k0Var;
            this.f410529b = k0Var.f410526a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            k0<T> k0Var;
            Iterator<T> it;
            while (true) {
                int i12 = this.f410530c;
                k0Var = this.f410531d;
                it = this.f410529b;
                if (i12 >= k0Var.f410527b || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f410530c++;
            }
            return this.f410530c < k0Var.f410528c && it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            k0<T> k0Var;
            Iterator<T> it;
            while (true) {
                int i12 = this.f410530c;
                k0Var = this.f410531d;
                it = this.f410529b;
                if (i12 >= k0Var.f410527b || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f410530c++;
            }
            int i13 = this.f410530c;
            if (i13 >= k0Var.f410528c) {
                throw new NoSuchElementException();
            }
            this.f410530c = i13 + 1;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, int i12, int i13) {
        this.f410526a = interfaceC43030m;
        this.f410527b = i12;
        this.f410528c = i13;
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "startIndex should be non-negative, but is ").toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i13, "endIndex should be non-negative, but is ").toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i13, i12, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> a(int i12) {
        int i13 = this.f410528c;
        int i14 = this.f410527b;
        if (i12 >= i13 - i14) {
            return this;
        }
        return new k0(this.f410526a, i14, i12 + i14);
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> drop(int i12) {
        int i13 = this.f410528c;
        int i14 = this.f410527b;
        if (i12 >= i13 - i14) {
            return C43024g.f410502a;
        }
        return new k0(this.f410526a, i14 + i12, i13);
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
