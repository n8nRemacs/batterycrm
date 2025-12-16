package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37256b<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    public EnumC10651b f358988b = EnumC10651b.f358992c;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    public T f358989c;

    /* compiled from: AbstractIterator.java */
    /* renamed from: com.google.common.base.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f358990a;

        static {
            int[] iArr = new int[EnumC10651b.values().length];
            f358990a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f358990a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractIterator.java */
    /* renamed from: com.google.common.base.b$b, reason: collision with other inner class name */
    public static final class EnumC10651b {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC10651b f358991b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC10651b f358992c;

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC10651b f358993d;

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC10651b f358994e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumC10651b[] f358995f;

        static {
            EnumC10651b enumC10651b = new EnumC10651b("READY", 0);
            f358991b = enumC10651b;
            EnumC10651b enumC10651b2 = new EnumC10651b("NOT_READY", 1);
            f358992c = enumC10651b2;
            EnumC10651b enumC10651b3 = new EnumC10651b("DONE", 2);
            f358993d = enumC10651b3;
            EnumC10651b enumC10651b4 = new EnumC10651b("FAILED", 3);
            f358994e = enumC10651b4;
            f358995f = new EnumC10651b[]{enumC10651b, enumC10651b2, enumC10651b3, enumC10651b4};
        }

        public EnumC10651b() {
            throw null;
        }

        public static EnumC10651b valueOf(String str) {
            return (EnumC10651b) Enum.valueOf(EnumC10651b.class, str);
        }

        public static EnumC10651b[] values() {
            return (EnumC10651b[]) f358995f.clone();
        }
    }

    @I41.a
    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC10651b enumC10651b = this.f358988b;
        EnumC10651b enumC10651b2 = EnumC10651b.f358994e;
        M.q(enumC10651b != enumC10651b2);
        int iOrdinal = this.f358988b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f358988b = enumC10651b2;
        this.f358989c = a();
        if (this.f358988b == EnumC10651b.f358993d) {
            return false;
        }
        this.f358988b = EnumC10651b.f358991b;
        return true;
    }

    @Override // java.util.Iterator
    @J
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f358988b = EnumC10651b.f358992c;
        T t12 = this.f358989c;
        this.f358989c = null;
        return t12;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
