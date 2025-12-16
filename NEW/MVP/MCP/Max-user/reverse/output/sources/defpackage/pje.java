package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pje {
    public final Context a;
    public volatile boolean d;
    public wxf f;
    public wxf h;
    public volatile lje k;
    public volatile lje l;
    public final Object b = new Object();
    public final ssb c = new ssb(new m2(10, this));
    public final long e = System.currentTimeMillis();
    public long g = Long.MIN_VALUE;
    public long i = Long.MIN_VALUE;
    public List j = hd5.a;

    public pje(Context context) {
        this.a = context;
    }

    public static void d(pje pjeVar, boolean z, sse sseVar, int i) {
        int i2;
        lje ljeVar = null;
        if ((i & 1) != 0) {
            lje ljeVar2 = pjeVar.k;
            if (ljeVar2 == null) {
                ljeVar2 = null;
            }
            i2 = ljeVar2.f;
        } else {
            i2 = 2;
        }
        if ((i & 2) != 0) {
            lje ljeVar3 = pjeVar.k;
            if (ljeVar3 == null) {
                ljeVar3 = null;
            }
            z = ljeVar3.h;
        }
        if ((i & 4) != 0) {
            lje ljeVar4 = pjeVar.k;
            if (ljeVar4 == null) {
                ljeVar4 = null;
            }
            sseVar = ljeVar4.g;
        }
        synchronized (pjeVar.b) {
            pjeVar.b();
            lje ljeVar5 = pjeVar.k;
            if (ljeVar5 == null) {
                ljeVar5 = null;
            }
            pjeVar.k = lje.a(ljeVar5, i2, sseVar, z, 31);
            List listC = ue3.C(1, pjeVar.j);
            lje ljeVar6 = pjeVar.k;
            if (ljeVar6 != null) {
                ljeVar = ljeVar6;
            }
            ArrayList arrayListU = ue3.U(listC, ljeVar);
            pjeVar.j = arrayListU;
            pjeVar.c.u(u9j.b(arrayListU).toString(), "session_states");
            pjeVar.c.z();
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = Collections.singletonList(ue3.P(this.j));
            this.c.u(Long.valueOf(this.i), "session_state_upload_ts");
            this.c.u(u9j.b(this.j).toString(), "session_states");
            this.c.z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x00ff, B:39:0x010b, B:43:0x0122, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x00ff, B:39:0x010b, B:43:0x0122, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x00ff, B:39:0x010b, B:43:0x0122, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x00ff, B:39:0x010b, B:43:0x0122, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pje.b():void");
    }

    public final wxf c() {
        Map mapSingletonMap;
        b();
        wxf wxfVar = this.f;
        if (wxfVar == null) {
            wxfVar = null;
        }
        wxfVar.getClass();
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(new Date());
        Map map = wxfVar.m;
        if (map.isEmpty()) {
            mapSingletonMap = Collections.singletonMap("date", str);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("date", str);
            mapSingletonMap = linkedHashMap;
        }
        return wxf.a(wxfVar, false, mapSingletonMap, 12287);
    }

    public final void e(boolean z) {
        synchronized (this.b) {
            b();
            wxf wxfVar = this.f;
            if ((wxfVar == null ? null : wxfVar).k == z) {
                return;
            }
            if (wxfVar == null) {
                wxfVar = null;
            }
            wxf wxfVarA = wxf.a(wxfVar, z, null, 15359);
            this.f = wxfVarA;
            this.c.u(jo7.h(wxfVarA).toString(), "session_system_state");
            d(this, z, null, 5);
        }
    }

    public final void f(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                wxf wxfVar = this.f;
                wxf wxfVar2 = null;
                if (wxfVar == null) {
                    wxfVar = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(wxfVar.m);
                loop0: while (true) {
                    z = false;
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        String strZ = vmf.Z(32, str);
                        String strZ2 = str2 != null ? vmf.Z(64, str2) : null;
                        if (fni.a(linkedHashMap.get(strZ), strZ2)) {
                            break;
                        }
                        if (strZ2 != null) {
                            linkedHashMap.put(strZ, strZ2);
                        } else {
                            linkedHashMap.remove(strZ);
                        }
                        z = true;
                    }
                }
                if (z) {
                    wxf wxfVar3 = this.f;
                    if (wxfVar3 != null) {
                        wxfVar2 = wxfVar3;
                    }
                    wxf wxfVarA = wxf.a(wxfVar2, false, linkedHashMap, 12287);
                    this.f = wxfVarA;
                    this.c.u(jo7.h(wxfVarA).toString(), "session_system_state");
                    this.c.z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(int i) {
        b();
        lje ljeVar = this.l;
        if (ljeVar != null) {
            synchronized (this.b) {
                b();
                lje ljeVarA = lje.a(ljeVar, i, null, false, 223);
                this.l = ljeVarA;
                if (this.j.size() <= 1) {
                    return;
                }
                ArrayList arrayListU = ue3.U(ue3.U(ue3.C(2, this.j), ljeVarA), ue3.P(this.j));
                this.j = arrayListU;
                this.c.u(u9j.b(arrayListU).toString(), "session_states");
                this.c.z();
            }
        }
    }
}
