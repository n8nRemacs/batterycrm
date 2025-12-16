package defpackage;

import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class s3b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;
    public final /* synthetic */ pe7 c;
    public final /* synthetic */ Animatable d;

    public /* synthetic */ s3b(OneMeDraweeView oneMeDraweeView, String str, pe7 pe7Var, Animatable animatable, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
        this.c = pe7Var;
        this.d = animatable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pe7 pe7Var = this.c;
                Animatable animatable = this.d;
                OneMeDraweeView oneMeDraweeView = this.b;
                oneMeDraweeView.j(pe7Var, animatable);
                oneMeDraweeView.requestLayout();
                oneMeDraweeView.invalidate();
                break;
            default:
                pe7 pe7Var2 = this.c;
                Animatable animatable2 = this.d;
                OneMeDraweeView oneMeDraweeView2 = this.b;
                oneMeDraweeView2.j(pe7Var2, animatable2);
                oneMeDraweeView2.requestLayout();
                oneMeDraweeView2.invalidate();
                break;
        }
    }
}
