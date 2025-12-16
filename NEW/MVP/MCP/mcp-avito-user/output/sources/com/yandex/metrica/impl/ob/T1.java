package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.U1;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class T1 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f379474a;

    /* renamed from: b, reason: collision with root package name */
    private C39015o1 f379475b;

    /* renamed from: c, reason: collision with root package name */
    private C38890j1 f379476c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final T f379477d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC38907ji f379478e;

    /* renamed from: f, reason: collision with root package name */
    private final P6 f379479f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39188v6 f379480g;

    /* renamed from: h, reason: collision with root package name */
    private final U1 f379481h = new U1(this);

    public class a implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f379482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1 f379483b;

        public a(Map map, Q1 q12) {
            this.f379482a = map;
            this.f379483b = q12;
        }

        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            T1 t12 = T1.this;
            C38715c0 c38715c0F = c38715c0.f(Tl.g(this.f379482a));
            Q1 q12 = this.f379483b;
            t12.getClass();
            if (C39278z0.f(c38715c0F.f380258e)) {
                c38715c0F.c(q12.f379237c.a());
            }
            return c38715c0F;
        }
    }

    public class b implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39197vf f379485a;

        public b(T1 t12, C39197vf c39197vf) {
            this.f379485a = c39197vf;
        }

        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            return c38715c0.f(new String(Base64.encode(MessageNano.toByteArray(this.f379485a), 0)));
        }
    }

    public class c implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379486a;

        public c(T1 t12, String str) {
            this.f379486a = str;
        }

        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            return c38715c0.f(this.f379486a);
        }
    }

    public class d implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W1 f379487a;

        public d(T1 t12, W1 w12) {
            this.f379487a = w12;
        }

        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            Pair<byte[], Integer> pairA = this.f379487a.a();
            C38715c0 c38715c0F = c38715c0.f(new String(Base64.encode((byte[]) pairA.first, 0)));
            c38715c0F.f380261h = ((Integer) pairA.second).intValue();
            return c38715c0F;
        }
    }

    public class e implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sg f379488a;

        public e(T1 t12, Sg sg2) {
            this.f379488a = sg2;
        }

        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            kotlin.Q<byte[], Integer> qA2 = this.f379488a.a();
            C38715c0 c38715c0F = c38715c0.f(new String(Base64.encode(qA2.f406619b, 0)));
            c38715c0F.f380261h = qA2.f406620c.intValue();
            return c38715c0F;
        }
    }

    public class f implements U1.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Na f379489a;

        public f(T1 t12, Na na2) {
            this.f379489a = na2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.U1.e
        public C38715c0 a(C38715c0 c38715c0) {
            C38715c0 c38715c0F = c38715c0.f(L0.a(MessageNano.toByteArray((MessageNano) this.f379489a.f378989a)));
            c38715c0F.f380261h = this.f379489a.f378990b.a();
            return c38715c0F;
        }
    }

    @j.k0
    public T1(A3 a32, Context context, @j.N C39015o1 c39015o1, @j.N P6 p62, @j.N C39188v6 c39188v6) {
        this.f379475b = c39015o1;
        this.f379474a = context;
        this.f379477d = new T(a32);
        this.f379479f = p62;
        this.f379480g = c39188v6;
    }

    public void a(@j.P C38890j1 c38890j1) {
        this.f379476c = c38890j1;
    }

    public void b(Q1 q12) {
        C38879ie c38879ie = q12.f379238d;
        String strE = q12.e();
        C38737cm c38737cmA = a(q12);
        List<Integer> list = C39278z0.f382293i;
        JSONObject jSONObject = new JSONObject();
        if (c38879ie != null) {
            c38879ie.a(jSONObject);
        }
        a(new J(jSONObject.toString(), "", EnumC38666a1.EVENT_TYPE_ACTIVATION.b(), 0, c38737cmA).d(strE), q12);
    }

    public void c(Q1 q12) {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.b();
        a(new U1.f(c38715c0, q12));
    }

    public void d() {
        this.f379475b.g();
    }

    public void e() {
        this.f379475b.f();
    }

    public void f() {
        this.f379475b.a();
    }

    public void g() {
        this.f379475b.c();
    }

    public void a(InterfaceC38907ji interfaceC38907ji) {
        this.f379478e = interfaceC38907ji;
        this.f379477d.a(interfaceC38907ji);
    }

    public void a(@j.P Boolean bool, @j.P Boolean bool2, @j.P Boolean bool3) {
        if (A2.a(bool)) {
            this.f379477d.b().g(bool.booleanValue());
        }
        if (A2.a(bool2)) {
            this.f379477d.b().i(bool2.booleanValue());
        }
        if (A2.a(bool3)) {
            CounterConfiguration counterConfigurationB = this.f379477d.b();
            bool3.booleanValue();
            synchronized (counterConfigurationB) {
                counterConfigurationB.f377493b.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", bool3);
            }
        }
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.b();
        a(c38715c0, this.f379477d);
    }

    public C39015o1 c() {
        return this.f379475b;
    }

    public Future<Void> b(@j.N A3 a32) {
        return this.f379481h.queueResumeUserSession(a32);
    }

    public void b(String str) {
        this.f379477d.a().b(str);
    }

    public void b(@j.N H6 h62, Q1 q12) {
        this.f379475b.f();
        a(this.f379480g.a(h62, q12));
    }

    public void a(@j.P String str, Q1 q12) {
        try {
            a(C39278z0.c(L0.a(MessageNano.toByteArray(this.f379479f.fromModel(new C38747d7(str == null ? new byte[0] : str.getBytes(Constants.ENCODING), new C38722c7(EnumC38822g7.USER, null))))), a(q12)), q12);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public void b(@j.P String str, @j.N Q1 q12) {
        a(new U1.f(J.a(str, a(q12)), q12).a(new c(this, str)));
    }

    public Future<Void> a(C38715c0 c38715c0, Q1 q12, Map<String, Object> map) {
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_UNDEFINED;
        this.f379475b.f();
        U1.f fVar = new U1.f(c38715c0, q12);
        if (!A2.b(map)) {
            fVar.a(new a(map, q12));
        }
        return a(fVar);
    }

    @j.N
    public com.yandex.metrica.rtm.wrapper.k b() {
        return this.f379481h;
    }

    public Future<Void> a(@j.N A3 a32) {
        return this.f379481h.queuePauseUserSession(a32);
    }

    public void a(@j.N List<String> list, @j.N ResultReceiver resultReceiver, @j.P Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new V0(list, map, resultReceiver));
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_STARTUP;
        int i12 = Ul.f379747e;
        C38737cm c38737cmA = C38737cm.a();
        List<Integer> list2 = C39278z0.f382293i;
        a(new J("", "", enumC38666a1.b(), 0, c38737cmA).c(bundle), this.f379477d);
    }

    public void a(@j.N ResultReceiverC38781eg resultReceiverC38781eg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", resultReceiverC38781eg);
        int i12 = Ul.f379747e;
        C38737cm c38737cmA = C38737cm.a();
        List<Integer> list = C39278z0.f382293i;
        a(new J("", "", EnumC38666a1.EVENT_TYPE_REQUEST_REFERRER.b(), 0, c38737cmA).c(bundle), this.f379477d);
    }

    public void a(C38715c0 c38715c0, Q1 q12) {
        if (C39278z0.f(c38715c0.f380258e)) {
            c38715c0.c(q12.f379237c.a());
        }
        a(c38715c0, q12, (Map<String, Object>) null);
    }

    public void a(List<String> list) {
        this.f379477d.a().a(list);
    }

    public void a(Map<String, String> map) {
        this.f379477d.a().a(map);
    }

    public void a(String str) {
        this.f379477d.a().a(str);
    }

    public void a(@j.N H6 h62, @j.N Q1 q12) {
        this.f379475b.f();
        U1.f fVarA = this.f379480g.a(h62, q12);
        fVarA.a().a(this.f379478e);
        this.f379481h.sendCrash(fVarA);
    }

    public void a(String str, String str2, Q1 q12) {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.b();
        a(new U1.f(c38715c0.a(str, str2), q12));
    }

    public void a(@j.N C39197vf c39197vf, @j.N Q1 q12) {
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_SEND_USER_PROFILE.b();
        a(new U1.f(c38715c0, q12).a(new b(this, c39197vf)));
    }

    public void a(@j.N W1 w12, @j.N Q1 q12) {
        J j12 = new J(a(q12));
        j12.f380258e = EnumC38666a1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        a(new U1.f(j12, q12).a(new d(this, w12)));
    }

    public void a(@j.N Sg sg2, @j.N Q1 q12) {
        J j12 = new J(a(q12));
        j12.f380258e = EnumC38666a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT.b();
        a(new U1.f(j12, q12).a(new e(this, sg2)));
    }

    public void a(@j.N Za za2, @j.N Q1 q12) {
        for (Na<C38979mf, Vm> na2 : za2.toProto()) {
            J j12 = new J(a(q12));
            j12.f380258e = EnumC38666a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.b();
            a(new U1.f(j12, q12).a(new f(this, na2)));
        }
    }

    public void a(IMetricaService iMetricaService, C38715c0 c38715c0, Q1 q12) {
        iMetricaService.reportData(c38715c0.b(q12.c()));
        C38890j1 c38890j1 = this.f379476c;
        if (c38890j1 == null || c38890j1.f377793b.f()) {
            this.f379475b.g();
        }
    }

    private Future<Void> a(U1.f fVar) {
        fVar.a().a(this.f379478e);
        return this.f379481h.queueReport(fVar);
    }

    public Context a() {
        return this.f379474a;
    }

    @j.N
    private C38737cm a(@j.N Q1 q12) {
        return Ul.b(q12.b().c());
    }
}
