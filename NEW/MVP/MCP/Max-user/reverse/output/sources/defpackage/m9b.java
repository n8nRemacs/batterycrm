package defpackage;

import android.content.Context;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class m9b extends y93 implements u6g {
    public static final /* synthetic */ yy7[] C0 = {new z8a(m9b.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;"), u45.h(vid.a, m9b.class, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;")};
    public final l9b A0;
    public final l9b B0;

    public m9b(Context context) {
        super(dvc.circularProgressIndicatorStyle, y93.z0, context);
        z93 z93Var = (z93) this.a;
        t93 t93Var = new t93(z93Var);
        Context context2 = getContext();
        pj7 pj7Var = new pj7(context2, z93Var, t93Var, new v93(z93Var));
        Resources resources = context2.getResources();
        int i = lxc.indeterminate_static;
        izg izgVar = new izg();
        ThreadLocal threadLocal = lod.a;
        izgVar.a = god.a(resources, i, null);
        new hzg(izgVar.a.getConstantState());
        pj7Var.x0 = izgVar;
        setIndeterminateDrawable(pj7Var);
        setProgressDrawable(new ou4(getContext(), z93Var, t93Var));
        this.A0 = new l9b(this, 0);
        this.B0 = new l9b(this, 1);
        setIndeterminate(true);
        setTrackCornerRadius(kti.d(20 * vw4.d().getDisplayMetrics().density));
    }

    public static int d(f9b f9bVar, yeb yebVar) {
        if (fni.a(f9bVar, y8b.a)) {
            return yebVar.d().e.a.a;
        }
        if (fni.a(f9bVar, z8b.a)) {
            yebVar.d();
            return -1;
        }
        if (fni.a(f9bVar, a9b.a)) {
            return yebVar.d().e.c.a;
        }
        if (fni.a(f9bVar, b9b.a)) {
            return yebVar.d().e.e.a;
        }
        if (fni.a(f9bVar, c9b.a)) {
            yebVar.d();
            return -15921907;
        }
        if (fni.a(f9bVar, e9b.a)) {
            return yebVar.d().e.g.a;
        }
        if (fni.a(f9bVar, d9b.a)) {
            return yebVar.d().e.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final f9b getAppearance() {
        yy7 yy7Var = C0[0];
        return (f9b) this.A0.b;
    }

    public final k9b getSize() {
        yy7 yy7Var = C0[1];
        return (k9b) this.B0.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setIndicatorColor(d(getAppearance(), yebVar));
    }

    public final void setAppearance(f9b f9bVar) {
        this.A0.O(this, C0[0], f9bVar);
    }

    public final void setSize(k9b k9bVar) {
        this.B0.O(this, C0[1], k9bVar);
    }
}
