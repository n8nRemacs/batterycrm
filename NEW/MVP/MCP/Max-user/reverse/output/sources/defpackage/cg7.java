package defpackage;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class cg7 extends zr4 {
    public final /* synthetic */ int o = 0;
    public final Object p;

    public cg7(Surface surface, Size size, int i) {
        super(size, i);
        this.p = surface;
    }

    @Override // defpackage.zr4
    public final ha8 f() {
        switch (this.o) {
            case 0:
                return wsf.f((Surface) this.p);
            default:
                return ((msf) this.p).g;
        }
    }

    public cg7(Surface surface) {
        super(zr4.k, 0);
        this.p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg7(msf msfVar, Size size) {
        super(size, 34);
        this.p = msfVar;
    }
}
