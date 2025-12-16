package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.sequences.C43025h;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/n0;", "T", "R", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n0<T, R> implements InterfaceC43030m<R> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43025h f410552a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, T, R> f410553b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/n0$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<R>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410554b;

        /* renamed from: c, reason: collision with root package name */
        public int f410555c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n0<T, R> f410556d;

        public a(n0<T, R> n0Var) {
            this.f410556d = n0Var;
            this.f410554b = new C43025h.a(n0Var.f410552a);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410554b.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            Y41.p<Integer, T, R> pVar = this.f410556d.f410553b;
            int i12 = this.f410555c;
            this.f410555c = i12 + 1;
            if (i12 >= 0) {
                return (R) pVar.invoke(Integer.valueOf(i12), this.f410554b.next());
            }
            C42745f0.H0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n0(@Y61.k C43025h c43025h, @Y61.k Y41.p pVar) {
        this.f410552a = c43025h;
        this.f410553b = pVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
