package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ms5 implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps5 b;

    public /* synthetic */ ms5(ps5 ps5Var, int i) {
        this.a = i;
        this.b = ps5Var;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ps5 ps5Var = this.b;
                List list = (List) obj;
                wqi.c("ps5", "onNotifUpdated: updated ids: %s", list);
                ps5Var.e(list);
                break;
            case 1:
                ps5 ps5Var2 = this.b;
                List list2 = (List) obj;
                wqi.c("ps5", "on next favorite sticker ids from obs: %s", list2);
                ps5Var2.e(list2);
                break;
            case 2:
                ps5 ps5Var3 = this.b;
                List list3 = (List) obj;
                wqi.c("ps5", "publishFavoritesIds: %s", list3);
                if (!ps5Var3.Z.b) {
                    ps5Var3.s0.f(list3);
                    break;
                }
                break;
            default:
                ps5 ps5Var4 = this.b;
                ps5Var4.getClass();
                long j = ((is5) obj).b;
                if (j != 0) {
                    ps5Var4.b(j);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                ps5 ps5Var = this.b;
                ps5Var.getClass();
                return new kk3(1, new v64(ps5Var, 3, (Long) obj));
            default:
                return new ik3(((kr5) this.b.a.get()).a(), 2, new oh2(4, (List) obj));
        }
    }
}
