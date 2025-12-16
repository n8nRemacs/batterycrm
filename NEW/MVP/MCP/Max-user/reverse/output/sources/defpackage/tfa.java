package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class tfa implements hfa, en6 {
    public final /* synthetic */ oga a;

    public tfa(oga ogaVar) {
        this.a = ogaVar;
    }

    @Override // defpackage.hfa
    public final void a(zea zeaVar) {
        this.a.y(zeaVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hfa) && (obj instanceof en6)) {
            return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return new hn6(1, 0, oga.class, this.a, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
