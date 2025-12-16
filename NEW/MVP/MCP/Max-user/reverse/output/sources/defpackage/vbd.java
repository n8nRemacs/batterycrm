package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class vbd extends k2g {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ xbd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbd(String str, xbd xbdVar) {
        super(str, true);
        this.f = xbdVar;
    }

    @Override // defpackage.k2g
    public final long a() {
        switch (this.e) {
            case 0:
                xbd xbdVar = this.f;
                try {
                    if (xbdVar.g()) {
                    }
                } catch (IOException e) {
                    xbdVar.c(e);
                    break;
                }
                break;
            default:
                this.f.b.d();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbd(xbd xbdVar) {
        super(ho7.l(new StringBuilder(), xbdVar.g, " writer"), true);
        this.f = xbdVar;
    }
}
