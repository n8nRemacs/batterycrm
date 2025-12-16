package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pi4 implements Continuation {
    public cy7 a;
    public Continuation b;
    public Object c;

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return bd5.a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.b = null;
        this.c = obj;
    }
}
