package defpackage;

import android.view.View;
import java.util.List;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final class k6 extends wgh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ k6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    private final void d(int i) {
    }

    private final void e(int i, float f, int i2) {
    }

    @Override // defpackage.wgh
    public void a(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.wgh
    public void b(int i, float f, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.wgh
    public final void c(int i) {
        int i2 = this.a;
        ActLocalMedias actLocalMedias = this.b;
        boolean zB = false;
        switch (i2) {
            case 0:
                if (actLocalMedias.W0 != null) {
                    pd8 pd8Var = (pd8) actLocalMedias.S0.get(actLocalMedias.T0);
                    if (pd8Var != null) {
                        FrgLocalMedia frgLocalMediaF = actLocalMedias.W0.F(pd8Var.b);
                        if (frgLocalMediaF instanceof FrgLocalVideo) {
                            FrgLocalVideo frgLocalVideo = (FrgLocalVideo) frgLocalMediaF;
                            View view = (View) frgLocalVideo.C1.c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            frgLocalVideo.H0();
                        }
                    }
                    pd8 pd8Var2 = (pd8) actLocalMedias.S0.get(i);
                    if (pd8Var2 != null) {
                        FrgLocalMedia frgLocalMediaF2 = actLocalMedias.W0.F(pd8Var2.b);
                        if (frgLocalMediaF2 instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) frgLocalMediaF2).G0();
                        }
                    }
                }
                actLocalMedias.T0 = i;
                actLocalMedias.b0(i);
                String str = null;
                if (actLocalMedias.S0.size() - i < 6) {
                    sd8 sd8VarQ = actLocalMedias.Q();
                    String str2 = actLocalMedias.U0;
                    if (str2 == null) {
                        sd8VarQ.getClass();
                    } else {
                        vo6 vo6Var = (vo6) sd8VarQ.g.get(str2);
                        if (vo6Var != null) {
                            zB = ((bj7) sd8VarQ.c).b(vo6Var);
                        }
                    }
                    if (zB) {
                        sd8 sd8VarQ2 = actLocalMedias.Q();
                        svi.e(sd8VarQ2.e, ((q2b) sd8VarQ2.d).a().plus(sd8VarQ2.b), null, new rd8(sd8VarQ2, actLocalMedias.U0, null), 2);
                    }
                }
                FrgLocalMedia frgLocalMediaO = actLocalMedias.O();
                if (frgLocalMediaO != null) {
                    if (frgLocalMediaO instanceof FrgLocalPhoto) {
                        str = "LOCAL_PHOTO";
                    } else if (frgLocalMediaO instanceof FrgLocalVideo) {
                        str = "LOCAL_VIDEO";
                    } else if (frgLocalMediaO instanceof FrgLocalGif) {
                        str = "LOCAL_GIF";
                    }
                    if (!l8g.c(str)) {
                        wqi.c("ru.ok.messages.media.mediabar.ActLocalMedias", "sendFragmentStats: " + str, new Object[0]);
                        ((t1b) ((qm3) actLocalMedias.J0.b)).a().e(str);
                    }
                }
                actLocalMedias.f1.L0((pd8) actLocalMedias.S0.get(actLocalMedias.T0));
                break;
            default:
                int i3 = ActLocalMedias.p1;
                List listC = actLocalMedias.Q().f.c();
                int iG = actLocalMedias.Q().f.g((pd8) actLocalMedias.S0.get(i)) - 1;
                if (iG == -1) {
                    for (int i4 = 0; i4 < listC.size(); i4++) {
                        ((fce) listC.get(i4)).e = false;
                    }
                    actLocalMedias.a0();
                    break;
                } else {
                    int i5 = 0;
                    while (i5 < listC.size()) {
                        ((fce) listC.get(i5)).e = iG == i5;
                        i5++;
                    }
                    actLocalMedias.a0();
                    actLocalMedias.c1.w(i);
                    break;
                }
        }
    }
}
