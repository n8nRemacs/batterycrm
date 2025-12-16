package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class si {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f389950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final a f389951c = new a();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private static final LinkedHashMap f389952d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389953e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389954f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389955g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389956h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389957i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389958j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389959k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389960l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389961m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389962n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389963o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389964p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389965q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389966r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389967s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final si f389968t;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f389969a;

    public static final class a implements Comparator<String> {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = (java.lang.String) r6
                int r0 = r5.length()
                int r1 = r6.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L11:
                if (r1 >= r0) goto L27
                char r2 = r5.charAt(r1)
                char r3 = r6.charAt(r1)
                if (r2 == r3) goto L24
                int r5 = kotlin.jvm.internal.L.g(r2, r3)
                if (r5 >= 0) goto L35
                goto L33
            L24:
                int r1 = r1 + 1
                goto L11
            L27:
                int r5 = r5.length()
                int r6 = r6.length()
                if (r5 == r6) goto L37
                if (r5 >= r6) goto L35
            L33:
                r5 = -1
                goto L38
            L35:
                r5 = 1
                goto L38
            L37:
                r5 = 0
            L38:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.si.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static final class b {
        public /* synthetic */ b(int i12) {
            this();
        }

        @Y61.k
        public static a a() {
            return si.f389951c;
        }

        private b() {
        }

        @X41.n
        @Y61.k
        public final synchronized si a(@Y61.k String str) {
            si siVar;
            String string;
            try {
                siVar = (si) ((LinkedHashMap) si.f389952d).get(str);
                if (siVar == null) {
                    Map map = si.f389952d;
                    int i12 = 0;
                    if (C43066x.h0(str, "TLS_", false)) {
                        StringBuilder sbA = Cif.a("SSL_");
                        sbA.append(str.substring(4));
                        string = sbA.toString();
                    } else if (C43066x.h0(str, "SSL_", false)) {
                        StringBuilder sbA2 = Cif.a("TLS_");
                        sbA2.append(str.substring(4));
                        string = sbA2.toString();
                    } else {
                        string = str;
                    }
                    siVar = (si) ((LinkedHashMap) map).get(string);
                    if (siVar == null) {
                        siVar = new si(str, i12);
                    }
                    si.f389952d.put(str, siVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return siVar;
        }
    }

    static {
        int i12 = 0;
        f389950b = new b(i12);
        si siVarA = ri.a("SSL_RSA_WITH_DES_CBC_SHA", ri.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", ri.a("SSL_RSA_WITH_RC4_128_SHA", ri.a("SSL_RSA_WITH_RC4_128_MD5", ri.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", ri.a("SSL_RSA_WITH_NULL_SHA", ri.a("SSL_RSA_WITH_NULL_MD5", new si("SSL_RSA_WITH_NULL_MD5", i12), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f389952d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", siVarA);
        f389953e = siVarA;
        si siVarA2 = ri.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", ri.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", ri.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", ri.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", ri.a("TLS_KRB5_WITH_RC4_128_MD5", ri.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", ri.a("TLS_KRB5_WITH_DES_CBC_MD5", ri.a("TLS_KRB5_WITH_RC4_128_SHA", ri.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_KRB5_WITH_DES_CBC_SHA", ri.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", ri.a("SSL_DH_anon_WITH_DES_CBC_SHA", ri.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", ri.a("SSL_DH_anon_WITH_RC4_128_MD5", ri.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", ri.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", ri.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", ri.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", ri.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", ri.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", ri.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new si("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i12), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0), "SSL_DH_anon_WITH_RC4_128_MD5", 0), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f389952d.put("TLS_RSA_WITH_AES_128_CBC_SHA", siVarA2);
        f389954f = siVarA2;
        si siVarA3 = ri.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", ri.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", ri.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new si("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i12), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f389952d.put("TLS_RSA_WITH_AES_256_CBC_SHA", siVarA3);
        f389955g = siVarA3;
        si siVarA4 = ri.a("TLS_RSA_WITH_SEED_CBC_SHA", ri.a("TLS_PSK_WITH_AES_256_CBC_SHA", ri.a("TLS_PSK_WITH_AES_128_CBC_SHA", ri.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_PSK_WITH_RC4_128_SHA", ri.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", ri.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", ri.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", ri.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", ri.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", ri.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", ri.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", ri.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", ri.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", ri.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", ri.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", ri.a("TLS_RSA_WITH_AES_256_CBC_SHA256", ri.a("TLS_RSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_RSA_WITH_NULL_SHA256", ri.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", ri.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", ri.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new si("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i12), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f389952d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", siVarA4);
        f389956h = siVarA4;
        si siVar = new si("TLS_RSA_WITH_AES_256_GCM_SHA384", i12);
        f389952d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", siVar);
        f389957i = siVar;
        si siVarA5 = ri.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", ri.a("TLS_ECDHE_RSA_WITH_NULL_SHA", ri.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", ri.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", ri.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", ri.a("TLS_ECDH_RSA_WITH_NULL_SHA", ri.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", ri.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", ri.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", ri.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", ri.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", ri.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", ri.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", ri.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", ri.a("TLS_FALLBACK_SCSV", ri.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", ri.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", ri.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", ri.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", ri.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", ri.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", ri.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new si("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i12), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0), "TLS_FALLBACK_SCSV", 0), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0), "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f389952d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", siVarA5);
        f389958j = siVarA5;
        si siVar2 = new si("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i12);
        f389952d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", siVar2);
        f389959k = siVar2;
        si siVarA6 = ri.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", ri.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", ri.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", ri.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", ri.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", ri.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", ri.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", ri.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", ri.a("TLS_ECDH_anon_WITH_RC4_128_SHA", ri.a("TLS_ECDH_anon_WITH_NULL_SHA", new si("TLS_ECDH_anon_WITH_NULL_SHA", i12), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0);
        f389952d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", siVarA6);
        f389960l = siVarA6;
        si siVar3 = new si("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i12);
        f389952d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", siVar3);
        f389961m = siVar3;
        si siVarA7 = ri.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", ri.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new si("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i12), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f389952d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", siVarA7);
        f389962n = siVarA7;
        si siVar4 = new si("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i12);
        f389952d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", siVar4);
        f389963o = siVar4;
        si siVarA8 = ri.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", ri.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", ri.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", ri.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new si("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i12), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f389952d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", siVarA8);
        f389964p = siVarA8;
        si siVar5 = new si("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i12);
        f389952d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", siVar5);
        f389965q = siVar5;
        si siVarA9 = ri.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", ri.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new si("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i12), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f389952d.put("TLS_AES_128_GCM_SHA256", siVarA9);
        f389966r = siVarA9;
        si siVar6 = new si("TLS_AES_256_GCM_SHA384", i12);
        f389952d.put("TLS_AES_256_GCM_SHA384", siVar6);
        f389967s = siVar6;
        si siVar7 = new si("TLS_CHACHA20_POLY1305_SHA256", i12);
        f389952d.put("TLS_CHACHA20_POLY1305_SHA256", siVar7);
        f389968t = siVar7;
        f389952d.put("TLS_AES_128_CCM_8_SHA256", ri.a("TLS_AES_128_CCM_SHA256", new si("TLS_AES_128_CCM_SHA256", i12), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    public /* synthetic */ si(String str, int i12) {
        this(str);
    }

    @X41.i
    @Y61.k
    public final String c() {
        return this.f389969a;
    }

    @Y61.k
    public final String toString() {
        return this.f389969a;
    }

    private si(String str) {
        this.f389969a = str;
    }
}
