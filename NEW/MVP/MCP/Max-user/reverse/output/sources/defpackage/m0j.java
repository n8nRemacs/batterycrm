package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class m0j extends z1j {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ n2g c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j(p6j p6jVar, n2g n2gVar, String str, n2g n2gVar2) {
        super(n2gVar);
        this.o = p6jVar;
        this.d = str;
        this.c = n2gVar2;
    }

    @Override // defpackage.z1j
    public final void a() {
        switch (this.b) {
            case 0:
                n2g n2gVar = this.c;
                p6j p6jVar = (p6j) this.o;
                String str = (String) this.d;
                try {
                    p6jVar.a.m.l(p6jVar.b, p6j.a(p6jVar, str), new q5j(p6jVar, n2gVar, str));
                    return;
                } catch (RemoteException e) {
                    ulc ulcVar = p6j.e;
                    Object[] objArr = {str};
                    ulcVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", ulc.w((String) ulcVar.b, "requestUpdateInfo(%s)", objArr), e);
                    }
                    n2gVar.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((jcj) this.o).f) {
                    try {
                        jcj jcjVar = (jcj) this.o;
                        n2g n2gVar2 = this.c;
                        jcjVar.e.add(n2gVar2);
                        n2gVar2.a.i(new xpb(jcjVar, 20, n2gVar2));
                        if (((jcj) this.o).k.getAndIncrement() > 0) {
                            ((jcj) this.o).b.v("Already connected to the service.", new Object[0]);
                        }
                        jcj.b((jcj) this.o, (m0j) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j(jcj jcjVar, n2g n2gVar, n2g n2gVar2, m0j m0jVar) {
        super(n2gVar);
        this.o = jcjVar;
        this.c = n2gVar2;
        this.d = m0jVar;
    }
}
