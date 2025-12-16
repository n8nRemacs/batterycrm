package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes8.dex */
public abstract class a<K, V> implements Iterable<V>, Z41.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11699a<K, V, T extends V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f410272b;

        public AbstractC11699a(int i12) {
            this.f410272b = i12;
        }
    }

    @Y61.k
    public abstract c<V> b();

    @Y61.k
    public abstract n0.a d();

    public final boolean isEmpty() {
        return b().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
