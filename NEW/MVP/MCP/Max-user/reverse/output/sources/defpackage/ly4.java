package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class ly4 {
    public final ConversationVideoTrackParticipantKey a;
    public final int b;
    public final int c;

    public ly4(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, int i, int i2) {
        this.a = conversationVideoTrackParticipantKey;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly4)) {
            return false;
        }
        ly4 ly4Var = (ly4) obj;
        return fni.a(this.a, ly4Var.a) && this.b == ly4Var.b && this.c == ly4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayLayout(track=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return ho7.j(sb, this.c, ")");
    }
}
