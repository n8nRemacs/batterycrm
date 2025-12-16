package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ywe implements zy7 {
    public static final ywe a = new ywe();
    public static final j9c b = new j9c("kotlin.Short", h9c.i);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.q(((Number) obj).shortValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Short.valueOf(lh4Var.A());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
