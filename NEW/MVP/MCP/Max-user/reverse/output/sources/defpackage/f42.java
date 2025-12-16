package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f42 extends re0 {
    public final /* synthetic */ c5i c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean o;

    public f42(c5i c5iVar, String str, boolean z) {
        this.c = c5iVar;
        this.d = str;
        this.o = z;
    }

    @Override // defpackage.re0
    public final void c() {
        c5i c5iVar = this.c;
        WorkDatabase workDatabase = c5iVar.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.x().o(this.d).iterator();
            while (it.hasNext()) {
                re0.b(c5iVar, (String) it.next());
            }
            workDatabase.q();
            workDatabase.k();
            if (this.o) {
                v0e.a(c5iVar.b, c5iVar.c, c5iVar.e);
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
