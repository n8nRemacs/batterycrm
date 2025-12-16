package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/k;", "T", "Lkotlin/sequences/m;", "Lkotlin/collections/H0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43028k<T> implements InterfaceC43030m<H0<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410523a;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/sequences/k$a", "", "Lkotlin/collections/H0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.k$a */
    public static final class a implements Iterator<H0<? extends T>>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410524b;

        /* renamed from: c, reason: collision with root package name */
        public int f410525c;

        public a(C43028k<T> c43028k) {
            this.f410524b = c43028k.f410523a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410524b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i12 = this.f410525c;
            this.f410525c = i12 + 1;
            if (i12 >= 0) {
                return new H0(i12, this.f410524b.next());
            }
            C42745f0.H0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43028k(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m) {
        this.f410523a = interfaceC43030m;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<H0<T>> iterator() {
        return new a(this);
    }
}
