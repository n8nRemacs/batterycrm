package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nea {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ qea c;

    public nea(qea qeaVar, ck4 ck4Var, Executor executor) {
        this.c = qeaVar;
        this.a = new WeakReference(ck4Var);
        this.b = executor;
    }
}
