package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class er0 implements zy7 {
    public static final er0 a = new er0();
    public static final j9c b = new j9c("kotlin.Boolean", h9c.b);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.b(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Boolean.valueOf(lh4Var.b());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
