package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class pgf extends fg5 implements u6g {
    public boolean d;

    public pgf(Context context) {
        super(new EnhancedAnimatedVectorDrawable(context, cxc.sticker_typing));
    }

    @Override // defpackage.fg5
    public final void a() {
        if (this.d) {
            return;
        }
        start();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i = yebVar.getIcon().j;
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_0_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_1_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_2_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_3_G_D_0_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_0_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_1_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_2_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_1_G_D_0_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_0_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_1_P_0", i);
        z18.e(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_2_P_0", i);
    }

    @Override // defpackage.fg5, android.graphics.drawable.Animatable
    public final void start() {
        this.d = false;
        super.start();
    }

    @Override // defpackage.fg5, android.graphics.drawable.Animatable
    public final void stop() {
        this.d = true;
        super.stop();
    }
}
