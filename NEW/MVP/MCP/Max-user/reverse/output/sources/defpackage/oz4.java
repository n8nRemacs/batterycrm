package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class oz4 implements zy7 {
    public static final oz4 a = new oz4();
    public static final j9c b = new j9c("kotlin.Double", h9c.e);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.f(((Number) obj).doubleValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Double.valueOf(lh4Var.C());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
