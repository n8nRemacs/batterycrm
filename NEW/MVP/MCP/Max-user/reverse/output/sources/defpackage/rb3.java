package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import tech.kwik.flupke.webtransport.impl.BufferedStreamsLimitExceededException;

/* loaded from: classes3.dex */
public final /* synthetic */ class rb3 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb3 b;

    public /* synthetic */ rb3(tb3 tb3Var, int i) {
        this.a = i;
        this.b = tb3Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ca7 ca7Var = (ca7) obj;
                try {
                    this.b.a(epi.h(ca7Var.b()), ca7Var);
                    break;
                } catch (IOException unused) {
                    return;
                } catch (BufferedStreamsLimitExceededException unused2) {
                    ca7Var.d(966049156L);
                    return;
                }
            default:
                tb3 tb3Var = this.b;
                ca7 ca7Var2 = (ca7) obj;
                try {
                    InputStream inputStreamB = ca7Var2.b();
                    if (epi.h(inputStreamB) == 65) {
                        tb3Var.a(epi.h(inputStreamB), ca7Var2);
                        break;
                    }
                } catch (IOException unused3) {
                    return;
                } catch (BufferedStreamsLimitExceededException unused4) {
                    ca7Var2.d(966049156L);
                    ca7Var2.e(966049156L);
                }
                break;
        }
    }
}
