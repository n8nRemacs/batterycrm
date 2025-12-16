package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s5i {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public s5i(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new cwg(workDatabase_Impl, 5);
        this.c = new am4(workDatabase_Impl, 9);
        this.d = new olh(workDatabase_Impl, 8);
        this.e = new olh(workDatabase_Impl, 9);
        this.f = new olh(workDatabase_Impl, 10);
        this.g = new olh(workDatabase_Impl, 11);
        this.h = new olh(workDatabase_Impl, 12);
        this.i = new olh(workDatabase_Impl, 13);
        this.j = new olh(workDatabase_Impl, 14);
        this.k = new olh(workDatabase_Impl, 4);
        this.l = new olh(workDatabase_Impl, 5);
        new olh(workDatabase_Impl, 6);
        new olh(workDatabase_Impl, 7);
    }

    public static long c(ArrayList arrayList, em6 em6Var) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l = (Long) em6Var.invoke((j9f) obj);
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (((Number) obj2).longValue() != -1) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = arrayList3.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.s5i r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.se9
            if (r0 == 0) goto L13
            r0 = r6
            se9 r0 = (defpackage.se9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            se9 r0 = new se9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.o
            s5i r1 = r0.d
            defpackage.g8j.b(r6)
            goto L67
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            s5i r5 = r0.d
            defpackage.g8j.b(r6)
            goto L50
        L3c:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.a
            l24 r6 = (defpackage.l24) r6
            r0.d = r5
            r0.Z = r3
            qv3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r4) goto L50
            goto L64
        L50:
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r5.h
            tcf r3 = (defpackage.tcf) r3
            r0.d = r5
            r0.o = r6
            r0.Z = r2
            r3.setValue(r1)
            qqg r1 = defpackage.qqg.a
            if (r1 != r4) goto L65
        L64:
            return r4
        L65:
            r1 = r5
            r5 = r6
        L67:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            wm7 r5 = new wm7
            r2 = 15
            r5.<init>(r2)
            oz5 r5 = defpackage.lee.h(r6, r5)
            java.lang.Object r6 = r1.e
            bwf r6 = (defpackage.bwf) r6
            java.lang.Object r6 = r6.getValue()
            myb r6 = (defpackage.myb) r6
            x74 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r1 = defpackage.d7j.a(r0)
            nb r2 = new nb
            r3 = 1
            r2.<init>(r1, r0, r6, r3)
            nhg r6 = new nhg
            r6.<init>(r5, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5i.d(s5i, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.s5i r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ue9
            if (r0 == 0) goto L13
            r0 = r6
            ue9 r0 = (defpackage.ue9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ue9 r0 = new ue9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.o
            s5i r1 = r0.d
            defpackage.g8j.b(r6)
            goto L70
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            s5i r5 = r0.d
            defpackage.g8j.b(r6)
            goto L59
        L3c:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.b
            w63 r6 = (defpackage.w63) r6
            r0.d = r5
            r0.Z = r3
            ve2 r6 = r6.i()
            uy0 r1 = new uy0
            r3 = 28
            r1.<init>(r3)
            java.util.ArrayList r6 = r6.I(r1)
            if (r6 != r4) goto L59
            goto L6d
        L59:
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r5.i
            tcf r3 = (defpackage.tcf) r3
            r0.d = r5
            r0.o = r6
            r0.Z = r2
            r3.setValue(r1)
            qqg r1 = defpackage.qqg.a
            if (r1 != r4) goto L6e
        L6d:
            return r4
        L6e:
            r1 = r5
            r5 = r6
        L70:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            wm7 r5 = new wm7
            r2 = 16
            r5.<init>(r2)
            oz5 r5 = defpackage.lee.g(r6, r5)
            x74 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.d7j.a(r6)
            nb r2 = new nb
            r3 = 2
            r2.<init>(r0, r6, r1, r3)
            nhg r6 = new nhg
            r6.<init>(r5, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5i.e(s5i, q44):java.lang.Object");
    }

    public static final ArrayList f(s5i s5iVar, List list, String str) {
        String strA;
        s5iVar.getClass();
        k18 k18Var = (k18) s5iVar.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ku3 ku3Var = (ku3) obj;
            if (dnf.r(String.valueOf(ku3Var.q()), str, false) || ((o7e) k18Var.getValue()).i(String.valueOf(ku3Var.e()), str) || ((strA = m6g.a(ku3Var.i())) != null && ((o7e) k18Var.getValue()).i(strA.toString(), str))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void h(l6j l6jVar) {
        if (l6jVar instanceof qtd) {
            ((qtd) l6jVar).getClass();
        } else if (l6jVar instanceof ic4) {
            ((ic4) l6jVar).getClass();
        }
    }

    public void a(us usVar) {
        rs rsVar = (rs) usVar.keySet();
        us usVar2 = rsVar.a;
        if (usVar2.isEmpty()) {
            return;
        }
        if (usVar.c > 999) {
            us usVar3 = new us(999);
            int i = usVar.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                usVar3.put((String) usVar.f(i2), (ArrayList) usVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    a(usVar3);
                    usVar3 = new us(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                a(usVar3);
                return;
            }
            return;
        }
        StringBuilder sbM = az1.m("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = usVar2.c;
        lc4.a(sbM, i4);
        sbM.append(")");
        dsd dsdVarC = dsd.c(i4, sbM.toString());
        Iterator it = rsVar.iterator();
        int i5 = 1;
        while (true) {
            qs qsVar = (qs) it;
            if (!qsVar.hasNext()) {
                break;
            }
            String str = (String) qsVar.next();
            if (str == null) {
                dsdVarC.S(i5);
            } else {
                dsdVarC.f(i5, str);
            }
            i5++;
        }
        Cursor cursorN = ((WorkDatabase_Impl) this.a).n(dsdVarC);
        try {
            int iB = s7j.b(cursorN, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorN.moveToNext()) {
                ArrayList arrayList = (ArrayList) usVar.get(cursorN.getString(iB));
                if (arrayList != null) {
                    arrayList.add(yd4.a(cursorN.isNull(0) ? null : cursorN.getBlob(0)));
                }
            }
        } finally {
            cursorN.close();
        }
    }

    public void b(us usVar) {
        rs rsVar = (rs) usVar.keySet();
        us usVar2 = rsVar.a;
        if (usVar2.isEmpty()) {
            return;
        }
        if (usVar.c > 999) {
            us usVar3 = new us(999);
            int i = usVar.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                usVar3.put((String) usVar.f(i2), (ArrayList) usVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    b(usVar3);
                    usVar3 = new us(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                b(usVar3);
                return;
            }
            return;
        }
        StringBuilder sbM = az1.m("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = usVar2.c;
        lc4.a(sbM, i4);
        sbM.append(")");
        dsd dsdVarC = dsd.c(i4, sbM.toString());
        Iterator it = rsVar.iterator();
        int i5 = 1;
        while (true) {
            qs qsVar = (qs) it;
            if (!qsVar.hasNext()) {
                break;
            }
            String str = (String) qsVar.next();
            if (str == null) {
                dsdVarC.S(i5);
            } else {
                dsdVarC.f(i5, str);
            }
            i5++;
        }
        Cursor cursorN = ((WorkDatabase_Impl) this.a).n(dsdVarC);
        try {
            int iB = s7j.b(cursorN, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorN.moveToNext()) {
                ArrayList arrayList = (ArrayList) usVar.get(cursorN.getString(iB));
                if (arrayList != null) {
                    arrayList.add(cursorN.isNull(0) ? null : cursorN.getString(0));
                }
            }
        } finally {
            cursorN.close();
        }
    }

    public xse g() {
        xse xseVar = new xse();
        xseVar.a = (l6j) this.a;
        xseVar.b = (l6j) this.b;
        xseVar.c = (l6j) this.c;
        xseVar.d = (l6j) this.d;
        xseVar.e = (t74) this.e;
        xseVar.f = (t74) this.f;
        xseVar.g = (t74) this.g;
        xseVar.h = (t74) this.h;
        xseVar.i = (q85) this.i;
        xseVar.j = (q85) this.j;
        xseVar.k = (q85) this.k;
        xseVar.l = (q85) this.l;
        return xseVar;
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.d;
        vk6 vk6VarA = olhVar.a();
        if (str == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    public ArrayList j() throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        dsdVarC.k(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iC12 = s7j.c(cursorN, "backoff_delay_duration");
            int iC13 = s7j.c(cursorN, "last_enqueue_time");
            dsdVar = dsdVarC;
            try {
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
                return arrayList;
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

    public ArrayList k(int i) throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        dsdVarC.k(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iC12 = s7j.c(cursorN, "backoff_delay_duration");
            int iC13 = s7j.c(cursorN, "last_enqueue_time");
            dsdVar = dsdVarC;
            try {
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
                int i2 = iC14;
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
                    int i3 = cursorN.getInt(iC10);
                    eg0 eg0VarE = to8.e(cursorN.getInt(iC11));
                    long j4 = cursorN.getLong(iC12);
                    long j5 = cursorN.getLong(iC13);
                    int i4 = i2;
                    long j6 = cursorN.getLong(i4);
                    int i5 = iC13;
                    int i6 = iC15;
                    long j7 = cursorN.getLong(i6);
                    iC15 = i6;
                    int i7 = iC16;
                    boolean z = cursorN.getInt(i7) != 0;
                    iC16 = i7;
                    int i8 = iC17;
                    ujb ujbVarG = to8.g(cursorN.getInt(i8));
                    iC17 = i8;
                    int i9 = iC18;
                    int i10 = cursorN.getInt(i9);
                    iC18 = i9;
                    int i11 = iC19;
                    int i12 = cursorN.getInt(i11);
                    iC19 = i11;
                    int i13 = iC20;
                    int iF = to8.f(cursorN.getInt(i13));
                    iC20 = i13;
                    int i14 = iC21;
                    boolean z2 = cursorN.getInt(i14) != 0;
                    iC21 = i14;
                    int i15 = iC22;
                    boolean z3 = cursorN.getInt(i15) != 0;
                    iC22 = i15;
                    int i16 = iC23;
                    boolean z4 = cursorN.getInt(i16) != 0;
                    iC23 = i16;
                    int i17 = iC24;
                    boolean z5 = cursorN.getInt(i17) != 0;
                    iC24 = i17;
                    int i18 = iC25;
                    long j8 = cursorN.getLong(i18);
                    iC25 = i18;
                    int i19 = iC26;
                    long j9 = cursorN.getLong(i19);
                    iC26 = i19;
                    int i20 = iC27;
                    if (!cursorN.isNull(i20)) {
                        blob = cursorN.getBlob(i20);
                    }
                    iC27 = i20;
                    arrayList.add(new r5i(string, w4iVarH, string2, string3, yd4VarA, yd4VarA2, j, j2, j3, new bu3(iF, z2, z3, z4, z5, j8, j9, to8.b(blob)), i3, eg0VarE, j4, j5, j6, j7, z, ujbVarG, i10, i12));
                    iC13 = i5;
                    i2 = i4;
                }
                cursorN.close();
                dsdVar.y();
                return arrayList;
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

    public ArrayList l() throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iC12 = s7j.c(cursorN, "backoff_delay_duration");
            int iC13 = s7j.c(cursorN, "last_enqueue_time");
            dsdVar = dsdVarC;
            try {
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
                return arrayList;
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

    public ArrayList m() {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            int iC12 = s7j.c(cursorN, "backoff_delay_duration");
            int iC13 = s7j.c(cursorN, "last_enqueue_time");
            dsdVar = dsdVarC;
            try {
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
                return arrayList;
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

    public w4i n(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            w4i w4iVarH = null;
            if (cursorN.moveToFirst()) {
                Integer numValueOf = cursorN.isNull(0) ? null : Integer.valueOf(cursorN.getInt(0));
                if (numValueOf != null) {
                    w4iVarH = to8.h(numValueOf.intValue());
                }
            }
            return w4iVarH;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public ArrayList o(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.isNull(0) ? null : cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public r5i p(String str) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int iC14;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            iC = s7j.c(cursorN, "id");
            iC2 = s7j.c(cursorN, "state");
            iC3 = s7j.c(cursorN, "worker_class_name");
            iC4 = s7j.c(cursorN, "input_merger_class_name");
            iC5 = s7j.c(cursorN, "input");
            iC6 = s7j.c(cursorN, "output");
            iC7 = s7j.c(cursorN, "initial_delay");
            iC8 = s7j.c(cursorN, "interval_duration");
            iC9 = s7j.c(cursorN, "flex_duration");
            iC10 = s7j.c(cursorN, "run_attempt_count");
            iC11 = s7j.c(cursorN, "backoff_policy");
            iC12 = s7j.c(cursorN, "backoff_delay_duration");
            iC13 = s7j.c(cursorN, "last_enqueue_time");
            iC14 = s7j.c(cursorN, "minimum_retention_duration");
            dsdVar = dsdVarC;
        } catch (Throwable th) {
            th = th;
            dsdVar = dsdVarC;
        }
        try {
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
            r5i r5iVar = null;
            byte[] blob = null;
            if (cursorN.moveToFirst()) {
                String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                w4i w4iVarH = to8.h(cursorN.getInt(iC2));
                String string2 = cursorN.isNull(iC3) ? null : cursorN.getString(iC3);
                String string3 = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                yd4 yd4VarA = yd4.a(cursorN.isNull(iC5) ? null : cursorN.getBlob(iC5));
                yd4 yd4VarA2 = yd4.a(cursorN.isNull(iC6) ? null : cursorN.getBlob(iC6));
                long j = cursorN.getLong(iC7);
                long j2 = cursorN.getLong(iC8);
                long j3 = cursorN.getLong(iC9);
                int i = cursorN.getInt(iC10);
                eg0 eg0VarE = to8.e(cursorN.getInt(iC11));
                long j4 = cursorN.getLong(iC12);
                long j5 = cursorN.getLong(iC13);
                long j6 = cursorN.getLong(iC14);
                long j7 = cursorN.getLong(iC15);
                boolean z = cursorN.getInt(iC16) != 0;
                ujb ujbVarG = to8.g(cursorN.getInt(iC17));
                int i2 = cursorN.getInt(iC18);
                int i3 = cursorN.getInt(iC19);
                int iF = to8.f(cursorN.getInt(iC20));
                boolean z2 = cursorN.getInt(iC21) != 0;
                boolean z3 = cursorN.getInt(iC22) != 0;
                boolean z4 = cursorN.getInt(iC23) != 0;
                boolean z5 = cursorN.getInt(iC24) != 0;
                long j8 = cursorN.getLong(iC25);
                long j9 = cursorN.getLong(iC26);
                if (!cursorN.isNull(iC27)) {
                    blob = cursorN.getBlob(iC27);
                }
                r5iVar = new r5i(string, w4iVarH, string2, string3, yd4VarA, yd4VarA2, j, j2, j3, new bu3(iF, z2, z3, z4, z5, j8, j9, to8.b(blob)), i, eg0VarE, j4, j5, j6, j7, z, ujbVarG, i2, i3);
            }
            cursorN.close();
            dsdVar.y();
            return r5iVar;
        } catch (Throwable th2) {
            th = th2;
            cursorN.close();
            dsdVar.y();
            throw th;
        }
    }

    public ArrayList q(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                String string = cursorN.isNull(0) ? null : cursorN.getString(0);
                w4i w4iVarH = to8.h(cursorN.getInt(1));
                p5i p5iVar = new p5i();
                p5iVar.a = string;
                p5iVar.b = w4iVarH;
                arrayList.add(p5iVar);
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public void r(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.k;
        vk6 vk6VarA = olhVar.a();
        vk6VarA.k(1, j);
        if (str == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    public void s() {
        ((kce) this.b).b = null;
        ((kce) this.c).b = null;
        ((kce) this.d).b = null;
        ((kce) this.e).b = null;
        ((kce) this.f).b = null;
        ((HashMap) this.g).clear();
        ((kce) this.h).b = null;
        ((kce) this.i).b = null;
        ((kce) this.k).b = null;
        ((kce) this.j).b = null;
    }

    public void t(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.h;
        vk6 vk6VarA = olhVar.a();
        vk6VarA.k(1, j);
        if (str == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    public void u(String str, yd4 yd4Var) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.g;
        vk6 vk6VarA = olhVar.a();
        byte[] bArrF = yd4.f(yd4Var);
        if (bArrF == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.D(1, bArrF);
        }
        if (str == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    public void v(w4i w4iVar, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        olh olhVar = (olh) this.e;
        vk6 vk6VarA = olhVar.a();
        vk6VarA.k(1, to8.q(w4iVar));
        if (str == null) {
            vk6VarA.S(2);
        } else {
            vk6VarA.f(2, str);
        }
        workDatabase_Impl.c();
        try {
            vk6VarA.w();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.k();
            olhVar.r(vk6VarA);
        }
    }

    public s5i() {
        this.a = new qtd();
        this.b = new qtd();
        this.c = new qtd();
        this.d = new qtd();
        this.e = new g0(0.0f);
        this.f = new g0(0.0f);
        this.g = new g0(0.0f);
        this.h = new g0(0.0f);
        int i = 0;
        this.i = new q85(i);
        this.j = new q85(i);
        this.k = new q85(i);
        this.l = new q85(i);
    }
}
