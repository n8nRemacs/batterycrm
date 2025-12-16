package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ee0<T extends com.monetization.ads.mediation.base.e, L> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f384913a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a4 f384914b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final je0<T, L> f384915c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final re0 f384916d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final fe0<T> f384917e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final pe0 f384918f = new pe0();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final wr0 f384919g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private de0<T> f384920h;

    public ee0(@j.N n2 n2Var, @j.N a4 a4Var, @j.N je0<T, L> je0Var, @j.N re0 re0Var, @j.N fe0<T> fe0Var, @j.N wr0 wr0Var) {
        this.f384913a = n2Var;
        this.f384914b = a4Var;
        this.f384915c = je0Var;
        this.f384919g = wr0Var;
        this.f384917e = fe0Var;
        this.f384916d = re0Var;
    }

    public final void a(@j.N Context context) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            try {
                this.f384915c.a(de0Var.a());
            } catch (Throwable th2) {
                zf0 zf0VarB = this.f384920h.b();
                HashMap map = new HashMap();
                map.put("exception_in_adapter", th2.toString());
                HashMap map2 = new HashMap();
                map2.put("reason", map);
                this.f384916d.a(context, zf0VarB, map2);
            }
        }
    }

    public final void b(@j.N Context context, @j.N HashMap map) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            zf0 zf0VarB = de0Var.b();
            List<String> listF = zf0VarB.f();
            if (listF != null) {
                Iterator<String> it = listF.iterator();
                while (it.hasNext()) {
                    new x6(context, this.f384913a).a(it.next());
                }
            }
            this.f384916d.c(context, zf0VarB, map);
        }
    }

    public final void c(@j.N Context context, @j.N HashMap map) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            List<String> listB = de0Var.b().b();
            x6 x6Var = new x6(context, this.f384913a);
            if (listB != null) {
                Iterator<String> it = listB.iterator();
                while (it.hasNext()) {
                    x6Var.a(it.next());
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("status", "success");
        de0<T> de0Var2 = this.f384920h;
        if (de0Var2 != null) {
            com.monetization.ads.mediation.base.e eVarA = de0Var2.a();
            this.f384918f.getClass();
            map2.putAll(pe0.a(eVarA));
            this.f384916d.e(context, this.f384920h.b(), map2);
        }
    }

    public final void b(@j.N Context context) {
        if (this.f384920h != null) {
            HashMap mapG = org.webrtc.h.g("status", "success");
            this.f384916d.d(context, this.f384920h.b(), mapG);
        }
    }

    @j.P
    public final de0 a() {
        return this.f384920h;
    }

    public final void a(@j.N Context context, @j.N L l12) {
        de0<T> de0VarA = this.f384917e.a(context);
        this.f384920h = de0VarA;
        if (de0VarA != null) {
            this.f384914b.b(z3.f392161a);
            zf0 zf0VarB = this.f384920h.b();
            this.f384916d.b(context, zf0VarB);
            try {
                this.f384915c.a(context, this.f384920h.a(), l12, this.f384920h.a(context), this.f384920h.c());
                return;
            } catch (Throwable th2) {
                HashMap map = new HashMap();
                map.put("exception_in_adapter", th2.toString());
                HashMap map2 = new HashMap();
                map2.put("reason", map);
                this.f384916d.a(context, zf0VarB, map2);
                de0<T> de0Var = this.f384920h;
                this.f384914b.a(new n7(ky0.c.f387328c, de0Var != null ? de0Var.b().c() : null));
                a(context, (Context) l12);
                return;
            }
        }
        this.f384919g.a();
    }

    public final void b(@j.N Context context, @j.N Map<String, Object> map) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            this.f384916d.a(context, de0Var.b(), map);
        }
    }

    public final void c(@j.N Context context) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            this.f384916d.a(context, de0Var.b());
        }
    }

    public final void b(@j.N Context context, @j.N w2 w2Var, @j.N L l12) {
        de0<T> de0Var = this.f384920h;
        this.f384914b.a(new n7(ky0.c.f387328c, de0Var != null ? de0Var.b().c() : null));
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("error_code", Integer.valueOf(w2Var.a()));
        map.put("error_description", w2Var.b());
        de0<T> de0Var2 = this.f384920h;
        if (de0Var2 != null) {
            com.monetization.ads.mediation.base.e eVarA = de0Var2.a();
            this.f384918f.getClass();
            map.putAll(pe0.a(eVarA));
            this.f384916d.e(context, this.f384920h.b(), map);
        }
        a(context);
        a(context, (Context) l12);
    }

    public final void a(@j.N Context context, @j.N HashMap map) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            zf0 zf0VarB = de0Var.b();
            List<String> listE = zf0VarB.e();
            if (listE != null) {
                Iterator<String> it = listE.iterator();
                while (it.hasNext()) {
                    new x6(context, this.f384913a).a(it.next());
                }
            }
            HashMap map2 = new HashMap(map);
            map2.put("click_type", "default");
            this.f384916d.b(context, zf0VarB, map2);
        }
    }

    public final boolean b() {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            de0Var.a().getClass();
        }
        return true;
    }

    public final void a(@j.N Context context, @j.N Map<String, Object> map) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            this.f384916d.b(context, de0Var.b(), map);
        }
    }

    public final void a(@j.N Context context, @j.N w2 w2Var, @j.N L l12) {
        if (this.f384920h != null) {
            HashMap mapG = org.webrtc.h.g("status", "error");
            mapG.put("error_code", Integer.valueOf(w2Var.a()));
            this.f384916d.d(context, this.f384920h.b(), mapG);
        }
        a(context);
        a(context, (Context) l12);
    }

    public final void a(@j.N Context context, @j.P AdResponse<String> adResponse) {
        de0<T> de0Var = this.f384920h;
        if (de0Var != null) {
            this.f384916d.a(context, de0Var.b(), adResponse);
        }
    }
}
