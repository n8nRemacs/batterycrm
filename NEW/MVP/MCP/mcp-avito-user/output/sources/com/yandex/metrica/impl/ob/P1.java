package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39078qf;
import com.yandex.metrica.impl.ob.C39109s;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class P1 implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final L3 f379121a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Map<String, String> f379122b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Ig f379123c;

    /* renamed from: d, reason: collision with root package name */
    private C39078qf f379124d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final L7 f379125e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private List<Long> f379126f;

    /* renamed from: g, reason: collision with root package name */
    private int f379127g;

    /* renamed from: h, reason: collision with root package name */
    private int f379128h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private b f379129i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final InterfaceC38813fn<byte[]> f379130j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final C38737cm f379131k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final C38698b8 f379132l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final M0 f379133m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final Qg f379134n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final FullUrlFormer f379135o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final C38741d1 f379136p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final RequestDataHolder f379137q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final ResponseDataHolder f379138r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final SendingDataTaskHelper f379139s;

    /* renamed from: t, reason: collision with root package name */
    private int f379140t;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        final C39078qf.d f379141a;

        /* renamed from: b, reason: collision with root package name */
        final C39109s.a f379142b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f379143c;

        public a(@j.N C39078qf.d dVar, C39109s.a aVar, boolean z12) {
            this.f379141a = dVar;
            this.f379142b = aVar;
            this.f379143c = z12;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        final List<C39078qf.d> f379144a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        final List<Long> f379145b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        final JSONObject f379146c;

        public b(@j.N List<C39078qf.d> list, @j.N List<Long> list2, @j.N JSONObject jSONObject) {
            this.f379144a = list;
            this.f379145b = list2;
            this.f379146c = jSONObject;
        }
    }

    public P1(@j.N L3 l32, @j.N Qg qg2, @j.N C38741d1 c38741d1, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N RequestBodyEncrypter requestBodyEncrypter) {
        this(l32, qg2, c38741d1, fullUrlFormer, requestDataHolder, responseDataHolder, l32.i(), l32.q(), l32.x(), requestBodyEncrypter);
    }

    public static /* synthetic */ int a(P1 p12, int i12) {
        int i13 = p12.f379127g + i12;
        p12.f379127g = i13;
        return i13;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public String description() {
        return "ReportTask_" + this.f379121a.e().a();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public FullUrlFormer getFullUrlFormer() {
        return this.f379135o;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public RequestDataHolder getRequestDataHolder() {
        return this.f379137q;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public ResponseDataHolder getResponseDataHolder() {
        return this.f379138r;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f379121a.m().q();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ee A[LOOP:2: B:88:0x01e8->B:90:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateTask() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P1.onCreateTask():boolean");
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPerformRequest() {
        SendingDataTaskHelper sendingDataTaskHelper = this.f379139s;
        sendingDataTaskHelper.f382443c.getClass();
        sendingDataTaskHelper.f382444d.a(System.currentTimeMillis());
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPostRequestComplete(boolean z12) {
        if (z12) {
            a(false);
        } else if (A2.b(this.f379138r.f382435a)) {
            a(true);
        }
        if (z12 && this.f379131k.isEnabled()) {
            for (int i12 = 0; i12 < this.f379129i.f379144a.size(); i12++) {
                this.f379131k.a(this.f379129i.f379144a.get(i12), "Event sent");
            }
        }
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onRequestComplete() {
        SendingDataTaskHelper sendingDataTaskHelper = this.f379139s;
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) sendingDataTaskHelper.f382446f.handle(sendingDataTaskHelper.f382445e);
        return response != null && "accepted".equals(response.f382399a);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onSuccessfulTaskFinished() {
        this.f379121a.l().c();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskAdded() {
        this.f379121a.l().a();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskFinished() {
        this.f379121a.i().a();
        this.f379121a.l().b();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskRemoved() {
        this.f379121a.l().b();
    }

    private C39078qf.a[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C39078qf.a[] aVarArr = new C39078qf.a[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i12 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C39078qf.a aVar = new C39078qf.a();
                aVar.f381501a = next;
                aVar.f381502b = jSONObject.getString(next);
                aVarArr[i12] = aVar;
            } catch (Throwable unused) {
            }
            i12++;
        }
        return aVarArr;
    }

    private P1(@j.N L3 l32, @j.N Qg qg2, @j.N C38741d1 c38741d1, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N L7 l72, @j.N C38737cm c38737cm, @j.N C38698b8 c38698b8, @j.N RequestBodyEncrypter requestBodyEncrypter) {
        this(l32, c38737cm, l72, qg2, c38698b8, c38741d1, new Tm(1024000, "event value in ReportTask", c38737cm), C39031oh.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    @j.k0
    public P1(@j.N L3 l32, @j.N C38737cm c38737cm, @j.N L7 l72, @j.N Qg qg2, @j.N C38698b8 c38698b8, @j.N C38741d1 c38741d1, @j.N Tm tm2, @j.N M0 m02, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N RequestBodyEncrypter requestBodyEncrypter) {
        this.f379122b = new LinkedHashMap();
        this.f379127g = 0;
        this.f379128h = -1;
        this.f379139s = new SendingDataTaskHelper(requestBodyEncrypter, new Ql(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f379134n = qg2;
        this.f379121a = l32;
        this.f379125e = l72;
        this.f379131k = c38737cm;
        this.f379130j = tm2;
        this.f379132l = c38698b8;
        this.f379136p = c38741d1;
        this.f379133m = m02;
        this.f379137q = requestDataHolder;
        this.f379138r = responseDataHolder;
        this.f379135o = fullUrlFormer;
    }

    private void a(boolean z12) {
        this.f379132l.c(this.f379140t);
        C39078qf.d[] dVarArr = this.f379124d.f381495a;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            try {
                C39078qf.d dVar = dVarArr[i12];
                this.f379125e.a(this.f379126f.get(i12).longValue(), J1.a(dVar.f381530b.f381569c).a(), dVar.f381531c.length, z12);
            } catch (Throwable unused) {
            }
        }
        this.f379125e.a(this.f379121a.v().a());
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onShouldNotExecute() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onUnsuccessfulTaskFinished() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:5:0x0022, B:6:0x0028, B:8:0x002f, B:20:0x0054, B:23:0x0060, B:26:0x006f, B:28:0x0078, B:37:0x009a, B:44:0x00af, B:46:0x00bd, B:53:0x00c9, B:52:0x00c8, B:49:0x00c3, B:54:0x00cf, B:57:0x00e1, B:60:0x00e8, B:41:0x00a7, B:63:0x00f0, B:18:0x004e, B:64:0x00f5, B:66:0x00fb, B:67:0x0110, B:69:0x0114), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0 A[SYNTHETIC] */
    @j.k0
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.yandex.metrica.impl.ob.P1.a a(long r17, com.yandex.metrica.impl.ob.C39078qf.d.b r19, @j.N com.yandex.metrica.impl.ob.Lg r20, @j.N java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P1.a(long, com.yandex.metrica.impl.ob.qf$d$b, com.yandex.metrica.impl.ob.Lg, java.util.List, int):com.yandex.metrica.impl.ob.P1$a");
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onRequestError(@j.P Throwable th2) {
    }
}
