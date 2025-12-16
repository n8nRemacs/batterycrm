package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class rgc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb6 b;

    public /* synthetic */ rgc(fb6 fb6Var, int i) {
        this.a = i;
        this.b = fb6Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) this.b.X).z0().b.m(1, str);
                break;
            case 1:
                ((ProfileEditScreen) this.b.X).z0().b.m(2, str);
                break;
            case 2:
                ((ProfileEditScreen) this.b.X).z0().b.m(131072, str);
                break;
            default:
                ((ProfileEditScreen) this.b.X).z0().b.m(4, str);
                break;
        }
        return qqg.a;
    }
}
