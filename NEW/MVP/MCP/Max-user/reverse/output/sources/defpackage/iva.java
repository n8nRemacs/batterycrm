package defpackage;

/* loaded from: classes.dex */
public final class iva implements j42 {
    public final bva a;
    public final /* synthetic */ jva b;

    public iva(jva jvaVar, bva bvaVar) {
        this.b = jvaVar;
        this.a = bvaVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cm6, hn6] */
    @Override // defpackage.j42
    public final void cancel() {
        jva jvaVar = this.b;
        js jsVar = jvaVar.b;
        bva bvaVar = this.a;
        jsVar.remove(bvaVar);
        if (fni.a(jvaVar.c, bvaVar)) {
            bvaVar.a();
            jvaVar.c = null;
        }
        bvaVar.b.remove(this);
        ?? r0 = bvaVar.c;
        if (r0 != 0) {
            r0.invoke();
        }
        bvaVar.c = null;
    }
}
