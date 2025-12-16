package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class pj6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj6 b;

    public /* synthetic */ pj6(qj6 qj6Var, int i) {
        this.a = i;
        this.b = qj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj6 qj6Var = this.b;
                qj6Var.w0 = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(qj6Var);
                qj6Var.X = vpxEncoderWrapper;
                break;
            case 1:
                this.b.a();
                break;
            default:
                qj6 qj6Var2 = this.b;
                qj6Var2.a();
                qj6Var2.Y = null;
                qj6Var2.Z = null;
                break;
        }
    }
}
