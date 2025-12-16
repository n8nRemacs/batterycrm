package defpackage;

/* loaded from: classes2.dex */
public final class rje {
    public final v1g a;

    public rje(w1g w1gVar) {
        v1g v1gVar = w1gVar instanceof v1g ? (v1g) w1gVar : null;
        this.a = v1gVar == null ? new v1g(w1gVar) : v1gVar;
    }

    public final Thread a(Runnable runnable, String str) {
        return this.a.a(str).newThread(runnable);
    }
}
