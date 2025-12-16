package defpackage;

import java.util.Iterator;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class ih6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ih6(oh6 oh6Var, ghb ghbVar, boolean z, int i) {
        this.a = i;
        this.b = oh6Var;
        this.c = ghbVar;
        this.d = z;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                oh6 oh6Var = (oh6) this.b;
                ghb ghbVar = (ghb) this.c;
                boolean z = this.d;
                Iterator it = oh6Var.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).w(ghbVar, z);
                }
                break;
            case 1:
                oh6 oh6Var2 = (oh6) this.b;
                ghb ghbVar2 = (ghb) this.c;
                boolean z2 = this.d;
                Iterator it2 = oh6Var2.b.iterator();
                while (it2.hasNext()) {
                    ((dhb) it2.next()).n(ghbVar2, z2);
                }
                break;
            default:
                vu9 vu9Var = (vu9) this.b;
                boolean z3 = this.d;
                MessageModel messageModel = (MessageModel) this.c;
                Object objI = ue3.I(vu9Var.F().f.b.b());
                yrg yrgVar = objI instanceof yrg ? (yrg) objI : null;
                if (z3 && yrgVar != null) {
                    if (yrgVar.a != 0) {
                        String str = vu9Var.C0;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.d;
                            if (l6bVar.b(lg8Var)) {
                                l6bVar.c(lg8Var, str, vb9.e(yrgVar.a, "Try scroll to unread marker, mark: "), null);
                            }
                        }
                        long j = yrgVar.a;
                        long j2 = messageModel != null ? messageModel.c : 0L;
                        ay9 ay9VarE = vu9Var.E();
                        ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new wx9(ay9VarE, j, j2, null)));
                    }
                }
                break;
        }
        return qqg.a;
    }

    public /* synthetic */ ih6(vu9 vu9Var, boolean z, MessageModel messageModel) {
        this.a = 2;
        this.b = vu9Var;
        this.d = z;
        this.c = messageModel;
    }
}
