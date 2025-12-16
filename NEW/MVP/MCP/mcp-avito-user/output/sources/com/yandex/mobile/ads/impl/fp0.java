package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.fz;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class fp0<T> implements dp0<T> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f385460j = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f385461a;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final oz0<T> f385466f;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final av f385462b = new av();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final xf0 f385463c = new xf0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final b01 f385464d = new b01();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final yl f385465e = new yl();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final a00 f385467g = new a00();

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final aa0 f385468h = new aa0();

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final l9 f385469i = new l9();

    public class a implements fz.a<Long> {
        @Override // com.yandex.mobile.ads.impl.fz.a
        @j.P
        public final Long a(String str) {
            long j12 = 0L;
            int i12 = g7.f385602b;
            if (str == null) {
                return j12;
            }
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return j12;
            }
        }
    }

    public class b implements fz.a<Integer> {
        @Override // com.yandex.mobile.ads.impl.fz.a
        @j.N
        public final Integer a(String str) throws NumberFormatException {
            int i12;
            int i13 = g7.f385602b;
            try {
                i12 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i12 = 0;
            }
            return Integer.valueOf(Math.min(i12, AdResponse.f382541M.intValue()));
        }
    }

    public fp0(@j.N n2 n2Var, @j.N oz0 oz0Var) {
        this.f385461a = n2Var;
        this.f385466f = oz0Var;
    }

    @Override // com.yandex.mobile.ads.impl.dp0
    @j.N
    public final AdResponse<T> a(@j.N jz0 jz0Var, @j.N Map<String, String> map, @j.N y6 y6Var) throws NumberFormatException, UnsupportedEncodingException {
        Locale locale;
        Long lValueOf;
        AdResponse.b bVar = new AdResponse.b();
        bVar.e(this.f385461a.c());
        bVar.a(y6Var);
        int iB2 = fz.b(map, 2);
        int iB3 = fz.b(map, 3);
        bVar.e(iB2);
        bVar.b(iB3);
        String str = map.get(i10.b(40));
        String str2 = map.get(i10.b(41));
        bVar.d(str);
        bVar.h(str2);
        String str3 = map.get(i10.b(46));
        if (str3 != null) {
            this.f385469i.getClass();
            bVar.a(l9.a(str3));
        }
        SizeInfo sizeInfoN = this.f385461a.n();
        int i12 = 0;
        bVar.g(sizeInfoN != null ? sizeInfoN.d() : 0);
        bVar.c(fz.e(map, 6));
        bVar.f(fz.e(map, 14));
        bVar.a(fz.a(map, 16, new a()));
        bVar.d(fz.a(map, 37, new b()));
        bVar.e(fz.e(map, 7));
        FalseClick falseClick = null;
        bVar.a(fz.c(map, 8) != null ? Long.valueOf(r10.intValue() * f385460j) : null);
        bVar.b(fz.c(map, 26) != null ? Long.valueOf(r10.intValue() * f385460j) : null);
        bVar.f(map.get(i10.b(12)));
        this.f385468h.getClass();
        String str4 = map.get(i10.b(13));
        Locale[] availableLocales = Locale.getAvailableLocales();
        int length = availableLocales.length;
        while (true) {
            if (i12 >= length) {
                locale = null;
                break;
            }
            if (availableLocales[i12].getLanguage().equals(str4)) {
                locale = new Locale(str4);
                break;
            }
            i12++;
        }
        bVar.a(locale);
        bVar.b(fz.e(map, 11));
        bVar.f(fz.b(map, 22));
        bVar.c(fz.b(map, 23));
        bVar.d(fz.b(map, 24));
        bVar.a(fz.b(map, 29));
        bVar.i(map.get(i10.b(21)));
        bVar.d(fz.a(map, 10));
        bVar.g(map.get(i10.b(49)));
        bVar.b(map.get(i10.b(30)));
        this.f385465e.getClass();
        bVar.a(yl.a(map));
        bVar.a(this.f385464d.a(jz0Var));
        this.f385462b.getClass();
        Map<String, String> mapB = jz0Var.b();
        String strD = fz.d(mapB, 19);
        String str5 = mapB.get(i10.b(20));
        int i13 = g7.f385602b;
        if (str5 != null) {
            try {
                lValueOf = Long.valueOf(str5);
            } catch (NumberFormatException unused) {
            }
        } else {
            lValueOf = null;
        }
        if (strD != null && lValueOf != null) {
            falseClick = new FalseClick(strD, lValueOf.longValue());
        }
        bVar.a(falseClick);
        this.f385467g.getClass();
        bVar.a(a00.a(map));
        bVar.e(fz.a(map, 31));
        bVar.c(fz.a(map, 38));
        boolean zA2 = fz.a(map, 15);
        bVar.b(zA2);
        if (zA2) {
            bVar.a(this.f385463c.a(jz0Var));
        } else {
            bVar.a((AdResponse.b) this.f385466f.a(jz0Var));
        }
        bVar.c(map.get(i10.b(42)));
        bVar.a(map.get(i10.b(5)));
        bVar.a(fz.a(map, 47));
        return bVar.a();
    }
}
