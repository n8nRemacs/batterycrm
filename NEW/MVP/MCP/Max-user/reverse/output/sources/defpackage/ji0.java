package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class ji0 extends y0f {
    public final Widget X;
    public final /* synthetic */ int o = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ji0(s14 s14Var, ExecutorService executorService) {
        super(executorService);
        this.X = (Widget) s14Var;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                ((li0) d2fVar).z((ai0) ((t98) C(i)));
                break;
            case 1:
                J((v14) d2fVar, i);
                break;
            case 2:
                K((ev6) d2fVar, i);
                break;
            default:
                L((tq7) d2fVar, i);
                break;
        }
    }

    public void J(v14 v14Var, int i) {
        u14 u14Var = (u14) ((t98) C(i));
        o91 o91Var = new o91(0, this.X, s14.class, "onButtonClick", "onButtonClick()V", 0, 13);
        v14Var.z(u14Var);
        v14Var.G(u14Var.b, o91Var);
    }

    public void K(ev6 ev6Var, int i) {
        dv6 dv6Var = (dv6) ((t98) C(i));
        jx0 jx0Var = new jx0(1, this.X, cv6.class, "onGlobalContactClick", "onGlobalContactClick(Lone/me/contactlist/recyclerview/adapter/search/GlobalContactListItem;)V", 0, 19);
        ev6Var.z(dv6Var);
        v0b v0bVar = (v0b) ev6Var.a;
        f8j.d(v0bVar, 300L, new kg6(jx0Var, 2, dv6Var));
        v0bVar.f();
    }

    public void L(tq7 tq7Var, int i) {
        rq7 rq7Var = (rq7) ((t98) C(i));
        jx0 jx0Var = new jx0(1, this.X, uq7.class, "onInviteActionClick", "onInviteActionClick(Lone/me/inviteactions/list/InviteActionListItem$Type;)V", 0, 21);
        tq7Var.z(rq7Var);
        f8j.d(tq7Var.a, 300L, new kg6(jx0Var, 5, rq7Var));
    }

    @Override // defpackage.y0f, defpackage.phd
    public int l(int i) {
        switch (this.o) {
            case 1:
                return ((u14) ((t98) C(i))).c;
            case 2:
                return ((dv6) ((t98) C(i))).s0;
            case 3:
                return ((rq7) ((t98) C(i))).d;
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                ((li0) midVar).z((ai0) ((t98) C(i)));
                break;
            case 1:
                J((v14) midVar, i);
                break;
            case 2:
                K((ev6) midVar, i);
                break;
            default:
                L((tq7) midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 1:
                v14 v14Var = (v14) midVar;
                Object objI = ue3.I(list);
                if (objI == null) {
                    J(v14Var, i);
                    break;
                } else if (objI instanceof t14) {
                    v14Var.G(((t14) objI).a, new o91(0, this.X, s14.class, "onButtonClick", "onButtonClick()V", 0, 14));
                    break;
                }
                break;
            default:
                super.s(midVar, i, list);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b14, one.me.sdk.arch.Widget] */
    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new li0(viewGroup.getContext(), this.X);
            case 1:
                x3b x3bVar = new x3b(viewGroup.getContext());
                v14 v14Var = new v14(x3bVar);
                x3bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return v14Var;
            case 2:
                return new ev6(new v0b(viewGroup.getContext(), false));
            default:
                return new tq7(new sq7(viewGroup.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ji0(cv6 cv6Var, ExecutorService executorService) {
        super(executorService);
        this.X = (Widget) cv6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ji0(uq7 uq7Var, ExecutorService executorService) {
        super(executorService);
        this.X = (Widget) uq7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ji0(b14 b14Var, ExecutorService executorService) {
        super(executorService);
        this.X = (Widget) b14Var;
    }
}
