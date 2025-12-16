package defpackage;

import android.view.View;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* loaded from: classes.dex */
public abstract class bqi {
    public static boolean a;
    public static AnimatedFactoryV2Impl b;

    public static final void a(sn0 sn0Var) {
        if (sn0Var.e()) {
            ((View) sn0Var.getValue()).setVisibility(8);
        }
    }

    public static final i48 b(hn hnVar, in inVar, j48 j48Var) {
        return new i48(inVar, j48Var.p(), hnVar);
    }
}
