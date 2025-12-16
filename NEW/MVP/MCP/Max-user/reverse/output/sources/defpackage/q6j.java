package defpackage;

/* loaded from: classes.dex */
public final class q6j extends z1j {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q6j(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.z1j
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((jcj) this.c).f) {
                    try {
                        if (((jcj) this.c).k.get() > 0 && ((jcj) this.c).k.decrementAndGet() > 0) {
                            ((jcj) this.c).b.v("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        jcj jcjVar = (jcj) this.c;
                        if (jcjVar.m != null) {
                            jcjVar.b.v("Unbind from service.", new Object[0]);
                            jcj jcjVar2 = (jcj) this.c;
                            jcjVar2.a.unbindService(jcjVar2.l);
                            jcj jcjVar3 = (jcj) this.c;
                            jcjVar3.g = false;
                            jcjVar3.m = null;
                            jcjVar3.l = null;
                        }
                        ((jcj) this.c).d();
                        return;
                    } finally {
                    }
                }
            default:
                jcj jcjVar4 = (jcj) ((r6j) this.c).b;
                jcjVar4.b.v("unlinkToDeath", new Object[0]);
                jcjVar4.m.asBinder().unlinkToDeath(jcjVar4.j, 0);
                jcjVar4.m = null;
                jcjVar4.g = false;
                return;
        }
    }
}
