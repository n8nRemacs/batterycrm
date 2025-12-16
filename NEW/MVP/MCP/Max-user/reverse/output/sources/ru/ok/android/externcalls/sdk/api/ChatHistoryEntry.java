package ru.ok.android.externcalls.sdk.api;

import defpackage.az1;
import defpackage.sze;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* loaded from: classes2.dex */
public class ChatHistoryEntry extends sze {
    public final ConversationParticipant sender;

    public ChatHistoryEntry(String str, boolean z, ConversationParticipant conversationParticipant) {
        super(str, z);
        this.sender = conversationParticipant;
    }

    @Override // defpackage.sze
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.sender.equals(((ChatHistoryEntry) obj).sender);
        }
        return false;
    }

    @Override // defpackage.sze
    public int hashCode() {
        return this.sender.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEntry{sender=");
        sb.append(this.sender);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', direct=");
        return az1.k(sb, this.direct, "}");
    }
}
