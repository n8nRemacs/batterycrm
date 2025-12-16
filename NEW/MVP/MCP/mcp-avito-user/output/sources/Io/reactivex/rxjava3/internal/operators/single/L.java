package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: SingleInternalHelper.java */
/* loaded from: classes8.dex */
public final class L {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SingleInternalHelper.java */
    public static final class a implements l41.s<NoSuchElementException> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f404509b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f404509b.clone();
        }

        @Override // l41.s
        public final NoSuchElementException get() {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SingleInternalHelper.java */
    public static final class b implements l41.o<io.reactivex.rxjava3.core.O, org.reactivestreams.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f404510b = {new b("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f404510b.clone();
        }

        @Override // l41.o
        public final org.reactivestreams.c apply(io.reactivex.rxjava3.core.O o12) {
            return new b0(o12);
        }
    }

    /* compiled from: SingleInternalHelper.java */
    public static final class c<T> implements Iterable<AbstractC41777j<T>> {
        @Override // java.lang.Iterable
        public final Iterator<AbstractC41777j<T>> iterator() {
            throw null;
        }
    }

    /* compiled from: SingleInternalHelper.java */
    public static final class d<T> implements Iterator<AbstractC41777j<T>> {
        public d() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public L() {
        throw new IllegalStateException("No instances!");
    }
}
