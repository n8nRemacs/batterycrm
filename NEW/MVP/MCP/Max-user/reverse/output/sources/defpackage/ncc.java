package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ncc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb6 b;

    public /* synthetic */ ncc(fb6 fb6Var, int i) {
        this.a = i;
        this.b = fb6Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) this.b.X).A0().b.l(((Integer) obj).intValue());
                break;
            default:
                ((ProfileChangeLinkScreen) this.b.X).A0().b.k((String) obj);
                break;
        }
        return qqg.a;
    }
}
