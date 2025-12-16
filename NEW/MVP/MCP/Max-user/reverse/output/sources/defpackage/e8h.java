package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e8h extends dtf implements sm6 {
    public final /* synthetic */ q8h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8h(q8h q8hVar, Continuation continuation) {
        super(2, continuation);
        this.o = q8hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e8h e8hVar = (e8h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e8hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e8h(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        q8h q8hVar = this.o;
        kue kueVar = q8hVar.k;
        File fileK = ((iz5) ((qx5) q8hVar.b.getValue())).k();
        kueVar.getClass();
        File file = new File(fileK, "placeholder_videomsg.jpeg");
        String strH = file.exists() ? tfi.h(file.getAbsolutePath()) : null;
        tcf tcfVar = q8hVar.q;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, f8h.a((f8h) value, null, null, strH, 3)));
        return qqg.a;
    }
}
