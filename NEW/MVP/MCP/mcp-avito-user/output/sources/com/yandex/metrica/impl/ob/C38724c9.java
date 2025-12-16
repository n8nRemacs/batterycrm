package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39109s;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38724c9 extends AbstractC38749d9 implements InterfaceC38798f8 {

    /* renamed from: c, reason: collision with root package name */
    private static final Rd f380293c = new Rd("IDENTITY_SEND_TIME", null);

    /* renamed from: d, reason: collision with root package name */
    private static final Rd f380294d = new Rd("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: e, reason: collision with root package name */
    private static final Rd f380295e = new Rd("USER_INFO", null);

    /* renamed from: f, reason: collision with root package name */
    private static final Rd f380296f = new Rd("PROFILE_ID", null);

    /* renamed from: g, reason: collision with root package name */
    private static final Rd f380297g = new Rd("APP_ENVIRONMENT", null);

    /* renamed from: h, reason: collision with root package name */
    private static final Rd f380298h = new Rd("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: i, reason: collision with root package name */
    private static final Rd f380299i = new Rd("LAST_MIGRATION_VERSION", null);

    /* renamed from: j, reason: collision with root package name */
    private static final Rd f380300j = new Rd("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: k, reason: collision with root package name */
    private static final Rd f380301k = new Rd("APPLICATION_FEATURES", null);

    /* renamed from: l, reason: collision with root package name */
    private static final Rd f380302l = new Rd("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", null);

    /* renamed from: m, reason: collision with root package name */
    private static final Rd f380303m = new Rd("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: n, reason: collision with root package name */
    static final Rd f380304n = new Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    private static final Rd f380305o = new Rd("REFERRER_HANDLED", null);

    /* renamed from: p, reason: collision with root package name */
    private static final Rd f380306p = new Rd("VITAL_DATA", null);

    public C38724c9(S7 s72) {
        super(s72);
    }

    public C38724c9 a(C39109s.a aVar) {
        synchronized (this) {
            b(f380297g.a(), aVar.f381813a);
            b(f380298h.a(), aVar.f381814b);
        }
        return this;
    }

    public long b(long j12) {
        return a(f380293c.a(), j12);
    }

    public C38724c9 c(long j12) {
        return (C38724c9) b(f380293c.a(), j12);
    }

    public C38724c9 d(long j12) {
        return (C38724c9) b(f380302l.a(), j12);
    }

    public C38724c9 e(long j12) {
        return (C38724c9) b(f380294d.a(), j12);
    }

    public C39109s.a f() {
        C39109s.a aVar;
        synchronized (this) {
            aVar = new C39109s.a(a(f380297g.a(), "{}"), a(f380298h.a(), 0L));
        }
        return aVar;
    }

    public String g() {
        return a(f380301k.a(), "");
    }

    public C38724c9 h(String str) {
        return (C38724c9) b(f380301k.a(), str);
    }

    public int i() {
        return a(f380300j.a(), -1);
    }

    public C38724c9 j(String str) {
        return (C38724c9) b(f380295e.a(), str);
    }

    public long k() {
        return a(f380302l.a(), 0L);
    }

    public long l() {
        return a(f380294d.a(), 0L);
    }

    @j.P
    public String m() {
        return e(f380296f.a());
    }

    public String n() {
        return a(f380295e.a(), (String) null);
    }

    public boolean o() {
        return a(f380304n.a(), false);
    }

    public C38724c9 p() {
        return (C38724c9) b(f380304n.a(), true);
    }

    @j.N
    @Deprecated
    public C38724c9 q() {
        return (C38724c9) b(f380305o.a(), true);
    }

    @j.N
    @Deprecated
    public C38724c9 r() {
        return (C38724c9) f(f380299i.a());
    }

    @j.N
    @Deprecated
    public C38724c9 s() {
        return (C38724c9) f(f380305o.a());
    }

    @j.P
    @Deprecated
    public Boolean t() {
        Rd rd2 = f380305o;
        if (c(rd2.a())) {
            return Boolean.valueOf(a(rd2.a(), false));
        }
        return null;
    }

    public C38724c9 c(String str, String str2) {
        return (C38724c9) b(new Rd("SESSION_", str).a(), str2);
    }

    public String g(String str) {
        return a(new Rd("SESSION_", str).a(), "");
    }

    @j.N
    public List<String> h() {
        return a(f380303m.a(), Collections.emptyList());
    }

    public C38724c9 i(@j.P String str) {
        return (C38724c9) b(f380296f.a(), str);
    }

    @j.P
    @Deprecated
    public Integer j() {
        Rd rd2 = f380299i;
        if (c(rd2.a())) {
            return Integer.valueOf((int) a(rd2.a(), 0L));
        }
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    @j.P
    public String c() {
        return a(f380306p.a(), (String) null);
    }

    public C38724c9 a(int i12) {
        return (C38724c9) b(f380300j.a(), i12);
    }

    public C38724c9 a(List<String> list) {
        return (C38724c9) b(f380303m.a(), list);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    public void a(@j.N String str) {
        b(f380306p.a(), str);
    }
}
