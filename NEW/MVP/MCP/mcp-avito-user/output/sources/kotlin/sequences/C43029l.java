package kotlin.sequences;

import androidx.core.view.C22829k0;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/sequences/l;", "T1", "T2", "V", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43029l<T1, T2, V> implements InterfaceC43030m<V> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22829k0 f410532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T2> f410533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<T1, T2, V> f410534c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/l$a", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.l$a */
    public static final class a implements Iterator<V>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T1> f410535b;

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<T2> f410536c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C43029l<T1, T2, V> f410537d;

        public a(C43029l<T1, T2, V> c43029l) {
            this.f410537d = c43029l;
            this.f410535b = (Iterator<T1>) c43029l.f410532a.iterator();
            this.f410536c = c43029l.f410533b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410535b.hasNext() && this.f410536c.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return (V) this.f410537d.f410534c.invoke(this.f410535b.next(), this.f410536c.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C43029l(@Y61.k C22829k0 c22829k0, @Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.p pVar) {
        this.f410532a = c22829k0;
        this.f410533b = interfaceC43030m;
        this.f410534c = pVar;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<V> iterator() {
        return new a(this);
    }
}
