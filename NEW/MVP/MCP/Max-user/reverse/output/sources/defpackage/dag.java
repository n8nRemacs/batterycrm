package defpackage;

import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;

/* loaded from: classes2.dex */
public final /* synthetic */ class dag implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yag b;
    public final /* synthetic */ fua c;

    public /* synthetic */ dag(yag yagVar, fua fuaVar, int i) {
        this.a = i;
        this.b = yagVar;
        this.c = fuaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yag yagVar = this.b;
                SSLEngine sSLEngine = yagVar.a;
                ByteBuffer byteBufferE = yagVar.i.e();
                fua fuaVar = this.c;
                return sSLEngine.unwrap(byteBufferE, (ByteBuffer[]) fuaVar.d, 0, fuaVar.b);
            default:
                yag yagVar2 = this.b;
                SSLEngine sSLEngine2 = yagVar2.a;
                fua fuaVar2 = this.c;
                return sSLEngine2.wrap((ByteBuffer[]) fuaVar2.d, 0, fuaVar2.b, yagVar2.j.e());
        }
    }
}
