package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.lp0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class cg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oe0<com.monetization.ads.mediation.base.e> f384261a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final bg0 f384262b = new bg0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ag0 f384263c;

    public class a implements com.monetization.ads.mediation.base.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zf0 f384264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f384265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.monetization.ads.mediation.base.e f384266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f384267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ qf f384268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f384269f;

        public a(zf0 zf0Var, Context context, com.monetization.ads.mediation.base.e eVar, b bVar, qf qfVar, long j12) {
            this.f384264a = zf0Var;
            this.f384265b = context;
            this.f384266c = eVar;
            this.f384267d = bVar;
            this.f384268e = qfVar;
            this.f384269f = j12;
        }

        public final void onBidderTokenFailedToLoad(@j.N String str) {
            cg0.a(cg0.this, this.f384265b, this.f384264a, this.f384266c, str, null, this.f384267d);
        }

        public final void onBidderTokenLoaded(@j.N String str) throws JSONException {
            JSONObject jSONObject;
            if (TextUtils.isEmpty(str)) {
                cg0.a(cg0.this, this.f384265b, this.f384264a, this.f384266c, this.f384264a.c() + " provided empty token", null, this.f384267d);
                return;
            }
            if (this.f384268e.a()) {
                cg0.a(cg0.this, this.f384265b, this.f384264a, this.f384266c, this.f384264a.c() + " didn't provide bidder token after timeout", Long.valueOf(SystemClock.elapsedRealtime() - this.f384269f), this.f384267d);
                return;
            }
            bg0 bg0Var = cg0.this.f384262b;
            zf0 zf0Var = this.f384264a;
            bg0Var.getClass();
            String strC = zf0Var.c();
            Map<String, String> mapD = zf0Var.d();
            Map<String, String> mapG = zf0Var.g();
            try {
                jSONObject = new JSONObject();
                jSONObject.put("adapter", strC);
                if (mapD != null) {
                    jSONObject.put("bidding_info", new JSONObject(mapD));
                }
                jSONObject.put("network_data", new JSONObject(mapG));
                jSONObject.put("bidder_token", str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            JSONObject jSONObject2 = jSONObject;
            if (jSONObject2 == null) {
                cg0.a(cg0.this, this.f384265b, this.f384264a, this.f384266c, "Can't create bidding data json object for network.", null, this.f384267d);
            } else {
                cg0.a(cg0.this, this.f384265b, this.f384264a, this.f384266c, jSONObject2, this.f384267d);
            }
        }
    }

    public interface b {
    }

    public cg0(@j.N re0 re0Var) {
        this.f384261a = new oe0<>(re0Var);
        this.f384263c = new ag0(re0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.K
    public final void a(@j.N Context context, @j.N zf0 zf0Var, @j.N qf qfVar, @j.N b bVar) {
        com.monetization.ads.mediation.base.e eVarA = this.f384261a.a(context, zf0Var, (Class<com.monetization.ads.mediation.base.e>) com.monetization.ads.mediation.base.e.class);
        if (!(eVarA instanceof com.monetization.ads.mediation.base.d)) {
            if (eVarA == 0) {
                ((lp0.a) bVar).f387689b.countDown();
                return;
            } else {
                this.f384263c.a(context, zf0Var, eVarA, "Can't create bidder token loader.", null);
                ((lp0.a) bVar).f387689b.countDown();
                return;
            }
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zf0Var.g();
            new a(zf0Var, context, eVarA, bVar, qfVar, jElapsedRealtime);
            ((com.monetization.ads.mediation.base.d) eVarA).a();
        } catch (Throwable th2) {
            this.f384263c.a(context, zf0Var, eVarA, th2.toString(), null);
            ((lp0.a) bVar).f387689b.countDown();
        }
    }

    public static void a(cg0 cg0Var, Context context, zf0 zf0Var, com.monetization.ads.mediation.base.e eVar, String str, Long l12, b bVar) {
        cg0Var.f384263c.a(context, zf0Var, eVar, str, l12);
        ((lp0.a) bVar).f387689b.countDown();
    }

    public static void a(cg0 cg0Var, Context context, zf0 zf0Var, com.monetization.ads.mediation.base.e eVar, JSONObject jSONObject, b bVar) {
        cg0Var.f384263c.a(context, zf0Var, eVar);
        lp0.a aVar = (lp0.a) bVar;
        synchronized (lp0.this.f387685b) {
            aVar.f387688a.add(jSONObject);
        }
        aVar.f387689b.countDown();
    }
}
