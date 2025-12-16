package defpackage;

/* loaded from: classes.dex */
public interface dgh {
    default yfh a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default yfh b(Class cls, d8a d8aVar) {
        return a(cls);
    }

    default yfh c(ca3 ca3Var, d8a d8aVar) {
        return b(ca3Var.a(), d8aVar);
    }
}
