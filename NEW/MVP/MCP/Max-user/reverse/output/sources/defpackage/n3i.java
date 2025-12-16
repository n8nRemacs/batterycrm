package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n3i implements View.OnApplyWindowInsetsListener {
    public final wa2 a;
    public g4i b;

    public n3i(View view, wa2 wa2Var) {
        g4i g4iVarB;
        this.a = wa2Var;
        WeakHashMap weakHashMap = hfh.a;
        g4i g4iVarA = weh.a(view);
        if (g4iVarA != null) {
            int i = Build.VERSION.SDK_INT;
            g4iVarB = (i >= 30 ? new x3i(g4iVarA) : i >= 29 ? new v3i(g4iVarA) : new u3i(g4iVarA)).b();
        } else {
            g4iVarB = null;
        }
        this.b = g4iVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = g4i.h(view, windowInsets);
            return o3i.i(view, windowInsets);
        }
        g4i g4iVarH = g4i.h(view, windowInsets);
        e4i e4iVar = g4iVarH.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = hfh.a;
            this.b = weh.a(view);
        }
        if (this.b == null) {
            this.b = g4iVarH;
            return o3i.i(view, windowInsets);
        }
        wa2 wa2VarJ = o3i.j(view);
        if (wa2VarJ != null && Objects.equals((WindowInsets) wa2VarJ.b, windowInsets)) {
            return o3i.i(view, windowInsets);
        }
        g4i g4iVar = this.b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!e4iVar.f(i2).equals(g4iVar.a.f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return o3i.i(view, windowInsets);
        }
        g4i g4iVar2 = this.b;
        s3i s3iVar = new s3i(i, (i & 8) != 0 ? e4iVar.f(8).d > g4iVar2.a.f(8).d ? o3i.e : o3i.f : o3i.g, 160L);
        s3iVar.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(s3iVar.a.a());
        co7 co7VarF = e4iVar.f(i);
        co7 co7VarF2 = g4iVar2.a.f(i);
        int iMin = Math.min(co7VarF.a, co7VarF2.a);
        int i3 = co7VarF.b;
        int i4 = co7VarF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = co7VarF.c;
        int i6 = co7VarF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = co7VarF.d;
        int i8 = i;
        int i9 = co7VarF2.d;
        ssb ssbVar = new ssb(co7.b(iMin, iMin2, iMin3, Math.min(i7, i9)), 18, co7.b(Math.max(co7VarF.a, co7VarF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        o3i.f(view, s3iVar, windowInsets, false);
        duration.addUpdateListener(new m3i(s3iVar, g4iVarH, g4iVar2, i8, view));
        duration.addListener(new kh(s3iVar, 6, view));
        mgb.a(view, new b6i(7, view, s3iVar, ssbVar, duration, false));
        this.b = g4iVarH;
        return o3i.i(view, windowInsets);
    }
}
