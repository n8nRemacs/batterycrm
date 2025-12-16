package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class lh1 extends y0f {
    public final Executor X;
    public final jh1 Y;
    public final cm6 Z;
    public final vfh o;
    public final cm6 s0;
    public final cm6 t0;

    /* JADX WARN: Illegal instructions before constructor call */
    public lh1(vfh vfhVar, jh1 jh1Var, cm6 cm6Var, rq1 rq1Var, j91 j91Var, int i) {
        ExecutorService executorServiceA = y4e.a.g().a();
        rq1Var = (i & 16) != 0 ? null : rq1Var;
        j91Var = (i & 32) != 0 ? null : j91Var;
        super(executorServiceA);
        this.o = vfhVar;
        this.X = executorServiceA;
        this.Y = jh1Var;
        this.Z = cm6Var;
        this.s0 = rq1Var;
        this.t0 = j91Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        s(d2fVar, i, hd5.a);
    }

    @Override // defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(d2f d2fVar, int i, List list) {
        cm6 cm6Var;
        if ((d2fVar instanceof ih1 ? (ih1) d2fVar : null) != null) {
            if (this.o != vfh.c) {
                ((ih1) d2fVar).F0.setMode(gt1.b);
            } else if (j() == 1 && (cm6Var = this.t0) != null && ((Number) cm6Var.invoke()).intValue() == 0) {
                ((ih1) d2fVar).F0.setMode(gt1.o);
            } else {
                ((ih1) d2fVar).F0.setMode(gt1.a);
            }
        }
        int iK = K();
        View view = d2fVar.a;
        if (view.getWidth() != iK || view.getHeight() != iK) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iK;
            layoutParams.height = iK;
            view.setLayoutParams(layoutParams);
        }
        iv ivVar = this.d;
        if (((yd1) ivVar.f.get(i)).getK0() != 1) {
            d2fVar.z((t98) ivVar.f.get(i));
            return;
        }
        if (list.isEmpty()) {
            d2fVar.z((t98) ivVar.f.get(i));
            return;
        }
        it1 it1Var = ((ih1) d2fVar).F0;
        nz5 nz5Var = new nz5(lee.g(new b26((zde) new at(2, list), (em6) new gf1(1), (em6) nee.a), zx0.w0));
        while (nz5Var.hasNext()) {
            ud1 ud1Var = (ud1) nz5Var.next();
            if (ud1Var instanceof qd1) {
                qd1 qd1Var = (qd1) ud1Var;
                it1Var.H(qd1Var.b, qd1Var.a);
            } else if (ud1Var instanceof rd1) {
                it1Var.setRaiseHand(((rd1) ud1Var).a);
            } else if (ud1Var instanceof pd1) {
                it1Var.D(((pd1) ud1Var).a);
            } else if (ud1Var instanceof sd1) {
                it1Var.F(((sd1) ud1Var).a);
            } else if (ud1Var instanceof nd1) {
                it1Var.setAvatar(((nd1) ud1Var).a);
            } else if (ud1Var instanceof od1) {
                it1Var.setButtonAction(((od1) ud1Var).a);
            } else {
                if (!(ud1Var instanceof td1)) {
                    throw new NoWhenBranchMatchedException();
                }
                it1Var.setOpponentVideo(((td1) ud1Var).a);
            }
        }
    }

    public final int K() {
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            return kti.d(96 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return kti.d(0 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((yd1) this.d.f.get(i)).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        v1a v1aVar = a93.s0;
        int iK = K();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
        jh1 jh1Var = this.Y;
        if (i != 3) {
            if (i == 4) {
                View ju1Var = new ju1(viewGroup.getContext());
                ju1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(ju1Var);
                return new v01(frameLayout, 5);
            }
            it1 it1Var = new it1(viewGroup.getContext(), 0);
            it1Var.setId(eyc.call_opponent);
            int iOrdinal = this.o.ordinal();
            gt1 gt1Var = gt1.b;
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gt1Var = gt1.a;
            }
            it1Var.setMode(gt1Var);
            it1Var.setCustomTheme(v1aVar.B(it1Var).c);
            it1Var.setCallSpeakerMediator(this.s0);
            it1Var.setVideoLayoutUpdatesControllerProvider(this.Z);
            frameLayout.addView(it1Var, -1, -1);
            return new ih1(frameLayout, jh1Var);
        }
        Context context = viewGroup.getContext();
        final qp1 qp1Var = new qp1(context, null);
        qp1Var.setBackgroundColor(v1aVar.B(qp1Var).c.b().h);
        mfh.j(qp1Var, vw4.d().getDisplayMetrics().density * 20.0f);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(j0b.c0);
        appCompatTextView.setLayoutParams(new kt3(-1, -2));
        appCompatTextView.setGravity(17);
        dpg.b.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(v1aVar.B(appCompatTextView).c.getText().e);
        appCompatTextView.setText(d3d.call_item_join_by_link_preview_title);
        jtd jtdVar = new jtd(context, 0);
        jtdVar.setId(j0b.Y);
        int i2 = i0b.D;
        yeb yebVar = v1aVar.B(jtdVar).c;
        jtdVar.z(i2, -1);
        jtdVar.setAccessibility(Integer.valueOf(m0b.H));
        jtdVar.setMode(etd.o);
        float f = 32;
        jtdVar.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        jtdVar.setButtonPadding(kti.d(3 * vw4.d().getDisplayMetrics().density));
        final int i3 = 0;
        f8j.d(jtdVar, 300L, new View.OnClickListener() { // from class: op1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        pp1 pp1Var = qp1Var.F0;
                        if (pp1Var != null) {
                            pp1Var.d();
                            break;
                        }
                        break;
                    case 1:
                        pp1 pp1Var2 = qp1Var.F0;
                        if (pp1Var2 != null) {
                            pp1Var2.c();
                            break;
                        }
                        break;
                    case 2:
                        pp1 pp1Var3 = qp1Var.F0;
                        if (pp1Var3 != null) {
                            pp1Var3.b();
                            break;
                        }
                        break;
                    default:
                        pp1 pp1Var4 = qp1Var.F0;
                        if (pp1Var4 != null) {
                            pp1Var4.h();
                            break;
                        }
                        break;
                }
            }
        });
        jtd jtdVar2 = new jtd(context, 0);
        jtdVar2.setId(j0b.Z);
        etd etdVar = etd.a;
        jtdVar2.setMode(etdVar);
        float f2 = 56;
        jtdVar2.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2)));
        float f3 = 6;
        jtdVar2.setButtonPadding(kti.d(vw4.d().getDisplayMetrics().density * f3));
        jtd.B(jtdVar2, i0b.G);
        int i4 = m0b.j0;
        jtdVar2.setTitle(new n5g(i4));
        jtdVar2.setAccessibility(Integer.valueOf(i4));
        final int i5 = 1;
        f8j.d(jtdVar2, 300L, new View.OnClickListener() { // from class: op1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        pp1 pp1Var = qp1Var.F0;
                        if (pp1Var != null) {
                            pp1Var.d();
                            break;
                        }
                        break;
                    case 1:
                        pp1 pp1Var2 = qp1Var.F0;
                        if (pp1Var2 != null) {
                            pp1Var2.c();
                            break;
                        }
                        break;
                    case 2:
                        pp1 pp1Var3 = qp1Var.F0;
                        if (pp1Var3 != null) {
                            pp1Var3.b();
                            break;
                        }
                        break;
                    default:
                        pp1 pp1Var4 = qp1Var.F0;
                        if (pp1Var4 != null) {
                            pp1Var4.h();
                            break;
                        }
                        break;
                }
            }
        });
        jtd jtdVar3 = new jtd(context, 0);
        jtdVar3.setId(j0b.b0);
        jtdVar3.setMode(etdVar);
        jtdVar3.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2)));
        jtdVar3.setButtonPadding(kti.d(vw4.d().getDisplayMetrics().density * f3));
        jtd.B(jtdVar3, i0b.i0);
        int i6 = m0b.l0;
        jtdVar3.setTitle(new n5g(i6));
        jtdVar3.setAccessibility(Integer.valueOf(i6));
        final int i7 = 2;
        f8j.d(jtdVar3, 300L, new View.OnClickListener() { // from class: op1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        pp1 pp1Var = qp1Var.F0;
                        if (pp1Var != null) {
                            pp1Var.d();
                            break;
                        }
                        break;
                    case 1:
                        pp1 pp1Var2 = qp1Var.F0;
                        if (pp1Var2 != null) {
                            pp1Var2.c();
                            break;
                        }
                        break;
                    case 2:
                        pp1 pp1Var3 = qp1Var.F0;
                        if (pp1Var3 != null) {
                            pp1Var3.b();
                            break;
                        }
                        break;
                    default:
                        pp1 pp1Var4 = qp1Var.F0;
                        if (pp1Var4 != null) {
                            pp1Var4.h();
                            break;
                        }
                        break;
                }
            }
        });
        jtd jtdVar4 = new jtd(context, 0);
        jtdVar4.setId(j0b.a0);
        jtdVar4.setMode(etdVar);
        jtdVar4.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        jtdVar4.setButtonPadding(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        jtd.B(jtdVar4, i0b.g0);
        int i8 = m0b.k0;
        jtdVar4.setTitle(new n5g(i8));
        jtdVar4.setAccessibility(Integer.valueOf(i8));
        final int i9 = 3;
        f8j.d(jtdVar4, 300L, new View.OnClickListener() { // from class: op1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        pp1 pp1Var = qp1Var.F0;
                        if (pp1Var != null) {
                            pp1Var.d();
                            break;
                        }
                        break;
                    case 1:
                        pp1 pp1Var2 = qp1Var.F0;
                        if (pp1Var2 != null) {
                            pp1Var2.c();
                            break;
                        }
                        break;
                    case 2:
                        pp1 pp1Var3 = qp1Var.F0;
                        if (pp1Var3 != null) {
                            pp1Var3.b();
                            break;
                        }
                        break;
                    default:
                        pp1 pp1Var4 = qp1Var.F0;
                        if (pp1Var4 != null) {
                            pp1Var4.h();
                            break;
                        }
                        break;
                }
            }
        });
        qp1Var.addView(appCompatTextView);
        qp1Var.addView(jtdVar);
        qp1Var.addView(jtdVar2);
        qp1Var.addView(jtdVar3);
        qp1Var.addView(jtdVar4);
        ut3 ut3VarG = l5j.g(qp1Var);
        int id = jtdVar.getId();
        ut3VarG.d(id, 3, 0, 3);
        float f4 = 12;
        ut3VarG.g(id).d.H = kti.d(vw4.d().getDisplayMetrics().density * f4);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.g(id).d.J = kti.d(vw4.d().getDisplayMetrics().density * f4);
        int id2 = appCompatTextView.getId();
        ut3VarG.d(id2, 3, jtdVar.getId(), 4);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.g(id2).d.J = kti.d(vw4.d().getDisplayMetrics().density * f4);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.g(id2).d.K = kti.d(vw4.d().getDisplayMetrics().density * f4);
        int id3 = jtdVar2.getId();
        ut3VarG.d(id3, 3, appCompatTextView.getId(), 4);
        ut3VarG.g(id3).d.H = kti.d(4 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.g(id3).d.K = kti.d(vw4.d().getDisplayMetrics().density * f4);
        ut3VarG.d(id3, 7, jtdVar4.getId(), 6);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.g(id3).d.I = kti.d(vw4.d().getDisplayMetrics().density * f4);
        int id4 = jtdVar4.getId();
        ut3VarG.d(id4, 3, jtdVar2.getId(), 3);
        ut3VarG.d(id4, 6, jtdVar2.getId(), 7);
        ut3VarG.d(id4, 7, jtdVar3.getId(), 6);
        ut3VarG.d(id4, 4, jtdVar2.getId(), 4);
        int id5 = jtdVar3.getId();
        ut3VarG.d(id5, 3, jtdVar4.getId(), 3);
        ut3VarG.d(id5, 6, jtdVar4.getId(), 7);
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.g(id5).d.J = kti.d(f4 * vw4.d().getDisplayMetrics().density);
        ut3VarG.d(id5, 4, jtdVar4.getId(), 4);
        ut3VarG.a(qp1Var);
        qp1Var.setId(eyc.call_copy_link_preview);
        qp1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(qp1Var);
        return new kh1(frameLayout, jh1Var);
    }
}
