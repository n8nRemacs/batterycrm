package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import com.my.tracker.core.o.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class ehg implements fu3, b9e, wqg, m7c, vvf, gu3, sk3, xld, uu1, c9h, wi6, tm6, lva, c1i, kf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ehg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vvf
    public Object a() {
        SQLiteDatabase sQLiteDatabaseL;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                gwd gwdVar = (gwd) ((eb3) obj);
                gwdVar.getClass();
                int i2 = ob3.e;
                fa6 fa6Var = new fa6();
                fa6Var.b = null;
                fa6Var.c = new ArrayList();
                fa6Var.d = null;
                fa6Var.a = "";
                HashMap map = new HashMap();
                sQLiteDatabaseL = gwdVar.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    ob3 ob3Var = (ob3) gwd.i0(sQLiteDatabaseL.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new nl(gwdVar, map, fa6Var, 26));
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return ob3Var;
                } finally {
                }
            case 6:
                gwd gwdVar2 = (gwd) ((ri5) obj);
                long time = gwdVar2.b.getTime() - gwdVar2.d.d;
                sQLiteDatabaseL = gwdVar2.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gwdVar2.Q(cursorRawQuery.getInt(0), jg8.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseL.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseL.setTransactionSuccessful();
                    sQLiteDatabaseL.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 7:
                gwd gwdVar3 = (gwd) ((awg) obj).i;
                sQLiteDatabaseL = gwdVar3.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    sQLiteDatabaseL.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseL.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gwdVar3.b.getTime()).execute();
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                y4i y4iVar = (y4i) obj;
                Iterator it = ((Iterable) ((gwd) y4iVar.b).y(new ycd(4))).iterator();
                while (it.hasNext()) {
                    y4iVar.c.a((ac0) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((khg) this.b).c((ExportException) obj);
                break;
            default:
                ((gwg) this.b).a((ttg) obj);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        pu5 pu5Var;
        pu5 pu5Var2;
        Object b4aVar;
        v10 v10Var = (v10) this.b;
        ru5 ru5Var = (ru5) obj;
        Object obj2 = null;
        if (ru5Var != null) {
            List<pu5> list = ru5Var.a;
            if (!list.isEmpty()) {
                u10 u10Var = v10Var.m;
                boolean z = u10Var != null && u10Var.d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pu5Var = null;
                        break;
                    }
                    pu5Var = (pu5) it.next();
                    if (pu5Var.a == 2) {
                        break;
                    }
                }
                if (pu5Var != null) {
                    b4aVar = new vd4(pu5Var.b, v10Var.l, v10Var.c, v10Var.a, v10Var.g, v10Var.o, z, v10Var.q, v10Var.r, v10Var.e, v10Var.f);
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            pu5Var2 = null;
                            break;
                        }
                        pu5Var2 = (pu5) it2.next();
                        if (pu5Var2.a == 1) {
                            break;
                        }
                    }
                    if (pu5Var2 != null) {
                        b4aVar = new n67(pu5Var2.b, v10Var.l, v10Var.c, v10Var.a, v10Var.g, v10Var.o, z, v10Var.q, v10Var.r, v10Var.e, v10Var.f);
                    } else {
                        ArrayList<pu5> arrayList = new ArrayList();
                        for (pu5 pu5Var3 : list) {
                            if (pu5Var3.a == 3) {
                                arrayList.add(pu5Var3);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            for (pu5 pu5Var4 : arrayList) {
                                try {
                                    arrayList2.add(new z3a(pu5Var4.c, pu5Var4.b, pu5Var4.d, pu5Var4.e));
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            b4aVar = new b4a(arrayList2, v10Var.l, v10Var.c, v10Var.a, v10Var.o, z, v10Var.q, v10Var.r);
                        }
                    }
                }
                obj2 = b4aVar;
            }
        }
        wqi.c("VideoRipper", "getVideoContent: processFetchResult for videoContent %s", obj2);
        return obj2;
    }

    @Override // defpackage.wi6
    public void b(String str, Bundle bundle) {
        n6 n6Var = (n6) this.b;
        rbh rbhVar = (rbh) bundle.getParcelable("VideoQualityPickerDialog:result:key");
        if (rbhVar == null || rbhVar.equals(pbh.a)) {
            return;
        }
        if (!(rbhVar instanceof qbh)) {
            throw new NoWhenBranchMatchedException();
        }
        n6Var.accept(((qbh) rbhVar).a);
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        ((Map) ((lwg) this.b).b).clear();
        jk3Var.b();
    }

    @Override // defpackage.kf7
    public void d(lf7 lf7Var) {
        x7i x7iVar = (x7i) this.b;
        x7iVar.getClass();
        try {
            jf7 jf7VarE = lf7Var.e();
            if (jf7VarE != null) {
                x7iVar.b.g(jf7VarE);
            }
        } catch (IllegalStateException e) {
            gri.b("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // defpackage.xld
    public void e(long j, umb umbVar) {
        uyi.b(j, umbVar, ((qae) this.b).c);
    }

    public void f(Display display) {
        m4h m4hVar = (m4h) this.b;
        m4hVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            m4hVar.i = refreshRate;
            m4hVar.j = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            m4hVar.i = -9223372036854775807L;
            m4hVar.j = -9223372036854775807L;
        }
    }

    @Override // defpackage.b9e
    public int g(int i) {
        switch (this.a) {
            case 2:
                fng fngVar = (fng) ((t98) ((TwoFASettingsScreen) this.b).d.C(i));
                int iF = fngVar.f();
                if (fngVar.g()) {
                    return iF;
                }
                return 0;
            case LangUtils.HASH_SEED /* 17 */:
                return ((xzh) ((t98) ((WebAppSettingsScreen) this.b).Y.C(i))).f();
            default:
                xzh xzhVar = (xzh) ((t98) ((WebAppsSettingScreen) this.b).d.C(i));
                if (xzhVar.f() != 0) {
                    return xzhVar.f();
                }
                return 0;
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        die dieVar = (die) this.b;
        ((g9a) ((w30) dieVar.b).g).a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(tu1Var.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        o1h o1hVar = new o1h(atomicBoolean, tu1Var, dieVar);
        tu1Var.a(new zcd(atomicBoolean, dieVar, o1hVar, 17), ayi.a());
        ((w30) dieVar.b).b(o1hVar);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(tu1Var.hashCode()));
    }

    @Override // defpackage.lva
    public void p(Task task) {
        switch (this.a) {
            case 16:
                vjh.b((Intent) this.b);
                break;
            case 20:
                ((l4i) this.b).b.d(null);
                break;
            case 21:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            default:
                u.b.a((u.c) this.b, task);
                break;
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        AtomicLong atomicLong = (AtomicLong) this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = atomicLong.get();
        long jNanoTime = System.nanoTime();
        if (j != 0 && Math.abs(jNanoTime - j) <= timeUnit.toNanos(500L) && !((ttg) obj).a()) {
            return false;
        }
        atomicLong.set(jNanoTime);
        return true;
    }

    public /* synthetic */ ehg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ ehg(AtomicLong atomicLong, o9g o9gVar) {
        this.a = 4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = atomicLong;
    }
}
