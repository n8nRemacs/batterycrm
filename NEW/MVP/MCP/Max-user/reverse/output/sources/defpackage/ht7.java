package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ht7 implements Iterator {
    public static final ht7 a;
    public static final /* synthetic */ ht7[] b;

    static {
        ht7 ht7Var = new ht7("INSTANCE", 0);
        a = ht7Var;
        b = new ht7[]{ht7Var};
    }

    public static ht7 valueOf(String str) {
        return (ht7) Enum.valueOf(ht7.class, str);
    }

    public static ht7[] values() {
        return (ht7[]) b.clone();
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
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
