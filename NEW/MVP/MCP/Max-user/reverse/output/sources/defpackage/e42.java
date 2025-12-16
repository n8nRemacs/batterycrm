package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e42 extends re0 {
    public final /* synthetic */ c5i c;
    public final /* synthetic */ UUID d;

    public e42(c5i c5iVar, UUID uuid) {
        this.c = c5iVar;
        this.d = uuid;
    }

    @Override // defpackage.re0
    public final void c() {
        c5i c5iVar = this.c;
        WorkDatabase workDatabase = c5iVar.c;
        workDatabase.c();
        try {
            re0.b(c5iVar, this.d.toString());
            workDatabase.q();
            workDatabase.k();
            v0e.a(c5iVar.b, c5iVar.c, c5iVar.e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
