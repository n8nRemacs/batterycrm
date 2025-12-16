package defpackage;

/* loaded from: classes2.dex */
public final class pu1 extends sj0 {
    public final long b;
    public final String c;

    public pu1(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackAnswerEvent{chatId=");
        sb.append(this.b);
        sb.append("text=");
        return u45.l(sb, this.c, '}');
    }
}
