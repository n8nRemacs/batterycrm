package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.types.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes8.dex */
public final class i extends c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final i f410289b = new i();

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator, Z41.a {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i() {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final void a(int i12, l0 l0Var) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final int getSize() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @Y61.k
    public final Iterator iterator() {
        return new a();
    }
}
