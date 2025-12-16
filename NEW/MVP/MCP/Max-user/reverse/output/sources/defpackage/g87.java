package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g87 extends k2g {
    public final /* synthetic */ int e;
    public final /* synthetic */ vu2 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g87(String str, vu2 vu2Var, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = vu2Var;
        this.g = obj;
    }

    @Override // defpackage.k2g
    public final long a() {
        int i;
        long jA;
        t87[] t87VarArr;
        t87[] t87VarArr2;
        switch (this.e) {
            case 0:
                ((m87) this.f.c).a.a((yme) ((uid) this.g).a);
                return -1L;
            case 1:
                try {
                    ((m87) this.f.c).a.b((t87) this.g);
                } catch (IOException e) {
                    p2c p2cVar = p2c.a;
                    p2c p2cVar2 = p2c.a;
                    String str = "Http2Connection.Listener failure for " + ((m87) this.f.c).c;
                    p2cVar2.getClass();
                    p2c.i(4, str, e);
                    try {
                        ((t87) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                vu2 vu2Var = this.f;
                yme ymeVar = (yme) this.g;
                uid uidVar = new uid();
                synchronized (((m87) vu2Var.c).G0) {
                    synchronized (((m87) vu2Var.c)) {
                        try {
                            yme ymeVar2 = ((m87) vu2Var.c).A0;
                            yme ymeVar3 = new yme();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & ymeVar2.a) != 0) {
                                    ymeVar3.b(i2, ymeVar2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if ((ymeVar.a & (1 << i3)) != 0) {
                                    ymeVar3.b(i3, ymeVar.b[i3]);
                                }
                            }
                            uidVar.a = ymeVar3;
                            jA = ymeVar3.a() - ymeVar2.a();
                            if (jA == 0 || ((m87) vu2Var.c).b.isEmpty()) {
                                t87VarArr = null;
                            } else {
                                Object[] array = ((m87) vu2Var.c).b.values().toArray(new t87[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                t87VarArr = (t87[]) array;
                            }
                            t87VarArr2 = t87VarArr;
                            m87 m87Var = (m87) vu2Var.c;
                            m87Var.A0 = (yme) uidVar.a;
                            m87Var.t0.c(new g87(((m87) vu2Var.c).c + " onSettings", vu2Var, uidVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        ((m87) vu2Var.c).G0.c((yme) uidVar.a);
                    } catch (IOException e2) {
                        ((m87) vu2Var.c).c(2, 2, e2);
                    }
                }
                t87[] t87VarArr3 = t87VarArr2;
                if (t87VarArr3 != null) {
                    int length = t87VarArr3.length;
                    while (i < length) {
                        t87 t87Var = t87VarArr3[i];
                        synchronized (t87Var) {
                            t87Var.d += jA;
                            if (jA > 0) {
                                t87Var.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g87(String str, t87 t87Var, vu2 vu2Var) {
        super(str, true);
        this.e = 1;
        this.g = t87Var;
        this.f = vu2Var;
    }
}
