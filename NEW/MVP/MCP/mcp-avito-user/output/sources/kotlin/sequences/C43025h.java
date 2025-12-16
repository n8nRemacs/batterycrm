package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/h;", "T", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43025h<T> implements InterfaceC43030m<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410505b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, Boolean> f410506c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/h$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.h$a */
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410507b;

        /* renamed from: c, reason: collision with root package name */
        public int f410508c = -1;

        /* renamed from: d, reason: collision with root package name */
        public T f410509d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C43025h<T> f410510e;

        public a(C43025h<T> c43025h) {
            this.f410510e = c43025h;
            this.f410507b = c43025h.f410504a.iterator();
        }

        public final void a() {
            T next;
            C43025h<T> c43025h;
            do {
                Iterator<T> it = this.f410507b;
                if (!it.hasNext()) {
                    this.f410508c = 0;
                    return;
                } else {
                    next = it.next();
                    c43025h = this.f410510e;
                }
            } while (c43025h.f410506c.invoke(next).booleanValue() != c43025h.f410505b);
            this.f410509d = next;
            this.f410508c = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f410508c == -1) {
                a();
            }
            return this.f410508c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f410508c == -1) {
                a();
            }
            if (this.f410508c == 0) {
                throw new NoSuchElementException();
            }
            T t12 = this.f410509d;
            this.f410509d = null;
            this.f410508c = -1;
            return t12;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43025h(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, boolean z12, @Y61.k Y41.l<? super T, Boolean> lVar) {
        this.f410504a = interfaceC43030m;
        this.f410505b = z12;
        this.f410506c = lVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ C43025h(InterfaceC43030m interfaceC43030m, boolean z12, Y41.l lVar, int i12, C42822w c42822w) {
        this(interfaceC43030m, (i12 & 2) != 0 ? true : z12, lVar);
    }
}
