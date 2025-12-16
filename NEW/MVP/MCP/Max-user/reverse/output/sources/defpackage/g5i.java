package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class g5i {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final j0e b;
    public final age c;
    public final bwf e;
    public volatile py4 g;
    public volatile boolean h;
    public final xra j;
    public final nm0 d = nm0.t(Boolean.TRUE);
    public final Set f = gke.h("ru.ok.tamtam.", "ru.ok.messages.");
    public final Object i = ipi.b(1, new kvf(28, this));
    public volatile int k = 999;

    public g5i(Context context, j0e j0eVar, j0e j0eVar2, bwf bwfVar, age ageVar) {
        this.a = context;
        this.b = j0eVar2;
        this.c = ageVar;
        this.e = bwfVar;
        this.j = new xra(new ora(new vk3(3, new ns5(1, this)).p(j0eVar).l(j0eVar).g(q85.A0), new ulc(13, this), 5));
        d();
    }

    public static xn3 e(g5i g5iVar, String str, int i, nrb nrbVar, int i2) {
        int i3 = 1;
        char c = 1;
        char c2 = 1;
        boolean z = false;
        boolean z2 = (i2 & 16) == 0;
        if (g5iVar.k < g5iVar.f()) {
            wqi.c("g5i", "enqueueUniquePeriodicWork %s", str);
            g5iVar.k++;
            g5iVar.h().b(str, i, nrbVar);
            return new xn3(z, i3);
        }
        wqi.o("g5i", null, "enqueueUniquePeriodicWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        a6i a6iVar = new a6i(str, i == 2 ? uk5.b : uk5.a, nrbVar);
        g5iVar.a(a6iVar, z2);
        z4i z4iVarH = g5iVar.h();
        l5c l5cVar = (l5c) g5iVar.c;
        l5cVar.getClass();
        int iM = (int) l5cVar.m(PmsKey.f163wmbacklogworkerbackoffdelaysec, 10);
        if (iM < 1) {
            iM = 1;
        }
        lui.b(z4iVarH, Integer.valueOf(iM), a6iVar).c();
        return new xn3((boolean) (c2 == true ? 1 : 0), (int) (c == true ? 1 : 0));
    }

    public final void a(a6i a6iVar, boolean z) {
        if (z || fni.a(Looper.getMainLooper(), Looper.myLooper())) {
            this.b.b(new n1h(this, 15, a6iVar));
        } else {
            try {
                g().insert(a6iVar);
            } catch (Throwable th) {
                wqi.g("g5i", th, "fail to add item %s", a6iVar.b);
            }
        }
    }

    public final q48 b(String str, uk5 uk5Var, ogb ogbVar) {
        if (this.k < f()) {
            wqi.c("g5i", "beginUniqueWork %s", str);
            this.k++;
            z4i z4iVarH = h();
            z4iVarH.getClass();
            List listSingletonList = Collections.singletonList(ogbVar);
            c5i c5iVar = (c5i) z4iVarH;
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
            }
            return new q48(false, new p4i(c5iVar, str, uk5Var, listSingletonList, 0));
        }
        wqi.o("g5i", null, "beginUniqueWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        a6i a6iVar = new a6i(str, uk5Var, ogbVar);
        a(a6iVar, false);
        z4i z4iVarH2 = h();
        l5c l5cVar = (l5c) this.c;
        l5cVar.getClass();
        int iM = (int) l5cVar.m(PmsKey.f163wmbacklogworkerbackoffdelaysec, 10);
        if (iM < 1) {
            iM = 1;
        }
        return new q48(true, lui.b(z4iVarH2, Integer.valueOf(iM), a6iVar));
    }

    public final void c(String str) {
        wqi.c("g5i", "cancelUniqueWork %s", str);
        c5i c5iVar = (c5i) h();
        c5iVar.getClass();
        c5iVar.d.c(new f42(c5iVar, str, true));
    }

    public final void d() {
        wqi.c("g5i", "enableWorkManager", new Object[0]);
        this.d.f(Boolean.TRUE);
        if (this.h) {
            return;
        }
        xra xraVar = this.j;
        hfd hfdVar = new hfd(13, this);
        kk4 kk4Var = kk4.D0;
        xraVar.getClass();
        xraVar.k(new qu1(hfdVar, 2, kk4Var));
    }

    public final int f() {
        age ageVar = this.c;
        l5c l5cVar = (l5c) ageVar;
        l5cVar.getClass();
        int iM = (int) l5cVar.m(PmsKey.f166wmworkerslimit, 16);
        if (iM < 1) {
            iM = 1;
        }
        l5c l5cVar2 = (l5c) ageVar;
        l5cVar2.getClass();
        int iM2 = (int) l5cVar2.m(PmsKey.f167wmworkersoffset, 2);
        if (iM2 < 0) {
            iM2 = 0;
        }
        int i = iM - iM2;
        if (i < 1) {
            return 1;
        }
        return i;
    }

    public final WorkersQueueDao g() {
        return (WorkersQueueDao) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final z4i h() {
        return (z4i) this.i.getValue();
    }

    public final void i(z4i z4iVar) {
        py4 py4Var = this.g;
        if (py4Var != null) {
            py4Var.dispose();
        }
        String strN = ue3.N(this.f, " OR ", "(", ")", new u7g(10), 24);
        prf prfVar = ((c5i) z4iVar).c.d;
        Integer numValueOf = null;
        if (prfVar == null) {
            prfVar = null;
        }
        Cursor cursorK0 = prfVar.getReadableDatabase().k0("SELECT COUNT(*) FROM workspec WHERE " + strN + " AND state=0 AND schedule_requested_at<>-1");
        try {
            cursorK0.moveToFirst();
            if (!cursorK0.isNull(0)) {
                numValueOf = Integer.valueOf(cursorK0.getInt(0));
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            cursorK0.close();
            this.k = iIntValue;
            wqi.c("g5i", "scheduleWorkersCountChecking: workersCount = %d", Integer.valueOf(this.k));
            j0e j0eVar = this.b;
            n1h n1hVar = new n1h(this, 14, z4iVar);
            l5c l5cVar = (l5c) this.c;
            l5cVar.getClass();
            int iM = (int) l5cVar.m(PmsKey.f165wmcheckworkerscountintervalsec, 10);
            if (iM < 1) {
                iM = 1;
            }
            this.g = j0eVar.c(n1hVar, iM, TimeUnit.SECONDS);
        } finally {
        }
    }
}
