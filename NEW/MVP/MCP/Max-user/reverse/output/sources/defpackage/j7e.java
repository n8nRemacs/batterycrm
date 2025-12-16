package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j7e implements k7e {
    public final String[] a;
    public final ve2 b;
    public final o7e c;

    public j7e(String[] strArr, ve2 ve2Var, o7e o7eVar) {
        this.a = strArr;
        this.b = ve2Var;
        this.c = o7eVar;
    }

    @Override // defpackage.k7e
    public final List a(String str) {
        o7e o7eVar = this.c;
        pb2 pb2Var = (pb2) this.b.T().getValue();
        hd5 hd5Var = hd5.a;
        if (pb2Var != null) {
            try {
                if (o7eVar.g(pb2Var, str)) {
                    return Collections.singletonList(o7eVar.a(pb2Var, str));
                }
                for (String str2 : this.a) {
                    if (o7eVar.i(str2, str)) {
                        return Collections.singletonList(o7eVar.a(pb2Var, str2));
                    }
                }
            } catch (Throwable th) {
                wqi.p(j7e.class.getName(), "fail to search saved messages chat", th);
                return hd5Var;
            }
        }
        return hd5Var;
    }
}
