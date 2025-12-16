package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.ProtoStateException;

/* loaded from: classes2.dex */
public final class sie extends sm implements j1g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sie(long j, int i) {
        super(j);
        this.d = i;
    }

    private final void s(pzf pzfVar) {
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        byte[] bArrA;
        Object value;
        switch (this.d) {
            case 0:
                uie uieVar = (uie) l0gVar;
                p().b.h(uieVar.o, "app-update-type");
                if (uieVar.o != 1) {
                    if (uieVar.c != null) {
                        l5c l5cVar = p().b;
                        String str = uieVar.c;
                        l5cVar.getClass();
                        String strA = l9j.a(str);
                        PmsKey pmsKey = PmsKey.proxy;
                        String strA2 = l9j.a(l5cVar.t(pmsKey, null));
                        if (!fni.a(strA, strA2)) {
                            l5cVar.i(pmsKey.name(), strA);
                            xs xsVar = l5cVar.i;
                            xsVar.getClass();
                            qs qsVar = new qs(xsVar);
                            while (qsVar.hasNext()) {
                                ((zfe) qsVar.next()).a(strA2, strA);
                            }
                        }
                    }
                    if (uieVar.d != null) {
                        pe8 pe8Var = p().a;
                        pe8Var.p0.O(pe8Var, pe8.U0[2], uieVar.d);
                    }
                    if (!(uieVar.Y == null ? Collections.EMPTY_LIST : new ArrayList(uieVar.Y)).isEmpty()) {
                        tm tmVar = this.c;
                        if (tmVar == null) {
                            tmVar = null;
                        }
                        y84 y84Var = (y84) tmVar.b0.getValue();
                        Object arrayList = uieVar.Y == null ? Collections.EMPTY_LIST : new ArrayList(uieVar.Y);
                        tcf tcfVar = y84Var.a;
                        do {
                            value = tcfVar.getValue();
                        } while (!tcfVar.c(value, arrayList));
                    }
                    l5c l5cVar2 = p().b;
                    List arrayList2 = uieVar.X == null ? Collections.EMPTY_LIST : new ArrayList(uieVar.X);
                    l5cVar2.getClass();
                    PmsKey pmsKey2 = PmsKey.f122proxydomains;
                    List listE = l5cVar2.e(pmsKey2.name(), hd5.a);
                    if (!fni.a(listE, arrayList2)) {
                        SharedPreferences.Editor editorEdit = l5cVar2.g.edit();
                        kaj.c(editorEdit, pmsKey2.name(), arrayList2);
                        ((yw5) editorEdit).apply();
                        xs xsVar2 = l5cVar2.i;
                        xsVar2.getClass();
                        qs qsVar2 = new qs(xsVar2);
                        while (qsVar2.hasNext()) {
                            ((zfe) qsVar2.next()).b(listE, arrayList2);
                        }
                    }
                    tm tmVar2 = this.c;
                    if (tmVar2 == null) {
                        tmVar2 = null;
                    }
                    String strC = ((fxa) tmVar2.g.getValue()).c();
                    tm tmVar3 = this.c;
                    if (tmVar3 == null) {
                        tmVar3 = null;
                    }
                    tmVar3.a.getClass();
                    String str2 = di8.h;
                    ceg cegVar = str2 != null ? new ceg(str2) : null;
                    String str3 = cegVar != null ? cegVar.a : null;
                    if (str3 == null) {
                        String str4 = di8.g.b;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.X;
                            if (l6bVar.b(lg8Var)) {
                                l6bVar.c(lg8Var, str4, "Invoked 'onSessionInitHandled', but traceId is null or empty!", null);
                            }
                        }
                    } else {
                        yqb.c(di8.g, "session_init_handled", 5, str3, 56);
                    }
                    if (strC != null && strC.length() != 0) {
                        Long l = uieVar.Z;
                        if (l != null) {
                            tm tmVar4 = this.c;
                            if (tmVar4 == null) {
                                tmVar4 = null;
                            }
                            bArrA = ((xo7) tmVar4.l.getValue()).a(l.longValue());
                        } else {
                            bArrA = null;
                        }
                        tm tmVar5 = this.c;
                        ((yh8) (tmVar5 != null ? tmVar5 : null).k.getValue()).d(bArrA);
                        break;
                    }
                } else {
                    tm tmVar6 = this.c;
                    if (tmVar6 == null) {
                        tmVar6 = null;
                    }
                    rya ryaVar = (rya) tmVar6.j.getValue();
                    pb3 pb3Var = ryaVar.b;
                    ryaVar.d.getClass();
                    pe8 pe8Var2 = (pe8) pb3Var;
                    pe8Var2.G0.O(pe8Var2, pe8.U0[20], "25.19.0");
                    tm tmVar7 = this.c;
                    if (tmVar7 == null) {
                        tmVar7 = null;
                    }
                    ((rya) tmVar7.j.getValue()).b();
                    tm tmVar8 = this.c;
                    di8 di8Var = (tmVar8 != null ? tmVar8 : null).a;
                    bi8 bi8Var = bi8.SESSION_FORCE_UPDATE;
                    di8Var.getClass();
                    di8.o(bi8Var);
                    break;
                }
                break;
            default:
                k().c(new ake(this.a, ((zje) l0gVar).c));
                break;
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                vie vieVar = (vie) tmVar.i.getValue();
                vieVar.getClass();
                wqi.c("vie", "onSessionInitFail, error = " + pzfVar, new Object[0]);
                if (!"session.state".equals(pzfVar.b)) {
                    if (!(pzfVar instanceof hzf)) {
                        if ("proto.state".equals(pzfVar.b)) {
                            ((y3b) ((yi5) vieVar.b.getValue())).a(new ProtoStateException(pzfVar));
                        }
                        ((w0g) vieVar.e.getValue()).f();
                        di8 di8Var = vieVar.a;
                        bi8 bi8Var = bi8.SESSION_RESTART;
                        di8Var.getClass();
                        di8.o(bi8Var);
                        break;
                    } else if (((oje) vieVar.c.getValue()).k == 2) {
                        hwa hwaVar = (hwa) vieVar.d.getValue();
                        hwa.q(hwaVar, new sie(hwaVar.t().a.k(), 0));
                        break;
                    }
                } else {
                    wqi.c("vie", "session state error: " + pzfVar.c + " do nothing", new Object[0]);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                cxg cxgVarJ = ((lv4) tmVar.c.getValue()).j();
                tm tmVar2 = this.c;
                if (tmVar2 == null) {
                    tmVar2 = null;
                }
                String strA = ((lv4) tmVar2.c.getValue()).a();
                long jK = p().a.K();
                tm tmVar3 = this.c;
                if (tmVar3 == null) {
                    tmVar3 = null;
                }
                String str = (String) ((lv4) tmVar3.c.getValue()).k.get();
                tie tieVar = new tie(null);
                HashMap map = new HashMap();
                map.put("deviceType", cxgVarJ.a);
                int i = cxgVarJ.j;
                if (i != 0) {
                    map.put("pushDeviceType", utb.d(i));
                }
                map.put("appVersion", cxgVarJ.b);
                map.put("arch", cxgVarJ.e);
                map.put("buildNumber", Integer.valueOf(cxgVarJ.c));
                map.put("osVersion", cxgVarJ.d);
                map.put("locale", cxgVarJ.f);
                map.put("deviceLocale", cxgVarJ.g);
                map.put("deviceName", cxgVarJ.h);
                map.put("screen", cxgVarJ.i);
                map.put("timezone", cxgVarJ.k.getID());
                tieVar.v("userAgent", map);
                tieVar.x("deviceId", strA);
                tieVar.t(jK, "clientSessionId");
                if (l8g.d(str)) {
                    tieVar.x("mt_instanceid", str);
                }
                return tieVar;
            default:
                return new zf8((xhb) null, 24);
        }
    }
}
