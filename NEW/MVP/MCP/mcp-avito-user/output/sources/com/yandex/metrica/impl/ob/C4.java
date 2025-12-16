package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.C39078qf;
import com.yandex.metrica.impl.ob.E4;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class C4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map<Integer, Integer> f377882h = Collections.unmodifiableMap(new a());

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38715c0 f377883a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final D4 f377884b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final E4 f377885c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38738cn f377886d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38738cn f377887e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f377888f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final O3 f377889g;

    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(Integer.valueOf(EnumC38666a1.EVENT_TYPE_DIAGNOSTIC.b()), 22);
            put(Integer.valueOf(EnumC38666a1.EVENT_TYPE_DIAGNOSTIC_STATBOX.b()), 23);
            put(Integer.valueOf(EnumC38666a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b()), 24);
            put(Integer.valueOf(EnumC38666a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b()), 24);
        }
    }

    public C4(@j.N C38715c0 c38715c0, @j.N D4 d42, @j.N E4 e42, @j.N O3 o32, @j.N C38738cn c38738cn, @j.N C38738cn c38738cn2, @j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f377883a = c38715c0;
        this.f377884b = d42;
        this.f377885c = e42;
        this.f377889g = o32;
        this.f377887e = c38738cn;
        this.f377886d = c38738cn2;
        this.f377888f = fVar;
    }

    public byte[] a() throws UnsupportedEncodingException {
        C39078qf c39078qf = new C39078qf();
        C39078qf.d dVar = new C39078qf.d();
        c39078qf.f381495a = new C39078qf.d[]{dVar};
        E4.a aVarA = this.f377885c.a();
        dVar.f381529a = aVarA.f378005a;
        C39078qf.d.b bVar = new C39078qf.d.b();
        dVar.f381530b = bVar;
        bVar.f381569c = 2;
        bVar.f381567a = new C39078qf.f();
        C39078qf.f fVar = dVar.f381530b.f381567a;
        long j12 = aVarA.f378006b;
        fVar.f381575a = j12;
        fVar.f381576b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(j12 * 1000) / 1000;
        dVar.f381530b.f381568b = this.f377884b.k();
        C39078qf.d.a aVar = new C39078qf.d.a();
        dVar.f381531c = new C39078qf.d.a[]{aVar};
        aVar.f381533a = aVarA.f378007c;
        aVar.f381548p = this.f377889g.a(this.f377883a.o());
        aVar.f381534b = this.f377888f.c() - aVarA.f378006b;
        aVar.f381535c = f377882h.get(Integer.valueOf(this.f377883a.o())).intValue();
        if (!TextUtils.isEmpty(this.f377883a.g())) {
            aVar.f381536d = this.f377887e.a(this.f377883a.g());
        }
        if (!TextUtils.isEmpty(this.f377883a.q())) {
            String strQ = this.f377883a.q();
            String strA = this.f377886d.a(strQ);
            if (!TextUtils.isEmpty(strA)) {
                aVar.f381537e = strA.getBytes();
            }
            int length = strQ.getBytes().length;
            byte[] bArr = aVar.f381537e;
            aVar.f381542j = length - (bArr == null ? 0 : bArr.length);
        }
        return MessageNano.toByteArray(c39078qf);
    }
}
