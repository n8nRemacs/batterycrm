package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class uo7 implements zy7 {
    public static final uo7 a = new uo7();
    public static final j9c b = new j9c("kotlin.Int", h9c.g);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.k(((Number) obj).intValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Integer.valueOf(lh4Var.k());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
