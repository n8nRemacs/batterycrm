package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class sgc implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb6 b;

    public /* synthetic */ sgc(fb6 fb6Var, int i) {
        this.a = i;
        this.b = fb6Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) this.b.X).z0().b.a(64);
                break;
            case 1:
                ((ProfileEditScreen) this.b.X).z0().b.a(128);
                break;
            case 2:
                ((ProfileEditScreen) this.b.X).z0().b.a(256);
                break;
            default:
                ((ProfileEditScreen) this.b.X).z0().b.a(512);
                break;
        }
        return qqg.a;
    }
}
