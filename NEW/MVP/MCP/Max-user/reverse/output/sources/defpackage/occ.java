package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class occ implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb6 b;

    public /* synthetic */ occ(fb6 fb6Var, int i) {
        this.a = i;
        this.b = fb6Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) this.b.X).A0().b.a();
                break;
            case 1:
                u82 u82VarA0 = ((ProfileChangeLinkScreen) this.b.X).A0();
                svi.e(u82VarA0.a, null, null, new s82(u82VarA0, null), 3);
                break;
            default:
                ((ProfileChangeLinkScreen) this.b.X).A0().b.e();
                break;
        }
        return qqg.a;
    }
}
