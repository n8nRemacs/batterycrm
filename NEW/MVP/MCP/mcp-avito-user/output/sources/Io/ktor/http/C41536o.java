package io.ktor.http;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.sequences.C43033p;
import kotlin.text.C43044a;
import kotlin.text.C43054k;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: Cookie.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41536o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f400095a = C42756l.l0(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43059p f400096b = new C43059p("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<Character> f400097c = C42756l.l0(new Character[]{';', ',', '\"'});

    /* compiled from: Cookie.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.o$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/text/n;", "it", "Lkotlin/Q;", "", "invoke", "(Lkotlin/text/n;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.http.o$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC43057n, kotlin.Q<? extends String, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f400098l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.Q<? extends String, ? extends String> invoke(InterfaceC43057n interfaceC43057n) {
            InterfaceC43057n interfaceC43057n2 = interfaceC43057n;
            C43054k c43054kA = interfaceC43057n2.getF410617c().a(2);
            String str = c43054kA != null ? c43054kA.f410612a : "";
            C43054k c43054kA2 = interfaceC43057n2.getF410617c().a(4);
            return new kotlin.Q<>(str, c43054kA2 != null ? c43054kA2.f410612a : "");
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "it", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.http.o$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends String, ? extends String>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f400099l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12) {
            super(1);
            this.f400099l = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.Q<? extends java.lang.String, ? extends java.lang.String> r3) {
            /*
                r2 = this;
                kotlin.Q r3 = (kotlin.Q) r3
                boolean r0 = r2.f400099l
                if (r0 == 0) goto L13
                A r3 = r3.f406619b
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r0 = "$"
                r1 = 0
                boolean r3 = kotlin.text.C43066x.h0(r3, r0, r1)
                if (r3 != 0) goto L14
            L13:
                r1 = 1
            L14:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.C41536o.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "", "cookie", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.http.o$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends String, ? extends String>, kotlin.Q<? extends String, ? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f400100l = new d();

        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.Q<? extends String, ? extends String> invoke(kotlin.Q<? extends String, ? extends String> q12) {
            kotlin.Q<? extends String, ? extends String> q13 = q12;
            String str = (String) q13.f406620c;
            if (!C43066x.h0(str, "\"", false) || !C43066x.z(str, "\"", false)) {
                return q13;
            }
            return new kotlin.Q<>(q13.f406619b, C43066x.Y(str, "\"", "\""));
        }
    }

    @Y61.k
    public static final Map<String, String> a(@Y61.k String str, boolean z12) {
        return kotlin.collections.P0.r(new kotlin.sequences.o0(C43033p.i(new kotlin.sequences.o0(C43059p.c(f400096b, str), b.f400098l), new c(z12)), d.f400100l));
    }

    public static final boolean b(char c12) {
        if (!C43044a.d(c12) && kotlin.jvm.internal.L.g(c12, 32) >= 0) {
            if (!f400097c.contains(Character.valueOf(c12))) {
                return false;
            }
        }
        return true;
    }
}
