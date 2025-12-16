package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import j.InterfaceC42148d;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class T2 implements T0 {

    /* renamed from: n, reason: collision with root package name */
    private static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f379490n;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f379491a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38699b9 f379492b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38858hi f379493c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38706bg f379494d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final A3 f379495e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final R1 f379496f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final T1 f379497g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C38939l0 f379498h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C39168ua f379499i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final C39157u f379500j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final C39016o2 f379501k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private volatile C38915k1 f379502l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private IIdentifierCallback f379503m;

    public class a implements IIdentifierCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppMetricaDeviceIDListener f379504a;

        public a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f379504a = appMetricaDeviceIDListener;
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
            T2.a(T2.this, (IIdentifierCallback) null);
            this.f379504a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
            T2.a(T2.this, (IIdentifierCallback) null);
            this.f379504a.onError((AppMetricaDeviceIDListener.Reason) T2.f379490n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        f379490n = enumMap;
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.UNKNOWN, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.INVALID_RESPONSE, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.NETWORK, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    @j.l0
    public T2(@j.N Context context, @j.N S0 s02) {
        this(context.getApplicationContext(), s02, new C38699b9(C38899ja.a(context.getApplicationContext()).c()));
    }

    public static /* synthetic */ IIdentifierCallback a(T2 t22, IIdentifierCallback iIdentifierCallback) {
        t22.f379503m = null;
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.O0
    @j.N
    @InterfaceC42148d
    public N0 b() {
        return this.f379496f;
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void c(@j.N com.yandex.metrica.f fVar) {
        this.f379496f.c(fVar);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    @InterfaceC42148d
    public C38915k1 d() {
        return this.f379502l;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void setStatisticsSending(boolean z12) {
        this.f379502l.b().setStatisticsSending(z12);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void setUserProfileID(@j.P String str) {
        this.f379502l.b().setUserProfileID(str);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void a(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N com.yandex.metrica.j jVar) {
        this.f379499i.a(this.f379491a, this.f379493c).a(yandexMetricaConfig, this.f379493c.c());
        C38737cm c38737cmB = Ul.b(jVar.apiKey);
        Sl slA = Ul.a(jVar.apiKey);
        this.f379498h.getClass();
        if (this.f379502l != null) {
            if (c38737cmB.isEnabled()) {
                c38737cmB.w("Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.f379494d.a();
        this.f379493c.a(c38737cmB);
        this.f379493c.a(jVar.f382343b);
        this.f379493c.a(jVar.f382342a);
        this.f379493c.a((String) null);
        if (A2.a((Object) null)) {
            this.f379493c.b("api");
        }
        this.f379495e.b(jVar);
        this.f379497g.a(jVar.locationTracking, jVar.statisticsSending, (Boolean) null);
        C38890j1 c38890j1A = this.f379496f.a(jVar, false, this.f379492b);
        this.f379502l = new C38915k1(c38890j1A, new C38889j0(c38890j1A));
        this.f379500j.a(this.f379502l.a());
        this.f379501k.a(c38890j1A);
        this.f379493c.g();
        A2.a(jVar.apiKey);
        if (Boolean.TRUE.equals(jVar.logs)) {
            c38737cmB.setEnabled();
            slA.setEnabled();
            C38737cm.a().setEnabled();
            Sl.a().setEnabled();
            return;
        }
        c38737cmB.setDisabled();
        slA.setDisabled();
        C38737cm.a().setDisabled();
        Sl.a().setDisabled();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void b(boolean z12) {
        this.f379502l.b().b(z12);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    @InterfaceC42148d
    public String c() {
        return this.f379493c.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void c(String str, String str2) {
        this.f379502l.b().c(str, str2);
    }

    @j.l0
    private T2(@j.N Context context, @j.N S0 s02, @j.N C38699b9 c38699b9) {
        this(context, s02, c38699b9, new O(context), new U2(), P.g(), new C39168ua());
    }

    @j.k0
    @j.l0
    public T2(@j.N Context context, @j.N S0 s02, @j.N C38699b9 c38699b9, @j.N O o12, @j.N U2 u22, @j.N P p12, @j.N C39168ua c39168ua) {
        this.f379491a = context;
        this.f379492b = c38699b9;
        Handler handlerC = s02.c();
        A3 a3A = u22.a(context, u22.a(handlerC, this));
        this.f379495e = a3A;
        C38939l0 c38939l0F = p12.f();
        this.f379498h = c38939l0F;
        T1 t1A = u22.a(a3A, context, s02.b());
        this.f379497g = t1A;
        c38939l0F.a(t1A);
        o12.a(context);
        C38858hi c38858hiA = u22.a(context, t1A, c38699b9, handlerC);
        this.f379493c = c38858hiA;
        this.f379500j = s02.a();
        this.f379499i = c39168ua;
        t1A.a(c38858hiA);
        this.f379494d = u22.a(t1A, c38699b9, handlerC);
        this.f379496f = u22.a(context, a3A, t1A, handlerC, c38858hiA);
        this.f379501k = p12.l();
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC38790f0.a
    @InterfaceC42148d
    public void a(int i12, @j.N Bundle bundle) {
        this.f379493c.a(bundle, (Yh) null);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f379494d.a(deferredDeeplinkParametersListener);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f379494d.a(deferredDeeplinkListener);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void a(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.f379503m = aVar;
        this.f379493c.a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f379495e.a());
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.N
    @j.l0
    public M0 a(@j.N com.yandex.metrica.f fVar) {
        return this.f379496f.b(fVar);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.P
    @InterfaceC42148d
    public String a() {
        return this.f379493c.e();
    }

    @Override // com.yandex.metrica.impl.ob.T0
    @j.l0
    public void a(IIdentifierCallback iIdentifierCallback, @j.N List<String> list) {
        this.f379493c.a(iIdentifierCallback, list, this.f379495e.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void a(@j.P Location location) {
        this.f379502l.b().a(location);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    @j.l0
    public void a(boolean z12) {
        this.f379502l.b().a(z12);
    }
}
