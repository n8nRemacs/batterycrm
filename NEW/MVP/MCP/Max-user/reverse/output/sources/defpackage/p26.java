package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class p26 implements zy7 {
    public static final p26 a = new p26();
    public static final j9c b = new j9c("kotlin.Float", h9c.f);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.h(((Number) obj).floatValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Float.valueOf(lh4Var.B());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
