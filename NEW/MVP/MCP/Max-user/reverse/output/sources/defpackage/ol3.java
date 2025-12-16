package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface ol3 {
    default Object a(Class cls) {
        return f(fsc.a(cls));
    }

    default Set b(fsc fscVar) {
        return (Set) d(fscVar).get();
    }

    default rpc c(Class cls) {
        return e(fsc.a(cls));
    }

    rpc d(fsc fscVar);

    rpc e(fsc fscVar);

    default Object f(fsc fscVar) {
        rpc rpcVarE = e(fscVar);
        if (rpcVarE == null) {
            return null;
        }
        return rpcVarE.get();
    }
}
