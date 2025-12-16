package io.ktor.http;

import kotlin.Metadata;

/* compiled from: CookieUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/n;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41534n {

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Character, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f400073l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Character ch2) {
            return Boolean.valueOf(H.a(ch2.charValue()));
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Character, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f400074l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Character ch2) {
            return Boolean.valueOf(H.c(ch2.charValue()));
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Character, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f400075l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Character ch2) {
            return Boolean.valueOf(H.a(ch2.charValue()));
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f400076l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "day-of-month not in [1,31]";
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f400077l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "year >= 1601";
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f400078l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "hours > 23";
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f400079l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "minutes > 59";
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f400080l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "seconds > 59";
        }
    }

    /* compiled from: CookieUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.n$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Character, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f400081l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Character ch2) {
            return Boolean.valueOf(H.c(ch2.charValue()));
        }
    }

    public static void a(String str, String str2, Object obj) {
        if (obj == null) {
            throw new InvalidCookieDateException(str, "Could not find ".concat(str2));
        }
    }

    public static void b(String str, boolean z12, Y41.a aVar) {
        if (!z12) {
            throw new InvalidCookieDateException(str, (String) aVar.invoke());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q31.b c(@Y61.k java.lang.String r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.C41534n.c(java.lang.String):Q31.b");
    }
}
