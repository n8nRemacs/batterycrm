package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.C23542f;
import androidx.work.G;
import androidx.work.NetworkType;
import androidx.work.X;
import androidx.work.impl.C23613x;
import androidx.work.impl.InterfaceC23551f;
import androidx.work.impl.InterfaceC23614y;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.model.C23574p;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.model.o0;
import j.N;
import j.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommandHandler.java */
@RestrictTo
/* loaded from: classes10.dex */
public class b implements InterfaceC23551f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f55606g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55607b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f55608c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f55609d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final X f55610e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC23614y f55611f;

    static {
        G.b("CommandHandler");
    }

    public b(@N Context context, X x12, @N InterfaceC23614y interfaceC23614y) {
        this.f55607b = context;
        this.f55610e = x12;
        this.f55611f = interfaceC23614y;
    }

    public static C23580w b(@N Intent intent) {
        return new C23580w(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(@N Intent intent, @N C23580w c23580w) {
        intent.putExtra("KEY_WORKSPEC_ID", c23580w.f55889a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c23580w.f55890b);
    }

    @l0
    public final void a(int i12, @N Intent intent, @N f fVar) {
        List<C23613x> listRemove;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            G gA2 = G.a();
            intent.toString();
            gA2.getClass();
            c cVar = new c(this.f55607b, this.f55610e, i12, fVar);
            ArrayList arrayListA = fVar.f55638f.f55559d.A().A();
            int i13 = ConstraintProxy.f55598a;
            Iterator it = arrayListA.iterator();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (it.hasNext()) {
                C23542f c23542f = ((H) it.next()).f55804j;
                z12 |= c23542f.f55491e;
                z13 |= c23542f.f55489c;
                z14 |= c23542f.f55492f;
                z15 |= c23542f.f55487a != NetworkType.f55395b;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            int i14 = ConstraintProxyUpdateReceiver.f55599a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = cVar.f55613a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListA.size());
            cVar.f55614b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListA.iterator();
            while (it2.hasNext()) {
                H h12 = (H) it2.next();
                if (jCurrentTimeMillis >= h12.a() && (!h12.c() || cVar.f55616d.a(h12))) {
                    arrayList.add(h12);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                H h13 = (H) it3.next();
                String str = h13.f55795a;
                C23580w c23580wA = o0.a(h13);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, c23580wA);
                G gA3 = G.a();
                int i15 = c.f55612e;
                gA3.getClass();
                fVar.f55635c.f56031d.execute(new f.b(cVar.f55615c, intent3, fVar));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            G gA4 = G.a();
            intent.toString();
            gA4.getClass();
            fVar.f55638f.i();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            G.a().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C23580w c23580wB = b(intent);
            G gA5 = G.a();
            c23580wB.toString();
            gA5.getClass();
            WorkDatabase workDatabase = fVar.f55638f.f55559d;
            workDatabase.c();
            try {
                H hI2 = workDatabase.A().i(c23580wB.f55889a);
                if (hI2 == null) {
                    G gA6 = G.a();
                    c23580wB.toString();
                    gA6.getClass();
                } else if (hI2.f55796b.a()) {
                    G gA7 = G.a();
                    c23580wB.toString();
                    gA7.getClass();
                } else {
                    long jA2 = hI2.a();
                    boolean zC2 = hI2.c();
                    Context context2 = this.f55607b;
                    if (zC2) {
                        G gA8 = G.a();
                        c23580wB.toString();
                        gA8.getClass();
                        a.b(context2, workDatabase, c23580wB, jA2);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        fVar.f55635c.f56031d.execute(new f.b(i12, intent4, fVar));
                    } else {
                        G gA9 = G.a();
                        c23580wB.toString();
                        gA9.getClass();
                        a.b(context2, workDatabase, c23580wB, jA2);
                    }
                    workDatabase.s();
                }
                return;
            } finally {
                workDatabase.l();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f55609d) {
                try {
                    C23580w c23580wB2 = b(intent);
                    G gA10 = G.a();
                    c23580wB2.toString();
                    gA10.getClass();
                    if (this.f55608c.containsKey(c23580wB2)) {
                        G gA11 = G.a();
                        c23580wB2.toString();
                        gA11.getClass();
                    } else {
                        e eVar = new e(this.f55607b, i12, fVar, this.f55611f.d(c23580wB2));
                        this.f55608c.put(c23580wB2, eVar);
                        eVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                G gA12 = G.a();
                intent.toString();
                gA12.getClass();
                return;
            } else {
                C23580w c23580wB3 = b(intent);
                boolean z16 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                G gA13 = G.a();
                intent.toString();
                gA13.getClass();
                onExecuted(c23580wB3, z16);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        InterfaceC23614y interfaceC23614y = this.f55611f;
        if (zContainsKey) {
            int i16 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C23613x c23613xA = interfaceC23614y.a(new C23580w(string, i16));
            listRemove = arrayList2;
            if (c23613xA != null) {
                arrayList2.add(c23613xA);
                listRemove = arrayList2;
            }
        } else {
            listRemove = interfaceC23614y.remove(string);
        }
        for (C23613x c23613x : listRemove) {
            G.a().getClass();
            fVar.f55644l.b(c23613x);
            WorkDatabase workDatabase2 = fVar.f55638f.f55559d;
            C23580w c23580w = c23613x.f56084a;
            int i17 = a.f55605a;
            InterfaceC23575q interfaceC23575qX = workDatabase2.x();
            C23574p c23574pF = interfaceC23575qX.f(c23580w);
            if (c23574pF != null) {
                a.a(this.f55607b, c23580w, c23574pF.f55878c);
                G gA14 = G.a();
                c23580w.toString();
                gA14.getClass();
                interfaceC23575qX.d(c23580w);
            }
            fVar.onExecuted(c23613x.f56084a, false);
        }
    }

    @Override // androidx.work.impl.InterfaceC23551f
    public final void onExecuted(@N C23580w c23580w, boolean z12) {
        synchronized (this.f55609d) {
            try {
                e eVar = (e) this.f55608c.remove(c23580w);
                this.f55611f.a(c23580w);
                if (eVar != null) {
                    eVar.f(z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
