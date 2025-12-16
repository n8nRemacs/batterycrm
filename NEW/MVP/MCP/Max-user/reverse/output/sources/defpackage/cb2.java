package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class cb2 implements Iterable, my7 {
    public final char a;
    public final char b;
    public final int c = 1;

    public cb2(char c, char c2) {
        this.a = c;
        this.b = (char) x6j.a(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new db2(this.a, this.b, this.c);
    }
}
