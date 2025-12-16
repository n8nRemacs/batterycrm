package defpackage;

import java.util.Map;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class mx7 implements zy7 {
    public static final mx7 a = new mx7();
    public static final lx7 b = lx7.b;

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        ioi.a(bVar);
        new t88(rmf.a, vw7.a).a(bVar, (kx7) obj);
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ioi.b(lh4Var);
        return new kx7((Map) new t88(rmf.a, vw7.a).i(lh4Var));
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
