package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.types.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes8.dex */
public abstract class c<T> implements Iterable<T>, Z41.a {
    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public abstract void a(int i12, @Y61.k l0 l0Var);

    @Y61.l
    public abstract T get(int i12);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public c() {
    }
}
