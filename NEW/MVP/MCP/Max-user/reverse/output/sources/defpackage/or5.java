package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class or5 implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr5 b;

    public /* synthetic */ or5(vr5 vr5Var, int i) {
        this.a = i;
        this.b = vr5Var;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        vr5 vr5Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                wqi.c("vr5", "onNotifUpdated: updated ids: %s", list);
                vr5Var.f(list);
                break;
            case 1:
                List list2 = (List) obj;
                wqi.c("vr5", "on next favorite ids from obs: %s", list2);
                vr5Var.f(list2);
                break;
            case 2:
            default:
                as5 as5Var = (as5) obj;
                long j = as5Var.b;
                if (j != 0) {
                    wqi.c("vr5", "loadFromMarker: new marker in response=%d", Long.valueOf(j));
                    vr5Var.b(as5Var.b);
                    break;
                }
                break;
            case 3:
                List list3 = (List) obj;
                wqi.c("vr5", "on next favorite sticker sets: %s", list3);
                vr5Var.Y.f(list3);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return new kk3(1, new v64(this.b, 2, (Long) obj));
            default:
                return new ik3(((zr5) this.b.a.getValue()).a(), 2, new oh2(10, (List) obj));
        }
    }
}
