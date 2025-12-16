package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ f6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [i3, t39] */
    @Override // java.lang.Runnable
    public final void run() {
        pd8 pd8Var;
        FrgLocalVideo frgLocalVideo;
        iaa iaaVar;
        int i = this.a;
        ActLocalMedias actLocalMedias = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = actLocalMedias.S0;
                if (actLocalMedias.h1 != null) {
                    ((t1b) ((qm3) actLocalMedias.J0.b)).i().k(actLocalMedias.h1);
                }
                if (actLocalMedias.i1 != null) {
                    ((t1b) ((qm3) actLocalMedias.J0.b)).i().k(actLocalMedias.i1);
                }
                if (actLocalMedias.W0 != null && arrayList.size() != 0 && (pd8Var = (pd8) arrayList.get(actLocalMedias.T0)) != null) {
                    FrgLocalMedia frgLocalMediaF = actLocalMedias.W0.F(pd8Var.b);
                    if ((frgLocalMediaF instanceof FrgLocalVideo) && (iaaVar = (frgLocalVideo = (FrgLocalVideo) frgLocalMediaF).D1) != null) {
                        xd8 xd8Var = frgLocalVideo.B1;
                        fl5 fl5Var = xd8Var.b;
                        xd8Var.g = iaaVar;
                        if (xd8Var.f != null) {
                            f2h f2hVar = fl5Var.Y;
                            int i2 = f2hVar == null ? 0 : fl5Var.t0;
                            int i3 = f2hVar != null ? fl5Var.u0 : 0;
                            int i4 = fl5Var.v0;
                            ?? r0 = xd8Var.e;
                            if (r0 != 0) {
                                r0.K(i2, i3, i4);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                actLocalMedias.startPostponedEnterTransition();
                break;
            case 2:
                int i5 = ActLocalMedias.p1;
                actLocalMedias.c0(false);
                break;
            case 3:
                int i6 = ActLocalMedias.p1;
                actLocalMedias.getWindow().getDecorView().invalidate();
                break;
            case 4:
                int i7 = ActLocalMedias.p1;
                View decorView = actLocalMedias.getWindow().getDecorView();
                decorView.setOnSystemUiVisibilityChangeListener(actLocalMedias);
                decorView.setSystemUiVisibility(actLocalMedias.f().c ? 3846 : 3862);
                break;
            case 5:
                MediaBarPreviewLayout mediaBarPreviewLayout = actLocalMedias.c1;
                WeakHashMap weakHashMap = hfh.a;
                teh.c(mediaBarPreviewLayout);
                break;
            default:
                View view = actLocalMedias.b1;
                WeakHashMap weakHashMap2 = hfh.a;
                teh.c(view);
                break;
        }
    }
}
