package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class fhf implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ fhf(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        StickersScreen stickersScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StickersScreen.u0;
                ghf ghfVar = stickersScreen.a;
                hs hsVar = stickersScreen.b;
                yy7 yy7Var = StickersScreen.u0[0];
                long jLongValue = ((Number) hsVar.a(stickersScreen)).longValue();
                oif oifVar = oif.a;
                Context context = (Context) oifVar.getAccessor().c(12);
                lzf lzfVar = (lzf) oifVar.getAccessor().c(8);
                bwf bwfVarD = oifVar.getAccessor().d(231);
                bwf bwfVarD2 = oifVar.getAccessor().d(236);
                bwf bwfVarD3 = oifVar.getAccessor().d(240);
                bwf bwfVarD4 = oifVar.getAccessor().d(241);
                bwf bwfVarD5 = oifVar.getAccessor().d(239);
                oifVar.getAccessor().getClass();
                return new hkf(ghfVar, jLongValue, context, lzfVar, bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5);
            case 1:
                yy7[] yy7VarArr2 = StickersScreen.u0;
                return new ugf(stickersScreen.getContext());
            default:
                yy7[] yy7VarArr3 = StickersScreen.u0;
                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                layoutParams.leftMargin = iD;
                layoutParams.rightMargin = iD;
                layoutParams.topMargin = iD;
                layoutParams.bottomMargin = iD;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(jza.c);
                oneMeButton.setMode(iza.b);
                oneMeButton.setAppearance(gza.c);
                oneMeButton.setText(vdb.n);
                f8j.d(oneMeButton, 300L, new pcc(17, stickersScreen));
                return oneMeButton;
        }
    }
}
