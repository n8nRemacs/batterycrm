package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vr1 extends dtf implements um6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xfh Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr1(xfh xfhVar, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = xfhVar;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vr1 vr1Var = new vr1((xr1) this.Z, (Continuation) obj3, 0);
                vr1Var.X = zBooleanValue;
                vr1Var.Y = (e2e) obj2;
                return vr1Var.n(qqg.a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                vr1 vr1Var2 = new vr1((uvh) this.Z, (Continuation) obj3, 1);
                vr1Var2.Y = (zlb) obj;
                vr1Var2.X = zBooleanValue2;
                return vr1Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence charSequence;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                boolean z = this.X;
                e2e e2eVar = (e2e) this.Y;
                if (!z) {
                    return null;
                }
                int iOrdinal = e2eVar.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (e2eVar.c) {
                    return null;
                }
                cnb cnbVarD = ((xr1) this.Z).c.d();
                t1e t1eVar = e2eVar.b;
                if (fni.a(t1eVar != null ? t1eVar.c : null, cnbVarD.a.getId()) || (charSequence = e2eVar.d) == null || vmf.F(charSequence)) {
                    return null;
                }
                return new jcg(new p5g(m0b.Y1, ys.D(new Object[]{charSequence})), new n5g(cnbVarD.a.m() ? m0b.W1 : m0b.X1));
            default:
                xvh xvhVar = xvh.a;
                g8j.b(obj);
                zlb zlbVar = (zlb) this.Y;
                boolean z2 = this.X;
                String str = ((uvh) this.Z).F0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "loadingState: " + zlbVar + " isShowBackButton: " + z2, null);
                    }
                }
                if (fni.a(zlbVar, wlb.a)) {
                    return xvhVar;
                }
                if ((zlbVar instanceof xlb) || fni.a(zlbVar, ylb.a)) {
                    return new yvh(z2);
                }
                if (fni.a(zlbVar, vlb.a)) {
                    return wvh.a;
                }
                zvh zvhVar = ((uvh) this.Z).X;
                return zvhVar != null ? zvhVar.c : xvhVar;
        }
    }
}
