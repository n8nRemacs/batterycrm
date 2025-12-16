package defpackage;

import android.widget.FrameLayout;
import one.me.stickerssearch.StickersSearchScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class mhf implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSearchScreen b;

    public /* synthetic */ mhf(StickersSearchScreen stickersSearchScreen, int i) {
        this.a = i;
        this.b = stickersSearchScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        StickersSearchScreen stickersSearchScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StickersSearchScreen.t0;
                hs hsVar = stickersSearchScreen.a;
                yy7 yy7Var = StickersSearchScreen.t0[0];
                long jLongValue = ((Number) hsVar.a(stickersSearchScreen)).longValue();
                khf khfVar = khf.a;
                bwf bwfVarD = khfVar.getAccessor().d(232);
                fze fzeVar = new fze(khfVar.getAccessor().d(231), khfVar.getAccessor().d(475));
                bwf bwfVarD2 = khfVar.getAccessor().d(186);
                khfVar.getAccessor().getClass();
                return new whf(jLongValue, bwfVarD, fzeVar, bwfVarD2, (lzf) khfVar.getAccessor().c(8));
            case 1:
                yy7[] yy7VarArr2 = StickersSearchScreen.t0;
                m9b m9bVar = new m9b(stickersSearchScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                m9bVar.setLayoutParams(layoutParams);
                m9bVar.setAppearance(e9b.a);
                m9bVar.setSize(g9b.a);
                return m9bVar;
            default:
                yy7[] yy7VarArr3 = StickersSearchScreen.t0;
                x3b x3bVar = new x3b(stickersSearchScreen.getContext());
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.d));
                x3bVar.setSubtitle(new n5g(avd.c));
                return x3bVar;
        }
    }
}
