package ru.ok.messages.analytics;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.alf;
import defpackage.dd;
import defpackage.dsd;
import defpackage.ho7;
import defpackage.ie4;
import defpackage.jq;
import defpackage.k18;
import defpackage.la8;
import defpackage.lrd;
import defpackage.lv4;
import defpackage.m03;
import defpackage.msb;
import defpackage.nn8;
import defpackage.o98;
import defpackage.psb;
import defpackage.tl6;
import defpackage.u45;
import defpackage.ur3;
import defpackage.ve3;
import defpackage.vma;
import defpackage.vw6;
import defpackage.wqi;
import defpackage.xp7;
import defpackage.yid;
import java.util.Locale;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/messages/analytics/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ldd;", "analytics", "Ljq;", "appNotifications", "Lur3;", "connectionInfo", "Llv4;", "deviceInfo", "Lalf;", "storeServicesInfo", "Lmsb;", "permissionStats", "Lk18;", "Lie4;", "dataManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ldd;Ljq;Lur3;Llv4;Lalf;Lmsb;Lk18;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyAnalyticsWorker extends Worker {
    public static final yid s0 = new yid("\\s+");
    public final alf X;
    public final msb Y;
    public final k18 Z;
    public final dd b;
    public final jq c;
    public final ur3 d;
    public final lv4 o;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, dd ddVar, jq jqVar, ur3 ur3Var, lv4 lv4Var, alf alfVar, msb msbVar, k18 k18Var) {
        super(context, workerParameters);
        this.b = ddVar;
        this.c = jqVar;
        this.d = ur3Var;
        this.o = lv4Var;
        this.X = alfVar;
        this.Y = msbVar;
        this.Z = k18Var;
    }

    @Override // androidx.work.Worker
    public final la8 a() {
        wqi.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + getId() + " started", new Object[0]);
        msb msbVar = this.Y;
        msbVar.getClass();
        nn8 nn8Var = new nn8();
        o98 o98VarD = ve3.d();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            nn8 nn8Var2 = new nn8();
            nn8Var2.put("pType", "push");
            nn8Var2.put("pStatus", msb.b(msbVar.d));
            o98VarD.add(nn8Var2.b());
        }
        nn8 nn8Var3 = new nn8();
        nn8Var3.put("pType", "contacts");
        nn8Var3.put("pStatus", msb.b(msbVar.e));
        o98VarD.add(nn8Var3.b());
        nn8 nn8Var4 = new nn8();
        nn8Var4.put("pType", "fsi");
        tl6 tl6Var = msbVar.k;
        if (tl6Var != null) {
            nn8Var4.put("pStatus", msb.b(tl6Var));
        }
        o98VarD.add(nn8Var4.b());
        nn8 nn8Var5 = new nn8();
        nn8Var5.put("pType", "gallery");
        psb psbVar = msbVar.f;
        nn8Var5.put("pStatus", i < 34 ? msb.b(psbVar) : psbVar.l() ? "allowed" : msbVar.g.l() ? "partial" : "denied");
        o98VarD.add(nn8Var5.b());
        nn8 nn8Var6 = new nn8();
        nn8Var6.put("pType", "camera");
        nn8Var6.put("pStatus", msb.b(msbVar.h));
        o98VarD.add(nn8Var6.b());
        nn8 nn8Var7 = new nn8();
        nn8Var7.put("pType", "microphone");
        nn8Var7.put("pStatus", msb.b(msbVar.i));
        o98VarD.add(nn8Var7.b());
        nn8 nn8Var8 = new nn8();
        nn8Var8.put("pType", "geo");
        nn8Var8.put("pStatus", msb.b(msbVar.j));
        o98VarD.add(nn8Var8.b());
        nn8Var.put("permissions", ve3.a(o98VarD));
        msbVar.c("permission_status", nn8Var.b());
        String str = vma.a(this.c.a().i(false).b) ? "1" : "0";
        dd ddVar = this.b;
        ddVar.f("ACTION_ARE_NOTIFICATIONS_ENABLED", str);
        m03 m03VarC = ((ie4) this.Z.getValue()).b.c();
        m03VarC.getClass();
        dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM chats");
        lrd lrdVar = m03VarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            long j = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
            cursorN.close();
            dsdVarC.y();
            String str2 = this.d.a() ? "1" : "0";
            String strValueOf = String.valueOf(j);
            if (!ddVar.a().e()) {
                xp7 xp7Var = new xp7();
                xp7Var.c = "ACTION";
                xp7Var.d = "ACTION_IS_BACKGROUND_DATA_ENABLED";
                xp7Var.b(str2, SdkMetricStatEvent.VALUE_KEY);
                xp7Var.b(strValueOf, "param1");
                ddVar.h(xp7Var.d());
            }
            lv4 lv4Var = this.o;
            Context context = lv4Var.a;
            if (lv4Var.d == null) {
                lv4Var.d = (PowerManager) context.getSystemService("power");
            }
            boolean zIsIgnoringBatteryOptimizations = lv4Var.d.isIgnoringBatteryOptimizations(context.getPackageName());
            ho7.q("isIgnoringBatteryOptimizations: ", "lv4", zIsIgnoringBatteryOptimizations);
            ddVar.f("ACTION_IS_IGNORING_BATTERY_OPTIMIZATIONS", zIsIgnoringBatteryOptimizations ? "1" : "0");
            vw6 vw6Var = (vw6) this.X;
            ddVar.f("ARE_SERVICES_AVAILABLE", s0.b(u45.k(vw6Var.f, "-", vw6Var.a() ? "1" : "0").toLowerCase(Locale.ENGLISH), "_"));
            wqi.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + getId() + " finished", new Object[0]);
            return la8.b();
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }
}
