package defpackage;

/* loaded from: classes2.dex */
public class rj0 extends sj0 {
    public final pzf b;

    public rj0(pzf pzfVar) {
        this(Long.MIN_VALUE, pzfVar);
    }

    @Override // defpackage.sj0
    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return utb.l(sb, this.a, '}');
    }

    public rj0(long j, pzf pzfVar) {
        super(j);
        this.b = pzfVar;
    }
}
