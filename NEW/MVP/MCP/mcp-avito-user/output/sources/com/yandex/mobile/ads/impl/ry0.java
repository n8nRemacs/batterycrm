package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ah;
import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.s10;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class ry0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final s10 f389699a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f389700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final gz f389701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final uy0 f389702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final Map<Class<?>, Object> f389703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private ah f389704f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private s10 f389705a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private String f389706b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private gz.a f389707c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        private uy0 f389708d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        private Map<Class<?>, Object> f389709e;

        public a() {
            this.f389709e = new LinkedHashMap();
            this.f389706b = "GET";
            this.f389707c = new gz.a();
        }

        @Y61.k
        public final a a(@Y61.k s10 s10Var) {
            this.f389705a = s10Var;
            return this;
        }

        @Y61.k
        public final a b(@Y61.k String str, @Y61.k String str2) {
            this.f389707c.c(str, str2);
            return this;
        }

        @Y61.k
        public final a a(@Y61.k URL url) {
            this.f389705a = s10.b.b(url.toString());
            return this;
        }

        @Y61.k
        public final void a(@Y61.k String str, @Y61.k String str2) {
            this.f389707c.a(str, str2);
        }

        public a(@Y61.k ry0 ry0Var) {
            LinkedHashMap linkedHashMap;
            this.f389709e = new LinkedHashMap();
            this.f389705a = ry0Var.h();
            this.f389706b = ry0Var.f();
            this.f389708d = ry0Var.a();
            if (ry0Var.c().isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(ry0Var.c());
            }
            this.f389709e = linkedHashMap;
            this.f389707c = ry0Var.d().b();
        }

        @Y61.k
        public final void a(@Y61.k String str) {
            this.f389707c.b(str);
        }

        @Y61.k
        public final a a(@Y61.k gz gzVar) {
            this.f389707c = gzVar.b();
            return this;
        }

        @Y61.k
        public final void a(@Y61.k ah ahVar) {
            String string = ahVar.toString();
            if (string.length() == 0) {
                this.f389707c.b("Cache-Control");
            } else {
                this.f389707c.c("Cache-Control", string);
            }
        }

        @Y61.k
        public final a a(@Y61.k String str, @Y61.l uy0 uy0Var) {
            if (str.length() > 0) {
                if (uy0Var == null) {
                    if (m10.d(str)) {
                        throw new IllegalArgumentException(AK.c.k("method ", str, " must have a request body.").toString());
                    }
                } else if (!m10.a(str)) {
                    throw new IllegalArgumentException(AK.c.k("method ", str, " must not have a request body.").toString());
                }
                this.f389706b = str;
                this.f389708d = uy0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        @Y61.k
        public final ry0 a() {
            s10 s10Var = this.f389705a;
            if (s10Var != null) {
                return new ry0(s10Var, this.f389706b, this.f389707c.a(), this.f389708d, qc1.a(this.f389709e));
            }
            throw new IllegalStateException("url == null");
        }
    }

    public ry0(@Y61.k s10 s10Var, @Y61.k String str, @Y61.k gz gzVar, @Y61.l uy0 uy0Var, @Y61.k Map<Class<?>, ? extends Object> map) {
        this.f389699a = s10Var;
        this.f389700b = str;
        this.f389701c = gzVar;
        this.f389702d = uy0Var;
        this.f389703e = map;
    }

    @Y61.l
    @X41.i
    public final uy0 a() {
        return this.f389702d;
    }

    @X41.i
    @Y61.k
    public final ah b() throws NumberFormatException {
        ah ahVar = this.f389704f;
        if (ahVar != null) {
            return ahVar;
        }
        int i12 = ah.f383553n;
        ah ahVarA = ah.b.a(this.f389701c);
        this.f389704f = ahVarA;
        return ahVarA;
    }

    @Y61.k
    public final Map<Class<?>, Object> c() {
        return this.f389703e;
    }

    @X41.i
    @Y61.k
    public final gz d() {
        return this.f389701c;
    }

    public final boolean e() {
        return this.f389699a.h();
    }

    @X41.i
    @Y61.k
    public final String f() {
        return this.f389700b;
    }

    @Y61.k
    public final a g() {
        return new a(this);
    }

    @X41.i
    @Y61.k
    public final s10 h() {
        return this.f389699a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f389700b);
        sb2.append(", url=");
        sb2.append(this.f389699a);
        if (this.f389701c.size() != 0) {
            sb2.append(", headers=[");
            int i12 = 0;
            for (kotlin.Q<? extends String, ? extends String> q12 : this.f389701c) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                kotlin.Q<? extends String, ? extends String> q13 = q12;
                String str = (String) q13.f406619b;
                String str2 = (String) q13.f406620c;
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i12 = i13;
            }
            sb2.append(']');
        }
        if (!this.f389703e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f389703e);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Y61.l
    public final String a(@Y61.k String str) {
        return this.f389701c.a(str);
    }
}
