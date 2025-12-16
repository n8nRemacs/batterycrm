package defpackage;

/* loaded from: classes2.dex */
public final class ti2 extends sj0 {
    public final long b;

    public ti2(long j) {
        this.b = j;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return a9h.e("ChatLastReactionUpdatedEvent{chatId=", this.b, "'lastReactionMessageId=0', lastReaction=null}", super.toString());
    }
}
