package org.mockito.internal.util.concurrent;

import java.util.Iterator;
import java.util.Map;
import org.mockito.internal.util.concurrent.c;

/* loaded from: classes7.dex */
public class WeakConcurrentSet<V> implements Runnable, Iterable<V> {

    /* renamed from: b, reason: collision with root package name */
    public final c<V, Boolean> f421739b = new c.f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Cleaner {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Cleaner[] f421740b = {new Cleaner("THREAD", 0), new Cleaner("INLINE", 1), new Cleaner("MANUAL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Cleaner EF5;

        public Cleaner() {
            throw null;
        }

        public static Cleaner valueOf(String str) {
            return (Cleaner) Enum.valueOf(Cleaner.class, str);
        }

        public static Cleaner[] values() {
            return (Cleaner[]) f421740b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421741a;

        static {
            int[] iArr = new int[Cleaner.values().length];
            f421741a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421741a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421741a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b<V> implements Iterator<V> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<V, Boolean>> f421742b;

        public b() {
            throw null;
        }

        public b(Iterator it, a aVar) {
            this.f421742b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f421742b.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f421742b.next().getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f421742b.remove();
        }
    }

    public final boolean a(Class cls) {
        return this.f421739b.e(Boolean.TRUE, cls) == null;
    }

    public final boolean b(Class cls) {
        return this.f421739b.g(cls) != null;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return new b(this.f421739b.iterator(), null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f421739b.run();
    }
}
