package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class mr4 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mr4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a4h
    public final void run() {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                break;
            case 1:
                ((rz5) this.b).flush();
                break;
            case 2:
                ggg gggVar = ((p3g) this.b).d;
                gggVar.getClass();
                gggVar.c0();
                ah4.a();
                break;
            case 3:
                ((ggg) this.b).m();
                break;
            default:
                ((j3) this.b).f();
                break;
        }
    }
}
