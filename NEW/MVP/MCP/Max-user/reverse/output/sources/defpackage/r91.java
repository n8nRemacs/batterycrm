package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r91 extends y0f {
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ int o = 1;
    public final Object s0;

    public r91(ExecutorService executorService, qk8 qk8Var, w7c w7cVar) {
        super(executorService);
        this.X = executorService;
        this.Y = qk8Var;
        this.Z = w7cVar;
        this.s0 = new s6b(this);
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                ((q91) d2fVar).E0.setOpponents((zib) ((t98) C(i)));
                break;
            default:
                super.r(d2fVar, i);
                break;
        }
    }

    @Override // defpackage.l98, defpackage.phd
    public int j() {
        switch (this.o) {
            case 0:
                return this.d.f.size();
            default:
                return super.j();
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                ((q91) midVar).E0.setOpponents((zib) ((t98) C(i)));
                break;
            default:
                super.r(midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 0:
                q91 q91Var = (q91) midVar;
                if (!list.isEmpty()) {
                    q91Var.A((zib) this.d.f.get(i), list);
                    break;
                } else {
                    q91Var.E0.setOpponents((zib) ((t98) C(i)));
                    break;
                }
            default:
                super.s(midVar, i, list);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                p91 p91Var = new p91(viewGroup.getContext());
                p91Var.setId(eyc.call_opponents);
                p91Var.setParentSizeProvider((x6i) this.X);
                p91Var.setVideoLayoutUpdatesControllerProvider((g91) this.Z);
                p91Var.setListener((y6i) this.Y);
                p91Var.setOpponentsViewPool(((g91) this.s0).b.M0);
                frameLayout.addView(p91Var, -1, -1);
                return new q91(frameLayout);
            default:
                return new d44(viewGroup.getContext(), (qk8) this.Y, (ExecutorService) this.X, (s6b) this.s0);
        }
    }

    public r91(x6i x6iVar, y6i y6iVar, g91 g91Var, g91 g91Var2) {
        super(y4e.a.g().a());
        this.X = x6iVar;
        this.Y = y6iVar;
        this.Z = g91Var;
        this.s0 = g91Var2;
    }
}
