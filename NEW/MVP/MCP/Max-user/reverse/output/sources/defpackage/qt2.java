package defpackage;

/* loaded from: classes.dex */
public final class qt2 {
    public final pb2 a;
    public final eh9 b;
    public final eh9 c;
    public final eh9 d;
    public final ghh e;
    public final gr9 f;
    public final sy2 g;

    public qt2(pb2 pb2Var, eh9 eh9Var, eh9 eh9Var2, eh9 eh9Var3, ghh ghhVar, gr9 gr9Var, sy2 sy2Var) {
        this.a = pb2Var;
        this.b = eh9Var;
        this.c = eh9Var2;
        this.d = eh9Var3;
        this.e = ghhVar;
        this.f = gr9Var;
        this.g = sy2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt2)) {
            return false;
        }
        qt2 qt2Var = (qt2) obj;
        return fni.a(this.a, qt2Var.a) && fni.a(this.b, qt2Var.b) && fni.a(this.c, qt2Var.c) && fni.a(this.d, qt2Var.d) && this.e == qt2Var.e && fni.a(this.f, qt2Var.f) && fni.a(this.g, qt2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingFirstMessage=" + this.b + ", incomingSecondMessage=" + this.c + ", outgoingMessage=" + this.d + ", messageViewStatus=" + this.e + ", messageTextLayoutRepository=" + this.f + ", chatTheme=" + this.g + ")";
    }
}
