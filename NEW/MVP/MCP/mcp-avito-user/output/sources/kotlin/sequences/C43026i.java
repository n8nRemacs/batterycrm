package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/sequences/i;", "T", "R", "E", "Lkotlin/sequences/m;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43026i<T, R, E> implements InterfaceC43030m<E> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<T> f410511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T, R> f410512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f410513c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/i$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.i$a */
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/i$b", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.i$b */
    public static final class b implements Iterator<E>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f410514b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<? extends E> f410515c;

        /* renamed from: d, reason: collision with root package name */
        public int f410516d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C43026i<T, R, E> f410517e;

        public b(C43026i<T, R, E> c43026i) {
            this.f410517e = c43026i;
            this.f410514b = c43026i.f410511a.iterator();
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, java.lang.Object] */
        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.f410515c;
            if (it2 != null && it2.hasNext()) {
                this.f410516d = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.f410514b;
                if (!it3.hasNext()) {
                    this.f410516d = 2;
                    this.f410515c = null;
                    return false;
                }
                T next = it3.next();
                C43026i<T, R, E> c43026i = this.f410517e;
                it = (Iterator) c43026i.f410513c.invoke(c43026i.f410512b.invoke(next));
            } while (!it.hasNext());
            this.f410515c = it;
            this.f410516d = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i12 = this.f410516d;
            if (i12 == 1) {
                return true;
            }
            if (i12 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i12 = this.f410516d;
            if (i12 == 2) {
                throw new NoSuchElementException();
            }
            if (i12 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f410516d = 0;
            return this.f410515c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43026i(@Y61.k InterfaceC43030m<? extends T> interfaceC43030m, @Y61.k Y41.l<? super T, ? extends R> lVar, @Y61.k Y41.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        this.f410511a = interfaceC43030m;
        this.f410512b = lVar;
        this.f410513c = lVar2;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<E> iterator() {
        return new b(this);
    }
}
