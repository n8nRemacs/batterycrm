package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class ode extends n2 implements qde {
    public ode() {
        super(new llc(13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final int j0() {
        if (!dqi.r(this.c)) {
            return 0;
        }
        return u45.c(4, vw4.d().getDisplayMetrics().density, N());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    @Override // defpackage.qde
    public final void setAlias(Layout layout) {
        if (layout != null) {
            ((pde) T()).setLayout(layout);
            T().setVisibility(0);
            y();
        } else {
            ?? r2 = this.c;
            if (r2.e()) {
                ((pde) r2.getValue()).setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qde
    public final void setAliasColor(int i) {
        ?? r0 = this.c;
        if (r0.e()) {
            ((pde) r0.getValue()).setTextColor(i);
        }
    }
}
