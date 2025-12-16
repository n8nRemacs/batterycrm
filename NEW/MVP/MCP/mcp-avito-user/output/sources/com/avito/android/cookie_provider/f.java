package com.avito.android.cookie_provider;

import Y41.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.H0;
import com.avito.android.util.C;
import hd.InterfaceC40915a;
import java.net.URLEncoder;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import kotlin.text.C43066x;

/* compiled from: CookieProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cookie_provider/f;", "Lcom/avito/android/cookie_provider/e;", "_avito_cookie-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.cookie_provider.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<InterfaceC40915a> f126173a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.b f126174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f126175c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H0 f126176d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f126177e = C42727D.c(new a());

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke() throws java.lang.Throwable {
            /*
                r9 = this;
                com.avito.android.cookie_provider.f r0 = com.avito.android.cookie_provider.f.this
                com.avito.android.H0 r1 = r0.f126176d
                java.lang.String r1 = r1.a()
                android.net.Uri r1 = android.net.Uri.parse(r1)
                if (r1 != 0) goto L10
                android.net.Uri r1 = android.net.Uri.EMPTY
            L10:
                java.lang.String r2 = r1.getHost()
                r3 = 0
                java.lang.String r4 = ".avito.ru"
                if (r2 == 0) goto L21
                boolean r2 = kotlin.text.C43066x.z(r2, r4, r3)
                r5 = 1
                if (r2 != r5) goto L21
                goto L22
            L21:
                r5 = r3
            L22:
                java.lang.String r2 = r1.getHost()
                java.lang.String r6 = "."
                if (r2 == 0) goto L2f
                java.lang.String r2 = kotlin.text.C43066x.m0(r2, r6, r2)
                goto L30
            L2f:
                r2 = 0
            L30:
                java.lang.String r7 = r1.getHost()
                java.lang.String r8 = "localhost"
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L3d
                goto L69
            L3d:
                if (r5 == 0) goto L44
                java.lang.String r4 = androidx.camera.camera2.internal.G.f(r6, r2)
                goto L69
            L44:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Unknown domain for cookies "
                r5.<init>(r6)
                java.lang.String r1 = r1.getAuthority()
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                r2.<init>(r1)
                com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
                com.avito.android.util.C r0 = r0.f126175c
                com.avito.android.util.D r0 = r0.getF125491k()
                r0.getClass()
                r1.m(r2, r3)
            L69:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cookie_provider.f.a.invoke():java.lang.Object");
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhd/a;", "it", "", "invoke", "(Lhd/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<InterfaceC40915a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f126179l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC40915a interfaceC40915a) {
            String f6495a = interfaceC40915a.getF253555a();
            return Boolean.valueOf(f6495a == null || f6495a.length() == 0);
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd/a;", "it", "Lkotlin/Q;", "", "invoke", "(Lhd/a;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<InterfaceC40915a, Q<? extends String, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f126180l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Q<? extends String, ? extends String> invoke(InterfaceC40915a interfaceC40915a) {
            InterfaceC40915a interfaceC40915a2 = interfaceC40915a;
            String key = interfaceC40915a2.getKey();
            String f6495a = interfaceC40915a2.getF253555a();
            return new Q<>(key, f6495a != null ? C43066x.a0(f6495a, ";", "%3B", false) : null);
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Q;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Q<? extends String, ? extends String>, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f126181l = new d();

        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final String invoke(Q<? extends String, ? extends String> q12) {
            Q<? extends String, ? extends String> q13 = q12;
            return H.i('=', (String) q13.f406619b, (String) q13.f406620c);
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "value", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements l<String, String> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            f fVar = f.this;
            fVar.getClass();
            return str + "; Expires=" + fVar.f126174b.O();
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lcom/avito/android/cookie_provider/a;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/cookie_provider/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cookie_provider.f$f, reason: collision with other inner class name */
    public static final class C3749f extends N implements l<String, com.avito.android.cookie_provider.a> {
        public C3749f() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.cookie_provider.a invoke(String str) {
            return new com.avito.android.cookie_provider.a((String) f.this.f126177e.getValue(), str);
        }
    }

    /* compiled from: CookieProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd/a;", "header", "Lkotlin/Q;", "", "invoke", "(Lhd/a;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements l<InterfaceC40915a, Q<? extends String, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f126184l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Q<? extends String, ? extends String> invoke(InterfaceC40915a interfaceC40915a) {
            InterfaceC40915a interfaceC40915a2 = interfaceC40915a;
            String f6495a = interfaceC40915a2.getF253555a();
            if (f6495a == null || f6495a.length() == 0) {
                f6495a = null;
            }
            if (f6495a != null) {
                return new Q<>(interfaceC40915a2.getKey(), f6495a);
            }
            return null;
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u00010\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements l<Q<? extends String, ? extends String>, Q<? extends String, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f126185l = new h();

        public h() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Q<? extends String, ? extends String> invoke(Q<? extends String, ? extends String> q12) {
            Q<? extends String, ? extends String> q13 = q12;
            return new Q<>((String) q13.f406619b, URLEncoder.encode((String) q13.f406620c, Constants.ENCODING));
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0006\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Q;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements l<Q<? extends String, ? extends String>, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f126186l = new i();

        public i() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final String invoke(Q<? extends String, ? extends String> q12) {
            Q<? extends String, ? extends String> q13 = q12;
            return H.i('=', (String) q13.f406619b, (String) q13.f406620c);
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "value", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements l<String, String> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(String str) {
            f fVar = f.this;
            fVar.getClass();
            return str + "; Expires=" + fVar.f126174b.O();
        }
    }

    /* compiled from: CookieProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lcom/avito/android/cookie_provider/a;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/cookie_provider/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements l<String, com.avito.android.cookie_provider.a> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.cookie_provider.a invoke(String str) {
            return new com.avito.android.cookie_provider.a((String) f.this.f126177e.getValue(), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k List<? extends InterfaceC40915a> list, @Y61.k com.avito.android.cookie_provider.b bVar, @Y61.k C c12, @Y61.k H0 h02) {
        this.f126173a = list;
        this.f126174b = bVar;
        this.f126175c = c12;
        this.f126176d = h02;
    }

    @Override // com.avito.android.cookie_provider.e
    @Y61.k
    public final List<com.avito.android.cookie_provider.a> a() {
        return C43033p.D(new o0(new o0(new o0(new o0(C43033p.y(new C42770s0(this.f126173a), g.f126184l), h.f126185l), i.f126186l), new j()), new k()));
    }

    @Override // com.avito.android.cookie_provider.e
    @Y61.k
    @InterfaceC42830m
    public final List<com.avito.android.cookie_provider.a> getCookies() {
        return C43033p.D(new o0(new o0(new o0(new o0(C43033p.l(new C42770s0(this.f126173a), b.f126179l), c.f126180l), d.f126181l), new e()), new C3749f()));
    }
}
