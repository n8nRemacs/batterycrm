package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* loaded from: classes.dex */
public final class vch {
    public final boolean a;
    public final ConversationVideoTrackParticipantKey b;
    public final boolean c;

    public vch(boolean z, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z2) {
        this.a = z;
        this.b = conversationVideoTrackParticipantKey;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vch)) {
            return false;
        }
        vch vchVar = (vch) obj;
        return this.a == vchVar.a && fni.a(this.b, vchVar.b) && this.c == vchVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoState(isEnabled=");
        sb.append(this.a);
        sb.append(", track=");
        sb.append(this.b);
        sb.append(", isSelf=");
        return az1.k(sb, this.c, ")");
    }
}
