package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cfg {
    public final hf6 a;
    public boolean g;
    public byte[] h;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public long i = -9223372036854775807L;

    public cfg(int i, hf6 hf6Var) {
        this.a = hf6Var;
    }

    public final int a() {
        return xz9.i(this.a.n) ? 48000 : 90000;
    }
}
