package defpackage;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class sj1 extends y0f {
    public final t9f o;

    public sj1(t9f t9fVar, ExecutorService executorService) {
        super(executorService);
        this.o = t9fVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (d2fVar instanceof rj1) {
        } else {
            d2fVar.z((t98) C(i));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == yza.w) {
            return new rj1(new roe(viewGroup.getContext(), 0));
        }
        if (i != yza.v) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        veb vebVar = new veb(viewGroup.getContext());
        v01 v01Var = new v01(vebVar, 6);
        vebVar.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density)));
        vebVar.setMaxLengthForLabel(100);
        vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.O));
        vebVar.f(new k(23, this.o));
        vebVar.setTypingMode(teb.a);
        return v01Var;
    }
}
