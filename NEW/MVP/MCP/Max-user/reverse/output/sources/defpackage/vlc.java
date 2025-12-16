package defpackage;

import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class vlc implements sm6 {
    public final /* synthetic */ ProfileScreen a;

    public vlc(ProfileScreen profileScreen) {
        this.a = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((yx1) this.a.B0.getValue()).f = 1;
        ((yx1) this.a.B0.getValue()).d = (rx1) obj2;
        ((yx1) this.a.B0.getValue()).i(tx1.PROFILE, zBooleanValue);
        return qqg.a;
    }
}
