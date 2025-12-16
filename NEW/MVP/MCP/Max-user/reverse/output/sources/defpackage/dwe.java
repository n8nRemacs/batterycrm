package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class dwe extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] s0;
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final fwe d;
    public final nk o;

    static {
        z8a z8aVar = new z8a(dwe.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;");
        vid.a.getClass();
        s0 = new yy7[]{z8aVar};
    }

    public dwe(Context context) {
        super(context, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(zud.K);
        float f = 40;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(zud.O);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(kti.d(169 * vw4.d().getDisplayMetrics().density), kti.d(20 * vw4.d().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(zud.N);
        float f2 = 12;
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(kti.d(90 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2)));
        this.c = frameLayout3;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(zud.M);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fwe fweVar = new fwe(context);
        fweVar.setId(zud.L);
        fweVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d = fweVar;
        this.o = new nk(this);
        setId(zud.J);
        setLayoutParams(new FrameLayout.LayoutParams(-1, kti.d(62 * vw4.d().getDisplayMetrics().density)));
        constraintLayout.addView(frameLayout);
        constraintLayout.addView(frameLayout2);
        constraintLayout.addView(frameLayout3);
        fweVar.addView(constraintLayout);
        addView(fweVar);
        onThemeChanged(a93.s0.y(this));
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = frameLayout.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 6, 0, 6);
        new fua(ut3VarG, 6, id, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id2 = frameLayout2.getId();
        ut3VarG.d(id2, 3, frameLayout.getId(), 3);
        ut3VarG.d(id2, 6, frameLayout.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id3 = frameLayout3.getId();
        ut3VarG.d(id3, 4, frameLayout.getId(), 4);
        ut3VarG.d(id3, 6, frameLayout.getId(), 7);
        new fua(ut3VarG, 6, id3, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
    }

    public final void a(yeb yebVar) {
        int iOrdinal = getShimmerBackground().ordinal();
        if (iOrdinal == 0) {
            yebVar.b();
            setBackgroundColor(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setBackgroundColor(yebVar.b().l);
        }
    }

    public final cwe getShimmerBackground() {
        yy7 yy7Var = s0[0];
        return (cwe) this.o.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        a(yebVar);
        this.a.setBackground(uga.d(Integer.valueOf(yebVar.c().a.a.e), null, null));
        float f = 4;
        this.b.setBackground(uga.e(Integer.valueOf(yebVar.c().a.a.e), null, null, kti.d(vw4.d().getDisplayMetrics().density * f)));
        this.c.setBackground(uga.e(Integer.valueOf(yebVar.c().a.a.e), null, null, kti.d(f * vw4.d().getDisplayMetrics().density)));
        ulc ulcVar = new ulc(4);
        bwe bweVar = (bwe) ulcVar.b;
        bweVar.j = false;
        ulcVar.r(1200L);
        ulcVar.q(yebVar.c().a.a.e);
        bweVar.d = yebVar.b().l;
        ulcVar.p(1.0f);
        this.d.a(ulcVar.k());
    }

    public final void setShimmerBackground(cwe cweVar) {
        this.o.O(this, s0[0], cweVar);
    }
}
