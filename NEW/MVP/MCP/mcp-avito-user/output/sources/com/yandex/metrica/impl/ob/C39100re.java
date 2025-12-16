package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.C39078qf;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.Tl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.re, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39100re {

    /* renamed from: h, reason: collision with root package name */
    private static Map<D0, Integer> f381740h;

    /* renamed from: i, reason: collision with root package name */
    private static final C39100re f381741i;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39268ye f381742a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ge f381743b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39028oe f381744c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39124se f381745d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final InterfaceC39244xe f381746e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final InterfaceC39292ze f381747f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39148te f381748g;

    /* renamed from: com.yandex.metrica.impl.ob.re$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private InterfaceC39268ye f381749a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private Ge f381750b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private InterfaceC39028oe f381751c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private InterfaceC39124se f381752d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private InterfaceC39244xe f381753e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private InterfaceC39292ze f381754f;

        /* renamed from: g, reason: collision with root package name */
        @j.N
        private C39148te f381755g;

        private b(@j.N C39100re c39100re) {
            this.f381749a = c39100re.f381742a;
            this.f381750b = c39100re.f381743b;
            this.f381751c = c39100re.f381744c;
            this.f381752d = c39100re.f381745d;
            this.f381753e = c39100re.f381746e;
            this.f381754f = c39100re.f381747f;
            this.f381755g = c39100re.f381748g;
        }

        @j.N
        public b a(@j.N InterfaceC39268ye interfaceC39268ye) {
            this.f381749a = interfaceC39268ye;
            return this;
        }

        @j.N
        public b a(@j.N Ge ge2) {
            this.f381750b = ge2;
            return this;
        }

        @j.N
        public b a(@j.N InterfaceC39028oe interfaceC39028oe) {
            this.f381751c = interfaceC39028oe;
            return this;
        }

        @j.N
        public b a(@j.N InterfaceC39124se interfaceC39124se) {
            this.f381752d = interfaceC39124se;
            return this;
        }

        @j.N
        public b a(@j.N InterfaceC39244xe interfaceC39244xe) {
            this.f381753e = interfaceC39244xe;
            return this;
        }

        @j.N
        public b a(@j.N InterfaceC39292ze interfaceC39292ze) {
            this.f381754f = interfaceC39292ze;
            return this;
        }

        public C39100re a() {
            return new C39100re(this);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(D0.FIRST_OCCURRENCE, 1);
        map.put(D0.NON_FIRST_OCCURENCE, 0);
        map.put(D0.UNKNOWN, -1);
        f381740h = Collections.unmodifiableMap(map);
        f381741i = new C39100re(new De(), new Ee(), new Ae(), new Ce(), new C39172ue(), new C39196ve(), new C39148te());
    }

    private C39100re(@j.N b bVar) {
        this(bVar.f381749a, bVar.f381750b, bVar.f381751c, bVar.f381752d, bVar.f381753e, bVar.f381754f, bVar.f381755g);
    }

    public static C39100re b() {
        return f381741i;
    }

    @j.N
    public C39078qf.d.a a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        C39078qf.d.a.C10961a c10961a;
        int iA2;
        C39078qf.d.a aVar = new C39078qf.d.a();
        C39078qf.d.a.c cVarA = this.f381747f.a(c39077qe.f381483o, c39077qe.f381484p, c39077qe.f381477i, c39077qe.f381476h);
        C39078qf.b bVarA = this.f381746e.a(c39077qe.f381475g);
        String str = c39077qe.f381481m;
        if (TextUtils.isEmpty(str)) {
            c10961a = null;
        } else {
            com.yandex.metrica.i iVarA = C38689b.a(str);
            c10961a = new C39078qf.d.a.C10961a();
            if (!TextUtils.isEmpty(iVarA.f377709a)) {
                c10961a.f381557a = iVarA.f377709a;
            }
            if (!TextUtils.isEmpty(iVarA.f377710b)) {
                c10961a.f381558b = iVarA.f377710b;
            }
            if (!A2.b(iVarA.f377711c)) {
                c10961a.f381559c = Tl.g(iVarA.f377711c);
            }
        }
        if (cVarA != null) {
            aVar.f381539g = cVarA;
        }
        if (bVarA != null) {
            aVar.f381538f = bVarA;
        }
        String strA = this.f381742a.a(c39077qe.f381469a);
        if (strA != null) {
            aVar.f381536d = strA;
        }
        aVar.f381537e = this.f381743b.a(c39077qe, lg2);
        String str2 = c39077qe.f381480l;
        if (str2 != null) {
            aVar.f381540h = str2;
        }
        if (c10961a != null) {
            aVar.f381541i = c10961a;
        }
        Integer numA = this.f381745d.a(c39077qe);
        if (numA != null) {
            aVar.f381535c = numA.intValue();
        }
        if (c39077qe.f381471c != null) {
            aVar.f381533a = r9.intValue();
        }
        if (c39077qe.f381472d != null) {
            aVar.f381547o = r9.intValue();
        }
        if (c39077qe.f381473e != null) {
            aVar.f381548p = r9.intValue();
        }
        Long l12 = c39077qe.f381474f;
        if (l12 != null) {
            aVar.f381534b = l12.longValue();
        }
        Integer num = c39077qe.f381482n;
        if (num != null) {
            aVar.f381542j = num.intValue();
        }
        aVar.f381543k = this.f381744c.a(c39077qe.f381486r);
        String str3 = c39077qe.f381475g;
        if (str3 != null) {
            try {
                iA2 = new L6().a(Boolean.valueOf(new Tl.a(str3).getBoolean("enabled")));
            } catch (Throwable unused) {
            }
        } else {
            iA2 = -1;
        }
        aVar.f381544l = iA2;
        String str4 = c39077qe.f381485q;
        if (str4 != null) {
            aVar.f381545m = str4.getBytes();
        }
        D0 d02 = c39077qe.f381487s;
        Integer num2 = d02 != null ? f381740h.get(d02) : null;
        if (num2 != null) {
            aVar.f381546n = num2.intValue();
        }
        E.b.a aVar2 = c39077qe.f381488t;
        if (aVar2 != null) {
            aVar.f381549q = J1.a(aVar2);
        }
        C39026oc.a aVar3 = c39077qe.f381489u;
        int iA3 = aVar3 != null ? J1.a(aVar3) : 3;
        Integer num3 = c39077qe.f381490v;
        if (num3 != null) {
            aVar.f381551s = num3.intValue();
        }
        aVar.f381550r = iA3;
        Integer num4 = c39077qe.f381491w;
        aVar.f381552t = num4 == null ? 0 : num4.intValue();
        EnumC39254y0 enumC39254y0 = c39077qe.f381492x;
        if (enumC39254y0 != null) {
            aVar.f381553u = enumC39254y0.f382217a;
        }
        Boolean bool = c39077qe.f381493y;
        if (bool != null) {
            aVar.f381554v = bool.booleanValue();
        }
        if (c39077qe.f381494z != null) {
            aVar.f381555w = r9.intValue();
        }
        aVar.f381556x = this.f381748g.a(c39077qe.f381468A);
        return aVar;
    }

    private C39100re(@j.N InterfaceC39268ye interfaceC39268ye, @j.N Ge ge2, @j.N InterfaceC39028oe interfaceC39028oe, @j.N InterfaceC39124se interfaceC39124se, @j.N InterfaceC39244xe interfaceC39244xe, @j.N InterfaceC39292ze interfaceC39292ze, @j.N C39148te c39148te) {
        this.f381742a = interfaceC39268ye;
        this.f381743b = ge2;
        this.f381744c = interfaceC39028oe;
        this.f381745d = interfaceC39124se;
        this.f381746e = interfaceC39244xe;
        this.f381747f = interfaceC39292ze;
        this.f381748g = c39148te;
    }

    public static b a() {
        return new b();
    }
}
