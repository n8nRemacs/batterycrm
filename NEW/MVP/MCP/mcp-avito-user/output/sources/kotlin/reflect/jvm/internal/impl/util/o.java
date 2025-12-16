package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.types.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes8.dex */
public final class o<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l0 f410298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410299c;

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator<T>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f410300b = true;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o<T> f410301c;

        public a(o<T> oVar) {
            this.f410301c = oVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f410300b;
        }

        @Override // java.util.Iterator
        @Y61.k
        public final T next() {
            if (!this.f410300b) {
                throw new NoSuchElementException();
            }
            this.f410300b = false;
            return (T) this.f410301c.f410298b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(int i12, @Y61.k l0 l0Var) {
        super(null);
        this.f410298b = l0Var;
        this.f410299c = i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final void a(int i12, @Y61.k l0 l0Var) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @Y61.l
    public final T get(int i12) {
        if (i12 == this.f410299c) {
            return (T) this.f410298b;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final int getSize() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
