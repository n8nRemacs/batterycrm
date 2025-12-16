package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class tde {
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final bwf d;
    public final k18 e;
    public final und f;
    public final und g;

    public tde(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, t5g t5gVar, final int i) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = new bwf(new cm6() { // from class: sde
            @Override // defpackage.cm6
            public final Object invoke() {
                return new yk8(i);
            }
        });
        this.e = k18Var3;
        this.f = new und(new prd(10, this));
        this.g = new und(new l3b(t5gVar, 24, this));
    }

    public static /* synthetic */ Layout b(tde tdeVar, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return tdeVar.a(0, str, z);
    }

    public final Layout a(int i, CharSequence charSequence, boolean z) {
        bwf bwfVar = this.d;
        Layout layout = (Layout) ((yk8) bwfVar.getValue()).c(charSequence);
        if (layout != null) {
            return layout;
        }
        k18 k18Var = this.c;
        k18 k18Var2 = this.b;
        und undVar = this.g;
        if (!z) {
            Layout layoutA = h18.a((h18) k18Var2.getValue(), charSequence, (TextPaint) undVar.getValue(), ((dza) ((eu0) k18Var.getValue())).a() - i, 1, false, null, 0.0f, false, 496);
            ((yk8) bwfVar.getValue()).d(charSequence, layoutA);
            return layoutA;
        }
        Layout layoutB = kpi.b(this.a, (h18) k18Var2.getValue(), charSequence, ((dza) ((eu0) k18Var.getValue())).a() - i, (TextPaint) undVar.getValue(), rha.A0);
        ((yk8) bwfVar.getValue()).d(charSequence, layoutB);
        return layoutB;
    }

    public final void c() {
        bwf bwfVar = this.d;
        if (bwfVar.e()) {
            ((yk8) bwfVar.getValue()).i(-1);
            this.f.reset();
            this.g.reset();
        }
    }

    public tde(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this(context, k18Var, k18Var2, k18Var3, vz2.j, 200);
    }
}
