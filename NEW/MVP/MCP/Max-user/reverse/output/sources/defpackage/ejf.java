package defpackage;

import android.widget.FrameLayout;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ejf implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersShowcaseScreen b;

    public /* synthetic */ ejf(StickersShowcaseScreen stickersShowcaseScreen, int i) {
        this.a = i;
        this.b = stickersShowcaseScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StickersShowcaseScreen.u0;
                hs hsVar = stickersShowcaseScreen.a;
                yy7 yy7Var = StickersShowcaseScreen.u0[0];
                long jLongValue = ((Number) hsVar.a(stickersShowcaseScreen)).longValue();
                cjf cjfVar = cjf.a;
                fif fifVar = (fif) cjfVar.getAccessor().d(475).getValue();
                lzf lzfVar = (lzf) cjfVar.getAccessor().c(8);
                kif kifVar = new kif(cjfVar.getAccessor().d(239), cjfVar.getAccessor().d(232), (lzf) cjfVar.getAccessor().c(8));
                bwf bwfVarD = cjfVar.getAccessor().d(241);
                bwf bwfVarD2 = cjfVar.getAccessor().d(186);
                cjfVar.getAccessor().getClass();
                return new njf(jLongValue, fifVar, lzfVar, kifVar, bwfVarD, bwfVarD2);
            case 1:
                yy7[] yy7VarArr2 = StickersShowcaseScreen.u0;
                m9b m9bVar = new m9b(stickersShowcaseScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                m9bVar.setLayoutParams(layoutParams);
                m9bVar.setAppearance(e9b.a);
                m9bVar.setSize(h9b.a);
                return m9bVar;
            default:
                yy7[] yy7VarArr3 = StickersShowcaseScreen.u0;
                x3b x3bVar = new x3b(stickersShowcaseScreen.getContext());
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.d));
                x3bVar.setSubtitle(new n5g(avd.c));
                return x3bVar;
        }
    }
}
