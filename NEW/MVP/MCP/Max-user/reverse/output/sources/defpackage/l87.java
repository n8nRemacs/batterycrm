package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l87 extends k2g {
    public final /* synthetic */ m87 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l87(String str, m87 m87Var, int i, long j) {
        super(str, true);
        this.e = m87Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.k2g
    public final long a() throws IOException {
        m87 m87Var = this.e;
        try {
            m87Var.G0.Q(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            m87Var.c(2, 2, e);
            return -1L;
        }
    }
}
