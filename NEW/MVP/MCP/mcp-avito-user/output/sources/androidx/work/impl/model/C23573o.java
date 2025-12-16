package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.H;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RawWorkInfoDao_Impl.java */
/* renamed from: androidx.work.impl.model.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23573o implements InterfaceC23568j {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f55875a;

    public C23573o(@j.N WorkDatabase_Impl workDatabase_Impl) {
        this.f55875a = workDatabase_Impl;
    }

    @Override // androidx.work.impl.model.InterfaceC23568j
    public final ArrayList a(Z1.b bVar) {
        C23544h c23544hA;
        long j12;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        WorkDatabase_Impl workDatabase_Impl = this.f55875a;
        workDatabase_Impl.b();
        Cursor cursorB = V1.c.b(workDatabase_Impl, bVar, true);
        try {
            int iA2 = V1.b.a(cursorB, "id");
            int iA3 = V1.b.a(cursorB, VoiceInfo.STATE);
            int iA4 = V1.b.a(cursorB, "output");
            int iA5 = V1.b.a(cursorB, "initial_delay");
            int iA6 = V1.b.a(cursorB, "interval_duration");
            int iA7 = V1.b.a(cursorB, "flex_duration");
            int iA8 = V1.b.a(cursorB, "run_attempt_count");
            int iA9 = V1.b.a(cursorB, "backoff_policy");
            int iA10 = V1.b.a(cursorB, "backoff_delay_duration");
            int iA11 = V1.b.a(cursorB, "last_enqueue_time");
            int iA12 = V1.b.a(cursorB, "period_count");
            int iA13 = V1.b.a(cursorB, "generation");
            int iA14 = V1.b.a(cursorB, "next_schedule_time_override");
            int iA15 = V1.b.a(cursorB, "stop_reason");
            int iA16 = V1.b.a(cursorB, "required_network_type");
            int iA17 = V1.b.a(cursorB, "required_network_request");
            int iA18 = V1.b.a(cursorB, "requires_charging");
            int iA19 = V1.b.a(cursorB, "requires_device_idle");
            int iA20 = V1.b.a(cursorB, "requires_battery_not_low");
            int iA21 = V1.b.a(cursorB, "requires_storage_not_low");
            int iA22 = V1.b.a(cursorB, "trigger_content_update_delay");
            int iA23 = V1.b.a(cursorB, "trigger_max_content_delay");
            int iA24 = V1.b.a(cursorB, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i14 = iA14;
            HashMap<String, ArrayList<C23544h>> map2 = new HashMap<>();
            while (cursorB.moveToNext()) {
                int i15 = iA13;
                String string = cursorB.getString(iA2);
                if (map.containsKey(string)) {
                    i13 = iA12;
                } else {
                    i13 = iA12;
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorB.getString(iA2);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                iA13 = i15;
                iA12 = i13;
            }
            int i16 = iA12;
            int i17 = iA13;
            cursorB.moveToPosition(-1);
            c(map);
            b(map2);
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string3 = iA2 == -1 ? null : cursorB.getString(iA2);
                WorkInfo.State stateG = iA3 == -1 ? null : u0.g(cursorB.getInt(iA3));
                if (iA4 == -1) {
                    c23544hA = null;
                } else {
                    byte[] blob = cursorB.getBlob(iA4);
                    C23544h.f55508b.getClass();
                    c23544hA = C23544h.b.a(blob);
                }
                long j13 = iA5 == -1 ? 0L : cursorB.getLong(iA5);
                long j14 = iA6 == -1 ? 0L : cursorB.getLong(iA6);
                long j15 = iA7 == -1 ? 0L : cursorB.getLong(iA7);
                boolean z15 = false;
                int i18 = iA8 == -1 ? 0 : cursorB.getInt(iA8);
                BackoffPolicy backoffPolicyD = iA9 == -1 ? null : u0.d(cursorB.getInt(iA9));
                long j16 = iA10 == -1 ? 0L : cursorB.getLong(iA10);
                if (iA11 == -1) {
                    i12 = i16;
                    j12 = 0;
                } else {
                    j12 = cursorB.getLong(iA11);
                    i12 = i16;
                }
                int i19 = i12 == -1 ? 0 : cursorB.getInt(i12);
                int i22 = i17;
                int i23 = i12;
                int i24 = i22 == -1 ? 0 : cursorB.getInt(i22);
                int i25 = i14;
                long j17 = i25 == -1 ? 0L : cursorB.getLong(i25);
                int i26 = iA15;
                int i27 = i26 == -1 ? 0 : cursorB.getInt(i26);
                int i28 = iA16;
                NetworkType networkTypeE = i28 == -1 ? null : u0.e(cursorB.getInt(i28));
                int i29 = iA17;
                androidx.work.impl.utils.r rVarL = i29 == -1 ? null : u0.l(cursorB.getBlob(i29));
                int i32 = iA18;
                if (i32 == -1) {
                    z12 = false;
                } else {
                    z12 = cursorB.getInt(i32) != 0;
                }
                int i33 = iA19;
                if (i33 == -1) {
                    z13 = false;
                } else {
                    z13 = cursorB.getInt(i33) != 0;
                }
                int i34 = iA20;
                if (i34 == -1) {
                    z14 = false;
                } else {
                    z14 = cursorB.getInt(i34) != 0;
                }
                int i35 = iA21;
                if (i35 != -1 && cursorB.getInt(i35) != 0) {
                    z15 = true;
                }
                boolean z16 = z15;
                int i36 = iA22;
                long j18 = i36 == -1 ? 0L : cursorB.getLong(i36);
                int i37 = iA23;
                long j19 = i37 != -1 ? cursorB.getLong(i37) : 0L;
                int i38 = iA24;
                arrayList.add(new H.c(string3, stateG, c23544hA, j13, j14, j15, new C23542f(rVarL, networkTypeE, z12, z13, z14, z16, j18, j19, i38 == -1 ? null : u0.b(cursorB.getBlob(i38))), i18, backoffPolicyD, j16, j12, i19, i24, j17, i27, map.get(cursorB.getString(iA2)), map2.get(cursorB.getString(iA2))));
                i16 = i23;
                i17 = i22;
                i14 = i25;
                iA15 = i26;
                iA16 = i28;
                iA17 = i29;
                iA18 = i32;
                iA19 = i33;
                iA20 = i34;
                iA21 = i35;
                iA22 = i36;
                iA23 = i37;
                iA24 = i38;
            }
            cursorB.close();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            throw th2;
        }
    }

    public final void b(@j.N HashMap<String, ArrayList<C23544h>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            V1.f.a(map, new C23570l(this, 1));
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
        Cursor cursorP = this.f55875a.p(f0C);
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

    public final void c(@j.N HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            V1.f.a(map, new C23570l(this, 0));
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
        Cursor cursorP = this.f55875a.p(f0C);
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
}
