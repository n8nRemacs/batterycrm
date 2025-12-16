package defpackage;

import android.content.Context;
import android.text.SpannableString;
import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class h8c implements mje {
    public static final /* synthetic */ yy7[] v0;
    public final k18 X;
    public final k18 Y;
    public final ContextScope Z;
    public final tw0 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf o;
    public final jve s0 = kve.b(0, 0, 7);
    public final t9f t0 = c7j.c();
    public final AtomicBoolean u0 = new AtomicBoolean(false);

    static {
        z8a z8aVar = new z8a(h8c.class, "presencesJob", "getPresencesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        v0 = new yy7[]{z8aVar};
    }

    public h8c(k18 k18Var, k18 k18Var2, k18 k18Var3, tw0 tw0Var, k18 k18Var4, k18 k18Var5, lzf lzfVar, bwf bwfVar) {
        this.a = tw0Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = bwfVar;
        this.X = k18Var4;
        this.Y = k18Var5;
        this.Z = d7j.a(((q2b) lzfVar).a());
    }

    public final CharSequence a(long j, boolean z, b8c b8cVar) {
        int i;
        if (b8cVar == null) {
            b8cVar = c().a(j);
        }
        int i2 = b8cVar.b;
        k18 k18Var = this.c;
        if (!z || (i = b8cVar.a) == 50) {
            long j2 = i2 * 1000;
            Context context = ((f7b) k18Var.getValue()).a;
            return mf4.n(TimeZone.getDefault()).m().p(7).compareTo(mf4.i(j2, TimeZone.getDefault()).m()) >= 0 ? context.getString(c5d.noncontact_presence) : context.getString(c5d.presence_unknown_date);
        }
        if (i == 40) {
            Context context2 = ((f7b) k18Var.getValue()).a;
            String string = context2.getString(c5d.tt_contact_status_online);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new l7g(a93.s0.x(context2).k(), new dga(14)), 0, string.length(), 33);
            return spannableString;
        }
        f7b f7bVar = (f7b) k18Var.getValue();
        long j3 = i2 * 1000;
        pe8 pe8Var = f7bVar.c;
        y21 y21VarE = ml6.e(j3, pe8Var.j());
        Context context3 = f7bVar.a;
        Locale localeU = pe8Var.u();
        String[] strArr = l6g.b;
        int i3 = y21VarE.b;
        long j4 = y21VarE.c;
        switch (az1.v(i3)) {
            case 0:
                return context3.getString(c5d.tt_dates_right_now);
            case 1:
                return context3.getString(c5d.tt_dates_minutes_last_seen, Integer.valueOf((int) j4));
            case 2:
                return context3.getString(c5d.tt_dates_hours_last_seen, Integer.valueOf((int) j4));
            case 3:
                return j4 == 0 ? context3.getString(c5d.tt_dates_yesterday_at_last_seen_no_time) : String.format(context3.getString(c5d.tt_dates_yesterday_at), ml6.b(context3, j4, localeU));
            case 4:
                return context3.getString(c5d.tt_dates_days_last_seen, Integer.valueOf((int) j4));
            case 5:
                return context3.getString(c5d.tt_dates_weeks_last_seen, Integer.valueOf((int) j4));
            case 6:
                return context3.getString(c5d.tt_dates_months_last_seen, Integer.valueOf((int) j4));
            case 7:
            case 8:
                return context3.getString(c5d.tt_dates_full_last_seen_u, ml6.g(localeU, j4, az1.c(i3, 8)));
            case 9:
                return context3.getString(c5d.presence_unknown_date);
            default:
                return "";
        }
    }

    public final CharSequence b(ku3 ku3Var) {
        return a(ku3Var.p(), ku3Var.d(), null);
    }

    public final f8c c() {
        return (f8c) this.b.getValue();
    }

    @Override // defpackage.mje
    public final void d(int i) {
        AtomicBoolean atomicBoolean = this.u0;
        if (i != 1) {
            atomicBoolean.set(true);
        } else if (atomicBoolean.get()) {
            f();
            atomicBoolean.set(false);
        }
    }

    public final qt7 e() {
        return (qt7) this.t0.D(this, v0[0]);
    }

    public final void f() {
        wqi.c("PresenceController", "moveOnlineToLastSeen", new Object[0]);
        us usVar = new us(0);
        int iJ = (int) (((w4e) ((pb3) this.d.getValue())).j() / 1000);
        Iterator it = ((ps) c().d().entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long jLongValue = ((Number) entry.getKey()).longValue();
            int i = ((b8c) entry.getValue()).a;
            if (i != 0 && i != 50) {
                usVar.put(Long.valueOf(jLongValue), new b8c(0, iJ));
            }
        }
        g(0L, usVar);
    }

    public final void g(long j, Map map) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "PresenceController", ho7.f(map.size(), "onContactPresence, presence.count() = "), null);
            }
        }
        if (map.isEmpty()) {
            return;
        }
        i(map);
        if (j > 0) {
            w4e w4eVar = (w4e) ((pb3) this.d.getValue());
            if (j > w4eVar.w()) {
                w4eVar.k0.O(w4eVar, w4e.m0[54], Long.valueOf(j));
            }
        }
    }

    public final void h(kka kkaVar) {
        int i;
        qt7 qt7VarE;
        qt7 qt7VarE2;
        ConcurrentHashMap concurrentHashMap = c().d;
        if (concurrentHashMap.isEmpty()) {
            i = 0;
        } else {
            Iterator it = concurrentHashMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((f9a) ((Map.Entry) it.next()).getValue()).getValue() != null) {
                    i++;
                }
            }
        }
        long j = 0;
        long j2 = i < 500 ? 0L : i < 1000 ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : WorkRequest.MIN_BACKOFF_MILLIS;
        if (j2 > 0 && (e() == null || ((qt7VarE2 = e()) != null && !qt7VarE2.isActive()))) {
            this.t0.O(this, v0[0], svi.e(this.Z, null, i84.b, new g8c(this, j2, null), 1));
        }
        if (e() != null && (qt7VarE = e()) != null && qt7VarE.isActive()) {
            wqi.c("PresenceController", "onNotifPresence: post to subject", new Object[0]);
            this.s0.h(kkaVar);
            return;
        }
        List<kka> listSingletonList = Collections.singletonList(kkaVar);
        if (listSingletonList.isEmpty()) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "PresenceController", "onNotifPresence: " + listSingletonList + ".size", null);
            }
        }
        us usVar = new us(listSingletonList.size());
        for (kka kkaVar2 : listSingletonList) {
            usVar.put(Long.valueOf(kkaVar2.c), po8.j(kkaVar2.d));
            long j3 = kkaVar2.o;
            if (j3 > j) {
                j = j3;
            }
        }
        w4e w4eVar = (w4e) ((pb3) this.d.getValue());
        if (j > w4eVar.w()) {
            w4eVar.k0.O(w4eVar, w4e.m0[54], Long.valueOf(j));
        }
        i(usVar);
    }

    public final void i(Map map) {
        if (!this.u0.get()) {
            us usVar = new us(map.size());
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                b8c b8cVar = (b8c) entry.getValue();
                int i = b8cVar.a;
                Integer numValueOf = Integer.valueOf(i);
                if (i != 50) {
                    numValueOf = null;
                }
                usVar.put(Long.valueOf(jLongValue), new b8c(numValueOf != null ? numValueOf.intValue() : 0, b8cVar.b));
            }
            map = usVar;
        }
        f8c f8cVarC = c();
        f8cVarC.getClass();
        n8a n8aVar = new n8a(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            long jLongValue2 = ((Number) entry2.getKey()).longValue();
            b8c b8cVar2 = (b8c) entry2.getValue();
            n8aVar.a(jLongValue2);
            f8cVarC.f(jLongValue2, b8cVar2);
        }
        ((Executor) f8cVarC.c.getValue()).execute(new d8c(f8cVarC, 0, n8aVar));
        this.a.c(new t24(map.keySet()));
    }
}
