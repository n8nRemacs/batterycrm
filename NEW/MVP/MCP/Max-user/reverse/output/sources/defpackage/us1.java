package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class us1 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vs1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(vs1 vs1Var, int i) {
        super(12, rs1.b);
        this.c = i;
        this.d = vs1Var;
        switch (i) {
            case 1:
                super(12, ss1.d);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        owe background;
        owe background2;
        owe background3;
        owe background4;
        switch (this.c) {
            case 0:
                if (fni.a(obj, obj2)) {
                    return;
                }
                int iOrdinal = ((rs1) obj2).ordinal();
                etd etdVar = etd.b;
                vs1 vs1Var = this.d;
                if (iOrdinal == 0) {
                    vs1Var.getNegativeButtonView().setMode(etd.c);
                    vs1Var.getPositiveButtonSecondaryView().setMode(etdVar);
                    vs1Var.getPositiveButtonNeutralView().setMode(etdVar);
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jtd negativeButtonView = vs1Var.getNegativeButtonView();
                    etd etdVar2 = etd.a;
                    negativeButtonView.setMode(etdVar2);
                    vs1Var.getPositiveButtonSecondaryView().setMode(etdVar2);
                    vs1Var.getPositiveButtonNeutralView().setMode(etdVar);
                    return;
                }
            default:
                v1a v1aVar = a93.s0;
                if (fni.a(obj, obj2)) {
                    return;
                }
                ss1 ss1Var = (ss1) obj2;
                ss1 ss1Var2 = (ss1) obj;
                int iOrdinal2 = ss1Var.ordinal();
                vs1 vs1Var2 = this.d;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    if (vs1Var2.getBackground() == null) {
                        vs1Var2.setBackground(vs1Var2.getAnimatedBackground());
                    }
                    ss1 ss1Var3 = ss1.b;
                    ss1 ss1Var4 = ss1.a;
                    if (ss1Var2 == ss1Var3 && ss1Var == ss1Var4 && (background2 = vs1Var2.getBackground()) != null) {
                        background2.setAlpha(128);
                    }
                    owe background5 = vs1Var2.getBackground();
                    if (background5 != null) {
                        background5.b.c(ss1Var == ss1Var4 ? kwe.c : kwe.b);
                    }
                    if (!vs1Var2.isAttachedToWindow() || (background = vs1Var2.getBackground()) == null || background.isRunning()) {
                        return;
                    }
                    owe background6 = vs1Var2.getBackground();
                    if (background6 != null) {
                        background6.onThemeChanged(v1aVar.B(vs1Var2).c);
                    }
                    owe background7 = vs1Var2.getBackground();
                    if (background7 != null) {
                        background7.start();
                        return;
                    }
                    return;
                }
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (vs1Var2.isAttachedToWindow() && (background4 = vs1Var2.getBackground()) != null) {
                        background4.stop();
                    }
                    vs1Var2.setBackground(null);
                    return;
                }
                if (vs1Var2.getBackground() == null) {
                    vs1Var2.setBackground(vs1Var2.getAnimatedBackground());
                }
                owe background8 = vs1Var2.getBackground();
                if (background8 != null) {
                    background8.b.c(kwe.d);
                }
                if (!vs1Var2.isAttachedToWindow() || (background3 = vs1Var2.getBackground()) == null || background3.isRunning()) {
                    return;
                }
                owe background9 = vs1Var2.getBackground();
                if (background9 != null) {
                    background9.onThemeChanged(v1aVar.B(vs1Var2).c);
                }
                owe background10 = vs1Var2.getBackground();
                if (background10 != null) {
                    background10.start();
                    return;
                }
                return;
        }
    }
}
