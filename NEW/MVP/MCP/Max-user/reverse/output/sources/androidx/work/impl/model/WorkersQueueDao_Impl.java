package androidx.work.impl.model;

import android.database.Cursor;
import defpackage.a6i;
import defpackage.bu3;
import defpackage.dsd;
import defpackage.eg0;
import defpackage.g6i;
import defpackage.lc4;
import defpackage.lrd;
import defpackage.r5i;
import defpackage.s7j;
import defpackage.so8;
import defpackage.to8;
import defpackage.ujb;
import defpackage.uk5;
import defpackage.vg5;
import defpackage.vk6;
import defpackage.w4i;
import defpackage.yd4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    private final lrd __db;
    private final vg5 __insertionAdapterOfWorkerQueueItem;
    private final vg5 __insertionAdapterOfWorkerQueueItem_1;

    public WorkersQueueDao_Impl(lrd lrdVar) {
        this.__db = lrdVar;
        this.__insertionAdapterOfWorkerQueueItem = new g6i(this, lrdVar, 0);
        this.__insertionAdapterOfWorkerQueueItem_1 = new g6i(this, lrdVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String __ExistingWorkPolicy_enumToString(uk5 uk5Var) {
        int iOrdinal = uk5Var.ordinal();
        if (iOrdinal == 0) {
            return "REPLACE";
        }
        if (iOrdinal == 1) {
            return "KEEP";
        }
        if (iOrdinal == 2) {
            return "APPEND";
        }
        if (iOrdinal == 3) {
            return "APPEND_OR_REPLACE";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + uk5Var);
    }

    private uk5 __ExistingWorkPolicy_stringToEnum(String str) {
        str.getClass();
        switch (str) {
            case "APPEND_OR_REPLACE":
                return uk5.d;
            case "KEEP":
                return uk5.b;
            case "REPLACE":
                return uk5.a;
            case "APPEND":
                return uk5.c;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public boolean contains(List<String> list) {
        this.__db.c();
        try {
            boolean zContains = super.contains(list);
            this.__db.q();
            return zContains;
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public int count(int i) {
        dsd dsdVarC = dsd.c(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");
        dsdVarC.k(1, i);
        this.__db.b();
        Cursor cursorN = this.__db.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void delete(List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");
        lc4.a(sb, list.size());
        sb.append(")");
        vk6 vk6VarD = this.__db.d(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                vk6VarD.S(i);
            } else {
                vk6VarD.f(i, str);
            }
            i++;
        }
        this.__db.c();
        try {
            vk6VarD.w();
            this.__db.q();
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<a6i> getItemsForRunning(int i) {
        this.__db.c();
        try {
            List<a6i> itemsForRunning = super.getItemsForRunning(i);
            this.__db.q();
            return itemsForRunning;
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insert(a6i a6iVar) {
        this.__db.c();
        try {
            super.insert(a6iVar);
            this.__db.q();
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrIgnore(a6i a6iVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem.B(a6iVar);
            this.__db.q();
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrReplace(a6i a6iVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem_1.B(a6iVar);
            this.__db.q();
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<a6i> select(int i) throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");
        dsdVarC.k(1, i);
        this.__db.b();
        Cursor cursorN = this.__db.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "uuid");
            int iC2 = s7j.c(cursorN, "uniqueWorkName");
            int iC3 = s7j.c(cursorN, "existingWorkPolicy");
            int iC4 = s7j.c(cursorN, "tags");
            int iC5 = s7j.c(cursorN, "time");
            int iC6 = s7j.c(cursorN, "state");
            int iC7 = s7j.c(cursorN, "work_spec_id");
            int iC8 = s7j.c(cursorN, "work_spec_state");
            int iC9 = s7j.c(cursorN, "work_spec_worker_class_name");
            int iC10 = s7j.c(cursorN, "work_spec_input_merger_class_name");
            int iC11 = s7j.c(cursorN, "work_spec_input");
            int iC12 = s7j.c(cursorN, "work_spec_output");
            int iC13 = s7j.c(cursorN, "work_spec_initial_delay");
            dsdVar = dsdVarC;
            try {
                int iC14 = s7j.c(cursorN, "work_spec_interval_duration");
                int iC15 = s7j.c(cursorN, "work_spec_flex_duration");
                int iC16 = s7j.c(cursorN, "work_spec_run_attempt_count");
                int iC17 = s7j.c(cursorN, "work_spec_backoff_policy");
                int iC18 = s7j.c(cursorN, "work_spec_backoff_delay_duration");
                int iC19 = s7j.c(cursorN, "work_spec_last_enqueue_time");
                int iC20 = s7j.c(cursorN, "work_spec_minimum_retention_duration");
                int iC21 = s7j.c(cursorN, "work_spec_schedule_requested_at");
                int iC22 = s7j.c(cursorN, "work_spec_run_in_foreground");
                int iC23 = s7j.c(cursorN, "work_spec_out_of_quota_policy");
                int iC24 = s7j.c(cursorN, "work_spec_period_count");
                int iC25 = s7j.c(cursorN, "work_spec_generation");
                int iC26 = s7j.c(cursorN, "work_spec_required_network_type");
                int iC27 = s7j.c(cursorN, "work_spec_requires_charging");
                int iC28 = s7j.c(cursorN, "work_spec_requires_device_idle");
                int iC29 = s7j.c(cursorN, "work_spec_requires_battery_not_low");
                int iC30 = s7j.c(cursorN, "work_spec_requires_storage_not_low");
                int iC31 = s7j.c(cursorN, "work_spec_trigger_content_update_delay");
                int iC32 = s7j.c(cursorN, "work_spec_trigger_max_content_delay");
                int iC33 = s7j.c(cursorN, "work_spec_content_uri_triggers");
                int i2 = iC13;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                    String string2 = cursorN.isNull(iC2) ? null : cursorN.getString(iC2);
                    uk5 uk5Var__ExistingWorkPolicy_stringToEnum = __ExistingWorkPolicy_stringToEnum(cursorN.getString(iC3));
                    HashSet hashSetA = so8.a(cursorN.isNull(iC4) ? null : cursorN.getString(iC4));
                    long j = cursorN.getLong(iC5);
                    int i3 = cursorN.getInt(iC6);
                    String string3 = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    w4i w4iVarH = to8.h(cursorN.getInt(iC8));
                    String string4 = cursorN.isNull(iC9) ? null : cursorN.getString(iC9);
                    String string5 = cursorN.isNull(iC10) ? null : cursorN.getString(iC10);
                    yd4 yd4VarA = yd4.a(cursorN.isNull(iC11) ? null : cursorN.getBlob(iC11));
                    yd4 yd4VarA2 = yd4.a(cursorN.isNull(iC12) ? null : cursorN.getBlob(iC12));
                    int i4 = i2;
                    long j2 = cursorN.getLong(i4);
                    i2 = i4;
                    int i5 = iC14;
                    long j3 = cursorN.getLong(i5);
                    iC14 = i5;
                    int i6 = iC15;
                    long j4 = cursorN.getLong(i6);
                    iC15 = i6;
                    int i7 = iC16;
                    int i8 = cursorN.getInt(i7);
                    iC16 = i7;
                    int i9 = iC17;
                    eg0 eg0VarE = to8.e(cursorN.getInt(i9));
                    iC17 = i9;
                    int i10 = iC18;
                    long j5 = cursorN.getLong(i10);
                    iC18 = i10;
                    int i11 = iC19;
                    long j6 = cursorN.getLong(i11);
                    iC19 = i11;
                    int i12 = iC20;
                    long j7 = cursorN.getLong(i12);
                    iC20 = i12;
                    int i13 = iC21;
                    long j8 = cursorN.getLong(i13);
                    iC21 = i13;
                    int i14 = iC22;
                    boolean z = cursorN.getInt(i14) != 0;
                    iC22 = i14;
                    int i15 = iC23;
                    ujb ujbVarG = to8.g(cursorN.getInt(i15));
                    iC23 = i15;
                    int i16 = iC24;
                    int i17 = cursorN.getInt(i16);
                    iC24 = i16;
                    int i18 = iC25;
                    int i19 = cursorN.getInt(i18);
                    iC25 = i18;
                    int i20 = iC26;
                    int iF = to8.f(cursorN.getInt(i20));
                    iC26 = i20;
                    int i21 = iC27;
                    boolean z2 = cursorN.getInt(i21) != 0;
                    iC27 = i21;
                    int i22 = iC28;
                    boolean z3 = cursorN.getInt(i22) != 0;
                    iC28 = i22;
                    int i23 = iC29;
                    boolean z4 = cursorN.getInt(i23) != 0;
                    iC29 = i23;
                    int i24 = iC30;
                    boolean z5 = cursorN.getInt(i24) != 0;
                    iC30 = i24;
                    int i25 = iC31;
                    long j9 = cursorN.getLong(i25);
                    iC31 = i25;
                    int i26 = iC32;
                    long j10 = cursorN.getLong(i26);
                    iC32 = i26;
                    int i27 = iC33;
                    if (!cursorN.isNull(i27)) {
                        blob = cursorN.getBlob(i27);
                    }
                    iC33 = i27;
                    arrayList.add(new a6i(string, string2, uk5Var__ExistingWorkPolicy_stringToEnum, new r5i(string3, w4iVarH, string4, string5, yd4VarA, yd4VarA2, j2, j3, j4, new bu3(iF, z2, z3, z4, z5, j9, j10, to8.b(blob)), i8, eg0VarE, j5, j6, j7, j8, z, ujbVarG, i17, i19), hashSetA, j, i3));
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

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void updateState(int i, List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");
        lc4.a(sb, list.size());
        sb.append(")");
        vk6 vk6VarD = this.__db.d(sb.toString());
        vk6VarD.k(1, i);
        int i2 = 2;
        for (String str : list) {
            if (str == null) {
                vk6VarD.S(i2);
            } else {
                vk6VarD.f(i2, str);
            }
            i2++;
        }
        this.__db.c();
        try {
            vk6VarD.w();
            this.__db.q();
        } finally {
            this.__db.k();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<a6i> select(int i, int i2) throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");
        dsdVarC.k(1, i2);
        dsdVarC.k(2, i);
        this.__db.b();
        Cursor cursorN = this.__db.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "uuid");
            int iC2 = s7j.c(cursorN, "uniqueWorkName");
            int iC3 = s7j.c(cursorN, "existingWorkPolicy");
            int iC4 = s7j.c(cursorN, "tags");
            int iC5 = s7j.c(cursorN, "time");
            int iC6 = s7j.c(cursorN, "state");
            int iC7 = s7j.c(cursorN, "work_spec_id");
            int iC8 = s7j.c(cursorN, "work_spec_state");
            int iC9 = s7j.c(cursorN, "work_spec_worker_class_name");
            int iC10 = s7j.c(cursorN, "work_spec_input_merger_class_name");
            int iC11 = s7j.c(cursorN, "work_spec_input");
            int iC12 = s7j.c(cursorN, "work_spec_output");
            int iC13 = s7j.c(cursorN, "work_spec_initial_delay");
            dsdVar = dsdVarC;
            try {
                int iC14 = s7j.c(cursorN, "work_spec_interval_duration");
                int iC15 = s7j.c(cursorN, "work_spec_flex_duration");
                int iC16 = s7j.c(cursorN, "work_spec_run_attempt_count");
                int iC17 = s7j.c(cursorN, "work_spec_backoff_policy");
                int iC18 = s7j.c(cursorN, "work_spec_backoff_delay_duration");
                int iC19 = s7j.c(cursorN, "work_spec_last_enqueue_time");
                int iC20 = s7j.c(cursorN, "work_spec_minimum_retention_duration");
                int iC21 = s7j.c(cursorN, "work_spec_schedule_requested_at");
                int iC22 = s7j.c(cursorN, "work_spec_run_in_foreground");
                int iC23 = s7j.c(cursorN, "work_spec_out_of_quota_policy");
                int iC24 = s7j.c(cursorN, "work_spec_period_count");
                int iC25 = s7j.c(cursorN, "work_spec_generation");
                int iC26 = s7j.c(cursorN, "work_spec_required_network_type");
                int iC27 = s7j.c(cursorN, "work_spec_requires_charging");
                int iC28 = s7j.c(cursorN, "work_spec_requires_device_idle");
                int iC29 = s7j.c(cursorN, "work_spec_requires_battery_not_low");
                int iC30 = s7j.c(cursorN, "work_spec_requires_storage_not_low");
                int iC31 = s7j.c(cursorN, "work_spec_trigger_content_update_delay");
                int iC32 = s7j.c(cursorN, "work_spec_trigger_max_content_delay");
                int iC33 = s7j.c(cursorN, "work_spec_content_uri_triggers");
                int i3 = iC13;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                    String string2 = cursorN.isNull(iC2) ? null : cursorN.getString(iC2);
                    uk5 uk5Var__ExistingWorkPolicy_stringToEnum = __ExistingWorkPolicy_stringToEnum(cursorN.getString(iC3));
                    HashSet hashSetA = so8.a(cursorN.isNull(iC4) ? null : cursorN.getString(iC4));
                    long j = cursorN.getLong(iC5);
                    int i4 = cursorN.getInt(iC6);
                    String string3 = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    w4i w4iVarH = to8.h(cursorN.getInt(iC8));
                    String string4 = cursorN.isNull(iC9) ? null : cursorN.getString(iC9);
                    String string5 = cursorN.isNull(iC10) ? null : cursorN.getString(iC10);
                    yd4 yd4VarA = yd4.a(cursorN.isNull(iC11) ? null : cursorN.getBlob(iC11));
                    yd4 yd4VarA2 = yd4.a(cursorN.isNull(iC12) ? null : cursorN.getBlob(iC12));
                    int i5 = i3;
                    long j2 = cursorN.getLong(i5);
                    int i6 = iC;
                    int i7 = iC14;
                    long j3 = cursorN.getLong(i7);
                    iC14 = i7;
                    int i8 = iC15;
                    long j4 = cursorN.getLong(i8);
                    iC15 = i8;
                    int i9 = iC16;
                    int i10 = cursorN.getInt(i9);
                    iC16 = i9;
                    int i11 = iC17;
                    eg0 eg0VarE = to8.e(cursorN.getInt(i11));
                    iC17 = i11;
                    int i12 = iC18;
                    long j5 = cursorN.getLong(i12);
                    iC18 = i12;
                    int i13 = iC19;
                    long j6 = cursorN.getLong(i13);
                    iC19 = i13;
                    int i14 = iC20;
                    long j7 = cursorN.getLong(i14);
                    iC20 = i14;
                    int i15 = iC21;
                    long j8 = cursorN.getLong(i15);
                    iC21 = i15;
                    int i16 = iC22;
                    boolean z = cursorN.getInt(i16) != 0;
                    iC22 = i16;
                    int i17 = iC23;
                    ujb ujbVarG = to8.g(cursorN.getInt(i17));
                    iC23 = i17;
                    int i18 = iC24;
                    int i19 = cursorN.getInt(i18);
                    iC24 = i18;
                    int i20 = iC25;
                    int i21 = cursorN.getInt(i20);
                    iC25 = i20;
                    int i22 = iC26;
                    int iF = to8.f(cursorN.getInt(i22));
                    iC26 = i22;
                    int i23 = iC27;
                    boolean z2 = cursorN.getInt(i23) != 0;
                    iC27 = i23;
                    int i24 = iC28;
                    boolean z3 = cursorN.getInt(i24) != 0;
                    iC28 = i24;
                    int i25 = iC29;
                    boolean z4 = cursorN.getInt(i25) != 0;
                    iC29 = i25;
                    int i26 = iC30;
                    boolean z5 = cursorN.getInt(i26) != 0;
                    iC30 = i26;
                    int i27 = iC31;
                    long j9 = cursorN.getLong(i27);
                    iC31 = i27;
                    int i28 = iC32;
                    long j10 = cursorN.getLong(i28);
                    iC32 = i28;
                    int i29 = iC33;
                    if (!cursorN.isNull(i29)) {
                        blob = cursorN.getBlob(i29);
                    }
                    iC33 = i29;
                    arrayList.add(new a6i(string, string2, uk5Var__ExistingWorkPolicy_stringToEnum, new r5i(string3, w4iVarH, string4, string5, yd4VarA, yd4VarA2, j2, j3, j4, new bu3(iF, z2, z3, z4, z5, j9, j10, to8.b(blob)), i10, eg0VarE, j5, j6, j7, j8, z, ujbVarG, i19, i21), hashSetA, j, i4));
                    iC = i6;
                    i3 = i5;
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
}
