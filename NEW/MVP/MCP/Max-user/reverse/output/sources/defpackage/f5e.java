package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class f5e extends c4 {
    public final l5c h;
    public final ConcurrentHashMap i;

    public f5e(Context context, bx5 bx5Var, l5c l5cVar) {
        super(context, "features_prefs", bx5Var);
        this.h = l5cVar;
        this.i = new ConcurrentHashMap();
        l5cVar.n.add(new yfe() { // from class: e5e
            @Override // defpackage.yfe
            public final void a() {
                f5e f5eVar = this.d;
                f5eVar.i.clear();
                f5eVar.e.h(qqg.a);
            }
        });
    }

    public final boolean j(PmsKey pmsKey, boolean z) {
        Object objB;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (m(pmsKey)) {
            objB = kaj.b(this.g, pmsKey.name(), boolValueOf, vid.a(Boolean.class));
        } else {
            l5c l5cVar = this.h;
            boolean zContains = l5cVar.h.g.contains(pmsKey.name());
            c4 c4Var = l5cVar;
            if (zContains) {
                c4Var = l5cVar.h;
            }
            objB = kaj.b(c4Var.g, pmsKey.name(), boolValueOf, vid.a(Boolean.class));
        }
        return ((Boolean) objB).booleanValue();
    }

    public final long k(PmsKey pmsKey, long j) {
        Object objB;
        Long lValueOf = Long.valueOf(j);
        if (m(pmsKey)) {
            objB = kaj.b(this.g, pmsKey.name(), lValueOf, vid.a(Long.class));
        } else {
            l5c l5cVar = this.h;
            boolean zContains = l5cVar.h.g.contains(pmsKey.name());
            c4 c4Var = l5cVar;
            if (zContains) {
                c4Var = l5cVar.h;
            }
            objB = kaj.b(c4Var.g, pmsKey.name(), lValueOf, vid.a(Long.class));
        }
        return ((Number) objB).longValue();
    }

    public final String l(PmsKey pmsKey, String str) {
        Object objB;
        if (m(pmsKey)) {
            objB = kaj.b(this.g, pmsKey.name(), str, vid.a(String.class));
        } else {
            l5c l5cVar = this.h;
            boolean zContains = l5cVar.h.g.contains(pmsKey.name());
            c4 c4Var = l5cVar;
            if (zContains) {
                c4Var = l5cVar.h;
            }
            objB = kaj.b(c4Var.g, pmsKey.name(), str, vid.a(String.class));
        }
        return (String) objB;
    }

    public final boolean m(PmsKey pmsKey) {
        return this.g.contains(pmsKey.name());
    }
}
