package defpackage;

import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlc implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ nlc(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ProfileScreen profileScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ProfileScreen.C0;
                return new kj1(new bwf(new nlc(profileScreen, 1)), new s2i(profileScreen, 0));
            case 1:
                yy7[] yy7VarArr2 = ProfileScreen.C0;
                return profileScreen.getRouter();
            default:
                yy7[] yy7VarArr3 = ProfileScreen.C0;
                return profileScreen.getContext();
        }
    }
}
