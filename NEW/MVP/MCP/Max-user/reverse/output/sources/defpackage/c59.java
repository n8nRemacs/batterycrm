package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class c59 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ c59(View view, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        View view = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                d.o(view, i3 - ((int) ((i3 - i2) * f)));
                break;
            default:
                int i4 = i2 + ((int) ((i3 - i2) * f));
                boolean z = x59.d1;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i4;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
