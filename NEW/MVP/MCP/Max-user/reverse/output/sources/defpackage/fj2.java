package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fj2 extends yk8 {
    public final /* synthetic */ int g = 2;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(Context context) {
        super(100);
        this.h = context;
    }

    @Override // defpackage.yk8
    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                pb2 pb2Var = ((dj2) obj).a;
                eh9 eh9Var = pb2Var.c;
                if (eh9Var == null) {
                    return null;
                }
                return ((ij2) this.h).e(pb2Var, eh9Var, 2, false);
            case 1:
                imb imbVar = (imb) obj;
                Context context = (Context) this.h;
                return new lc0(context, kxa.a, fui.a((CharSequence) imbVar.a, (Long) imbVar.b), a93.s0.x(context).k());
            default:
                return null;
        }
    }

    @Override // defpackage.yk8
    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 2:
                d1h d1hVar = (d1h) obj2;
                f1h f1hVar = (f1h) this.h;
                if (z) {
                    String str = f1hVar.e;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            long j = d1hVar.b;
                            String str2 = d1hVar.a;
                            int iG = f1hVar.u.g();
                            boolean zD = d1hVar.c.d();
                            StringBuilder sbN = ho7.n("Player autoplay. State evicted, should free player, \n                                |msgId:", j, ", \n                                |attachId:", str2);
                            sbN.append("\n                                |states count:");
                            sbN.append(iG);
                            sbN.append("\n                                |playing:");
                            sbN.append(zD);
                            l6bVar.c(lg8Var, str, wmf.e(sbN.toString()), null);
                        }
                    }
                    d1hVar.d.a(d1hVar.c);
                    qdh qdhVar = (qdh) d1hVar.X.get();
                    if (qdhVar != null) {
                        qdhVar.w();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yk8
    public int h(Object obj) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(ij2 ij2Var) {
        super(500);
        this.h = ij2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(int i, f1h f1hVar) {
        super(i);
        this.h = f1hVar;
    }
}
