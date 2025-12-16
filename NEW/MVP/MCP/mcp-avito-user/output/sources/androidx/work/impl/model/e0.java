package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.C23481y;
import androidx.room.F0;
import androidx.room.J0;
import androidx.room.O0;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.H;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
public final class e0 implements I {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55854a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<H> f55855b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.K<H> f55856c;

    /* renamed from: d, reason: collision with root package name */
    public final O0 f55857d;

    /* renamed from: e, reason: collision with root package name */
    public final O0 f55858e;

    /* renamed from: f, reason: collision with root package name */
    public final O0 f55859f;

    /* renamed from: g, reason: collision with root package name */
    public final O0 f55860g;

    /* renamed from: h, reason: collision with root package name */
    public final O0 f55861h;

    /* renamed from: i, reason: collision with root package name */
    public final O0 f55862i;

    /* renamed from: j, reason: collision with root package name */
    public final O0 f55863j;

    /* renamed from: k, reason: collision with root package name */
    public final O0 f55864k;

    /* renamed from: l, reason: collision with root package name */
    public final O0 f55865l;

    /* renamed from: m, reason: collision with root package name */
    public final O0 f55866m;

    /* renamed from: n, reason: collision with root package name */
    public final O0 f55867n;

    /* renamed from: o, reason: collision with root package name */
    public final O0 f55868o;

    /* compiled from: WorkSpecDao_Impl.java */
    public class a implements Callable<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F0 f55869b;

        public a(F0 f02) {
            this.f55869b = f02;
        }

        @Override // java.util.concurrent.Callable
        @j.N
        public final Boolean call() {
            Boolean boolValueOf;
            Cursor cursorP = e0.this.f55854a.p(this.f55869b);
            try {
                if (cursorP.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorP.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                cursorP.close();
                return boolValueOf;
            } catch (Throwable th2) {
                cursorP.close();
                throw th2;
            }
        }

        public final void finalize() {
            this.f55869b.d();
        }
    }

    public e0(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55854a = workDatabase_Impl;
        this.f55855b = new Y(workDatabase_Impl);
        this.f55856c = new g0(workDatabase_Impl);
        this.f55857d = new h0(workDatabase_Impl);
        this.f55858e = new i0(workDatabase_Impl);
        this.f55859f = new j0(workDatabase_Impl);
        this.f55860g = new k0(workDatabase_Impl);
        this.f55861h = new l0(workDatabase_Impl);
        this.f55862i = new m0(workDatabase_Impl);
        this.f55863j = new n0(workDatabase_Impl);
        this.f55864k = new N(workDatabase_Impl);
        new O(workDatabase_Impl);
        this.f55865l = new P(workDatabase_Impl);
        this.f55866m = new Q(workDatabase_Impl);
        this.f55867n = new S(workDatabase_Impl);
        new T(workDatabase_Impl);
        new U(workDatabase_Impl);
        this.f55868o = new V(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList A() throws Throwable {
        F0 f02;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        F0 f0C = F0.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            iB2 = V1.b.b(cursorP, "id");
            iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            iB4 = V1.b.b(cursorP, "worker_class_name");
            iB5 = V1.b.b(cursorP, "input_merger_class_name");
            iB6 = V1.b.b(cursorP, "input");
            iB7 = V1.b.b(cursorP, "output");
            iB8 = V1.b.b(cursorP, "initial_delay");
            iB9 = V1.b.b(cursorP, "interval_duration");
            iB10 = V1.b.b(cursorP, "flex_duration");
            iB11 = V1.b.b(cursorP, "run_attempt_count");
            iB12 = V1.b.b(cursorP, "backoff_policy");
            iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            iB14 = V1.b.b(cursorP, "last_enqueue_time");
            iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
        } catch (Throwable th2) {
            th = th2;
            f02 = f0C;
        }
        try {
            int iB16 = V1.b.b(cursorP, "schedule_requested_at");
            int iB17 = V1.b.b(cursorP, "run_in_foreground");
            int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
            int iB19 = V1.b.b(cursorP, "period_count");
            int iB20 = V1.b.b(cursorP, "generation");
            int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
            int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
            int iB23 = V1.b.b(cursorP, "stop_reason");
            int iB24 = V1.b.b(cursorP, "trace_tag");
            int iB25 = V1.b.b(cursorP, "required_network_type");
            int iB26 = V1.b.b(cursorP, "required_network_request");
            int iB27 = V1.b.b(cursorP, "requires_charging");
            int iB28 = V1.b.b(cursorP, "requires_device_idle");
            int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
            int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
            int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
            int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
            int iB33 = V1.b.b(cursorP, "content_uri_triggers");
            int i17 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                String string2 = cursorP.getString(iB4);
                String string3 = cursorP.getString(iB5);
                byte[] blob = cursorP.getBlob(iB6);
                C23544h.f55508b.getClass();
                C23544h c23544hA = C23544h.b.a(blob);
                C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                long j12 = cursorP.getLong(iB8);
                long j13 = cursorP.getLong(iB9);
                long j14 = cursorP.getLong(iB10);
                int i18 = cursorP.getInt(iB11);
                BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                long j15 = cursorP.getLong(iB13);
                long j16 = cursorP.getLong(iB14);
                int i19 = i17;
                long j17 = cursorP.getLong(i19);
                int i22 = iB2;
                int i23 = iB16;
                long j18 = cursorP.getLong(i23);
                iB16 = i23;
                int i24 = iB17;
                if (cursorP.getInt(i24) != 0) {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = true;
                } else {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = false;
                }
                OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i12));
                iB18 = i12;
                int i25 = iB19;
                int i26 = cursorP.getInt(i25);
                iB19 = i25;
                int i27 = iB20;
                int i28 = cursorP.getInt(i27);
                iB20 = i27;
                int i29 = iB21;
                long j19 = cursorP.getLong(i29);
                iB21 = i29;
                int i32 = iB22;
                int i33 = cursorP.getInt(i32);
                iB22 = i32;
                int i34 = iB23;
                int i35 = cursorP.getInt(i34);
                iB23 = i34;
                int i36 = iB24;
                String string4 = cursorP.isNull(i36) ? null : cursorP.getString(i36);
                iB24 = i36;
                int i37 = iB25;
                NetworkType networkTypeE = u0.e(cursorP.getInt(i37));
                iB25 = i37;
                int i38 = iB26;
                androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i38));
                iB26 = i38;
                int i39 = iB27;
                if (cursorP.getInt(i39) != 0) {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = true;
                } else {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = false;
                }
                if (cursorP.getInt(i13) != 0) {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = true;
                } else {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = false;
                }
                if (cursorP.getInt(i14) != 0) {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = true;
                } else {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = false;
                }
                if (cursorP.getInt(i15) != 0) {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = true;
                } else {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = false;
                }
                long j22 = cursorP.getLong(i16);
                iB31 = i16;
                int i42 = iB32;
                long j23 = cursorP.getLong(i42);
                iB32 = i42;
                int i43 = iB33;
                iB33 = i43;
                arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, j22, j23, u0.b(cursorP.getBlob(i43))), i18, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i26, i28, j19, i33, i35, string4));
                iB2 = i22;
                i17 = i19;
            }
            cursorP.close();
            f02.d();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorP.close();
            f02.d();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList B() {
        new StringBuilder().append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        throw null;
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList C() throws Throwable {
        F0 f02;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        F0 f0C = F0.c(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        f0C.g1(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            int iB2 = V1.b.b(cursorP, "id");
            int iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            int iB4 = V1.b.b(cursorP, "worker_class_name");
            int iB5 = V1.b.b(cursorP, "input_merger_class_name");
            int iB6 = V1.b.b(cursorP, "input");
            int iB7 = V1.b.b(cursorP, "output");
            int iB8 = V1.b.b(cursorP, "initial_delay");
            int iB9 = V1.b.b(cursorP, "interval_duration");
            int iB10 = V1.b.b(cursorP, "flex_duration");
            int iB11 = V1.b.b(cursorP, "run_attempt_count");
            int iB12 = V1.b.b(cursorP, "backoff_policy");
            int iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            int iB14 = V1.b.b(cursorP, "last_enqueue_time");
            int iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
            try {
                int iB16 = V1.b.b(cursorP, "schedule_requested_at");
                int iB17 = V1.b.b(cursorP, "run_in_foreground");
                int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
                int iB19 = V1.b.b(cursorP, "period_count");
                int iB20 = V1.b.b(cursorP, "generation");
                int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
                int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
                int iB23 = V1.b.b(cursorP, "stop_reason");
                int iB24 = V1.b.b(cursorP, "trace_tag");
                int iB25 = V1.b.b(cursorP, "required_network_type");
                int iB26 = V1.b.b(cursorP, "required_network_request");
                int iB27 = V1.b.b(cursorP, "requires_charging");
                int iB28 = V1.b.b(cursorP, "requires_device_idle");
                int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
                int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
                int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
                int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
                int iB33 = V1.b.b(cursorP, "content_uri_triggers");
                int i17 = iB15;
                ArrayList arrayList = new ArrayList(cursorP.getCount());
                while (cursorP.moveToNext()) {
                    String string = cursorP.getString(iB2);
                    WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                    String string2 = cursorP.getString(iB4);
                    String string3 = cursorP.getString(iB5);
                    byte[] blob = cursorP.getBlob(iB6);
                    C23544h.f55508b.getClass();
                    C23544h c23544hA = C23544h.b.a(blob);
                    C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                    long j12 = cursorP.getLong(iB8);
                    long j13 = cursorP.getLong(iB9);
                    long j14 = cursorP.getLong(iB10);
                    int i18 = cursorP.getInt(iB11);
                    BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                    long j15 = cursorP.getLong(iB13);
                    long j16 = cursorP.getLong(iB14);
                    int i19 = i17;
                    long j17 = cursorP.getLong(i19);
                    int i22 = iB2;
                    int i23 = iB16;
                    long j18 = cursorP.getLong(i23);
                    iB16 = i23;
                    int i24 = iB17;
                    if (cursorP.getInt(i24) != 0) {
                        iB17 = i24;
                        i12 = iB18;
                        z12 = true;
                    } else {
                        iB17 = i24;
                        i12 = iB18;
                        z12 = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i12));
                    iB18 = i12;
                    int i25 = iB19;
                    int i26 = cursorP.getInt(i25);
                    iB19 = i25;
                    int i27 = iB20;
                    int i28 = cursorP.getInt(i27);
                    iB20 = i27;
                    int i29 = iB21;
                    long j19 = cursorP.getLong(i29);
                    iB21 = i29;
                    int i32 = iB22;
                    int i33 = cursorP.getInt(i32);
                    iB22 = i32;
                    int i34 = iB23;
                    int i35 = cursorP.getInt(i34);
                    iB23 = i34;
                    int i36 = iB24;
                    String string4 = cursorP.isNull(i36) ? null : cursorP.getString(i36);
                    iB24 = i36;
                    int i37 = iB25;
                    NetworkType networkTypeE = u0.e(cursorP.getInt(i37));
                    iB25 = i37;
                    int i38 = iB26;
                    androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i38));
                    iB26 = i38;
                    int i39 = iB27;
                    if (cursorP.getInt(i39) != 0) {
                        iB27 = i39;
                        i13 = iB28;
                        z13 = true;
                    } else {
                        iB27 = i39;
                        i13 = iB28;
                        z13 = false;
                    }
                    if (cursorP.getInt(i13) != 0) {
                        iB28 = i13;
                        i14 = iB29;
                        z14 = true;
                    } else {
                        iB28 = i13;
                        i14 = iB29;
                        z14 = false;
                    }
                    if (cursorP.getInt(i14) != 0) {
                        iB29 = i14;
                        i15 = iB30;
                        z15 = true;
                    } else {
                        iB29 = i14;
                        i15 = iB30;
                        z15 = false;
                    }
                    if (cursorP.getInt(i15) != 0) {
                        iB30 = i15;
                        i16 = iB31;
                        z16 = true;
                    } else {
                        iB30 = i15;
                        i16 = iB31;
                        z16 = false;
                    }
                    long j22 = cursorP.getLong(i16);
                    iB31 = i16;
                    int i42 = iB32;
                    long j23 = cursorP.getLong(i42);
                    iB32 = i42;
                    int i43 = iB33;
                    iB33 = i43;
                    arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, j22, j23, u0.b(cursorP.getBlob(i43))), i18, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i26, i28, j19, i33, i35, string4));
                    iB2 = i22;
                    i17 = i19;
                }
                cursorP.close();
                f02.d();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorP.close();
                f02.d();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f02 = f0C;
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList D(String str) {
        F0 f0C = F0.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(0);
                WorkInfo.State stateG = u0.g(cursorP.getInt(1));
                H.b bVar = new H.b();
                bVar.f55819a = string;
                bVar.f55820b = stateG;
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final InterfaceC43160i<Boolean> E() {
        a aVar = new a(F0.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
        return C23481y.a(this.f55854a, new String[]{"workspec"}, aVar);
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList F(int i12) throws Throwable {
        F0 f02;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        F0 f0C = F0.c(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        f0C.g1(1, i12);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            int iB2 = V1.b.b(cursorP, "id");
            int iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            int iB4 = V1.b.b(cursorP, "worker_class_name");
            int iB5 = V1.b.b(cursorP, "input_merger_class_name");
            int iB6 = V1.b.b(cursorP, "input");
            int iB7 = V1.b.b(cursorP, "output");
            int iB8 = V1.b.b(cursorP, "initial_delay");
            int iB9 = V1.b.b(cursorP, "interval_duration");
            int iB10 = V1.b.b(cursorP, "flex_duration");
            int iB11 = V1.b.b(cursorP, "run_attempt_count");
            int iB12 = V1.b.b(cursorP, "backoff_policy");
            int iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            int iB14 = V1.b.b(cursorP, "last_enqueue_time");
            int iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
            try {
                int iB16 = V1.b.b(cursorP, "schedule_requested_at");
                int iB17 = V1.b.b(cursorP, "run_in_foreground");
                int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
                int iB19 = V1.b.b(cursorP, "period_count");
                int iB20 = V1.b.b(cursorP, "generation");
                int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
                int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
                int iB23 = V1.b.b(cursorP, "stop_reason");
                int iB24 = V1.b.b(cursorP, "trace_tag");
                int iB25 = V1.b.b(cursorP, "required_network_type");
                int iB26 = V1.b.b(cursorP, "required_network_request");
                int iB27 = V1.b.b(cursorP, "requires_charging");
                int iB28 = V1.b.b(cursorP, "requires_device_idle");
                int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
                int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
                int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
                int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
                int iB33 = V1.b.b(cursorP, "content_uri_triggers");
                int i18 = iB15;
                ArrayList arrayList = new ArrayList(cursorP.getCount());
                while (cursorP.moveToNext()) {
                    String string = cursorP.getString(iB2);
                    WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                    String string2 = cursorP.getString(iB4);
                    String string3 = cursorP.getString(iB5);
                    byte[] blob = cursorP.getBlob(iB6);
                    C23544h.f55508b.getClass();
                    C23544h c23544hA = C23544h.b.a(blob);
                    C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                    long j12 = cursorP.getLong(iB8);
                    long j13 = cursorP.getLong(iB9);
                    long j14 = cursorP.getLong(iB10);
                    int i19 = cursorP.getInt(iB11);
                    BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                    long j15 = cursorP.getLong(iB13);
                    long j16 = cursorP.getLong(iB14);
                    int i22 = i18;
                    long j17 = cursorP.getLong(i22);
                    int i23 = iB2;
                    int i24 = iB16;
                    long j18 = cursorP.getLong(i24);
                    iB16 = i24;
                    int i25 = iB17;
                    if (cursorP.getInt(i25) != 0) {
                        iB17 = i25;
                        i13 = iB18;
                        z12 = true;
                    } else {
                        iB17 = i25;
                        i13 = iB18;
                        z12 = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i13));
                    iB18 = i13;
                    int i26 = iB19;
                    int i27 = cursorP.getInt(i26);
                    iB19 = i26;
                    int i28 = iB20;
                    int i29 = cursorP.getInt(i28);
                    iB20 = i28;
                    int i32 = iB21;
                    long j19 = cursorP.getLong(i32);
                    iB21 = i32;
                    int i33 = iB22;
                    int i34 = cursorP.getInt(i33);
                    iB22 = i33;
                    int i35 = iB23;
                    int i36 = cursorP.getInt(i35);
                    iB23 = i35;
                    int i37 = iB24;
                    String string4 = cursorP.isNull(i37) ? null : cursorP.getString(i37);
                    iB24 = i37;
                    int i38 = iB25;
                    NetworkType networkTypeE = u0.e(cursorP.getInt(i38));
                    iB25 = i38;
                    int i39 = iB26;
                    androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i39));
                    iB26 = i39;
                    int i42 = iB27;
                    if (cursorP.getInt(i42) != 0) {
                        iB27 = i42;
                        i14 = iB28;
                        z13 = true;
                    } else {
                        iB27 = i42;
                        i14 = iB28;
                        z13 = false;
                    }
                    if (cursorP.getInt(i14) != 0) {
                        iB28 = i14;
                        i15 = iB29;
                        z14 = true;
                    } else {
                        iB28 = i14;
                        i15 = iB29;
                        z14 = false;
                    }
                    if (cursorP.getInt(i15) != 0) {
                        iB29 = i15;
                        i16 = iB30;
                        z15 = true;
                    } else {
                        iB29 = i15;
                        i16 = iB30;
                        z15 = false;
                    }
                    if (cursorP.getInt(i16) != 0) {
                        iB30 = i16;
                        i17 = iB31;
                        z16 = true;
                    } else {
                        iB30 = i16;
                        i17 = iB31;
                        z16 = false;
                    }
                    long j22 = cursorP.getLong(i17);
                    iB31 = i17;
                    int i43 = iB32;
                    long j23 = cursorP.getLong(i43);
                    iB32 = i43;
                    int i44 = iB33;
                    iB33 = i44;
                    arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, j22, j23, u0.b(cursorP.getBlob(i44))), i19, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i27, i29, j19, i34, i36, string4));
                    iB2 = i23;
                    i18 = i22;
                }
                cursorP.close();
                f02.d();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorP.close();
                f02.d();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f02 = f0C;
        }
    }

    @Override // androidx.work.impl.model.I
    public final int G(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55863j;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    public final void H(@j.N HashMap<String, ArrayList<C23544h>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            V1.f.a(map, new M(this, 1));
            return;
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        F0 f0C = F0.c(size, sbR.toString());
        Iterator<String> it = setKeySet.iterator();
        int i12 = 1;
        while (it.hasNext()) {
            f0C.h4(i12, it.next());
            i12++;
        }
        Cursor cursorP = this.f55854a.p(f0C);
        try {
            int iA2 = V1.b.a(cursorP, "work_spec_id");
            if (iA2 == -1) {
                return;
            }
            while (cursorP.moveToNext()) {
                ArrayList<C23544h> arrayList = map.get(cursorP.getString(iA2));
                if (arrayList != null) {
                    byte[] blob = cursorP.getBlob(0);
                    C23544h.f55508b.getClass();
                    arrayList.add(C23544h.b.a(blob));
                }
            }
        } finally {
            cursorP.close();
        }
    }

    public final void I(@j.N HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            V1.f.a(map, new M(this, 0));
            return;
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        F0 f0C = F0.c(size, sbR.toString());
        Iterator<String> it = setKeySet.iterator();
        int i12 = 1;
        while (it.hasNext()) {
            f0C.h4(i12, it.next());
            i12++;
        }
        Cursor cursorP = this.f55854a.p(f0C);
        try {
            int iA2 = V1.b.a(cursorP, "work_spec_id");
            if (iA2 == -1) {
                return;
            }
            while (cursorP.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorP.getString(iA2));
                if (arrayList != null) {
                    arrayList.add(cursorP.getString(0));
                }
            }
        } finally {
            cursorP.close();
        }
    }

    @Override // androidx.work.impl.model.I
    public final WorkInfo.State a(String str) {
        F0 f0C = F0.c(1, "SELECT state FROM workspec WHERE id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            WorkInfo.State stateG = null;
            if (cursorP.moveToFirst()) {
                Integer numValueOf = cursorP.isNull(0) ? null : Integer.valueOf(cursorP.getInt(0));
                if (numValueOf != null) {
                    int i12 = u0.f55888a;
                    stateG = u0.g(numValueOf.intValue());
                }
            }
            return stateG;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55857d;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final void c(H h12) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f55855b.e(h12);
            workDatabase_Impl.s();
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.I
    public final int d(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55859f;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList e(String str) {
        F0 f0C = F0.c(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                byte[] blob = cursorP.getBlob(0);
                C23544h.f55508b.getClass();
                arrayList.add(C23544h.b.a(blob));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final int f(WorkInfo.State state, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55858e;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, u0.k(state));
        iVarA.h4(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList g() {
        F0 f0C = F0.c(0, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final int h(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55864k;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final H i(String str) throws Throwable {
        F0 f02;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        boolean z15;
        int i15;
        boolean z16;
        int i16;
        F0 f0C = F0.c(1, "SELECT * FROM workspec WHERE id=?");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            iB2 = V1.b.b(cursorP, "id");
            iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            iB4 = V1.b.b(cursorP, "worker_class_name");
            iB5 = V1.b.b(cursorP, "input_merger_class_name");
            iB6 = V1.b.b(cursorP, "input");
            iB7 = V1.b.b(cursorP, "output");
            iB8 = V1.b.b(cursorP, "initial_delay");
            iB9 = V1.b.b(cursorP, "interval_duration");
            iB10 = V1.b.b(cursorP, "flex_duration");
            iB11 = V1.b.b(cursorP, "run_attempt_count");
            iB12 = V1.b.b(cursorP, "backoff_policy");
            iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            iB14 = V1.b.b(cursorP, "last_enqueue_time");
            iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
        } catch (Throwable th2) {
            th = th2;
            f02 = f0C;
        }
        try {
            int iB16 = V1.b.b(cursorP, "schedule_requested_at");
            int iB17 = V1.b.b(cursorP, "run_in_foreground");
            int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
            int iB19 = V1.b.b(cursorP, "period_count");
            int iB20 = V1.b.b(cursorP, "generation");
            int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
            int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
            int iB23 = V1.b.b(cursorP, "stop_reason");
            int iB24 = V1.b.b(cursorP, "trace_tag");
            int iB25 = V1.b.b(cursorP, "required_network_type");
            int iB26 = V1.b.b(cursorP, "required_network_request");
            int iB27 = V1.b.b(cursorP, "requires_charging");
            int iB28 = V1.b.b(cursorP, "requires_device_idle");
            int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
            int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
            int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
            int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
            int iB33 = V1.b.b(cursorP, "content_uri_triggers");
            H h12 = null;
            if (cursorP.moveToFirst()) {
                String string = cursorP.getString(iB2);
                WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                String string2 = cursorP.getString(iB4);
                String string3 = cursorP.getString(iB5);
                byte[] blob = cursorP.getBlob(iB6);
                C23544h.f55508b.getClass();
                C23544h c23544hA = C23544h.b.a(blob);
                C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                long j12 = cursorP.getLong(iB8);
                long j13 = cursorP.getLong(iB9);
                long j14 = cursorP.getLong(iB10);
                int i17 = cursorP.getInt(iB11);
                BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                long j15 = cursorP.getLong(iB13);
                long j16 = cursorP.getLong(iB14);
                long j17 = cursorP.getLong(iB15);
                long j18 = cursorP.getLong(iB16);
                if (cursorP.getInt(iB17) != 0) {
                    i12 = iB18;
                    z12 = true;
                } else {
                    z12 = false;
                    i12 = iB18;
                }
                OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i12));
                int i18 = cursorP.getInt(iB19);
                int i19 = cursorP.getInt(iB20);
                long j19 = cursorP.getLong(iB21);
                int i22 = cursorP.getInt(iB22);
                int i23 = cursorP.getInt(iB23);
                String string4 = cursorP.isNull(iB24) ? null : cursorP.getString(iB24);
                NetworkType networkTypeE = u0.e(cursorP.getInt(iB25));
                androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(iB26));
                if (cursorP.getInt(iB27) != 0) {
                    i13 = iB28;
                    z13 = true;
                } else {
                    z13 = false;
                    i13 = iB28;
                }
                if (cursorP.getInt(i13) != 0) {
                    i14 = iB29;
                    z14 = true;
                } else {
                    z14 = false;
                    i14 = iB29;
                }
                if (cursorP.getInt(i14) != 0) {
                    i15 = iB30;
                    z15 = true;
                } else {
                    z15 = false;
                    i15 = iB30;
                }
                if (cursorP.getInt(i15) != 0) {
                    i16 = iB31;
                    z16 = true;
                } else {
                    z16 = false;
                    i16 = iB31;
                }
                h12 = new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, cursorP.getLong(i16), cursorP.getLong(iB32), u0.b(cursorP.getBlob(iB33))), i17, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i18, i19, j19, i22, i23, string4);
            }
            cursorP.close();
            f02.d();
            return h12;
        } catch (Throwable th3) {
            th = th3;
            cursorP.close();
            f02.d();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.I
    public final int j() {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55867n;
        Z1.i iVarA = o02.a();
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final void k(C23544h c23544h, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55861h;
        Z1.i iVarA = o02.a();
        C23544h.f55508b.getClass();
        iVarA.u4(1, C23544h.b.c(c23544h));
        iVarA.h4(2, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList l() throws Throwable {
        F0 f02;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        F0 f0C = F0.c(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            iB2 = V1.b.b(cursorP, "id");
            iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            iB4 = V1.b.b(cursorP, "worker_class_name");
            iB5 = V1.b.b(cursorP, "input_merger_class_name");
            iB6 = V1.b.b(cursorP, "input");
            iB7 = V1.b.b(cursorP, "output");
            iB8 = V1.b.b(cursorP, "initial_delay");
            iB9 = V1.b.b(cursorP, "interval_duration");
            iB10 = V1.b.b(cursorP, "flex_duration");
            iB11 = V1.b.b(cursorP, "run_attempt_count");
            iB12 = V1.b.b(cursorP, "backoff_policy");
            iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            iB14 = V1.b.b(cursorP, "last_enqueue_time");
            iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
        } catch (Throwable th2) {
            th = th2;
            f02 = f0C;
        }
        try {
            int iB16 = V1.b.b(cursorP, "schedule_requested_at");
            int iB17 = V1.b.b(cursorP, "run_in_foreground");
            int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
            int iB19 = V1.b.b(cursorP, "period_count");
            int iB20 = V1.b.b(cursorP, "generation");
            int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
            int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
            int iB23 = V1.b.b(cursorP, "stop_reason");
            int iB24 = V1.b.b(cursorP, "trace_tag");
            int iB25 = V1.b.b(cursorP, "required_network_type");
            int iB26 = V1.b.b(cursorP, "required_network_request");
            int iB27 = V1.b.b(cursorP, "requires_charging");
            int iB28 = V1.b.b(cursorP, "requires_device_idle");
            int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
            int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
            int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
            int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
            int iB33 = V1.b.b(cursorP, "content_uri_triggers");
            int i17 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                String string2 = cursorP.getString(iB4);
                String string3 = cursorP.getString(iB5);
                byte[] blob = cursorP.getBlob(iB6);
                C23544h.f55508b.getClass();
                C23544h c23544hA = C23544h.b.a(blob);
                C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                long j12 = cursorP.getLong(iB8);
                long j13 = cursorP.getLong(iB9);
                long j14 = cursorP.getLong(iB10);
                int i18 = cursorP.getInt(iB11);
                BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                long j15 = cursorP.getLong(iB13);
                long j16 = cursorP.getLong(iB14);
                int i19 = i17;
                long j17 = cursorP.getLong(i19);
                int i22 = iB2;
                int i23 = iB16;
                long j18 = cursorP.getLong(i23);
                iB16 = i23;
                int i24 = iB17;
                if (cursorP.getInt(i24) != 0) {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = true;
                } else {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = false;
                }
                OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i12));
                iB18 = i12;
                int i25 = iB19;
                int i26 = cursorP.getInt(i25);
                iB19 = i25;
                int i27 = iB20;
                int i28 = cursorP.getInt(i27);
                iB20 = i27;
                int i29 = iB21;
                long j19 = cursorP.getLong(i29);
                iB21 = i29;
                int i32 = iB22;
                int i33 = cursorP.getInt(i32);
                iB22 = i32;
                int i34 = iB23;
                int i35 = cursorP.getInt(i34);
                iB23 = i34;
                int i36 = iB24;
                String string4 = cursorP.isNull(i36) ? null : cursorP.getString(i36);
                iB24 = i36;
                int i37 = iB25;
                NetworkType networkTypeE = u0.e(cursorP.getInt(i37));
                iB25 = i37;
                int i38 = iB26;
                androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i38));
                iB26 = i38;
                int i39 = iB27;
                if (cursorP.getInt(i39) != 0) {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = true;
                } else {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = false;
                }
                if (cursorP.getInt(i13) != 0) {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = true;
                } else {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = false;
                }
                if (cursorP.getInt(i14) != 0) {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = true;
                } else {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = false;
                }
                if (cursorP.getInt(i15) != 0) {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = true;
                } else {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = false;
                }
                long j22 = cursorP.getLong(i16);
                iB31 = i16;
                int i42 = iB32;
                long j23 = cursorP.getLong(i42);
                iB32 = i42;
                int i43 = iB33;
                iB33 = i43;
                arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, j22, j23, u0.b(cursorP.getBlob(i43))), i18, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i26, i28, j19, i33, i35, string4));
                iB2 = i22;
                i17 = i19;
            }
            cursorP.close();
            f02.d();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorP.close();
            f02.d();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.I
    public final void m(int i12, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55868o;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, i12);
        iVarA.h4(2, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final J0 n() {
        F0 f0C = F0.c(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        f0C.h4(1, "FileDownloadWorker");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        b0 b0Var = new b0(this, f0C);
        androidx.room.Y y12 = workDatabase_Impl.f54301e;
        String[] strArrD = y12.d(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"});
        for (String str : strArrD) {
            if (!y12.f54347d.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        androidx.room.X x12 = y12.f54353j;
        return new J0(x12.f54340a, x12, b0Var, strArrD);
    }

    @Override // androidx.work.impl.model.I
    public final void o(H h12) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            androidx.room.K<H> k12 = this.f55856c;
            Z1.i iVarA = k12.a();
            try {
                k12.d(iVarA, h12);
                iVarA.B3();
                k12.c(iVarA);
                workDatabase_Impl.s();
            } catch (Throwable th2) {
                k12.c(iVarA);
                throw th2;
            }
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList p(String str) {
        F0 f0C = F0.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList q() {
        F0 f0C = F0.c(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        f0C.h4(1, null);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(workDatabase_Impl, f0C, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<C23544h>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                I(map);
                H(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateG = u0.g(cursorB.getInt(1));
                    byte[] blob = cursorB.getBlob(2);
                    C23544h.f55508b.getClass();
                    C23544h c23544hA = C23544h.b.a(blob);
                    int i12 = cursorB.getInt(3);
                    int i13 = cursorB.getInt(4);
                    arrayList.add(new H.c(string3, stateG, c23544hA, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new C23542f(u0.l(cursorB.getBlob(6)), u0.e(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), u0.b(cursorB.getBlob(13))), i12, u0.d(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i13, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                workDatabase_Impl.s();
                cursorB.close();
                f0C.d();
                return arrayList;
            } catch (Throwable th2) {
                cursorB.close();
                f0C.d();
                throw th2;
            }
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList r(String str) {
        F0 f0C = F0.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList s(String str) {
        F0 f0C = F0.c(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        f0C.h4(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(workDatabase_Impl, f0C, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<C23544h>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                I(map);
                H(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateG = u0.g(cursorB.getInt(1));
                    byte[] blob = cursorB.getBlob(2);
                    C23544h.f55508b.getClass();
                    C23544h c23544hA = C23544h.b.a(blob);
                    int i12 = cursorB.getInt(3);
                    int i13 = cursorB.getInt(4);
                    arrayList.add(new H.c(string3, stateG, c23544hA, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new C23542f(u0.l(cursorB.getBlob(6)), u0.e(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), u0.b(cursorB.getBlob(13))), i12, u0.d(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i13, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                workDatabase_Impl.s();
                cursorB.close();
                f0C.d();
                return arrayList;
            } catch (Throwable th2) {
                cursorB.close();
                f0C.d();
                throw th2;
            }
        } finally {
            workDatabase_Impl.l();
        }
    }

    @Override // androidx.work.impl.model.I
    public final void t(long j12, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55862i;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, j12);
        iVarA.h4(2, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList u() throws Throwable {
        F0 f02;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        F0 f0C = F0.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            iB2 = V1.b.b(cursorP, "id");
            iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            iB4 = V1.b.b(cursorP, "worker_class_name");
            iB5 = V1.b.b(cursorP, "input_merger_class_name");
            iB6 = V1.b.b(cursorP, "input");
            iB7 = V1.b.b(cursorP, "output");
            iB8 = V1.b.b(cursorP, "initial_delay");
            iB9 = V1.b.b(cursorP, "interval_duration");
            iB10 = V1.b.b(cursorP, "flex_duration");
            iB11 = V1.b.b(cursorP, "run_attempt_count");
            iB12 = V1.b.b(cursorP, "backoff_policy");
            iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            iB14 = V1.b.b(cursorP, "last_enqueue_time");
            iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
        } catch (Throwable th2) {
            th = th2;
            f02 = f0C;
        }
        try {
            int iB16 = V1.b.b(cursorP, "schedule_requested_at");
            int iB17 = V1.b.b(cursorP, "run_in_foreground");
            int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
            int iB19 = V1.b.b(cursorP, "period_count");
            int iB20 = V1.b.b(cursorP, "generation");
            int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
            int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
            int iB23 = V1.b.b(cursorP, "stop_reason");
            int iB24 = V1.b.b(cursorP, "trace_tag");
            int iB25 = V1.b.b(cursorP, "required_network_type");
            int iB26 = V1.b.b(cursorP, "required_network_request");
            int iB27 = V1.b.b(cursorP, "requires_charging");
            int iB28 = V1.b.b(cursorP, "requires_device_idle");
            int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
            int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
            int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
            int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
            int iB33 = V1.b.b(cursorP, "content_uri_triggers");
            int i17 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                String string2 = cursorP.getString(iB4);
                String string3 = cursorP.getString(iB5);
                byte[] blob = cursorP.getBlob(iB6);
                C23544h.f55508b.getClass();
                C23544h c23544hA = C23544h.b.a(blob);
                C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                long j12 = cursorP.getLong(iB8);
                long j13 = cursorP.getLong(iB9);
                long j14 = cursorP.getLong(iB10);
                int i18 = cursorP.getInt(iB11);
                BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                long j15 = cursorP.getLong(iB13);
                long j16 = cursorP.getLong(iB14);
                int i19 = i17;
                long j17 = cursorP.getLong(i19);
                int i22 = iB2;
                int i23 = iB16;
                long j18 = cursorP.getLong(i23);
                iB16 = i23;
                int i24 = iB17;
                if (cursorP.getInt(i24) != 0) {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = true;
                } else {
                    iB17 = i24;
                    i12 = iB18;
                    z12 = false;
                }
                OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i12));
                iB18 = i12;
                int i25 = iB19;
                int i26 = cursorP.getInt(i25);
                iB19 = i25;
                int i27 = iB20;
                int i28 = cursorP.getInt(i27);
                iB20 = i27;
                int i29 = iB21;
                long j19 = cursorP.getLong(i29);
                iB21 = i29;
                int i32 = iB22;
                int i33 = cursorP.getInt(i32);
                iB22 = i32;
                int i34 = iB23;
                int i35 = cursorP.getInt(i34);
                iB23 = i34;
                int i36 = iB24;
                String string4 = cursorP.isNull(i36) ? null : cursorP.getString(i36);
                iB24 = i36;
                int i37 = iB25;
                NetworkType networkTypeE = u0.e(cursorP.getInt(i37));
                iB25 = i37;
                int i38 = iB26;
                androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i38));
                iB26 = i38;
                int i39 = iB27;
                if (cursorP.getInt(i39) != 0) {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = true;
                } else {
                    iB27 = i39;
                    i13 = iB28;
                    z13 = false;
                }
                if (cursorP.getInt(i13) != 0) {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = true;
                } else {
                    iB28 = i13;
                    i14 = iB29;
                    z14 = false;
                }
                if (cursorP.getInt(i14) != 0) {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = true;
                } else {
                    iB29 = i14;
                    i15 = iB30;
                    z15 = false;
                }
                if (cursorP.getInt(i15) != 0) {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = true;
                } else {
                    iB30 = i15;
                    i16 = iB31;
                    z16 = false;
                }
                long j22 = cursorP.getLong(i16);
                iB31 = i16;
                int i42 = iB32;
                long j23 = cursorP.getLong(i42);
                iB32 = i42;
                int i43 = iB33;
                iB33 = i43;
                arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j12, j13, j14, new C23542f(rVarL, networkTypeE, z13, z14, z15, z16, j22, j23, u0.b(cursorP.getBlob(i43))), i18, backoffPolicyD, j15, j16, j17, j18, z12, outOfQuotaPolicyF, i26, i28, j19, i33, i35, string4));
                iB2 = i22;
                i17 = i19;
            }
            cursorP.close();
            f02.d();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorP.close();
            f02.d();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.I
    public final int v() {
        F0 f0C = F0.c(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            return cursorP.moveToFirst() ? cursorP.getInt(0) : 0;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // androidx.work.impl.model.I
    public final void w(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55860g;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final int x(long j12, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55866m;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, j12);
        iVarA.h4(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                workDatabase_Impl.s();
                return iB3;
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    @Override // androidx.work.impl.model.I
    public final ArrayList y(long j12) throws Throwable {
        F0 f02;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        F0 f0C = F0.c(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        f0C.g1(1, j12);
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        Cursor cursorP = workDatabase_Impl.p(f0C);
        try {
            iB2 = V1.b.b(cursorP, "id");
            iB3 = V1.b.b(cursorP, VoiceInfo.STATE);
            iB4 = V1.b.b(cursorP, "worker_class_name");
            iB5 = V1.b.b(cursorP, "input_merger_class_name");
            iB6 = V1.b.b(cursorP, "input");
            iB7 = V1.b.b(cursorP, "output");
            iB8 = V1.b.b(cursorP, "initial_delay");
            iB9 = V1.b.b(cursorP, "interval_duration");
            iB10 = V1.b.b(cursorP, "flex_duration");
            iB11 = V1.b.b(cursorP, "run_attempt_count");
            iB12 = V1.b.b(cursorP, "backoff_policy");
            iB13 = V1.b.b(cursorP, "backoff_delay_duration");
            iB14 = V1.b.b(cursorP, "last_enqueue_time");
            iB15 = V1.b.b(cursorP, "minimum_retention_duration");
            f02 = f0C;
        } catch (Throwable th2) {
            th = th2;
            f02 = f0C;
        }
        try {
            int iB16 = V1.b.b(cursorP, "schedule_requested_at");
            int iB17 = V1.b.b(cursorP, "run_in_foreground");
            int iB18 = V1.b.b(cursorP, "out_of_quota_policy");
            int iB19 = V1.b.b(cursorP, "period_count");
            int iB20 = V1.b.b(cursorP, "generation");
            int iB21 = V1.b.b(cursorP, "next_schedule_time_override");
            int iB22 = V1.b.b(cursorP, "next_schedule_time_override_generation");
            int iB23 = V1.b.b(cursorP, "stop_reason");
            int iB24 = V1.b.b(cursorP, "trace_tag");
            int iB25 = V1.b.b(cursorP, "required_network_type");
            int iB26 = V1.b.b(cursorP, "required_network_request");
            int iB27 = V1.b.b(cursorP, "requires_charging");
            int iB28 = V1.b.b(cursorP, "requires_device_idle");
            int iB29 = V1.b.b(cursorP, "requires_battery_not_low");
            int iB30 = V1.b.b(cursorP, "requires_storage_not_low");
            int iB31 = V1.b.b(cursorP, "trigger_content_update_delay");
            int iB32 = V1.b.b(cursorP, "trigger_max_content_delay");
            int iB33 = V1.b.b(cursorP, "content_uri_triggers");
            int i16 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                WorkInfo.State stateG = u0.g(cursorP.getInt(iB3));
                String string2 = cursorP.getString(iB4);
                String string3 = cursorP.getString(iB5);
                byte[] blob = cursorP.getBlob(iB6);
                C23544h.f55508b.getClass();
                C23544h c23544hA = C23544h.b.a(blob);
                C23544h c23544hA2 = C23544h.b.a(cursorP.getBlob(iB7));
                long j13 = cursorP.getLong(iB8);
                long j14 = cursorP.getLong(iB9);
                long j15 = cursorP.getLong(iB10);
                int i17 = cursorP.getInt(iB11);
                BackoffPolicy backoffPolicyD = u0.d(cursorP.getInt(iB12));
                long j16 = cursorP.getLong(iB13);
                long j17 = cursorP.getLong(iB14);
                int i18 = i16;
                long j18 = cursorP.getLong(i18);
                int i19 = iB2;
                int i22 = iB16;
                long j19 = cursorP.getLong(i22);
                iB16 = i22;
                int i23 = iB17;
                int i24 = cursorP.getInt(i23);
                iB17 = i23;
                int i25 = iB18;
                boolean z16 = i24 != 0;
                OutOfQuotaPolicy outOfQuotaPolicyF = u0.f(cursorP.getInt(i25));
                iB18 = i25;
                int i26 = iB19;
                int i27 = cursorP.getInt(i26);
                iB19 = i26;
                int i28 = iB20;
                int i29 = cursorP.getInt(i28);
                iB20 = i28;
                int i32 = iB21;
                long j22 = cursorP.getLong(i32);
                iB21 = i32;
                int i33 = iB22;
                int i34 = cursorP.getInt(i33);
                iB22 = i33;
                int i35 = iB23;
                int i36 = cursorP.getInt(i35);
                iB23 = i35;
                int i37 = iB24;
                String string4 = cursorP.isNull(i37) ? null : cursorP.getString(i37);
                iB24 = i37;
                int i38 = iB25;
                NetworkType networkTypeE = u0.e(cursorP.getInt(i38));
                iB25 = i38;
                int i39 = iB26;
                androidx.work.impl.utils.r rVarL = u0.l(cursorP.getBlob(i39));
                iB26 = i39;
                int i42 = iB27;
                if (cursorP.getInt(i42) != 0) {
                    iB27 = i42;
                    i12 = iB28;
                    z12 = true;
                } else {
                    iB27 = i42;
                    i12 = iB28;
                    z12 = false;
                }
                if (cursorP.getInt(i12) != 0) {
                    iB28 = i12;
                    i13 = iB29;
                    z13 = true;
                } else {
                    iB28 = i12;
                    i13 = iB29;
                    z13 = false;
                }
                if (cursorP.getInt(i13) != 0) {
                    iB29 = i13;
                    i14 = iB30;
                    z14 = true;
                } else {
                    iB29 = i13;
                    i14 = iB30;
                    z14 = false;
                }
                if (cursorP.getInt(i14) != 0) {
                    iB30 = i14;
                    i15 = iB31;
                    z15 = true;
                } else {
                    iB30 = i14;
                    i15 = iB31;
                    z15 = false;
                }
                long j23 = cursorP.getLong(i15);
                iB31 = i15;
                int i43 = iB32;
                long j24 = cursorP.getLong(i43);
                iB32 = i43;
                int i44 = iB33;
                iB33 = i44;
                arrayList.add(new H(string, stateG, string2, string3, c23544hA, c23544hA2, j13, j14, j15, new C23542f(rVarL, networkTypeE, z12, z13, z14, z15, j23, j24, u0.b(cursorP.getBlob(i44))), i17, backoffPolicyD, j16, j17, j18, j19, z16, outOfQuotaPolicyF, i27, i29, j22, i34, i36, string4));
                iB2 = i19;
                i16 = i18;
            }
            cursorP.close();
            f02.d();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorP.close();
            f02.d();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.I
    public final void z(int i12, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f55854a;
        workDatabase_Impl.b();
        O0 o02 = this.f55865l;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.g1(2, i12);
        try {
            workDatabase_Impl.c();
            try {
                iVarA.B3();
                workDatabase_Impl.s();
            } finally {
                workDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
