package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class cjc extends ljc {
    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        if (equals(zic.a)) {
            return t98Var instanceof zic;
        }
        if (this instanceof ajc) {
            return t98Var instanceof ajc;
        }
        if (this instanceof bjc) {
            return (t98Var instanceof bjc) && ((bjc) this).a.a == ((bjc) t98Var).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        if (equals(zic.a)) {
            return t98Var instanceof zic;
        }
        if (this instanceof ajc) {
            return t98Var instanceof ajc;
        }
        if (!(this instanceof bjc)) {
            throw new NoWhenBranchMatchedException();
        }
        if (t98Var instanceof bjc) {
            return ((bjc) this).a.equals(((bjc) t98Var).a);
        }
        return false;
    }
}
