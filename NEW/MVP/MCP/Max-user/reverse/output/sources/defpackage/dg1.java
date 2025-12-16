package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class dg1 extends y0f {
    public final tq1 X;
    public final h91 Y;
    public final sp1 Z;
    public final i1c o;
    public final oq1 s0;
    public final Executor t0;
    public final pr1 u0;
    public final x4h v0;
    public final b w0;
    public final k18 x0;
    public final k18 y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public dg1(i1c i1cVar, bm1 bm1Var, sl1 sl1Var, am1 am1Var, oq1 oq1Var, k18 k18Var, k18 k18Var2, pr1 pr1Var, x4h x4hVar, b bVar) {
        ExecutorService executorServiceA = y4e.a.g().a();
        super(executorServiceA);
        this.o = i1cVar;
        this.X = bm1Var;
        this.Y = sl1Var;
        this.Z = am1Var;
        this.s0 = oq1Var;
        this.t0 = executorServiceA;
        this.u0 = pr1Var;
        this.v0 = x4hVar;
        this.w0 = bVar;
        this.x0 = k18Var;
        this.y0 = k18Var2;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void r(d2f d2fVar, int i) {
        d2fVar.z((cg1) ((t98) C(i)));
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void y(d2f d2fVar) {
        d2fVar.E();
        xq1 xq1Var = d2fVar instanceof xq1 ? (xq1) d2fVar : null;
        if (xq1Var != null) {
            xq1Var.E0.a.remove(xq1Var);
        }
    }

    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        i3 yf1Var;
        d2f d2fVar = (d2f) midVar;
        if (list.isEmpty()) {
            r(d2fVar, i);
            return;
        }
        t98 t98Var = (cg1) ((t98) C(i));
        if (t98Var instanceof bg1) {
            yf1Var = new ag1(9);
            for (Object obj : list) {
                i3 i3Var = obj instanceof ag1 ? (ag1) obj : null;
                if (i3Var != null) {
                    yf1Var.c0(i3Var);
                }
            }
        } else if (t98Var instanceof xf1) {
            yf1Var = new wf1(9);
            for (Object obj2 : list) {
                i3 i3Var2 = obj2 instanceof wf1 ? (wf1) obj2 : null;
                if (i3Var2 != null) {
                    yf1Var.c0(i3Var2);
                }
            }
        } else {
            if (!(t98Var instanceof zf1)) {
                throw new NoWhenBranchMatchedException();
            }
            yf1Var = new yf1(9);
            for (Object obj3 : list) {
                i3 i3Var3 = obj3 instanceof yf1 ? (yf1) obj3 : null;
                if (i3Var3 != null) {
                    yf1Var.c0(i3Var3);
                }
            }
        }
        d2fVar.A(t98Var, yf1Var);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        k18 k18Var = this.x0;
        k18 k18Var2 = this.y0;
        b bVar = this.w0;
        x4h x4hVar = this.v0;
        if (i == 111) {
            vq1 vq1Var = new vq1(viewGroup.getContext());
            vq1Var.setLayoutParams(new kt3(-1, -1));
            vq1Var.setVisibility(0);
            vq1Var.setOnTouchListener((View.OnTouchListener) k18Var.getValue());
            vq1Var.setControlsMediator((e64) k18Var2.getValue());
            vq1Var.setVideoLayoutUpdatesController(x4hVar);
            vq1Var.setCallSpeakerMediator(this.s0);
            vq1Var.setListener(this.X);
            vq1Var.setOpponentsViewPool(bVar);
            ((e64) k18Var2.getValue()).b(vq1Var);
            this.o.a.add(vq1Var);
            return new xq1(vq1Var, this.u0);
        }
        if (i != 222) {
            if (i != 225) {
                throw new IllegalStateException(("unknown item view type " + i).toString());
            }
            tp1 tp1Var = new tp1(viewGroup.getContext());
            tp1Var.setLayoutParams(new kt3(-1, -1));
            tp1Var.setVisibility(0);
            tp1Var.setListener(this.Z);
            return new v01(tp1Var, 7);
        }
        i91 i91Var = new i91(viewGroup.getContext());
        i91Var.setLayoutParams(new kt3(-1, -1));
        i91Var.setVisibility(0);
        i91Var.setOnTouchListener((View.OnTouchListener) k18Var.getValue());
        i91Var.setControlsMediator((e64) k18Var2.getValue());
        i91Var.setListener(this.Y);
        i91Var.setVideoLayoutUpdatesController(x4hVar);
        i91Var.setOpponentsViewPool(bVar);
        ((e64) k18Var2.getValue()).b(i91Var);
        return new v01(i91Var, 3);
    }
}
