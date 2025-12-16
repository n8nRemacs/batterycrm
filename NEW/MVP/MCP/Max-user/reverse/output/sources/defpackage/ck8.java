package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ck8 implements zy7 {
    public static final ck8 a = new ck8();
    public static final j9c b = new j9c("kotlin.Long", h9c.h);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.l(((Number) obj).longValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Long.valueOf(lh4Var.t());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
