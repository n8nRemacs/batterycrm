package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.List;

/* loaded from: classes7.dex */
public class D4 extends Hg {

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private List<String> f377949o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private String f377950p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f377951q;

    @j.N
    public String B() {
        return this.f377950p;
    }

    @j.P
    public List<String> C() {
        return this.f377949o;
    }

    @j.P
    public Boolean D() {
        return this.f377951q;
    }

    public void a(@j.P List<String> list) {
        this.f377949o = list;
    }

    public void h(@j.N String str) {
        this.f377950p = str;
    }

    @Override // com.yandex.metrica.impl.ob.Hg, com.yandex.metrica.impl.ob.Eg
    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.f377949o + ", mApiKey='" + this.f377950p + "', statisticsSending=" + this.f377951q + "} " + super.toString();
    }

    public void a(Boolean bool) {
        this.f377951q = bool;
    }

    public static final class a extends Eg.a<D3.a, a> {

        /* renamed from: d, reason: collision with root package name */
        @j.N
        public final String f377952d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f377953e;

        public a(@j.P String str, @j.P String str2, @j.P String str3, @j.N String str4, @j.P Boolean bool) {
            super(str, str2, str3);
            this.f377952d = str4;
            this.f377953e = ((Boolean) Tl.a(bool, Boolean.TRUE)).booleanValue();
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        @j.N
        public Object a(@j.N Object obj) {
            D3.a aVar = (D3.a) obj;
            String str = aVar.f377932a;
            String str2 = this.f378066a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f377933b;
            String str4 = this.f378067b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f377934c;
            String str6 = this.f378068c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f377935d;
            String str8 = this.f377952d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f377943l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f377953e) : bool);
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        public boolean b(@j.N Object obj) {
            String str;
            String str2;
            String str3;
            D3.a aVar = (D3.a) obj;
            String str4 = aVar.f377932a;
            return (str4 == null || str4.equals(this.f378066a)) && ((str = aVar.f377933b) == null || str.equals(this.f378067b)) && (((str2 = aVar.f377934c) == null || str2.equals(this.f378068c)) && ((str3 = aVar.f377935d) == null || str3.equals(this.f377952d)));
        }

        public a(@j.N D3.a aVar) {
            this(aVar.f377932a, aVar.f377933b, aVar.f377934c, aVar.f377935d, aVar.f377943l);
        }
    }

    public static class b extends Hg.a<D4, a> {
        public b(@j.N Context context, @j.N String str) {
            super(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.Eg.d
        @j.N
        public Eg a(@j.N Object obj) {
            Eg.c cVar = (Eg.c) obj;
            D4 d4A = a(cVar);
            d4A.a(cVar.f378071a.k());
            d4A.h(((a) cVar.f378072b).f377952d);
            d4A.a(Boolean.valueOf(((a) cVar.f378072b).f377953e));
            return d4A;
        }

        @Override // com.yandex.metrica.impl.ob.Eg.b
        @j.N
        public Eg a() {
            return new D4();
        }
    }
}
