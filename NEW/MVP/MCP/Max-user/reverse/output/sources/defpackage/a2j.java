package defpackage;

/* loaded from: classes.dex */
public final class a2j extends uti {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2j(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.uti
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((z8j) this.c).f) {
                    try {
                        if (((z8j) this.c).k.get() > 0 && ((z8j) this.c).k.decrementAndGet() > 0) {
                            ((z8j) this.c).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        z8j z8jVar = (z8j) this.c;
                        if (z8jVar.m != null) {
                            z8jVar.b.a("Unbind from service.", new Object[0]);
                            z8j z8jVar2 = (z8j) this.c;
                            z8jVar2.a.unbindService(z8jVar2.l);
                            z8j z8jVar3 = (z8j) this.c;
                            z8jVar3.g = false;
                            z8jVar3.m = null;
                            z8jVar3.l = null;
                        }
                        ((z8j) this.c).c();
                        return;
                    } finally {
                    }
                }
            default:
                z8j z8jVar4 = (z8j) ((r6j) this.c).b;
                z8jVar4.b.a("unlinkToDeath", new Object[0]);
                z8jVar4.m.asBinder().unlinkToDeath(z8jVar4.j, 0);
                z8jVar4.m = null;
                z8jVar4.g = false;
                return;
        }
    }
}
