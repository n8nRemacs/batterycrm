package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class qza extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rza d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qza(rza rzaVar, int i) {
        super(12, (Object) null);
        this.c = i;
        this.d = rzaVar;
        switch (i) {
            case 1:
                super(12, oza.a);
                break;
            case 2:
                super(12, nza.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                yeb yebVarY = (yeb) obj2;
                if (fni.a((yeb) obj, yebVarY)) {
                    return;
                }
                rza rzaVar = this.d;
                if (yebVarY == null) {
                    yebVarY = a93.s0.y(rzaVar);
                }
                rzaVar.onThemeChanged(yebVarY);
                return;
            case 1:
                oza ozaVar = (oza) obj2;
                if (((oza) obj) != ozaVar) {
                    int i = pza.$EnumSwitchMapping$0[ozaVar.ordinal()];
                    rza rzaVar2 = this.d;
                    if (i == 1) {
                        if (rzaVar2.getTextView().getParent() != null) {
                            rzaVar2.removeView(rzaVar2.getTextView());
                            return;
                        }
                        return;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (rzaVar2.getTextView().getParent() == null) {
                            rzaVar2.addView(rzaVar2.getTextView());
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                nza nzaVar = (nza) obj2;
                if (((nza) obj) != nzaVar) {
                    rza rzaVar3 = this.d;
                    rzaVar3.c(rzaVar3, nzaVar);
                    return;
                }
                return;
        }
    }
}
