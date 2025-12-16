package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class h87 extends k2g {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h87(String str, Object obj, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.k2g
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                m87 m87Var = (m87) ((vu2) this.h).c;
                try {
                    m87Var.G0.y(this.f, this.g, true);
                    break;
                } catch (IOException e) {
                    m87Var.c(2, 2, e);
                    return -1L;
                }
            default:
                m87 m87Var2 = (m87) this.h;
                try {
                    m87Var2.G0.P(this.f, this.g);
                    break;
                } catch (IOException e2) {
                    m87Var2.c(2, 2, e2);
                    return -1L;
                }
        }
        return -1L;
    }
}
