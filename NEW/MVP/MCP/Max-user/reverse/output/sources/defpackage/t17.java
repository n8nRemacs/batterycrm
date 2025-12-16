package defpackage;

import java.util.Collections;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class t17 implements iv4 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ContextScope e;
    public x9f f;
    public final hbd g;

    public t17(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var3;
        this.c = k18Var2;
        this.d = k18Var4;
        long jIncrementAndGet = pu4.b.incrementAndGet();
        this.e = d7j.a(((q2b) ((lzf) k18Var3.getValue())).a());
        this.g = new hbd(ucf.a(Collections.singletonList(new yg4(jIncrementAndGet, new n5g(j3d.oneme_settings_dump_heap), yud.c, null, null, 24))));
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.g;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        x9f x9fVar = this.f;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.f = svi.e(this.e, ((q2b) ((lzf) this.b.getValue())).b(), null, new s17(this, null), 2);
        } else {
            ccb ccbVar = (ccb) this.d.getValue();
            ccbVar.h("Дамп памяти уже происходит, нужно немного подождать");
            ccbVar.i();
        }
    }
}
