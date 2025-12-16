package defpackage;

import android.view.View;
import java.util.ArrayList;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedFileDrawable b;

    public /* synthetic */ cf(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.a = i;
        this.b = animatedFileDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                AnimatedFileDrawable animatedFileDrawable = this.b;
                if (!animatedFileDrawable.W0) {
                    animatedFileDrawable.start();
                }
                animatedFileDrawable.invalidateInternal();
                break;
            case 1:
                AnimatedFileDrawable animatedFileDrawable2 = this.b;
                ArrayList arrayList = animatedFileDrawable2.k1;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) arrayList.get(i)).invalidate();
                    }
                }
                if ((arrayList.isEmpty() || animatedFileDrawable2.H0) && (view = animatedFileDrawable2.j1) != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                cq0 cq0Var = this.b.p1;
                break;
        }
    }
}
