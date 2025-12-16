package defpackage;

import kotlin.uuid.Uuid;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class gyg implements zy7 {
    public static final gyg a = new gyg();
    public static final j9c b = new j9c("kotlin.uuid.Uuid", h9c.j);

    public static Uuid e(lh4 lh4Var) {
        return Uuid.Companion.parse(lh4Var.q());
    }

    public static void f(b bVar, Uuid uuid) {
        bVar.r(uuid.toString());
    }

    @Override // defpackage.zy7
    public final /* bridge */ /* synthetic */ void a(b bVar, Object obj) {
        f(bVar, (Uuid) obj);
    }

    @Override // defpackage.zy7
    public final /* bridge */ /* synthetic */ Object b(lh4 lh4Var) {
        return e(lh4Var);
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
