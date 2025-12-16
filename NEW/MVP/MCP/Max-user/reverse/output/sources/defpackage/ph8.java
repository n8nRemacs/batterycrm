package defpackage;

/* loaded from: classes2.dex */
public final class ph8 extends sj0 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final n8a o;

    public ph8(long j, boolean z, boolean z2, boolean z3, n8a n8aVar) {
        super(j);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.o = n8aVar;
    }

    @Override // defpackage.sj0
    public final String toString() {
        int i = this.o.d;
        StringBuilder sbJ = xc0.j(this.a, "LoginEvent(requestId=", ", isFirstLogin=", this.b);
        hf3.f(", hasNewMessages=", ", videoChatHistory=", sbJ, this.c, this.d);
        sbJ.append(", chats=");
        sbJ.append(i);
        sbJ.append(")");
        return sbJ.toString();
    }
}
