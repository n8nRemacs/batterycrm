package defpackage;

import java.util.Collections;
import one.me.devmenu.tools.TestCrash;

/* loaded from: classes.dex */
public final class e31 implements iv4 {
    public final /* synthetic */ int a;
    public final Object b;

    public e31(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ucf.a(Collections.singletonList(new yg4(pu4.b.incrementAndGet(), new r5g("Test crash"), ivd.z, new r5g("Тестовый креш для отправки в tracer"), null, 16)));
                break;
            case 2:
                this.b = new hbd(ucf.a(hd5.a));
                break;
            default:
                this.b = ucf.a(Collections.singletonList(new yg4(pu4.b.incrementAndGet(), new r5g("125.1.0.73.1"), fxc.ic_statusbar_call_24, new r5g("Версия SDK Звонков"), null, 16)));
                break;
        }
    }

    private final void e(yg4 yg4Var) {
    }

    private final void f(yg4 yg4Var) {
    }

    @Override // defpackage.iv4
    public final mcf b() {
        switch (this.a) {
            case 0:
                return (tcf) this.b;
            case 1:
                return (tcf) this.b;
            default:
                return (hbd) this.b;
        }
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                throw new TestCrash();
            default:
                return;
        }
    }
}
