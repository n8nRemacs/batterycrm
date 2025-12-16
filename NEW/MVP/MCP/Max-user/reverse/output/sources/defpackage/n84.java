package defpackage;

import android.os.Looper;
import java.util.Set;

/* loaded from: classes.dex */
public final class n84 extends lq7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n84(String[] strArr, Object obj, int i) {
        super(strArr);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.lq7
    public final void a(Set set) {
        switch (this.b) {
            case 0:
                ((pv0) this.c).g(qqg.a);
                break;
            case 1:
                fs fsVarC = fs.c();
                hsd hsdVar = ((isd) this.c).u;
                fsVarC.b.getClass();
                if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                    fsVarC.d(hsdVar);
                    break;
                } else {
                    hsdVar.run();
                    break;
                }
            default:
                ((ira) this.c).d(yfi.a);
                break;
        }
    }
}
