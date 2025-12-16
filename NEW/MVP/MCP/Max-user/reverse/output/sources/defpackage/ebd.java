package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface ebd extends ao3 {
    @Override // defpackage.ao3
    default void c(i00 i00Var) {
        getConfig().c(i00Var);
    }

    @Override // defpackage.ao3
    default Object d(s90 s90Var, Object obj) {
        return getConfig().d(s90Var, obj);
    }

    @Override // defpackage.ao3
    default Set e() {
        return getConfig().e();
    }

    @Override // defpackage.ao3
    default Object f(s90 s90Var) {
        return getConfig().f(s90Var);
    }

    @Override // defpackage.ao3
    default Set g(s90 s90Var) {
        return getConfig().g(s90Var);
    }

    ao3 getConfig();

    @Override // defpackage.ao3
    default Object h(s90 s90Var, zn3 zn3Var) {
        return getConfig().h(s90Var, zn3Var);
    }

    @Override // defpackage.ao3
    default boolean i(s90 s90Var) {
        return getConfig().i(s90Var);
    }

    @Override // defpackage.ao3
    default zn3 j(s90 s90Var) {
        return getConfig().j(s90Var);
    }
}
