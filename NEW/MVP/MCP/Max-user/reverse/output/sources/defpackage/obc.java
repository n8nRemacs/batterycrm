package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ProfileAvatarWidget;

/* loaded from: classes2.dex */
public final class obc extends yb4 {
    public List v0;

    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        cbc cbcVar = (cbc) ue3.J(i, this.v0);
        if (cbcVar == null) {
            return;
        }
        ytdVar.S(new bud(new ProfileAvatarWidget(cbcVar), null, null, null, false, -1));
    }

    @Override // defpackage.phd
    public final int j() {
        return this.v0.size();
    }

    @Override // defpackage.yb4, defpackage.phd
    public final long k(int i) {
        cbc cbcVar = (cbc) ue3.J(i, this.v0);
        return (cbcVar != null ? Long.valueOf(cbcVar.a) : null) != null ? r3.hashCode() : 0;
    }
}
