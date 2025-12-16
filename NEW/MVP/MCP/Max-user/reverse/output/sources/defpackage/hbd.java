package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class hbd implements mcf, o42, pn6 {
    public final /* synthetic */ mcf a;

    public hbd(f9a f9aVar) {
        this.a = f9aVar;
    }

    @Override // defpackage.fve
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        return this.a.d(z26Var, continuation);
    }

    @Override // defpackage.pn6
    public final x26 e(x74 x74Var, int i, int i2) {
        Symbol symbol = ucf.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? kve.e(this, x74Var, i, i2) : this;
    }

    @Override // defpackage.mcf
    public final Object getValue() {
        return this.a.getValue();
    }
}
