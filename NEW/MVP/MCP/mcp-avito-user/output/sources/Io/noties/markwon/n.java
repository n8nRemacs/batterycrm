package io.noties.markwon;

import j.N;
import j.P;

/* compiled from: MarkwonVisitor.java */
/* loaded from: classes8.dex */
public interface n extends Q61.C {

    /* compiled from: MarkwonVisitor.java */
    public interface a {
    }

    /* compiled from: MarkwonVisitor.java */
    public interface b {
        @N
        <N extends Q61.v> b a(@N Class<N> cls, @P c<? super N> cVar);
    }

    /* compiled from: MarkwonVisitor.java */
    public interface c<N extends Q61.v> {
        void a(@N Q61.v vVar, @N n nVar);
    }

    void F(@N Q61.v vVar);

    void a(int i12, @P Object obj);

    @N
    C builder();

    @N
    y f();

    <N extends Q61.v> void i(@N N n12, int i12);

    int length();

    boolean r(@N Q61.v vVar);

    void t(@N Q61.v vVar);

    @N
    g u();

    void w();

    void x(@N Q61.v vVar);
}
