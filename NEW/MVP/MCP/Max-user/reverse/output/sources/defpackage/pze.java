package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class pze {
    public final b7d a;
    public final y6d b;
    public final oze g;
    public final o64 p;
    public boolean r;
    public boolean s;
    public volatile long t;
    public volatile long u;
    public final boolean v;
    public final boolean w;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();
    public boolean q = true;
    public final int o = 5;
    public final int n = 30000;

    public pze(oze ozeVar, p64 p64Var, y6d y6dVar, b7d b7dVar, boolean z, boolean z2) {
        this.g = ozeVar;
        this.p = p64Var;
        this.b = y6dVar;
        this.a = b7dVar;
        this.v = z;
        this.w = z2;
        ozeVar.registerListener(new zkb(14, this));
    }

    public final c9i a(tze tzeVar, long j) {
        try {
            return new c9i(tzeVar.a().put("sequence", j).toString(), j);
        } catch (JSONException e) {
            this.b.reportException("OKSignaling", "signaling.create.command", e);
            return null;
        }
    }

    public final j9i b(long j) {
        j9i j9iVar;
        synchronized (this.f) {
            try {
                int iIndexOfKey = this.i.indexOfKey(j);
                if (iIndexOfKey >= 0) {
                    j9iVar = (j9i) this.i.valueAt(iIndexOfKey);
                    this.i.removeAt(iIndexOfKey);
                } else {
                    j9iVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j9iVar;
    }

    public final void c(tze tzeVar, mze mzeVar, mze mzeVar2) {
        synchronized (this.f) {
            try {
                this.b.log("OKSignaling", "<!> postpone send " + tzeVar);
                if (this.w && e(tzeVar, mzeVar, mzeVar2)) {
                    return;
                }
                c9i c9iVarA = a(tzeVar, this.e.getAndIncrement());
                if (c9iVarA == null) {
                    return;
                }
                this.h.add(new j9i(this, tzeVar, c9iVarA, mzeVar, mzeVar2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.tze r11, boolean r12, defpackage.mze r13, defpackage.mze r14) {
        /*
            r10 = this;
            java.lang.Object r1 = r10.f
            monitor-enter(r1)
            boolean r0 = r10.v     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L13
            boolean r4 = r10.r     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L13
            r4 = r3
            goto L14
        Lf:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L54
        L13:
            r4 = r2
        L14:
            if (r0 == 0) goto L1b
            boolean r0 = r10.s     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L1b
            r2 = r3
        L1b:
            if (r4 != 0) goto L27
            if (r2 != 0) goto L27
            if (r12 == 0) goto L22
            goto L27
        L22:
            r10.c(r11, r13, r14)     // Catch: java.lang.Throwable -> Lf
            r5 = r10
            goto L4c
        L27:
            java.util.concurrent.atomic.AtomicLong r12 = r10.e     // Catch: java.lang.Throwable -> L51
            long r2 = r12.getAndIncrement()     // Catch: java.lang.Throwable -> L51
            c9i r7 = r10.a(r11, r2)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        L35:
            j9i r4 = new j9i     // Catch: java.lang.Throwable -> L51
            r5 = r10
            r6 = r11
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4e
            android.util.LongSparseArray r11 = r5.i     // Catch: java.lang.Throwable -> L4e
            long r12 = r7.b     // Catch: java.lang.Throwable -> L4e
            r11.put(r12, r4)     // Catch: java.lang.Throwable -> L4e
            oze r11 = r5.g     // Catch: java.lang.Throwable -> L4e
            java.lang.String r12 = r7.a     // Catch: java.lang.Throwable -> L4e
            r11.send(r12)     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            return
        L4e:
            r0 = move-exception
        L4f:
            r11 = r0
            goto L54
        L51:
            r0 = move-exception
            r5 = r10
            goto L4f
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pze.d(tze, boolean, mze, mze):void");
    }

    public final boolean e(tze tzeVar, mze mzeVar, mze mzeVar2) {
        Object yzeVar;
        pze pzeVar;
        String strOptString;
        j9i j9iVar = null;
        qg9 qg9Var = tzeVar instanceof vze ? new qg9((vze) tzeVar, 1) : tzeVar instanceof uze ? new qg9((uze) tzeVar, 0) : null;
        if (qg9Var != null) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            while (size > 0) {
                if (size <= 0) {
                    throw new IndexOutOfBoundsException("No more elements in the list");
                }
                size--;
                tze tzeVar2 = ((j9i) arrayList.get(size)).a;
                switch (qg9Var.a) {
                    case 0:
                        if (!(tzeVar2 instanceof uze)) {
                            yzeVar = wze.a;
                            break;
                        } else {
                            yzeVar = new yze((uze) qg9Var.b);
                            break;
                        }
                    default:
                        if (!(tzeVar2 instanceof vze)) {
                            yzeVar = wze.a;
                            break;
                        } else {
                            yzeVar = new yze((vze) qg9Var.b);
                            break;
                        }
                }
                if (!yzeVar.equals(wze.a)) {
                    if (!(yzeVar instanceof yze)) {
                        if (yzeVar.equals(xze.a)) {
                            return true;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    tze tzeVar3 = ((yze) yzeVar).a;
                    j9i j9iVar2 = (j9i) arrayList.get(size);
                    c9i c9iVarA = a(tzeVar3, j9iVar2.b);
                    if (c9iVarA == null) {
                        pzeVar = this;
                    } else {
                        pzeVar = this;
                        j9iVar = new j9i(pzeVar, tzeVar3, c9iVarA, mzeVar, mzeVar2);
                    }
                    if (j9iVar == null) {
                        return false;
                    }
                    try {
                        if (j9iVar2.e != null) {
                            j9iVar2.f.c.post(new m1h(15, j9iVar2));
                        }
                    } catch (Throwable th) {
                        try {
                            strOptString = j9iVar2.a.a().optString("command");
                        } catch (JSONException unused) {
                            strOptString = "";
                        }
                        pzeVar.b.logException("SignalingCommandQueueIterator", "Error on discard command " + strOptString, th);
                    }
                    arrayList.set(size, j9iVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(final JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        long jOptLong = jSONObject.optLong("stamp", 0L);
        if (jOptLong != 0) {
            this.t = Math.max(jOptLong, this.t);
        }
        if (string.equals("response")) {
            String strOptString = jSONObject.optString("response", null);
            long j = jSONObject.getLong("sequence");
            if (!"recover".equals(strOptString) || this.v) {
                j9i j9iVarB = b(j);
                final mze mzeVar = j9iVarB != null ? j9iVarB.d : null;
                if (mzeVar != null) {
                    final int i = 0;
                    this.c.post(new Runnable(this) { // from class: lze
                        public final /* synthetic */ pze b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    mze mzeVar2 = mzeVar;
                                    pze pzeVar = this.b;
                                    y6d y6dVar = pzeVar.b;
                                    try {
                                        boolean z = mzeVar2 instanceof v8i;
                                        JSONObject jSONObject2 = jSONObject;
                                        if (z) {
                                            ((v8i) mzeVar2).onResponse(jSONObject2);
                                        } else if (pzeVar.q) {
                                            mzeVar2.onResponse(jSONObject2);
                                        } else {
                                            y6dVar.log("OKSignaling", "<!> ignoring " + jSONObject2);
                                        }
                                        break;
                                    } catch (Exception e) {
                                        y6dVar.reportException("OKSignaling", "signaling.response", e);
                                        return;
                                    }
                                default:
                                    mze mzeVar3 = mzeVar;
                                    pze pzeVar2 = this.b;
                                    y6d y6dVar2 = pzeVar2.b;
                                    try {
                                        boolean z2 = mzeVar3 instanceof v8i;
                                        JSONObject jSONObject3 = jSONObject;
                                        if (z2) {
                                            ((v8i) mzeVar3).onResponse(jSONObject3);
                                        } else if (pzeVar2.q) {
                                            mzeVar3.onResponse(jSONObject3);
                                        } else {
                                            y6dVar2.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                        }
                                        break;
                                    } catch (Exception e2) {
                                        y6dVar2.reportException("OKSignaling", "signaling.response", e2);
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    f(jSONArrayOptJSONArray.getJSONObject(i2));
                }
            }
            synchronized (this.f) {
                for (int i3 = 0; i3 < this.i.size(); i3++) {
                    try {
                        c9i c9iVar = ((j9i) this.i.valueAt(i3)).c;
                        if (c9iVar.b <= j) {
                            this.g.send(c9iVar.a);
                        }
                    } finally {
                    }
                }
            }
            return;
        }
        if (string.equals("notification")) {
            if ("connection".equals(jSONObject.getString("notification"))) {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recoverMessages");
                if (jSONArrayOptJSONArray2 != null && this.v) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                        f(jSONArrayOptJSONArray2.getJSONObject(i4));
                    }
                }
                String string2 = jSONObject.getJSONObject("conversation").getString("id");
                this.b.log("OKSignaling", ctd.j(new StringBuilder("cur cid="), ((p64) this.p).a, ", new cid=", string2));
                o64 o64Var = this.p;
                if (o64Var instanceof p64) {
                    ((p64) o64Var).a = string2;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("conversationParams");
                if (jSONObjectOptJSONObject != null) {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("activityTimeout", -1L);
                    if (jOptLong2 > 0) {
                        this.g.updateActivityTimeout(jOptLong2);
                    }
                }
                synchronized (this.f) {
                    this.s = true;
                    if (!this.r || this.v) {
                        this.r = true;
                        while (!this.h.isEmpty()) {
                            j9i j9iVar = (j9i) this.h.remove(0);
                            c9i c9iVar2 = j9iVar.c;
                            this.b.log("OKSignaling", "send postponed " + c9iVar2);
                            c9i c9iVar3 = j9iVar.c;
                            this.i.put(c9iVar3.b, j9iVar);
                            this.g.send(c9iVar3.a);
                        }
                    } else {
                        long j2 = this.u;
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("stamp", j2);
                            c9i c9iVarA = a(paj.b(jSONObject2, "recover"), this.e.getAndIncrement());
                            if (c9iVarA != null) {
                                this.g.send(c9iVarA.a);
                            }
                        } catch (JSONException e) {
                            this.b.reportException("OKSignaling", "signaling.recover", e);
                        }
                    }
                }
            }
            this.c.post(new aee(this, 13, jSONObject));
            return;
        }
        if (string.equals(NegotiationErrorStat.KEY_ERROR)) {
            if (!jSONObject.has("sequence")) {
                this.c.post(new zcd(this, jSONObject, "listener.response.error", 7));
                return;
            }
            long j3 = jSONObject.getLong("sequence");
            j9i j9iVarB2 = b(j3);
            final mze mzeVar2 = j9iVarB2 == null ? null : j9iVarB2.e;
            if (mzeVar2 != null) {
                final int i5 = 1;
                this.c.post(new Runnable(this) { // from class: lze
                    public final /* synthetic */ pze b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                mze mzeVar22 = mzeVar2;
                                pze pzeVar = this.b;
                                y6d y6dVar = pzeVar.b;
                                try {
                                    boolean z = mzeVar22 instanceof v8i;
                                    JSONObject jSONObject22 = jSONObject;
                                    if (z) {
                                        ((v8i) mzeVar22).onResponse(jSONObject22);
                                    } else if (pzeVar.q) {
                                        mzeVar22.onResponse(jSONObject22);
                                    } else {
                                        y6dVar.log("OKSignaling", "<!> ignoring " + jSONObject22);
                                    }
                                    break;
                                } catch (Exception e2) {
                                    y6dVar.reportException("OKSignaling", "signaling.response", e2);
                                    return;
                                }
                            default:
                                mze mzeVar3 = mzeVar2;
                                pze pzeVar2 = this.b;
                                y6d y6dVar2 = pzeVar2.b;
                                try {
                                    boolean z2 = mzeVar3 instanceof v8i;
                                    JSONObject jSONObject3 = jSONObject;
                                    if (z2) {
                                        ((v8i) mzeVar3).onResponse(jSONObject3);
                                    } else if (pzeVar2.q) {
                                        mzeVar3.onResponse(jSONObject3);
                                    } else {
                                        y6dVar2.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                    }
                                    break;
                                } catch (Exception e22) {
                                    y6dVar2.reportException("OKSignaling", "signaling.response", e22);
                                    return;
                                }
                        }
                    }
                });
            }
            String string3 = jSONObject.getString(NegotiationErrorStat.KEY_ERROR);
            if (!"service-unavailable".equals(string3)) {
                this.a.log(hcf.app_event, "rtc.cmd.error." + string3, (String) null);
                this.c.post(new zcd(this, jSONObject, "signaling.listener.response.error.seq", 7));
                return;
            }
            this.a.log(hcf.app_event, "rtc.cmd.service.unavailable", (String) null);
            if (!jSONObject.optBoolean("recoverable", false)) {
                this.c.post(new zcd(this, jSONObject, "signaling.listener.response.error.seq", 7));
                return;
            }
            synchronized (this.f) {
                try {
                    int iIndexOfKey = this.i.indexOfKey(j3);
                    j9i j9iVar2 = iIndexOfKey >= 0 ? (j9i) this.i.valueAt(iIndexOfKey) : null;
                    if (j9iVar2 != null) {
                        c9i c9iVar4 = j9iVar2.c;
                        long j4 = c9iVar4.d + 1;
                        c9iVar4.d = j4;
                        if (j4 >= this.o) {
                            this.b.log("OKSignaling", "<!> quit retrying " + ((p64) this.p).a + " " + c9iVar4);
                            this.b.reportException("OKSignaling", "signaling.retry", new RuntimeException("retry.fail"));
                            this.i.removeAt(iIndexOfKey);
                            return;
                        }
                        c5e c5eVar = new c5e(this, c9iVar4, false, 9);
                        this.j.add(c5eVar);
                        this.b.log("OKSignaling", "<!> retrying " + c9iVar4);
                        this.d.postDelayed(c5eVar, c9iVar4.c);
                        long j5 = c9iVar4.c * 2;
                        c9iVar4.c = j5;
                        c9iVar4.c = Math.min(j5, this.n);
                    }
                } finally {
                }
            }
        }
    }

    public final void g() {
        this.g.dispose();
        synchronized (this.f) {
            try {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.d.removeCallbacks((Runnable) obj);
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(fr6 fr6Var, mze mzeVar) {
        d(fr6Var, false, mzeVar, null);
    }

    public final void i(tze tzeVar) {
        d(tzeVar, false, null, null);
    }

    public final void j(JSONObject jSONObject, mze mzeVar, mze mzeVar2) {
        d(new fr6(jSONObject), false, mzeVar, mzeVar2);
    }
}
