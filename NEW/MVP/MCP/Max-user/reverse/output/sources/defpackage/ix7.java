package defpackage;

import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ix7 implements zy7 {
    public static final ix7 a = new ix7();
    public static final tee b = r9j.a("kotlinx.serialization.json.JsonNull", wee.c, new ree[0]);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        ioi.a(bVar);
        bVar.m();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ioi.b(lh4Var);
        if (lh4Var.v()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return hx7.INSTANCE;
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
