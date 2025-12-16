package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class flf implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ glf b;

    public /* synthetic */ flf(glf glfVar, int i) {
        this.a = i;
        this.b = glfVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                glf.Z(this.b, (atc) obj);
                break;
            default:
                glf glfVar = this.b;
                atc atcVar = (atc) obj;
                acd acdVar = glfVar.X;
                if (acdVar.e < 0 || acdVar.c != acdVar.e) {
                    glfVar.a.b.k(atcVar, new flf(glfVar, 1), false);
                    break;
                }
                break;
        }
    }
}
