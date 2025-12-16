package defpackage;

/* loaded from: classes2.dex */
public final class j9i {
    public final tze a;
    public final long b;
    public final c9i c;
    public final mze d;
    public final mze e;
    public final /* synthetic */ pze f;

    public j9i(pze pzeVar, tze tzeVar, c9i c9iVar, mze mzeVar, mze mzeVar2) {
        this.f = pzeVar;
        long j = c9iVar.b;
        this.a = tzeVar;
        this.b = j;
        this.c = c9iVar;
        this.d = mzeVar;
        this.e = mzeVar2;
    }

    public final String toString() {
        c9i c9iVar = this.c;
        return c9iVar == null ? "<unknown command>" : c9iVar.a;
    }
}
