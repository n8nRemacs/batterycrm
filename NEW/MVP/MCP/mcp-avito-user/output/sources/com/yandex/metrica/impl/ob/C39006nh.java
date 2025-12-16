package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39006nh implements M0, IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38906jh> f381162a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile M0 f381163b;

    /* renamed from: com.yandex.metrica.impl.ob.nh$a */
    public class a implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381165b;

        public a(C39006nh c39006nh, String str, String str2) {
            this.f381164a = str;
            this.f381165b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.d(this.f381164a, this.f381165b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$b */
    public class b implements InterfaceC38906jh {
        public b(C39006nh c39006nh) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$c */
    public class c implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H6 f381166a;

        public c(C39006nh c39006nh, H6 h62) {
            this.f381166a = h62;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.a(this.f381166a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$d */
    public class d implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381167a;

        public d(C39006nh c39006nh, String str) {
            this.f381167a = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportEvent(this.f381167a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$e */
    public class e implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381169b;

        public e(C39006nh c39006nh, String str, String str2) {
            this.f381168a = str;
            this.f381169b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportEvent(this.f381168a, this.f381169b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$f */
    public class f implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381170a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f381171b;

        public f(C39006nh c39006nh, String str, Map map) {
            this.f381170a = str;
            this.f381171b = map;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportEvent(this.f381170a, this.f381171b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$g */
    public class g implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f381173b;

        public g(C39006nh c39006nh, String str, Throwable th2) {
            this.f381172a = str;
            this.f381173b = th2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportError(this.f381172a, this.f381173b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$h */
    public class h implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381175b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f381176c;

        public h(C39006nh c39006nh, String str, String str2, Throwable th2) {
            this.f381174a = str;
            this.f381175b = str2;
            this.f381176c = th2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportError(this.f381174a, this.f381175b, this.f381176c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$i */
    public class i implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f381177a;

        public i(C39006nh c39006nh, Throwable th2) {
            this.f381177a = th2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportUnhandledException(this.f381177a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$j */
    public class j implements InterfaceC38906jh {
        public j(C39006nh c39006nh) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$k */
    public class k implements InterfaceC38906jh {
        public k(C39006nh c39006nh) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$l */
    public class l implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381178a;

        public l(C39006nh c39006nh, String str) {
            this.f381178a = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.setUserProfileID(this.f381178a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$m */
    public class m implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UserProfile f381179a;

        public m(C39006nh c39006nh, UserProfile userProfile) {
            this.f381179a = userProfile;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportUserProfile(this.f381179a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$n */
    public class n implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39212w6 f381180a;

        public n(C39006nh c39006nh, C39212w6 c39212w6) {
            this.f381180a = c39212w6;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.a(this.f381180a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$o */
    public class o implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Revenue f381181a;

        public o(C39006nh c39006nh, Revenue revenue) {
            this.f381181a = revenue;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportRevenue(this.f381181a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$p */
    public class p implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f381182a;

        public p(C39006nh c39006nh, ECommerceEvent eCommerceEvent) {
            this.f381182a = eCommerceEvent;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportECommerce(this.f381182a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$q */
    public class q implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f381183a;

        public q(C39006nh c39006nh, boolean z12) {
            this.f381183a = z12;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.setStatisticsSending(this.f381183a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$r */
    public class r implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdRevenue f381184a;

        public r(C39006nh c39006nh, AdRevenue adRevenue) {
            this.f381184a = adRevenue;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.reportAdRevenue(this.f381184a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$s */
    public class s implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f381185a;

        public s(C39006nh c39006nh, PluginErrorDetails pluginErrorDetails) {
            this.f381185a = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.getPluginExtension().reportUnhandledException(this.f381185a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$t */
    public class t implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f381186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381187b;

        public t(C39006nh c39006nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.f381186a = pluginErrorDetails;
            this.f381187b = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.getPluginExtension().reportError(this.f381186a, this.f381187b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$u */
    public class u implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381188a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PluginErrorDetails f381190c;

        public u(C39006nh c39006nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f381188a = str;
            this.f381189b = str2;
            this.f381190c = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.getPluginExtension().reportError(this.f381188a, this.f381189b, this.f381190c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$v */
    public class v implements InterfaceC38906jh {
        public v(C39006nh c39006nh) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$w */
    public class w implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f381192b;

        public w(C39006nh c39006nh, String str, JSONObject jSONObject) {
            this.f381191a = str;
            this.f381192b = jSONObject;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.a(this.f381191a, this.f381192b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$x */
    public class x implements InterfaceC38906jh {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381193a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f381194b;

        public x(C39006nh c39006nh, String str, String str2) {
            this.f381193a = str;
            this.f381194b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38906jh
        public void a(@j.N M0 m02) {
            m02.b(this.f381193a, this.f381194b);
        }
    }

    public synchronized void a(@j.N Context context) {
        try {
            this.f381163b = Pf.a().a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Iterator<InterfaceC38906jh> it = this.f381162a.iterator();
            while (it.hasNext()) {
                it.next().a(this.f381163b);
            }
            this.f381162a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void b() {
        a(new v(this));
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void d(@j.N String str, @j.P String str2) {
        a(new a(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        a(new k(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
        a(new r(this, adRevenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
        a(new p(this, eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
        a(new g(this, str, th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
        a(new d(this, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
        a(new o(this, revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
        a(new i(this, th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
        a(new m(this, userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        a(new j(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        a(new b(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
        a(new q(this, z12));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
        a(new l(this, str));
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void b(@j.P String str, @j.P String str2) {
        a(new x(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
        a(new h(this, str, str2, null));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P String str2) {
        a(new e(this, str, str2));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@j.N PluginErrorDetails pluginErrorDetails) {
        a(new s(this, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.N Throwable th2) {
        a(new h(this, str, str2, th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map<String, Object> map) {
        a(new f(this, str, map));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N PluginErrorDetails pluginErrorDetails, @j.P String str) {
        a(new t(this, pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N H6 h62) {
        a(new c(this, h62));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P PluginErrorDetails pluginErrorDetails) {
        a(new u(this, str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N C39212w6 c39212w6) {
        a(new n(this, c39212w6));
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void a(@j.N String str, @j.N JSONObject jSONObject) {
        a(new w(this, str, jSONObject));
    }

    private synchronized void a(@j.N InterfaceC38906jh interfaceC38906jh) {
        try {
            if (this.f381163b == null) {
                this.f381162a.add(interfaceC38906jh);
            } else {
                interfaceC38906jh.a(this.f381163b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.yandex.metrica.IReporter
    @j.N
    public IPluginReporter getPluginExtension() {
        return this;
    }
}
