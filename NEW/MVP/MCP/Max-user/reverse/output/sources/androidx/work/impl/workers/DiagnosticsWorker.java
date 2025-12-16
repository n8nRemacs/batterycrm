package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.bu3;
import defpackage.c5i;
import defpackage.cei;
import defpackage.dsd;
import defpackage.eg0;
import defpackage.i5i;
import defpackage.la8;
import defpackage.r5i;
import defpackage.s5i;
import defpackage.s7j;
import defpackage.to8;
import defpackage.u5i;
import defpackage.ujb;
import defpackage.w4i;
import defpackage.xv4;
import defpackage.yd4;
import defpackage.ywf;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final la8 a() throws Throwable {
        dsd dsdVar;
        ywf ywfVar;
        i5i i5iVar;
        u5i u5iVar;
        WorkDatabase workDatabase = c5i.d(getApplicationContext()).c;
        s5i s5iVarX = workDatabase.x();
        i5i i5iVarV = workDatabase.v();
        u5i u5iVarY = workDatabase.y();
        ywf ywfVarU = workDatabase.u();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        s5iVarX.getClass();
        dsd dsdVarC = dsd.c(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        dsdVarC.k(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s5iVarX.a;
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "state");
            int iC3 = s7j.c(cursorN, "worker_class_name");
            int iC4 = s7j.c(cursorN, "input_merger_class_name");
            int iC5 = s7j.c(cursorN, "input");
            int iC6 = s7j.c(cursorN, "output");
            int iC7 = s7j.c(cursorN, "initial_delay");
            int iC8 = s7j.c(cursorN, "interval_duration");
            int iC9 = s7j.c(cursorN, "flex_duration");
            int iC10 = s7j.c(cursorN, "run_attempt_count");
            int iC11 = s7j.c(cursorN, "backoff_policy");
            dsdVar = dsdVarC;
            try {
                int iC12 = s7j.c(cursorN, "backoff_delay_duration");
                int iC13 = s7j.c(cursorN, "last_enqueue_time");
                int iC14 = s7j.c(cursorN, "minimum_retention_duration");
                int iC15 = s7j.c(cursorN, "schedule_requested_at");
                int iC16 = s7j.c(cursorN, "run_in_foreground");
                int iC17 = s7j.c(cursorN, "out_of_quota_policy");
                int iC18 = s7j.c(cursorN, "period_count");
                int iC19 = s7j.c(cursorN, "generation");
                int iC20 = s7j.c(cursorN, "required_network_type");
                int iC21 = s7j.c(cursorN, "requires_charging");
                int iC22 = s7j.c(cursorN, "requires_device_idle");
                int iC23 = s7j.c(cursorN, "requires_battery_not_low");
                int iC24 = s7j.c(cursorN, "requires_storage_not_low");
                int iC25 = s7j.c(cursorN, "trigger_content_update_delay");
                int iC26 = s7j.c(cursorN, "trigger_max_content_delay");
                int iC27 = s7j.c(cursorN, "content_uri_triggers");
                int i = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                    w4i w4iVarH = to8.h(cursorN.getInt(iC2));
                    String string2 = cursorN.isNull(iC3) ? null : cursorN.getString(iC3);
                    String string3 = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                    yd4 yd4VarA = yd4.a(cursorN.isNull(iC5) ? null : cursorN.getBlob(iC5));
                    yd4 yd4VarA2 = yd4.a(cursorN.isNull(iC6) ? null : cursorN.getBlob(iC6));
                    long j = cursorN.getLong(iC7);
                    long j2 = cursorN.getLong(iC8);
                    long j3 = cursorN.getLong(iC9);
                    int i2 = cursorN.getInt(iC10);
                    eg0 eg0VarE = to8.e(cursorN.getInt(iC11));
                    long j4 = cursorN.getLong(iC12);
                    long j5 = cursorN.getLong(iC13);
                    int i3 = i;
                    long j6 = cursorN.getLong(i3);
                    int i4 = iC13;
                    int i5 = iC15;
                    long j7 = cursorN.getLong(i5);
                    iC15 = i5;
                    int i6 = iC16;
                    boolean z = cursorN.getInt(i6) != 0;
                    iC16 = i6;
                    int i7 = iC17;
                    ujb ujbVarG = to8.g(cursorN.getInt(i7));
                    iC17 = i7;
                    int i8 = iC18;
                    int i9 = cursorN.getInt(i8);
                    iC18 = i8;
                    int i10 = iC19;
                    int i11 = cursorN.getInt(i10);
                    iC19 = i10;
                    int i12 = iC20;
                    int iF = to8.f(cursorN.getInt(i12));
                    iC20 = i12;
                    int i13 = iC21;
                    boolean z2 = cursorN.getInt(i13) != 0;
                    iC21 = i13;
                    int i14 = iC22;
                    boolean z3 = cursorN.getInt(i14) != 0;
                    iC22 = i14;
                    int i15 = iC23;
                    boolean z4 = cursorN.getInt(i15) != 0;
                    iC23 = i15;
                    int i16 = iC24;
                    boolean z5 = cursorN.getInt(i16) != 0;
                    iC24 = i16;
                    int i17 = iC25;
                    long j8 = cursorN.getLong(i17);
                    iC25 = i17;
                    int i18 = iC26;
                    long j9 = cursorN.getLong(i18);
                    iC26 = i18;
                    int i19 = iC27;
                    if (!cursorN.isNull(i19)) {
                        blob = cursorN.getBlob(i19);
                    }
                    iC27 = i19;
                    arrayList.add(new r5i(string, w4iVarH, string2, string3, yd4VarA, yd4VarA2, j, j2, j3, new bu3(iF, z2, z3, z4, z5, j8, j9, to8.b(blob)), i2, eg0VarE, j4, j5, j6, j7, z, ujbVarG, i9, i11));
                    iC13 = i4;
                    i = i3;
                }
                cursorN.close();
                dsdVar.y();
                ArrayList arrayListL = s5iVarX.l();
                ArrayList arrayListJ = s5iVarX.j();
                if (arrayList.isEmpty()) {
                    ywfVar = ywfVarU;
                    i5iVar = i5iVarV;
                    u5iVar = u5iVarY;
                } else {
                    cei ceiVarG = cei.g();
                    String str = xv4.a;
                    ceiVarG.i(str, "Recently completed work:\n\n");
                    ywfVar = ywfVarU;
                    i5iVar = i5iVarV;
                    u5iVar = u5iVarY;
                    cei.g().i(str, xv4.a(i5iVar, u5iVar, ywfVar, arrayList));
                }
                if (!arrayListL.isEmpty()) {
                    cei ceiVarG2 = cei.g();
                    String str2 = xv4.a;
                    ceiVarG2.i(str2, "Running work:\n\n");
                    cei.g().i(str2, xv4.a(i5iVar, u5iVar, ywfVar, arrayListL));
                }
                if (!arrayListJ.isEmpty()) {
                    cei ceiVarG3 = cei.g();
                    String str3 = xv4.a;
                    ceiVarG3.i(str3, "Enqueued work:\n\n");
                    cei.g().i(str3, xv4.a(i5iVar, u5iVar, ywfVar, arrayListJ));
                }
                return la8.b();
            } catch (Throwable th) {
                th = th;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dsdVar = dsdVarC;
        }
    }
}
