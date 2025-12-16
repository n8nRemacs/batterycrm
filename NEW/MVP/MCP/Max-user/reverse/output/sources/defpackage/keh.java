package defpackage;

import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class keh implements egb, en6 {
    public final /* synthetic */ VideoWebViewScreen a;

    public keh(VideoWebViewScreen videoWebViewScreen) {
        this.a = videoWebViewScreen;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof egb) && (obj instanceof en6)) {
            return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return new hn6(0, 0, VideoWebViewScreen.class, this.a, "onUserInteraction", "onUserInteraction()V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
