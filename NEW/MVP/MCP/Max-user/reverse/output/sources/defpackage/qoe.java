package defpackage;

import android.content.res.Resources;

/* loaded from: classes2.dex */
public final class qoe extends i3 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ roe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoe(tne tneVar, roe roeVar) {
        super(12, tneVar);
        this.d = roeVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) throws Resources.NotFoundException {
        switch (this.c) {
            case 0:
                ioe ioeVar = (ioe) obj2;
                if (!fni.a((ioe) obj, ioeVar)) {
                    s5g title = ioeVar.getTitle();
                    roe roeVar = this.d;
                    roeVar.setTitle(title);
                    roeVar.setStartIcon(ioeVar.e());
                    roeVar.setDescription(ioeVar.a());
                    roeVar.setCounter(ioeVar.b());
                    s5g s5gVarC = ioeVar.c();
                    roeVar.setUpperText(s5gVarC != null ? s5gVarC.b(roeVar.getContext()) : null);
                    roeVar.setEndView(ioeVar.d());
                    ioeVar.getItemId();
                    roeVar.setType(roeVar.getModelItem().getType());
                    roeVar.requestLayout();
                    roeVar.invalidate();
                    roeVar.onThemeChanged(a93.s0.y(roeVar));
                    break;
                }
                break;
            default:
                if (((noe) obj) != ((noe) obj2)) {
                    roe roeVar2 = this.d;
                    roeVar2.onThemeChanged(roeVar2.getCurrentTheme());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoe(roe roeVar) {
        super(12, noe.a);
        this.d = roeVar;
    }
}
