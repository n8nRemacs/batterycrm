package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class fb2 implements zy7 {
    public static final fb2 a = new fb2();
    public static final j9c b = new j9c("kotlin.Char", h9c.d);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.e(((Character) obj).charValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Character.valueOf(lh4Var.c());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
