package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37316d<T> extends N4<T> {

    /* renamed from: b, reason: collision with root package name */
    public b f359661b = b.f359665c;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    public T f359662c;

    /* compiled from: AbstractIterator.java */
    /* renamed from: com.google.common.collect.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359663a;

        static {
            int[] iArr = new int[b.values().length];
            f359663a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359663a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractIterator.java */
    /* renamed from: com.google.common.collect.d$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f359664b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f359665c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f359666d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f359667e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f359668f;

        static {
            b bVar = new b("READY", 0);
            f359664b = bVar;
            b bVar2 = new b("NOT_READY", 1);
            f359665c = bVar2;
            b bVar3 = new b("DONE", 2);
            f359666d = bVar3;
            b bVar4 = new b("FAILED", 3);
            f359667e = bVar4;
            f359668f = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f359668f.clone();
        }
    }

    @I41.a
    public abstract T a();

    @I41.a
    @InterfaceC19845a
    public final void b() {
        this.f359661b = b.f359666d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b bVar = this.f359661b;
        b bVar2 = b.f359667e;
        com.google.common.base.M.q(bVar != bVar2);
        int iOrdinal = this.f359661b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f359661b = bVar2;
        this.f359662c = a();
        if (this.f359661b == b.f359666d) {
            return false;
        }
        this.f359661b = b.f359664b;
        return true;
    }

    @Override // java.util.Iterator
    @InterfaceC19845a
    @InterfaceC37434x3
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f359661b = b.f359665c;
        T t12 = this.f359662c;
        this.f359662c = null;
        return t12;
    }
}
