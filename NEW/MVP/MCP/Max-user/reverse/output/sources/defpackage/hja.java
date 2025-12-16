package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class hja {
    public final z7c a;
    public final tw0 b;
    public final k18 c;
    public final k18 d;

    public hja(z7c z7cVar, tw0 tw0Var, k18 k18Var, k18 k18Var2) {
        this.a = z7cVar;
        this.b = tw0Var;
        this.c = k18Var;
        this.d = k18Var2;
    }

    public final void a(po3 po3Var, n8a n8aVar) {
        wqi.c("NotifConfigLogic", "onChatsAndFolders: step 1: chats", new Object[0]);
        Map map = po3Var.c;
        xs xsVar = new xs(0);
        tw0 tw0Var = this.b;
        if (map != null) {
            xs xsVar2 = new xs(0);
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                fy2 fy2Var = (fy2) entry.getValue();
                k18 k18Var = this.c;
                pb2 pb2VarJ = ((ve2) k18Var.getValue()).J(jLongValue);
                if (pb2VarJ == null) {
                    ve2 ve2Var = (ve2) k18Var.getValue();
                    ve2Var.getClass();
                    af2 af2Var = new af2();
                    af2Var.b = pf2.b;
                    af2Var.a = jLongValue;
                    af2Var.l = jLongValue;
                    af2Var.c = of2.d;
                    af2Var.o0 = 2;
                    long jE = ((ie4) ve2Var.m.get()).b.e(new rf2(af2Var));
                    ve2Var.e0(jE, ve2Var.h0(jE));
                    pb2VarJ = ve2Var.q0(jE, false);
                }
                long j = pb2VarJ.a;
                xsVar.add(Long.valueOf(jLongValue));
                if (!n8aVar.d(j)) {
                    ve2 ve2Var2 = (ve2) k18Var.getValue();
                    ve2Var2.getClass();
                    wqi.c("ve2", "changeChatConfiguration, chatId = %d, chatSettings = %s", Long.valueOf(j), fy2Var);
                    ve2Var2.r(j, false, new g6(5, fy2Var));
                    xsVar2.add(Long.valueOf(j));
                }
            }
            if (!xsVar2.isEmpty()) {
                tw0Var.c(new n73(xsVar2, true, false, null, null, 124));
            }
        }
        wqi.c("NotifConfigLogic", "onChatsAndFolders: post config event", new Object[0]);
        tw0Var.c(new ho3());
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [i84, kotlin.coroutines.Continuation, x74] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public final void b(po3 po3Var, boolean z) {
        ?? r14;
        qxg qxgVar = po3Var.d;
        wqi.c("NotifConfigLogic", "onConfiguration = " + po3Var, new Object[0]);
        wqi.c("NotifConfigLogic", "onConfiguration: step 1: hash", new Object[0]);
        String str = po3Var.a;
        z7c z7cVar = this.a;
        if (str != null) {
            z7cVar.b.i("hash", str);
        }
        wqi.c("NotifConfigLogic", "onConfiguration: step 2: serverSettings", new Object[0]);
        nud nudVar = po3Var.b;
        tw0 tw0Var = this.b;
        if (nudVar != null) {
            l5c l5cVar = z7cVar.b;
            Map map = (Map) nudVar.b;
            String str2 = l5cVar.f;
            xs xsVar = l5cVar.i;
            String strA = l9j.a(l5cVar.t(PmsKey.proxy, null));
            String strName = PmsKey.f122proxydomains.name();
            hd5 hd5Var = hd5.a;
            List listE = l5cVar.e(strName, hd5Var);
            SharedPreferences.Editor editorEdit = l5cVar.g.edit();
            for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                kaj.c(editorEdit, (String) entry.getKey(), entry.getValue());
            }
            ((yw5) editorEdit).apply();
            if (strA != null) {
                String strA2 = l9j.a(l5cVar.t(PmsKey.proxy, null));
                if (!strA.equals(strA2)) {
                    xsVar.getClass();
                    qs qsVar = new qs(xsVar);
                    while (qsVar.hasNext()) {
                        ((zfe) qsVar.next()).a(strA, strA2);
                    }
                }
            }
            if (map.containsKey("debug-mode")) {
                try {
                    ((f9a) l5cVar.j.getValue()).setValue(Integer.valueOf(((Number) map.get("debug-mode")).intValue()));
                } catch (Throwable th) {
                    wqi.e(str2, "could not parse debug mode", th);
                }
            }
            if (map.containsKey("user-debug-report")) {
                try {
                    ((f9a) l5cVar.k.getValue()).setValue(Long.valueOf(((Number) map.get("user-debug-report")).longValue()));
                } catch (Throwable th2) {
                    wqi.e(str2, "could not parse user-debug-report mode", th2);
                }
            }
            List listE2 = l5cVar.e(PmsKey.f122proxydomains.name(), hd5Var);
            if (!fni.a(listE, listE2)) {
                xsVar.getClass();
                qs qsVar2 = new qs(xsVar);
                while (qsVar2.hasNext()) {
                    ((zfe) qsVar2.next()).b(listE, listE2);
                }
            }
            if (map.containsKey("react-errors")) {
                l5cVar.l.reset();
            }
            if (map.containsKey("saved-messages-aliases")) {
                l5cVar.m.reset();
            }
            Iterator it2 = l5cVar.n.iterator();
            while (it2.hasNext()) {
                ((yfe) it2.next()).a();
            }
            tw0Var.c(new uu(9));
        }
        wqi.c("NotifConfigLogic", "onConfiguration: step 3: user settings", new Object[0]);
        if (qxgVar != null) {
            z7cVar.c.t(qxgVar);
            if (fni.a(qxgVar.u, Boolean.FALSE)) {
                pe8 pe8Var = z7cVar.a;
                r14 = 0;
                pe8Var.i("app.pin_" + pe8Var.s(), null);
            } else {
                r14 = 0;
            }
            mo3 mo3Var = (mo3) this.d.getValue();
            svi.e(mo3Var.b, r14, r14, new lo3(mo3Var, r14), 3);
        }
        wqi.c("NotifConfigLogic", "onConfiguration: step 4: experiments", new Object[0]);
        Map map2 = po3Var.e;
        if (map2 != null) {
            SharedPreferences.Editor editorEdit2 = z7cVar.b.h.g.edit();
            yw5 yw5Var = (yw5) editorEdit2;
            yw5Var.clear();
            for (Map.Entry entry2 : map2.entrySet()) {
                kaj.c(editorEdit2, (String) entry2.getKey(), entry2.getValue());
            }
            yw5Var.apply();
        }
        if (z) {
            wqi.c("NotifConfigLogic", "onConfiguration: post config event", new Object[0]);
            tw0Var.c(new ho3());
        } else {
            wqi.c("NotifConfigLogic", "onConfiguration: step 5: chats settings", new Object[0]);
            a(po3Var, dk8.a);
        }
    }
}
