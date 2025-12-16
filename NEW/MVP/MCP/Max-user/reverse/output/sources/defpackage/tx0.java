package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class tx0 implements zy7 {
    public static final tx0 a = new tx0();
    public static final j9c b = new j9c("kotlin.Byte", h9c.c);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        bVar.d(((Number) obj).byteValue());
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        return Byte.valueOf(lh4Var.z());
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
