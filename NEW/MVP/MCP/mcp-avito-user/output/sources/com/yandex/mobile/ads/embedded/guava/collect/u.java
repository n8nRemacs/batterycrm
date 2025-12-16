package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;
import com.yandex.mobile.ads.impl.iu0;
import com.yandex.mobile.ads.impl.ju0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class u {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Iterator<Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f382810a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ a[] f382811b;

        static {
            a aVar = new a();
            f382810a = aVar;
            f382811b = new a[]{aVar};
        }

        private a() {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f382811b.clone();
        }

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
            iu0.a("no calls to next() since the last call to remove()", false);
        }
    }

    @InterfaceC19845a
    public static boolean a(Collection collection, Iterator it) {
        boolean z12 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    @InterfaceC19845a
    public static void a(ArrayList arrayList, Iterator it) {
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return;
            } else {
                arrayList.add(bVar.next());
            }
        }
    }

    @InterfaceC19845a
    public static <T> boolean a(Iterator<T> it, ju0<? super T> ju0Var) {
        ju0Var.getClass();
        boolean z12 = false;
        while (it.hasNext()) {
            if (ju0Var.apply(it.next())) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }
}
