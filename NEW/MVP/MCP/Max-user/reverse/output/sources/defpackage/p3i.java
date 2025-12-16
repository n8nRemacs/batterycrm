package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p3i extends WindowInsetsAnimation$Callback {
    public final wa2 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public p3i(wa2 wa2Var) {
        super(wa2Var.a);
        this.d = new HashMap();
        this.a = wa2Var;
    }

    public final s3i a(WindowInsetsAnimation windowInsetsAnimation) {
        s3i s3iVar = (s3i) this.d.get(windowInsetsAnimation);
        if (s3iVar == null) {
            s3iVar = new s3i(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                s3iVar.a = new q3i(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, s3iVar);
        }
        return s3iVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM = jlb.m(list.get(size));
            s3i s3iVarA = a(windowInsetsAnimationM);
            s3iVarA.a.d(windowInsetsAnimationM.getFraction());
            this.c.add(s3iVarA);
        }
        return this.a.d(g4i.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ssb ssbVarE = this.a.e(a(windowInsetsAnimation), new ssb(bounds));
        ssbVarE.getClass();
        jlb.r();
        return jlb.k(((co7) ssbVarE.b).d(), ((co7) ssbVarE.c).d());
    }
}
