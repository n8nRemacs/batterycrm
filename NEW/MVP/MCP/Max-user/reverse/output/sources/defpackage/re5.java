package defpackage;

import android.database.Cursor;
import android.util.Range;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class re5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ re5(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sia siaVar;
        switch (this.a) {
            case 0:
                bf5 bf5Var = (bf5) this.d;
                long j = this.b;
                long j2 = this.c;
                String str = bf5Var.a;
                switch (az1.v(bf5Var.D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = bf5Var.D;
                        bf5Var.i(4);
                        Long l = (Long) bf5Var.t.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        if (j == -1) {
                            j = j2;
                        } else if (j < jLongValue) {
                            gri.i(str, "The expected stop time is less than the start time. Use current time as stop time.");
                            j = j2;
                        }
                        if (j < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        bf5Var.t = Range.create(l, Long.valueOf(j));
                        gri.a(str, "Stop on ".concat(k8j.c(j)));
                        if (i == 3 && bf5Var.w != null) {
                            bf5Var.j();
                            return;
                        } else {
                            bf5Var.v = true;
                            bf5Var.x = ayi.d().schedule(new ne5(bf5Var, 0), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        bf5Var.i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var.D)));
                }
            case 1:
                ij7 ij7Var = (ij7) this.d;
                long j3 = this.b;
                long j4 = this.c;
                StringBuilder sbL = az1.l(j3, "startTimer: chatId = ", ", sender = ");
                sbL.append(j4);
                wqi.c("ij7", sbL.toString(), new Object[0]);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map mapA = ij7Var.a(j3);
                if (mapA == null || (siaVar = (sia) mapA.get(Long.valueOf(j4))) == null) {
                    return;
                }
                long j5 = siaVar.a;
                StringBuilder sb = new StringBuilder("startTimer: now - userTime = ");
                long j6 = jCurrentTimeMillis - j5;
                sb.append(j6);
                wqi.c("ij7", sb.toString(), new Object[0]);
                if (j6 >= 6000) {
                    ij7Var.e(j3, j4);
                    return;
                }
                return;
            default:
                abd abdVar = (abd) this.d;
                long j7 = this.b;
                long j8 = this.c;
                u0g u0gVar = (u0g) ((o0g) abdVar.h.getValue());
                k18 k18Var = u0gVar.d;
                gsd gsdVar = ((ie4) ((a3g) k18Var.getValue()).a.get()).f;
                d3g d3gVarB = gsdVar.b();
                d3gVarB.getClass();
                dsd dsdVarC = dsd.c(1, "SELECT * FROM tasks WHERE type = ?");
                dsdVarC.k(1, 11);
                lrd lrdVar = d3gVarB.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "type");
                    int iC3 = s7j.c(cursorN, "status");
                    int iC4 = s7j.c(cursorN, "fails_count");
                    int iC5 = s7j.c(cursorN, "depends_request_id");
                    int iC6 = s7j.c(cursorN, "dependency_type");
                    int iC7 = s7j.c(cursorN, "data");
                    int iC8 = s7j.c(cursorN, "created_time");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (true) {
                        if (!cursorN.moveToNext()) {
                            cursorN.close();
                            dsdVarC.y();
                            List<r2g> listC = gsdVar.c(arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            for (r2g r2gVar : listC) {
                                tsb tsbVar = r2gVar.f;
                                long j9 = r2gVar.a;
                                if (tsbVar instanceof lj2) {
                                    lj2 lj2Var = (lj2) tsbVar;
                                    if (lj2Var.a != j7 && lj2Var.d == j8) {
                                        String str2 = u0g.z0;
                                        kvf kvfVar = new kvf(2, r2gVar);
                                        l6b l6bVar = wqi.a;
                                        if (l6bVar != null) {
                                            lg8 lg8Var = lg8.d;
                                            if (l6bVar.b(lg8Var)) {
                                                l6bVar.c(lg8Var, str2, (String) kvfVar.invoke(), null);
                                            }
                                        }
                                        u0gVar.c.add(Long.valueOf(j9));
                                        arrayList2.add(Long.valueOf(j9));
                                    }
                                }
                            }
                            ((a3g) k18Var.getValue()).e(arrayList2);
                            return;
                        }
                        arrayList.add(new s2g(cursorN.getLong(iC), slf.e(cursorN.getInt(iC2)), slf.c(cursorN.getInt(iC3)), cursorN.getInt(iC4), cursorN.getLong(iC5), cursorN.getInt(iC6), cursorN.isNull(iC7) ? null : cursorN.getBlob(iC7), cursorN.getLong(iC8)));
                    }
                } catch (Throwable th) {
                    cursorN.close();
                    dsdVarC.y();
                    throw th;
                }
                break;
        }
    }
}
