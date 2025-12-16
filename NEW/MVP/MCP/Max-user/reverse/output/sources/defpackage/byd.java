package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class byd implements mcf {
    public final /* synthetic */ tcf a;

    public byd(w63 w63Var) {
        this.a = (tcf) w63Var.q();
    }

    @Override // defpackage.fve
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) throws Throwable {
        this.a.d(z26Var, continuation);
        return g84.a;
    }

    @Override // defpackage.mcf
    public final Object getValue() {
        return (pb2) this.a.getValue();
    }
}
