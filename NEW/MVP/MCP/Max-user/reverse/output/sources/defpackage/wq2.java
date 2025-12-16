package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wq2 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yq2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq2(yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wq2) l((imb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wq2 wq2Var = new wq2(this.Z, continuation);
        wq2Var.Y = obj;
        return wq2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List list;
        int i;
        int i2;
        int i3;
        qqg qqgVar = qqg.a;
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        int i4 = this.X;
        if (i4 == 0) {
            g8j.b(obj);
            list = (List) ((imb) this.Y).a;
            String str = this.Z.w0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.f(list.size(), "Media viewer. Get result from loader size:"), null);
            }
            if (!list.isEmpty()) {
                ip2 ip2Var = (ip2) this.Z.X0.getValue();
                ip2Var.getClass();
                if (ip2Var == ip2.c) {
                    yq2 yq2Var = this.Z;
                    Iterator it = list.iterator();
                    i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        j09 j09Var = (j09) it.next();
                        if (j09Var.j() == yq2Var.d && fni.a(j09Var.w(), yq2Var.c)) {
                            break;
                        }
                        i++;
                    }
                    String str2 = this.Z.w0;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str2, ho7.f(i, "Media viewer. Found initialPos: "), null);
                    }
                } else {
                    i = ip2Var.b;
                }
                int i5 = ((ip2) this.Z.X0.getValue()).b;
                if (ip2Var != ip2.c) {
                    yq2 yq2Var2 = this.Z;
                    Iterator it2 = list.iterator();
                    i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        j09 j09Var2 = (j09) it2.next();
                        if (j09Var2.j() == yq2Var2.d && fni.a(j09Var2.w(), yq2Var2.c)) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    i2 = i5;
                }
                if (i5 < 0 || i5 == i2) {
                    i2 = i;
                } else {
                    wqi.c(this.Z.w0, wy1.g("Media viewer. Initial position changed, prev:", i5, ", new:", i2, ". Recalculate counter."), new Object[0]);
                    i = -1;
                }
                yq2 yq2Var3 = this.Z;
                this.Y = list;
                this.o = i2;
                this.X = 1;
                if (yq2.u(yq2Var3, i, list, this) == g84Var) {
                    return g84Var;
                }
                i3 = i2;
            }
            return qqgVar;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3 = this.o;
        list = (List) this.Y;
        g8j.b(obj);
        wqi.c(this.Z.w0, "subscribeOnResult", new Object[0]);
        this.Z.X0.m(null, new ip2(i3, list));
        if (((hp2) this.Z.Q0.get()).b && !list.isEmpty()) {
            String str3 = this.Z.w0;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, str3, "Media viewer. Call load next after get result.", null);
            }
            xw xwVar = this.Z.N0;
            if (xwVar != null) {
                xwVar.u();
            }
        }
        return qqgVar;
    }
}
