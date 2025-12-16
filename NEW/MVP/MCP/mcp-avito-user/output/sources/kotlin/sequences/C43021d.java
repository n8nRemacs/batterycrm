package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/d;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43021d<T> implements InterfaceC43030m<T>, InterfaceC43022e<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410496b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/d$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.d$a */
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410497b;

        /* renamed from: c, reason: collision with root package name */
        public int f410498c;

        public a(C43021d<T> c43021d) {
            this.f410497b = c43021d.f410495a.iterator();
            this.f410498c = c43021d.f410496b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i12 = this.f410498c;
                it = this.f410497b;
                if (i12 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f410498c--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i12 = this.f410498c;
                it = this.f410497b;
                if (i12 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f410498c--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43021d(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, int i12) {
        this.f410495a = interfaceC43030m;
        this.f410496b = i12;
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.p("count must be non-negative, but was ", i12, '.').toString());
        }
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> a(int i12) {
        int i13 = this.f410496b;
        int i14 = i13 + i12;
        return i14 < 0 ? new l0(this, i12) : new k0(this.f410495a, i13, i14);
    }

    @Override // kotlin.sequences.InterfaceC43022e
    @Y61.k
    public final InterfaceC43030m<T> drop(int i12) {
        int i13 = this.f410496b + i12;
        return i13 < 0 ? new C43021d(this, i12) : new C43021d(this.f410495a, i13);
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
