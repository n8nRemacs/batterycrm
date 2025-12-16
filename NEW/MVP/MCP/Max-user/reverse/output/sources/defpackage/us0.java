package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class us0 extends qs0 {
    public final Boolean a;
    public final g4i b;
    public Window c;
    public boolean d;

    public us0(View view, g4i g4iVar) {
        ColorStateList colorStateListG;
        this.b = g4iVar;
        wq8 wq8Var = BottomSheetBehavior.C(view).i;
        if (wq8Var != null) {
            colorStateListG = wq8Var.a.c;
        } else {
            WeakHashMap weakHashMap = hfh.a;
            colorStateListG = veh.g(view);
        }
        if (colorStateListG != null) {
            this.a = Boolean.valueOf(eti.g(colorStateListG.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListB = r9j.b(view.getBackground());
        Integer numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(eti.g(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.qs0
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.qs0
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.qs0
    public final void c(View view, int i) {
        d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(View view) {
        h4i h4iVar;
        h4i h4iVar2;
        int top = view.getTop();
        g4i g4iVar = this.b;
        if (top < g4iVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                vgd vgdVar = new vgd(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
                    i4iVar.c = window;
                    h4iVar2 = i4iVar;
                } else {
                    h4iVar2 = new h4i(window, vgdVar);
                }
                h4iVar2.m(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), g4iVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                vgd vgdVar2 = new vgd(window2.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    i4i i4iVar2 = new i4i(window2.getInsetsController(), vgdVar2);
                    i4iVar2.c = window2;
                    h4iVar = i4iVar2;
                } else {
                    h4iVar = new h4i(window2, vgdVar2);
                }
                h4iVar.m(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Window window) {
        h4i h4iVar;
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            vgd vgdVar = new vgd(window.getDecorView());
            if (Build.VERSION.SDK_INT >= 30) {
                i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
                i4iVar.c = window;
                h4iVar = i4iVar;
            } else {
                h4iVar = new h4i(window, vgdVar);
            }
            this.d = h4iVar.k();
        }
    }
}
