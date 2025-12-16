package defpackage;

import android.app.Application;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class f00 {
    public static final /* synthetic */ yy7[] f;
    public final zz a;
    public final Application b;
    public final ContextScope c;
    public final t9f d = c7j.c();
    public final tcf e = ucf.a(null);

    static {
        z8a z8aVar = new z8a(f00.class, "updateAttachJob", "getUpdateAttachJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        f = new yy7[]{z8aVar};
    }

    public f00(lzf lzfVar, zz zzVar, Application application) {
        this.a = zzVar;
        this.b = application;
        this.c = d7j.a(((q2b) lzfVar).a());
    }

    public final hbd a(long j, xz xzVar) {
        return gw0.C(new d00(new d53(this.e, 12), j, 4), this.c, yve.a, xzVar);
    }

    public final xz b(u8d u8dVar) {
        boolean z = u8dVar instanceof q8d;
        Application application = this.b;
        if (z) {
            q8d q8dVar = (q8d) u8dVar;
            float f2 = q8dVar.c;
            long j = q8dVar.b;
            Long l = q8dVar.f;
            Long l2 = q8dVar.e;
            return new tz(q8dVar.a, f2, j > 0 ? new r5g(u45.k(l6g.u((l2 == null || l == null || l2.longValue() != 0) ? q8dVar.d : (long) ((f2 / 100) * l.longValue()), false, application), "/", l6g.t(j, l6g.m(j), true, application))) : new n5g(l7b.C));
        }
        if (u8dVar instanceof t8d) {
            t8d t8dVar = (t8d) u8dVar;
            float f3 = t8dVar.c;
            long j2 = t8dVar.b;
            return new wz(t8dVar.a, f3, new r5g(u45.k(l6g.u((long) ((f3 / 100) * j2), false, application), "/", l6g.t(j2, l6g.m(j2), true, application))));
        }
        if (u8dVar instanceof r8d) {
            r8d r8dVar = (r8d) u8dVar;
            return new uz(r8dVar.a, new r5g(l6g.u(r8dVar.b, true, application)));
        }
        if (!(u8dVar instanceof s8d)) {
            throw new NoWhenBranchMatchedException();
        }
        s8d s8dVar = (s8d) u8dVar;
        return new vz(s8dVar.a, new r5g(l6g.u(s8dVar.b, true, application)));
    }
}
