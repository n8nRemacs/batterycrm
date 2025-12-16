package defpackage;

import org.webrtc.SoftwareVideoDecoderFactory;

/* loaded from: classes2.dex */
public final class hai extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hai(lqa lqaVar, int i) {
        super(0);
        this.a = i;
        this.b = lqaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                lqa lqaVar = this.b;
                try {
                    return new jqa(lqaVar.a, new iqa(0));
                } catch (Throwable th) {
                    return new kqa(lqaVar.b, new IllegalStateException("Can't create HardwareVideoDecoder", th));
                }
            default:
                try {
                    return new SoftwareVideoDecoderFactory();
                } catch (Throwable th2) {
                    return new kqa(this.b.b, new IllegalStateException("Can't create SoftwareVideoDecoder", th2));
                }
        }
    }
}
