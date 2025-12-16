package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i87 extends k2g {
    public final /* synthetic */ m87 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ qu0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i87(String str, m87 m87Var, int i, qu0 qu0Var, int i2, boolean z) {
        super(str, true);
        this.e = m87Var;
        this.f = i;
        this.g = qu0Var;
        this.h = i2;
    }

    @Override // defpackage.k2g
    public final long a() {
        try {
            tha thaVar = this.e.u0;
            qu0 qu0Var = this.g;
            int i = this.h;
            thaVar.getClass();
            qu0Var.skip(i);
            this.e.G0.P(this.f, 9);
            synchronized (this.e) {
                this.e.I0.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
