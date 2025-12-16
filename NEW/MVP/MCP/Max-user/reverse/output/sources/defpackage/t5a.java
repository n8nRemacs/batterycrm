package defpackage;

/* loaded from: classes2.dex */
public final class t5a extends rj0 {
    public final long c;

    public t5a(long j, pzf pzfVar, long j2) {
        super(j, pzfVar);
        this.c = j2;
    }

    @Override // defpackage.rj0, defpackage.sj0
    public final String toString() {
        return utb.l(new StringBuilder("MsgSendError{chatId="), this.c, '}');
    }
}
