package defpackage;

/* loaded from: classes2.dex */
public final class xd2 extends sj0 {
    public final /* synthetic */ int b = 1;
    public final long c;

    public xd2(long j) {
        this.c = j;
    }

    @Override // defpackage.sj0
    public final String toString() {
        switch (this.b) {
            case 0:
                return "ChatComplainEvent{chatId=" + this.c + "} " + super.toString();
            default:
                return utb.l(new StringBuilder("ReadMarkEvent{chatId="), this.c, '}');
        }
    }

    public xd2(long j, long j2) {
        super(j);
        this.c = j2;
    }
}
