package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m1j extends i3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1j(int i) {
        super(8);
        this.c = i;
    }

    @Override // defpackage.i3
    public final Object d0(Object obj) {
        switch (this.c) {
            case 0:
                o1a o1aVarC = o1a.c();
                return new b1j(o1aVarC.b(), (sve) o1aVarC.a(sve.class), new v0j(o1a.c().b(), (o0j) obj));
            case 1:
                o1a o1aVarC2 = o1a.c();
                Context contextB = o1a.c().b();
                ArrayList arrayList = new ArrayList();
                qof qofVar = new qof();
                dy0 dy0Var = dy0.e;
                mig.b(contextB);
                mig.a().c(dy0Var);
                dy0.d.contains(new gf5("json"));
                arrayList.add(qofVar);
                return new a8j(o1aVarC2.b(), (sve) o1aVarC2.a(sve.class));
            default:
                bcj bcjVar = (bcj) obj;
                o1a o1aVarC3 = o1a.c();
                return new fcj(o1aVarC3.b(), (sve) o1aVarC3.a(sve.class), new dcj(o1a.c().b(), bcjVar), bcjVar.a);
        }
    }
}
