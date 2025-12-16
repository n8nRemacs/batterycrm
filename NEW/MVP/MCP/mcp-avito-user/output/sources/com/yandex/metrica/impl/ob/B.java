package com.yandex.metrica.impl.ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C39197vf;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class B implements I0 {

    /* renamed from: n, reason: collision with root package name */
    private static final Collection<Integer> f377790n = new HashSet(Arrays.asList(14, 15));

    /* renamed from: o, reason: collision with root package name */
    private static final Kn<C39197vf> f377791o = new a();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f377792a;

    /* renamed from: b, reason: collision with root package name */
    protected final Q1 f377793b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final C38737cm f377794c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    protected final Sl f377795d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    protected final X6 f377796e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    protected final S6 f377797f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    protected final M6 f377798g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final K6 f377799h;

    /* renamed from: i, reason: collision with root package name */
    protected final T1 f377800i;

    /* renamed from: j, reason: collision with root package name */
    private C38691b1 f377801j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC38712bm f377802k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final A0 f377803l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final C39116s6 f377804m;

    public class a implements Kn<C39197vf> {
        @Override // com.yandex.metrica.impl.ob.Kn
        public In a(@j.N C39197vf c39197vf) {
            C39197vf.a[] aVarArr = c39197vf.f382068a;
            return (aVarArr == null || aVarArr.length == 0) ? In.a(this, "attributes list is empty") : In.a(this);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Kn<Revenue> f377805a = new On();

        public static Kn<Revenue> a() {
            return f377805a;
        }
    }

    public B(Context context, T1 t12, @j.N Q1 q12, @j.N A0 a02, @j.N InterfaceC38712bm interfaceC38712bm, @j.N com.yandex.metrica.rtm.wrapper.d dVar, @j.N Yg yg2, @j.N X6 x62, @j.N S6 s62, @j.N M6 m62, @j.N K6 k62, @j.N C39116s6 c39116s6) {
        this.f377792a = context.getApplicationContext();
        this.f377800i = t12;
        this.f377793b = q12;
        this.f377803l = a02;
        this.f377796e = x62;
        this.f377797f = s62;
        this.f377798g = m62;
        this.f377799h = k62;
        this.f377804m = c39116s6;
        C38737cm c38737cmB = Ul.b(q12.b().c());
        this.f377794c = c38737cmB;
        q12.a(new C38713bn(c38737cmB, "Crash Environment"));
        Sl slA = Ul.a(q12.b().c());
        this.f377795d = slA;
        if (C38689b.a(q12.b().f377493b.getAsBoolean("CFG_IS_LOG_ENABLED"))) {
            c38737cmB.setEnabled();
            slA.setEnabled();
        }
        this.f377802k = interfaceC38712bm;
    }

    public void a(C38691b1 c38691b1) {
        this.f377801j = c38691b1;
    }

    @Override // com.yandex.metrica.impl.ob.I0, com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void b(@j.P String str, @j.P String str2) {
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        this.f377800i.a(new J(str2, str, EnumC38666a1.EVENT_TYPE_STATBOX.b(), 0, c38737cm), this.f377793b);
        if (this.f377794c.isEnabled()) {
            StringBuilder sb2 = new StringBuilder("Statbox event received  with name: ");
            sb2.append(f(str));
            sb2.append(" with value: ");
            String strF = f(str2);
            if (strF.length() > 100) {
                sb2.append(strF.substring(0, 100));
                sb2.append("...");
            } else {
                sb2.append(strF);
            }
            this.f377794c.i(sb2.toString());
        }
    }

    public void c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f377793b.f379237c.a(str, str2);
        } else if (this.f377794c.isEnabled()) {
            this.f377794c.fw("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.I0, com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void d(@j.N String str, @j.P String str2) {
        List<Integer> list = C39278z0.f382293i;
        this.f377800i.a(new C38715c0(str2, str, EnumC38666a1.EVENT_TYPE_DIAGNOSTIC.b()), this.f377793b);
    }

    public void e(String str) {
        this.f377800i.e();
        this.f377801j.b();
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J("", str, EnumC38666a1.EVENT_TYPE_START.b(), c38737cm), this.f377793b);
        this.f377793b.h();
    }

    public void f() {
        this.f377800i.b(this.f377793b);
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Pause session");
        }
        d(null);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
        this.f377800i.a(new Sg(adRevenue, this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            C38737cm c38737cm = this.f377794c;
            StringBuilder sb2 = new StringBuilder("AdRevenue Received: AdRevenue{adRevenue=");
            sb2.append(adRevenue.adRevenue);
            sb2.append(", currency='");
            sb2.append(f(adRevenue.currency.getCurrencyCode()));
            sb2.append("', adType=");
            Object obj = adRevenue.adType;
            if (obj == null) {
                obj = "<null>";
            }
            sb2.append(obj);
            sb2.append(", adNetwork='");
            sb2.append(f(adRevenue.adNetwork));
            sb2.append("', adUnitId='");
            sb2.append(f(adRevenue.adUnitId));
            sb2.append("', adUnitName='");
            sb2.append(f(adRevenue.adUnitName));
            sb2.append("', adPlacementId='");
            sb2.append(f(adRevenue.adPlacementId));
            sb2.append("', adPlacementName='");
            sb2.append(f(adRevenue.adPlacementName));
            sb2.append("', precision='");
            sb2.append(f(adRevenue.precision));
            sb2.append("', payload=");
            sb2.append(Tl.g(adRevenue.payload));
            sb2.append('}');
            c38737cm.i(sb2.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.f377800i.a(eCommerceEvent, this.f377793b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
        B6 b62 = new B6(str, a(th2));
        T1 t12 = this.f377800i;
        byte[] byteArray = MessageNano.toByteArray(this.f377797f.fromModel(b62));
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J(byteArray, str, EnumC38666a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b(), c38737cm), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Error received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
        if (this.f377794c.isEnabled() && this.f377794c.isEnabled()) {
            this.f377794c.i("Event received: " + f(str));
        }
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        this.f377800i.a(new J("", str, EnumC38666a1.EVENT_TYPE_REGULAR.b(), 0, c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
        In inA = b.a().a(revenue);
        if (!inA.b()) {
            if (this.f377794c.isEnabled()) {
                this.f377794c.w("Passed revenue is not valid. Reason: " + inA.a());
                return;
            }
            return;
        }
        this.f377800i.a(new W1(revenue, this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            StringBuilder sb2 = new StringBuilder("Revenue received for productID: ");
            sb2.append(f(revenue.productID));
            sb2.append(" of quantity: ");
            Integer num = revenue.quantity;
            if (num != null) {
                sb2.append(num);
            } else {
                sb2.append("<null>");
            }
            sb2.append(" with price");
            if (revenue.priceMicros != null) {
                sb2.append(" (in micros): ");
                sb2.append(revenue.priceMicros);
            } else {
                sb2.append(": ");
                sb2.append(revenue.price);
            }
            sb2.append(" ");
            sb2.append(revenue.currency);
            this.f377794c.i(sb2.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
        H6 h6A = I6.a(th2, new C39212w6(null, null, ((Xl) this.f377802k).b()), null, this.f377803l.a(), this.f377803l.b());
        this.f377800i.b(h6A, this.f377793b);
        b(h6A);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
        C38680af c38680af = new C38680af();
        Iterator<UserProfileUpdate<? extends InterfaceC38705bf>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            Se se2 = (Se) it.next().getUserProfileUpdatePatcher();
            se2.a(this.f377794c);
            se2.a(c38680af);
        }
        C39197vf c39197vfC = c38680af.c();
        In inA = f377791o.a(c39197vfC);
        if (inA.b()) {
            this.f377800i.a(c39197vfC, this.f377793b);
            if (this.f377794c.isEnabled()) {
                this.f377794c.i("User profile received");
                return;
            }
            return;
        }
        if (this.f377794c.isEnabled()) {
            this.f377794c.w("UserInfo wasn't sent because " + inA.a());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        e(null);
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Resume session");
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        T1 t12 = this.f377800i;
        EnumC38666a1 enumC38666a1 = EnumC38666a1.EVENT_TYPE_PURGE_BUFFER;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J("", "", enumC38666a1.b(), 0, c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
        this.f377793b.b().i(z12);
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
        this.f377800i.b(str, this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Set user profile ID: " + f(str));
        }
    }

    public void a(Map<String, String> map) {
        if (A2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    @j.N
    public String f(@j.P String str) {
        return str == null ? "<null>" : str.isEmpty() ? "<empty>" : str;
    }

    public void d(String str) {
        if (this.f377793b.f()) {
            return;
        }
        this.f377800i.d();
        this.f377801j.a();
        this.f377793b.g();
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J("", str, EnumC38666a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void a(@j.N String str, @j.P byte[] bArr) {
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        J j12 = new J("", (String) null, EnumC38666a1.EVENT_TYPE_SET_SESSION_EXTRA.b(), c38737cm);
        if (bArr == null) {
            bArr = new byte[0];
        }
        j12.a(Collections.singletonMap(str, bArr));
        t12.a(j12, this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void c(@j.P String str) {
        this.f377800i.a(str, this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Error received: native");
        }
    }

    private void e(String str, String str2) {
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Event received: " + f(str) + ". With value: " + f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@j.N PluginErrorDetails pluginErrorDetails) {
        String strB;
        H6 h6A = this.f377804m.a(pluginErrorDetails);
        T1 t12 = this.f377800i;
        F6 f62 = h6A.f378242a;
        String str = "";
        if (f62 != null && (strB = f62.b()) != null) {
            str = strB;
        }
        byte[] byteArray = MessageNano.toByteArray(this.f377796e.fromModel(h6A));
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J(byteArray, str, EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), c38737cm), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Crash from plugin received: %s", f(pluginErrorDetails.getMessage()));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P Throwable th2) {
        this.f377800i.a(C39278z0.a(str2, MessageNano.toByteArray(this.f377798g.fromModel(new C39284z6(new B6(str2, a(th2)), str))), this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Error received: id: %s, message: %s", f(str), f(str2));
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, String str2) {
        if (this.f377794c.isEnabled()) {
            e(str, str2);
        }
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        this.f377800i.a(new J(str2, str, EnumC38666a1.EVENT_TYPE_REGULAR.b(), 0, c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void a(int i12, @j.P String str, @j.P String str2, @j.P Map<String, String> map, @j.P Map<String, byte[]> map2) {
        if (f377790n.contains(Integer.valueOf(i12)) || i12 < 1 || i12 > 99) {
            HashMap map3 = map == null ? null : new HashMap(map);
            C38737cm c38737cm = this.f377794c;
            List<Integer> list = C39278z0.f382293i;
            C38715c0 c38715c0C = new J(str2, str, EnumC38666a1.EVENT_TYPE_CUSTOM_EVENT.b(), i12, c38737cm).c(Tl.g(map3));
            if (map2 != null) {
                c38715c0C.a(map2);
            }
            this.f377800i.a(c38715c0C, this.f377793b);
        }
    }

    public boolean e() {
        boolean zF2 = this.f377793b.f();
        boolean z12 = !zF2;
        if (!zF2) {
            C38737cm c38737cm = this.f377794c;
            List<Integer> list = C39278z0.f382293i;
            this.f377800i.a(new J("", "", EnumC38666a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.b(), 0, c38737cm), this.f377793b);
        }
        return z12;
    }

    @Override // com.yandex.metrica.IReporter
    @j.N
    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void b(@j.N H6 h62) {
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Unhandled exception received: " + h62.toString());
        }
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map<String, Object> map) {
        HashMap map2 = A2.b(map) ? null : new HashMap(map);
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J("", str, EnumC38666a1.EVENT_TYPE_REGULAR.b(), 0, c38737cm), this.f377793b, map2);
        if (this.f377794c.isEnabled()) {
            e(str, map2 != null ? map2.toString() : null);
        }
    }

    @j.N
    private H6 a(@j.P Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof C38920k6) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return I6.a(th3, new C39212w6(null, null, ((Xl) this.f377802k).b()), stackTrace != null ? Arrays.asList(stackTrace) : null, this.f377803l.a(), this.f377803l.b());
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void b() throws JSONException {
        Integer numValueOf;
        T1 t12 = this.f377800i;
        Context context = this.f377792a;
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380254a = "";
        Integer numA = F0.g().c().a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (A2.a(23)) {
            try {
                Object systemService = context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
                if (systemService != null) {
                    numValueOf = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
            } catch (Throwable unused) {
            }
        } else {
            numValueOf = null;
        }
        JSONObject jSONObjectPut = new JSONObject().put("dfid", new JSONObject().putOpt("battery", numA).put("boot_time_seconds", jElapsedRealtime).putOpt("notification_filter", numValueOf));
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_IDENTITY_LIGHT.b();
        c38715c0.f380255b = jSONObjectPut.toString();
        t12.a(c38715c0, this.f377793b);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N PluginErrorDetails pluginErrorDetails, @j.P String str) {
        C39116s6 c39116s6 = this.f377804m;
        c39116s6.getClass();
        this.f377800i.a(C39278z0.a(str, MessageNano.toByteArray(this.f377797f.fromModel(new B6(str, pluginErrorDetails != null ? c39116s6.a(pluginErrorDetails) : null))), this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Error from plugin received: %s", f(str));
        }
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P PluginErrorDetails pluginErrorDetails) {
        C39116s6 c39116s6 = this.f377804m;
        c39116s6.getClass();
        this.f377800i.a(C39278z0.a(str2, MessageNano.toByteArray(this.f377798g.fromModel(new C39284z6(new B6(str2, pluginErrorDetails != null ? c39116s6.a(pluginErrorDetails) : null), str))), this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Error with identifier: %s from plugin received: %s", str, f(str2));
        }
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N H6 h62) {
        this.f377800i.a(h62, this.f377793b);
        b(h62);
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N C39212w6 c39212w6) {
        C39236x6 c39236x6 = new C39236x6(c39212w6, this.f377803l.a(), this.f377803l.b());
        T1 t12 = this.f377800i;
        byte[] byteArray = MessageNano.toByteArray(this.f377799h.fromModel(c39236x6));
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J(byteArray, "", EnumC38666a1.EVENT_TYPE_ANR.b(), c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void a(@j.N String str, @j.N JSONObject jSONObject) {
        T1 t12 = this.f377800i;
        C38715c0 c38715c0 = new C38715c0();
        c38715c0.f380254a = str;
        c38715c0.f380258e = EnumC38666a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b();
        c38715c0.f380255b = jSONObject.toString();
        t12.a(c38715c0, this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void b(@j.N String str) {
        this.f377800i.a(C38715c0.a(str), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void a(@j.N String str, @j.P String str2) {
        e(str, str2);
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        this.f377800i.a(new J(str2, str, EnumC38666a1.EVENT_TYPE_REGULAR.b(), 0, c38737cm).a(EnumC39254y0.JS), this.f377793b);
    }
}
