package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class e83 extends h2f {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e83(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    private final void f(int i) {
    }

    @Override // defpackage.h2f
    public final void c(int i) {
        switch (this.c) {
            case 0:
                break;
            default:
                a4g a4gVar = (a4g) this.d;
                a4gVar.e = true;
                z3g z3gVar = (z3g) a4gVar.f.get();
                if (z3gVar != null) {
                    z3gVar.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h2f
    public final void d(Typeface typeface, boolean z) {
        switch (this.c) {
            case 0:
                Chip chip = (Chip) this.d;
                i83 i83Var = chip.o;
                chip.setText(i83Var.N1 ? i83Var.P0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    a4g a4gVar = (a4g) this.d;
                    a4gVar.e = true;
                    z3g z3gVar = (z3g) a4gVar.f.get();
                    if (z3gVar != null) {
                        z3gVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
