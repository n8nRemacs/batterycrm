package defpackage;

/* loaded from: classes.dex */
public final class h0j extends uti {
    public final /* synthetic */ n2g b;
    public final /* synthetic */ pli c;
    public final /* synthetic */ z8j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0j(z8j z8jVar, n2g n2gVar, n2g n2gVar2, pli pliVar) {
        super(n2gVar);
        this.b = n2gVar2;
        this.c = pliVar;
        this.d = z8jVar;
    }

    @Override // defpackage.uti
    public final void a() {
        synchronized (this.d.f) {
            try {
                z8j z8jVar = this.d;
                n2g n2gVar = this.b;
                z8jVar.e.add(n2gVar);
                n2gVar.a.i(new vhb(z8jVar, n2gVar, false, 21));
                if (this.d.k.getAndIncrement() > 0) {
                    this.d.b.a("Already connected to the service.", new Object[0]);
                }
                z8j.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
